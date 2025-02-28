// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplateSnmpConfigV3ConfigTargetParameterGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `v1`, `v2c`, `v3`
        /// </summary>
        [Input("messageProcessingModel", required: true)]
        public Input<string> MessageProcessingModel { get; set; } = null!;

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Refer to profile-name in notify_filter
        /// </summary>
        [Input("notifyFilter")]
        public Input<string>? NotifyFilter { get; set; }

        /// <summary>
        /// enum: `authentication`, `none`, `privacy`
        /// </summary>
        [Input("securityLevel")]
        public Input<string>? SecurityLevel { get; set; }

        /// <summary>
        /// enum: `usm`, `v1`, `v2c`
        /// </summary>
        [Input("securityModel")]
        public Input<string>? SecurityModel { get; set; }

        /// <summary>
        /// Refer to security_name in usm
        /// </summary>
        [Input("securityName")]
        public Input<string>? SecurityName { get; set; }

        public NetworktemplateSnmpConfigV3ConfigTargetParameterGetArgs()
        {
        }
        public static new NetworktemplateSnmpConfigV3ConfigTargetParameterGetArgs Empty => new NetworktemplateSnmpConfigV3ConfigTargetParameterGetArgs();
    }
}
