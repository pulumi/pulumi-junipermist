// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchExtraRoutes6NextQualifiedArgs : global::Pulumi.ResourceArgs
    {
        [Input("metric")]
        public Input<int>? Metric { get; set; }

        [Input("preference")]
        public Input<int>? Preference { get; set; }

        public SwitchExtraRoutes6NextQualifiedArgs()
        {
        }
        public static new SwitchExtraRoutes6NextQualifiedArgs Empty => new SwitchExtraRoutes6NextQualifiedArgs();
    }
}
