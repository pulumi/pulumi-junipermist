//go:build nodejs || all
// +build nodejs all

package examples

import (
	"os"
	"path/filepath"
	"testing"

	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/opttest"
	"github.com/pulumi/pulumi/sdk/v3/go/auto/optpreview"
)

func TestTsExamples(t *testing.T) {
	tests := map[string]struct {
		directoryName string
	}{
		"TestOrgWlanTs":                {directoryName: "org-wlan-ts"},
		"TestOrgWlanIsolationTs":       {directoryName: "org-wlan-isolation-ts"},
		"TestOrgRftemplateTs":          {directoryName: "org-rftemplate-ts"},
		"TestSiteWxRuleTs":             {directoryName: "site-wxrule-ts"},
		"TestSiteSettingTs":            {directoryName: "site-setting-ts"},
		"TestSiteNetworkTemplateTs":    {directoryName: "site-networktemplate-ts"},
		"TestSiteWlanPortalTemplateTs": {directoryName: "site-wlan-portal-template-ts"},
		"TestOrgWlanPortalTemplateTs":  {directoryName: "org-wlan-portal-template-ts"},
		"TestSiteWlanPortalImageTs":    {directoryName: "site-wlan-portal-image-ts"},
		"TestOrgWlanPortalImageTs":     {directoryName: "org-wlan-portal-image-ts"},
	}
	for name, test := range tests {
		t.Run(name, func(t *testing.T) {
			checkBaseEnvVars(t)
			p := pulumitest.NewPulumiTest(t, test.directoryName,
				opttest.LocalProviderPath("pulumi-junipermist", filepath.Join(getCwd(t), "..", "bin")),
				opttest.YarnLink("@pulumi/juniper-mist"),
			)
			p.SetConfig("organizationId", os.Getenv(EnvMistOrgID))
			p.Up()
			p.Preview(optpreview.ExpectNoChanges())
		})
	}
}
