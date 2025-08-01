// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Outputs
{

    [OutputType]
    public sealed class GetWlansOrgWlanCiscoCwaResult
    {
        /// <summary>
        /// List of hostnames without http(s):// (matched by substring)
        /// </summary>
        public readonly ImmutableArray<string> AllowedHostnames;
        /// <summary>
        /// List of CIDRs
        /// </summary>
        public readonly ImmutableArray<string> AllowedSubnets;
        /// <summary>
        /// List of blocked CIDRs
        /// </summary>
        public readonly ImmutableArray<string> BlockedSubnets;
        public readonly bool Enabled;

        [OutputConstructor]
        private GetWlansOrgWlanCiscoCwaResult(
            ImmutableArray<string> allowedHostnames,

            ImmutableArray<string> allowedSubnets,

            ImmutableArray<string> blockedSubnets,

            bool enabled)
        {
            AllowedHostnames = allowedHostnames;
            AllowedSubnets = allowedSubnets;
            BlockedSubnets = blockedSubnets;
            Enabled = enabled;
        }
    }
}
