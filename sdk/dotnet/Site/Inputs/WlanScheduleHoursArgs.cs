// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class WlanScheduleHoursArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it's treated as 00:00-23:59.
        /// </summary>
        [Input("fri")]
        public Input<string>? Fri { get; set; }

        /// <summary>
        /// Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it's treated as 00:00-23:59.
        /// </summary>
        [Input("mon")]
        public Input<string>? Mon { get; set; }

        /// <summary>
        /// Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it's treated as 00:00-23:59.
        /// </summary>
        [Input("sat")]
        public Input<string>? Sat { get; set; }

        /// <summary>
        /// Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it's treated as 00:00-23:59.
        /// </summary>
        [Input("sun")]
        public Input<string>? Sun { get; set; }

        /// <summary>
        /// Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it's treated as 00:00-23:59.
        /// </summary>
        [Input("thu")]
        public Input<string>? Thu { get; set; }

        /// <summary>
        /// Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it's treated as 00:00-23:59.
        /// </summary>
        [Input("tue")]
        public Input<string>? Tue { get; set; }

        /// <summary>
        /// Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it's treated as 00:00-23:59.
        /// </summary>
        [Input("wed")]
        public Input<string>? Wed { get; set; }

        public WlanScheduleHoursArgs()
        {
        }
        public static new WlanScheduleHoursArgs Empty => new WlanScheduleHoursArgs();
    }
}
