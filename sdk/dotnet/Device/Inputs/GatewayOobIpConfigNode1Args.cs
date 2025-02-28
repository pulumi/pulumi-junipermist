// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayOobIpConfigNode1Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If `type`==`static`
        /// </summary>
        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        [Input("ip")]
        public Input<string>? Ip { get; set; }

        /// <summary>
        /// Used only if `subnet` is not specified in `networks`
        /// </summary>
        [Input("netmask")]
        public Input<string>? Netmask { get; set; }

        /// <summary>
        /// enum: `dhcp`, `static`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// If supported on the platform. If enabled, DNS will be using this routing-instance, too
        /// </summary>
        [Input("useMgmtVrf")]
        public Input<bool>? UseMgmtVrf { get; set; }

        /// <summary>
        /// Whether to use `mgmt_junos` for host-out traffic (NTP/TACPLUS/RADIUS/SYSLOG/SNMP), if alternative source network/ip is desired
        /// </summary>
        [Input("useMgmtVrfForHostOut")]
        public Input<bool>? UseMgmtVrfForHostOut { get; set; }

        [Input("vlanId")]
        public Input<string>? VlanId { get; set; }

        public GatewayOobIpConfigNode1Args()
        {
        }
        public static new GatewayOobIpConfigNode1Args Empty => new GatewayOobIpConfigNode1Args();
    }
}
