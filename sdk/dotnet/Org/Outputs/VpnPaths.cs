// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Outputs
{

    [OutputType]
    public sealed class VpnPaths
    {
        /// <summary>
        /// enum: `broadband`, `lte`
        /// </summary>
        public readonly string? BfdProfile;
        /// <summary>
        /// If `type`==`mesh` and for SSR only, whether toi use tunnel mode
        /// </summary>
        public readonly bool? BfdUseTunnelMode;
        /// <summary>
        /// If different from the wan port
        /// </summary>
        public readonly string? Ip;
        /// <summary>
        /// If `type`==`mesh`, Property key is the Peer Interface name
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.VpnPathsPeerPaths>? PeerPaths;
        public readonly int? Pod;
        public readonly Outputs.VpnPathsTrafficShaping? TrafficShaping;

        [OutputConstructor]
        private VpnPaths(
            string? bfdProfile,

            bool? bfdUseTunnelMode,

            string? ip,

            ImmutableDictionary<string, Outputs.VpnPathsPeerPaths>? peerPaths,

            int? pod,

            Outputs.VpnPathsTrafficShaping? trafficShaping)
        {
            BfdProfile = bfdProfile;
            BfdUseTunnelMode = bfdUseTunnelMode;
            Ip = ip;
            PeerPaths = peerPaths;
            Pod = pod;
            TrafficShaping = trafficShaping;
        }
    }
}
