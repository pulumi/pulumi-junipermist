// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class WlanQosGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `background`, `best_effort`, `video`, `voice`
        /// </summary>
        [Input("class")]
        public Input<string>? Class { get; set; }

        /// <summary>
        /// whether to overwrite QoS
        /// </summary>
        [Input("overwrite")]
        public Input<bool>? Overwrite { get; set; }

        public WlanQosGetArgs()
        {
        }
        public static new WlanQosGetArgs Empty => new WlanQosGetArgs();
    }
}