// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class WlanAppQosAppsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// DSCP value range between 0 and 63
        /// </summary>
        [Input("dscp")]
        public Input<string>? Dscp { get; set; }

        /// <summary>
        /// Subnet filter is not required but helps AP to only inspect certain traffic (thus reducing AP load)
        /// </summary>
        [Input("dstSubnet")]
        public Input<string>? DstSubnet { get; set; }

        /// <summary>
        /// Subnet filter is not required but helps AP to only inspect certain traffic (thus reducing AP load)
        /// </summary>
        [Input("srcSubnet")]
        public Input<string>? SrcSubnet { get; set; }

        public WlanAppQosAppsGetArgs()
        {
        }
        public static new WlanAppQosAppsGetArgs Empty => new WlanAppQosAppsGetArgs();
    }
}
