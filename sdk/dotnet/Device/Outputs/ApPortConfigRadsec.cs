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
    public sealed class ApPortConfigRadsec
    {
        public readonly bool? CoaEnabled;
        public readonly bool? Enabled;
        public readonly string? IdleTimeout;
        /// <summary>
        /// To use Org mxedges when this WLAN does not use mxtunnel, specify their mxcluster_ids. Org mxedge(s) identified by mxcluster_ids
        /// </summary>
        public readonly ImmutableArray<string> MxclusterIds;
        /// <summary>
        /// Default is site.mxedge.radsec.proxy_hosts which must be a superset of all `wlans[*].radsec.proxy_hosts`. When `radsec.proxy_hosts` are not used, tunnel peers (org or site mxedges) are used irrespective of `use_site_mxedge`
        /// </summary>
        public readonly ImmutableArray<string> ProxyHosts;
        /// <summary>
        /// Name of the server to verify (against the cacerts in Org Setting). Only if not Mist Edge.
        /// </summary>
        public readonly string? ServerName;
        /// <summary>
        /// List of RadSec Servers. Only if not Mist Edge.
        /// </summary>
        public readonly ImmutableArray<Outputs.ApPortConfigRadsecServer> Servers;
        /// <summary>
        /// use mxedge(s) as RadSec Proxy
        /// </summary>
        public readonly bool? UseMxedge;
        /// <summary>
        /// To use Site mxedges when this WLAN does not use mxtunnel
        /// </summary>
        public readonly bool? UseSiteMxedge;

        [OutputConstructor]
        private ApPortConfigRadsec(
            bool? coaEnabled,

            bool? enabled,

            string? idleTimeout,

            ImmutableArray<string> mxclusterIds,

            ImmutableArray<string> proxyHosts,

            string? serverName,

            ImmutableArray<Outputs.ApPortConfigRadsecServer> servers,

            bool? useMxedge,

            bool? useSiteMxedge)
        {
            CoaEnabled = coaEnabled;
            Enabled = enabled;
            IdleTimeout = idleTimeout;
            MxclusterIds = mxclusterIds;
            ProxyHosts = proxyHosts;
            ServerName = serverName;
            Servers = servers;
            UseMxedge = useMxedge;
            UseSiteMxedge = useSiteMxedge;
        }
    }
}
