// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewaytemplateOobIpConfigNode1Args extends com.pulumi.resources.ResourceArgs {

    public static final GatewaytemplateOobIpConfigNode1Args Empty = new GatewaytemplateOobIpConfigNode1Args();

    /**
     * if `type`==`static`
     * 
     */
    @Import(name="gateway")
    private @Nullable Output<String> gateway;

    /**
     * @return if `type`==`static`
     * 
     */
    public Optional<Output<String>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    @Import(name="ip")
    private @Nullable Output<String> ip;

    public Optional<Output<String>> ip() {
        return Optional.ofNullable(this.ip);
    }

    /**
     * used only if `subnet` is not specified in `networks`
     * 
     */
    @Import(name="netmask")
    private @Nullable Output<String> netmask;

    /**
     * @return used only if `subnet` is not specified in `networks`
     * 
     */
    public Optional<Output<String>> netmask() {
        return Optional.ofNullable(this.netmask);
    }

    /**
     * enum: `dhcp`, `static`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return enum: `dhcp`, `static`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * if supported on the platform. If enabled, DNS will be using this routing-instance, too
     * 
     */
    @Import(name="useMgmtVrf")
    private @Nullable Output<Boolean> useMgmtVrf;

    /**
     * @return if supported on the platform. If enabled, DNS will be using this routing-instance, too
     * 
     */
    public Optional<Output<Boolean>> useMgmtVrf() {
        return Optional.ofNullable(this.useMgmtVrf);
    }

    /**
     * whether to use `mgmt_junos` for host-out traffic (NTP/TACPLUS/RADIUS/SYSLOG/SNMP), if alternative source network/ip is desired
     * 
     */
    @Import(name="useMgmtVrfForHostOut")
    private @Nullable Output<Boolean> useMgmtVrfForHostOut;

    /**
     * @return whether to use `mgmt_junos` for host-out traffic (NTP/TACPLUS/RADIUS/SYSLOG/SNMP), if alternative source network/ip is desired
     * 
     */
    public Optional<Output<Boolean>> useMgmtVrfForHostOut() {
        return Optional.ofNullable(this.useMgmtVrfForHostOut);
    }

    @Import(name="vlanId")
    private @Nullable Output<String> vlanId;

    public Optional<Output<String>> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    private GatewaytemplateOobIpConfigNode1Args() {}

    private GatewaytemplateOobIpConfigNode1Args(GatewaytemplateOobIpConfigNode1Args $) {
        this.gateway = $.gateway;
        this.ip = $.ip;
        this.netmask = $.netmask;
        this.type = $.type;
        this.useMgmtVrf = $.useMgmtVrf;
        this.useMgmtVrfForHostOut = $.useMgmtVrfForHostOut;
        this.vlanId = $.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewaytemplateOobIpConfigNode1Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewaytemplateOobIpConfigNode1Args $;

        public Builder() {
            $ = new GatewaytemplateOobIpConfigNode1Args();
        }

        public Builder(GatewaytemplateOobIpConfigNode1Args defaults) {
            $ = new GatewaytemplateOobIpConfigNode1Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param gateway if `type`==`static`
         * 
         * @return builder
         * 
         */
        public Builder gateway(@Nullable Output<String> gateway) {
            $.gateway = gateway;
            return this;
        }

        /**
         * @param gateway if `type`==`static`
         * 
         * @return builder
         * 
         */
        public Builder gateway(String gateway) {
            return gateway(Output.of(gateway));
        }

        public Builder ip(@Nullable Output<String> ip) {
            $.ip = ip;
            return this;
        }

        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        /**
         * @param netmask used only if `subnet` is not specified in `networks`
         * 
         * @return builder
         * 
         */
        public Builder netmask(@Nullable Output<String> netmask) {
            $.netmask = netmask;
            return this;
        }

        /**
         * @param netmask used only if `subnet` is not specified in `networks`
         * 
         * @return builder
         * 
         */
        public Builder netmask(String netmask) {
            return netmask(Output.of(netmask));
        }

        /**
         * @param type enum: `dhcp`, `static`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type enum: `dhcp`, `static`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param useMgmtVrf if supported on the platform. If enabled, DNS will be using this routing-instance, too
         * 
         * @return builder
         * 
         */
        public Builder useMgmtVrf(@Nullable Output<Boolean> useMgmtVrf) {
            $.useMgmtVrf = useMgmtVrf;
            return this;
        }

        /**
         * @param useMgmtVrf if supported on the platform. If enabled, DNS will be using this routing-instance, too
         * 
         * @return builder
         * 
         */
        public Builder useMgmtVrf(Boolean useMgmtVrf) {
            return useMgmtVrf(Output.of(useMgmtVrf));
        }

        /**
         * @param useMgmtVrfForHostOut whether to use `mgmt_junos` for host-out traffic (NTP/TACPLUS/RADIUS/SYSLOG/SNMP), if alternative source network/ip is desired
         * 
         * @return builder
         * 
         */
        public Builder useMgmtVrfForHostOut(@Nullable Output<Boolean> useMgmtVrfForHostOut) {
            $.useMgmtVrfForHostOut = useMgmtVrfForHostOut;
            return this;
        }

        /**
         * @param useMgmtVrfForHostOut whether to use `mgmt_junos` for host-out traffic (NTP/TACPLUS/RADIUS/SYSLOG/SNMP), if alternative source network/ip is desired
         * 
         * @return builder
         * 
         */
        public Builder useMgmtVrfForHostOut(Boolean useMgmtVrfForHostOut) {
            return useMgmtVrfForHostOut(Output.of(useMgmtVrfForHostOut));
        }

        public Builder vlanId(@Nullable Output<String> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        public Builder vlanId(String vlanId) {
            return vlanId(Output.of(vlanId));
        }

        public GatewaytemplateOobIpConfigNode1Args build() {
            return $;
        }
    }

}