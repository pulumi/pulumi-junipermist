// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.device.outputs.SwitchDhcpdConfigConfigFixedBindings;
import com.pulumi.junipermist.device.outputs.SwitchDhcpdConfigConfigOptions;
import com.pulumi.junipermist.device.outputs.SwitchDhcpdConfigConfigVendorEncapulated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchDhcpdConfigConfig {
    /**
     * @return if `type`==`local` - optional, if not defined, system one will be used
     * 
     */
    private @Nullable List<String> dnsServers;
    /**
     * @return if `type`==`local` - optional, if not defined, system one will be used
     * 
     */
    private @Nullable List<String> dnsSuffixes;
    /**
     * @return Property key is the MAC Address. Format is `[0-9a-f]{12}` (e.g &#34;5684dae9ac8b&#34;)
     * 
     */
    private @Nullable Map<String,SwitchDhcpdConfigConfigFixedBindings> fixedBindings;
    /**
     * @return if `type`==`local` - optional, `ip` will be used if not provided
     * 
     */
    private @Nullable String gateway;
    /**
     * @return if `type`==`local`
     * 
     */
    private @Nullable String ipEnd;
    /**
     * @return if `type6`==`local`
     * 
     */
    private @Nullable String ipEnd6;
    /**
     * @return if `type`==`local`
     * 
     */
    private @Nullable String ipStart;
    /**
     * @return if `type6`==`local`
     * 
     */
    private @Nullable String ipStart6;
    /**
     * @return in seconds, lease time has to be between 3600 [1hr] - 604800 [1 week], default is 86400 [1 day]
     * 
     */
    private @Nullable Integer leaseTime;
    /**
     * @return Property key is the DHCP option number
     * 
     */
    private @Nullable Map<String,SwitchDhcpdConfigConfigOptions> options;
    /**
     * @return `server_id_override`==`true` means the device, when acts as DHCP relay and forwards DHCP responses from DHCP server to clients,
     * should overwrite the Sever Identifier option (i.e. DHCP option 54) in DHCP responses with its own IP address.
     * 
     */
    private @Nullable Boolean serverIdOverride;
    /**
     * @return if `type`==`relay`
     * 
     */
    private @Nullable List<String> servers;
    /**
     * @return if `type6`==`relay`
     * 
     */
    private @Nullable List<String> servers6s;
    /**
     * @return enum: `none`, `relay` (DHCP Relay), `server` (DHCP Server)
     * 
     */
    private @Nullable String type;
    /**
     * @return enum: `none`, `relay` (DHCP Relay), `server` (DHCP Server)
     * 
     */
    private @Nullable String type6;
    /**
     * @return Property key is &lt;enterprise number&gt;:&lt;sub option code&gt;, with
     *   * enterprise number: 1-65535 (https://www.iana.org/assignments/enterprise-numbers/enterprise-numbers)
     *   * sub option code: 1-255, sub-option code&#39;
     * 
     */
    private @Nullable Map<String,SwitchDhcpdConfigConfigVendorEncapulated> vendorEncapulated;

    private SwitchDhcpdConfigConfig() {}
    /**
     * @return if `type`==`local` - optional, if not defined, system one will be used
     * 
     */
    public List<String> dnsServers() {
        return this.dnsServers == null ? List.of() : this.dnsServers;
    }
    /**
     * @return if `type`==`local` - optional, if not defined, system one will be used
     * 
     */
    public List<String> dnsSuffixes() {
        return this.dnsSuffixes == null ? List.of() : this.dnsSuffixes;
    }
    /**
     * @return Property key is the MAC Address. Format is `[0-9a-f]{12}` (e.g &#34;5684dae9ac8b&#34;)
     * 
     */
    public Map<String,SwitchDhcpdConfigConfigFixedBindings> fixedBindings() {
        return this.fixedBindings == null ? Map.of() : this.fixedBindings;
    }
    /**
     * @return if `type`==`local` - optional, `ip` will be used if not provided
     * 
     */
    public Optional<String> gateway() {
        return Optional.ofNullable(this.gateway);
    }
    /**
     * @return if `type`==`local`
     * 
     */
    public Optional<String> ipEnd() {
        return Optional.ofNullable(this.ipEnd);
    }
    /**
     * @return if `type6`==`local`
     * 
     */
    public Optional<String> ipEnd6() {
        return Optional.ofNullable(this.ipEnd6);
    }
    /**
     * @return if `type`==`local`
     * 
     */
    public Optional<String> ipStart() {
        return Optional.ofNullable(this.ipStart);
    }
    /**
     * @return if `type6`==`local`
     * 
     */
    public Optional<String> ipStart6() {
        return Optional.ofNullable(this.ipStart6);
    }
    /**
     * @return in seconds, lease time has to be between 3600 [1hr] - 604800 [1 week], default is 86400 [1 day]
     * 
     */
    public Optional<Integer> leaseTime() {
        return Optional.ofNullable(this.leaseTime);
    }
    /**
     * @return Property key is the DHCP option number
     * 
     */
    public Map<String,SwitchDhcpdConfigConfigOptions> options() {
        return this.options == null ? Map.of() : this.options;
    }
    /**
     * @return `server_id_override`==`true` means the device, when acts as DHCP relay and forwards DHCP responses from DHCP server to clients,
     * should overwrite the Sever Identifier option (i.e. DHCP option 54) in DHCP responses with its own IP address.
     * 
     */
    public Optional<Boolean> serverIdOverride() {
        return Optional.ofNullable(this.serverIdOverride);
    }
    /**
     * @return if `type`==`relay`
     * 
     */
    public List<String> servers() {
        return this.servers == null ? List.of() : this.servers;
    }
    /**
     * @return if `type6`==`relay`
     * 
     */
    public List<String> servers6s() {
        return this.servers6s == null ? List.of() : this.servers6s;
    }
    /**
     * @return enum: `none`, `relay` (DHCP Relay), `server` (DHCP Server)
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return enum: `none`, `relay` (DHCP Relay), `server` (DHCP Server)
     * 
     */
    public Optional<String> type6() {
        return Optional.ofNullable(this.type6);
    }
    /**
     * @return Property key is &lt;enterprise number&gt;:&lt;sub option code&gt;, with
     *   * enterprise number: 1-65535 (https://www.iana.org/assignments/enterprise-numbers/enterprise-numbers)
     *   * sub option code: 1-255, sub-option code&#39;
     * 
     */
    public Map<String,SwitchDhcpdConfigConfigVendorEncapulated> vendorEncapulated() {
        return this.vendorEncapulated == null ? Map.of() : this.vendorEncapulated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchDhcpdConfigConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> dnsServers;
        private @Nullable List<String> dnsSuffixes;
        private @Nullable Map<String,SwitchDhcpdConfigConfigFixedBindings> fixedBindings;
        private @Nullable String gateway;
        private @Nullable String ipEnd;
        private @Nullable String ipEnd6;
        private @Nullable String ipStart;
        private @Nullable String ipStart6;
        private @Nullable Integer leaseTime;
        private @Nullable Map<String,SwitchDhcpdConfigConfigOptions> options;
        private @Nullable Boolean serverIdOverride;
        private @Nullable List<String> servers;
        private @Nullable List<String> servers6s;
        private @Nullable String type;
        private @Nullable String type6;
        private @Nullable Map<String,SwitchDhcpdConfigConfigVendorEncapulated> vendorEncapulated;
        public Builder() {}
        public Builder(SwitchDhcpdConfigConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsServers = defaults.dnsServers;
    	      this.dnsSuffixes = defaults.dnsSuffixes;
    	      this.fixedBindings = defaults.fixedBindings;
    	      this.gateway = defaults.gateway;
    	      this.ipEnd = defaults.ipEnd;
    	      this.ipEnd6 = defaults.ipEnd6;
    	      this.ipStart = defaults.ipStart;
    	      this.ipStart6 = defaults.ipStart6;
    	      this.leaseTime = defaults.leaseTime;
    	      this.options = defaults.options;
    	      this.serverIdOverride = defaults.serverIdOverride;
    	      this.servers = defaults.servers;
    	      this.servers6s = defaults.servers6s;
    	      this.type = defaults.type;
    	      this.type6 = defaults.type6;
    	      this.vendorEncapulated = defaults.vendorEncapulated;
        }

        @CustomType.Setter
        public Builder dnsServers(@Nullable List<String> dnsServers) {

            this.dnsServers = dnsServers;
            return this;
        }
        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }
        @CustomType.Setter
        public Builder dnsSuffixes(@Nullable List<String> dnsSuffixes) {

            this.dnsSuffixes = dnsSuffixes;
            return this;
        }
        public Builder dnsSuffixes(String... dnsSuffixes) {
            return dnsSuffixes(List.of(dnsSuffixes));
        }
        @CustomType.Setter
        public Builder fixedBindings(@Nullable Map<String,SwitchDhcpdConfigConfigFixedBindings> fixedBindings) {

            this.fixedBindings = fixedBindings;
            return this;
        }
        @CustomType.Setter
        public Builder gateway(@Nullable String gateway) {

            this.gateway = gateway;
            return this;
        }
        @CustomType.Setter
        public Builder ipEnd(@Nullable String ipEnd) {

            this.ipEnd = ipEnd;
            return this;
        }
        @CustomType.Setter
        public Builder ipEnd6(@Nullable String ipEnd6) {

            this.ipEnd6 = ipEnd6;
            return this;
        }
        @CustomType.Setter
        public Builder ipStart(@Nullable String ipStart) {

            this.ipStart = ipStart;
            return this;
        }
        @CustomType.Setter
        public Builder ipStart6(@Nullable String ipStart6) {

            this.ipStart6 = ipStart6;
            return this;
        }
        @CustomType.Setter
        public Builder leaseTime(@Nullable Integer leaseTime) {

            this.leaseTime = leaseTime;
            return this;
        }
        @CustomType.Setter
        public Builder options(@Nullable Map<String,SwitchDhcpdConfigConfigOptions> options) {

            this.options = options;
            return this;
        }
        @CustomType.Setter
        public Builder serverIdOverride(@Nullable Boolean serverIdOverride) {

            this.serverIdOverride = serverIdOverride;
            return this;
        }
        @CustomType.Setter
        public Builder servers(@Nullable List<String> servers) {

            this.servers = servers;
            return this;
        }
        public Builder servers(String... servers) {
            return servers(List.of(servers));
        }
        @CustomType.Setter
        public Builder servers6s(@Nullable List<String> servers6s) {

            this.servers6s = servers6s;
            return this;
        }
        public Builder servers6s(String... servers6s) {
            return servers6s(List.of(servers6s));
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder type6(@Nullable String type6) {

            this.type6 = type6;
            return this;
        }
        @CustomType.Setter
        public Builder vendorEncapulated(@Nullable Map<String,SwitchDhcpdConfigConfigVendorEncapulated> vendorEncapulated) {

            this.vendorEncapulated = vendorEncapulated;
            return this;
        }
        public SwitchDhcpdConfigConfig build() {
            final var _resultValue = new SwitchDhcpdConfigConfig();
            _resultValue.dnsServers = dnsServers;
            _resultValue.dnsSuffixes = dnsSuffixes;
            _resultValue.fixedBindings = fixedBindings;
            _resultValue.gateway = gateway;
            _resultValue.ipEnd = ipEnd;
            _resultValue.ipEnd6 = ipEnd6;
            _resultValue.ipStart = ipStart;
            _resultValue.ipStart6 = ipStart6;
            _resultValue.leaseTime = leaseTime;
            _resultValue.options = options;
            _resultValue.serverIdOverride = serverIdOverride;
            _resultValue.servers = servers;
            _resultValue.servers6s = servers6s;
            _resultValue.type = type;
            _resultValue.type6 = type6;
            _resultValue.vendorEncapulated = vendorEncapulated;
            return _resultValue;
        }
    }
}