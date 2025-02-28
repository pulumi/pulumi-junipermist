// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileGatewayPortConfigIpConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileGatewayPortConfigIpConfigArgs Empty = new DeviceprofileGatewayPortConfigIpConfigArgs();

    /**
     * Except for out-of_band interface (vme/em0/fxp0)
     * 
     */
    @Import(name="dns")
    private @Nullable Output<List<String>> dns;

    /**
     * @return Except for out-of_band interface (vme/em0/fxp0)
     * 
     */
    public Optional<Output<List<String>>> dns() {
        return Optional.ofNullable(this.dns);
    }

    /**
     * Except for out-of_band interface (vme/em0/fxp0)
     * 
     */
    @Import(name="dnsSuffixes")
    private @Nullable Output<List<String>> dnsSuffixes;

    /**
     * @return Except for out-of_band interface (vme/em0/fxp0)
     * 
     */
    public Optional<Output<List<String>>> dnsSuffixes() {
        return Optional.ofNullable(this.dnsSuffixes);
    }

    /**
     * Except for out-of_band interface (vme/em0/fxp0). Interface Default Gateway IP Address (i.e. &#34;192.168.1.1&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    @Import(name="gateway")
    private @Nullable Output<String> gateway;

    /**
     * @return Except for out-of_band interface (vme/em0/fxp0). Interface Default Gateway IP Address (i.e. &#34;192.168.1.1&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    public Optional<Output<String>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    /**
     * Interface IP Address (i.e. &#34;192.168.1.8&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    @Import(name="ip")
    private @Nullable Output<String> ip;

    /**
     * @return Interface IP Address (i.e. &#34;192.168.1.8&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    public Optional<Output<String>> ip() {
        return Optional.ofNullable(this.ip);
    }

    /**
     * Used only if `subnet` is not specified in `networks`. Interface Netmask (i.e. &#34;/24&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    @Import(name="netmask")
    private @Nullable Output<String> netmask;

    /**
     * @return Used only if `subnet` is not specified in `networks`. Interface Netmask (i.e. &#34;/24&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
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
     * If `type`==`pppoe`
     * 
     */
    @Import(name="poserPassword")
    private @Nullable Output<String> poserPassword;

    /**
     * @return If `type`==`pppoe`
     * 
     */
    public Optional<Output<String>> poserPassword() {
        return Optional.ofNullable(this.poserPassword);
    }

    /**
     * if `type`==`pppoe`. enum: `chap`, `none`, `pap`
     * 
     */
    @Import(name="pppoeAuth")
    private @Nullable Output<String> pppoeAuth;

    /**
     * @return if `type`==`pppoe`. enum: `chap`, `none`, `pap`
     * 
     */
    public Optional<Output<String>> pppoeAuth() {
        return Optional.ofNullable(this.pppoeAuth);
    }

    /**
     * If `type`==`pppoe`
     * 
     */
    @Import(name="pppoeUsername")
    private @Nullable Output<String> pppoeUsername;

    /**
     * @return If `type`==`pppoe`
     * 
     */
    public Optional<Output<String>> pppoeUsername() {
        return Optional.ofNullable(this.pppoeUsername);
    }

    /**
     * enum: `dhcp`, `pppoe`, `static`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return enum: `dhcp`, `pppoe`, `static`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private DeviceprofileGatewayPortConfigIpConfigArgs() {}

    private DeviceprofileGatewayPortConfigIpConfigArgs(DeviceprofileGatewayPortConfigIpConfigArgs $) {
        this.dns = $.dns;
        this.dnsSuffixes = $.dnsSuffixes;
        this.gateway = $.gateway;
        this.ip = $.ip;
        this.netmask = $.netmask;
        this.network = $.network;
        this.poserPassword = $.poserPassword;
        this.pppoeAuth = $.pppoeAuth;
        this.pppoeUsername = $.pppoeUsername;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileGatewayPortConfigIpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileGatewayPortConfigIpConfigArgs $;

        public Builder() {
            $ = new DeviceprofileGatewayPortConfigIpConfigArgs();
        }

        public Builder(DeviceprofileGatewayPortConfigIpConfigArgs defaults) {
            $ = new DeviceprofileGatewayPortConfigIpConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dns Except for out-of_band interface (vme/em0/fxp0)
         * 
         * @return builder
         * 
         */
        public Builder dns(@Nullable Output<List<String>> dns) {
            $.dns = dns;
            return this;
        }

        /**
         * @param dns Except for out-of_band interface (vme/em0/fxp0)
         * 
         * @return builder
         * 
         */
        public Builder dns(List<String> dns) {
            return dns(Output.of(dns));
        }

        /**
         * @param dns Except for out-of_band interface (vme/em0/fxp0)
         * 
         * @return builder
         * 
         */
        public Builder dns(String... dns) {
            return dns(List.of(dns));
        }

        /**
         * @param dnsSuffixes Except for out-of_band interface (vme/em0/fxp0)
         * 
         * @return builder
         * 
         */
        public Builder dnsSuffixes(@Nullable Output<List<String>> dnsSuffixes) {
            $.dnsSuffixes = dnsSuffixes;
            return this;
        }

        /**
         * @param dnsSuffixes Except for out-of_band interface (vme/em0/fxp0)
         * 
         * @return builder
         * 
         */
        public Builder dnsSuffixes(List<String> dnsSuffixes) {
            return dnsSuffixes(Output.of(dnsSuffixes));
        }

        /**
         * @param dnsSuffixes Except for out-of_band interface (vme/em0/fxp0)
         * 
         * @return builder
         * 
         */
        public Builder dnsSuffixes(String... dnsSuffixes) {
            return dnsSuffixes(List.of(dnsSuffixes));
        }

        /**
         * @param gateway Except for out-of_band interface (vme/em0/fxp0). Interface Default Gateway IP Address (i.e. &#34;192.168.1.1&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
         * 
         * @return builder
         * 
         */
        public Builder gateway(@Nullable Output<String> gateway) {
            $.gateway = gateway;
            return this;
        }

        /**
         * @param gateway Except for out-of_band interface (vme/em0/fxp0). Interface Default Gateway IP Address (i.e. &#34;192.168.1.1&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
         * 
         * @return builder
         * 
         */
        public Builder gateway(String gateway) {
            return gateway(Output.of(gateway));
        }

        /**
         * @param ip Interface IP Address (i.e. &#34;192.168.1.8&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
         * 
         * @return builder
         * 
         */
        public Builder ip(@Nullable Output<String> ip) {
            $.ip = ip;
            return this;
        }

        /**
         * @param ip Interface IP Address (i.e. &#34;192.168.1.8&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
         * 
         * @return builder
         * 
         */
        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        /**
         * @param netmask Used only if `subnet` is not specified in `networks`. Interface Netmask (i.e. &#34;/24&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
         * 
         * @return builder
         * 
         */
        public Builder netmask(@Nullable Output<String> netmask) {
            $.netmask = netmask;
            return this;
        }

        /**
         * @param netmask Used only if `subnet` is not specified in `networks`. Interface Netmask (i.e. &#34;/24&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
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
         * @param poserPassword If `type`==`pppoe`
         * 
         * @return builder
         * 
         */
        public Builder poserPassword(@Nullable Output<String> poserPassword) {
            $.poserPassword = poserPassword;
            return this;
        }

        /**
         * @param poserPassword If `type`==`pppoe`
         * 
         * @return builder
         * 
         */
        public Builder poserPassword(String poserPassword) {
            return poserPassword(Output.of(poserPassword));
        }

        /**
         * @param pppoeAuth if `type`==`pppoe`. enum: `chap`, `none`, `pap`
         * 
         * @return builder
         * 
         */
        public Builder pppoeAuth(@Nullable Output<String> pppoeAuth) {
            $.pppoeAuth = pppoeAuth;
            return this;
        }

        /**
         * @param pppoeAuth if `type`==`pppoe`. enum: `chap`, `none`, `pap`
         * 
         * @return builder
         * 
         */
        public Builder pppoeAuth(String pppoeAuth) {
            return pppoeAuth(Output.of(pppoeAuth));
        }

        /**
         * @param pppoeUsername If `type`==`pppoe`
         * 
         * @return builder
         * 
         */
        public Builder pppoeUsername(@Nullable Output<String> pppoeUsername) {
            $.pppoeUsername = pppoeUsername;
            return this;
        }

        /**
         * @param pppoeUsername If `type`==`pppoe`
         * 
         * @return builder
         * 
         */
        public Builder pppoeUsername(String pppoeUsername) {
            return pppoeUsername(Output.of(pppoeUsername));
        }

        /**
         * @param type enum: `dhcp`, `pppoe`, `static`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type enum: `dhcp`, `pppoe`, `static`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DeviceprofileGatewayPortConfigIpConfigArgs build() {
            return $;
        }
    }

}
