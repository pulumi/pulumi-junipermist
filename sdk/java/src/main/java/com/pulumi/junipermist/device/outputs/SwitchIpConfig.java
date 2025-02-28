// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchIpConfig {
    /**
     * @return Required when `type`==`static`
     * 
     */
    private @Nullable List<String> dns;
    private @Nullable List<String> dnsSuffixes;
    private @Nullable String gateway;
    private @Nullable String ip;
    /**
     * @return Used only if `subnet` is not specified in `networks`
     * 
     */
    private @Nullable String netmask;
    /**
     * @return Network where this mgmt IP reside, this will be used as default network for outbound-ssh, dns, ntp, dns, tacplus, radius, syslog, snmp
     * 
     */
    private @Nullable String network;
    /**
     * @return enum: `dhcp`, `static`
     * 
     */
    private @Nullable String type;

    private SwitchIpConfig() {}
    /**
     * @return Required when `type`==`static`
     * 
     */
    public List<String> dns() {
        return this.dns == null ? List.of() : this.dns;
    }
    public List<String> dnsSuffixes() {
        return this.dnsSuffixes == null ? List.of() : this.dnsSuffixes;
    }
    public Optional<String> gateway() {
        return Optional.ofNullable(this.gateway);
    }
    public Optional<String> ip() {
        return Optional.ofNullable(this.ip);
    }
    /**
     * @return Used only if `subnet` is not specified in `networks`
     * 
     */
    public Optional<String> netmask() {
        return Optional.ofNullable(this.netmask);
    }
    /**
     * @return Network where this mgmt IP reside, this will be used as default network for outbound-ssh, dns, ntp, dns, tacplus, radius, syslog, snmp
     * 
     */
    public Optional<String> network() {
        return Optional.ofNullable(this.network);
    }
    /**
     * @return enum: `dhcp`, `static`
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchIpConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> dns;
        private @Nullable List<String> dnsSuffixes;
        private @Nullable String gateway;
        private @Nullable String ip;
        private @Nullable String netmask;
        private @Nullable String network;
        private @Nullable String type;
        public Builder() {}
        public Builder(SwitchIpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dns = defaults.dns;
    	      this.dnsSuffixes = defaults.dnsSuffixes;
    	      this.gateway = defaults.gateway;
    	      this.ip = defaults.ip;
    	      this.netmask = defaults.netmask;
    	      this.network = defaults.network;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder dns(@Nullable List<String> dns) {

            this.dns = dns;
            return this;
        }
        public Builder dns(String... dns) {
            return dns(List.of(dns));
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
        public Builder gateway(@Nullable String gateway) {

            this.gateway = gateway;
            return this;
        }
        @CustomType.Setter
        public Builder ip(@Nullable String ip) {

            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder netmask(@Nullable String netmask) {

            this.netmask = netmask;
            return this;
        }
        @CustomType.Setter
        public Builder network(@Nullable String network) {

            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public SwitchIpConfig build() {
            final var _resultValue = new SwitchIpConfig();
            _resultValue.dns = dns;
            _resultValue.dnsSuffixes = dnsSuffixes;
            _resultValue.gateway = gateway;
            _resultValue.ip = ip;
            _resultValue.netmask = netmask;
            _resultValue.network = network;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
