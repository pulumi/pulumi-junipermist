// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingEngagementArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name associated to each tag
        /// </summary>
        [Input("dwellTagNames")]
        public Input<Inputs.SettingEngagementDwellTagNamesArgs>? DwellTagNames { get; set; }

        /// <summary>
        /// add tags to visits within the duration (in seconds)
        /// </summary>
        [Input("dwellTags")]
        public Input<Inputs.SettingEngagementDwellTagsArgs>? DwellTags { get; set; }

        /// <summary>
        /// Days/Hours of operation filter, the available days (mon, tue, wed, thu, fri, sat, sun)
        /// </summary>
        [Input("hours")]
        public Input<Inputs.SettingEngagementHoursArgs>? Hours { get; set; }

        /// <summary>
        /// Max time, default is 43200(12h), max is 68400 (18h)
        /// </summary>
        [Input("maxDwell")]
        public Input<int>? MaxDwell { get; set; }

        /// <summary>
        /// min time
        /// </summary>
        [Input("minDwell")]
        public Input<int>? MinDwell { get; set; }

        public SettingEngagementArgs()
        {
        }
        public static new SettingEngagementArgs Empty => new SettingEngagementArgs();
    }
}
