// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Outputs
{

    [OutputType]
    public sealed class SettingGatewayMgmtAppProbingCustomApp
    {
        public readonly string? Address;
        public readonly string? AppType;
        /// <summary>
        /// Only 1 entry is allowed:
        ///     * if `protocol`==`http`: URL (e.g. `http://test.com` or `https://test.com`)
        ///     * if `protocol`==`icmp`: IP Address (e.g. `1.2.3.4`)
        /// </summary>
        public readonly ImmutableArray<string> Hostnames;
        public readonly string? Key;
        public readonly string Name;
        public readonly string? Network;
        /// <summary>
        /// If `protocol`==`icmp`
        /// </summary>
        public readonly int? PacketSize;
        /// <summary>
        /// enum: `http`, `icmp`
        /// </summary>
        public readonly string Protocol;
        public readonly string? Url;
        public readonly string? Vrf;

        [OutputConstructor]
        private SettingGatewayMgmtAppProbingCustomApp(
            string? address,

            string? appType,

            ImmutableArray<string> hostnames,

            string? key,

            string name,

            string? network,

            int? packetSize,

            string protocol,

            string? url,

            string? vrf)
        {
            Address = address;
            AppType = appType;
            Hostnames = hostnames;
            Key = key;
            Name = name;
            Network = network;
            PacketSize = packetSize;
            Protocol = protocol;
            Url = url;
            Vrf = vrf;
        }
    }
}
