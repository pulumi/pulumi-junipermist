// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class WlanScheduleGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// hours of operation filter, the available days (mon, tue, wed, thu, fri, sat, sun). 
        /// 
        /// **Note**: If the dow is not defined then it\u2019\ s treated as 00:00-23:59.
        /// </summary>
        [Input("hours")]
        public Input<Inputs.WlanScheduleHoursGetArgs>? Hours { get; set; }

        public WlanScheduleGetArgs()
        {
        }
        public static new WlanScheduleGetArgs Empty => new WlanScheduleGetArgs();
    }
}
