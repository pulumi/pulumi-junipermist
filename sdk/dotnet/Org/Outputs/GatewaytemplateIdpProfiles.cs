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
    public sealed class GatewaytemplateIdpProfiles
    {
        /// <summary>
        /// enum: `critical`, `standard`, `strict`
        /// </summary>
        public readonly string? BaseProfile;
        public readonly string? Name;
        public readonly string? OrgId;
        public readonly ImmutableArray<Outputs.GatewaytemplateIdpProfilesOverwrite> Overwrites;

        [OutputConstructor]
        private GatewaytemplateIdpProfiles(
            string? baseProfile,

            string? name,

            string? orgId,

            ImmutableArray<Outputs.GatewaytemplateIdpProfilesOverwrite> overwrites)
        {
            BaseProfile = baseProfile;
            Name = name;
            OrgId = orgId;
            Overwrites = overwrites;
        }
    }
}