// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchAclPolicyActionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `allow`, `deny`
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        [Input("dstTag", required: true)]
        public Input<string> DstTag { get; set; } = null!;

        public SwitchAclPolicyActionGetArgs()
        {
        }
        public static new SwitchAclPolicyActionGetArgs Empty => new SwitchAclPolicyActionGetArgs();
    }
}
