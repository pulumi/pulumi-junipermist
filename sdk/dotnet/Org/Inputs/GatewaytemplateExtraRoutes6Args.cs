// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplateExtraRoutes6Args : global::Pulumi.ResourceArgs
    {
        [Input("via", required: true)]
        public Input<string> Via { get; set; } = null!;

        public GatewaytemplateExtraRoutes6Args()
        {
        }
        public static new GatewaytemplateExtraRoutes6Args Empty => new GatewaytemplateExtraRoutes6Args();
    }
}
