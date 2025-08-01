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
    public sealed class SettingSleThresholds
    {
        /// <summary>
        /// Capacity, in %
        /// </summary>
        public readonly int? Capacity;
        /// <summary>
        /// Coverage, in dBm
        /// </summary>
        public readonly int? Coverage;
        /// <summary>
        /// Throughput, in Mbps
        /// </summary>
        public readonly int? Throughput;
        /// <summary>
        /// Time to connect, in seconds
        /// </summary>
        public readonly int? Timetoconnect;

        [OutputConstructor]
        private SettingSleThresholds(
            int? capacity,

            int? coverage,

            int? throughput,

            int? timetoconnect)
        {
            Capacity = capacity;
            Coverage = coverage;
            Throughput = throughput;
            Timetoconnect = timetoconnect;
        }
    }
}
