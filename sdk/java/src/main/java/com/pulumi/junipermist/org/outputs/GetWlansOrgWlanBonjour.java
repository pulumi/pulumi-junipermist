// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.outputs.GetWlansOrgWlanBonjourServices;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetWlansOrgWlanBonjour {
    /**
     * @return additional VLAN IDs (on the LAN side or from other WLANs) should we be forwarding bonjour queries/responses
     * 
     */
    private List<String> additionalVlanIds;
    /**
     * @return Whether to enable bonjour for this WLAN. Once enabled, limit_bcast is assumed true, allow_mdns is assumed false
     * 
     */
    private Boolean enabled;
    /**
     * @return What services are allowed.
     * Property key is the service name
     * 
     */
    private Map<String,GetWlansOrgWlanBonjourServices> services;

    private GetWlansOrgWlanBonjour() {}
    /**
     * @return additional VLAN IDs (on the LAN side or from other WLANs) should we be forwarding bonjour queries/responses
     * 
     */
    public List<String> additionalVlanIds() {
        return this.additionalVlanIds;
    }
    /**
     * @return Whether to enable bonjour for this WLAN. Once enabled, limit_bcast is assumed true, allow_mdns is assumed false
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return What services are allowed.
     * Property key is the service name
     * 
     */
    public Map<String,GetWlansOrgWlanBonjourServices> services() {
        return this.services;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWlansOrgWlanBonjour defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> additionalVlanIds;
        private Boolean enabled;
        private Map<String,GetWlansOrgWlanBonjourServices> services;
        public Builder() {}
        public Builder(GetWlansOrgWlanBonjour defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalVlanIds = defaults.additionalVlanIds;
    	      this.enabled = defaults.enabled;
    	      this.services = defaults.services;
        }

        @CustomType.Setter
        public Builder additionalVlanIds(List<String> additionalVlanIds) {
            if (additionalVlanIds == null) {
              throw new MissingRequiredPropertyException("GetWlansOrgWlanBonjour", "additionalVlanIds");
            }
            this.additionalVlanIds = additionalVlanIds;
            return this;
        }
        public Builder additionalVlanIds(String... additionalVlanIds) {
            return additionalVlanIds(List.of(additionalVlanIds));
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetWlansOrgWlanBonjour", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder services(Map<String,GetWlansOrgWlanBonjourServices> services) {
            if (services == null) {
              throw new MissingRequiredPropertyException("GetWlansOrgWlanBonjour", "services");
            }
            this.services = services;
            return this;
        }
        public GetWlansOrgWlanBonjour build() {
            final var _resultValue = new GetWlansOrgWlanBonjour();
            _resultValue.additionalVlanIds = additionalVlanIds;
            _resultValue.enabled = enabled;
            _resultValue.services = services;
            return _resultValue;
        }
    }
}
