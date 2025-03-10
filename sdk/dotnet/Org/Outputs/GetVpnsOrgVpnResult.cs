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
    public sealed class GetVpnsOrgVpnResult
    {
        public readonly double CreatedTime;
        public readonly string Id;
        public readonly double ModifiedTime;
        public readonly string Name;
        public readonly string OrgId;
        public readonly ImmutableDictionary<string, Outputs.GetVpnsOrgVpnPathsResult> Paths;

        [OutputConstructor]
        private GetVpnsOrgVpnResult(
            double createdTime,

            string id,

            double modifiedTime,

            string name,

            string orgId,

            ImmutableDictionary<string, Outputs.GetVpnsOrgVpnPathsResult> paths)
        {
            CreatedTime = createdTime;
            Id = id;
            ModifiedTime = modifiedTime;
            Name = name;
            OrgId = orgId;
            Paths = paths;
        }
    }
}
