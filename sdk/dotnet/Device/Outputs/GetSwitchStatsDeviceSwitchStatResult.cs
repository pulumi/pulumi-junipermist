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
    public sealed class GetSwitchStatsDeviceSwitchStatResult
    {
        public readonly Outputs.GetSwitchStatsDeviceSwitchStatApRedundancyResult ApRedundancy;
        public readonly Outputs.GetSwitchStatsDeviceSwitchStatArpTableStatsResult ArpTableStats;
        public readonly int CertExpiry;
        public readonly ImmutableArray<Outputs.GetSwitchStatsDeviceSwitchStatClientResult> Clients;
        public readonly Outputs.GetSwitchStatsDeviceSwitchStatClientsStatsResult ClientsStats;
        public readonly string ConfigStatus;
        public readonly Outputs.GetSwitchStatsDeviceSwitchStatCpuStatResult CpuStat;
        public readonly int CreatedTime;
        public readonly string DeviceprofileId;
        /// <summary>
        /// Property key is the network name
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GetSwitchStatsDeviceSwitchStatDhcpdStatResult> DhcpdStat;
        public readonly string EvpntopoId;
        public readonly bool FwVersionsOutofsync;
        public readonly Outputs.GetSwitchStatsDeviceSwitchStatFwupdateResult Fwupdate;
        /// <summary>
        /// whether the switch supports packet capture
        /// </summary>
        public readonly bool HasPcap;
        /// <summary>
        /// hostname reported by the device
        /// </summary>
        public readonly string Hostname;
        /// <summary>
        /// device hardware revision number
        /// </summary>
        public readonly string HwRev;
        public readonly string Id;
        /// <summary>
        /// Property key is the interface name
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GetSwitchStatsDeviceSwitchStatIfStatResult> IfStat;
        public readonly string Ip;
        public readonly Outputs.GetSwitchStatsDeviceSwitchStatIpStatResult IpStat;
        public readonly double LastSeen;
        /// <summary>
        /// last trouble code of switch
        /// </summary>
        public readonly Outputs.GetSwitchStatsDeviceSwitchStatLastTroubleResult LastTrouble;
        public readonly string Mac;
        public readonly Outputs.GetSwitchStatsDeviceSwitchStatMacTableStatsResult MacTableStats;
        public readonly string MapId;
        /// <summary>
        /// memory usage stat (for virtual chassis, memory usage of master RE)
        /// </summary>
        public readonly Outputs.GetSwitchStatsDeviceSwitchStatMemoryStatResult MemoryStat;
        public readonly string Model;
        public readonly int ModifiedTime;
        public readonly ImmutableArray<Outputs.GetSwitchStatsDeviceSwitchStatModuleStatResult> ModuleStats;
        /// <summary>
        /// device name if configured
        /// </summary>
        public readonly string Name;
        public readonly string OrgId;
        public readonly Outputs.GetSwitchStatsDeviceSwitchStatRouteSummaryStatsResult RouteSummaryStats;
        public readonly string Serial;
        public readonly ImmutableDictionary<string, Outputs.GetSwitchStatsDeviceSwitchStatServiceStatResult> ServiceStat;
        public readonly string SiteId;
        public readonly string Status;
        public readonly double Uptime;
        public readonly string VcMac;
        public readonly Outputs.GetSwitchStatsDeviceSwitchStatVcSetupInfoResult VcSetupInfo;
        public readonly string Version;

        [OutputConstructor]
        private GetSwitchStatsDeviceSwitchStatResult(
            Outputs.GetSwitchStatsDeviceSwitchStatApRedundancyResult apRedundancy,

            Outputs.GetSwitchStatsDeviceSwitchStatArpTableStatsResult arpTableStats,

            int certExpiry,

            ImmutableArray<Outputs.GetSwitchStatsDeviceSwitchStatClientResult> clients,

            Outputs.GetSwitchStatsDeviceSwitchStatClientsStatsResult clientsStats,

            string configStatus,

            Outputs.GetSwitchStatsDeviceSwitchStatCpuStatResult cpuStat,

            int createdTime,

            string deviceprofileId,

            ImmutableDictionary<string, Outputs.GetSwitchStatsDeviceSwitchStatDhcpdStatResult> dhcpdStat,

            string evpntopoId,

            bool fwVersionsOutofsync,

            Outputs.GetSwitchStatsDeviceSwitchStatFwupdateResult fwupdate,

            bool hasPcap,

            string hostname,

            string hwRev,

            string id,

            ImmutableDictionary<string, Outputs.GetSwitchStatsDeviceSwitchStatIfStatResult> ifStat,

            string ip,

            Outputs.GetSwitchStatsDeviceSwitchStatIpStatResult ipStat,

            double lastSeen,

            Outputs.GetSwitchStatsDeviceSwitchStatLastTroubleResult lastTrouble,

            string mac,

            Outputs.GetSwitchStatsDeviceSwitchStatMacTableStatsResult macTableStats,

            string mapId,

            Outputs.GetSwitchStatsDeviceSwitchStatMemoryStatResult memoryStat,

            string model,

            int modifiedTime,

            ImmutableArray<Outputs.GetSwitchStatsDeviceSwitchStatModuleStatResult> moduleStats,

            string name,

            string orgId,

            Outputs.GetSwitchStatsDeviceSwitchStatRouteSummaryStatsResult routeSummaryStats,

            string serial,

            ImmutableDictionary<string, Outputs.GetSwitchStatsDeviceSwitchStatServiceStatResult> serviceStat,

            string siteId,

            string status,

            double uptime,

            string vcMac,

            Outputs.GetSwitchStatsDeviceSwitchStatVcSetupInfoResult vcSetupInfo,

            string version)
        {
            ApRedundancy = apRedundancy;
            ArpTableStats = arpTableStats;
            CertExpiry = certExpiry;
            Clients = clients;
            ClientsStats = clientsStats;
            ConfigStatus = configStatus;
            CpuStat = cpuStat;
            CreatedTime = createdTime;
            DeviceprofileId = deviceprofileId;
            DhcpdStat = dhcpdStat;
            EvpntopoId = evpntopoId;
            FwVersionsOutofsync = fwVersionsOutofsync;
            Fwupdate = fwupdate;
            HasPcap = hasPcap;
            Hostname = hostname;
            HwRev = hwRev;
            Id = id;
            IfStat = ifStat;
            Ip = ip;
            IpStat = ipStat;
            LastSeen = lastSeen;
            LastTrouble = lastTrouble;
            Mac = mac;
            MacTableStats = macTableStats;
            MapId = mapId;
            MemoryStat = memoryStat;
            Model = model;
            ModifiedTime = modifiedTime;
            ModuleStats = moduleStats;
            Name = name;
            OrgId = orgId;
            RouteSummaryStats = routeSummaryStats;
            Serial = serial;
            ServiceStat = serviceStat;
            SiteId = siteId;
            Status = status;
            Uptime = uptime;
            VcMac = vcMac;
            VcSetupInfo = vcSetupInfo;
            Version = version;
        }
    }
}