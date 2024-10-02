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
    public sealed class GatewaytemplateTunnelProviderOptionsZscaler
    {
        public readonly bool? AupAcceptanceRequired;
        /// <summary>
        /// days before AUP is requested again
        /// </summary>
        public readonly int? AupExpire;
        /// <summary>
        /// proxy HTTPs traffic, requiring Zscaler cert to be installed in browser
        /// </summary>
        public readonly bool? AupSslProxy;
        /// <summary>
        /// the download bandwidth cap of the link, in Mbps
        /// </summary>
        public readonly int? DownloadMbps;
        /// <summary>
        /// if `use_xff`==`true`, display Acceptable Use Policy (AUP)
        /// </summary>
        public readonly bool? EnableAup;
        /// <summary>
        /// when `enforce_authentication`==`false`, display caution notification for non-authenticated users
        /// </summary>
        public readonly bool? EnableCaution;
        public readonly bool? EnforceAuthentication;
        public readonly string? Name;
        /// <summary>
        /// if `use_xff`==`true`
        /// </summary>
        public readonly ImmutableArray<Outputs.GatewaytemplateTunnelProviderOptionsZscalerSubLocation> SubLocations;
        /// <summary>
        /// the download bandwidth cap of the link, in Mbps
        /// </summary>
        public readonly int? UploadMbps;
        /// <summary>
        /// location uses proxy chaining to forward traffic
        /// </summary>
        public readonly bool? UseXff;

        [OutputConstructor]
        private GatewaytemplateTunnelProviderOptionsZscaler(
            bool? aupAcceptanceRequired,

            int? aupExpire,

            bool? aupSslProxy,

            int? downloadMbps,

            bool? enableAup,

            bool? enableCaution,

            bool? enforceAuthentication,

            string? name,

            ImmutableArray<Outputs.GatewaytemplateTunnelProviderOptionsZscalerSubLocation> subLocations,

            int? uploadMbps,

            bool? useXff)
        {
            AupAcceptanceRequired = aupAcceptanceRequired;
            AupExpire = aupExpire;
            AupSslProxy = aupSslProxy;
            DownloadMbps = downloadMbps;
            EnableAup = enableAup;
            EnableCaution = enableCaution;
            EnforceAuthentication = enforceAuthentication;
            Name = name;
            SubLocations = subLocations;
            UploadMbps = uploadMbps;
            UseXff = useXff;
        }
    }
}