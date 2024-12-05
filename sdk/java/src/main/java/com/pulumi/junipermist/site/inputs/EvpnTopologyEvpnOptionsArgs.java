// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.site.inputs.EvpnTopologyEvpnOptionsOverlayArgs;
import com.pulumi.junipermist.site.inputs.EvpnTopologyEvpnOptionsUnderlayArgs;
import com.pulumi.junipermist.site.inputs.EvpnTopologyEvpnOptionsVsInstancesArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EvpnTopologyEvpnOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final EvpnTopologyEvpnOptionsArgs Empty = new EvpnTopologyEvpnOptionsArgs();

    /**
     * optional, for dhcp_relay, unique loopback IPs are required for ERB or IPClos where we can set option-82 server_id-overrides
     * 
     */
    @Import(name="autoLoopbackSubnet")
    private @Nullable Output<String> autoLoopbackSubnet;

    /**
     * @return optional, for dhcp_relay, unique loopback IPs are required for ERB or IPClos where we can set option-82 server_id-overrides
     * 
     */
    public Optional<Output<String>> autoLoopbackSubnet() {
        return Optional.ofNullable(this.autoLoopbackSubnet);
    }

    /**
     * optional, for dhcp_relay, unique loopback IPs are required for ERB or IPClos where we can set option-82 server_id-overrides
     * 
     */
    @Import(name="autoLoopbackSubnet6")
    private @Nullable Output<String> autoLoopbackSubnet6;

    /**
     * @return optional, for dhcp_relay, unique loopback IPs are required for ERB or IPClos where we can set option-82 server_id-overrides
     * 
     */
    public Optional<Output<String>> autoLoopbackSubnet6() {
        return Optional.ofNullable(this.autoLoopbackSubnet6);
    }

    /**
     * optional, this generates router_id automatically, if specified, `router_id_prefix` is ignored
     * 
     */
    @Import(name="autoRouterIdSubnet")
    private @Nullable Output<String> autoRouterIdSubnet;

    /**
     * @return optional, this generates router_id automatically, if specified, `router_id_prefix` is ignored
     * 
     */
    public Optional<Output<String>> autoRouterIdSubnet() {
        return Optional.ofNullable(this.autoRouterIdSubnet);
    }

    /**
     * optional, this generates router_id automatically, if specified, `router_id_prefix` is ignored
     * 
     */
    @Import(name="autoRouterIdSubnet6")
    private @Nullable Output<String> autoRouterIdSubnet6;

    /**
     * @return optional, this generates router_id automatically, if specified, `router_id_prefix` is ignored
     * 
     */
    public Optional<Output<String>> autoRouterIdSubnet6() {
        return Optional.ofNullable(this.autoRouterIdSubnet6);
    }

    /**
     * optional, for ERB or CLOS, you can either use esilag to upstream routers or to also be the virtual-gateway
     * when `routed_at` != `core`, whether to do virtual-gateway at core as well
     * 
     */
    @Import(name="coreAsBorder")
    private @Nullable Output<Boolean> coreAsBorder;

    /**
     * @return optional, for ERB or CLOS, you can either use esilag to upstream routers or to also be the virtual-gateway
     * when `routed_at` != `core`, whether to do virtual-gateway at core as well
     * 
     */
    public Optional<Output<Boolean>> coreAsBorder() {
        return Optional.ofNullable(this.coreAsBorder);
    }

    @Import(name="overlay")
    private @Nullable Output<EvpnTopologyEvpnOptionsOverlayArgs> overlay;

    public Optional<Output<EvpnTopologyEvpnOptionsOverlayArgs>> overlay() {
        return Optional.ofNullable(this.overlay);
    }

    /**
     * by default, JUNOS uses 00-00-5e-00-01-01 as the virtual-gateway-address&#39;s v4_mac
     * if enabled, 00-00-5e-00-XX-YY will be used (where XX=vlan_id/256, YY=vlan_id%256)
     * 
     */
    @Import(name="perVlanVgaV4Mac")
    private @Nullable Output<Boolean> perVlanVgaV4Mac;

    /**
     * @return by default, JUNOS uses 00-00-5e-00-01-01 as the virtual-gateway-address&#39;s v4_mac
     * if enabled, 00-00-5e-00-XX-YY will be used (where XX=vlan_id/256, YY=vlan_id%256)
     * 
     */
    public Optional<Output<Boolean>> perVlanVgaV4Mac() {
        return Optional.ofNullable(this.perVlanVgaV4Mac);
    }

    /**
     * optional, where virtual-gateway should reside. enum: `core`, `distribution`, `edge`
     * 
     */
    @Import(name="routedAt")
    private @Nullable Output<String> routedAt;

    /**
     * @return optional, where virtual-gateway should reside. enum: `core`, `distribution`, `edge`
     * 
     */
    public Optional<Output<String>> routedAt() {
        return Optional.ofNullable(this.routedAt);
    }

    @Import(name="underlay")
    private @Nullable Output<EvpnTopologyEvpnOptionsUnderlayArgs> underlay;

    public Optional<Output<EvpnTopologyEvpnOptionsUnderlayArgs>> underlay() {
        return Optional.ofNullable(this.underlay);
    }

    /**
     * optional, for EX9200 only to seggregate virtual-switches
     * 
     */
    @Import(name="vsInstances")
    private @Nullable Output<Map<String,EvpnTopologyEvpnOptionsVsInstancesArgs>> vsInstances;

    /**
     * @return optional, for EX9200 only to seggregate virtual-switches
     * 
     */
    public Optional<Output<Map<String,EvpnTopologyEvpnOptionsVsInstancesArgs>>> vsInstances() {
        return Optional.ofNullable(this.vsInstances);
    }

    private EvpnTopologyEvpnOptionsArgs() {}

    private EvpnTopologyEvpnOptionsArgs(EvpnTopologyEvpnOptionsArgs $) {
        this.autoLoopbackSubnet = $.autoLoopbackSubnet;
        this.autoLoopbackSubnet6 = $.autoLoopbackSubnet6;
        this.autoRouterIdSubnet = $.autoRouterIdSubnet;
        this.autoRouterIdSubnet6 = $.autoRouterIdSubnet6;
        this.coreAsBorder = $.coreAsBorder;
        this.overlay = $.overlay;
        this.perVlanVgaV4Mac = $.perVlanVgaV4Mac;
        this.routedAt = $.routedAt;
        this.underlay = $.underlay;
        this.vsInstances = $.vsInstances;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EvpnTopologyEvpnOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EvpnTopologyEvpnOptionsArgs $;

        public Builder() {
            $ = new EvpnTopologyEvpnOptionsArgs();
        }

        public Builder(EvpnTopologyEvpnOptionsArgs defaults) {
            $ = new EvpnTopologyEvpnOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoLoopbackSubnet optional, for dhcp_relay, unique loopback IPs are required for ERB or IPClos where we can set option-82 server_id-overrides
         * 
         * @return builder
         * 
         */
        public Builder autoLoopbackSubnet(@Nullable Output<String> autoLoopbackSubnet) {
            $.autoLoopbackSubnet = autoLoopbackSubnet;
            return this;
        }

        /**
         * @param autoLoopbackSubnet optional, for dhcp_relay, unique loopback IPs are required for ERB or IPClos where we can set option-82 server_id-overrides
         * 
         * @return builder
         * 
         */
        public Builder autoLoopbackSubnet(String autoLoopbackSubnet) {
            return autoLoopbackSubnet(Output.of(autoLoopbackSubnet));
        }

        /**
         * @param autoLoopbackSubnet6 optional, for dhcp_relay, unique loopback IPs are required for ERB or IPClos where we can set option-82 server_id-overrides
         * 
         * @return builder
         * 
         */
        public Builder autoLoopbackSubnet6(@Nullable Output<String> autoLoopbackSubnet6) {
            $.autoLoopbackSubnet6 = autoLoopbackSubnet6;
            return this;
        }

        /**
         * @param autoLoopbackSubnet6 optional, for dhcp_relay, unique loopback IPs are required for ERB or IPClos where we can set option-82 server_id-overrides
         * 
         * @return builder
         * 
         */
        public Builder autoLoopbackSubnet6(String autoLoopbackSubnet6) {
            return autoLoopbackSubnet6(Output.of(autoLoopbackSubnet6));
        }

        /**
         * @param autoRouterIdSubnet optional, this generates router_id automatically, if specified, `router_id_prefix` is ignored
         * 
         * @return builder
         * 
         */
        public Builder autoRouterIdSubnet(@Nullable Output<String> autoRouterIdSubnet) {
            $.autoRouterIdSubnet = autoRouterIdSubnet;
            return this;
        }

        /**
         * @param autoRouterIdSubnet optional, this generates router_id automatically, if specified, `router_id_prefix` is ignored
         * 
         * @return builder
         * 
         */
        public Builder autoRouterIdSubnet(String autoRouterIdSubnet) {
            return autoRouterIdSubnet(Output.of(autoRouterIdSubnet));
        }

        /**
         * @param autoRouterIdSubnet6 optional, this generates router_id automatically, if specified, `router_id_prefix` is ignored
         * 
         * @return builder
         * 
         */
        public Builder autoRouterIdSubnet6(@Nullable Output<String> autoRouterIdSubnet6) {
            $.autoRouterIdSubnet6 = autoRouterIdSubnet6;
            return this;
        }

        /**
         * @param autoRouterIdSubnet6 optional, this generates router_id automatically, if specified, `router_id_prefix` is ignored
         * 
         * @return builder
         * 
         */
        public Builder autoRouterIdSubnet6(String autoRouterIdSubnet6) {
            return autoRouterIdSubnet6(Output.of(autoRouterIdSubnet6));
        }

        /**
         * @param coreAsBorder optional, for ERB or CLOS, you can either use esilag to upstream routers or to also be the virtual-gateway
         * when `routed_at` != `core`, whether to do virtual-gateway at core as well
         * 
         * @return builder
         * 
         */
        public Builder coreAsBorder(@Nullable Output<Boolean> coreAsBorder) {
            $.coreAsBorder = coreAsBorder;
            return this;
        }

        /**
         * @param coreAsBorder optional, for ERB or CLOS, you can either use esilag to upstream routers or to also be the virtual-gateway
         * when `routed_at` != `core`, whether to do virtual-gateway at core as well
         * 
         * @return builder
         * 
         */
        public Builder coreAsBorder(Boolean coreAsBorder) {
            return coreAsBorder(Output.of(coreAsBorder));
        }

        public Builder overlay(@Nullable Output<EvpnTopologyEvpnOptionsOverlayArgs> overlay) {
            $.overlay = overlay;
            return this;
        }

        public Builder overlay(EvpnTopologyEvpnOptionsOverlayArgs overlay) {
            return overlay(Output.of(overlay));
        }

        /**
         * @param perVlanVgaV4Mac by default, JUNOS uses 00-00-5e-00-01-01 as the virtual-gateway-address&#39;s v4_mac
         * if enabled, 00-00-5e-00-XX-YY will be used (where XX=vlan_id/256, YY=vlan_id%256)
         * 
         * @return builder
         * 
         */
        public Builder perVlanVgaV4Mac(@Nullable Output<Boolean> perVlanVgaV4Mac) {
            $.perVlanVgaV4Mac = perVlanVgaV4Mac;
            return this;
        }

        /**
         * @param perVlanVgaV4Mac by default, JUNOS uses 00-00-5e-00-01-01 as the virtual-gateway-address&#39;s v4_mac
         * if enabled, 00-00-5e-00-XX-YY will be used (where XX=vlan_id/256, YY=vlan_id%256)
         * 
         * @return builder
         * 
         */
        public Builder perVlanVgaV4Mac(Boolean perVlanVgaV4Mac) {
            return perVlanVgaV4Mac(Output.of(perVlanVgaV4Mac));
        }

        /**
         * @param routedAt optional, where virtual-gateway should reside. enum: `core`, `distribution`, `edge`
         * 
         * @return builder
         * 
         */
        public Builder routedAt(@Nullable Output<String> routedAt) {
            $.routedAt = routedAt;
            return this;
        }

        /**
         * @param routedAt optional, where virtual-gateway should reside. enum: `core`, `distribution`, `edge`
         * 
         * @return builder
         * 
         */
        public Builder routedAt(String routedAt) {
            return routedAt(Output.of(routedAt));
        }

        public Builder underlay(@Nullable Output<EvpnTopologyEvpnOptionsUnderlayArgs> underlay) {
            $.underlay = underlay;
            return this;
        }

        public Builder underlay(EvpnTopologyEvpnOptionsUnderlayArgs underlay) {
            return underlay(Output.of(underlay));
        }

        /**
         * @param vsInstances optional, for EX9200 only to seggregate virtual-switches
         * 
         * @return builder
         * 
         */
        public Builder vsInstances(@Nullable Output<Map<String,EvpnTopologyEvpnOptionsVsInstancesArgs>> vsInstances) {
            $.vsInstances = vsInstances;
            return this;
        }

        /**
         * @param vsInstances optional, for EX9200 only to seggregate virtual-switches
         * 
         * @return builder
         * 
         */
        public Builder vsInstances(Map<String,EvpnTopologyEvpnOptionsVsInstancesArgs> vsInstances) {
            return vsInstances(Output.of(vsInstances));
        }

        public EvpnTopologyEvpnOptionsArgs build() {
            return $;
        }
    }

}