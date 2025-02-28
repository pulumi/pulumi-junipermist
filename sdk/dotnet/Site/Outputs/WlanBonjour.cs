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
    public sealed class WlanBonjour
    {
        /// <summary>
        /// additional VLAN IDs (on the LAN side or from other WLANs) should we be forwarding bonjour queries/responses
        /// </summary>
        public readonly ImmutableArray<string> AdditionalVlanIds;
        /// <summary>
        /// Whether to enable bonjour for this WLAN. Once enabled, limit_bcast is assumed true, allow_mdns is assumed false
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// What services are allowed. 
        /// Property key is the service name
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.WlanBonjourServices> Services;

        [OutputConstructor]
        private WlanBonjour(
            ImmutableArray<string> additionalVlanIds,

            bool? enabled,

            ImmutableDictionary<string, Outputs.WlanBonjourServices> services)
        {
            AdditionalVlanIds = additionalVlanIds;
            Enabled = enabled;
            Services = services;
        }
    }
}
