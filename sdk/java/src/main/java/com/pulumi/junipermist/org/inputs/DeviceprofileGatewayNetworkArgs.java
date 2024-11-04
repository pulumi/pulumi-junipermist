// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.inputs.DeviceprofileGatewayNetworkInternalAccessArgs;
import com.pulumi.junipermist.org.inputs.DeviceprofileGatewayNetworkInternetAccessArgs;
import com.pulumi.junipermist.org.inputs.DeviceprofileGatewayNetworkMulticastArgs;
import com.pulumi.junipermist.org.inputs.DeviceprofileGatewayNetworkTenantsArgs;
import com.pulumi.junipermist.org.inputs.DeviceprofileGatewayNetworkVpnAccessArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileGatewayNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileGatewayNetworkArgs Empty = new DeviceprofileGatewayNetworkArgs();

    /**
     * whether to disallow Mist Devices in the network
     * 
     */
    @Import(name="disallowMistServices")
    private @Nullable Output<Boolean> disallowMistServices;

    /**
     * @return whether to disallow Mist Devices in the network
     * 
     */
    public Optional<Output<Boolean>> disallowMistServices() {
        return Optional.ofNullable(this.disallowMistServices);
    }

    @Import(name="gateway")
    private @Nullable Output<String> gateway;

    public Optional<Output<String>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    @Import(name="gateway6")
    private @Nullable Output<String> gateway6;

    public Optional<Output<String>> gateway6() {
        return Optional.ofNullable(this.gateway6);
    }

    @Import(name="internalAccess")
    private @Nullable Output<DeviceprofileGatewayNetworkInternalAccessArgs> internalAccess;

    public Optional<Output<DeviceprofileGatewayNetworkInternalAccessArgs>> internalAccess() {
        return Optional.ofNullable(this.internalAccess);
    }

    /**
     * whether this network has direct internet access
     * 
     */
    @Import(name="internetAccess")
    private @Nullable Output<DeviceprofileGatewayNetworkInternetAccessArgs> internetAccess;

    /**
     * @return whether this network has direct internet access
     * 
     */
    public Optional<Output<DeviceprofileGatewayNetworkInternetAccessArgs>> internetAccess() {
        return Optional.ofNullable(this.internetAccess);
    }

    /**
     * whether to allow clients in the network to talk to each other
     * 
     */
    @Import(name="isolation")
    private @Nullable Output<Boolean> isolation;

    /**
     * @return whether to allow clients in the network to talk to each other
     * 
     */
    public Optional<Output<Boolean>> isolation() {
        return Optional.ofNullable(this.isolation);
    }

    /**
     * whether to enable multicast support (only PIM-sparse mode is supported)
     * 
     */
    @Import(name="multicast")
    private @Nullable Output<DeviceprofileGatewayNetworkMulticastArgs> multicast;

    /**
     * @return whether to enable multicast support (only PIM-sparse mode is supported)
     * 
     */
    public Optional<Output<DeviceprofileGatewayNetworkMulticastArgs>> multicast() {
        return Optional.ofNullable(this.multicast);
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * for a Network (usually LAN), it can be routable to other networks (e.g. OSPF)
     * 
     */
    @Import(name="routedForNetworks")
    private @Nullable Output<List<String>> routedForNetworks;

    /**
     * @return for a Network (usually LAN), it can be routable to other networks (e.g. OSPF)
     * 
     */
    public Optional<Output<List<String>>> routedForNetworks() {
        return Optional.ofNullable(this.routedForNetworks);
    }

    @Import(name="subnet", required=true)
    private Output<String> subnet;

    public Output<String> subnet() {
        return this.subnet;
    }

    @Import(name="subnet6")
    private @Nullable Output<String> subnet6;

    public Optional<Output<String>> subnet6() {
        return Optional.ofNullable(this.subnet6);
    }

    @Import(name="tenants")
    private @Nullable Output<Map<String,DeviceprofileGatewayNetworkTenantsArgs>> tenants;

    public Optional<Output<Map<String,DeviceprofileGatewayNetworkTenantsArgs>>> tenants() {
        return Optional.ofNullable(this.tenants);
    }

    @Import(name="vlanId")
    private @Nullable Output<String> vlanId;

    public Optional<Output<String>> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    /**
     * Property key is the VPN name. Whether this network can be accessed from vpn
     * 
     */
    @Import(name="vpnAccess")
    private @Nullable Output<Map<String,DeviceprofileGatewayNetworkVpnAccessArgs>> vpnAccess;

    /**
     * @return Property key is the VPN name. Whether this network can be accessed from vpn
     * 
     */
    public Optional<Output<Map<String,DeviceprofileGatewayNetworkVpnAccessArgs>>> vpnAccess() {
        return Optional.ofNullable(this.vpnAccess);
    }

    private DeviceprofileGatewayNetworkArgs() {}

    private DeviceprofileGatewayNetworkArgs(DeviceprofileGatewayNetworkArgs $) {
        this.disallowMistServices = $.disallowMistServices;
        this.gateway = $.gateway;
        this.gateway6 = $.gateway6;
        this.internalAccess = $.internalAccess;
        this.internetAccess = $.internetAccess;
        this.isolation = $.isolation;
        this.multicast = $.multicast;
        this.name = $.name;
        this.routedForNetworks = $.routedForNetworks;
        this.subnet = $.subnet;
        this.subnet6 = $.subnet6;
        this.tenants = $.tenants;
        this.vlanId = $.vlanId;
        this.vpnAccess = $.vpnAccess;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileGatewayNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileGatewayNetworkArgs $;

        public Builder() {
            $ = new DeviceprofileGatewayNetworkArgs();
        }

        public Builder(DeviceprofileGatewayNetworkArgs defaults) {
            $ = new DeviceprofileGatewayNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disallowMistServices whether to disallow Mist Devices in the network
         * 
         * @return builder
         * 
         */
        public Builder disallowMistServices(@Nullable Output<Boolean> disallowMistServices) {
            $.disallowMistServices = disallowMistServices;
            return this;
        }

        /**
         * @param disallowMistServices whether to disallow Mist Devices in the network
         * 
         * @return builder
         * 
         */
        public Builder disallowMistServices(Boolean disallowMistServices) {
            return disallowMistServices(Output.of(disallowMistServices));
        }

        public Builder gateway(@Nullable Output<String> gateway) {
            $.gateway = gateway;
            return this;
        }

        public Builder gateway(String gateway) {
            return gateway(Output.of(gateway));
        }

        public Builder gateway6(@Nullable Output<String> gateway6) {
            $.gateway6 = gateway6;
            return this;
        }

        public Builder gateway6(String gateway6) {
            return gateway6(Output.of(gateway6));
        }

        public Builder internalAccess(@Nullable Output<DeviceprofileGatewayNetworkInternalAccessArgs> internalAccess) {
            $.internalAccess = internalAccess;
            return this;
        }

        public Builder internalAccess(DeviceprofileGatewayNetworkInternalAccessArgs internalAccess) {
            return internalAccess(Output.of(internalAccess));
        }

        /**
         * @param internetAccess whether this network has direct internet access
         * 
         * @return builder
         * 
         */
        public Builder internetAccess(@Nullable Output<DeviceprofileGatewayNetworkInternetAccessArgs> internetAccess) {
            $.internetAccess = internetAccess;
            return this;
        }

        /**
         * @param internetAccess whether this network has direct internet access
         * 
         * @return builder
         * 
         */
        public Builder internetAccess(DeviceprofileGatewayNetworkInternetAccessArgs internetAccess) {
            return internetAccess(Output.of(internetAccess));
        }

        /**
         * @param isolation whether to allow clients in the network to talk to each other
         * 
         * @return builder
         * 
         */
        public Builder isolation(@Nullable Output<Boolean> isolation) {
            $.isolation = isolation;
            return this;
        }

        /**
         * @param isolation whether to allow clients in the network to talk to each other
         * 
         * @return builder
         * 
         */
        public Builder isolation(Boolean isolation) {
            return isolation(Output.of(isolation));
        }

        /**
         * @param multicast whether to enable multicast support (only PIM-sparse mode is supported)
         * 
         * @return builder
         * 
         */
        public Builder multicast(@Nullable Output<DeviceprofileGatewayNetworkMulticastArgs> multicast) {
            $.multicast = multicast;
            return this;
        }

        /**
         * @param multicast whether to enable multicast support (only PIM-sparse mode is supported)
         * 
         * @return builder
         * 
         */
        public Builder multicast(DeviceprofileGatewayNetworkMulticastArgs multicast) {
            return multicast(Output.of(multicast));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param routedForNetworks for a Network (usually LAN), it can be routable to other networks (e.g. OSPF)
         * 
         * @return builder
         * 
         */
        public Builder routedForNetworks(@Nullable Output<List<String>> routedForNetworks) {
            $.routedForNetworks = routedForNetworks;
            return this;
        }

        /**
         * @param routedForNetworks for a Network (usually LAN), it can be routable to other networks (e.g. OSPF)
         * 
         * @return builder
         * 
         */
        public Builder routedForNetworks(List<String> routedForNetworks) {
            return routedForNetworks(Output.of(routedForNetworks));
        }

        /**
         * @param routedForNetworks for a Network (usually LAN), it can be routable to other networks (e.g. OSPF)
         * 
         * @return builder
         * 
         */
        public Builder routedForNetworks(String... routedForNetworks) {
            return routedForNetworks(List.of(routedForNetworks));
        }

        public Builder subnet(Output<String> subnet) {
            $.subnet = subnet;
            return this;
        }

        public Builder subnet(String subnet) {
            return subnet(Output.of(subnet));
        }

        public Builder subnet6(@Nullable Output<String> subnet6) {
            $.subnet6 = subnet6;
            return this;
        }

        public Builder subnet6(String subnet6) {
            return subnet6(Output.of(subnet6));
        }

        public Builder tenants(@Nullable Output<Map<String,DeviceprofileGatewayNetworkTenantsArgs>> tenants) {
            $.tenants = tenants;
            return this;
        }

        public Builder tenants(Map<String,DeviceprofileGatewayNetworkTenantsArgs> tenants) {
            return tenants(Output.of(tenants));
        }

        public Builder vlanId(@Nullable Output<String> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        public Builder vlanId(String vlanId) {
            return vlanId(Output.of(vlanId));
        }

        /**
         * @param vpnAccess Property key is the VPN name. Whether this network can be accessed from vpn
         * 
         * @return builder
         * 
         */
        public Builder vpnAccess(@Nullable Output<Map<String,DeviceprofileGatewayNetworkVpnAccessArgs>> vpnAccess) {
            $.vpnAccess = vpnAccess;
            return this;
        }

        /**
         * @param vpnAccess Property key is the VPN name. Whether this network can be accessed from vpn
         * 
         * @return builder
         * 
         */
        public Builder vpnAccess(Map<String,DeviceprofileGatewayNetworkVpnAccessArgs> vpnAccess) {
            return vpnAccess(Output.of(vpnAccess));
        }

        public DeviceprofileGatewayNetworkArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("DeviceprofileGatewayNetworkArgs", "name");
            }
            if ($.subnet == null) {
                throw new MissingRequiredPropertyException("DeviceprofileGatewayNetworkArgs", "subnet");
            }
            return $;
        }
    }

}
