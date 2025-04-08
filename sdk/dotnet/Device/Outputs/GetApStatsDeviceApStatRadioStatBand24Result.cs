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
    public sealed class GetApStatsDeviceApStatRadioStatBand24Result
    {
        /// <summary>
        /// channel width for the band.enum: `20`, `40`, `80` (only applicable for band_5 and band_6), `160` (only for band_6)
        /// </summary>
        public readonly int Bandwidth;
        /// <summary>
        /// Current channel the radio is running on
        /// </summary>
        public readonly int Channel;
        /// <summary>
        /// Use dynamic chaining for downlink
        /// </summary>
        public readonly bool DynamicChainingEnabled;
        /// <summary>
        /// Radio (base) mac, it can have 16 bssids (e.g. 5c5b350001a0-5c5b350001af)
        /// </summary>
        public readonly string Mac;
        public readonly int NoiseFloor;
        public readonly int NumClients;
        /// <summary>
        /// How many WLANs are applied to the radio
        /// </summary>
        public readonly int NumWlans;
        /// <summary>
        /// Transmit power (in dBm)
        /// </summary>
        public readonly int Power;
        /// <summary>
        /// Amount of traffic received since connection
        /// </summary>
        public readonly int RxBytes;
        /// <summary>
        /// Amount of packets received since connection
        /// </summary>
        public readonly int RxPkts;
        /// <summary>
        /// Amount of traffic sent since connection
        /// </summary>
        public readonly int TxBytes;
        /// <summary>
        /// Amount of packets sent since connection
        /// </summary>
        public readonly int TxPkts;
        public readonly string Usage;
        /// <summary>
        /// All utilization in percentage
        /// </summary>
        public readonly int UtilAll;
        /// <summary>
        /// Reception of "No Packets" utilization in percentage, received frames with invalid PLCPs and CRS glitches as noise
        /// </summary>
        public readonly int UtilNonWifi;
        /// <summary>
        /// Reception of "In BSS" utilization in percentage, only frames that are received from AP/STAs within the BSS
        /// </summary>
        public readonly int UtilRxInBss;
        /// <summary>
        /// Reception of "Other BSS" utilization in percentage, all frames received from AP/STAs that are outside the BSS
        /// </summary>
        public readonly int UtilRxOtherBss;
        /// <summary>
        /// Transmission utilization in percentage
        /// </summary>
        public readonly int UtilTx;
        /// <summary>
        /// Reception of "UnDecodable Wifi" utilization in percentage, only Preamble, PLCP header is decoded, Rest is undecodable in this radio
        /// </summary>
        public readonly int UtilUndecodableWifi;
        /// <summary>
        /// Reception of "No Category" utilization in percentage, all 802.11 frames that are corrupted at the receiver
        /// </summary>
        public readonly int UtilUnknownWifi;

        [OutputConstructor]
        private GetApStatsDeviceApStatRadioStatBand24Result(
            int bandwidth,

            int channel,

            bool dynamicChainingEnabled,

            string mac,

            int noiseFloor,

            int numClients,

            int numWlans,

            int power,

            int rxBytes,

            int rxPkts,

            int txBytes,

            int txPkts,

            string usage,

            int utilAll,

            int utilNonWifi,

            int utilRxInBss,

            int utilRxOtherBss,

            int utilTx,

            int utilUndecodableWifi,

            int utilUnknownWifi)
        {
            Bandwidth = bandwidth;
            Channel = channel;
            DynamicChainingEnabled = dynamicChainingEnabled;
            Mac = mac;
            NoiseFloor = noiseFloor;
            NumClients = numClients;
            NumWlans = numWlans;
            Power = power;
            RxBytes = rxBytes;
            RxPkts = rxPkts;
            TxBytes = txBytes;
            TxPkts = txPkts;
            Usage = usage;
            UtilAll = utilAll;
            UtilNonWifi = utilNonWifi;
            UtilRxInBss = utilRxInBss;
            UtilRxOtherBss = utilRxOtherBss;
            UtilTx = utilTx;
            UtilUndecodableWifi = utilUndecodableWifi;
            UtilUnknownWifi = utilUnknownWifi;
        }
    }
}
