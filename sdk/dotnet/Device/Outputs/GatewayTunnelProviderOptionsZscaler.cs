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
    public sealed class GatewayTunnelProviderOptionsZscaler
    {
        public readonly bool? AupBlockInternetUntilAccepted;
        /// <summary>
        /// Can only be `true` when `auth_required`==`false`, display Acceptable Use Policy (AUP)
        /// </summary>
        public readonly bool? AupEnabled;
        /// <summary>
        /// Proxy HTTPs traffic, requiring Zscaler cert to be installed in browser
        /// </summary>
        public readonly bool? AupForceSslInspection;
        /// <summary>
        /// Required if `aup_enabled`==`true`. Days before AUP is requested again
        /// </summary>
        public readonly int? AupTimeoutInDays;
        /// <summary>
        /// Enable this option to enforce user authentication
        /// </summary>
        public readonly bool? AuthRequired;
        /// <summary>
        /// Can only be `true` when `auth_required`==`false`, display caution notification for non-authenticated users
        /// </summary>
        public readonly bool? CautionEnabled;
        /// <summary>
        /// Download bandwidth cap of the link, in Mbps. Disabled if not set
        /// </summary>
        public readonly double? DnBandwidth;
        /// <summary>
        /// Required if `surrogate_IP`==`true`, idle Time to Disassociation
        /// </summary>
        public readonly int? IdleTimeInMinutes;
        /// <summary>
        /// If `true`, enable the firewall control option
        /// </summary>
        public readonly bool? OfwEnabled;
        /// <summary>
        /// `sub-locations` can be used for specific uses cases to define different configuration based on the user network
        /// </summary>
        public readonly ImmutableArray<Outputs.GatewayTunnelProviderOptionsZscalerSubLocation> SubLocations;
        /// <summary>
        /// Can only be `true` when `auth_required`==`true`. Map a user to a private IP address so it applies the user's policies, instead of the location's policies
        /// </summary>
        public readonly bool? SurrogateIp;
        /// <summary>
        /// Can only be `true` when `surrogate_IP`==`true`, enforce surrogate IP for known browsers
        /// </summary>
        public readonly bool? SurrogateIpEnforcedForKnownBrowsers;
        /// <summary>
        /// Required if `surrogate_IP_enforced_for_known_browsers`==`true`, must be lower or equal than `idle_time_in_minutes`, refresh Time for re-validation of Surrogacy
        /// </summary>
        public readonly int? SurrogateRefreshTimeInMinutes;
        /// <summary>
        /// Download bandwidth cap of the link, in Mbps. Disabled if not set
        /// </summary>
        public readonly double? UpBandwidth;
        /// <summary>
        /// Location uses proxy chaining to forward traffic
        /// </summary>
        public readonly bool? XffForwardEnabled;

        [OutputConstructor]
        private GatewayTunnelProviderOptionsZscaler(
            bool? aupBlockInternetUntilAccepted,

            bool? aupEnabled,

            bool? aupForceSslInspection,

            int? aupTimeoutInDays,

            bool? authRequired,

            bool? cautionEnabled,

            double? dnBandwidth,

            int? idleTimeInMinutes,

            bool? ofwEnabled,

            ImmutableArray<Outputs.GatewayTunnelProviderOptionsZscalerSubLocation> subLocations,

            bool? surrogateIp,

            bool? surrogateIpEnforcedForKnownBrowsers,

            int? surrogateRefreshTimeInMinutes,

            double? upBandwidth,

            bool? xffForwardEnabled)
        {
            AupBlockInternetUntilAccepted = aupBlockInternetUntilAccepted;
            AupEnabled = aupEnabled;
            AupForceSslInspection = aupForceSslInspection;
            AupTimeoutInDays = aupTimeoutInDays;
            AuthRequired = authRequired;
            CautionEnabled = cautionEnabled;
            DnBandwidth = dnBandwidth;
            IdleTimeInMinutes = idleTimeInMinutes;
            OfwEnabled = ofwEnabled;
            SubLocations = subLocations;
            SurrogateIp = surrogateIp;
            SurrogateIpEnforcedForKnownBrowsers = surrogateIpEnforcedForKnownBrowsers;
            SurrogateRefreshTimeInMinutes = surrogateRefreshTimeInMinutes;
            UpBandwidth = upBandwidth;
            XffForwardEnabled = xffForwardEnabled;
        }
    }
}
