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
    public sealed class GetGatewayStatsDeviceGatewayStatModule2StatPsusResult
    {
        public readonly string Name;
        public readonly string Status;

        [OutputConstructor]
        private GetGatewayStatsDeviceGatewayStatModule2StatPsusResult(
            string name,

            string status)
        {
            Name = name;
            Status = status;
        }
    }
}
