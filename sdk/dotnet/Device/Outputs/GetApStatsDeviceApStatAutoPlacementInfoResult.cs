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
    public sealed class GetApStatsDeviceApStatAutoPlacementInfoResult
    {
        /// <summary>
        /// All APs sharing a given cluster number can be placed relative to each other
        /// </summary>
        public readonly int ClusterNumber;
        /// <summary>
        /// The orientation of an AP
        /// </summary>
        public readonly int OrientationStats;
        /// <summary>
        /// Coordinates representing a circle where the AP is most likely exists in the event of an inaccurate placement result
        /// </summary>
        public readonly Outputs.GetApStatsDeviceApStatAutoPlacementInfoProbabilitySurfaceResult ProbabilitySurface;

        [OutputConstructor]
        private GetApStatsDeviceApStatAutoPlacementInfoResult(
            int clusterNumber,

            int orientationStats,

            Outputs.GetApStatsDeviceApStatAutoPlacementInfoProbabilitySurfaceResult probabilitySurface)
        {
            ClusterNumber = clusterNumber;
            OrientationStats = orientationStats;
            ProbabilitySurface = probabilitySurface;
        }
    }
}
