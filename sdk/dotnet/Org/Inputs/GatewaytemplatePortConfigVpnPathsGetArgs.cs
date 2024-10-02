// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplatePortConfigVpnPathsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `broadband`, `lte`
        /// </summary>
        [Input("bfdProfile")]
        public Input<string>? BfdProfile { get; set; }

        /// <summary>
        /// whether to use tunnel mode. SSR only
        /// </summary>
        [Input("bfdUseTunnelMode")]
        public Input<bool>? BfdUseTunnelMode { get; set; }

        /// <summary>
        /// for a given VPN, when `path_selection.strategy`==`simple`, the preference for a path (lower is preferred)
        /// </summary>
        [Input("preference")]
        public Input<int>? Preference { get; set; }

        /// <summary>
        /// enum: `hub`, `spoke`
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        [Input("trafficShaping")]
        public Input<Inputs.GatewaytemplatePortConfigVpnPathsTrafficShapingGetArgs>? TrafficShaping { get; set; }

        public GatewaytemplatePortConfigVpnPathsGetArgs()
        {
        }
        public static new GatewaytemplatePortConfigVpnPathsGetArgs Empty => new GatewaytemplatePortConfigVpnPathsGetArgs();
    }
}