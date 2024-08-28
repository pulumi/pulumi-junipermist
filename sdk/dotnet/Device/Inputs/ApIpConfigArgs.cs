// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class ApIpConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("dns")]
        private InputList<string>? _dns;

        /// <summary>
        /// if `type`==`static`
        /// </summary>
        public InputList<string> Dns
        {
            get => _dns ?? (_dns = new InputList<string>());
            set => _dns = value;
        }

        [Input("dnsSuffixes")]
        private InputList<string>? _dnsSuffixes;

        /// <summary>
        /// required if `type`==`static`
        /// </summary>
        public InputList<string> DnsSuffixes
        {
            get => _dnsSuffixes ?? (_dnsSuffixes = new InputList<string>());
            set => _dnsSuffixes = value;
        }

        /// <summary>
        /// required if `type`==`static`
        /// </summary>
        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        [Input("gateway6")]
        public Input<string>? Gateway6 { get; set; }

        /// <summary>
        /// required if `type`==`static`
        /// </summary>
        [Input("ip")]
        public Input<string>? Ip { get; set; }

        [Input("ip6")]
        public Input<string>? Ip6 { get; set; }

        [Input("mtu")]
        public Input<int>? Mtu { get; set; }

        /// <summary>
        /// required if `type`==`static`
        /// </summary>
        [Input("netmask")]
        public Input<string>? Netmask { get; set; }

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

        /// <summary>
        /// management vlan id, default is 1 (untagged)
        /// </summary>
        [Input("vlanId")]
        public Input<int>? VlanId { get; set; }

        public ApIpConfigArgs()
        {
        }
        public static new ApIpConfigArgs Empty => new ApIpConfigArgs();
    }
}