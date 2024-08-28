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
    public sealed class GetGatewayStatsDeviceGatewayStatArpTableStatsResult
    {
        public readonly int ArpTableCount;
        public readonly int MaxEntriesSupported;

        [OutputConstructor]
        private GetGatewayStatsDeviceGatewayStatArpTableStatsResult(
            int arpTableCount,

            int maxEntriesSupported)
        {
            ArpTableCount = arpTableCount;
            MaxEntriesSupported = maxEntriesSupported;
        }
    }
}