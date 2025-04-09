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
    public sealed class GatewayPortConfig
    {
        /// <summary>
        /// If `aggregated`==`true`. To disable LCP support for the AE interface
        /// </summary>
        public readonly bool? AeDisableLacp;
        /// <summary>
        /// If `aggregated`==`true`. Users could force to use the designated AE name (must be an integer between 0 and 127)
        /// </summary>
        public readonly string? AeIdx;
        /// <summary>
        /// For SRX Only, if `aggregated`==`true`.Sets the state of the interface as UP when the peer has limited LACP capability. Use case: When a device connected to this AE port is ZTPing for the first time, it will not have LACP configured on the other end. **Note:** Turning this on will enable force-up on one of the interfaces in the bundle only
        /// </summary>
        public readonly bool? AeLacpForceUp;
        public readonly bool? Aggregated;
        /// <summary>
        /// To generate port up/down alarm, set it to true
        /// </summary>
        public readonly bool? Critical;
        /// <summary>
        /// Interface Description. Can be a variable (i.e. "{{myvar}}")
        /// </summary>
        public readonly string? Description;
        public readonly bool? DisableAutoneg;
        /// <summary>
        /// Port admin up (true) / down (false)
        /// </summary>
        public readonly bool? Disabled;
        /// <summary>
        /// if `wan_type`==`dsl`. enum: `adsl`, `vdsl`
        /// </summary>
        public readonly string? DslType;
        /// <summary>
        /// If `wan_type`==`dsl`, 16 bit int
        /// </summary>
        public readonly int? DslVci;
        /// <summary>
        /// If `wan_type`==`dsl`, 8 bit int
        /// </summary>
        public readonly int? DslVpi;
        /// <summary>
        /// enum: `auto`, `full`, `half`
        /// </summary>
        public readonly string? Duplex;
        /// <summary>
        /// Junos IP Config
        /// </summary>
        public readonly Outputs.GatewayPortConfigIpConfig? IpConfig;
        /// <summary>
        /// If `wan_type`==`lte`
        /// </summary>
        public readonly string? LteApn;
        /// <summary>
        /// if `wan_type`==`lte`. enum: `chap`, `none`, `pap`
        /// </summary>
        public readonly string? LteAuth;
        public readonly bool? LteBackup;
        /// <summary>
        /// If `wan_type`==`lte`
        /// </summary>
        public readonly string? LtePassword;
        /// <summary>
        /// If `wan_type`==`lte`
        /// </summary>
        public readonly string? LteUsername;
        public readonly int? Mtu;
        /// <summary>
        /// Name that we'll use to derive config
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// if `usage`==`lan`, name of the `junipermist.org.Network` resource
        /// </summary>
        public readonly ImmutableArray<string> Networks;
        /// <summary>
        /// For Q-in-Q
        /// </summary>
        public readonly int? OuterVlanId;
        public readonly bool? PoeDisabled;
        /// <summary>
        /// Only for SRX and if `usage`==`lan`, the name of the Network to be used as the Untagged VLAN
        /// </summary>
        public readonly string? PortNetwork;
        /// <summary>
        /// Whether to preserve dscp when sending traffic over VPN (SSR-only)
        /// </summary>
        public readonly bool? PreserveDscp;
        /// <summary>
        /// If HA mode
        /// </summary>
        public readonly bool? Redundant;
        /// <summary>
        /// If HA mode, SRX Only - support redundancy-group. 1-128 for physical SRX, 1-64 for virtual SRX
        /// </summary>
        public readonly int? RedundantGroup;
        /// <summary>
        /// For SRX only and if HA Mode
        /// </summary>
        public readonly string? RethIdx;
        /// <summary>
        /// If HA mode
        /// </summary>
        public readonly string? RethNode;
        /// <summary>
        /// SSR only - supporting vlan-based redundancy (matching the size of `networks`)
        /// </summary>
        public readonly ImmutableArray<string> RethNodes;
        public readonly string? Speed;
        /// <summary>
        /// When SSR is running as VM, this is required on certain hosting platforms
        /// </summary>
        public readonly bool? SsrNoVirtualMac;
        /// <summary>
        /// For SSR only
        /// </summary>
        public readonly string? SvrPortRange;
        public readonly Outputs.GatewayPortConfigTrafficShaping? TrafficShaping;
        /// <summary>
        /// port usage name. enum: `ha_control`, `ha_data`, `lan`, `wan`
        /// </summary>
        public readonly string Usage;
        public readonly string? VlanId;
        /// <summary>
        /// Property key is the VPN name
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GatewayPortConfigVpnPaths>? VpnPaths;
        /// <summary>
        /// Only when `wan_type`==`broadband`. enum: `default`, `max`, `recommended`
        /// </summary>
        public readonly string? WanArpPolicer;
        /// <summary>
        /// Only if `usage`==`wan`, optional. If spoke should reach this port by a different IP
        /// </summary>
        public readonly string? WanExtIp;
        /// <summary>
        /// Only if `usage`==`wan`. Property Key is the destination CIDR (e.g. "100.100.100.0/24")
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GatewayPortConfigWanExtraRoutes>? WanExtraRoutes;
        /// <summary>
        /// Only if `usage`==`wan`. If some networks are connected to this WAN port, it can be added here so policies can be defined
        /// </summary>
        public readonly ImmutableArray<string> WanNetworks;
        /// <summary>
        /// Only if `usage`==`wan`
        /// </summary>
        public readonly Outputs.GatewayPortConfigWanProbeOverride? WanProbeOverride;
        /// <summary>
        /// Only if `usage`==`wan`, optional. By default, source-NAT is performed on all WAN Ports using the interface-ip
        /// </summary>
        public readonly Outputs.GatewayPortConfigWanSourceNat? WanSourceNat;
        /// <summary>
        /// Only if `usage`==`wan`. enum: `broadband`, `dsl`, `lte`
        /// </summary>
        public readonly string? WanType;

        [OutputConstructor]
        private GatewayPortConfig(
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

            Outputs.GatewayPortConfigIpConfig? ipConfig,

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

            int? redundantGroup,

            string? rethIdx,

            string? rethNode,

            ImmutableArray<string> rethNodes,

            string? speed,

            bool? ssrNoVirtualMac,

            string? svrPortRange,

            Outputs.GatewayPortConfigTrafficShaping? trafficShaping,

            string usage,

            string? vlanId,

            ImmutableDictionary<string, Outputs.GatewayPortConfigVpnPaths>? vpnPaths,

            string? wanArpPolicer,

            string? wanExtIp,

            ImmutableDictionary<string, Outputs.GatewayPortConfigWanExtraRoutes>? wanExtraRoutes,

            ImmutableArray<string> wanNetworks,

            Outputs.GatewayPortConfigWanProbeOverride? wanProbeOverride,

            Outputs.GatewayPortConfigWanSourceNat? wanSourceNat,

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
            RedundantGroup = redundantGroup;
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
            WanExtraRoutes = wanExtraRoutes;
            WanNetworks = wanNetworks;
            WanProbeOverride = wanProbeOverride;
            WanSourceNat = wanSourceNat;
            WanType = wanType;
        }
    }
}
