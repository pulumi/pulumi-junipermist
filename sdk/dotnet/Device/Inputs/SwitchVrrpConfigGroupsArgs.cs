// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchVrrpConfigGroupsArgs : global::Pulumi.ResourceArgs
    {
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        public SwitchVrrpConfigGroupsArgs()
        {
        }
        public static new SwitchVrrpConfigGroupsArgs Empty => new SwitchVrrpConfigGroupsArgs();
    }
}
