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
    public sealed class DeviceprofileGatewayTunnelConfigsProbe
    {
        /// <summary>
        /// How often to trigger the probe
        /// </summary>
        public readonly int? Interval;
        /// <summary>
        /// Number of consecutive misses before declaring the tunnel down
        /// </summary>
        public readonly int? Threshold;
        /// <summary>
        /// Time within which to complete the connectivity check
        /// </summary>
        public readonly int? Timeout;
        /// <summary>
        /// enum: `http`, `icmp`
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private DeviceprofileGatewayTunnelConfigsProbe(
            int? interval,

            int? threshold,

            int? timeout,

            string? type)
        {
            Interval = interval;
            Threshold = threshold;
            Timeout = timeout;
            Type = type;
        }
    }
}
