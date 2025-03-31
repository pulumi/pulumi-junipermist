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
    public sealed class GetApStatsDeviceApStatMeshUplinkResult
    {
        public readonly string Band;
        public readonly int Channel;
        public readonly int IdleTime;
        /// <summary>
        /// Last seen timestamp
        /// </summary>
        public readonly double LastSeen;
        public readonly string Proto;
        public readonly int Rssi;
        /// <summary>
        /// Rate of receiving traffic, bits/seconds, last known
        /// </summary>
        public readonly int RxBps;
        /// <summary>
        /// Amount of traffic received since connection
        /// </summary>
        public readonly int RxBytes;
        /// <summary>
        /// Amount of packets received since connection
        /// </summary>
        public readonly int RxPackets;
        /// <summary>
        /// RX Rate, Mbps
        /// </summary>
        public readonly double RxRate;
        /// <summary>
        /// Amount of rx retries
        /// </summary>
        public readonly int RxRetries;
        public readonly string SiteId;
        public readonly int Snr;
        /// <summary>
        /// Rate of transmitting traffic, bits/seconds, last known
        /// </summary>
        public readonly int TxBps;
        /// <summary>
        /// Amount of traffic sent since connection
        /// </summary>
        public readonly int TxBytes;
        /// <summary>
        /// Amount of packets sent since connection
        /// </summary>
        public readonly int TxPackets;
        /// <summary>
        /// TX Rate, Mbps
        /// </summary>
        public readonly double TxRate;
        /// <summary>
        /// Amount of tx retries
        /// </summary>
        public readonly int TxRetries;
        public readonly string UplinkApId;

        [OutputConstructor]
        private GetApStatsDeviceApStatMeshUplinkResult(
            string band,

            int channel,

            int idleTime,

            double lastSeen,

            string proto,

            int rssi,

            int rxBps,

            int rxBytes,

            int rxPackets,

            double rxRate,

            int rxRetries,

            string siteId,

            int snr,

            int txBps,

            int txBytes,

            int txPackets,

            double txRate,

            int txRetries,

            string uplinkApId)
        {
            Band = band;
            Channel = channel;
            IdleTime = idleTime;
            LastSeen = lastSeen;
            Proto = proto;
            Rssi = rssi;
            RxBps = rxBps;
            RxBytes = rxBytes;
            RxPackets = rxPackets;
            RxRate = rxRate;
            RxRetries = rxRetries;
            SiteId = siteId;
            Snr = snr;
            TxBps = txBps;
            TxBytes = txBytes;
            TxPackets = txPackets;
            TxRate = txRate;
            TxRetries = txRetries;
            UplinkApId = uplinkApId;
        }
    }
}
