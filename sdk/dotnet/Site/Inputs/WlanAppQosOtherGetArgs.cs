// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class WlanAppQosOtherGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("dscp")]
        public Input<string>? Dscp { get; set; }

        [Input("dstSubnet")]
        public Input<string>? DstSubnet { get; set; }

        [Input("portRanges")]
        public Input<string>? PortRanges { get; set; }

        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        [Input("srcSubnet")]
        public Input<string>? SrcSubnet { get; set; }

        public WlanAppQosOtherGetArgs()
        {
        }
        public static new WlanAppQosOtherGetArgs Empty => new WlanAppQosOtherGetArgs();
    }
}
