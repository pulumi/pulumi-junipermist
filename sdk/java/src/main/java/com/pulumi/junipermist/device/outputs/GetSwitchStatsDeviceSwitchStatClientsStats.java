// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.device.outputs.GetSwitchStatsDeviceSwitchStatClientsStatsTotal;
import java.util.Objects;

@CustomType
public final class GetSwitchStatsDeviceSwitchStatClientsStats {
    private GetSwitchStatsDeviceSwitchStatClientsStatsTotal total;

    private GetSwitchStatsDeviceSwitchStatClientsStats() {}
    public GetSwitchStatsDeviceSwitchStatClientsStatsTotal total() {
        return this.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchStatsDeviceSwitchStatClientsStats defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetSwitchStatsDeviceSwitchStatClientsStatsTotal total;
        public Builder() {}
        public Builder(GetSwitchStatsDeviceSwitchStatClientsStats defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.total = defaults.total;
        }

        @CustomType.Setter
        public Builder total(GetSwitchStatsDeviceSwitchStatClientsStatsTotal total) {
            if (total == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsDeviceSwitchStatClientsStats", "total");
            }
            this.total = total;
            return this;
        }
        public GetSwitchStatsDeviceSwitchStatClientsStats build() {
            final var _resultValue = new GetSwitchStatsDeviceSwitchStatClientsStats();
            _resultValue.total = total;
            return _resultValue;
        }
    }
}