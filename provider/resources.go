// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package junipermist

import (
	"context"
	"fmt"
	"path/filepath"
	"strings"

	_ "embed" // to embed bridge metadata

	junipermist "github.com/Juniper/terraform-provider-mist/shim"

	pfbridge "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tks "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens/fallbackstrat"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/walk"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"

	"github.com/pulumi/pulumi-junipermist/provider/pkg/version"
)

//go:embed cmd/pulumi-resource-junipermist/bridge-metadata.json
var bridgeMetadata []byte

// all of the token components used below.
const (
	mainPkg = "junipermist"
	mainMod = "index"
)

// Provider returns additional overlaid schema and metadata associated with the provider
func Provider(_ context.Context) tfbridge.ProviderInfo {
	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:                 pfbridge.ShimProvider(junipermist.Provider()),
		Name:              "mist",
		DisplayName:       "Juniper Mist",
		PluginDownloadURL: "github://api.github.com/pulumi/pulumi-junipermist",
		Description:       "A Pulumi package for creating and managing Juniper Mist resources.",
		Keywords:          []string{"pulumi", "juniper", "mist", "category/cloud"},
		License:           "Apache-2.0",
		Homepage:          "https://pulumi.com",
		Repository:        "https://github.com/pulumi/pulumi-junipermist",
		UpstreamRepoPath:  "./upstream",
		GitHubOrg:         "Juniper",
		Version:           version.Version,
		LogoURL:           "https://raw.githubusercontent.com/pulumi/pulumi-junipermist/main/res/juniper.png",
		TFProviderLicense: tfbridge.SetProviderLicense(tfbridge.MITLicenseType),
		MetadataInfo:      tfbridge.NewProviderMetadata(bridgeMetadata),
		DocRules:          &tfbridge.DocRuleInfo{},

		Config: map[string]*tfbridge.SchemaInfo{},
		Resources: map[string]*tfbridge.ResourceInfo{
			"mist_site": {Tok: makeResource("site", "base")},
			"mist_org":  {Tok: makeResource("org", "base")},
			"mist_org_inventory": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"inventory": {
						CSharpName: "InventoryDetails",
					},
				},
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{},
		JavaScript: &tfbridge.JavaScriptInfo{
			PackageName: "@pulumi/juniper-mist",

			DevDependencies: map[string]string{
				"@types/node": "^10.0.0",
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Python: &tfbridge.PythonInfo{
			RespectSchemaVersion: true,
			PackageName:          "pulumi_juniper_mist",

			PyProject: struct{ Enabled bool }{true},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			RootNamespace:        "Pulumi",
			Namespaces: map[string]string{
				"junipermist": "JuniperMist",
			},
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		},
		EnableAccurateBridgePreview: true,
	}

	tfbridge.MustTraverseProperties(&prov, "ids", applyResourceIDs)

	strategy, err := fallbackstrat.KnownModulesWithInferredFallback(
		&prov,
		"mist_", mainMod, []string{
			"device_",
			"org_",
			"site_",
		}, tks.MakeStandard(mainPkg),
	)
	contract.AssertNoErrorf(err, "failed to create fallback strategy")
	prov.MustComputeTokens(strategy)
	prov.MustApplyAutoAliases()

	prov.SetAutonaming(255, "-")

	return prov
}

func makeResource(mod string, res string) tokens.Type {
	mod = strings.ToLower(mod)
	return tfbridge.MakeResource(mainPkg, mod, res)
}

type computeIDFunc = func(ctx context.Context, state resource.PropertyMap) (resource.ID, error)

func delegateIDField(field resource.PropertyKey) computeIDFunc {
	return tfbridge.DelegateIDField(field, "mist", "https://github.com/pulumi/pulumi-junpirermist")
}

// applyResourceIDs (when passed to tfbridge.MustTraverseProperties) sets ComputeID as
// appropriate.
//
// Unlike other TF providers, junipermist doesn't have a consistent ID name ("id"), instead
// each module (as distinguished by prefix) has it's own consistent ID name.
func applyResourceIDs(info tfbridge.PropertyVisitInfo) (tfbridge.PropertyVisitResult, error) {
	path := info.SchemaPath()

	// If the property is not on a resource at the top level, or if ComputeID is
	// already set, do nothing.
	res, ok := info.Root.(tfbridge.VisitResourceRoot)
	if !ok || len(path) > 1 || (res.Info != nil && res.Info.ComputeID != nil) {
		return tfbridge.PropertyVisitResult{HasEffect: false}, nil
	}

	// If the resource already has an ID property and it is likely to be present in
	// the state, use that.
	if id, ok := res.Schema.Schema().GetOk("id"); ok && id.Computed() && !id.Optional() {
		return tfbridge.PropertyVisitResult{HasEffect: false}, nil
	}

	field := path[0].(walk.GetAttrStep).Name
	setField := func() (tfbridge.PropertyVisitResult, error) {
		res.Info.ComputeID = delegateIDField(resource.PropertyKey(
			tfbridge.TerraformToPulumiNameV2(field,
				info.EnclosingSchemaMap(), info.EnclosingSchemaInfoMap())))
		return tfbridge.PropertyVisitResult{HasEffect: true}, nil
	}

	// The actual mapping between ID property name and the module prefix they are used
	// in. Each case looks like, given $ID_NAME and $MODULE:
	//
	//	case "$ID_NAME":
	//		if strings.HasPrefix(res.TfToken, "mist_$MODULE") {
	//			return setField()
	//		}
	//
	switch field {
	case "device_id":
		// It turns out that `mist_upgrade_device` has both a "site_id" and "device_id" field,
		// despite the token not matching the naming paradigm for the module as described above.
		// Because it is part of the Devices module, we use "device_id" as the computed id field here.
		//nolint:lll
		if strings.HasPrefix(res.TfToken, "mist_device") || strings.HasPrefix(res.TfToken, "mist_upgrade_device") {
			return setField()
		}
	case "site_id":
		if strings.HasPrefix(res.TfToken, "mist_site") {
			return setField()
		}
	case "org_id":
		if strings.HasPrefix(res.TfToken, "mist_org") {
			return setField()
		}
	}
	return tfbridge.PropertyVisitResult{HasEffect: false}, nil
}
