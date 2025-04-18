// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.device.outputs.GetGatewayStatsDeviceGatewayStatClusterConfigControlLinkInfo;
import com.pulumi.junipermist.device.outputs.GetGatewayStatsDeviceGatewayStatClusterConfigEthernetConnection;
import com.pulumi.junipermist.device.outputs.GetGatewayStatsDeviceGatewayStatClusterConfigFabricLinkInfo;
import com.pulumi.junipermist.device.outputs.GetGatewayStatsDeviceGatewayStatClusterConfigRedundancyGroupInformation;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGatewayStatsDeviceGatewayStatClusterConfig {
    private String configuration;
    private GetGatewayStatsDeviceGatewayStatClusterConfigControlLinkInfo controlLinkInfo;
    private List<GetGatewayStatsDeviceGatewayStatClusterConfigEthernetConnection> ethernetConnections;
    private GetGatewayStatsDeviceGatewayStatClusterConfigFabricLinkInfo fabricLinkInfo;
    private String lastStatusChangeReason;
    private String operational;
    private String primaryNodeHealth;
    private List<GetGatewayStatsDeviceGatewayStatClusterConfigRedundancyGroupInformation> redundancyGroupInformations;
    private String secondaryNodeHealth;
    private String status;

    private GetGatewayStatsDeviceGatewayStatClusterConfig() {}
    public String configuration() {
        return this.configuration;
    }
    public GetGatewayStatsDeviceGatewayStatClusterConfigControlLinkInfo controlLinkInfo() {
        return this.controlLinkInfo;
    }
    public List<GetGatewayStatsDeviceGatewayStatClusterConfigEthernetConnection> ethernetConnections() {
        return this.ethernetConnections;
    }
    public GetGatewayStatsDeviceGatewayStatClusterConfigFabricLinkInfo fabricLinkInfo() {
        return this.fabricLinkInfo;
    }
    public String lastStatusChangeReason() {
        return this.lastStatusChangeReason;
    }
    public String operational() {
        return this.operational;
    }
    public String primaryNodeHealth() {
        return this.primaryNodeHealth;
    }
    public List<GetGatewayStatsDeviceGatewayStatClusterConfigRedundancyGroupInformation> redundancyGroupInformations() {
        return this.redundancyGroupInformations;
    }
    public String secondaryNodeHealth() {
        return this.secondaryNodeHealth;
    }
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayStatsDeviceGatewayStatClusterConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String configuration;
        private GetGatewayStatsDeviceGatewayStatClusterConfigControlLinkInfo controlLinkInfo;
        private List<GetGatewayStatsDeviceGatewayStatClusterConfigEthernetConnection> ethernetConnections;
        private GetGatewayStatsDeviceGatewayStatClusterConfigFabricLinkInfo fabricLinkInfo;
        private String lastStatusChangeReason;
        private String operational;
        private String primaryNodeHealth;
        private List<GetGatewayStatsDeviceGatewayStatClusterConfigRedundancyGroupInformation> redundancyGroupInformations;
        private String secondaryNodeHealth;
        private String status;
        public Builder() {}
        public Builder(GetGatewayStatsDeviceGatewayStatClusterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.controlLinkInfo = defaults.controlLinkInfo;
    	      this.ethernetConnections = defaults.ethernetConnections;
    	      this.fabricLinkInfo = defaults.fabricLinkInfo;
    	      this.lastStatusChangeReason = defaults.lastStatusChangeReason;
    	      this.operational = defaults.operational;
    	      this.primaryNodeHealth = defaults.primaryNodeHealth;
    	      this.redundancyGroupInformations = defaults.redundancyGroupInformations;
    	      this.secondaryNodeHealth = defaults.secondaryNodeHealth;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder configuration(String configuration) {
            if (configuration == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatClusterConfig", "configuration");
            }
            this.configuration = configuration;
            return this;
        }
        @CustomType.Setter
        public Builder controlLinkInfo(GetGatewayStatsDeviceGatewayStatClusterConfigControlLinkInfo controlLinkInfo) {
            if (controlLinkInfo == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatClusterConfig", "controlLinkInfo");
            }
            this.controlLinkInfo = controlLinkInfo;
            return this;
        }
        @CustomType.Setter
        public Builder ethernetConnections(List<GetGatewayStatsDeviceGatewayStatClusterConfigEthernetConnection> ethernetConnections) {
            if (ethernetConnections == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatClusterConfig", "ethernetConnections");
            }
            this.ethernetConnections = ethernetConnections;
            return this;
        }
        public Builder ethernetConnections(GetGatewayStatsDeviceGatewayStatClusterConfigEthernetConnection... ethernetConnections) {
            return ethernetConnections(List.of(ethernetConnections));
        }
        @CustomType.Setter
        public Builder fabricLinkInfo(GetGatewayStatsDeviceGatewayStatClusterConfigFabricLinkInfo fabricLinkInfo) {
            if (fabricLinkInfo == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatClusterConfig", "fabricLinkInfo");
            }
            this.fabricLinkInfo = fabricLinkInfo;
            return this;
        }
        @CustomType.Setter
        public Builder lastStatusChangeReason(String lastStatusChangeReason) {
            if (lastStatusChangeReason == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatClusterConfig", "lastStatusChangeReason");
            }
            this.lastStatusChangeReason = lastStatusChangeReason;
            return this;
        }
        @CustomType.Setter
        public Builder operational(String operational) {
            if (operational == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatClusterConfig", "operational");
            }
            this.operational = operational;
            return this;
        }
        @CustomType.Setter
        public Builder primaryNodeHealth(String primaryNodeHealth) {
            if (primaryNodeHealth == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatClusterConfig", "primaryNodeHealth");
            }
            this.primaryNodeHealth = primaryNodeHealth;
            return this;
        }
        @CustomType.Setter
        public Builder redundancyGroupInformations(List<GetGatewayStatsDeviceGatewayStatClusterConfigRedundancyGroupInformation> redundancyGroupInformations) {
            if (redundancyGroupInformations == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatClusterConfig", "redundancyGroupInformations");
            }
            this.redundancyGroupInformations = redundancyGroupInformations;
            return this;
        }
        public Builder redundancyGroupInformations(GetGatewayStatsDeviceGatewayStatClusterConfigRedundancyGroupInformation... redundancyGroupInformations) {
            return redundancyGroupInformations(List.of(redundancyGroupInformations));
        }
        @CustomType.Setter
        public Builder secondaryNodeHealth(String secondaryNodeHealth) {
            if (secondaryNodeHealth == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatClusterConfig", "secondaryNodeHealth");
            }
            this.secondaryNodeHealth = secondaryNodeHealth;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatClusterConfig", "status");
            }
            this.status = status;
            return this;
        }
        public GetGatewayStatsDeviceGatewayStatClusterConfig build() {
            final var _resultValue = new GetGatewayStatsDeviceGatewayStatClusterConfig();
            _resultValue.configuration = configuration;
            _resultValue.controlLinkInfo = controlLinkInfo;
            _resultValue.ethernetConnections = ethernetConnections;
            _resultValue.fabricLinkInfo = fabricLinkInfo;
            _resultValue.lastStatusChangeReason = lastStatusChangeReason;
            _resultValue.operational = operational;
            _resultValue.primaryNodeHealth = primaryNodeHealth;
            _resultValue.redundancyGroupInformations = redundancyGroupInformations;
            _resultValue.secondaryNodeHealth = secondaryNodeHealth;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
