// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Outputs
{

    [OutputType]
    public sealed class SwitchAclPolicy
    {
        /// <summary>
        /// ACL Policy Actions:
        ///   - for GBP-based policy, all src_tags and dst_tags have to be gbp-based
        ///   - for ACL-based policy, `network` is required in either the source or destination so that we know where to attach the policy to
        /// </summary>
        public readonly ImmutableArray<Outputs.SwitchAclPolicyAction> Actions;
        public readonly string? Name;
        /// <summary>
        /// ACL Policy Source Tags:
        ///   - for GBP-based policy, all src_tags and dst_tags have to be gbp-based
        ///   - for ACL-based policy, `network` is required in either the source or destination so that we know where to attach the policy to
        /// </summary>
        public readonly ImmutableArray<string> SrcTags;

        [OutputConstructor]
        private SwitchAclPolicy(
            ImmutableArray<Outputs.SwitchAclPolicyAction> actions,

            string? name,

            ImmutableArray<string> srcTags)
        {
            Actions = actions;
            Name = name;
            SrcTags = srcTags;
        }
    }
}
