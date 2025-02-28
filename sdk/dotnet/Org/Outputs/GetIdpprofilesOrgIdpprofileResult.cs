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
    public sealed class GetIdpprofilesOrgIdpprofileResult
    {
        /// <summary>
        /// enum: `critical`, `standard`, `strict`
        /// </summary>
        public readonly string BaseProfile;
        /// <summary>
        /// When the object has been created, in epoch
        /// </summary>
        public readonly double CreatedTime;
        /// <summary>
        /// Unique ID of the object instance in the Mist Organnization
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// When the object has been modified for the last time, in epoch
        /// </summary>
        public readonly double ModifiedTime;
        public readonly string Name;
        public readonly string OrgId;
        public readonly ImmutableArray<Outputs.GetIdpprofilesOrgIdpprofileOverwriteResult> Overwrites;

        [OutputConstructor]
        private GetIdpprofilesOrgIdpprofileResult(
            string baseProfile,

            double createdTime,

            string id,

            double modifiedTime,

            string name,

            string orgId,

            ImmutableArray<Outputs.GetIdpprofilesOrgIdpprofileOverwriteResult> overwrites)
        {
            BaseProfile = baseProfile;
            CreatedTime = createdTime;
            Id = id;
            ModifiedTime = modifiedTime;
            Name = name;
            OrgId = orgId;
            Overwrites = overwrites;
        }
    }
}
