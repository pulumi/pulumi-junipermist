// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingLedGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("brightness")]
        public Input<int>? Brightness { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public SettingLedGetArgs()
        {
        }
        public static new SettingLedGetArgs Empty => new SettingLedGetArgs();
    }
}
