// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingSyntheticTestWanSpeedtestGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// `any` / HH:MM (24-hour format)
        /// </summary>
        [Input("timeOfDay")]
        public Input<string>? TimeOfDay { get; set; }

        public SettingSyntheticTestWanSpeedtestGetArgs()
        {
        }
        public static new SettingSyntheticTestWanSpeedtestGetArgs Empty => new SettingSyntheticTestWanSpeedtestGetArgs();
    }
}
