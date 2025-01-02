// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayPortConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// if `aggregated`==`true`. To disable LCP support for the AE interface
        /// </summary>
        [Input("aeDisableLacp")]
        public Input<bool>? AeDisableLacp { get; set; }

        /// <summary>
        /// if `aggregated`==`true`. Users could force to use the designated AE name (must be an integer between 0 and 127)
        /// </summary>
        [Input("aeIdx")]
        public Input<string>? AeIdx { get; set; }

        /// <summary>
        /// For SRX Only, if `aggregated`==`true`.Sets the state of the interface as UP when the peer has limited LACP capability. Use case: When a device connected to this AE port is ZTPing for the first time, it will not have LACP configured on the other end. **Note:** Turning this on will enable force-up on one of the interfaces in the bundle only
        /// </summary>
        [Input("aeLacpForceUp")]
        public Input<bool>? AeLacpForceUp { get; set; }

        [Input("aggregated")]
        public Input<bool>? Aggregated { get; set; }

        /// <summary>
        /// if want to generate port up/down alarm, set it to true
        /// </summary>
        [Input("critical")]
        public Input<bool>? Critical { get; set; }

        /// <summary>
        /// Interface Description. Can be a variable (i.e. "{{myvar}}")
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("disableAutoneg")]
        public Input<bool>? DisableAutoneg { get; set; }

        /// <summary>
        /// port admin up (true) / down (false)
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// if `wan_type`==`dsl`. enum: `adsl`, `vdsl`
        /// </summary>
        [Input("dslType")]
        public Input<string>? DslType { get; set; }

        /// <summary>
        /// if `wan_type`==`dsl`, 16 bit int
        /// </summary>
        [Input("dslVci")]
        public Input<int>? DslVci { get; set; }

        /// <summary>
        /// if `wan_type`==`dsl`, 8 bit int
        /// </summary>
        [Input("dslVpi")]
        public Input<int>? DslVpi { get; set; }

        /// <summary>
        /// enum: `auto`, `full`, `half`
        /// </summary>
        [Input("duplex")]
        public Input<string>? Duplex { get; set; }

        /// <summary>
        /// Junos IP Config
        /// </summary>
        [Input("ipConfig")]
        public Input<Inputs.GatewayPortConfigIpConfigGetArgs>? IpConfig { get; set; }

        /// <summary>
        /// if `wan_type`==`lte`
        /// </summary>
        [Input("lteApn")]
        public Input<string>? LteApn { get; set; }

        /// <summary>
        /// if `wan_type`==`lte`. enum: `chap`, `none`, `pap`
        /// </summary>
        [Input("lteAuth")]
        public Input<string>? LteAuth { get; set; }

        [Input("lteBackup")]
        public Input<bool>? LteBackup { get; set; }

        [Input("ltePassword")]
        private Input<string>? _ltePassword;

        /// <summary>
        /// if `wan_type`==`lte`
        /// </summary>
        public Input<string>? LtePassword
        {
            get => _ltePassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _ltePassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// if `wan_type`==`lte`
        /// </summary>
        [Input("lteUsername")]
        public Input<string>? LteUsername { get; set; }

        [Input("mtu")]
        public Input<int>? Mtu { get; set; }

        /// <summary>
        /// name that we'll use to derive config
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networks")]
        private InputList<string>? _networks;

        /// <summary>
        /// if `usage`==`lan`, name of the `junipermist.org.Network` resource
        /// </summary>
        public InputList<string> Networks
        {
            get => _networks ?? (_networks = new InputList<string>());
            set => _networks = value;
        }

        /// <summary>
        /// for Q-in-Q
        /// </summary>
        [Input("outerVlanId")]
        public Input<int>? OuterVlanId { get; set; }

        [Input("poeDisabled")]
        public Input<bool>? PoeDisabled { get; set; }

        /// <summary>
        /// Only for SRX and if `usage`==`lan`, the Untagged VLAN Network
        /// </summary>
        [Input("portNetwork")]
        public Input<string>? PortNetwork { get; set; }

        /// <summary>
        /// whether to preserve dscp when sending traffic over VPN (SSR-only)
        /// </summary>
        [Input("preserveDscp")]
        public Input<bool>? PreserveDscp { get; set; }

        /// <summary>
        /// if HA mode
        /// </summary>
        [Input("redundant")]
        public Input<bool>? Redundant { get; set; }

        /// <summary>
        /// if HA mode
        /// </summary>
        [Input("rethIdx")]
        public Input<int>? RethIdx { get; set; }

        /// <summary>
        /// if HA mode
        /// </summary>
        [Input("rethNode")]
        public Input<string>? RethNode { get; set; }

        [Input("rethNodes")]
        private InputList<string>? _rethNodes;

        /// <summary>
        /// SSR only - supporting vlan-based redundancy (matching the size of `networks`)
        /// </summary>
        public InputList<string> RethNodes
        {
            get => _rethNodes ?? (_rethNodes = new InputList<string>());
            set => _rethNodes = value;
        }

        [Input("speed")]
        public Input<string>? Speed { get; set; }

        /// <summary>
        /// when SSR is running as VM, this is required on certain hosting platforms
        /// </summary>
        [Input("ssrNoVirtualMac")]
        public Input<bool>? SsrNoVirtualMac { get; set; }

        /// <summary>
        /// for SSR only
        /// </summary>
        [Input("svrPortRange")]
        public Input<string>? SvrPortRange { get; set; }

        [Input("trafficShaping")]
        public Input<Inputs.GatewayPortConfigTrafficShapingGetArgs>? TrafficShaping { get; set; }

        /// <summary>
        /// port usage name. enum: `ha_control`, `ha_data`, `lan`, `wan`
        /// </summary>
        [Input("usage", required: true)]
        public Input<string> Usage { get; set; } = null!;

        [Input("vlanId")]
        public Input<string>? VlanId { get; set; }

        [Input("vpnPaths")]
        private InputMap<Inputs.GatewayPortConfigVpnPathsGetArgs>? _vpnPaths;

        /// <summary>
        /// Property key is the VPN name
        /// </summary>
        public InputMap<Inputs.GatewayPortConfigVpnPathsGetArgs> VpnPaths
        {
            get => _vpnPaths ?? (_vpnPaths = new InputMap<Inputs.GatewayPortConfigVpnPathsGetArgs>());
            set => _vpnPaths = value;
        }

        /// <summary>
        /// Only when `wan_type`==`broadband`. enum: `default`, `max`, `recommended`
        /// </summary>
        [Input("wanArpPolicer")]
        public Input<string>? WanArpPolicer { get; set; }

        /// <summary>
        /// Only if `usage`==`wan`, optional. If spoke should reach this port by a different IP
        /// </summary>
        [Input("wanExtIp")]
        public Input<string>? WanExtIp { get; set; }

        [Input("wanExtraRoutes")]
        private InputMap<Inputs.GatewayPortConfigWanExtraRoutesGetArgs>? _wanExtraRoutes;

        /// <summary>
        /// Only if `usage`==`wan`. Property Key is the destianation CIDR (e.g "100.100.100.0/24")
        /// </summary>
        public InputMap<Inputs.GatewayPortConfigWanExtraRoutesGetArgs> WanExtraRoutes
        {
            get => _wanExtraRoutes ?? (_wanExtraRoutes = new InputMap<Inputs.GatewayPortConfigWanExtraRoutesGetArgs>());
            set => _wanExtraRoutes = value;
        }

        [Input("wanNetworks")]
        private InputList<string>? _wanNetworks;

        /// <summary>
        /// Only if `usage`==`wan`. If some networks are connected to this WAN port, it can be added here so policies can be defined
        /// </summary>
        public InputList<string> WanNetworks
        {
            get => _wanNetworks ?? (_wanNetworks = new InputList<string>());
            set => _wanNetworks = value;
        }

        /// <summary>
        /// Only if `usage`==`wan`
        /// </summary>
        [Input("wanProbeOverride")]
        public Input<Inputs.GatewayPortConfigWanProbeOverrideGetArgs>? WanProbeOverride { get; set; }

        /// <summary>
        /// Only if `usage`==`wan`, optional. By default, source-NAT is performed on all WAN Ports using the interface-ip
        /// </summary>
        [Input("wanSourceNat")]
        public Input<Inputs.GatewayPortConfigWanSourceNatGetArgs>? WanSourceNat { get; set; }

        /// <summary>
        /// Only if `usage`==`wan`. enum: `broadband`, `dsl`, `lte`
        /// </summary>
        [Input("wanType")]
        public Input<string>? WanType { get; set; }

        public GatewayPortConfigGetArgs()
        {
        }
        public static new GatewayPortConfigGetArgs Empty => new GatewayPortConfigGetArgs();
    }
}
