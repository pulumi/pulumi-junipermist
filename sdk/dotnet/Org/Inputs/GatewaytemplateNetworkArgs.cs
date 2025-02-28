// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplateNetworkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to disallow Mist Devices in the network
        /// </summary>
        [Input("disallowMistServices")]
        public Input<bool>? DisallowMistServices { get; set; }

        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        [Input("gateway6")]
        public Input<string>? Gateway6 { get; set; }

        [Input("internalAccess")]
        public Input<Inputs.GatewaytemplateNetworkInternalAccessArgs>? InternalAccess { get; set; }

        /// <summary>
        /// Whether this network has direct internet access
        /// </summary>
        [Input("internetAccess")]
        public Input<Inputs.GatewaytemplateNetworkInternetAccessArgs>? InternetAccess { get; set; }

        /// <summary>
        /// Whether to allow clients in the network to talk to each other
        /// </summary>
        [Input("isolation")]
        public Input<bool>? Isolation { get; set; }

        /// <summary>
        /// Whether to enable multicast support (only PIM-sparse mode is supported)
        /// </summary>
        [Input("multicast")]
        public Input<Inputs.GatewaytemplateNetworkMulticastArgs>? Multicast { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("routedForNetworks")]
        private InputList<string>? _routedForNetworks;

        /// <summary>
        /// For a Network (usually LAN), it can be routable to other networks (e.g. OSPF)
        /// </summary>
        public InputList<string> RoutedForNetworks
        {
            get => _routedForNetworks ?? (_routedForNetworks = new InputList<string>());
            set => _routedForNetworks = value;
        }

        [Input("subnet", required: true)]
        public Input<string> Subnet { get; set; } = null!;

        [Input("subnet6")]
        public Input<string>? Subnet6 { get; set; }

        [Input("tenants")]
        private InputMap<Inputs.GatewaytemplateNetworkTenantsArgs>? _tenants;

        /// <summary>
        /// Property key must be the user/tenant name (i.e. "printer-1") or a Variable (i.e. "{{myvar}}")
        /// </summary>
        public InputMap<Inputs.GatewaytemplateNetworkTenantsArgs> Tenants
        {
            get => _tenants ?? (_tenants = new InputMap<Inputs.GatewaytemplateNetworkTenantsArgs>());
            set => _tenants = value;
        }

        [Input("vlanId")]
        public Input<string>? VlanId { get; set; }

        [Input("vpnAccess")]
        private InputMap<Inputs.GatewaytemplateNetworkVpnAccessArgs>? _vpnAccess;

        /// <summary>
        /// Property key is the VPN name. Whether this network can be accessed from vpn
        /// </summary>
        public InputMap<Inputs.GatewaytemplateNetworkVpnAccessArgs> VpnAccess
        {
            get => _vpnAccess ?? (_vpnAccess = new InputMap<Inputs.GatewaytemplateNetworkVpnAccessArgs>());
            set => _vpnAccess = value;
        }

        public GatewaytemplateNetworkArgs()
        {
        }
        public static new GatewaytemplateNetworkArgs Empty => new GatewaytemplateNetworkArgs();
    }
}
