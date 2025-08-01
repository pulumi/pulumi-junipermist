// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class NetworktemplateAclPolicyArgs : global::Pulumi.ResourceArgs
    {
        [Input("actions")]
        private InputList<Inputs.NetworktemplateAclPolicyActionArgs>? _actions;

        /// <summary>
        /// ACL Policy Actions:
        ///   - for GBP-based policy, all src_tags and dst_tags have to be gbp-based
        ///   - for ACL-based policy, `network` is required in either the source or destination so that we know where to attach the policy to
        /// </summary>
        public InputList<Inputs.NetworktemplateAclPolicyActionArgs> Actions
        {
            get => _actions ?? (_actions = new InputList<Inputs.NetworktemplateAclPolicyActionArgs>());
            set => _actions = value;
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("srcTags")]
        private InputList<string>? _srcTags;

        /// <summary>
        /// ACL Policy Source Tags:
        ///   - for GBP-based policy, all src_tags and dst_tags have to be gbp-based
        ///   - for ACL-based policy, `network` is required in either the source or destination so that we know where to attach the policy to
        /// </summary>
        public InputList<string> SrcTags
        {
            get => _srcTags ?? (_srcTags = new InputList<string>());
            set => _srcTags = value;
        }

        public NetworktemplateAclPolicyArgs()
        {
        }
        public static new NetworktemplateAclPolicyArgs Empty => new NetworktemplateAclPolicyArgs();
    }
}
