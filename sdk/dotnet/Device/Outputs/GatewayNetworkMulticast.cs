// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Outputs
{

    [OutputType]
    public sealed class GatewayNetworkMulticast
    {
        /// <summary>
        /// If the network will only be the source of the multicast traffic, IGMP can be disabled
        /// </summary>
        public readonly bool? DisableIgmp;
        public readonly bool? Enabled;
        /// <summary>
        /// Group address to RP (rendezvous point) mapping. Property Key is the CIDR (example "225.1.0.3/32")
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GatewayNetworkMulticastGroups>? Groups;

        [OutputConstructor]
        private GatewayNetworkMulticast(
            bool? disableIgmp,

            bool? enabled,

            ImmutableDictionary<string, Outputs.GatewayNetworkMulticastGroups>? groups)
        {
            DisableIgmp = disableIgmp;
            Enabled = enabled;
            Groups = groups;
        }
    }
}
