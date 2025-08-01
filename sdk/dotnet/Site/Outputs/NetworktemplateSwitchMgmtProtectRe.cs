// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Outputs
{

    [OutputType]
    public sealed class NetworktemplateSwitchMgmtProtectRe
    {
        /// <summary>
        /// optionally, services we'll allow. enum: `icmp`, `ssh`
        /// </summary>
        public readonly ImmutableArray<string> AllowedServices;
        public readonly ImmutableArray<Outputs.NetworktemplateSwitchMgmtProtectReCustom> Customs;
        /// <summary>
        /// When enabled, all traffic that is not essential to our operation will be dropped
        /// e.g. ntp / dns / traffic to mist will be allowed by default
        ///      if dhcpd is enabled, we'll make sure it works
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Whether to enable hit count for Protect_RE policy
        /// </summary>
        public readonly bool? HitCount;
        /// <summary>
        /// host/subnets we'll allow traffic to/from
        /// </summary>
        public readonly ImmutableArray<string> TrustedHosts;

        [OutputConstructor]
        private NetworktemplateSwitchMgmtProtectRe(
            ImmutableArray<string> allowedServices,

            ImmutableArray<Outputs.NetworktemplateSwitchMgmtProtectReCustom> customs,

            bool? enabled,

            bool? hitCount,

            ImmutableArray<string> trustedHosts)
        {
            AllowedServices = allowedServices;
            Customs = customs;
            Enabled = enabled;
            HitCount = hitCount;
            TrustedHosts = trustedHosts;
        }
    }
}
