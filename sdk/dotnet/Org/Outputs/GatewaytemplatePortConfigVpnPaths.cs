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
    public sealed class GatewaytemplatePortConfigVpnPaths
    {
        /// <summary>
        /// Only if the VPN `type`==`hub_spoke`. enum: `broadband`, `lte`
        /// </summary>
        public readonly string? BfdProfile;
        /// <summary>
        /// Only if the VPN `type`==`hub_spoke`. Whether to use tunnel mode. SSR only
        /// </summary>
        public readonly bool? BfdUseTunnelMode;
        /// <summary>
        /// Only if the VPN `type`==`mesh`
        /// </summary>
        public readonly string? LinkName;
        /// <summary>
        /// Only if the VPN `type`==`hub_spoke`. For a given VPN, when `path_selection.strategy`==`simple`, the preference for a path (lower is preferred)
        /// </summary>
        public readonly int? Preference;
        /// <summary>
        /// Only if the VPN `type`==`hub_spoke`. enum: `hub`, `spoke`
        /// </summary>
        public readonly string? Role;
        public readonly Outputs.GatewaytemplatePortConfigVpnPathsTrafficShaping? TrafficShaping;

        [OutputConstructor]
        private GatewaytemplatePortConfigVpnPaths(
            string? bfdProfile,

            bool? bfdUseTunnelMode,

            string? linkName,

            int? preference,

            string? role,

            Outputs.GatewaytemplatePortConfigVpnPathsTrafficShaping? trafficShaping)
        {
            BfdProfile = bfdProfile;
            BfdUseTunnelMode = bfdUseTunnelMode;
            LinkName = linkName;
            Preference = preference;
            Role = role;
            TrafficShaping = trafficShaping;
        }
    }
}
