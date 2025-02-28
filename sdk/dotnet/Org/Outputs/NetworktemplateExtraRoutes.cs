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
    public sealed class NetworktemplateExtraRoutes
    {
        /// <summary>
        /// This takes precedence
        /// </summary>
        public readonly bool? Discard;
        public readonly int? Metric;
        public readonly ImmutableDictionary<string, Outputs.NetworktemplateExtraRoutesNextQualified>? NextQualified;
        public readonly bool? NoResolve;
        public readonly int? Preference;
        /// <summary>
        /// Next-hop IP Address
        /// </summary>
        public readonly string Via;

        [OutputConstructor]
        private NetworktemplateExtraRoutes(
            bool? discard,

            int? metric,

            ImmutableDictionary<string, Outputs.NetworktemplateExtraRoutesNextQualified>? nextQualified,

            bool? noResolve,

            int? preference,

            string via)
        {
            Discard = discard;
            Metric = metric;
            NextQualified = nextQualified;
            NoResolve = noResolve;
            Preference = preference;
            Via = via;
        }
    }
}
