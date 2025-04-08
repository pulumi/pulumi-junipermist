// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Outputs
{

    [OutputType]
    public sealed class GetGatewayStatsDeviceGatewayStatCpu2StatResult
    {
        /// <summary>
        /// Percentage of CPU time that is idle
        /// </summary>
        public readonly double Idle;
        /// <summary>
        /// Percentage of CPU time being used by interrupts
        /// </summary>
        public readonly double Interrupt;
        /// <summary>
        /// Load averages for the last 1, 5, and 15 minutes
        /// </summary>
        public readonly ImmutableArray<double> LoadAvgs;
        /// <summary>
        /// Percentage of CPU time being used by system processes
        /// </summary>
        public readonly double System;
        /// <summary>
        /// Percentage of CPU time being used by user processes
        /// </summary>
        public readonly double User;

        [OutputConstructor]
        private GetGatewayStatsDeviceGatewayStatCpu2StatResult(
            double idle,

            double interrupt,

            ImmutableArray<double> loadAvgs,

            double system,

            double user)
        {
            Idle = idle;
            Interrupt = interrupt;
            LoadAvgs = loadAvgs;
            System = system;
            User = user;
        }
    }
}
