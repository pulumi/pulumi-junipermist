// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGatewayStatsDeviceGatewayStatService2Stat {
    private String ashVersion;
    private String ciaVersion;
    private String emberVersion;
    private String ipsecClientVersion;
    private String mistAgentVersion;
    private String packageVersion;
    private String testingToolsVersion;
    private String wheeljackVersion;

    private GetGatewayStatsDeviceGatewayStatService2Stat() {}
    public String ashVersion() {
        return this.ashVersion;
    }
    public String ciaVersion() {
        return this.ciaVersion;
    }
    public String emberVersion() {
        return this.emberVersion;
    }
    public String ipsecClientVersion() {
        return this.ipsecClientVersion;
    }
    public String mistAgentVersion() {
        return this.mistAgentVersion;
    }
    public String packageVersion() {
        return this.packageVersion;
    }
    public String testingToolsVersion() {
        return this.testingToolsVersion;
    }
    public String wheeljackVersion() {
        return this.wheeljackVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayStatsDeviceGatewayStatService2Stat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ashVersion;
        private String ciaVersion;
        private String emberVersion;
        private String ipsecClientVersion;
        private String mistAgentVersion;
        private String packageVersion;
        private String testingToolsVersion;
        private String wheeljackVersion;
        public Builder() {}
        public Builder(GetGatewayStatsDeviceGatewayStatService2Stat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ashVersion = defaults.ashVersion;
    	      this.ciaVersion = defaults.ciaVersion;
    	      this.emberVersion = defaults.emberVersion;
    	      this.ipsecClientVersion = defaults.ipsecClientVersion;
    	      this.mistAgentVersion = defaults.mistAgentVersion;
    	      this.packageVersion = defaults.packageVersion;
    	      this.testingToolsVersion = defaults.testingToolsVersion;
    	      this.wheeljackVersion = defaults.wheeljackVersion;
        }

        @CustomType.Setter
        public Builder ashVersion(String ashVersion) {
            if (ashVersion == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatService2Stat", "ashVersion");
            }
            this.ashVersion = ashVersion;
            return this;
        }
        @CustomType.Setter
        public Builder ciaVersion(String ciaVersion) {
            if (ciaVersion == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatService2Stat", "ciaVersion");
            }
            this.ciaVersion = ciaVersion;
            return this;
        }
        @CustomType.Setter
        public Builder emberVersion(String emberVersion) {
            if (emberVersion == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatService2Stat", "emberVersion");
            }
            this.emberVersion = emberVersion;
            return this;
        }
        @CustomType.Setter
        public Builder ipsecClientVersion(String ipsecClientVersion) {
            if (ipsecClientVersion == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatService2Stat", "ipsecClientVersion");
            }
            this.ipsecClientVersion = ipsecClientVersion;
            return this;
        }
        @CustomType.Setter
        public Builder mistAgentVersion(String mistAgentVersion) {
            if (mistAgentVersion == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatService2Stat", "mistAgentVersion");
            }
            this.mistAgentVersion = mistAgentVersion;
            return this;
        }
        @CustomType.Setter
        public Builder packageVersion(String packageVersion) {
            if (packageVersion == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatService2Stat", "packageVersion");
            }
            this.packageVersion = packageVersion;
            return this;
        }
        @CustomType.Setter
        public Builder testingToolsVersion(String testingToolsVersion) {
            if (testingToolsVersion == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatService2Stat", "testingToolsVersion");
            }
            this.testingToolsVersion = testingToolsVersion;
            return this;
        }
        @CustomType.Setter
        public Builder wheeljackVersion(String wheeljackVersion) {
            if (wheeljackVersion == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatService2Stat", "wheeljackVersion");
            }
            this.wheeljackVersion = wheeljackVersion;
            return this;
        }
        public GetGatewayStatsDeviceGatewayStatService2Stat build() {
            final var _resultValue = new GetGatewayStatsDeviceGatewayStatService2Stat();
            _resultValue.ashVersion = ashVersion;
            _resultValue.ciaVersion = ciaVersion;
            _resultValue.emberVersion = emberVersion;
            _resultValue.ipsecClientVersion = ipsecClientVersion;
            _resultValue.mistAgentVersion = mistAgentVersion;
            _resultValue.packageVersion = packageVersion;
            _resultValue.testingToolsVersion = testingToolsVersion;
            _resultValue.wheeljackVersion = wheeljackVersion;
            return _resultValue;
        }
    }
}
