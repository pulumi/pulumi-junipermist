// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingVnaGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable Virtual Network Assistant (using SUB-VNA license). This applied to AP / Switch / Gateway
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public SettingVnaGetArgs()
        {
        }
        public static new SettingVnaGetArgs Empty => new SettingVnaGetArgs();
    }
}
