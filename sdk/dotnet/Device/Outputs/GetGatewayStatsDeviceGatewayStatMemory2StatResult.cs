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
    public sealed class GetGatewayStatsDeviceGatewayStatMemory2StatResult
    {
        public readonly double Usage;

        [OutputConstructor]
        private GetGatewayStatsDeviceGatewayStatMemory2StatResult(double usage)
        {
            Usage = usage;
        }
    }
}
