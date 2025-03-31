// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplatePortUsagesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Only if `mode`==`trunk` whether to trunk all network/vlans
        /// </summary>
        [Input("allNetworks")]
        public Input<bool>? AllNetworks { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic`. If DHCP snooping is enabled, whether DHCP server is allowed on the interfaces with. All the interfaces from port configs using this port usage are effected. Please notice that allow_dhcpd is a tri_state. When it is not defined, it means using the system's default setting which depends on whether the port is an access or trunk port.
        /// </summary>
        [Input("allowDhcpd")]
        public Input<bool>? AllowDhcpd { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic`
        /// </summary>
        [Input("allowMultipleSupplicants")]
        public Input<bool>? AllowMultipleSupplicants { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic` and `port_auth`==`dot1x` bypass auth for known clients if set to true when RADIUS server is down
        /// </summary>
        [Input("bypassAuthWhenServerDown")]
        public Input<bool>? BypassAuthWhenServerDown { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic` and `port_auth`=`dot1x` bypass auth for all (including unknown clients) if set to true when RADIUS server is down
        /// </summary>
        [Input("bypassAuthWhenServerDownForUnknownClient")]
        public Input<bool>? BypassAuthWhenServerDownForUnknownClient { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic`
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic` if speed and duplex are specified, whether to disable autonegotiation
        /// </summary>
        [Input("disableAutoneg")]
        public Input<bool>? DisableAutoneg { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic` whether the port is disabled
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic` link connection mode. enum: `auto`, `full`, `half`
        /// </summary>
        [Input("duplex")]
        public Input<string>? Duplex { get; set; }

        [Input("dynamicVlanNetworks")]
        private InputList<string>? _dynamicVlanNetworks;

        /// <summary>
        /// Only if `mode`!=`dynamic` and `port_auth`==`dot1x`, if dynamic vlan is used, specify the possible networks/vlans RADIUS can return
        /// </summary>
        public InputList<string> DynamicVlanNetworks
        {
            get => _dynamicVlanNetworks ?? (_dynamicVlanNetworks = new InputList<string>());
            set => _dynamicVlanNetworks = value;
        }

        /// <summary>
        /// Only if `mode`!=`dynamic` and `port_auth`==`dot1x` whether to enable MAC Auth
        /// </summary>
        [Input("enableMacAuth")]
        public Input<bool>? EnableMacAuth { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic`
        /// </summary>
        [Input("enableQos")]
        public Input<bool>? EnableQos { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic` and `port_auth`==`dot1x` which network to put the device into if the device cannot do dot1x. default is null (i.e. not allowed)
        /// </summary>
        [Input("guestNetwork")]
        public Input<string>? GuestNetwork { get; set; }

        /// <summary>
        /// `inter_switch_link` is used together with `isolation` under networks. NOTE: `inter_switch_link` works only between Juniper device. This has to be applied to both ports connected together
        /// </summary>
        [Input("interIsolationNetworkLink")]
        public Input<bool>? InterIsolationNetworkLink { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic` inter_switch_link is used together with "isolation" under networks. NOTE: inter_switch_link works only between Juniper device. This has to be applied to both ports connected together
        /// </summary>
        [Input("interSwitchLink")]
        public Input<bool>? InterSwitchLink { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic` and `enable_mac_auth`==`true`
        /// </summary>
        [Input("macAuthOnly")]
        public Input<bool>? MacAuthOnly { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic` + `enable_mac_auth`==`true` + `mac_auth_only`==`false`, dot1x will be given priority then mac_auth. Enable this to prefer mac_auth over dot1x.
        /// </summary>
        [Input("macAuthPreferred")]
        public Input<bool>? MacAuthPreferred { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic` and `enable_mac_auth` ==`true`. This type is ignored if mist_nac is enabled. enum: `eap-md5`, `eap-peap`, `pap`
        /// </summary>
        [Input("macAuthProtocol")]
        public Input<string>? MacAuthProtocol { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic` max number of mac addresses, default is 0 for unlimited, otherwise range is 1 or higher, with upper bound constrained by platform
        /// </summary>
        [Input("macLimit")]
        public Input<int>? MacLimit { get; set; }

        /// <summary>
        /// `mode`==`dynamic` must only be used if the port usage name is `dynamic`. enum: `access`, `dynamic`, `inet`, `trunk`
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic` media maximum transmission unit (MTU) is the largest data unit that can be forwarded without fragmentation. The default value is 1514.
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
        /// Only if `mode`==`access` and `port_auth`!=`dot1x` whether the port should retain dynamically learned MAC addresses
        /// </summary>
        [Input("persistMac")]
        public Input<bool>? PersistMac { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic` whether PoE capabilities are disabled for a port
        /// </summary>
        [Input("poeDisabled")]
        public Input<bool>? PoeDisabled { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic` if dot1x is desired, set to dot1x. enum: `dot1x`
        /// </summary>
        [Input("portAuth")]
        public Input<string>? PortAuth { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic` native network/vlan for untagged traffic
        /// </summary>
        [Input("portNetwork")]
        public Input<string>? PortNetwork { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic` and `port_auth`=`dot1x` reauthentication interval range between 10 and 65535 (default: 3600)
        /// </summary>
        [Input("reauthInterval")]
        public Input<string>? ReauthInterval { get; set; }

        /// <summary>
        /// Only if `mode`==`dynamic` Control when the DPC port should be changed to the default port usage. enum: `link_down`, `none` (let the DPC port keep at the current port usage)
        /// </summary>
        [Input("resetDefaultWhen")]
        public Input<string>? ResetDefaultWhen { get; set; }

        [Input("rules")]
        private InputList<Inputs.NetworktemplatePortUsagesRuleGetArgs>? _rules;

        /// <summary>
        /// Only if `mode`==`dynamic`
        /// </summary>
        public InputList<Inputs.NetworktemplatePortUsagesRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.NetworktemplatePortUsagesRuleGetArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// Only if `mode`!=`dynamic` and `port_auth`==`dot1x` sets server fail fallback vlan
        /// </summary>
        [Input("serverFailNetwork")]
        public Input<string>? ServerFailNetwork { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic` and `port_auth`==`dot1x` when radius server reject / fails
        /// </summary>
        [Input("serverRejectNetwork")]
        public Input<string>? ServerRejectNetwork { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic` speed, default is auto to automatically negotiate speed enum: `100m`, `10m`, `1g`, `2.5g`, `5g`, `10g`, `25g`, `40g`, `100g`,`auto`
        /// </summary>
        [Input("speed")]
        public Input<string>? Speed { get; set; }

        /// <summary>
        /// Switch storm control. Only if `mode`!=`dynamic`
        /// </summary>
        [Input("stormControl")]
        public Input<Inputs.NetworktemplatePortUsagesStormControlGetArgs>? StormControl { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic` when enabled, the port is not expected to receive BPDU frames
        /// </summary>
        [Input("stpEdge")]
        public Input<bool>? StpEdge { get; set; }

        [Input("stpNoRootPort")]
        public Input<bool>? StpNoRootPort { get; set; }

        [Input("stpP2p")]
        public Input<bool>? StpP2p { get; set; }

        /// <summary>
        /// Optional for Campus Fabric Core-Distribution ESI-LAG profile. Helper used by the UI to select this port profile as the ESI-Lag between Distribution and Access switches
        /// </summary>
        [Input("uiEvpntopoId")]
        public Input<string>? UiEvpntopoId { get; set; }

        /// <summary>
        /// If this is connected to a vstp network
        /// </summary>
        [Input("useVstp")]
        public Input<bool>? UseVstp { get; set; }

        /// <summary>
        /// Only if `mode`!=`dynamic` network/vlan for voip traffic, must also set port_network. to authenticate device, set port_auth
        /// </summary>
        [Input("voipNetwork")]
        public Input<string>? VoipNetwork { get; set; }

        public NetworktemplatePortUsagesGetArgs()
        {
        }
        public static new NetworktemplatePortUsagesGetArgs Empty => new NetworktemplatePortUsagesGetArgs();
    }
}
