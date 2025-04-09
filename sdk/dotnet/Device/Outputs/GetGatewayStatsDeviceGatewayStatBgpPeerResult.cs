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
    public sealed class GetGatewayStatsDeviceGatewayStatBgpPeerResult
    {
        /// <summary>
        /// If this is created for evpn overlay
        /// </summary>
        public readonly bool EvpnOverlay;
        /// <summary>
        /// If this is created for overlay
        /// </summary>
        public readonly bool ForOverlay;
        public readonly string LocalAs;
        public readonly string Neighbor;
        public readonly string NeighborAs;
        /// <summary>
        /// If it's another device in the same org
        /// </summary>
        public readonly string NeighborMac;
        /// <summary>
        /// Node0/node1
        /// </summary>
        public readonly string Node;
        /// <summary>
        /// Amount of packets received since connection
        /// </summary>
        public readonly int RxPkts;
        /// <summary>
        /// Number of received routes
        /// </summary>
        public readonly int RxRoutes;
        /// <summary>
        /// enum: `active`, `connect`, `established`, `idle`, `open_config`, `open_sent`
        /// </summary>
        public readonly string State;
        /// <summary>
        /// Epoch (seconds)
        /// </summary>
        public readonly double Timestamp;
        /// <summary>
        /// Amount of packets sent since connection
        /// </summary>
        public readonly int TxPkts;
        public readonly int TxRoutes;
        public readonly bool Up;
        public readonly int Uptime;
        public readonly string VrfName;

        [OutputConstructor]
        private GetGatewayStatsDeviceGatewayStatBgpPeerResult(
            bool evpnOverlay,

            bool forOverlay,

            string localAs,

            string neighbor,

            string neighborAs,

            string neighborMac,

            string node,

            int rxPkts,

            int rxRoutes,

            string state,

            double timestamp,

            int txPkts,

            int txRoutes,

            bool up,

            int uptime,

            string vrfName)
        {
            EvpnOverlay = evpnOverlay;
            ForOverlay = forOverlay;
            LocalAs = localAs;
            Neighbor = neighbor;
            NeighborAs = neighborAs;
            NeighborMac = neighborMac;
            Node = node;
            RxPkts = rxPkts;
            RxRoutes = rxRoutes;
            State = state;
            Timestamp = timestamp;
            TxPkts = txPkts;
            TxRoutes = txRoutes;
            Up = up;
            Uptime = uptime;
            VrfName = vrfName;
        }
    }
}
