// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingProxyGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("url")]
        public Input<string>? Url { get; set; }

        public SettingProxyGetArgs()
        {
        }
        public static new SettingProxyGetArgs Empty => new SettingProxyGetArgs();
    }
}
