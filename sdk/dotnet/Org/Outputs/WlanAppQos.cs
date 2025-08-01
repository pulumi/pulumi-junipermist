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
    public sealed class WlanAppQos
    {
        public readonly ImmutableDictionary<string, Outputs.WlanAppQosApps>? Apps;
        public readonly bool? Enabled;
        public readonly ImmutableArray<Outputs.WlanAppQosOther> Others;

        [OutputConstructor]
        private WlanAppQos(
            ImmutableDictionary<string, Outputs.WlanAppQosApps>? apps,

            bool? enabled,

            ImmutableArray<Outputs.WlanAppQosOther> others)
        {
            Apps = apps;
            Enabled = enabled;
            Others = others;
        }
    }
}
