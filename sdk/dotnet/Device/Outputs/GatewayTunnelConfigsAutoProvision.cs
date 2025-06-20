// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Outputs
{

    [OutputType]
    public sealed class GatewayTunnelConfigsAutoProvision
    {
        public readonly bool? Enable;
        /// <summary>
        /// API override for POP selection
        /// </summary>
        public readonly Outputs.GatewayTunnelConfigsAutoProvisionLatlng? Latlng;
        public readonly Outputs.GatewayTunnelConfigsAutoProvisionPrimary? Primary;
        /// <summary>
        /// enum: `jse-ipsec`, `zscaler-ipsec`
        /// </summary>
        public readonly string Provider;
        /// <summary>
        /// API override for POP selection
        /// </summary>
        public readonly string? Region;
        public readonly Outputs.GatewayTunnelConfigsAutoProvisionSecondary? Secondary;

        [OutputConstructor]
        private GatewayTunnelConfigsAutoProvision(
            bool? enable,

            Outputs.GatewayTunnelConfigsAutoProvisionLatlng? latlng,

            Outputs.GatewayTunnelConfigsAutoProvisionPrimary? primary,

            string provider,

            string? region,

            Outputs.GatewayTunnelConfigsAutoProvisionSecondary? secondary)
        {
            Enable = enable;
            Latlng = latlng;
            Primary = primary;
            Provider = provider;
            Region = region;
            Secondary = secondary;
        }
    }
}
