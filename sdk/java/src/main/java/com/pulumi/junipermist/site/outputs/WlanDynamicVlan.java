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
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WlanDynamicVlan {
    /**
     * @return Default VLAN ID(s) can be a number, a range of VLAN IDs, a variable or multiple numbers, ranges or variables as a VLAN pool. Default VLAN as a pool of VLANS requires 0.14.x or newer firmware
     * 
     */
    private List<String> defaultVlanIds;
    /**
     * @return Requires `vlan_enabled`==`true` to be set to `true`. Whether to enable dynamic vlan
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return VLAN_ids to be locally bridged
     * 
     */
    private @Nullable List<String> localVlanIds;
    /**
     * @return standard (using Tunnel-Private-Group-ID, widely supported), airespace-interface-name (Airespace/Cisco). enum: `airespace-interface-name`, `standard`
     * 
     */
    private @Nullable String type;
    /**
     * @return Map between vlan_id (as string) to airespace interface names (comma-separated) or null for stndard mapping
     *   * if `dynamic_vlan.type`==`standard`, property key is the Vlan ID and property value is \&#34;\&#34;
     *   * if `dynamic_vlan.type`==`airespace-interface-name`, property key is the Vlan ID and property value is the Airespace Interface Name
     * 
     */
    private @Nullable Map<String,String> vlans;

    private WlanDynamicVlan() {}
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
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return VLAN_ids to be locally bridged
     * 
     */
    public List<String> localVlanIds() {
        return this.localVlanIds == null ? List.of() : this.localVlanIds;
    }
    /**
     * @return standard (using Tunnel-Private-Group-ID, widely supported), airespace-interface-name (Airespace/Cisco). enum: `airespace-interface-name`, `standard`
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Map between vlan_id (as string) to airespace interface names (comma-separated) or null for stndard mapping
     *   * if `dynamic_vlan.type`==`standard`, property key is the Vlan ID and property value is \&#34;\&#34;
     *   * if `dynamic_vlan.type`==`airespace-interface-name`, property key is the Vlan ID and property value is the Airespace Interface Name
     * 
     */
    public Map<String,String> vlans() {
        return this.vlans == null ? Map.of() : this.vlans;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WlanDynamicVlan defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> defaultVlanIds;
        private @Nullable Boolean enabled;
        private @Nullable List<String> localVlanIds;
        private @Nullable String type;
        private @Nullable Map<String,String> vlans;
        public Builder() {}
        public Builder(WlanDynamicVlan defaults) {
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
              throw new MissingRequiredPropertyException("WlanDynamicVlan", "defaultVlanIds");
            }
            this.defaultVlanIds = defaultVlanIds;
            return this;
        }
        public Builder defaultVlanIds(String... defaultVlanIds) {
            return defaultVlanIds(List.of(defaultVlanIds));
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder localVlanIds(@Nullable List<String> localVlanIds) {

            this.localVlanIds = localVlanIds;
            return this;
        }
        public Builder localVlanIds(String... localVlanIds) {
            return localVlanIds(List.of(localVlanIds));
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder vlans(@Nullable Map<String,String> vlans) {

            this.vlans = vlans;
            return this;
        }
        public WlanDynamicVlan build() {
            final var _resultValue = new WlanDynamicVlan();
            _resultValue.defaultVlanIds = defaultVlanIds;
            _resultValue.enabled = enabled;
            _resultValue.localVlanIds = localVlanIds;
            _resultValue.type = type;
            _resultValue.vlans = vlans;
            return _resultValue;
        }
    }
}
