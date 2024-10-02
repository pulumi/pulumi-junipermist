// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingZoneOccupancyAlertArgs : global::Pulumi.ResourceArgs
    {
        [Input("emailNotifiers")]
        private InputList<string>? _emailNotifiers;

        /// <summary>
        /// list of email addresses to send email notifications when the alert threshold is reached
        /// </summary>
        public InputList<string> EmailNotifiers
        {
            get => _emailNotifiers ?? (_emailNotifiers = new InputList<string>());
            set => _emailNotifiers = value;
        }

        /// <summary>
        /// indicate whether zone occupancy alert is enabled for the site
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// sending zone-occupancy-alert webhook message only if a zone stays non-compliant (i.e. actual occupancy &gt; occupancy_limit) for a minimum duration specified in the threshold, in minutes
        /// </summary>
        [Input("threshold")]
        public Input<int>? Threshold { get; set; }

        public SettingZoneOccupancyAlertArgs()
        {
        }
        public static new SettingZoneOccupancyAlertArgs Empty => new SettingZoneOccupancyAlertArgs();
    }
}