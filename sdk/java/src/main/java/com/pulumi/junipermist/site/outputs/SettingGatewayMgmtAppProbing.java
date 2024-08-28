// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.site.outputs.SettingGatewayMgmtAppProbingCustomApp;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SettingGatewayMgmtAppProbing {
    /**
     * @return app-keys from /api/v1/const/applications
     * 
     */
    private @Nullable List<String> apps;
    private @Nullable List<SettingGatewayMgmtAppProbingCustomApp> customApps;
    private @Nullable Boolean enabled;

    private SettingGatewayMgmtAppProbing() {}
    /**
     * @return app-keys from /api/v1/const/applications
     * 
     */
    public List<String> apps() {
        return this.apps == null ? List.of() : this.apps;
    }
    public List<SettingGatewayMgmtAppProbingCustomApp> customApps() {
        return this.customApps == null ? List.of() : this.customApps;
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingGatewayMgmtAppProbing defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> apps;
        private @Nullable List<SettingGatewayMgmtAppProbingCustomApp> customApps;
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(SettingGatewayMgmtAppProbing defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apps = defaults.apps;
    	      this.customApps = defaults.customApps;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder apps(@Nullable List<String> apps) {

            this.apps = apps;
            return this;
        }
        public Builder apps(String... apps) {
            return apps(List.of(apps));
        }
        @CustomType.Setter
        public Builder customApps(@Nullable List<SettingGatewayMgmtAppProbingCustomApp> customApps) {

            this.customApps = customApps;
            return this;
        }
        public Builder customApps(SettingGatewayMgmtAppProbingCustomApp... customApps) {
            return customApps(List.of(customApps));
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        public SettingGatewayMgmtAppProbing build() {
            final var _resultValue = new SettingGatewayMgmtAppProbing();
            _resultValue.apps = apps;
            _resultValue.customApps = customApps;
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}