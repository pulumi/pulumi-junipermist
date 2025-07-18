// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class DeviceprofileGatewayPortConfigVpnPathsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Only if the VPN `type`==`hub_spoke`. enum: `broadband`, `lte`
        /// </summary>
        [Input("bfdProfile")]
        public Input<string>? BfdProfile { get; set; }

        /// <summary>
        /// Only if the VPN `type`==`hub_spoke`. Whether to use tunnel mode. SSR only
        /// </summary>
        [Input("bfdUseTunnelMode")]
        public Input<bool>? BfdUseTunnelMode { get; set; }

        /// <summary>
        /// Only if the VPN `type`==`hub_spoke`. For a given VPN, when `path_selection.strategy`==`simple`, the preference for a path (lower is preferred)
        /// </summary>
        [Input("preference")]
        public Input<int>? Preference { get; set; }

        /// <summary>
        /// If the VPN `type`==`hub_spoke`, enum: `hub`, `spoke`. If the VPN `type`==`mesh`, enum: `mesh`
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        [Input("trafficShaping")]
        public Input<Inputs.DeviceprofileGatewayPortConfigVpnPathsTrafficShapingGetArgs>? TrafficShaping { get; set; }

        public DeviceprofileGatewayPortConfigVpnPathsGetArgs()
        {
        }
        public static new DeviceprofileGatewayPortConfigVpnPathsGetArgs Empty => new DeviceprofileGatewayPortConfigVpnPathsGetArgs();
    }
}
