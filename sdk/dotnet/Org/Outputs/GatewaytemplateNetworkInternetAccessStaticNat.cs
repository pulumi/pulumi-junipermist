// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Outputs
{

    [OutputType]
    public sealed class GatewaytemplateNetworkInternetAccessStaticNat
    {
        /// <summary>
        /// The Static NAT destination IP Address. Must be an IP Address (i.e. "192.168.70.3") or a Variable (i.e. "{{myvar}}")
        /// </summary>
        public readonly string InternalIp;
        public readonly string Name;
        /// <summary>
        /// SRX Only. If not set, we configure the nat policies against all WAN ports for simplicity. Can be a Variable (i.e. "{{myvar}}")
        /// </summary>
        public readonly string? WanName;

        [OutputConstructor]
        private GatewaytemplateNetworkInternetAccessStaticNat(
            string internalIp,

            string name,

            string? wanName)
        {
            InternalIp = internalIp;
            Name = name;
            WanName = wanName;
        }
    }
}
