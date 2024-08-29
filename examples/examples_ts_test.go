//go:build nodejs || all
// +build nodejs all

package examples

import (
	"os"
	"path/filepath"
	"testing"

	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/assertpreview"
	"github.com/pulumi/providertest/pulumitest/opttest"
)

func TestOrgWlanTs(t *testing.T) {
	checkBaseEnvVars(t)
	test := pulumitest.NewPulumiTest(t, "org-wlan-ts",
		opttest.LocalProviderPath("pulumi-junipermist", filepath.Join(getCwd(t), "..", "bin")),
		opttest.YarnLink("@pulumi/juniper-mist"),
	)
	test.SetConfig("organizationId", os.Getenv(EnvMistOrgID))
	test.Up()
}
func TestOrgRftemplateTs(t *testing.T) {
	t.Skip("Failing via: https://github.com/pulumi/pulumi-junipermist/issues/47")
	checkBaseEnvVars(t)
	test := pulumitest.NewPulumiTest(t, "org-rftemplate-ts",
		opttest.LocalProviderPath("pulumi-junipermist", filepath.Join(getCwd(t), "..", "bin")),
		opttest.YarnLink("@pulumi/juniper-mist"),
	)
	test.SetConfig("organizationId", os.Getenv(EnvMistOrgID))
	test.Up()
	preview, error := test.CurrentStack().Preview(test.Context())
	if error != nil {
		t.Fatalf("failed to preview: %v", error)
	}
	assertpreview.HasNoChanges(t, preview)
}
