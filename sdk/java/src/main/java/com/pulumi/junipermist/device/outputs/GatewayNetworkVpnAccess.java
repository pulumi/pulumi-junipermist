// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.device.outputs.GatewayNetworkVpnAccessDestinationNat;
import com.pulumi.junipermist.device.outputs.GatewayNetworkVpnAccessSourceNat;
import com.pulumi.junipermist.device.outputs.GatewayNetworkVpnAccessStaticNat;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayNetworkVpnAccess {
    /**
     * @return if `routed`==`true`, whether to advertise an aggregated subnet toward HUB this is useful when there are multiple networks on SPOKE&#39;s side
     * 
     */
    private @Nullable String advertisedSubnet;
    /**
     * @return whether to allow ping from vpn into this routed network
     * 
     */
    private @Nullable Boolean allowPing;
    /**
     * @return Property key may be an IP/Port (i.e. &#34;63.16.0.3:443&#34;), or a port (i.e. &#34;:2222&#34;)
     * 
     */
    private @Nullable Map<String,GatewayNetworkVpnAccessDestinationNat> destinationNat;
    /**
     * @return if `routed`==`false` (usually at Spoke), but some hosts needs to be reachable from Hub, a subnet is required to create and advertise the route to Hub
     * 
     */
    private @Nullable String natPool;
    /**
     * @return toward LAN-side BGP peers
     * 
     */
    private @Nullable Boolean noReadvertiseToLanBgp;
    /**
     * @return toward LAN-side OSPF peers
     * 
     */
    private @Nullable Boolean noReadvertiseToLanOspf;
    /**
     * @return toward overlay
     * how HUB should deal with routes it received from Spokes
     * 
     */
    private @Nullable Boolean noReadvertiseToOverlay;
    /**
     * @return by default, the routes are only readvertised toward the same vrf on spoke
     * to allow it to be leaked to other vrfs
     * 
     */
    private @Nullable List<String> otherVrfs;
    /**
     * @return whether this network is routable
     * 
     */
    private @Nullable Boolean routed;
    /**
     * @return if `routed`==`false` (usually at Spoke), but some hosts needs to be reachable from Hub
     * 
     */
    private @Nullable GatewayNetworkVpnAccessSourceNat sourceNat;
    /**
     * @return Property key may be an IP Address (i.e. &#34;172.16.0.1&#34;), and IP Address and Port (i.e. &#34;172.16.0.1:8443&#34;) or a CIDR (i.e. &#34;172.16.0.12/20&#34;)
     * 
     */
    private @Nullable Map<String,GatewayNetworkVpnAccessStaticNat> staticNat;
    /**
     * @return toward overlay
     * how HUB should deal with routes it received from Spokes
     * 
     */
    private @Nullable String summarizedSubnet;
    /**
     * @return toward LAN-side BGP peers
     * 
     */
    private @Nullable String summarizedSubnetToLanBgp;
    /**
     * @return toward LAN-side OSPF peers
     * 
     */
    private @Nullable String summarizedSubnetToLanOspf;

    private GatewayNetworkVpnAccess() {}
    /**
     * @return if `routed`==`true`, whether to advertise an aggregated subnet toward HUB this is useful when there are multiple networks on SPOKE&#39;s side
     * 
     */
    public Optional<String> advertisedSubnet() {
        return Optional.ofNullable(this.advertisedSubnet);
    }
    /**
     * @return whether to allow ping from vpn into this routed network
     * 
     */
    public Optional<Boolean> allowPing() {
        return Optional.ofNullable(this.allowPing);
    }
    /**
     * @return Property key may be an IP/Port (i.e. &#34;63.16.0.3:443&#34;), or a port (i.e. &#34;:2222&#34;)
     * 
     */
    public Map<String,GatewayNetworkVpnAccessDestinationNat> destinationNat() {
        return this.destinationNat == null ? Map.of() : this.destinationNat;
    }
    /**
     * @return if `routed`==`false` (usually at Spoke), but some hosts needs to be reachable from Hub, a subnet is required to create and advertise the route to Hub
     * 
     */
    public Optional<String> natPool() {
        return Optional.ofNullable(this.natPool);
    }
    /**
     * @return toward LAN-side BGP peers
     * 
     */
    public Optional<Boolean> noReadvertiseToLanBgp() {
        return Optional.ofNullable(this.noReadvertiseToLanBgp);
    }
    /**
     * @return toward LAN-side OSPF peers
     * 
     */
    public Optional<Boolean> noReadvertiseToLanOspf() {
        return Optional.ofNullable(this.noReadvertiseToLanOspf);
    }
    /**
     * @return toward overlay
     * how HUB should deal with routes it received from Spokes
     * 
     */
    public Optional<Boolean> noReadvertiseToOverlay() {
        return Optional.ofNullable(this.noReadvertiseToOverlay);
    }
    /**
     * @return by default, the routes are only readvertised toward the same vrf on spoke
     * to allow it to be leaked to other vrfs
     * 
     */
    public List<String> otherVrfs() {
        return this.otherVrfs == null ? List.of() : this.otherVrfs;
    }
    /**
     * @return whether this network is routable
     * 
     */
    public Optional<Boolean> routed() {
        return Optional.ofNullable(this.routed);
    }
    /**
     * @return if `routed`==`false` (usually at Spoke), but some hosts needs to be reachable from Hub
     * 
     */
    public Optional<GatewayNetworkVpnAccessSourceNat> sourceNat() {
        return Optional.ofNullable(this.sourceNat);
    }
    /**
     * @return Property key may be an IP Address (i.e. &#34;172.16.0.1&#34;), and IP Address and Port (i.e. &#34;172.16.0.1:8443&#34;) or a CIDR (i.e. &#34;172.16.0.12/20&#34;)
     * 
     */
    public Map<String,GatewayNetworkVpnAccessStaticNat> staticNat() {
        return this.staticNat == null ? Map.of() : this.staticNat;
    }
    /**
     * @return toward overlay
     * how HUB should deal with routes it received from Spokes
     * 
     */
    public Optional<String> summarizedSubnet() {
        return Optional.ofNullable(this.summarizedSubnet);
    }
    /**
     * @return toward LAN-side BGP peers
     * 
     */
    public Optional<String> summarizedSubnetToLanBgp() {
        return Optional.ofNullable(this.summarizedSubnetToLanBgp);
    }
    /**
     * @return toward LAN-side OSPF peers
     * 
     */
    public Optional<String> summarizedSubnetToLanOspf() {
        return Optional.ofNullable(this.summarizedSubnetToLanOspf);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayNetworkVpnAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String advertisedSubnet;
        private @Nullable Boolean allowPing;
        private @Nullable Map<String,GatewayNetworkVpnAccessDestinationNat> destinationNat;
        private @Nullable String natPool;
        private @Nullable Boolean noReadvertiseToLanBgp;
        private @Nullable Boolean noReadvertiseToLanOspf;
        private @Nullable Boolean noReadvertiseToOverlay;
        private @Nullable List<String> otherVrfs;
        private @Nullable Boolean routed;
        private @Nullable GatewayNetworkVpnAccessSourceNat sourceNat;
        private @Nullable Map<String,GatewayNetworkVpnAccessStaticNat> staticNat;
        private @Nullable String summarizedSubnet;
        private @Nullable String summarizedSubnetToLanBgp;
        private @Nullable String summarizedSubnetToLanOspf;
        public Builder() {}
        public Builder(GatewayNetworkVpnAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advertisedSubnet = defaults.advertisedSubnet;
    	      this.allowPing = defaults.allowPing;
    	      this.destinationNat = defaults.destinationNat;
    	      this.natPool = defaults.natPool;
    	      this.noReadvertiseToLanBgp = defaults.noReadvertiseToLanBgp;
    	      this.noReadvertiseToLanOspf = defaults.noReadvertiseToLanOspf;
    	      this.noReadvertiseToOverlay = defaults.noReadvertiseToOverlay;
    	      this.otherVrfs = defaults.otherVrfs;
    	      this.routed = defaults.routed;
    	      this.sourceNat = defaults.sourceNat;
    	      this.staticNat = defaults.staticNat;
    	      this.summarizedSubnet = defaults.summarizedSubnet;
    	      this.summarizedSubnetToLanBgp = defaults.summarizedSubnetToLanBgp;
    	      this.summarizedSubnetToLanOspf = defaults.summarizedSubnetToLanOspf;
        }

        @CustomType.Setter
        public Builder advertisedSubnet(@Nullable String advertisedSubnet) {

            this.advertisedSubnet = advertisedSubnet;
            return this;
        }
        @CustomType.Setter
        public Builder allowPing(@Nullable Boolean allowPing) {

            this.allowPing = allowPing;
            return this;
        }
        @CustomType.Setter
        public Builder destinationNat(@Nullable Map<String,GatewayNetworkVpnAccessDestinationNat> destinationNat) {

            this.destinationNat = destinationNat;
            return this;
        }
        @CustomType.Setter
        public Builder natPool(@Nullable String natPool) {

            this.natPool = natPool;
            return this;
        }
        @CustomType.Setter
        public Builder noReadvertiseToLanBgp(@Nullable Boolean noReadvertiseToLanBgp) {

            this.noReadvertiseToLanBgp = noReadvertiseToLanBgp;
            return this;
        }
        @CustomType.Setter
        public Builder noReadvertiseToLanOspf(@Nullable Boolean noReadvertiseToLanOspf) {

            this.noReadvertiseToLanOspf = noReadvertiseToLanOspf;
            return this;
        }
        @CustomType.Setter
        public Builder noReadvertiseToOverlay(@Nullable Boolean noReadvertiseToOverlay) {

            this.noReadvertiseToOverlay = noReadvertiseToOverlay;
            return this;
        }
        @CustomType.Setter
        public Builder otherVrfs(@Nullable List<String> otherVrfs) {

            this.otherVrfs = otherVrfs;
            return this;
        }
        public Builder otherVrfs(String... otherVrfs) {
            return otherVrfs(List.of(otherVrfs));
        }
        @CustomType.Setter
        public Builder routed(@Nullable Boolean routed) {

            this.routed = routed;
            return this;
        }
        @CustomType.Setter
        public Builder sourceNat(@Nullable GatewayNetworkVpnAccessSourceNat sourceNat) {

            this.sourceNat = sourceNat;
            return this;
        }
        @CustomType.Setter
        public Builder staticNat(@Nullable Map<String,GatewayNetworkVpnAccessStaticNat> staticNat) {

            this.staticNat = staticNat;
            return this;
        }
        @CustomType.Setter
        public Builder summarizedSubnet(@Nullable String summarizedSubnet) {

            this.summarizedSubnet = summarizedSubnet;
            return this;
        }
        @CustomType.Setter
        public Builder summarizedSubnetToLanBgp(@Nullable String summarizedSubnetToLanBgp) {

            this.summarizedSubnetToLanBgp = summarizedSubnetToLanBgp;
            return this;
        }
        @CustomType.Setter
        public Builder summarizedSubnetToLanOspf(@Nullable String summarizedSubnetToLanOspf) {

            this.summarizedSubnetToLanOspf = summarizedSubnetToLanOspf;
            return this;
        }
        public GatewayNetworkVpnAccess build() {
            final var _resultValue = new GatewayNetworkVpnAccess();
            _resultValue.advertisedSubnet = advertisedSubnet;
            _resultValue.allowPing = allowPing;
            _resultValue.destinationNat = destinationNat;
            _resultValue.natPool = natPool;
            _resultValue.noReadvertiseToLanBgp = noReadvertiseToLanBgp;
            _resultValue.noReadvertiseToLanOspf = noReadvertiseToLanOspf;
            _resultValue.noReadvertiseToOverlay = noReadvertiseToOverlay;
            _resultValue.otherVrfs = otherVrfs;
            _resultValue.routed = routed;
            _resultValue.sourceNat = sourceNat;
            _resultValue.staticNat = staticNat;
            _resultValue.summarizedSubnet = summarizedSubnet;
            _resultValue.summarizedSubnetToLanBgp = summarizedSubnetToLanBgp;
            _resultValue.summarizedSubnetToLanOspf = summarizedSubnetToLanOspf;
            return _resultValue;
        }
    }
}