// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplateNetworkGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// whether to disallow Mist Devices in the network
        /// </summary>
        [Input("disallowMistServices")]
        public Input<bool>? DisallowMistServices { get; set; }

        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        [Input("gateway6")]
        public Input<string>? Gateway6 { get; set; }

        [Input("internalAccess")]
        public Input<Inputs.GatewaytemplateNetworkInternalAccessGetArgs>? InternalAccess { get; set; }

        /// <summary>
        /// whether this network has direct internet access
        /// </summary>
        [Input("internetAccess")]
        public Input<Inputs.GatewaytemplateNetworkInternetAccessGetArgs>? InternetAccess { get; set; }

        /// <summary>
        /// whether to allow clients in the network to talk to each other
        /// </summary>
        [Input("isolation")]
        public Input<bool>? Isolation { get; set; }

        /// <summary>
        /// whether to enable multicast support (only PIM-sparse mode is supported)
        /// </summary>
        [Input("multicast")]
        public Input<Inputs.GatewaytemplateNetworkMulticastGetArgs>? Multicast { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("routedForNetworks")]
        private InputList<string>? _routedForNetworks;

        /// <summary>
        /// for a Network (usually LAN), it can be routable to other networks (e.g. OSPF)
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
        private InputMap<Inputs.GatewaytemplateNetworkTenantsGetArgs>? _tenants;
        public InputMap<Inputs.GatewaytemplateNetworkTenantsGetArgs> Tenants
        {
            get => _tenants ?? (_tenants = new InputMap<Inputs.GatewaytemplateNetworkTenantsGetArgs>());
            set => _tenants = value;
        }

        [Input("vlanId")]
        public Input<string>? VlanId { get; set; }

        [Input("vpnAccess")]
        private InputMap<Inputs.GatewaytemplateNetworkVpnAccessGetArgs>? _vpnAccess;

        /// <summary>
        /// Property key is the VPN name. Whether this network can be accessed from vpn
        /// </summary>
        public InputMap<Inputs.GatewaytemplateNetworkVpnAccessGetArgs> VpnAccess
        {
            get => _vpnAccess ?? (_vpnAccess = new InputMap<Inputs.GatewaytemplateNetworkVpnAccessGetArgs>());
            set => _vpnAccess = value;
        }

        public GatewaytemplateNetworkGetArgs()
        {
        }
        public static new GatewaytemplateNetworkGetArgs Empty => new GatewaytemplateNetworkGetArgs();
    }
}
