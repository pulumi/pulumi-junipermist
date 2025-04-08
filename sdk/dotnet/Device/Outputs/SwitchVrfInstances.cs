// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Outputs
{

    [OutputType]
    public sealed class SwitchVrfInstances
    {
        public readonly string? EvpnAutoLoopbackSubnet;
        public readonly string? EvpnAutoLoopbackSubnet6;
        /// <summary>
        /// Property key is the destination CIDR (e.g. "10.0.0.0/8")
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.SwitchVrfInstancesExtraRoutes>? ExtraRoutes;
        /// <summary>
        /// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.SwitchVrfInstancesExtraRoutes6>? ExtraRoutes6;
        public readonly ImmutableArray<string> Networks;

        [OutputConstructor]
        private SwitchVrfInstances(
            string? evpnAutoLoopbackSubnet,

            string? evpnAutoLoopbackSubnet6,

            ImmutableDictionary<string, Outputs.SwitchVrfInstancesExtraRoutes>? extraRoutes,

            ImmutableDictionary<string, Outputs.SwitchVrfInstancesExtraRoutes6>? extraRoutes6,

            ImmutableArray<string> networks)
        {
            EvpnAutoLoopbackSubnet = evpnAutoLoopbackSubnet;
            EvpnAutoLoopbackSubnet6 = evpnAutoLoopbackSubnet6;
            ExtraRoutes = extraRoutes;
            ExtraRoutes6 = extraRoutes6;
            Networks = networks;
        }
    }
}
