// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class WlanQosArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `background`, `best_effort`, `video`, `voice`
        /// </summary>
        [Input("class")]
        public Input<string>? Class { get; set; }

        /// <summary>
        /// Whether to overwrite QoS
        /// </summary>
        [Input("overwrite")]
        public Input<bool>? Overwrite { get; set; }

        public WlanQosArgs()
        {
        }
        public static new WlanQosArgs Empty => new WlanQosArgs();
    }
}
