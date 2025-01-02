// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.device.outputs.GatewayNetworkInternalAccess;
import com.pulumi.junipermist.device.outputs.GatewayNetworkInternetAccess;
import com.pulumi.junipermist.device.outputs.GatewayNetworkMulticast;
import com.pulumi.junipermist.device.outputs.GatewayNetworkTenants;
import com.pulumi.junipermist.device.outputs.GatewayNetworkVpnAccess;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayNetwork {
    /**
     * @return whether to disallow Mist Devices in the network
     * 
     */
    private @Nullable Boolean disallowMistServices;
    private @Nullable String gateway;
    private @Nullable String gateway6;
    private @Nullable GatewayNetworkInternalAccess internalAccess;
    /**
     * @return whether this network has direct internet access
     * 
     */
    private @Nullable GatewayNetworkInternetAccess internetAccess;
    /**
     * @return whether to allow clients in the network to talk to each other
     * 
     */
    private @Nullable Boolean isolation;
    /**
     * @return whether to enable multicast support (only PIM-sparse mode is supported)
     * 
     */
    private @Nullable GatewayNetworkMulticast multicast;
    private String name;
    /**
     * @return for a Network (usually LAN), it can be routable to other networks (e.g. OSPF)
     * 
     */
    private @Nullable List<String> routedForNetworks;
    private String subnet;
    private @Nullable String subnet6;
    /**
     * @return Property key must be the user/tenant name (i.e. &#34;printer-1&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    private @Nullable Map<String,GatewayNetworkTenants> tenants;
    private @Nullable String vlanId;
    /**
     * @return Property key is the VPN name. Whether this network can be accessed from vpn
     * 
     */
    private @Nullable Map<String,GatewayNetworkVpnAccess> vpnAccess;

    private GatewayNetwork() {}
    /**
     * @return whether to disallow Mist Devices in the network
     * 
     */
    public Optional<Boolean> disallowMistServices() {
        return Optional.ofNullable(this.disallowMistServices);
    }
    public Optional<String> gateway() {
        return Optional.ofNullable(this.gateway);
    }
    public Optional<String> gateway6() {
        return Optional.ofNullable(this.gateway6);
    }
    public Optional<GatewayNetworkInternalAccess> internalAccess() {
        return Optional.ofNullable(this.internalAccess);
    }
    /**
     * @return whether this network has direct internet access
     * 
     */
    public Optional<GatewayNetworkInternetAccess> internetAccess() {
        return Optional.ofNullable(this.internetAccess);
    }
    /**
     * @return whether to allow clients in the network to talk to each other
     * 
     */
    public Optional<Boolean> isolation() {
        return Optional.ofNullable(this.isolation);
    }
    /**
     * @return whether to enable multicast support (only PIM-sparse mode is supported)
     * 
     */
    public Optional<GatewayNetworkMulticast> multicast() {
        return Optional.ofNullable(this.multicast);
    }
    public String name() {
        return this.name;
    }
    /**
     * @return for a Network (usually LAN), it can be routable to other networks (e.g. OSPF)
     * 
     */
    public List<String> routedForNetworks() {
        return this.routedForNetworks == null ? List.of() : this.routedForNetworks;
    }
    public String subnet() {
        return this.subnet;
    }
    public Optional<String> subnet6() {
        return Optional.ofNullable(this.subnet6);
    }
    /**
     * @return Property key must be the user/tenant name (i.e. &#34;printer-1&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    public Map<String,GatewayNetworkTenants> tenants() {
        return this.tenants == null ? Map.of() : this.tenants;
    }
    public Optional<String> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }
    /**
     * @return Property key is the VPN name. Whether this network can be accessed from vpn
     * 
     */
    public Map<String,GatewayNetworkVpnAccess> vpnAccess() {
        return this.vpnAccess == null ? Map.of() : this.vpnAccess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean disallowMistServices;
        private @Nullable String gateway;
        private @Nullable String gateway6;
        private @Nullable GatewayNetworkInternalAccess internalAccess;
        private @Nullable GatewayNetworkInternetAccess internetAccess;
        private @Nullable Boolean isolation;
        private @Nullable GatewayNetworkMulticast multicast;
        private String name;
        private @Nullable List<String> routedForNetworks;
        private String subnet;
        private @Nullable String subnet6;
        private @Nullable Map<String,GatewayNetworkTenants> tenants;
        private @Nullable String vlanId;
        private @Nullable Map<String,GatewayNetworkVpnAccess> vpnAccess;
        public Builder() {}
        public Builder(GatewayNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disallowMistServices = defaults.disallowMistServices;
    	      this.gateway = defaults.gateway;
    	      this.gateway6 = defaults.gateway6;
    	      this.internalAccess = defaults.internalAccess;
    	      this.internetAccess = defaults.internetAccess;
    	      this.isolation = defaults.isolation;
    	      this.multicast = defaults.multicast;
    	      this.name = defaults.name;
    	      this.routedForNetworks = defaults.routedForNetworks;
    	      this.subnet = defaults.subnet;
    	      this.subnet6 = defaults.subnet6;
    	      this.tenants = defaults.tenants;
    	      this.vlanId = defaults.vlanId;
    	      this.vpnAccess = defaults.vpnAccess;
        }

        @CustomType.Setter
        public Builder disallowMistServices(@Nullable Boolean disallowMistServices) {

            this.disallowMistServices = disallowMistServices;
            return this;
        }
        @CustomType.Setter
        public Builder gateway(@Nullable String gateway) {

            this.gateway = gateway;
            return this;
        }
        @CustomType.Setter
        public Builder gateway6(@Nullable String gateway6) {

            this.gateway6 = gateway6;
            return this;
        }
        @CustomType.Setter
        public Builder internalAccess(@Nullable GatewayNetworkInternalAccess internalAccess) {

            this.internalAccess = internalAccess;
            return this;
        }
        @CustomType.Setter
        public Builder internetAccess(@Nullable GatewayNetworkInternetAccess internetAccess) {

            this.internetAccess = internetAccess;
            return this;
        }
        @CustomType.Setter
        public Builder isolation(@Nullable Boolean isolation) {

            this.isolation = isolation;
            return this;
        }
        @CustomType.Setter
        public Builder multicast(@Nullable GatewayNetworkMulticast multicast) {

            this.multicast = multicast;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GatewayNetwork", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder routedForNetworks(@Nullable List<String> routedForNetworks) {

            this.routedForNetworks = routedForNetworks;
            return this;
        }
        public Builder routedForNetworks(String... routedForNetworks) {
            return routedForNetworks(List.of(routedForNetworks));
        }
        @CustomType.Setter
        public Builder subnet(String subnet) {
            if (subnet == null) {
              throw new MissingRequiredPropertyException("GatewayNetwork", "subnet");
            }
            this.subnet = subnet;
            return this;
        }
        @CustomType.Setter
        public Builder subnet6(@Nullable String subnet6) {

            this.subnet6 = subnet6;
            return this;
        }
        @CustomType.Setter
        public Builder tenants(@Nullable Map<String,GatewayNetworkTenants> tenants) {

            this.tenants = tenants;
            return this;
        }
        @CustomType.Setter
        public Builder vlanId(@Nullable String vlanId) {

            this.vlanId = vlanId;
            return this;
        }
        @CustomType.Setter
        public Builder vpnAccess(@Nullable Map<String,GatewayNetworkVpnAccess> vpnAccess) {

            this.vpnAccess = vpnAccess;
            return this;
        }
        public GatewayNetwork build() {
            final var _resultValue = new GatewayNetwork();
            _resultValue.disallowMistServices = disallowMistServices;
            _resultValue.gateway = gateway;
            _resultValue.gateway6 = gateway6;
            _resultValue.internalAccess = internalAccess;
            _resultValue.internetAccess = internetAccess;
            _resultValue.isolation = isolation;
            _resultValue.multicast = multicast;
            _resultValue.name = name;
            _resultValue.routedForNetworks = routedForNetworks;
            _resultValue.subnet = subnet;
            _resultValue.subnet6 = subnet6;
            _resultValue.tenants = tenants;
            _resultValue.vlanId = vlanId;
            _resultValue.vpnAccess = vpnAccess;
            return _resultValue;
        }
    }
}
