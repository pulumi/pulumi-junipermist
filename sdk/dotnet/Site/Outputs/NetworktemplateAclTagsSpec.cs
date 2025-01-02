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
    public sealed class NetworktemplateAclTagsSpec
    {
        /// <summary>
        /// matched dst port, "0" means any
        /// </summary>
        public readonly string? PortRange;
        /// <summary>
        /// `tcp` / `udp` / `icmp` / `icmp6` / `gre` / `any` / `:protocol_number`, `protocol_number` is between 1-254, default is `any` `protocol_number` is between 1-254
        /// </summary>
        public readonly string? Protocol;

        [OutputConstructor]
        private NetworktemplateAclTagsSpec(
            string? portRange,

            string? protocol)
        {
            PortRange = portRange;
            Protocol = protocol;
        }
    }
}
