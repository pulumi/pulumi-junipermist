// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSwitchStatsDeviceSwitchStatClientsStatsTotal {
    private List<Integer> numAps;
    private Integer numWiredClients;

    private GetSwitchStatsDeviceSwitchStatClientsStatsTotal() {}
    public List<Integer> numAps() {
        return this.numAps;
    }
    public Integer numWiredClients() {
        return this.numWiredClients;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchStatsDeviceSwitchStatClientsStatsTotal defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<Integer> numAps;
        private Integer numWiredClients;
        public Builder() {}
        public Builder(GetSwitchStatsDeviceSwitchStatClientsStatsTotal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numAps = defaults.numAps;
    	      this.numWiredClients = defaults.numWiredClients;
        }

        @CustomType.Setter
        public Builder numAps(List<Integer> numAps) {
            if (numAps == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsDeviceSwitchStatClientsStatsTotal", "numAps");
            }
            this.numAps = numAps;
            return this;
        }
        public Builder numAps(Integer... numAps) {
            return numAps(List.of(numAps));
        }
        @CustomType.Setter
        public Builder numWiredClients(Integer numWiredClients) {
            if (numWiredClients == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsDeviceSwitchStatClientsStatsTotal", "numWiredClients");
            }
            this.numWiredClients = numWiredClients;
            return this;
        }
        public GetSwitchStatsDeviceSwitchStatClientsStatsTotal build() {
            final var _resultValue = new GetSwitchStatsDeviceSwitchStatClientsStatsTotal();
            _resultValue.numAps = numAps;
            _resultValue.numWiredClients = numWiredClients;
            return _resultValue;
        }
    }
}