// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.outputs.GetNetworksOrgNetworkMulticastGroups;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNetworksOrgNetworkMulticast {
    /**
     * @return If the network will only be the source of the multicast traffic, IGMP can be disabled
     * 
     */
    private Boolean disableIgmp;
    private Boolean enabled;
    /**
     * @return Group address to RP (rendezvous point) mapping. Property Key is the CIDR (example &#34;225.1.0.3/32&#34;)
     * 
     */
    private Map<String,GetNetworksOrgNetworkMulticastGroups> groups;

    private GetNetworksOrgNetworkMulticast() {}
    /**
     * @return If the network will only be the source of the multicast traffic, IGMP can be disabled
     * 
     */
    public Boolean disableIgmp() {
        return this.disableIgmp;
    }
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Group address to RP (rendezvous point) mapping. Property Key is the CIDR (example &#34;225.1.0.3/32&#34;)
     * 
     */
    public Map<String,GetNetworksOrgNetworkMulticastGroups> groups() {
        return this.groups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworksOrgNetworkMulticast defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean disableIgmp;
        private Boolean enabled;
        private Map<String,GetNetworksOrgNetworkMulticastGroups> groups;
        public Builder() {}
        public Builder(GetNetworksOrgNetworkMulticast defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableIgmp = defaults.disableIgmp;
    	      this.enabled = defaults.enabled;
    	      this.groups = defaults.groups;
        }

        @CustomType.Setter
        public Builder disableIgmp(Boolean disableIgmp) {
            if (disableIgmp == null) {
              throw new MissingRequiredPropertyException("GetNetworksOrgNetworkMulticast", "disableIgmp");
            }
            this.disableIgmp = disableIgmp;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetNetworksOrgNetworkMulticast", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder groups(Map<String,GetNetworksOrgNetworkMulticastGroups> groups) {
            if (groups == null) {
              throw new MissingRequiredPropertyException("GetNetworksOrgNetworkMulticast", "groups");
            }
            this.groups = groups;
            return this;
        }
        public GetNetworksOrgNetworkMulticast build() {
            final var _resultValue = new GetNetworksOrgNetworkMulticast();
            _resultValue.disableIgmp = disableIgmp;
            _resultValue.enabled = enabled;
            _resultValue.groups = groups;
            return _resultValue;
        }
    }
}
