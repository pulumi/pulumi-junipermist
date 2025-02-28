// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class WlanScheduleArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Days/Hours of operation filter, the available days (mon, tue, wed, thu, fri, sat, sun)
        /// </summary>
        [Input("hours")]
        public Input<Inputs.WlanScheduleHoursArgs>? Hours { get; set; }

        public WlanScheduleArgs()
        {
        }
        public static new WlanScheduleArgs Empty => new WlanScheduleArgs();
    }
}
