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
    public sealed class SwitchIpConfig
    {
        /// <summary>
        /// Required when `type`==`static`
        /// </summary>
        public readonly ImmutableArray<string> Dns;
        public readonly ImmutableArray<string> DnsSuffixes;
        public readonly string? Gateway;
        public readonly string? Ip;
        /// <summary>
        /// Used only if `subnet` is not specified in `networks`
        /// </summary>
        public readonly string? Netmask;
        /// <summary>
        /// Network where this mgmt IP reside, this will be used as default network for outbound-ssh, dns, ntp, dns, tacplus, radius, syslog, snmp
        /// </summary>
        public readonly string? Network;
        /// <summary>
        /// enum: `dhcp`, `static`
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private SwitchIpConfig(
            ImmutableArray<string> dns,

            ImmutableArray<string> dnsSuffixes,

            string? gateway,

            string? ip,

            string? netmask,

            string? network,

            string? type)
        {
            Dns = dns;
            DnsSuffixes = dnsSuffixes;
            Gateway = gateway;
            Ip = ip;
            Netmask = netmask;
            Network = network;
            Type = type;
        }
    }
}
