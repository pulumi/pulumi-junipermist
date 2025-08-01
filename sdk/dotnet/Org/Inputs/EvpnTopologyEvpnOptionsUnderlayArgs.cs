// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class EvpnTopologyEvpnOptionsUnderlayArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Underlay BGP Base AS Number
        /// </summary>
        [Input("asBase")]
        public Input<int>? AsBase { get; set; }

        [Input("routedIdPrefix")]
        public Input<string>? RoutedIdPrefix { get; set; }

        /// <summary>
        /// Underlay subnet, by default, `10.255.240.0/20`, or `fd31:5700::/64` for ipv6
        /// </summary>
        [Input("subnet")]
        public Input<string>? Subnet { get; set; }

        /// <summary>
        /// If v6 is desired for underlay
        /// </summary>
        [Input("useIpv6")]
        public Input<bool>? UseIpv6 { get; set; }

        public EvpnTopologyEvpnOptionsUnderlayArgs()
        {
        }
        public static new EvpnTopologyEvpnOptionsUnderlayArgs Empty => new EvpnTopologyEvpnOptionsUnderlayArgs();
    }
}
