// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingEngagementDwellTagsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Default to `301-14400`
        /// </summary>
        [Input("bounce")]
        public Input<string>? Bounce { get; set; }

        /// <summary>
        /// Default to `14401-28800`
        /// </summary>
        [Input("engaged")]
        public Input<string>? Engaged { get; set; }

        /// <summary>
        /// Default to `1-300`
        /// </summary>
        [Input("passerby")]
        public Input<string>? Passerby { get; set; }

        /// <summary>
        /// Default to `28801-42000`
        /// </summary>
        [Input("stationed")]
        public Input<string>? Stationed { get; set; }

        public SettingEngagementDwellTagsArgs()
        {
        }
        public static new SettingEngagementDwellTagsArgs Empty => new SettingEngagementDwellTagsArgs();
    }
}
