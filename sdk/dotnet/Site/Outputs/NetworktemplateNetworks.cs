// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Outputs
{

    [OutputType]
    public sealed class NetworktemplateNetworks
    {
        /// <summary>
        /// only required for EVPN-VXLAN networks, IPv4 Virtual Gateway
        /// </summary>
        public readonly string? Gateway;
        /// <summary>
        /// only required for EVPN-VXLAN networks, IPv6 Virtual Gateway
        /// </summary>
        public readonly string? Gateway6;
        /// <summary>
        /// whether to stop clients to talk to each other, default is false (when enabled, a unique isolation_vlan_id is required). NOTE: this features requires uplink device to also a be Juniper device and `inter_switch_link` to be set
        /// </summary>
        public readonly bool? Isolation;
        public readonly string? IsolationVlanId;
        /// <summary>
        /// optional for pure switching, required when L3 / routing features are used
        /// </summary>
        public readonly string? Subnet;
        /// <summary>
        /// optional for pure switching, required when L3 / routing features are used
        /// </summary>
        public readonly string? Subnet6;
        public readonly string VlanId;

        [OutputConstructor]
        private NetworktemplateNetworks(
            string? gateway,

            string? gateway6,

            bool? isolation,

            string? isolationVlanId,

            string? subnet,

            string? subnet6,

            string vlanId)
        {
            Gateway = gateway;
            Gateway6 = gateway6;
            Isolation = isolation;
            IsolationVlanId = isolationVlanId;
            Subnet = subnet;
            Subnet6 = subnet6;
            VlanId = vlanId;
        }
    }
}
