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
    public sealed class NetworktemplateSnmpConfigV3ConfigVacmAccess
    {
        public readonly string? GroupName;
        public readonly ImmutableArray<Outputs.NetworktemplateSnmpConfigV3ConfigVacmAccessPrefixList> PrefixLists;

        [OutputConstructor]
        private NetworktemplateSnmpConfigV3ConfigVacmAccess(
            string? groupName,

            ImmutableArray<Outputs.NetworktemplateSnmpConfigV3ConfigVacmAccessPrefixList> prefixLists)
        {
            GroupName = groupName;
            PrefixLists = prefixLists;
        }
    }
}
