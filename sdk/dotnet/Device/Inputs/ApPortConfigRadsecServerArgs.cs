// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class ApPortConfigRadsecServerArgs : global::Pulumi.ResourceArgs
    {
        [Input("host")]
        public Input<string>? Host { get; set; }

        [Input("port")]
        public Input<int>? Port { get; set; }

        public ApPortConfigRadsecServerArgs()
        {
        }
        public static new ApPortConfigRadsecServerArgs Empty => new ApPortConfigRadsecServerArgs();
    }
}
