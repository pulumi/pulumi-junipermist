// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Outputs
{

    [OutputType]
    public sealed class DeviceprofileGatewayPortConfig
    {
        /// <summary>
        /// if `aggregated`==`true`. To disable LCP support for the AE interface
        /// </summary>
        public readonly bool? AeDisableLacp;
        /// <summary>
        /// if `aggregated`==`true`. Users could force to use the designated AE name (must be an integer between 0 and 127)
        /// </summary>
        public readonly string? AeIdx;
        /// <summary>
        /// For SRX Only, if `aggregated`==`true`.Sets the state of the interface as UP when the peer has limited LACP capability.\n
        /// Use case: When a device connected to this AE port is ZTPing for the first time, it will not have LACP configured on the other end\n
        /// Note: Turning this on will enable force-up on one of the interfaces in the bundle only
        /// </summary>
        public readonly bool? AeLacpForceUp;
        public readonly bool? Aggregated;
        /// <summary>
        /// if want to generate port up/down alarm, set it to true
        /// </summary>
        public readonly bool? Critical;
        public readonly string? Description;
        public readonly bool? DisableAutoneg;
        /// <summary>
        /// port admin up (true) / down (false)
        /// </summary>
        public readonly bool? Disabled;
        /// <summary>
        /// if `wan_type`==`dsl`. enum: `adsl`, `vdsl`
        /// </summary>
        public readonly string? DslType;
        /// <summary>
        /// if `wan_type`==`dsl`
        /// 16 bit int
        /// </summary>
        public readonly int? DslVci;
        /// <summary>
        /// if `wan_type`==`dsl`
        /// 8 bit int
        /// </summary>
        public readonly int? DslVpi;
        /// <summary>
        /// enum: `auto`, `full`, `half`
        /// </summary>
        public readonly string? Duplex;
        /// <summary>
        /// Junos IP Config
        /// </summary>
        public readonly Outputs.DeviceprofileGatewayPortConfigIpConfig? IpConfig;
        /// <summary>
        /// if `wan_type`==`lte`
        /// </summary>
        public readonly string? LteApn;
        /// <summary>
        /// if `wan_type`==`lte`. enum: `chap`, `none`, `pap`
        /// </summary>
        public readonly string? LteAuth;
        public readonly bool? LteBackup;
        /// <summary>
        /// if `wan_type`==`lte`
        /// </summary>
        public readonly string? LtePassword;
        /// <summary>
        /// if `wan_type`==`lte`
        /// </summary>
        public readonly string? LteUsername;
        public readonly int? Mtu;
        /// <summary>
        /// name that we'll use to derive config
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// if `usage`==`lan`
        /// </summary>
        public readonly ImmutableArray<string> Networks;
        /// <summary>
        /// for Q-in-Q
        /// </summary>
        public readonly int? OuterVlanId;
        public readonly bool? PoeDisabled;
        /// <summary>
        /// if `usage`==`lan`
        /// </summary>
        public readonly string? PortNetwork;
        /// <summary>
        /// whether to preserve dscp when sending traffic over VPN (SSR-only)
        /// </summary>
        public readonly bool? PreserveDscp;
        /// <summary>
        /// if HA mode
        /// </summary>
        public readonly bool? Redundant;
        /// <summary>
        /// if HA mode
        /// </summary>
        public readonly int? RethIdx;
        /// <summary>
        /// if HA mode
        /// </summary>
        public readonly string? RethNode;
        /// <summary>
        /// SSR only - supporting vlan-based redundancy (matching the size of `networks`)
        /// </summary>
        public readonly ImmutableArray<string> RethNodes;
        public readonly string? Speed;
        /// <summary>
        /// when SSR is running as VM, this is required on certain hosting platforms
        /// </summary>
        public readonly bool? SsrNoVirtualMac;
        /// <summary>
        /// for SSR only
        /// </summary>
        public readonly string? SvrPortRange;
        public readonly Outputs.DeviceprofileGatewayPortConfigTrafficShaping? TrafficShaping;
        /// <summary>
        /// port usage name. enum: `ha_control`, `ha_data`, `lan`, `wan`
        /// </summary>
        public readonly string Usage;
        /// <summary>
        /// if WAN interface is on a VLAN
        /// </summary>
        public readonly int? VlanId;
        public readonly ImmutableDictionary<string, Outputs.DeviceprofileGatewayPortConfigVpnPaths>? VpnPaths;
        /// <summary>
        /// when `wan_type`==`broadband`. enum: `default`, `max`, `recommended`
        /// </summary>
        public readonly string? WanArpPolicer;
        /// <summary>
        /// optional, if spoke should reach this port by a different IP
        /// </summary>
        public readonly string? WanExtIp;
        /// <summary>
        /// optional, by default, source-NAT is performed on all WAN Ports using the interface-ip
        /// </summary>
        public readonly Outputs.DeviceprofileGatewayPortConfigWanSourceNat? WanSourceNat;
        /// <summary>
        /// if `usage`==`wan`. enum: `broadband`, `dsl`, `lte`
        /// </summary>
        public readonly string? WanType;

        [OutputConstructor]
        private DeviceprofileGatewayPortConfig(
            bool? aeDisableLacp,

            string? aeIdx,

            bool? aeLacpForceUp,

            bool? aggregated,

            bool? critical,

            string? description,

            bool? disableAutoneg,

            bool? disabled,

            string? dslType,

            int? dslVci,

            int? dslVpi,

            string? duplex,

            Outputs.DeviceprofileGatewayPortConfigIpConfig? ipConfig,

            string? lteApn,

            string? lteAuth,

            bool? lteBackup,

            string? ltePassword,

            string? lteUsername,

            int? mtu,

            string? name,

            ImmutableArray<string> networks,

            int? outerVlanId,

            bool? poeDisabled,

            string? portNetwork,

            bool? preserveDscp,

            bool? redundant,

            int? rethIdx,

            string? rethNode,

            ImmutableArray<string> rethNodes,

            string? speed,

            bool? ssrNoVirtualMac,

            string? svrPortRange,

            Outputs.DeviceprofileGatewayPortConfigTrafficShaping? trafficShaping,

            string usage,

            int? vlanId,

            ImmutableDictionary<string, Outputs.DeviceprofileGatewayPortConfigVpnPaths>? vpnPaths,

            string? wanArpPolicer,

            string? wanExtIp,

            Outputs.DeviceprofileGatewayPortConfigWanSourceNat? wanSourceNat,

            string? wanType)
        {
            AeDisableLacp = aeDisableLacp;
            AeIdx = aeIdx;
            AeLacpForceUp = aeLacpForceUp;
            Aggregated = aggregated;
            Critical = critical;
            Description = description;
            DisableAutoneg = disableAutoneg;
            Disabled = disabled;
            DslType = dslType;
            DslVci = dslVci;
            DslVpi = dslVpi;
            Duplex = duplex;
            IpConfig = ipConfig;
            LteApn = lteApn;
            LteAuth = lteAuth;
            LteBackup = lteBackup;
            LtePassword = ltePassword;
            LteUsername = lteUsername;
            Mtu = mtu;
            Name = name;
            Networks = networks;
            OuterVlanId = outerVlanId;
            PoeDisabled = poeDisabled;
            PortNetwork = portNetwork;
            PreserveDscp = preserveDscp;
            Redundant = redundant;
            RethIdx = rethIdx;
            RethNode = rethNode;
            RethNodes = rethNodes;
            Speed = speed;
            SsrNoVirtualMac = ssrNoVirtualMac;
            SvrPortRange = svrPortRange;
            TrafficShaping = trafficShaping;
            Usage = usage;
            VlanId = vlanId;
            VpnPaths = vpnPaths;
            WanArpPolicer = wanArpPolicer;
            WanExtIp = wanExtIp;
            WanSourceNat = wanSourceNat;
            WanType = wanType;
        }
    }
}