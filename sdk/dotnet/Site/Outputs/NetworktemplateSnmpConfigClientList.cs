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
    public sealed class NetworktemplateSnmpConfigClientList
    {
        public readonly string? ClientListName;
        public readonly ImmutableArray<string> Clients;

        [OutputConstructor]
        private NetworktemplateSnmpConfigClientList(
            string? clientListName,

            ImmutableArray<string> clients)
        {
            ClientListName = clientListName;
            Clients = clients;
        }
    }
}
