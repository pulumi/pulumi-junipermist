// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchNetworksGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// only required for EVPN-VXLAN networks, IPv4 Virtual Gateway
        /// </summary>
        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        /// <summary>
        /// only required for EVPN-VXLAN networks, IPv6 Virtual Gateway
        /// </summary>
        [Input("gateway6")]
        public Input<string>? Gateway6 { get; set; }

        /// <summary>
        /// whether to stop clients to talk to each other, default is false (when enabled, a unique isolation_vlan_id is required). NOTE: this features requires uplink device to also a be Juniper device and `inter_switch_link` to be set
        /// </summary>
        [Input("isolation")]
        public Input<bool>? Isolation { get; set; }

        [Input("isolationVlanId")]
        public Input<string>? IsolationVlanId { get; set; }

        /// <summary>
        /// optional for pure switching, required when L3 / routing features are used
        /// </summary>
        [Input("subnet")]
        public Input<string>? Subnet { get; set; }

        /// <summary>
        /// optional for pure switching, required when L3 / routing features are used
        /// </summary>
        [Input("subnet6")]
        public Input<string>? Subnet6 { get; set; }

        [Input("vlanId", required: true)]
        public Input<string> VlanId { get; set; } = null!;

        public SwitchNetworksGetArgs()
        {
        }
        public static new SwitchNetworksGetArgs Empty => new SwitchNetworksGetArgs();
    }
}
