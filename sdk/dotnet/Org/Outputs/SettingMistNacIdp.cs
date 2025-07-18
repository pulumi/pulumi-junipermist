// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Outputs
{

    [OutputType]
    public sealed class SettingMistNacIdp
    {
        /// <summary>
        /// When the IDP of mxedge_proxy type, exclude the following realms from proxying in addition to other valid home realms in this org
        /// </summary>
        public readonly ImmutableArray<string> ExcludeRealms;
        /// <summary>
        /// ID of the `mist_nacidp`
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Which realm should trigger this IDP. User Realm is extracted from:
        ///   * Username-AVP (`mist.com` from john@mist.com)
        ///   * Cert CN
        /// </summary>
        public readonly ImmutableArray<string> UserRealms;

        [OutputConstructor]
        private SettingMistNacIdp(
            ImmutableArray<string> excludeRealms,

            string id,

            ImmutableArray<string> userRealms)
        {
            ExcludeRealms = excludeRealms;
            Id = id;
            UserRealms = userRealms;
        }
    }
}
