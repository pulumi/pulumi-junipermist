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
    public sealed class GetIdpprofilesOrgIdpprofileOverwriteMatchingResult
    {
        public readonly ImmutableArray<string> AttackNames;
        public readonly ImmutableArray<string> DstSubnets;
        public readonly ImmutableArray<string> Severities;

        [OutputConstructor]
        private GetIdpprofilesOrgIdpprofileOverwriteMatchingResult(
            ImmutableArray<string> attackNames,

            ImmutableArray<string> dstSubnets,

            ImmutableArray<string> severities)
        {
            AttackNames = attackNames;
            DstSubnets = dstSubnets;
            Severities = severities;
        }
    }
}