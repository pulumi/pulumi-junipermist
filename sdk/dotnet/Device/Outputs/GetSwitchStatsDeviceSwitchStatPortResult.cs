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
    public sealed class GetSwitchStatsDeviceSwitchStatPortResult
    {
        /// <summary>
        /// Indicates if interface is active/inactive
        /// </summary>
        public readonly bool Active;
        /// <summary>
        /// if `up`==`true` and has Authenticator role. enum: `authenticated`, `authenticating`, `held`, `init`
        /// </summary>
        public readonly string AuthState;
        /// <summary>
        /// Indicates if interface is disabled
        /// </summary>
        public readonly bool Disabled;
        public readonly bool ForSite;
        /// <summary>
        /// Indicates full or half duplex
        /// </summary>
        public readonly bool FullDuplex;
        /// <summary>
        /// Last sampled jitter of the interface
        /// </summary>
        public readonly double Jitter;
        /// <summary>
        /// Indicates when the port was last flapped
        /// </summary>
        public readonly double LastFlapped;
        /// <summary>
        /// Last sampled latency of the interface
        /// </summary>
        public readonly double Latency;
        /// <summary>
        /// Last sampled loss of the interface
        /// </summary>
        public readonly double Loss;
        /// <summary>
        /// LTE ICCID value, Check for null/empty
        /// </summary>
        public readonly string LteIccid;
        /// <summary>
        /// LTE IMEI value, Check for null/empty
        /// </summary>
        public readonly string LteImei;
        /// <summary>
        /// LTE IMSI value, Check for null/empty
        /// </summary>
        public readonly string LteImsi;
        public readonly string Mac;
        /// <summary>
        /// Number of mac addresses in the forwarding table
        /// </summary>
        public readonly int MacCount;
        /// <summary>
        /// Limit on number of dynamically learned macs
        /// </summary>
        public readonly int MacLimit;
        /// <summary>
        /// chassis identifier of the chassis type listed
        /// </summary>
        public readonly string NeighborMac;
        /// <summary>
        /// Description supplied by the system on the interface E.g. "GigabitEthernet2/0/39"
        /// </summary>
        public readonly string NeighborPortDesc;
        /// <summary>
        /// Name supplied by the system on the interface E.g. neighbor system name E.g. "Kumar-Acc-SW.mist.local"
        /// </summary>
        public readonly string NeighborSystemName;
        public readonly string OrgId;
        /// <summary>
        /// Is the POE disabled
        /// </summary>
        public readonly bool PoeDisabled;
        /// <summary>
        /// enum: `802.3af`, `802.3at`, `802.3bt`
        /// </summary>
        public readonly string PoeMode;
        /// <summary>
        /// Is the device attached to POE
        /// </summary>
        public readonly bool PoeOn;
        public readonly string PortId;
        /// <summary>
        /// Interface MAC address
        /// </summary>
        public readonly string PortMac;
        /// <summary>
        /// gateway port usage. enum: `lan`
        /// </summary>
        public readonly string PortUsage;
        /// <summary>
        /// Amount of power being used by the interface at the time the command is executed. Unit in watts.
        /// </summary>
        public readonly double PowerDraw;
        /// <summary>
        /// Broadcast input packets
        /// </summary>
        public readonly int RxBcastPkts;
        /// <summary>
        /// Rate of receiving traffic, bits/seconds, last known
        /// </summary>
        public readonly int RxBps;
        /// <summary>
        /// Amount of traffic received since connection
        /// </summary>
        public readonly int RxBytes;
        /// <summary>
        /// Input errors
        /// </summary>
        public readonly int RxErrors;
        /// <summary>
        /// Multicast input packets
        /// </summary>
        public readonly int RxMcastPkts;
        /// <summary>
        /// Amount of packets received since connection
        /// </summary>
        public readonly int RxPkts;
        public readonly string SiteId;
        /// <summary>
        /// Port speed
        /// </summary>
        public readonly int Speed;
        /// <summary>
        /// if `up`==`true`. enum: `alternate`, `backup`, `designated`, `root`, `root-prevented`
        /// </summary>
        public readonly string StpRole;
        /// <summary>
        /// if `up`==`true`. enum: `blocking`, `disabled`, `forwarding`, `learning`, `listening`
        /// </summary>
        public readonly string StpState;
        /// <summary>
        /// Broadcast output packets
        /// </summary>
        public readonly int TxBcastPkts;
        /// <summary>
        /// Rate of transmitting traffic, bits/seconds, last known
        /// </summary>
        public readonly int TxBps;
        /// <summary>
        /// Amount of traffic sent since connection
        /// </summary>
        public readonly int TxBytes;
        /// <summary>
        /// Output errors
        /// </summary>
        public readonly int TxErrors;
        /// <summary>
        /// Multicast output packets
        /// </summary>
        public readonly int TxMcastPkts;
        /// <summary>
        /// Amount of packets sent since connection
        /// </summary>
        public readonly int TxPkts;
        /// <summary>
        /// device type. enum: `ap`, `ble`, `gateway`, `mxedge`, `nac`, `switch`
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Indicates if interface is unconfigured
        /// </summary>
        public readonly bool Unconfigured;
        /// <summary>
        /// Indicates if interface is up
        /// </summary>
        public readonly bool Up;
        /// <summary>
        /// Optic Slot ModelName, Check for null/empty
        /// </summary>
        public readonly string XcvrModel;
        /// <summary>
        /// Optic Slot Partnumber, Check for null/empty
        /// </summary>
        public readonly string XcvrPartNumber;
        /// <summary>
        /// Optic Slot SerialNumber, Check for null/empty
        /// </summary>
        public readonly string XcvrSerial;

        [OutputConstructor]
        private GetSwitchStatsDeviceSwitchStatPortResult(
            bool active,

            string authState,

            bool disabled,

            bool forSite,

            bool fullDuplex,

            double jitter,

            double lastFlapped,

            double latency,

            double loss,

            string lteIccid,

            string lteImei,

            string lteImsi,

            string mac,

            int macCount,

            int macLimit,

            string neighborMac,

            string neighborPortDesc,

            string neighborSystemName,

            string orgId,

            bool poeDisabled,

            string poeMode,

            bool poeOn,

            string portId,

            string portMac,

            string portUsage,

            double powerDraw,

            int rxBcastPkts,

            int rxBps,

            int rxBytes,

            int rxErrors,

            int rxMcastPkts,

            int rxPkts,

            string siteId,

            int speed,

            string stpRole,

            string stpState,

            int txBcastPkts,

            int txBps,

            int txBytes,

            int txErrors,

            int txMcastPkts,

            int txPkts,

            string type,

            bool unconfigured,

            bool up,

            string xcvrModel,

            string xcvrPartNumber,

            string xcvrSerial)
        {
            Active = active;
            AuthState = authState;
            Disabled = disabled;
            ForSite = forSite;
            FullDuplex = fullDuplex;
            Jitter = jitter;
            LastFlapped = lastFlapped;
            Latency = latency;
            Loss = loss;
            LteIccid = lteIccid;
            LteImei = lteImei;
            LteImsi = lteImsi;
            Mac = mac;
            MacCount = macCount;
            MacLimit = macLimit;
            NeighborMac = neighborMac;
            NeighborPortDesc = neighborPortDesc;
            NeighborSystemName = neighborSystemName;
            OrgId = orgId;
            PoeDisabled = poeDisabled;
            PoeMode = poeMode;
            PoeOn = poeOn;
            PortId = portId;
            PortMac = portMac;
            PortUsage = portUsage;
            PowerDraw = powerDraw;
            RxBcastPkts = rxBcastPkts;
            RxBps = rxBps;
            RxBytes = rxBytes;
            RxErrors = rxErrors;
            RxMcastPkts = rxMcastPkts;
            RxPkts = rxPkts;
            SiteId = siteId;
            Speed = speed;
            StpRole = stpRole;
            StpState = stpState;
            TxBcastPkts = txBcastPkts;
            TxBps = txBps;
            TxBytes = txBytes;
            TxErrors = txErrors;
            TxMcastPkts = txMcastPkts;
            TxPkts = txPkts;
            Type = type;
            Unconfigured = unconfigured;
            Up = up;
            XcvrModel = xcvrModel;
            XcvrPartNumber = xcvrPartNumber;
            XcvrSerial = xcvrSerial;
        }
    }
}
