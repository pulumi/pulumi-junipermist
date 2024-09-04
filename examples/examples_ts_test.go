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

func TestOrgWlanTs(t *testing.T) {
	checkBaseEnvVars(t)
	test := pulumitest.NewPulumiTest(t, "org-wlan-ts",
		opttest.LocalProviderPath("pulumi-junipermist", filepath.Join(getCwd(t), "..", "bin")),
		opttest.YarnLink("@pulumi/juniper-mist"),
	)
	test.SetConfig("organizationId", os.Getenv(EnvMistOrgID))
	test.Up()
}
func TestOrgWlanIsolationTs(t *testing.T) {
	// Regression test for https://github.com/pulumi/pulumi-junipermist/issues/49
	// Regression test for https://github.com/pulumi/pulumi-junipermist/issues/58
	checkBaseEnvVars(t)
	test := pulumitest.NewPulumiTest(t, "org-wlan-isolation-ts",
		opttest.LocalProviderPath("pulumi-junipermist", filepath.Join(getCwd(t), "..", "bin")),
		opttest.YarnLink("@pulumi/juniper-mist"),
	)
	test.SetConfig("organizationId", os.Getenv(EnvMistOrgID))
	test.Up()
	test.Preview(optpreview.ExpectNoChanges())
}
func TestOrgRftemplateTs(t *testing.T) {
	//Regression test for https://github.com/pulumi/pulumi-junipermist/issues/47
	checkBaseEnvVars(t)
	test := pulumitest.NewPulumiTest(t, "org-rftemplate-ts",
		opttest.LocalProviderPath("pulumi-junipermist", filepath.Join(getCwd(t), "..", "bin")),
		opttest.YarnLink("@pulumi/juniper-mist"),
	)
	test.SetConfig("organizationId", os.Getenv(EnvMistOrgID))
	test.Up()
	test.Preview(optpreview.ExpectNoChanges())
}
