//go:build nodejs || all
// +build nodejs all

package examples

import (
	"os"
	"path/filepath"
	"testing"

	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/opttest"
)

func TestOrgWlanTs(t *testing.T) {
	checkBaseEnvVars(t)
	test := pulumitest.NewPulumiTest(t, "org-wlan-ts",
		opttest.LocalProviderPath("pulumi-junipermist", filepath.Join(getCwd(t), "..", "bin")),
		opttest.YarnLink("@pulumi/juniper-mist"),
	)
	test.SetConfig("organizationId", os.Getenv(EnvMistOrgID))
	test.SetConfig("mist:host", os.Getenv(EnvMistHost))
	test.Up()
}
