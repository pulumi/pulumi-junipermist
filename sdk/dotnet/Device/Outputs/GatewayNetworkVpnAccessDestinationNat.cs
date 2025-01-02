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
    public sealed class GatewayNetworkVpnAccessDestinationNat
    {
        /// <summary>
        /// The Destination NAT destination IP Address. Must be an IP (i.e. "192.168.70.30") or a Variable (i.e. "{{myvar}}")
        /// </summary>
        public readonly string? InternalIp;
        public readonly string? Name;
        public readonly string? Port;

        [OutputConstructor]
        private GatewayNetworkVpnAccessDestinationNat(
            string? internalIp,

            string? name,

            string? port)
        {
            InternalIp = internalIp;
            Name = name;
            Port = port;
        }
    }
}
