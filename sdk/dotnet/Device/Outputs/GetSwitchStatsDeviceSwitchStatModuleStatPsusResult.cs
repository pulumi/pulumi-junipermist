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
    public sealed class GetSwitchStatsDeviceSwitchStatModuleStatPsusResult
    {
        public readonly string Name;
        public readonly string Status;

        [OutputConstructor]
        private GetSwitchStatsDeviceSwitchStatModuleStatPsusResult(
            string name,

            string status)
        {
            Name = name;
            Status = status;
        }
    }
}
