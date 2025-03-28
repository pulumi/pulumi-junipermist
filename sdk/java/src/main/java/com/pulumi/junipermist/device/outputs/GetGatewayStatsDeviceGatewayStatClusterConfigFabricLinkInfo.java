// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGatewayStatsDeviceGatewayStatClusterConfigFabricLinkInfo {
    private String dataPlaneNotifiedStatus;
    private List<String> interfaces;
    private String internalStatus;
    private String state;
    private String status;

    private GetGatewayStatsDeviceGatewayStatClusterConfigFabricLinkInfo() {}
    public String dataPlaneNotifiedStatus() {
        return this.dataPlaneNotifiedStatus;
    }
    public List<String> interfaces() {
        return this.interfaces;
    }
    public String internalStatus() {
        return this.internalStatus;
    }
    public String state() {
        return this.state;
    }
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayStatsDeviceGatewayStatClusterConfigFabricLinkInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dataPlaneNotifiedStatus;
        private List<String> interfaces;
        private String internalStatus;
        private String state;
        private String status;
        public Builder() {}
        public Builder(GetGatewayStatsDeviceGatewayStatClusterConfigFabricLinkInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataPlaneNotifiedStatus = defaults.dataPlaneNotifiedStatus;
    	      this.interfaces = defaults.interfaces;
    	      this.internalStatus = defaults.internalStatus;
    	      this.state = defaults.state;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder dataPlaneNotifiedStatus(String dataPlaneNotifiedStatus) {
            if (dataPlaneNotifiedStatus == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatClusterConfigFabricLinkInfo", "dataPlaneNotifiedStatus");
            }
            this.dataPlaneNotifiedStatus = dataPlaneNotifiedStatus;
            return this;
        }
        @CustomType.Setter
        public Builder interfaces(List<String> interfaces) {
            if (interfaces == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatClusterConfigFabricLinkInfo", "interfaces");
            }
            this.interfaces = interfaces;
            return this;
        }
        public Builder interfaces(String... interfaces) {
            return interfaces(List.of(interfaces));
        }
        @CustomType.Setter
        public Builder internalStatus(String internalStatus) {
            if (internalStatus == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatClusterConfigFabricLinkInfo", "internalStatus");
            }
            this.internalStatus = internalStatus;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatClusterConfigFabricLinkInfo", "state");
            }
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatClusterConfigFabricLinkInfo", "status");
            }
            this.status = status;
            return this;
        }
        public GetGatewayStatsDeviceGatewayStatClusterConfigFabricLinkInfo build() {
            final var _resultValue = new GetGatewayStatsDeviceGatewayStatClusterConfigFabricLinkInfo();
            _resultValue.dataPlaneNotifiedStatus = dataPlaneNotifiedStatus;
            _resultValue.interfaces = interfaces;
            _resultValue.internalStatus = internalStatus;
            _resultValue.state = state;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
