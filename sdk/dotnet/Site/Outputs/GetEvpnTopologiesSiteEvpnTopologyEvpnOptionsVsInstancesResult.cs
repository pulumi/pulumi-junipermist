// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Outputs
{

    [OutputType]
    public sealed class GetEvpnTopologiesSiteEvpnTopologyEvpnOptionsVsInstancesResult
    {
        public readonly ImmutableArray<string> Networks;

        [OutputConstructor]
        private GetEvpnTopologiesSiteEvpnTopologyEvpnOptionsVsInstancesResult(ImmutableArray<string> networks)
        {
            Networks = networks;
        }
    }
}
