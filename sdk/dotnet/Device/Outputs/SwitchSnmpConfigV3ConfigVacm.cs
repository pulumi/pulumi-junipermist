// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Outputs
{

    [OutputType]
    public sealed class SwitchSnmpConfigV3ConfigVacm
    {
        public readonly ImmutableArray<Outputs.SwitchSnmpConfigV3ConfigVacmAccess> Accesses;
        public readonly Outputs.SwitchSnmpConfigV3ConfigVacmSecurityToGroup? SecurityToGroup;

        [OutputConstructor]
        private SwitchSnmpConfigV3ConfigVacm(
            ImmutableArray<Outputs.SwitchSnmpConfigV3ConfigVacmAccess> accesses,

            Outputs.SwitchSnmpConfigV3ConfigVacmSecurityToGroup? securityToGroup)
        {
            Accesses = accesses;
            SecurityToGroup = securityToGroup;
        }
    }
}
