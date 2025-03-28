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
    public sealed class DeviceprofileGatewayBgpConfigNeighbors
    {
        /// <summary>
        /// If true, the BGP session to this neighbor will be administratively disabled/shutdown
        /// </summary>
        public readonly bool? Disabled;
        public readonly string? ExportPolicy;
        public readonly int? HoldTime;
        public readonly string? ImportPolicy;
        /// <summary>
        /// Assuming BGP neighbor is directly connected
        /// </summary>
        public readonly int? MultihopTtl;
        public readonly int? NeighborAs;

        [OutputConstructor]
        private DeviceprofileGatewayBgpConfigNeighbors(
            bool? disabled,

            string? exportPolicy,

            int? holdTime,

            string? importPolicy,

            int? multihopTtl,

            int? neighborAs)
        {
            Disabled = disabled;
            ExportPolicy = exportPolicy;
            HoldTime = holdTime;
            ImportPolicy = importPolicy;
            MultihopTtl = multihopTtl;
            NeighborAs = neighborAs;
        }
    }
}
