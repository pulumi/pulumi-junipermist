// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplateSwitchMatchingRulePortConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// To disable LACP support for the AE interface
        /// </summary>
        [Input("aeDisableLacp")]
        public Input<bool>? AeDisableLacp { get; set; }

        /// <summary>
        /// Users could force to use the designated AE name
        /// </summary>
        [Input("aeIdx")]
        public Input<int>? AeIdx { get; set; }

        /// <summary>
        /// To use fast timeout
        /// </summary>
        [Input("aeLacpSlow")]
        public Input<bool>? AeLacpSlow { get; set; }

        [Input("aggregated")]
        public Input<bool>? Aggregated { get; set; }

        /// <summary>
        /// To generate port up/down alarm
        /// </summary>
        [Input("critical")]
        public Input<bool>? Critical { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// If `speed` and `duplex` are specified, whether to disable autonegotiation
        /// </summary>
        [Input("disableAutoneg")]
        public Input<bool>? DisableAutoneg { get; set; }

        /// <summary>
        /// enum: `auto`, `full`, `half`
        /// </summary>
        [Input("duplex")]
        public Input<string>? Duplex { get; set; }

        /// <summary>
        /// Enable dynamic usage for this port. Set to `dynamic` to enable.
        /// </summary>
        [Input("dynamicUsage")]
        public Input<string>? DynamicUsage { get; set; }

        [Input("esilag")]
        public Input<bool>? Esilag { get; set; }

        /// <summary>
        /// Media maximum transmission unit (MTU) is the largest data unit that can be forwarded without fragmentation
        /// </summary>
        [Input("mtu")]
        public Input<int>? Mtu { get; set; }

        /// <summary>
        /// Prevent helpdesk to override the port config
        /// </summary>
        [Input("noLocalOverwrite")]
        public Input<bool>? NoLocalOverwrite { get; set; }

        [Input("poeDisabled")]
        public Input<bool>? PoeDisabled { get; set; }

        /// <summary>
        /// Required if `usage`==`vlan_tunnel`. Q-in-Q tunneling using All-in-one bundling. This also enables standard L2PT for interfaces that are not encapsulation tunnel interfaces and uses MAC rewrite operation. [View more information](https://www.juniper.net/documentation/us/en/software/junos/multicast-l2/topics/topic-map/q-in-q.html#id-understanding-qinq-tunneling-and-vlan-translation)
        /// </summary>
        [Input("portNetwork")]
        public Input<string>? PortNetwork { get; set; }

        /// <summary>
        /// enum: `100m`, `10m`, `1g`, `2.5g`, `5g`, `10g`, `25g`, `40g`, `100g`,`auto`
        /// </summary>
        [Input("speed")]
        public Input<string>? Speed { get; set; }

        /// <summary>
        /// Port usage name. For Q-in-Q, use `vlan_tunnel`. If EVPN is used, use `evpn_uplink`or `evpn_downlink`
        /// </summary>
        [Input("usage", required: true)]
        public Input<string> Usage { get; set; } = null!;

        public NetworktemplateSwitchMatchingRulePortConfigArgs()
        {
        }
        public static new NetworktemplateSwitchMatchingRulePortConfigArgs Empty => new NetworktemplateSwitchMatchingRulePortConfigArgs();
    }
}
