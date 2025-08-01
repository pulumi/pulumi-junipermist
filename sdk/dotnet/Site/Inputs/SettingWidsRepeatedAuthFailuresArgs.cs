// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingWidsRepeatedAuthFailuresArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Window where a trigger will be detected and action to be taken (in seconds)
        /// </summary>
        [Input("duration")]
        public Input<int>? Duration { get; set; }

        /// <summary>
        /// Count of events to trigger
        /// </summary>
        [Input("threshold")]
        public Input<int>? Threshold { get; set; }

        public SettingWidsRepeatedAuthFailuresArgs()
        {
        }
        public static new SettingWidsRepeatedAuthFailuresArgs Empty => new SettingWidsRepeatedAuthFailuresArgs();
    }
}
