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
    public sealed class GatewayTunnelConfigsPrimary
    {
        public readonly ImmutableArray<string> Hosts;
        /// <summary>
        /// Only if `provider`==`zscaler-gre`, `provider`==`jse-ipsec`, `provider`==`custom-ipsec` or `provider`==`custom-gre`
        /// </summary>
        public readonly ImmutableArray<string> InternalIps;
        public readonly ImmutableArray<string> ProbeIps;
        /// <summary>
        /// Only if  `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
        /// </summary>
        public readonly ImmutableArray<string> RemoteIds;
        public readonly ImmutableArray<string> WanNames;

        [OutputConstructor]
        private GatewayTunnelConfigsPrimary(
            ImmutableArray<string> hosts,

            ImmutableArray<string> internalIps,

            ImmutableArray<string> probeIps,

            ImmutableArray<string> remoteIds,

            ImmutableArray<string> wanNames)
        {
            Hosts = hosts;
            InternalIps = internalIps;
            ProbeIps = probeIps;
            RemoteIds = remoteIds;
            WanNames = wanNames;
        }
    }
}
