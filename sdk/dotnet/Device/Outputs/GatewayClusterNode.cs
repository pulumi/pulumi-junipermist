// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Outputs
{

    [OutputType]
    public sealed class GatewayClusterNode
    {
        /// <summary>
        /// Gateway MAC Address. Format is `[0-9a-f]{12}` (e.g. "5684dae9ac8b")
        /// </summary>
        public readonly string Mac;

        [OutputConstructor]
        private GatewayClusterNode(string mac)
        {
            Mac = mac;
        }
    }
}
