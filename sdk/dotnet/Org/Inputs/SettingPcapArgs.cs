// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class SettingPcapArgs : global::Pulumi.ResourceArgs
    {
        [Input("bucket")]
        public Input<string>? Bucket { get; set; }

        /// <summary>
        /// max_len of non-management packets to capture
        /// </summary>
        [Input("maxPktLen")]
        public Input<int>? MaxPktLen { get; set; }

        public SettingPcapArgs()
        {
        }
        public static new SettingPcapArgs Empty => new SettingPcapArgs();
    }
}