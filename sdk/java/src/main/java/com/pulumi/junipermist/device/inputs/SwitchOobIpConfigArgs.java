// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchOobIpConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchOobIpConfigArgs Empty = new SwitchOobIpConfigArgs();

    @Import(name="gateway")
    private @Nullable Output<String> gateway;

    public Optional<Output<String>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    @Import(name="ip")
    private @Nullable Output<String> ip;

    public Optional<Output<String>> ip() {
        return Optional.ofNullable(this.ip);
    }

    /**
     * Used only if `subnet` is not specified in `networks`
     * 
     */
    @Import(name="netmask")
    private @Nullable Output<String> netmask;

    /**
     * @return Used only if `subnet` is not specified in `networks`
     * 
     */
    public Optional<Output<String>> netmask() {
        return Optional.ofNullable(this.netmask);
    }

    /**
     * Optional, the network to be used for mgmt
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return Optional, the network to be used for mgmt
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
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
     * If supported on the platform. If enabled, DNS will be using this routing-instance, too
     * 
     */
    @Import(name="useMgmtVrf")
    private @Nullable Output<Boolean> useMgmtVrf;

    /**
     * @return If supported on the platform. If enabled, DNS will be using this routing-instance, too
     * 
     */
    public Optional<Output<Boolean>> useMgmtVrf() {
        return Optional.ofNullable(this.useMgmtVrf);
    }

    /**
     * For host-out traffic (NTP/TACPLUS/RADIUS/SYSLOG/SNMP), if alternative source network/ip is desired
     * 
     */
    @Import(name="useMgmtVrfForHostOut")
    private @Nullable Output<Boolean> useMgmtVrfForHostOut;

    /**
     * @return For host-out traffic (NTP/TACPLUS/RADIUS/SYSLOG/SNMP), if alternative source network/ip is desired
     * 
     */
    public Optional<Output<Boolean>> useMgmtVrfForHostOut() {
        return Optional.ofNullable(this.useMgmtVrfForHostOut);
    }

    private SwitchOobIpConfigArgs() {}

    private SwitchOobIpConfigArgs(SwitchOobIpConfigArgs $) {
        this.gateway = $.gateway;
        this.ip = $.ip;
        this.netmask = $.netmask;
        this.network = $.network;
        this.type = $.type;
        this.useMgmtVrf = $.useMgmtVrf;
        this.useMgmtVrfForHostOut = $.useMgmtVrfForHostOut;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchOobIpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchOobIpConfigArgs $;

        public Builder() {
            $ = new SwitchOobIpConfigArgs();
        }

        public Builder(SwitchOobIpConfigArgs defaults) {
            $ = new SwitchOobIpConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder gateway(@Nullable Output<String> gateway) {
            $.gateway = gateway;
            return this;
        }

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
         * @param netmask Used only if `subnet` is not specified in `networks`
         * 
         * @return builder
         * 
         */
        public Builder netmask(@Nullable Output<String> netmask) {
            $.netmask = netmask;
            return this;
        }

        /**
         * @param netmask Used only if `subnet` is not specified in `networks`
         * 
         * @return builder
         * 
         */
        public Builder netmask(String netmask) {
            return netmask(Output.of(netmask));
        }

        /**
         * @param network Optional, the network to be used for mgmt
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Optional, the network to be used for mgmt
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
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
         * @param useMgmtVrf If supported on the platform. If enabled, DNS will be using this routing-instance, too
         * 
         * @return builder
         * 
         */
        public Builder useMgmtVrf(@Nullable Output<Boolean> useMgmtVrf) {
            $.useMgmtVrf = useMgmtVrf;
            return this;
        }

        /**
         * @param useMgmtVrf If supported on the platform. If enabled, DNS will be using this routing-instance, too
         * 
         * @return builder
         * 
         */
        public Builder useMgmtVrf(Boolean useMgmtVrf) {
            return useMgmtVrf(Output.of(useMgmtVrf));
        }

        /**
         * @param useMgmtVrfForHostOut For host-out traffic (NTP/TACPLUS/RADIUS/SYSLOG/SNMP), if alternative source network/ip is desired
         * 
         * @return builder
         * 
         */
        public Builder useMgmtVrfForHostOut(@Nullable Output<Boolean> useMgmtVrfForHostOut) {
            $.useMgmtVrfForHostOut = useMgmtVrfForHostOut;
            return this;
        }

        /**
         * @param useMgmtVrfForHostOut For host-out traffic (NTP/TACPLUS/RADIUS/SYSLOG/SNMP), if alternative source network/ip is desired
         * 
         * @return builder
         * 
         */
        public Builder useMgmtVrfForHostOut(Boolean useMgmtVrfForHostOut) {
            return useMgmtVrfForHostOut(Output.of(useMgmtVrfForHostOut));
        }

        public SwitchOobIpConfigArgs build() {
            return $;
        }
    }

}
