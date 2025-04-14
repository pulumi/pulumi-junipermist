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
    public sealed class DeviceprofileGatewayTunnelConfigs
    {
        public readonly Outputs.DeviceprofileGatewayTunnelConfigsAutoProvision? AutoProvision;
        /// <summary>
        /// Only if `provider`==`custom-ipsec`. Must be between 180 and 86400
        /// </summary>
        public readonly int? IkeLifetime;
        /// <summary>
        /// Only if `provider`==`custom-ipsec`. enum: `aggressive`, `main`
        /// </summary>
        public readonly string? IkeMode;
        /// <summary>
        /// If `provider`==`custom-ipsec`
        /// </summary>
        public readonly ImmutableArray<Outputs.DeviceprofileGatewayTunnelConfigsIkeProposal> IkeProposals;
        /// <summary>
        /// Only if `provider`==`custom-ipsec`. Must be between 180 and 86400
        /// </summary>
        public readonly int? IpsecLifetime;
        /// <summary>
        /// Only if  `provider`==`custom-ipsec`
        /// </summary>
        public readonly ImmutableArray<Outputs.DeviceprofileGatewayTunnelConfigsIpsecProposal> IpsecProposals;
        /// <summary>
        /// Required if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
        /// </summary>
        public readonly string? LocalId;
        /// <summary>
        /// Required if `provider`==`zscaler-gre`, `provider`==`jse-ipsec`. enum: `active-active`, `active-standby`
        /// </summary>
        public readonly string? Mode;
        /// <summary>
        /// If `provider`==`custom-ipsec`, networks reachable via this tunnel
        /// </summary>
        public readonly ImmutableArray<string> Networks;
        /// <summary>
        /// Only if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
        /// </summary>
        public readonly Outputs.DeviceprofileGatewayTunnelConfigsPrimary? Primary;
        /// <summary>
        /// Only if `provider`==`custom-ipsec`
        /// </summary>
        public readonly Outputs.DeviceprofileGatewayTunnelConfigsProbe? Probe;
        /// <summary>
        /// Only if `provider`==`custom-ipsec`. enum: `gre`, `ipsec`
        /// </summary>
        public readonly string? Protocol;
        /// <summary>
        /// Only if `auto_provision.enabled`==`false`. enum: `custom-ipsec`, `custom-gre`, `jse-ipsec`, `zscaler-gre`, `zscaler-ipsec`
        /// </summary>
        public readonly string? Provider;
        /// <summary>
        /// Required if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
        /// </summary>
        public readonly string? Psk;
        /// <summary>
        /// Only if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
        /// </summary>
        public readonly Outputs.DeviceprofileGatewayTunnelConfigsSecondary? Secondary;
        /// <summary>
        /// Only if `provider`==`custom-gre` or `provider`==`custom-ipsec`. enum: `1`, `2`
        /// </summary>
        public readonly string? Version;

        [OutputConstructor]
        private DeviceprofileGatewayTunnelConfigs(
            Outputs.DeviceprofileGatewayTunnelConfigsAutoProvision? autoProvision,

            int? ikeLifetime,

            string? ikeMode,

            ImmutableArray<Outputs.DeviceprofileGatewayTunnelConfigsIkeProposal> ikeProposals,

            int? ipsecLifetime,

            ImmutableArray<Outputs.DeviceprofileGatewayTunnelConfigsIpsecProposal> ipsecProposals,

            string? localId,

            string? mode,

            ImmutableArray<string> networks,

            Outputs.DeviceprofileGatewayTunnelConfigsPrimary? primary,

            Outputs.DeviceprofileGatewayTunnelConfigsProbe? probe,

            string? protocol,

            string? provider,

            string? psk,

            Outputs.DeviceprofileGatewayTunnelConfigsSecondary? secondary,

            string? version)
        {
            AutoProvision = autoProvision;
            IkeLifetime = ikeLifetime;
            IkeMode = ikeMode;
            IkeProposals = ikeProposals;
            IpsecLifetime = ipsecLifetime;
            IpsecProposals = ipsecProposals;
            LocalId = localId;
            Mode = mode;
            Networks = networks;
            Primary = primary;
            Probe = probe;
            Protocol = protocol;
            Provider = provider;
            Psk = psk;
            Secondary = secondary;
            Version = version;
        }
    }
}
