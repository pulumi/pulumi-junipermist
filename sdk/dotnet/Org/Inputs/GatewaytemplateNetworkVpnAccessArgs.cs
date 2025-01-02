// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplateNetworkVpnAccessArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// if `routed`==`true`, whether to advertise an aggregated subnet toward HUB this is useful when there are multiple networks on SPOKE's side
        /// </summary>
        [Input("advertisedSubnet")]
        public Input<string>? AdvertisedSubnet { get; set; }

        /// <summary>
        /// whether to allow ping from vpn into this routed network
        /// </summary>
        [Input("allowPing")]
        public Input<bool>? AllowPing { get; set; }

        [Input("destinationNat")]
        private InputMap<Inputs.GatewaytemplateNetworkVpnAccessDestinationNatArgs>? _destinationNat;

        /// <summary>
        /// Property key can be an External IP (i.e. "63.16.0.3"), an External IP:Port (i.e. "63.16.0.3:443"), an External Port (i.e. ":443"), an External CIDR (i.e. "63.16.0.0/30"), an External CIDR:Port (i.e. "63.16.0.0/30:443") or a Variable (i.e. "{{myvar}}"). At least one of the `internal_ip` or `port` must be defined
        /// </summary>
        public InputMap<Inputs.GatewaytemplateNetworkVpnAccessDestinationNatArgs> DestinationNat
        {
            get => _destinationNat ?? (_destinationNat = new InputMap<Inputs.GatewaytemplateNetworkVpnAccessDestinationNatArgs>());
            set => _destinationNat = value;
        }

        /// <summary>
        /// if `routed`==`false` (usually at Spoke), but some hosts needs to be reachable from Hub, a subnet is required to create and advertise the route to Hub
        /// </summary>
        [Input("natPool")]
        public Input<string>? NatPool { get; set; }

        /// <summary>
        /// toward LAN-side BGP peers
        /// </summary>
        [Input("noReadvertiseToLanBgp")]
        public Input<bool>? NoReadvertiseToLanBgp { get; set; }

        /// <summary>
        /// toward LAN-side OSPF peers
        /// </summary>
        [Input("noReadvertiseToLanOspf")]
        public Input<bool>? NoReadvertiseToLanOspf { get; set; }

        /// <summary>
        /// toward overlay, how HUB should deal with routes it received from Spokes
        /// </summary>
        [Input("noReadvertiseToOverlay")]
        public Input<bool>? NoReadvertiseToOverlay { get; set; }

        [Input("otherVrfs")]
        private InputList<string>? _otherVrfs;

        /// <summary>
        /// by default, the routes are only readvertised toward the same vrf on spoke. To allow it to be leaked to other vrfs
        /// </summary>
        public InputList<string> OtherVrfs
        {
            get => _otherVrfs ?? (_otherVrfs = new InputList<string>());
            set => _otherVrfs = value;
        }

        /// <summary>
        /// whether this network is routable
        /// </summary>
        [Input("routed")]
        public Input<bool>? Routed { get; set; }

        /// <summary>
        /// if `routed`==`false` (usually at Spoke), but some hosts needs to be reachable from Hub
        /// </summary>
        [Input("sourceNat")]
        public Input<Inputs.GatewaytemplateNetworkVpnAccessSourceNatArgs>? SourceNat { get; set; }

        [Input("staticNat")]
        private InputMap<Inputs.GatewaytemplateNetworkVpnAccessStaticNatArgs>? _staticNat;

        /// <summary>
        /// Property key may be an External IP Address (i.e. "63.16.0.3"), a CIDR (i.e. "63.16.0.12/20") or a Variable (i.e. "{{myvar}}")
        /// </summary>
        public InputMap<Inputs.GatewaytemplateNetworkVpnAccessStaticNatArgs> StaticNat
        {
            get => _staticNat ?? (_staticNat = new InputMap<Inputs.GatewaytemplateNetworkVpnAccessStaticNatArgs>());
            set => _staticNat = value;
        }

        /// <summary>
        /// toward overlay, how HUB should deal with routes it received from Spokes
        /// </summary>
        [Input("summarizedSubnet")]
        public Input<string>? SummarizedSubnet { get; set; }

        /// <summary>
        /// toward LAN-side BGP peers
        /// </summary>
        [Input("summarizedSubnetToLanBgp")]
        public Input<string>? SummarizedSubnetToLanBgp { get; set; }

        /// <summary>
        /// toward LAN-side OSPF peers
        /// </summary>
        [Input("summarizedSubnetToLanOspf")]
        public Input<string>? SummarizedSubnetToLanOspf { get; set; }

        public GatewaytemplateNetworkVpnAccessArgs()
        {
        }
        public static new GatewaytemplateNetworkVpnAccessArgs Empty => new GatewaytemplateNetworkVpnAccessArgs();
    }
}
