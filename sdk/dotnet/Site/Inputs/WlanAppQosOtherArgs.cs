// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class WlanAppQosOtherArgs : global::Pulumi.ResourceArgs
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

        public WlanAppQosOtherArgs()
        {
        }
        public static new WlanAppQosOtherArgs Empty => new WlanAppQosOtherArgs();
    }
}
