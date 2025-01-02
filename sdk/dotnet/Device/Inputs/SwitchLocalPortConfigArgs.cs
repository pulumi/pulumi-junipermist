// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchLocalPortConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Only if `mode`==`trunk` whether to trunk all network/vlans
        /// </summary>
        [Input("allNetworks")]
        public Input<bool>? AllNetworks { get; set; }

        /// <summary>
        /// If DHCP snooping is enabled, whether DHCP server is allowed on the interfaces with. All the interfaces from port configs using this port usage are effected. Please notice that allow_dhcpd is a tri_state. When it is not defined, it means using the system's default setting which depends on whether the port is a access or trunk port.
        /// </summary>
        [Input("allowDhcpd")]
        public Input<bool>? AllowDhcpd { get; set; }

        [Input("allowMultipleSupplicants")]
        public Input<bool>? AllowMultipleSupplicants { get; set; }

        /// <summary>
        /// Only if `port_auth`==`dot1x` bypass auth for known clients if set to true when RADIUS server is down
        /// </summary>
        [Input("bypassAuthWhenServerDown")]
        public Input<bool>? BypassAuthWhenServerDown { get; set; }

        /// <summary>
        /// Only if `port_auth`=`dot1x` bypass auth for all (including unknown clients) if set to true when RADIUS server is down
        /// </summary>
        [Input("bypassAuthWhenServerDownForUnkonwnClient")]
        public Input<bool>? BypassAuthWhenServerDownForUnkonwnClient { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic` if speed and duplex are specified, whether to disable autonegotiation
        /// </summary>
        [Input("disableAutoneg")]
        public Input<bool>? DisableAutoneg { get; set; }

        /// <summary>
        /// whether the port is disabled
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// link connection mode. enum: `auto`, `full`, `half`
        /// </summary>
        [Input("duplex")]
        public Input<string>? Duplex { get; set; }

        [Input("dynamicVlanNetworks")]
        private InputList<string>? _dynamicVlanNetworks;

        /// <summary>
        /// Only if `port_auth`==`dot1x`, if dynamic vlan is used, specify the possible networks/vlans RADIUS can return
        /// </summary>
        public InputList<string> DynamicVlanNetworks
        {
            get => _dynamicVlanNetworks ?? (_dynamicVlanNetworks = new InputList<string>());
            set => _dynamicVlanNetworks = value;
        }

        /// <summary>
        /// Only if `port_auth`==`dot1x` whether to enable MAC Auth
        /// </summary>
        [Input("enableMacAuth")]
        public Input<bool>? EnableMacAuth { get; set; }

        [Input("enableQos")]
        public Input<bool>? EnableQos { get; set; }

        /// <summary>
        /// Only if `port_auth`==`dot1x` which network to put the device into if the device cannot do dot1x. default is null (i.e. not allowed)
        /// </summary>
        [Input("guestNetwork")]
        public Input<string>? GuestNetwork { get; set; }

        /// <summary>
        /// inter_switch_link is used together with "isolation" under networks. NOTE: inter_switch_link works only between Juniper device. This has to be applied to both ports connected together
        /// </summary>
        [Input("interSwitchLink")]
        public Input<bool>? InterSwitchLink { get; set; }

        /// <summary>
        /// Only if `enable_mac_auth`==`true`
        /// </summary>
        [Input("macAuthOnly")]
        public Input<bool>? MacAuthOnly { get; set; }

        /// <summary>
        /// Only if `enable_mac_auth`==`true` + `mac_auth_only`==`false`, dot1x will be given priority then mac_auth. Enable this to prefer mac_auth over dot1x.
        /// </summary>
        [Input("macAuthPreferred")]
        public Input<bool>? MacAuthPreferred { get; set; }

        /// <summary>
        /// Only if `enable_mac_auth` ==`true`. This type is ignored if mist_nac is enabled. enum: `eap-md5`, `eap-peap`, `pap`
        /// </summary>
        [Input("macAuthProtocol")]
        public Input<string>? MacAuthProtocol { get; set; }

        /// <summary>
        /// max number of mac addresses, default is 0 for unlimited, otherwise range is 1 or higher, with upper bound constrained by platform
        /// </summary>
        [Input("macLimit")]
        public Input<int>? MacLimit { get; set; }

        /// <summary>
        /// enum: `access`, `inet`, `trunk`
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// media maximum transmission unit (MTU) is the largest data unit that can be forwarded without fragmentation. The default value is 1514.
        /// </summary>
        [Input("mtu")]
        public Input<int>? Mtu { get; set; }

        [Input("networks")]
        private InputList<string>? _networks;

        /// <summary>
        /// Only if `mode`==`trunk`, the list of network/vlans
        /// </summary>
        public InputList<string> Networks
        {
            get => _networks ?? (_networks = new InputList<string>());
            set => _networks = value;
        }

        /// <summary>
        /// Additional note for the port config override
        /// </summary>
        [Input("note")]
        public Input<string>? Note { get; set; }

        /// <summary>
        /// Only if `mode`==`access` and `port_auth`!=`dot1x` whether the port should retain dynamically learned MAC addresses
        /// </summary>
        [Input("persistMac")]
        public Input<bool>? PersistMac { get; set; }

        /// <summary>
        /// whether PoE capabilities are disabled for a port
        /// </summary>
        [Input("poeDisabled")]
        public Input<bool>? PoeDisabled { get; set; }

        /// <summary>
        /// if dot1x is desired, set to dot1x. enum: `dot1x`
        /// </summary>
        [Input("portAuth")]
        public Input<string>? PortAuth { get; set; }

        /// <summary>
        /// native network/vlan for untagged traffic
        /// </summary>
        [Input("portNetwork")]
        public Input<string>? PortNetwork { get; set; }

        /// <summary>
        /// Only if `port_auth`=`dot1x` reauthentication interval range
        /// </summary>
        [Input("reauthInterval")]
        public Input<int>? ReauthInterval { get; set; }

        /// <summary>
        /// Only if `port_auth`==`dot1x` sets server fail fallback vlan
        /// </summary>
        [Input("serverFailNetwork")]
        public Input<string>? ServerFailNetwork { get; set; }

        /// <summary>
        /// Only if `port_auth`==`dot1x` when radius server reject / fails
        /// </summary>
        [Input("serverRejectNetwork")]
        public Input<string>? ServerRejectNetwork { get; set; }

        /// <summary>
        /// enum: `100m`, `10m`, `1g`, `2.5g`, `5g`, `10g`, `25g`, `40g`, `100g`,`auto`
        /// </summary>
        [Input("speed")]
        public Input<string>? Speed { get; set; }

        /// <summary>
        /// Switch storm control
        /// </summary>
        [Input("stormControl")]
        public Input<Inputs.SwitchLocalPortConfigStormControlArgs>? StormControl { get; set; }

        /// <summary>
        /// when enabled, the port is not expected to receive BPDU frames
        /// </summary>
        [Input("stpEdge")]
        public Input<bool>? StpEdge { get; set; }

        [Input("stpNoRootPort")]
        public Input<bool>? StpNoRootPort { get; set; }

        [Input("stpP2p")]
        public Input<bool>? StpP2p { get; set; }

        /// <summary>
        /// port usage name.
        /// </summary>
        [Input("usage", required: true)]
        public Input<string> Usage { get; set; } = null!;

        /// <summary>
        /// if this is connected to a vstp network
        /// </summary>
        [Input("useVstp")]
        public Input<bool>? UseVstp { get; set; }

        /// <summary>
        /// network/vlan for voip traffic, must also set port_network. to authenticate device, set port_auth
        /// </summary>
        [Input("voipNetwork")]
        public Input<string>? VoipNetwork { get; set; }

        public SwitchLocalPortConfigArgs()
        {
        }
        public static new SwitchLocalPortConfigArgs Empty => new SwitchLocalPortConfigArgs();
    }
}
