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
    public sealed class GatewayBgpConfig
    {
        /// <summary>
        /// Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`
        /// </summary>
        public readonly string? AuthKey;
        /// <summary>
        /// Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`, when bfd_multiplier is configured alone. Default:
        ///   * 1000 if `type`==`external`
        ///   * 350 `type`==`internal`
        /// </summary>
        public readonly int? BfdMinimumInterval;
        /// <summary>
        /// Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`, when bfd_minimum_interval_is_configured alone
        /// </summary>
        public readonly int? BfdMultiplier;
        /// <summary>
        /// Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. BFD provides faster path failure detection and is enabled by default
        /// </summary>
        public readonly bool? DisableBfd;
        public readonly string? Export;
        /// <summary>
        /// Default export policies if no per-neighbor policies defined
        /// </summary>
        public readonly string? ExportPolicy;
        /// <summary>
        /// Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. By default, either inet/net6 unicast depending on neighbor IP family (v4 or v6). For v6 neighbors, to exchange v4 nexthop, which allows dual-stack support, enable this
        /// </summary>
        public readonly bool? ExtendedV4Nexthop;
        /// <summary>
        /// Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. `0` means disable
        /// </summary>
        public readonly int? GracefulRestartTime;
        /// <summary>
        /// Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. Default is 90.
        /// </summary>
        public readonly int? HoldTime;
        public readonly string? Import;
        /// <summary>
        /// Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. Default import policies if no per-neighbor policies defined
        /// </summary>
        public readonly string? ImportPolicy;
        /// <summary>
        /// Required if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. BGPLocal AS. Value must be in range 1-4294967295 or a variable (e.g. `{{as_variable}}`)
        /// </summary>
        public readonly string? LocalAs;
        /// <summary>
        /// Neighbor AS. If `type`==`internal`, must be equal to `local_as`. Value must be in range 1-4294967295 or a variable (e.g. `{{as_variable}}`)
        /// </summary>
        public readonly string? NeighborAs;
        /// <summary>
        /// Required if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. If per-neighbor as is desired. Property key is the neighbor address
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GatewayBgpConfigNeighbors>? Neighbors;
        /// <summary>
        /// Optional if `via`==`lan`. List of networks where we expect BGP neighbor to connect to/from
        /// </summary>
        public readonly ImmutableArray<string> Networks;
        /// <summary>
        /// Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. If true, we will not advertise private ASNs (AS 64512-65534) to this neighbor
        /// </summary>
        public readonly bool? NoPrivateAs;
        /// <summary>
        /// Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. By default, we'll re-advertise all learned BGP routers toward overlay
        /// </summary>
        public readonly bool? NoReadvertiseToOverlay;
        /// <summary>
        /// Optional if `via`==`tunnel`
        /// </summary>
        public readonly string? TunnelName;
        /// <summary>
        /// Required if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. enum: `external`, `internal`
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// enum: `lan`, `tunnel`, `vpn`, `wan`
        /// </summary>
        public readonly string Via;
        /// <summary>
        /// Optional if `via`==`vpn`
        /// </summary>
        public readonly string? VpnName;
        /// <summary>
        /// Optional if `via`==`wan`
        /// </summary>
        public readonly string? WanName;

        [OutputConstructor]
        private GatewayBgpConfig(
            string? authKey,

            int? bfdMinimumInterval,

            int? bfdMultiplier,

            bool? disableBfd,

            string? export,

            string? exportPolicy,

            bool? extendedV4Nexthop,

            int? gracefulRestartTime,

            int? holdTime,

            string? import,

            string? importPolicy,

            string? localAs,

            string? neighborAs,

            ImmutableDictionary<string, Outputs.GatewayBgpConfigNeighbors>? neighbors,

            ImmutableArray<string> networks,

            bool? noPrivateAs,

            bool? noReadvertiseToOverlay,

            string? tunnelName,

            string? type,

            string via,

            string? vpnName,

            string? wanName)
        {
            AuthKey = authKey;
            BfdMinimumInterval = bfdMinimumInterval;
            BfdMultiplier = bfdMultiplier;
            DisableBfd = disableBfd;
            Export = export;
            ExportPolicy = exportPolicy;
            ExtendedV4Nexthop = extendedV4Nexthop;
            GracefulRestartTime = gracefulRestartTime;
            HoldTime = holdTime;
            Import = import;
            ImportPolicy = importPolicy;
            LocalAs = localAs;
            NeighborAs = neighborAs;
            Neighbors = neighbors;
            Networks = networks;
            NoPrivateAs = noPrivateAs;
            NoReadvertiseToOverlay = noReadvertiseToOverlay;
            TunnelName = tunnelName;
            Type = type;
            Via = via;
            VpnName = vpnName;
            WanName = wanName;
        }
    }
}
