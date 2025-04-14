// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Outputs
{

    [OutputType]
    public sealed class WlanCoaServer
    {
        /// <summary>
        /// Whether to disable Event-Timestamp Check
        /// </summary>
        public readonly bool? DisableEventTimestampCheck;
        public readonly bool? Enabled;
        public readonly string Ip;
        public readonly string? Port;
        public readonly string Secret;

        [OutputConstructor]
        private WlanCoaServer(
            bool? disableEventTimestampCheck,

            bool? enabled,

            string ip,

            string? port,

            string secret)
        {
            DisableEventTimestampCheck = disableEventTimestampCheck;
            Enabled = enabled;
            Ip = ip;
            Port = port;
            Secret = secret;
        }
    }
}
