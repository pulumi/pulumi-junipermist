// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGatewayStatsDeviceGatewayStatModule2StatVcLink {
    private Integer neighborModuleIdx;
    private String neighborPortId;
    private String portId;

    private GetGatewayStatsDeviceGatewayStatModule2StatVcLink() {}
    public Integer neighborModuleIdx() {
        return this.neighborModuleIdx;
    }
    public String neighborPortId() {
        return this.neighborPortId;
    }
    public String portId() {
        return this.portId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayStatsDeviceGatewayStatModule2StatVcLink defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer neighborModuleIdx;
        private String neighborPortId;
        private String portId;
        public Builder() {}
        public Builder(GetGatewayStatsDeviceGatewayStatModule2StatVcLink defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.neighborModuleIdx = defaults.neighborModuleIdx;
    	      this.neighborPortId = defaults.neighborPortId;
    	      this.portId = defaults.portId;
        }

        @CustomType.Setter
        public Builder neighborModuleIdx(Integer neighborModuleIdx) {
            if (neighborModuleIdx == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2StatVcLink", "neighborModuleIdx");
            }
            this.neighborModuleIdx = neighborModuleIdx;
            return this;
        }
        @CustomType.Setter
        public Builder neighborPortId(String neighborPortId) {
            if (neighborPortId == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2StatVcLink", "neighborPortId");
            }
            this.neighborPortId = neighborPortId;
            return this;
        }
        @CustomType.Setter
        public Builder portId(String portId) {
            if (portId == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2StatVcLink", "portId");
            }
            this.portId = portId;
            return this;
        }
        public GetGatewayStatsDeviceGatewayStatModule2StatVcLink build() {
            final var _resultValue = new GetGatewayStatsDeviceGatewayStatModule2StatVcLink();
            _resultValue.neighborModuleIdx = neighborModuleIdx;
            _resultValue.neighborPortId = neighborPortId;
            _resultValue.portId = portId;
            return _resultValue;
        }
    }
}