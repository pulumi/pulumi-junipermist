// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.DeviceprofileGatewayNetworkVpnAccessDestinationNatArgs;
import com.pulumi.junipermist.org.inputs.DeviceprofileGatewayNetworkVpnAccessSourceNatArgs;
import com.pulumi.junipermist.org.inputs.DeviceprofileGatewayNetworkVpnAccessStaticNatArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileGatewayNetworkVpnAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileGatewayNetworkVpnAccessArgs Empty = new DeviceprofileGatewayNetworkVpnAccessArgs();

    /**
     * if `routed`==`true`, whether to advertise an aggregated subnet toward HUB this is useful when there are multiple networks on SPOKE&#39;s side
     * 
     */
    @Import(name="advertisedSubnet")
    private @Nullable Output<String> advertisedSubnet;

    /**
     * @return if `routed`==`true`, whether to advertise an aggregated subnet toward HUB this is useful when there are multiple networks on SPOKE&#39;s side
     * 
     */
    public Optional<Output<String>> advertisedSubnet() {
        return Optional.ofNullable(this.advertisedSubnet);
    }

    /**
     * whether to allow ping from vpn into this routed network
     * 
     */
    @Import(name="allowPing")
    private @Nullable Output<Boolean> allowPing;

    /**
     * @return whether to allow ping from vpn into this routed network
     * 
     */
    public Optional<Output<Boolean>> allowPing() {
        return Optional.ofNullable(this.allowPing);
    }

    /**
     * Property key may be an IP/Port (i.e. &#34;63.16.0.3:443&#34;), or a port (i.e. &#34;:2222&#34;)
     * 
     */
    @Import(name="destinationNat")
    private @Nullable Output<Map<String,DeviceprofileGatewayNetworkVpnAccessDestinationNatArgs>> destinationNat;

    /**
     * @return Property key may be an IP/Port (i.e. &#34;63.16.0.3:443&#34;), or a port (i.e. &#34;:2222&#34;)
     * 
     */
    public Optional<Output<Map<String,DeviceprofileGatewayNetworkVpnAccessDestinationNatArgs>>> destinationNat() {
        return Optional.ofNullable(this.destinationNat);
    }

    /**
     * if `routed`==`false` (usually at Spoke), but some hosts needs to be reachable from Hub, a subnet is required to create and advertise the route to Hub
     * 
     */
    @Import(name="natPool")
    private @Nullable Output<String> natPool;

    /**
     * @return if `routed`==`false` (usually at Spoke), but some hosts needs to be reachable from Hub, a subnet is required to create and advertise the route to Hub
     * 
     */
    public Optional<Output<String>> natPool() {
        return Optional.ofNullable(this.natPool);
    }

    /**
     * toward LAN-side BGP peers
     * 
     */
    @Import(name="noReadvertiseToLanBgp")
    private @Nullable Output<Boolean> noReadvertiseToLanBgp;

    /**
     * @return toward LAN-side BGP peers
     * 
     */
    public Optional<Output<Boolean>> noReadvertiseToLanBgp() {
        return Optional.ofNullable(this.noReadvertiseToLanBgp);
    }

    /**
     * toward LAN-side OSPF peers
     * 
     */
    @Import(name="noReadvertiseToLanOspf")
    private @Nullable Output<Boolean> noReadvertiseToLanOspf;

    /**
     * @return toward LAN-side OSPF peers
     * 
     */
    public Optional<Output<Boolean>> noReadvertiseToLanOspf() {
        return Optional.ofNullable(this.noReadvertiseToLanOspf);
    }

    /**
     * toward overlay
     * how HUB should deal with routes it received from Spokes
     * 
     */
    @Import(name="noReadvertiseToOverlay")
    private @Nullable Output<Boolean> noReadvertiseToOverlay;

    /**
     * @return toward overlay
     * how HUB should deal with routes it received from Spokes
     * 
     */
    public Optional<Output<Boolean>> noReadvertiseToOverlay() {
        return Optional.ofNullable(this.noReadvertiseToOverlay);
    }

    /**
     * by default, the routes are only readvertised toward the same vrf on spoke
     * to allow it to be leaked to other vrfs
     * 
     */
    @Import(name="otherVrfs")
    private @Nullable Output<List<String>> otherVrfs;

    /**
     * @return by default, the routes are only readvertised toward the same vrf on spoke
     * to allow it to be leaked to other vrfs
     * 
     */
    public Optional<Output<List<String>>> otherVrfs() {
        return Optional.ofNullable(this.otherVrfs);
    }

    /**
     * whether this network is routable
     * 
     */
    @Import(name="routed")
    private @Nullable Output<Boolean> routed;

    /**
     * @return whether this network is routable
     * 
     */
    public Optional<Output<Boolean>> routed() {
        return Optional.ofNullable(this.routed);
    }

    /**
     * if `routed`==`false` (usually at Spoke), but some hosts needs to be reachable from Hub
     * 
     */
    @Import(name="sourceNat")
    private @Nullable Output<DeviceprofileGatewayNetworkVpnAccessSourceNatArgs> sourceNat;

    /**
     * @return if `routed`==`false` (usually at Spoke), but some hosts needs to be reachable from Hub
     * 
     */
    public Optional<Output<DeviceprofileGatewayNetworkVpnAccessSourceNatArgs>> sourceNat() {
        return Optional.ofNullable(this.sourceNat);
    }

    /**
     * Property key may be an IP Address (i.e. &#34;172.16.0.1&#34;), and IP Address and Port (i.e. &#34;172.16.0.1:8443&#34;) or a CIDR (i.e. &#34;172.16.0.12/20&#34;)
     * 
     */
    @Import(name="staticNat")
    private @Nullable Output<Map<String,DeviceprofileGatewayNetworkVpnAccessStaticNatArgs>> staticNat;

    /**
     * @return Property key may be an IP Address (i.e. &#34;172.16.0.1&#34;), and IP Address and Port (i.e. &#34;172.16.0.1:8443&#34;) or a CIDR (i.e. &#34;172.16.0.12/20&#34;)
     * 
     */
    public Optional<Output<Map<String,DeviceprofileGatewayNetworkVpnAccessStaticNatArgs>>> staticNat() {
        return Optional.ofNullable(this.staticNat);
    }

    /**
     * toward overlay
     * how HUB should deal with routes it received from Spokes
     * 
     */
    @Import(name="summarizedSubnet")
    private @Nullable Output<String> summarizedSubnet;

    /**
     * @return toward overlay
     * how HUB should deal with routes it received from Spokes
     * 
     */
    public Optional<Output<String>> summarizedSubnet() {
        return Optional.ofNullable(this.summarizedSubnet);
    }

    /**
     * toward LAN-side BGP peers
     * 
     */
    @Import(name="summarizedSubnetToLanBgp")
    private @Nullable Output<String> summarizedSubnetToLanBgp;

    /**
     * @return toward LAN-side BGP peers
     * 
     */
    public Optional<Output<String>> summarizedSubnetToLanBgp() {
        return Optional.ofNullable(this.summarizedSubnetToLanBgp);
    }

    /**
     * toward LAN-side OSPF peers
     * 
     */
    @Import(name="summarizedSubnetToLanOspf")
    private @Nullable Output<String> summarizedSubnetToLanOspf;

    /**
     * @return toward LAN-side OSPF peers
     * 
     */
    public Optional<Output<String>> summarizedSubnetToLanOspf() {
        return Optional.ofNullable(this.summarizedSubnetToLanOspf);
    }

    private DeviceprofileGatewayNetworkVpnAccessArgs() {}

    private DeviceprofileGatewayNetworkVpnAccessArgs(DeviceprofileGatewayNetworkVpnAccessArgs $) {
        this.advertisedSubnet = $.advertisedSubnet;
        this.allowPing = $.allowPing;
        this.destinationNat = $.destinationNat;
        this.natPool = $.natPool;
        this.noReadvertiseToLanBgp = $.noReadvertiseToLanBgp;
        this.noReadvertiseToLanOspf = $.noReadvertiseToLanOspf;
        this.noReadvertiseToOverlay = $.noReadvertiseToOverlay;
        this.otherVrfs = $.otherVrfs;
        this.routed = $.routed;
        this.sourceNat = $.sourceNat;
        this.staticNat = $.staticNat;
        this.summarizedSubnet = $.summarizedSubnet;
        this.summarizedSubnetToLanBgp = $.summarizedSubnetToLanBgp;
        this.summarizedSubnetToLanOspf = $.summarizedSubnetToLanOspf;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileGatewayNetworkVpnAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileGatewayNetworkVpnAccessArgs $;

        public Builder() {
            $ = new DeviceprofileGatewayNetworkVpnAccessArgs();
        }

        public Builder(DeviceprofileGatewayNetworkVpnAccessArgs defaults) {
            $ = new DeviceprofileGatewayNetworkVpnAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param advertisedSubnet if `routed`==`true`, whether to advertise an aggregated subnet toward HUB this is useful when there are multiple networks on SPOKE&#39;s side
         * 
         * @return builder
         * 
         */
        public Builder advertisedSubnet(@Nullable Output<String> advertisedSubnet) {
            $.advertisedSubnet = advertisedSubnet;
            return this;
        }

        /**
         * @param advertisedSubnet if `routed`==`true`, whether to advertise an aggregated subnet toward HUB this is useful when there are multiple networks on SPOKE&#39;s side
         * 
         * @return builder
         * 
         */
        public Builder advertisedSubnet(String advertisedSubnet) {
            return advertisedSubnet(Output.of(advertisedSubnet));
        }

        /**
         * @param allowPing whether to allow ping from vpn into this routed network
         * 
         * @return builder
         * 
         */
        public Builder allowPing(@Nullable Output<Boolean> allowPing) {
            $.allowPing = allowPing;
            return this;
        }

        /**
         * @param allowPing whether to allow ping from vpn into this routed network
         * 
         * @return builder
         * 
         */
        public Builder allowPing(Boolean allowPing) {
            return allowPing(Output.of(allowPing));
        }

        /**
         * @param destinationNat Property key may be an IP/Port (i.e. &#34;63.16.0.3:443&#34;), or a port (i.e. &#34;:2222&#34;)
         * 
         * @return builder
         * 
         */
        public Builder destinationNat(@Nullable Output<Map<String,DeviceprofileGatewayNetworkVpnAccessDestinationNatArgs>> destinationNat) {
            $.destinationNat = destinationNat;
            return this;
        }

        /**
         * @param destinationNat Property key may be an IP/Port (i.e. &#34;63.16.0.3:443&#34;), or a port (i.e. &#34;:2222&#34;)
         * 
         * @return builder
         * 
         */
        public Builder destinationNat(Map<String,DeviceprofileGatewayNetworkVpnAccessDestinationNatArgs> destinationNat) {
            return destinationNat(Output.of(destinationNat));
        }

        /**
         * @param natPool if `routed`==`false` (usually at Spoke), but some hosts needs to be reachable from Hub, a subnet is required to create and advertise the route to Hub
         * 
         * @return builder
         * 
         */
        public Builder natPool(@Nullable Output<String> natPool) {
            $.natPool = natPool;
            return this;
        }

        /**
         * @param natPool if `routed`==`false` (usually at Spoke), but some hosts needs to be reachable from Hub, a subnet is required to create and advertise the route to Hub
         * 
         * @return builder
         * 
         */
        public Builder natPool(String natPool) {
            return natPool(Output.of(natPool));
        }

        /**
         * @param noReadvertiseToLanBgp toward LAN-side BGP peers
         * 
         * @return builder
         * 
         */
        public Builder noReadvertiseToLanBgp(@Nullable Output<Boolean> noReadvertiseToLanBgp) {
            $.noReadvertiseToLanBgp = noReadvertiseToLanBgp;
            return this;
        }

        /**
         * @param noReadvertiseToLanBgp toward LAN-side BGP peers
         * 
         * @return builder
         * 
         */
        public Builder noReadvertiseToLanBgp(Boolean noReadvertiseToLanBgp) {
            return noReadvertiseToLanBgp(Output.of(noReadvertiseToLanBgp));
        }

        /**
         * @param noReadvertiseToLanOspf toward LAN-side OSPF peers
         * 
         * @return builder
         * 
         */
        public Builder noReadvertiseToLanOspf(@Nullable Output<Boolean> noReadvertiseToLanOspf) {
            $.noReadvertiseToLanOspf = noReadvertiseToLanOspf;
            return this;
        }

        /**
         * @param noReadvertiseToLanOspf toward LAN-side OSPF peers
         * 
         * @return builder
         * 
         */
        public Builder noReadvertiseToLanOspf(Boolean noReadvertiseToLanOspf) {
            return noReadvertiseToLanOspf(Output.of(noReadvertiseToLanOspf));
        }

        /**
         * @param noReadvertiseToOverlay toward overlay
         * how HUB should deal with routes it received from Spokes
         * 
         * @return builder
         * 
         */
        public Builder noReadvertiseToOverlay(@Nullable Output<Boolean> noReadvertiseToOverlay) {
            $.noReadvertiseToOverlay = noReadvertiseToOverlay;
            return this;
        }

        /**
         * @param noReadvertiseToOverlay toward overlay
         * how HUB should deal with routes it received from Spokes
         * 
         * @return builder
         * 
         */
        public Builder noReadvertiseToOverlay(Boolean noReadvertiseToOverlay) {
            return noReadvertiseToOverlay(Output.of(noReadvertiseToOverlay));
        }

        /**
         * @param otherVrfs by default, the routes are only readvertised toward the same vrf on spoke
         * to allow it to be leaked to other vrfs
         * 
         * @return builder
         * 
         */
        public Builder otherVrfs(@Nullable Output<List<String>> otherVrfs) {
            $.otherVrfs = otherVrfs;
            return this;
        }

        /**
         * @param otherVrfs by default, the routes are only readvertised toward the same vrf on spoke
         * to allow it to be leaked to other vrfs
         * 
         * @return builder
         * 
         */
        public Builder otherVrfs(List<String> otherVrfs) {
            return otherVrfs(Output.of(otherVrfs));
        }

        /**
         * @param otherVrfs by default, the routes are only readvertised toward the same vrf on spoke
         * to allow it to be leaked to other vrfs
         * 
         * @return builder
         * 
         */
        public Builder otherVrfs(String... otherVrfs) {
            return otherVrfs(List.of(otherVrfs));
        }

        /**
         * @param routed whether this network is routable
         * 
         * @return builder
         * 
         */
        public Builder routed(@Nullable Output<Boolean> routed) {
            $.routed = routed;
            return this;
        }

        /**
         * @param routed whether this network is routable
         * 
         * @return builder
         * 
         */
        public Builder routed(Boolean routed) {
            return routed(Output.of(routed));
        }

        /**
         * @param sourceNat if `routed`==`false` (usually at Spoke), but some hosts needs to be reachable from Hub
         * 
         * @return builder
         * 
         */
        public Builder sourceNat(@Nullable Output<DeviceprofileGatewayNetworkVpnAccessSourceNatArgs> sourceNat) {
            $.sourceNat = sourceNat;
            return this;
        }

        /**
         * @param sourceNat if `routed`==`false` (usually at Spoke), but some hosts needs to be reachable from Hub
         * 
         * @return builder
         * 
         */
        public Builder sourceNat(DeviceprofileGatewayNetworkVpnAccessSourceNatArgs sourceNat) {
            return sourceNat(Output.of(sourceNat));
        }

        /**
         * @param staticNat Property key may be an IP Address (i.e. &#34;172.16.0.1&#34;), and IP Address and Port (i.e. &#34;172.16.0.1:8443&#34;) or a CIDR (i.e. &#34;172.16.0.12/20&#34;)
         * 
         * @return builder
         * 
         */
        public Builder staticNat(@Nullable Output<Map<String,DeviceprofileGatewayNetworkVpnAccessStaticNatArgs>> staticNat) {
            $.staticNat = staticNat;
            return this;
        }

        /**
         * @param staticNat Property key may be an IP Address (i.e. &#34;172.16.0.1&#34;), and IP Address and Port (i.e. &#34;172.16.0.1:8443&#34;) or a CIDR (i.e. &#34;172.16.0.12/20&#34;)
         * 
         * @return builder
         * 
         */
        public Builder staticNat(Map<String,DeviceprofileGatewayNetworkVpnAccessStaticNatArgs> staticNat) {
            return staticNat(Output.of(staticNat));
        }

        /**
         * @param summarizedSubnet toward overlay
         * how HUB should deal with routes it received from Spokes
         * 
         * @return builder
         * 
         */
        public Builder summarizedSubnet(@Nullable Output<String> summarizedSubnet) {
            $.summarizedSubnet = summarizedSubnet;
            return this;
        }

        /**
         * @param summarizedSubnet toward overlay
         * how HUB should deal with routes it received from Spokes
         * 
         * @return builder
         * 
         */
        public Builder summarizedSubnet(String summarizedSubnet) {
            return summarizedSubnet(Output.of(summarizedSubnet));
        }

        /**
         * @param summarizedSubnetToLanBgp toward LAN-side BGP peers
         * 
         * @return builder
         * 
         */
        public Builder summarizedSubnetToLanBgp(@Nullable Output<String> summarizedSubnetToLanBgp) {
            $.summarizedSubnetToLanBgp = summarizedSubnetToLanBgp;
            return this;
        }

        /**
         * @param summarizedSubnetToLanBgp toward LAN-side BGP peers
         * 
         * @return builder
         * 
         */
        public Builder summarizedSubnetToLanBgp(String summarizedSubnetToLanBgp) {
            return summarizedSubnetToLanBgp(Output.of(summarizedSubnetToLanBgp));
        }

        /**
         * @param summarizedSubnetToLanOspf toward LAN-side OSPF peers
         * 
         * @return builder
         * 
         */
        public Builder summarizedSubnetToLanOspf(@Nullable Output<String> summarizedSubnetToLanOspf) {
            $.summarizedSubnetToLanOspf = summarizedSubnetToLanOspf;
            return this;
        }

        /**
         * @param summarizedSubnetToLanOspf toward LAN-side OSPF peers
         * 
         * @return builder
         * 
         */
        public Builder summarizedSubnetToLanOspf(String summarizedSubnetToLanOspf) {
            return summarizedSubnetToLanOspf(Output.of(summarizedSubnetToLanOspf));
        }

        public DeviceprofileGatewayNetworkVpnAccessArgs build() {
            return $;
        }
    }

}