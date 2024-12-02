// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class EvpnTopologyEvpnOptionsUnderlayGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Underlay BGP Base AS Number
        /// </summary>
        [Input("asBase")]
        public Input<int>? AsBase { get; set; }

        [Input("routedIdPrefix")]
        public Input<string>? RoutedIdPrefix { get; set; }

        /// <summary>
        /// underlay subnet, by default, `10.255.240.0/20`, or `fd31:5700::/64` for ipv6
        /// </summary>
        [Input("subnet")]
        public Input<string>? Subnet { get; set; }

        /// <summary>
        /// if v6 is desired for underlay
        /// </summary>
        [Input("useIpv6")]
        public Input<bool>? UseIpv6 { get; set; }

        public EvpnTopologyEvpnOptionsUnderlayGetArgs()
        {
        }
        public static new EvpnTopologyEvpnOptionsUnderlayGetArgs Empty => new EvpnTopologyEvpnOptionsUnderlayGetArgs();
    }
}
