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
    public sealed class GetApStatsDeviceApStatResult
    {
        public readonly Outputs.GetApStatsDeviceApStatAutoPlacementResult AutoPlacement;
        public readonly Outputs.GetApStatsDeviceApStatAutoUpgradeStatResult AutoUpgradeStat;
        public readonly Outputs.GetApStatsDeviceApStatBleStatResult BleStat;
        public readonly double CertExpiry;
        public readonly bool ConfigReverted;
        public readonly int CpuSystem;
        public readonly int CpuUtil;
        public readonly int CreatedTime;
        public readonly string DeviceprofileId;
        /// <summary>
        /// device environment, including CPU temperature, Ambient temperature, Humidity, Attitude, Pressure, Accelerometers, Magnetometers and vCore Voltage
        /// </summary>
        public readonly Outputs.GetApStatsDeviceApStatEnvStatResult EnvStat;
        public readonly Outputs.GetApStatsDeviceApStatEslStatResult EslStat;
        public readonly string ExtIp;
        public readonly Outputs.GetApStatsDeviceApStatFwupdateResult Fwupdate;
        public readonly string HwRev;
        public readonly string Id;
        public readonly ImmutableArray<int> InactiveWiredVlans;
        public readonly ImmutableDictionary<string, Outputs.GetApStatsDeviceApStatIotStatResult> IotStat;
        public readonly string Ip;
        /// <summary>
        /// IP AP settings
        /// </summary>
        public readonly Outputs.GetApStatsDeviceApStatIpConfigResult IpConfig;
        public readonly Outputs.GetApStatsDeviceApStatIpStatResult IpStat;
        /// <summary>
        /// l2tp tunnel status (key is the wxtunnel*id)
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GetApStatsDeviceApStatL2tpStatResult> L2tpStat;
        /// <summary>
        /// last seen timestamp
        /// </summary>
        public readonly double LastSeen;
        /// <summary>
        /// last trouble code of switch
        /// </summary>
        public readonly Outputs.GetApStatsDeviceApStatLastTroubleResult LastTrouble;
        /// <summary>
        /// LED AP settings
        /// </summary>
        public readonly Outputs.GetApStatsDeviceApStatLedResult Led;
        /// <summary>
        /// LLDP Stat (neighbor information, power negotiations)
        /// </summary>
        public readonly Outputs.GetApStatsDeviceApStatLldpStatResult LldpStat;
        public readonly bool Locating;
        /// <summary>
        /// whether this AP is considered locked (placement / orientation has been vetted)
        /// </summary>
        public readonly bool Locked;
        /// <summary>
        /// device mac
        /// </summary>
        public readonly string Mac;
        public readonly string MapId;
        public readonly int MemUsedKb;
        /// <summary>
        /// Property key is the mesh downlink id (e.g `00000000-0000-0000-1000-5c5b35000010`)
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GetApStatsDeviceApStatMeshDownlinksResult> MeshDownlinks;
        public readonly Outputs.GetApStatsDeviceApStatMeshUplinkResult MeshUplink;
        /// <summary>
        /// device model
        /// </summary>
        public readonly string Model;
        public readonly int ModifiedTime;
        public readonly string Mount;
        public readonly string Name;
        public readonly string Notes;
        /// <summary>
        /// how many wireless clients are currently connected
        /// </summary>
        public readonly int NumClients;
        public readonly string OrgId;
        /// <summary>
        /// Property key is the port name (e.g. `eth0`)
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GetApStatsDeviceApStatPortStatResult> PortStat;
        /// <summary>
        /// in mW, surplus if positive or deficit if negative
        /// </summary>
        public readonly int PowerBudget;
        /// <summary>
        /// whether insufficient power
        /// </summary>
        public readonly bool PowerConstrained;
        /// <summary>
        /// constrained mode
        /// </summary>
        public readonly string PowerOpmode;
        /// <summary>
        /// DC Input / PoE 802.3at / PoE 802.3af / LLDP / ? (unknown)
        /// </summary>
        public readonly string PowerSrc;
        public readonly Outputs.GetApStatsDeviceApStatRadioStatResult RadioStat;
        public readonly double RxBps;
        public readonly int RxBytes;
        public readonly int RxPkts;
        /// <summary>
        /// serial
        /// </summary>
        public readonly string Serial;
        public readonly string SiteId;
        public readonly string Status;
        public readonly Outputs.GetApStatsDeviceApStatSwitchRedundancyResult SwitchRedundancy;
        public readonly double TxBps;
        public readonly double TxBytes;
        public readonly double TxPkts;
        /// <summary>
        /// how long, in seconds, has the device been up (or rebooted)
        /// </summary>
        public readonly double Uptime;
        public readonly Outputs.GetApStatsDeviceApStatUsbStatResult UsbStat;
        public readonly string Version;
        public readonly double X;
        public readonly double Y;

        [OutputConstructor]
        private GetApStatsDeviceApStatResult(
            Outputs.GetApStatsDeviceApStatAutoPlacementResult autoPlacement,

            Outputs.GetApStatsDeviceApStatAutoUpgradeStatResult autoUpgradeStat,

            Outputs.GetApStatsDeviceApStatBleStatResult bleStat,

            double certExpiry,

            bool configReverted,

            int cpuSystem,

            int cpuUtil,

            int createdTime,

            string deviceprofileId,

            Outputs.GetApStatsDeviceApStatEnvStatResult envStat,

            Outputs.GetApStatsDeviceApStatEslStatResult eslStat,

            string extIp,

            Outputs.GetApStatsDeviceApStatFwupdateResult fwupdate,

            string hwRev,

            string id,

            ImmutableArray<int> inactiveWiredVlans,

            ImmutableDictionary<string, Outputs.GetApStatsDeviceApStatIotStatResult> iotStat,

            string ip,

            Outputs.GetApStatsDeviceApStatIpConfigResult ipConfig,

            Outputs.GetApStatsDeviceApStatIpStatResult ipStat,

            ImmutableDictionary<string, Outputs.GetApStatsDeviceApStatL2tpStatResult> l2tpStat,

            double lastSeen,

            Outputs.GetApStatsDeviceApStatLastTroubleResult lastTrouble,

            Outputs.GetApStatsDeviceApStatLedResult led,

            Outputs.GetApStatsDeviceApStatLldpStatResult lldpStat,

            bool locating,

            bool locked,

            string mac,

            string mapId,

            int memUsedKb,

            ImmutableDictionary<string, Outputs.GetApStatsDeviceApStatMeshDownlinksResult> meshDownlinks,

            Outputs.GetApStatsDeviceApStatMeshUplinkResult meshUplink,

            string model,

            int modifiedTime,

            string mount,

            string name,

            string notes,

            int numClients,

            string orgId,

            ImmutableDictionary<string, Outputs.GetApStatsDeviceApStatPortStatResult> portStat,

            int powerBudget,

            bool powerConstrained,

            string powerOpmode,

            string powerSrc,

            Outputs.GetApStatsDeviceApStatRadioStatResult radioStat,

            double rxBps,

            int rxBytes,

            int rxPkts,

            string serial,

            string siteId,

            string status,

            Outputs.GetApStatsDeviceApStatSwitchRedundancyResult switchRedundancy,

            double txBps,

            double txBytes,

            double txPkts,

            double uptime,

            Outputs.GetApStatsDeviceApStatUsbStatResult usbStat,

            string version,

            double x,

            double y)
        {
            AutoPlacement = autoPlacement;
            AutoUpgradeStat = autoUpgradeStat;
            BleStat = bleStat;
            CertExpiry = certExpiry;
            ConfigReverted = configReverted;
            CpuSystem = cpuSystem;
            CpuUtil = cpuUtil;
            CreatedTime = createdTime;
            DeviceprofileId = deviceprofileId;
            EnvStat = envStat;
            EslStat = eslStat;
            ExtIp = extIp;
            Fwupdate = fwupdate;
            HwRev = hwRev;
            Id = id;
            InactiveWiredVlans = inactiveWiredVlans;
            IotStat = iotStat;
            Ip = ip;
            IpConfig = ipConfig;
            IpStat = ipStat;
            L2tpStat = l2tpStat;
            LastSeen = lastSeen;
            LastTrouble = lastTrouble;
            Led = led;
            LldpStat = lldpStat;
            Locating = locating;
            Locked = locked;
            Mac = mac;
            MapId = mapId;
            MemUsedKb = memUsedKb;
            MeshDownlinks = meshDownlinks;
            MeshUplink = meshUplink;
            Model = model;
            ModifiedTime = modifiedTime;
            Mount = mount;
            Name = name;
            Notes = notes;
            NumClients = numClients;
            OrgId = orgId;
            PortStat = portStat;
            PowerBudget = powerBudget;
            PowerConstrained = powerConstrained;
            PowerOpmode = powerOpmode;
            PowerSrc = powerSrc;
            RadioStat = radioStat;
            RxBps = rxBps;
            RxBytes = rxBytes;
            RxPkts = rxPkts;
            Serial = serial;
            SiteId = siteId;
            Status = status;
            SwitchRedundancy = switchRedundancy;
            TxBps = txBps;
            TxBytes = txBytes;
            TxPkts = txPkts;
            Uptime = uptime;
            UsbStat = usbStat;
            Version = version;
            X = x;
            Y = y;
        }
    }
}
