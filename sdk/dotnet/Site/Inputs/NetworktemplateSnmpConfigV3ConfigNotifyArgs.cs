// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplateSnmpConfigV3ConfigNotifyArgs : global::Pulumi.ResourceArgs
    {
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("tag", required: true)]
        public Input<string> Tag { get; set; } = null!;

        /// <summary>
        /// enum: `inform`, `trap`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public NetworktemplateSnmpConfigV3ConfigNotifyArgs()
        {
        }
        public static new NetworktemplateSnmpConfigV3ConfigNotifyArgs Empty => new NetworktemplateSnmpConfigV3ConfigNotifyArgs();
    }
}
