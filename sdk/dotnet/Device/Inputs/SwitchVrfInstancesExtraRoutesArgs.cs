// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchVrfInstancesExtraRoutesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Next-hop address
        /// </summary>
        [Input("via", required: true)]
        public Input<string> Via { get; set; } = null!;

        public SwitchVrfInstancesExtraRoutesArgs()
        {
        }
        public static new SwitchVrfInstancesExtraRoutesArgs Empty => new SwitchVrfInstancesExtraRoutesArgs();
    }
}
