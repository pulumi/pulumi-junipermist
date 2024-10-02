// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Outputs
{

    [OutputType]
    public sealed class WlanCoaServer
    {
        /// <summary>
        /// whether to disable Event-Timestamp Check
        /// </summary>
        public readonly bool? DisableEventTimestampCheck;
        public readonly bool? Enabled;
        public readonly string Ip;
        public readonly int? Port;
        public readonly string Secret;

        [OutputConstructor]
        private WlanCoaServer(
            bool? disableEventTimestampCheck,

            bool? enabled,

            string ip,

            int? port,

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