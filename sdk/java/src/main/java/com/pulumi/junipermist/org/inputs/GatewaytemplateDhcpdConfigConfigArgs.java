// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.GatewaytemplateDhcpdConfigConfigFixedBindingsArgs;
import com.pulumi.junipermist.org.inputs.GatewaytemplateDhcpdConfigConfigOptionsArgs;
import com.pulumi.junipermist.org.inputs.GatewaytemplateDhcpdConfigConfigVendorEncapsulatedArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewaytemplateDhcpdConfigConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewaytemplateDhcpdConfigConfigArgs Empty = new GatewaytemplateDhcpdConfigConfigArgs();

    /**
     * If `type`==`local` or `type6`==`local` - optional, if not defined, system one will be used
     * 
     */
    @Import(name="dnsServers")
    private @Nullable Output<List<String>> dnsServers;

    /**
     * @return If `type`==`local` or `type6`==`local` - optional, if not defined, system one will be used
     * 
     */
    public Optional<Output<List<String>>> dnsServers() {
        return Optional.ofNullable(this.dnsServers);
    }

    /**
     * If `type`==`local` or `type6`==`local` - optional, if not defined, system one will be used
     * 
     * @deprecated
     * Configuring `dns_suffix` is deprecated and will not be supported in the future, please configure Code 15 or Code 119 in Server `options` instead
     * 
     */
    @Deprecated /* Configuring `dns_suffix` is deprecated and will not be supported in the future, please configure Code 15 or Code 119 in Server `options` instead */
    @Import(name="dnsSuffixes")
    private @Nullable Output<List<String>> dnsSuffixes;

    /**
     * @return If `type`==`local` or `type6`==`local` - optional, if not defined, system one will be used
     * 
     * @deprecated
     * Configuring `dns_suffix` is deprecated and will not be supported in the future, please configure Code 15 or Code 119 in Server `options` instead
     * 
     */
    @Deprecated /* Configuring `dns_suffix` is deprecated and will not be supported in the future, please configure Code 15 or Code 119 in Server `options` instead */
    public Optional<Output<List<String>>> dnsSuffixes() {
        return Optional.ofNullable(this.dnsSuffixes);
    }

    /**
     * If `type`==`local` or `type6`==`local`. Property key is the MAC Address. Format is `[0-9a-f]{12}` (e.g. &#34;5684dae9ac8b&#34;)
     * 
     */
    @Import(name="fixedBindings")
    private @Nullable Output<Map<String,GatewaytemplateDhcpdConfigConfigFixedBindingsArgs>> fixedBindings;

    /**
     * @return If `type`==`local` or `type6`==`local`. Property key is the MAC Address. Format is `[0-9a-f]{12}` (e.g. &#34;5684dae9ac8b&#34;)
     * 
     */
    public Optional<Output<Map<String,GatewaytemplateDhcpdConfigConfigFixedBindingsArgs>>> fixedBindings() {
        return Optional.ofNullable(this.fixedBindings);
    }

    /**
     * If `type`==`local` - optional, `ip` will be used if not provided
     * 
     */
    @Import(name="gateway")
    private @Nullable Output<String> gateway;

    /**
     * @return If `type`==`local` - optional, `ip` will be used if not provided
     * 
     */
    public Optional<Output<String>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    /**
     * If `type`==`local`
     * 
     */
    @Import(name="ipEnd")
    private @Nullable Output<String> ipEnd;

    /**
     * @return If `type`==`local`
     * 
     */
    public Optional<Output<String>> ipEnd() {
        return Optional.ofNullable(this.ipEnd);
    }

    /**
     * If `type6`==`local`
     * 
     */
    @Import(name="ipEnd6")
    private @Nullable Output<String> ipEnd6;

    /**
     * @return If `type6`==`local`
     * 
     */
    public Optional<Output<String>> ipEnd6() {
        return Optional.ofNullable(this.ipEnd6);
    }

    /**
     * If `type`==`local`
     * 
     */
    @Import(name="ipStart")
    private @Nullable Output<String> ipStart;

    /**
     * @return If `type`==`local`
     * 
     */
    public Optional<Output<String>> ipStart() {
        return Optional.ofNullable(this.ipStart);
    }

    /**
     * If `type6`==`local`
     * 
     */
    @Import(name="ipStart6")
    private @Nullable Output<String> ipStart6;

    /**
     * @return If `type6`==`local`
     * 
     */
    public Optional<Output<String>> ipStart6() {
        return Optional.ofNullable(this.ipStart6);
    }

    /**
     * In seconds, lease time has to be between 3600 [1hr] - 604800 [1 week], default is 86400 [1 day]
     * 
     */
    @Import(name="leaseTime")
    private @Nullable Output<Integer> leaseTime;

    /**
     * @return In seconds, lease time has to be between 3600 [1hr] - 604800 [1 week], default is 86400 [1 day]
     * 
     */
    public Optional<Output<Integer>> leaseTime() {
        return Optional.ofNullable(this.leaseTime);
    }

    /**
     * If `type`==`local` or `type6`==`local`. Property key is the DHCP option number
     * 
     */
    @Import(name="options")
    private @Nullable Output<Map<String,GatewaytemplateDhcpdConfigConfigOptionsArgs>> options;

    /**
     * @return If `type`==`local` or `type6`==`local`. Property key is the DHCP option number
     * 
     */
    public Optional<Output<Map<String,GatewaytemplateDhcpdConfigConfigOptionsArgs>>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * `server_id_override`==`true` means the device, when acts as DHCP relay and forwards DHCP responses from DHCP server to clients,
     * should overwrite the Sever Identifier option (i.e. DHCP option 54) in DHCP responses with its own IP address.
     * 
     */
    @Import(name="serverIdOverride")
    private @Nullable Output<Boolean> serverIdOverride;

    /**
     * @return `server_id_override`==`true` means the device, when acts as DHCP relay and forwards DHCP responses from DHCP server to clients,
     * should overwrite the Sever Identifier option (i.e. DHCP option 54) in DHCP responses with its own IP address.
     * 
     */
    public Optional<Output<Boolean>> serverIdOverride() {
        return Optional.ofNullable(this.serverIdOverride);
    }

    /**
     * If `type`==`relay`
     * 
     */
    @Import(name="servers")
    private @Nullable Output<List<String>> servers;

    /**
     * @return If `type`==`relay`
     * 
     */
    public Optional<Output<List<String>>> servers() {
        return Optional.ofNullable(this.servers);
    }

    /**
     * If `type6`==`relay`
     * 
     */
    @Import(name="servers6s")
    private @Nullable Output<List<String>> servers6s;

    /**
     * @return If `type6`==`relay`
     * 
     */
    public Optional<Output<List<String>>> servers6s() {
        return Optional.ofNullable(this.servers6s);
    }

    /**
     * enum: `local` (DHCP Server), `none`, `relay` (DHCP Relay)
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return enum: `local` (DHCP Server), `none`, `relay` (DHCP Relay)
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * enum: `local` (DHCP Server), `none`, `relay` (DHCP Relay)
     * 
     */
    @Import(name="type6")
    private @Nullable Output<String> type6;

    /**
     * @return enum: `local` (DHCP Server), `none`, `relay` (DHCP Relay)
     * 
     */
    public Optional<Output<String>> type6() {
        return Optional.ofNullable(this.type6);
    }

    /**
     * If `type`==`local` or `type6`==`local`. Property key is &lt;enterprise number&gt;:&lt;sub option code&gt;, with
     *   * enterprise number: 1-65535 (https://www.iana.org/assignments/enterprise-numbers/enterprise-numbers)
     *   * sub option code: 1-255, sub-option code
     * 
     */
    @Import(name="vendorEncapsulated")
    private @Nullable Output<Map<String,GatewaytemplateDhcpdConfigConfigVendorEncapsulatedArgs>> vendorEncapsulated;

    /**
     * @return If `type`==`local` or `type6`==`local`. Property key is &lt;enterprise number&gt;:&lt;sub option code&gt;, with
     *   * enterprise number: 1-65535 (https://www.iana.org/assignments/enterprise-numbers/enterprise-numbers)
     *   * sub option code: 1-255, sub-option code
     * 
     */
    public Optional<Output<Map<String,GatewaytemplateDhcpdConfigConfigVendorEncapsulatedArgs>>> vendorEncapsulated() {
        return Optional.ofNullable(this.vendorEncapsulated);
    }

    private GatewaytemplateDhcpdConfigConfigArgs() {}

    private GatewaytemplateDhcpdConfigConfigArgs(GatewaytemplateDhcpdConfigConfigArgs $) {
        this.dnsServers = $.dnsServers;
        this.dnsSuffixes = $.dnsSuffixes;
        this.fixedBindings = $.fixedBindings;
        this.gateway = $.gateway;
        this.ipEnd = $.ipEnd;
        this.ipEnd6 = $.ipEnd6;
        this.ipStart = $.ipStart;
        this.ipStart6 = $.ipStart6;
        this.leaseTime = $.leaseTime;
        this.options = $.options;
        this.serverIdOverride = $.serverIdOverride;
        this.servers = $.servers;
        this.servers6s = $.servers6s;
        this.type = $.type;
        this.type6 = $.type6;
        this.vendorEncapsulated = $.vendorEncapsulated;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewaytemplateDhcpdConfigConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewaytemplateDhcpdConfigConfigArgs $;

        public Builder() {
            $ = new GatewaytemplateDhcpdConfigConfigArgs();
        }

        public Builder(GatewaytemplateDhcpdConfigConfigArgs defaults) {
            $ = new GatewaytemplateDhcpdConfigConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dnsServers If `type`==`local` or `type6`==`local` - optional, if not defined, system one will be used
         * 
         * @return builder
         * 
         */
        public Builder dnsServers(@Nullable Output<List<String>> dnsServers) {
            $.dnsServers = dnsServers;
            return this;
        }

        /**
         * @param dnsServers If `type`==`local` or `type6`==`local` - optional, if not defined, system one will be used
         * 
         * @return builder
         * 
         */
        public Builder dnsServers(List<String> dnsServers) {
            return dnsServers(Output.of(dnsServers));
        }

        /**
         * @param dnsServers If `type`==`local` or `type6`==`local` - optional, if not defined, system one will be used
         * 
         * @return builder
         * 
         */
        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }

        /**
         * @param dnsSuffixes If `type`==`local` or `type6`==`local` - optional, if not defined, system one will be used
         * 
         * @return builder
         * 
         * @deprecated
         * Configuring `dns_suffix` is deprecated and will not be supported in the future, please configure Code 15 or Code 119 in Server `options` instead
         * 
         */
        @Deprecated /* Configuring `dns_suffix` is deprecated and will not be supported in the future, please configure Code 15 or Code 119 in Server `options` instead */
        public Builder dnsSuffixes(@Nullable Output<List<String>> dnsSuffixes) {
            $.dnsSuffixes = dnsSuffixes;
            return this;
        }

        /**
         * @param dnsSuffixes If `type`==`local` or `type6`==`local` - optional, if not defined, system one will be used
         * 
         * @return builder
         * 
         * @deprecated
         * Configuring `dns_suffix` is deprecated and will not be supported in the future, please configure Code 15 or Code 119 in Server `options` instead
         * 
         */
        @Deprecated /* Configuring `dns_suffix` is deprecated and will not be supported in the future, please configure Code 15 or Code 119 in Server `options` instead */
        public Builder dnsSuffixes(List<String> dnsSuffixes) {
            return dnsSuffixes(Output.of(dnsSuffixes));
        }

        /**
         * @param dnsSuffixes If `type`==`local` or `type6`==`local` - optional, if not defined, system one will be used
         * 
         * @return builder
         * 
         * @deprecated
         * Configuring `dns_suffix` is deprecated and will not be supported in the future, please configure Code 15 or Code 119 in Server `options` instead
         * 
         */
        @Deprecated /* Configuring `dns_suffix` is deprecated and will not be supported in the future, please configure Code 15 or Code 119 in Server `options` instead */
        public Builder dnsSuffixes(String... dnsSuffixes) {
            return dnsSuffixes(List.of(dnsSuffixes));
        }

        /**
         * @param fixedBindings If `type`==`local` or `type6`==`local`. Property key is the MAC Address. Format is `[0-9a-f]{12}` (e.g. &#34;5684dae9ac8b&#34;)
         * 
         * @return builder
         * 
         */
        public Builder fixedBindings(@Nullable Output<Map<String,GatewaytemplateDhcpdConfigConfigFixedBindingsArgs>> fixedBindings) {
            $.fixedBindings = fixedBindings;
            return this;
        }

        /**
         * @param fixedBindings If `type`==`local` or `type6`==`local`. Property key is the MAC Address. Format is `[0-9a-f]{12}` (e.g. &#34;5684dae9ac8b&#34;)
         * 
         * @return builder
         * 
         */
        public Builder fixedBindings(Map<String,GatewaytemplateDhcpdConfigConfigFixedBindingsArgs> fixedBindings) {
            return fixedBindings(Output.of(fixedBindings));
        }

        /**
         * @param gateway If `type`==`local` - optional, `ip` will be used if not provided
         * 
         * @return builder
         * 
         */
        public Builder gateway(@Nullable Output<String> gateway) {
            $.gateway = gateway;
            return this;
        }

        /**
         * @param gateway If `type`==`local` - optional, `ip` will be used if not provided
         * 
         * @return builder
         * 
         */
        public Builder gateway(String gateway) {
            return gateway(Output.of(gateway));
        }

        /**
         * @param ipEnd If `type`==`local`
         * 
         * @return builder
         * 
         */
        public Builder ipEnd(@Nullable Output<String> ipEnd) {
            $.ipEnd = ipEnd;
            return this;
        }

        /**
         * @param ipEnd If `type`==`local`
         * 
         * @return builder
         * 
         */
        public Builder ipEnd(String ipEnd) {
            return ipEnd(Output.of(ipEnd));
        }

        /**
         * @param ipEnd6 If `type6`==`local`
         * 
         * @return builder
         * 
         */
        public Builder ipEnd6(@Nullable Output<String> ipEnd6) {
            $.ipEnd6 = ipEnd6;
            return this;
        }

        /**
         * @param ipEnd6 If `type6`==`local`
         * 
         * @return builder
         * 
         */
        public Builder ipEnd6(String ipEnd6) {
            return ipEnd6(Output.of(ipEnd6));
        }

        /**
         * @param ipStart If `type`==`local`
         * 
         * @return builder
         * 
         */
        public Builder ipStart(@Nullable Output<String> ipStart) {
            $.ipStart = ipStart;
            return this;
        }

        /**
         * @param ipStart If `type`==`local`
         * 
         * @return builder
         * 
         */
        public Builder ipStart(String ipStart) {
            return ipStart(Output.of(ipStart));
        }

        /**
         * @param ipStart6 If `type6`==`local`
         * 
         * @return builder
         * 
         */
        public Builder ipStart6(@Nullable Output<String> ipStart6) {
            $.ipStart6 = ipStart6;
            return this;
        }

        /**
         * @param ipStart6 If `type6`==`local`
         * 
         * @return builder
         * 
         */
        public Builder ipStart6(String ipStart6) {
            return ipStart6(Output.of(ipStart6));
        }

        /**
         * @param leaseTime In seconds, lease time has to be between 3600 [1hr] - 604800 [1 week], default is 86400 [1 day]
         * 
         * @return builder
         * 
         */
        public Builder leaseTime(@Nullable Output<Integer> leaseTime) {
            $.leaseTime = leaseTime;
            return this;
        }

        /**
         * @param leaseTime In seconds, lease time has to be between 3600 [1hr] - 604800 [1 week], default is 86400 [1 day]
         * 
         * @return builder
         * 
         */
        public Builder leaseTime(Integer leaseTime) {
            return leaseTime(Output.of(leaseTime));
        }

        /**
         * @param options If `type`==`local` or `type6`==`local`. Property key is the DHCP option number
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<Map<String,GatewaytemplateDhcpdConfigConfigOptionsArgs>> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options If `type`==`local` or `type6`==`local`. Property key is the DHCP option number
         * 
         * @return builder
         * 
         */
        public Builder options(Map<String,GatewaytemplateDhcpdConfigConfigOptionsArgs> options) {
            return options(Output.of(options));
        }

        /**
         * @param serverIdOverride `server_id_override`==`true` means the device, when acts as DHCP relay and forwards DHCP responses from DHCP server to clients,
         * should overwrite the Sever Identifier option (i.e. DHCP option 54) in DHCP responses with its own IP address.
         * 
         * @return builder
         * 
         */
        public Builder serverIdOverride(@Nullable Output<Boolean> serverIdOverride) {
            $.serverIdOverride = serverIdOverride;
            return this;
        }

        /**
         * @param serverIdOverride `server_id_override`==`true` means the device, when acts as DHCP relay and forwards DHCP responses from DHCP server to clients,
         * should overwrite the Sever Identifier option (i.e. DHCP option 54) in DHCP responses with its own IP address.
         * 
         * @return builder
         * 
         */
        public Builder serverIdOverride(Boolean serverIdOverride) {
            return serverIdOverride(Output.of(serverIdOverride));
        }

        /**
         * @param servers If `type`==`relay`
         * 
         * @return builder
         * 
         */
        public Builder servers(@Nullable Output<List<String>> servers) {
            $.servers = servers;
            return this;
        }

        /**
         * @param servers If `type`==`relay`
         * 
         * @return builder
         * 
         */
        public Builder servers(List<String> servers) {
            return servers(Output.of(servers));
        }

        /**
         * @param servers If `type`==`relay`
         * 
         * @return builder
         * 
         */
        public Builder servers(String... servers) {
            return servers(List.of(servers));
        }

        /**
         * @param servers6s If `type6`==`relay`
         * 
         * @return builder
         * 
         */
        public Builder servers6s(@Nullable Output<List<String>> servers6s) {
            $.servers6s = servers6s;
            return this;
        }

        /**
         * @param servers6s If `type6`==`relay`
         * 
         * @return builder
         * 
         */
        public Builder servers6s(List<String> servers6s) {
            return servers6s(Output.of(servers6s));
        }

        /**
         * @param servers6s If `type6`==`relay`
         * 
         * @return builder
         * 
         */
        public Builder servers6s(String... servers6s) {
            return servers6s(List.of(servers6s));
        }

        /**
         * @param type enum: `local` (DHCP Server), `none`, `relay` (DHCP Relay)
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type enum: `local` (DHCP Server), `none`, `relay` (DHCP Relay)
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param type6 enum: `local` (DHCP Server), `none`, `relay` (DHCP Relay)
         * 
         * @return builder
         * 
         */
        public Builder type6(@Nullable Output<String> type6) {
            $.type6 = type6;
            return this;
        }

        /**
         * @param type6 enum: `local` (DHCP Server), `none`, `relay` (DHCP Relay)
         * 
         * @return builder
         * 
         */
        public Builder type6(String type6) {
            return type6(Output.of(type6));
        }

        /**
         * @param vendorEncapsulated If `type`==`local` or `type6`==`local`. Property key is &lt;enterprise number&gt;:&lt;sub option code&gt;, with
         *   * enterprise number: 1-65535 (https://www.iana.org/assignments/enterprise-numbers/enterprise-numbers)
         *   * sub option code: 1-255, sub-option code
         * 
         * @return builder
         * 
         */
        public Builder vendorEncapsulated(@Nullable Output<Map<String,GatewaytemplateDhcpdConfigConfigVendorEncapsulatedArgs>> vendorEncapsulated) {
            $.vendorEncapsulated = vendorEncapsulated;
            return this;
        }

        /**
         * @param vendorEncapsulated If `type`==`local` or `type6`==`local`. Property key is &lt;enterprise number&gt;:&lt;sub option code&gt;, with
         *   * enterprise number: 1-65535 (https://www.iana.org/assignments/enterprise-numbers/enterprise-numbers)
         *   * sub option code: 1-255, sub-option code
         * 
         * @return builder
         * 
         */
        public Builder vendorEncapsulated(Map<String,GatewaytemplateDhcpdConfigConfigVendorEncapsulatedArgs> vendorEncapsulated) {
            return vendorEncapsulated(Output.of(vendorEncapsulated));
        }

        public GatewaytemplateDhcpdConfigConfigArgs build() {
            return $;
        }
    }

}
