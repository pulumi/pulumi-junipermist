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
    public sealed class GetWxtagsOrgWxtagSpecResult
    {
        /// <summary>
        /// Matched destination port, "0" means any
        /// </summary>
        public readonly string PortRange;
        /// <summary>
        /// tcp / udp / icmp / gre / any / ":protocol_number", `protocol_number` is between 1-254
        /// </summary>
        public readonly string Protocol;
        /// <summary>
        /// Matched destination subnets and/or IP Addresses
        /// </summary>
        public readonly ImmutableArray<string> Subnets;

        [OutputConstructor]
        private GetWxtagsOrgWxtagSpecResult(
            string portRange,

            string protocol,

            ImmutableArray<string> subnets)
        {
            PortRange = portRange;
            Protocol = protocol;
            Subnets = subnets;
        }
    }
}
