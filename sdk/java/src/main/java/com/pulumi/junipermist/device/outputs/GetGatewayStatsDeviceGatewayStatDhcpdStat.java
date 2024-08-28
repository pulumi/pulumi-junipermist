// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetGatewayStatsDeviceGatewayStatDhcpdStat {
    private Integer numIps;
    private Integer numLeased;

    private GetGatewayStatsDeviceGatewayStatDhcpdStat() {}
    public Integer numIps() {
        return this.numIps;
    }
    public Integer numLeased() {
        return this.numLeased;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayStatsDeviceGatewayStatDhcpdStat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer numIps;
        private Integer numLeased;
        public Builder() {}
        public Builder(GetGatewayStatsDeviceGatewayStatDhcpdStat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numIps = defaults.numIps;
    	      this.numLeased = defaults.numLeased;
        }

        @CustomType.Setter
        public Builder numIps(Integer numIps) {
            if (numIps == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatDhcpdStat", "numIps");
            }
            this.numIps = numIps;
            return this;
        }
        @CustomType.Setter
        public Builder numLeased(Integer numLeased) {
            if (numLeased == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatDhcpdStat", "numLeased");
            }
            this.numLeased = numLeased;
            return this;
        }
        public GetGatewayStatsDeviceGatewayStatDhcpdStat build() {
            final var _resultValue = new GetGatewayStatsDeviceGatewayStatDhcpdStat();
            _resultValue.numIps = numIps;
            _resultValue.numLeased = numLeased;
            return _resultValue;
        }
    }
}