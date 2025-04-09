// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.site.inputs.WxtagSpecArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WxtagState extends com.pulumi.resources.ResourceArgs {

    public static final WxtagState Empty = new WxtagState();

    /**
     * If `type`==`client`, Client MAC Address
     * 
     */
    @Import(name="mac")
    private @Nullable Output<String> mac;

    /**
     * @return If `type`==`client`, Client MAC Address
     * 
     */
    public Optional<Output<String>> mac() {
        return Optional.ofNullable(this.mac);
    }

    /**
     * required if `type`==`match`. enum: `ap_id`, `app`, `asset_mac`, `client_mac`, `hostname`, `ip_range_subnet`, `port`,
     * `psk_name`, `psk_role`, `radius_attr`, `radius_class`, `radius_group`, `radius_username`, `sdkclient_uuid`, `wlan_id`
     * 
     */
    @Import(name="match")
    private @Nullable Output<String> match;

    /**
     * @return required if `type`==`match`. enum: `ap_id`, `app`, `asset_mac`, `client_mac`, `hostname`, `ip_range_subnet`, `port`,
     * `psk_name`, `psk_role`, `radius_attr`, `radius_class`, `radius_group`, `radius_username`, `sdkclient_uuid`, `wlan_id`
     * 
     */
    public Optional<Output<String>> match() {
        return Optional.ofNullable(this.match);
    }

    /**
     * The name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `not_in`
     * 
     */
    @Import(name="op")
    private @Nullable Output<String> op;

    /**
     * @return required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `not_in`
     * 
     */
    public Optional<Output<String>> op() {
        return Optional.ofNullable(this.op);
    }

    @Import(name="siteId")
    private @Nullable Output<String> siteId;

    public Optional<Output<String>> siteId() {
        return Optional.ofNullable(this.siteId);
    }

    /**
     * If `type`==`spec`
     * 
     */
    @Import(name="specs")
    private @Nullable Output<List<WxtagSpecArgs>> specs;

    /**
     * @return If `type`==`spec`
     * 
     */
    public Optional<Output<List<WxtagSpecArgs>>> specs() {
        return Optional.ofNullable(this.specs);
    }

    /**
     * enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Required if `type`==`match` and * `match`==`ap_id`: list of AP IDs * `match`==`app`: list of Application Names *
     * `match`==`asset_mac`: list of Asset MAC Addresses * `match`==`client_mac`: list of Client MAC Addresses *
     * `match`==`hostname`: list of Resources Hostnames * `match`==`ip_range_subnet`: list of IP Addresses and/or CIDRs *
     * `match`==`psk_name`: list of PSK Names * `match`==`psk_role`: list of PSK Roles * `match`==`port`: list of Ports or Port
     * Ranges * `match`==`radius_attr`: list of RADIUS Attributes. The values are [ &#34;6=1&#34;, &#34;26=10.2.3.4&#34; ], this support other
     * RADIUS attributes where we know the type * `match`==`radius_class`: list of RADIUS Classes. This matches the
     * ATTR-Class(25) * `match`==`radius_group`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
     * Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
     * `match`==`radius_username`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclient_uuid`:
     * list of SDK UUIDs * `match`==`wlan_id`: list of WLAN IDs **Notes**: Variables are not allowed
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return Required if `type`==`match` and * `match`==`ap_id`: list of AP IDs * `match`==`app`: list of Application Names *
     * `match`==`asset_mac`: list of Asset MAC Addresses * `match`==`client_mac`: list of Client MAC Addresses *
     * `match`==`hostname`: list of Resources Hostnames * `match`==`ip_range_subnet`: list of IP Addresses and/or CIDRs *
     * `match`==`psk_name`: list of PSK Names * `match`==`psk_role`: list of PSK Roles * `match`==`port`: list of Ports or Port
     * Ranges * `match`==`radius_attr`: list of RADIUS Attributes. The values are [ &#34;6=1&#34;, &#34;26=10.2.3.4&#34; ], this support other
     * RADIUS attributes where we know the type * `match`==`radius_class`: list of RADIUS Classes. This matches the
     * ATTR-Class(25) * `match`==`radius_group`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
     * Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
     * `match`==`radius_username`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclient_uuid`:
     * list of SDK UUIDs * `match`==`wlan_id`: list of WLAN IDs **Notes**: Variables are not allowed
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    @Import(name="vlanId")
    private @Nullable Output<String> vlanId;

    public Optional<Output<String>> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    private WxtagState() {}

    private WxtagState(WxtagState $) {
        this.mac = $.mac;
        this.match = $.match;
        this.name = $.name;
        this.op = $.op;
        this.siteId = $.siteId;
        this.specs = $.specs;
        this.type = $.type;
        this.values = $.values;
        this.vlanId = $.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WxtagState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WxtagState $;

        public Builder() {
            $ = new WxtagState();
        }

        public Builder(WxtagState defaults) {
            $ = new WxtagState(Objects.requireNonNull(defaults));
        }

        /**
         * @param mac If `type`==`client`, Client MAC Address
         * 
         * @return builder
         * 
         */
        public Builder mac(@Nullable Output<String> mac) {
            $.mac = mac;
            return this;
        }

        /**
         * @param mac If `type`==`client`, Client MAC Address
         * 
         * @return builder
         * 
         */
        public Builder mac(String mac) {
            return mac(Output.of(mac));
        }

        /**
         * @param match required if `type`==`match`. enum: `ap_id`, `app`, `asset_mac`, `client_mac`, `hostname`, `ip_range_subnet`, `port`,
         * `psk_name`, `psk_role`, `radius_attr`, `radius_class`, `radius_group`, `radius_username`, `sdkclient_uuid`, `wlan_id`
         * 
         * @return builder
         * 
         */
        public Builder match(@Nullable Output<String> match) {
            $.match = match;
            return this;
        }

        /**
         * @param match required if `type`==`match`. enum: `ap_id`, `app`, `asset_mac`, `client_mac`, `hostname`, `ip_range_subnet`, `port`,
         * `psk_name`, `psk_role`, `radius_attr`, `radius_class`, `radius_group`, `radius_username`, `sdkclient_uuid`, `wlan_id`
         * 
         * @return builder
         * 
         */
        public Builder match(String match) {
            return match(Output.of(match));
        }

        /**
         * @param name The name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param op required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `not_in`
         * 
         * @return builder
         * 
         */
        public Builder op(@Nullable Output<String> op) {
            $.op = op;
            return this;
        }

        /**
         * @param op required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `not_in`
         * 
         * @return builder
         * 
         */
        public Builder op(String op) {
            return op(Output.of(op));
        }

        public Builder siteId(@Nullable Output<String> siteId) {
            $.siteId = siteId;
            return this;
        }

        public Builder siteId(String siteId) {
            return siteId(Output.of(siteId));
        }

        /**
         * @param specs If `type`==`spec`
         * 
         * @return builder
         * 
         */
        public Builder specs(@Nullable Output<List<WxtagSpecArgs>> specs) {
            $.specs = specs;
            return this;
        }

        /**
         * @param specs If `type`==`spec`
         * 
         * @return builder
         * 
         */
        public Builder specs(List<WxtagSpecArgs> specs) {
            return specs(Output.of(specs));
        }

        /**
         * @param specs If `type`==`spec`
         * 
         * @return builder
         * 
         */
        public Builder specs(WxtagSpecArgs... specs) {
            return specs(List.of(specs));
        }

        /**
         * @param type enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param values Required if `type`==`match` and * `match`==`ap_id`: list of AP IDs * `match`==`app`: list of Application Names *
         * `match`==`asset_mac`: list of Asset MAC Addresses * `match`==`client_mac`: list of Client MAC Addresses *
         * `match`==`hostname`: list of Resources Hostnames * `match`==`ip_range_subnet`: list of IP Addresses and/or CIDRs *
         * `match`==`psk_name`: list of PSK Names * `match`==`psk_role`: list of PSK Roles * `match`==`port`: list of Ports or Port
         * Ranges * `match`==`radius_attr`: list of RADIUS Attributes. The values are [ &#34;6=1&#34;, &#34;26=10.2.3.4&#34; ], this support other
         * RADIUS attributes where we know the type * `match`==`radius_class`: list of RADIUS Classes. This matches the
         * ATTR-Class(25) * `match`==`radius_group`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
         * Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
         * `match`==`radius_username`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclient_uuid`:
         * list of SDK UUIDs * `match`==`wlan_id`: list of WLAN IDs **Notes**: Variables are not allowed
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Required if `type`==`match` and * `match`==`ap_id`: list of AP IDs * `match`==`app`: list of Application Names *
         * `match`==`asset_mac`: list of Asset MAC Addresses * `match`==`client_mac`: list of Client MAC Addresses *
         * `match`==`hostname`: list of Resources Hostnames * `match`==`ip_range_subnet`: list of IP Addresses and/or CIDRs *
         * `match`==`psk_name`: list of PSK Names * `match`==`psk_role`: list of PSK Roles * `match`==`port`: list of Ports or Port
         * Ranges * `match`==`radius_attr`: list of RADIUS Attributes. The values are [ &#34;6=1&#34;, &#34;26=10.2.3.4&#34; ], this support other
         * RADIUS attributes where we know the type * `match`==`radius_class`: list of RADIUS Classes. This matches the
         * ATTR-Class(25) * `match`==`radius_group`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
         * Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
         * `match`==`radius_username`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclient_uuid`:
         * list of SDK UUIDs * `match`==`wlan_id`: list of WLAN IDs **Notes**: Variables are not allowed
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values Required if `type`==`match` and * `match`==`ap_id`: list of AP IDs * `match`==`app`: list of Application Names *
         * `match`==`asset_mac`: list of Asset MAC Addresses * `match`==`client_mac`: list of Client MAC Addresses *
         * `match`==`hostname`: list of Resources Hostnames * `match`==`ip_range_subnet`: list of IP Addresses and/or CIDRs *
         * `match`==`psk_name`: list of PSK Names * `match`==`psk_role`: list of PSK Roles * `match`==`port`: list of Ports or Port
         * Ranges * `match`==`radius_attr`: list of RADIUS Attributes. The values are [ &#34;6=1&#34;, &#34;26=10.2.3.4&#34; ], this support other
         * RADIUS attributes where we know the type * `match`==`radius_class`: list of RADIUS Classes. This matches the
         * ATTR-Class(25) * `match`==`radius_group`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
         * Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
         * `match`==`radius_username`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclient_uuid`:
         * list of SDK UUIDs * `match`==`wlan_id`: list of WLAN IDs **Notes**: Variables are not allowed
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public Builder vlanId(@Nullable Output<String> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        public Builder vlanId(String vlanId) {
            return vlanId(Output.of(vlanId));
        }

        public WxtagState build() {
            return $;
        }
    }

}
