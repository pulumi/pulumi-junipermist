// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetGatewayStatsDeviceGatewayStatArpTableStats {
    private Integer arpTableCount;
    private Integer maxEntriesSupported;

    private GetGatewayStatsDeviceGatewayStatArpTableStats() {}
    public Integer arpTableCount() {
        return this.arpTableCount;
    }
    public Integer maxEntriesSupported() {
        return this.maxEntriesSupported;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayStatsDeviceGatewayStatArpTableStats defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer arpTableCount;
        private Integer maxEntriesSupported;
        public Builder() {}
        public Builder(GetGatewayStatsDeviceGatewayStatArpTableStats defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arpTableCount = defaults.arpTableCount;
    	      this.maxEntriesSupported = defaults.maxEntriesSupported;
        }

        @CustomType.Setter
        public Builder arpTableCount(Integer arpTableCount) {
            if (arpTableCount == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatArpTableStats", "arpTableCount");
            }
            this.arpTableCount = arpTableCount;
            return this;
        }
        @CustomType.Setter
        public Builder maxEntriesSupported(Integer maxEntriesSupported) {
            if (maxEntriesSupported == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatArpTableStats", "maxEntriesSupported");
            }
            this.maxEntriesSupported = maxEntriesSupported;
            return this;
        }
        public GetGatewayStatsDeviceGatewayStatArpTableStats build() {
            final var _resultValue = new GetGatewayStatsDeviceGatewayStatArpTableStats();
            _resultValue.arpTableCount = arpTableCount;
            _resultValue.maxEntriesSupported = maxEntriesSupported;
            return _resultValue;
        }
    }
}