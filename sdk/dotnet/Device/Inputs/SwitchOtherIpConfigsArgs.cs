// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchOtherIpConfigsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// For EVPN, if anycast is desired
        /// </summary>
        [Input("evpnAnycast")]
        public Input<bool>? EvpnAnycast { get; set; }

        /// <summary>
        /// Required if `type`==`static`
        /// </summary>
        [Input("ip")]
        public Input<string>? Ip { get; set; }

        /// <summary>
        /// Required if `type6`==`static`
        /// </summary>
        [Input("ip6")]
        public Input<string>? Ip6 { get; set; }

        /// <summary>
        /// Optional, `subnet` from `network` definition will be used if defined
        /// </summary>
        [Input("netmask")]
        public Input<string>? Netmask { get; set; }

        /// <summary>
        /// Optional, `subnet` from `network` definition will be used if defined
        /// </summary>
        [Input("netmask6")]
        public Input<string>? Netmask6 { get; set; }

        /// <summary>
        /// enum: `dhcp`, `static`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// enum: `autoconf`, `dhcp`, `disabled`, `static`
        /// </summary>
        [Input("type6")]
        public Input<string>? Type6 { get; set; }

        public SwitchOtherIpConfigsArgs()
        {
        }
        public static new SwitchOtherIpConfigsArgs Empty => new SwitchOtherIpConfigsArgs();
    }
}
