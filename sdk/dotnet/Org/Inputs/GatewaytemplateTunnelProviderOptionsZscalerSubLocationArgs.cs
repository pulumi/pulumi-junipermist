// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplateTunnelProviderOptionsZscalerSubLocationArgs : global::Pulumi.ResourceArgs
    {
        [Input("aupBlockInternetUntilAccepted")]
        public Input<bool>? AupBlockInternetUntilAccepted { get; set; }

        /// <summary>
        /// Can only be `true` when `auth_required`==`false`, display Acceptable Use Policy (AUP)
        /// </summary>
        [Input("aupEnabled")]
        public Input<bool>? AupEnabled { get; set; }

        /// <summary>
        /// Proxy HTTPs traffic, requiring Zscaler cert to be installed in browser
        /// </summary>
        [Input("aupForceSslInspection")]
        public Input<bool>? AupForceSslInspection { get; set; }

        /// <summary>
        /// Required if `aup_enabled`==`true`. Days before AUP is requested again
        /// </summary>
        [Input("aupTimeoutInDays")]
        public Input<int>? AupTimeoutInDays { get; set; }

        /// <summary>
        /// Enable this option to authenticate users
        /// </summary>
        [Input("authRequired")]
        public Input<bool>? AuthRequired { get; set; }

        /// <summary>
        /// Can only be `true` when `auth_required`==`false`, display caution notification for non-authenticated users
        /// </summary>
        [Input("cautionEnabled")]
        public Input<bool>? CautionEnabled { get; set; }

        /// <summary>
        /// Download bandwidth cap of the link, in Mbps. Disabled if not set
        /// </summary>
        [Input("dnBandwidth")]
        public Input<double>? DnBandwidth { get; set; }

        /// <summary>
        /// Required if `surrogate_IP`==`true`, idle Time to Disassociation
        /// </summary>
        [Input("idleTimeInMinutes")]
        public Input<int>? IdleTimeInMinutes { get; set; }

        /// <summary>
        /// Network name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// If `true`, enable the firewall control option
        /// </summary>
        [Input("ofwEnabled")]
        public Input<bool>? OfwEnabled { get; set; }

        /// <summary>
        /// Can only be `true` when `auth_required`==`true`. Map a user to a private IP address so it applies the user's policies, instead of the location's policies
        /// </summary>
        [Input("surrogateIp")]
        public Input<bool>? SurrogateIp { get; set; }

        /// <summary>
        /// Can only be `true` when `surrogate_IP`==`true`, enforce surrogate IP for known browsers
        /// </summary>
        [Input("surrogateIpEnforcedForKnownBrowsers")]
        public Input<bool>? SurrogateIpEnforcedForKnownBrowsers { get; set; }

        /// <summary>
        /// Required if `surrogate_IP_enforced_for_known_browsers`==`true`, must be lower or equal than `idle_time_in_minutes`, refresh Time for re-validation of Surrogacy
        /// </summary>
        [Input("surrogateRefreshTimeInMinutes")]
        public Input<int>? SurrogateRefreshTimeInMinutes { get; set; }

        /// <summary>
        /// Download bandwidth cap of the link, in Mbps. Disabled if not set
        /// </summary>
        [Input("upBandwidth")]
        public Input<double>? UpBandwidth { get; set; }

        public GatewaytemplateTunnelProviderOptionsZscalerSubLocationArgs()
        {
        }
        public static new GatewaytemplateTunnelProviderOptionsZscalerSubLocationArgs Empty => new GatewaytemplateTunnelProviderOptionsZscalerSubLocationArgs();
    }
}
