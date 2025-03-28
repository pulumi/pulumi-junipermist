// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetApStatsDeviceApStatSwitchRedundancy {
    private Integer numRedundantAps;

    private GetApStatsDeviceApStatSwitchRedundancy() {}
    public Integer numRedundantAps() {
        return this.numRedundantAps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApStatsDeviceApStatSwitchRedundancy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer numRedundantAps;
        public Builder() {}
        public Builder(GetApStatsDeviceApStatSwitchRedundancy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numRedundantAps = defaults.numRedundantAps;
        }

        @CustomType.Setter
        public Builder numRedundantAps(Integer numRedundantAps) {
            if (numRedundantAps == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatSwitchRedundancy", "numRedundantAps");
            }
            this.numRedundantAps = numRedundantAps;
            return this;
        }
        public GetApStatsDeviceApStatSwitchRedundancy build() {
            final var _resultValue = new GetApStatsDeviceApStatSwitchRedundancy();
            _resultValue.numRedundantAps = numRedundantAps;
            return _resultValue;
        }
    }
}
