// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayPortConfigWanExtraRoutesArgs : global::Pulumi.ResourceArgs
    {
        [Input("via")]
        public Input<string>? Via { get; set; }

        public GatewayPortConfigWanExtraRoutesArgs()
        {
        }
        public static new GatewayPortConfigWanExtraRoutesArgs Empty => new GatewayPortConfigWanExtraRoutesArgs();
    }
}
