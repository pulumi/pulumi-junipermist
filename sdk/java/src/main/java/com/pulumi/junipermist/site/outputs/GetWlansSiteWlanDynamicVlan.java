// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetWlansSiteWlanDynamicVlan {
    /**
     * @return Default VLAN ID(s) can be a number, a range of VLAN IDs, a variable or multiple numbers, ranges or variables as a VLAN pool. Default VLAN as a pool of VLANS requires 0.14.x or newer firmware
     * 
     */
    private List<String> defaultVlanIds;
    /**
     * @return Requires `vlan_enabled`==`true` to be set to `true`. Whether to enable dynamic vlan
     * 
     */
    private Boolean enabled;
    /**
     * @return VLAN_ids to be locally bridged
     * 
     */
    private List<String> localVlanIds;
    /**
     * @return standard (using Tunnel-Private-Group-ID, widely supported), airespace-interface-name (Airespace/Cisco). enum: `airespace-interface-name`, `standard`
     * 
     */
    private String type;
    /**
     * @return Map between vlan_id (as string) to airespace interface names (comma-separated) or null for stndard mapping
     *   * if `dynamic_vlan.type`==`standard`, property key is the Vlan ID and property value is \&#34;\&#34;
     *   * if `dynamic_vlan.type`==`airespace-interface-name`, property key is the Vlan ID and property value is the Airespace Interface Name
     * 
     */
    private Map<String,String> vlans;

    private GetWlansSiteWlanDynamicVlan() {}
    /**
     * @return Default VLAN ID(s) can be a number, a range of VLAN IDs, a variable or multiple numbers, ranges or variables as a VLAN pool. Default VLAN as a pool of VLANS requires 0.14.x or newer firmware
     * 
     */
    public List<String> defaultVlanIds() {
        return this.defaultVlanIds;
    }
    /**
     * @return Requires `vlan_enabled`==`true` to be set to `true`. Whether to enable dynamic vlan
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return VLAN_ids to be locally bridged
     * 
     */
    public List<String> localVlanIds() {
        return this.localVlanIds;
    }
    /**
     * @return standard (using Tunnel-Private-Group-ID, widely supported), airespace-interface-name (Airespace/Cisco). enum: `airespace-interface-name`, `standard`
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Map between vlan_id (as string) to airespace interface names (comma-separated) or null for stndard mapping
     *   * if `dynamic_vlan.type`==`standard`, property key is the Vlan ID and property value is \&#34;\&#34;
     *   * if `dynamic_vlan.type`==`airespace-interface-name`, property key is the Vlan ID and property value is the Airespace Interface Name
     * 
     */
    public Map<String,String> vlans() {
        return this.vlans;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWlansSiteWlanDynamicVlan defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> defaultVlanIds;
        private Boolean enabled;
        private List<String> localVlanIds;
        private String type;
        private Map<String,String> vlans;
        public Builder() {}
        public Builder(GetWlansSiteWlanDynamicVlan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultVlanIds = defaults.defaultVlanIds;
    	      this.enabled = defaults.enabled;
    	      this.localVlanIds = defaults.localVlanIds;
    	      this.type = defaults.type;
    	      this.vlans = defaults.vlans;
        }

        @CustomType.Setter
        public Builder defaultVlanIds(List<String> defaultVlanIds) {
            if (defaultVlanIds == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanDynamicVlan", "defaultVlanIds");
            }
            this.defaultVlanIds = defaultVlanIds;
            return this;
        }
        public Builder defaultVlanIds(String... defaultVlanIds) {
            return defaultVlanIds(List.of(defaultVlanIds));
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanDynamicVlan", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder localVlanIds(List<String> localVlanIds) {
            if (localVlanIds == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanDynamicVlan", "localVlanIds");
            }
            this.localVlanIds = localVlanIds;
            return this;
        }
        public Builder localVlanIds(String... localVlanIds) {
            return localVlanIds(List.of(localVlanIds));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanDynamicVlan", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder vlans(Map<String,String> vlans) {
            if (vlans == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanDynamicVlan", "vlans");
            }
            this.vlans = vlans;
            return this;
        }
        public GetWlansSiteWlanDynamicVlan build() {
            final var _resultValue = new GetWlansSiteWlanDynamicVlan();
            _resultValue.defaultVlanIds = defaultVlanIds;
            _resultValue.enabled = enabled;
            _resultValue.localVlanIds = localVlanIds;
            _resultValue.type = type;
            _resultValue.vlans = vlans;
            return _resultValue;
        }
    }
}
