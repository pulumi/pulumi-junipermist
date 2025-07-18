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
    public sealed class GetGatewayStatsDeviceGatewayStatIf2StatResult
    {
        public readonly string AddressMode;
        public readonly ImmutableArray<string> Ips;
        public readonly ImmutableArray<string> NatAddresses;
        public readonly string NetworkName;
        public readonly string PortId;
        public readonly string PortUsage;
        public readonly string RedundancyState;
        /// <summary>
        /// Amount of traffic received since connection
        /// </summary>
        public readonly int RxBytes;
        /// <summary>
        /// Amount of packets received since connection
        /// </summary>
        public readonly int RxPkts;
        public readonly Outputs.GetGatewayStatsDeviceGatewayStatIf2StatServpInfoResult ServpInfo;
        /// <summary>
        /// Amount of traffic sent since connection
        /// </summary>
        public readonly int TxBytes;
        /// <summary>
        /// Amount of packets sent since connection
        /// </summary>
        public readonly int TxPkts;
        public readonly bool Up;
        public readonly int Vlan;
        public readonly string WanName;
        public readonly string WanType;

        [OutputConstructor]
        private GetGatewayStatsDeviceGatewayStatIf2StatResult(
            string addressMode,

            ImmutableArray<string> ips,

            ImmutableArray<string> natAddresses,

            string networkName,

            string portId,

            string portUsage,

            string redundancyState,

            int rxBytes,

            int rxPkts,

            Outputs.GetGatewayStatsDeviceGatewayStatIf2StatServpInfoResult servpInfo,

            int txBytes,

            int txPkts,

            bool up,

            int vlan,

            string wanName,

            string wanType)
        {
            AddressMode = addressMode;
            Ips = ips;
            NatAddresses = natAddresses;
            NetworkName = networkName;
            PortId = portId;
            PortUsage = portUsage;
            RedundancyState = redundancyState;
            RxBytes = rxBytes;
            RxPkts = rxPkts;
            ServpInfo = servpInfo;
            TxBytes = txBytes;
            TxPkts = txPkts;
            Up = up;
            Vlan = vlan;
            WanName = wanName;
            WanType = wanType;
        }
    }
}
