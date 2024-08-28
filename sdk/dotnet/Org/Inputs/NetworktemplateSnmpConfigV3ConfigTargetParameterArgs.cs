// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class NetworktemplateSnmpConfigV3ConfigTargetParameterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `v1`, `v2c`, `v3`
        /// </summary>
        [Input("messageProcessingModel")]
        public Input<string>? MessageProcessingModel { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// refer to profile-name in notify_filter
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
        /// refer to security_name in usm
        /// </summary>
        [Input("securityName")]
        public Input<string>? SecurityName { get; set; }

        public NetworktemplateSnmpConfigV3ConfigTargetParameterArgs()
        {
        }
        public static new NetworktemplateSnmpConfigV3ConfigTargetParameterArgs Empty => new NetworktemplateSnmpConfigV3ConfigTargetParameterArgs();
    }
}