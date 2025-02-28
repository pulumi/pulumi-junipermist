// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Outputs
{

    [OutputType]
    public sealed class GetWlansSiteWlanHotspot20Result
    {
        public readonly ImmutableArray<string> DomainNames;
        /// <summary>
        /// Whether to enable hotspot 2.0 config
        /// </summary>
        public readonly bool Enabled;
        public readonly ImmutableArray<string> NaiRealms;
        /// <summary>
        /// List of operators to support
        /// </summary>
        public readonly ImmutableArray<string> Operators;
        public readonly ImmutableArray<string> Rcois;
        /// <summary>
        /// Venue name, default is site name
        /// </summary>
        public readonly string VenueName;

        [OutputConstructor]
        private GetWlansSiteWlanHotspot20Result(
            ImmutableArray<string> domainNames,

            bool enabled,

            ImmutableArray<string> naiRealms,

            ImmutableArray<string> operators,

            ImmutableArray<string> rcois,

            string venueName)
        {
            DomainNames = domainNames;
            Enabled = enabled;
            NaiRealms = naiRealms;
            Operators = operators;
            Rcois = rcois;
            VenueName = venueName;
        }
    }
}
