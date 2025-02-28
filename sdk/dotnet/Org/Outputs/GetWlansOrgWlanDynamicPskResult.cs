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
    public sealed class GetWlansOrgWlanDynamicPskResult
    {
        /// <summary>
        /// Default PSK to use if cloud WLC is not available, 8-63 characters
        /// </summary>
        public readonly string DefaultPsk;
        public readonly string DefaultVlanId;
        public readonly bool Enabled;
        /// <summary>
        /// When 11r is enabled, we'll try to use the cached PMK, this can be disabled. `false` means auto
        /// </summary>
        public readonly bool ForceLookup;
        /// <summary>
        /// enum: `cloud_psks`, `radius`
        /// </summary>
        public readonly string Source;

        [OutputConstructor]
        private GetWlansOrgWlanDynamicPskResult(
            string defaultPsk,

            string defaultVlanId,

            bool enabled,

            bool forceLookup,

            string source)
        {
            DefaultPsk = defaultPsk;
            DefaultVlanId = defaultVlanId;
            Enabled = enabled;
            ForceLookup = forceLookup;
            Source = source;
        }
    }
}
