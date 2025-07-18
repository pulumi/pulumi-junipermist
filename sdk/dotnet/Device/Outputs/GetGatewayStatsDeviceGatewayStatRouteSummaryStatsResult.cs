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
    public sealed class GetGatewayStatsDeviceGatewayStatRouteSummaryStatsResult
    {
        public readonly int FibRoutes;
        public readonly int MaxUnicastRoutesSupported;
        public readonly int RibRoutes;
        public readonly int TotalRoutes;

        [OutputConstructor]
        private GetGatewayStatsDeviceGatewayStatRouteSummaryStatsResult(
            int fibRoutes,

            int maxUnicastRoutesSupported,

            int ribRoutes,

            int totalRoutes)
        {
            FibRoutes = fibRoutes;
            MaxUnicastRoutesSupported = maxUnicastRoutesSupported;
            RibRoutes = ribRoutes;
            TotalRoutes = totalRoutes;
        }
    }
}
