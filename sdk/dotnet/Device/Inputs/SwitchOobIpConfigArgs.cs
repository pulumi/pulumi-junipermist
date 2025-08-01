// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchOobIpConfigArgs : global::Pulumi.ResourceArgs
    {
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
        /// Optional, the network to be used for mgmt
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

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
        /// For host-out traffic (NTP/TACPLUS/RADIUS/SYSLOG/SNMP), if alternative source network/ip is desired
        /// </summary>
        [Input("useMgmtVrfForHostOut")]
        public Input<bool>? UseMgmtVrfForHostOut { get; set; }

        public SwitchOobIpConfigArgs()
        {
        }
        public static new SwitchOobIpConfigArgs Empty => new SwitchOobIpConfigArgs();
    }
}
