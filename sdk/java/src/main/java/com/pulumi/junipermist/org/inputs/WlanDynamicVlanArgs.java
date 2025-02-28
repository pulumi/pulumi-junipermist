// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WlanDynamicVlanArgs extends com.pulumi.resources.ResourceArgs {

    public static final WlanDynamicVlanArgs Empty = new WlanDynamicVlanArgs();

    /**
     * Default VLAN ID(s) can be a number, a range of VLAN IDs, a variable or multiple numbers, ranges or variables as a VLAN pool. Default VLAN as a pool of VLANS requires 0.14.x or newer firmware
     * 
     */
    @Import(name="defaultVlanIds", required=true)
    private Output<List<String>> defaultVlanIds;

    /**
     * @return Default VLAN ID(s) can be a number, a range of VLAN IDs, a variable or multiple numbers, ranges or variables as a VLAN pool. Default VLAN as a pool of VLANS requires 0.14.x or newer firmware
     * 
     */
    public Output<List<String>> defaultVlanIds() {
        return this.defaultVlanIds;
    }

    /**
     * Requires `vlan_enabled`==`true` to be set to `true`. Whether to enable dynamic vlan
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Requires `vlan_enabled`==`true` to be set to `true`. Whether to enable dynamic vlan
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * VLAN_ids to be locally bridged
     * 
     */
    @Import(name="localVlanIds")
    private @Nullable Output<List<String>> localVlanIds;

    /**
     * @return VLAN_ids to be locally bridged
     * 
     */
    public Optional<Output<List<String>>> localVlanIds() {
        return Optional.ofNullable(this.localVlanIds);
    }

    /**
     * standard (using Tunnel-Private-Group-ID, widely supported), airespace-interface-name (Airespace/Cisco). enum: `airespace-interface-name`, `standard`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return standard (using Tunnel-Private-Group-ID, widely supported), airespace-interface-name (Airespace/Cisco). enum: `airespace-interface-name`, `standard`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Map between vlan_id (as string) to airespace interface names (comma-separated) or null for stndard mapping
     *   * if `dynamic_vlan.type`==`standard`, property key is the Vlan ID and property value is \&#34;\&#34;
     *   * if `dynamic_vlan.type`==`airespace-interface-name`, property key is the Vlan ID and property value is the Airespace Interface Name
     * 
     */
    @Import(name="vlans")
    private @Nullable Output<Map<String,String>> vlans;

    /**
     * @return Map between vlan_id (as string) to airespace interface names (comma-separated) or null for stndard mapping
     *   * if `dynamic_vlan.type`==`standard`, property key is the Vlan ID and property value is \&#34;\&#34;
     *   * if `dynamic_vlan.type`==`airespace-interface-name`, property key is the Vlan ID and property value is the Airespace Interface Name
     * 
     */
    public Optional<Output<Map<String,String>>> vlans() {
        return Optional.ofNullable(this.vlans);
    }

    private WlanDynamicVlanArgs() {}

    private WlanDynamicVlanArgs(WlanDynamicVlanArgs $) {
        this.defaultVlanIds = $.defaultVlanIds;
        this.enabled = $.enabled;
        this.localVlanIds = $.localVlanIds;
        this.type = $.type;
        this.vlans = $.vlans;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WlanDynamicVlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WlanDynamicVlanArgs $;

        public Builder() {
            $ = new WlanDynamicVlanArgs();
        }

        public Builder(WlanDynamicVlanArgs defaults) {
            $ = new WlanDynamicVlanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultVlanIds Default VLAN ID(s) can be a number, a range of VLAN IDs, a variable or multiple numbers, ranges or variables as a VLAN pool. Default VLAN as a pool of VLANS requires 0.14.x or newer firmware
         * 
         * @return builder
         * 
         */
        public Builder defaultVlanIds(Output<List<String>> defaultVlanIds) {
            $.defaultVlanIds = defaultVlanIds;
            return this;
        }

        /**
         * @param defaultVlanIds Default VLAN ID(s) can be a number, a range of VLAN IDs, a variable or multiple numbers, ranges or variables as a VLAN pool. Default VLAN as a pool of VLANS requires 0.14.x or newer firmware
         * 
         * @return builder
         * 
         */
        public Builder defaultVlanIds(List<String> defaultVlanIds) {
            return defaultVlanIds(Output.of(defaultVlanIds));
        }

        /**
         * @param defaultVlanIds Default VLAN ID(s) can be a number, a range of VLAN IDs, a variable or multiple numbers, ranges or variables as a VLAN pool. Default VLAN as a pool of VLANS requires 0.14.x or newer firmware
         * 
         * @return builder
         * 
         */
        public Builder defaultVlanIds(String... defaultVlanIds) {
            return defaultVlanIds(List.of(defaultVlanIds));
        }

        /**
         * @param enabled Requires `vlan_enabled`==`true` to be set to `true`. Whether to enable dynamic vlan
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Requires `vlan_enabled`==`true` to be set to `true`. Whether to enable dynamic vlan
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param localVlanIds VLAN_ids to be locally bridged
         * 
         * @return builder
         * 
         */
        public Builder localVlanIds(@Nullable Output<List<String>> localVlanIds) {
            $.localVlanIds = localVlanIds;
            return this;
        }

        /**
         * @param localVlanIds VLAN_ids to be locally bridged
         * 
         * @return builder
         * 
         */
        public Builder localVlanIds(List<String> localVlanIds) {
            return localVlanIds(Output.of(localVlanIds));
        }

        /**
         * @param localVlanIds VLAN_ids to be locally bridged
         * 
         * @return builder
         * 
         */
        public Builder localVlanIds(String... localVlanIds) {
            return localVlanIds(List.of(localVlanIds));
        }

        /**
         * @param type standard (using Tunnel-Private-Group-ID, widely supported), airespace-interface-name (Airespace/Cisco). enum: `airespace-interface-name`, `standard`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type standard (using Tunnel-Private-Group-ID, widely supported), airespace-interface-name (Airespace/Cisco). enum: `airespace-interface-name`, `standard`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param vlans Map between vlan_id (as string) to airespace interface names (comma-separated) or null for stndard mapping
         *   * if `dynamic_vlan.type`==`standard`, property key is the Vlan ID and property value is \&#34;\&#34;
         *   * if `dynamic_vlan.type`==`airespace-interface-name`, property key is the Vlan ID and property value is the Airespace Interface Name
         * 
         * @return builder
         * 
         */
        public Builder vlans(@Nullable Output<Map<String,String>> vlans) {
            $.vlans = vlans;
            return this;
        }

        /**
         * @param vlans Map between vlan_id (as string) to airespace interface names (comma-separated) or null for stndard mapping
         *   * if `dynamic_vlan.type`==`standard`, property key is the Vlan ID and property value is \&#34;\&#34;
         *   * if `dynamic_vlan.type`==`airespace-interface-name`, property key is the Vlan ID and property value is the Airespace Interface Name
         * 
         * @return builder
         * 
         */
        public Builder vlans(Map<String,String> vlans) {
            return vlans(Output.of(vlans));
        }

        public WlanDynamicVlanArgs build() {
            if ($.defaultVlanIds == null) {
                throw new MissingRequiredPropertyException("WlanDynamicVlanArgs", "defaultVlanIds");
            }
            return $;
        }
    }

}
