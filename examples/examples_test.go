package examples

import (
	"os"
	"testing"
)

const (
	EnvMistAPIKey = "MIST_API_TOKEN"
	EnvMistOrgID  = "MIST_ORG_ID"
	EnvMistHost   = "MIST_HOST"
)

func checkEnvVars(t *testing.T, envVar string) {
	value := os.Getenv(envVar)
	if value == "" {
		t.Skipf("Skipping test due to missing %s environment variable", envVar)
	}
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}

func checkBaseEnvVars(t *testing.T) {
	checkEnvVars(t, EnvMistOrgID)
	checkEnvVars(t, EnvMistAPIKey)
	checkEnvVars(t, EnvMistHost)
}
