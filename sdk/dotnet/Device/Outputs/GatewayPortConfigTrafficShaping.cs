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
    public sealed class GatewayPortConfigTrafficShaping
    {
        /// <summary>
        /// percentages for differet class of traffic: high / medium / low / best-effort. Sum must be equal to 100
        /// </summary>
        public readonly ImmutableArray<int> ClassPercentages;
        public readonly bool? Enabled;
        /// <summary>
        /// Interface Transmit Cap in kbps
        /// </summary>
        public readonly int? MaxTxKbps;

        [OutputConstructor]
        private GatewayPortConfigTrafficShaping(
            ImmutableArray<int> classPercentages,

            bool? enabled,

            int? maxTxKbps)
        {
            ClassPercentages = classPercentages;
            Enabled = enabled;
            MaxTxKbps = maxTxKbps;
        }
    }
}
