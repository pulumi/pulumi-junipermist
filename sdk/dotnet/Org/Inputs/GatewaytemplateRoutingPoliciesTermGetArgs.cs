// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplateRoutingPoliciesTermGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When used as import policy
        /// </summary>
        [Input("actions")]
        public Input<Inputs.GatewaytemplateRoutingPoliciesTermActionsGetArgs>? Actions { get; set; }

        /// <summary>
        /// zero or more criteria/filter can be specified to match the term, all criteria have to be met
        /// </summary>
        [Input("matching")]
        public Input<Inputs.GatewaytemplateRoutingPoliciesTermMatchingGetArgs>? Matching { get; set; }

        public GatewaytemplateRoutingPoliciesTermGetArgs()
        {
        }
        public static new GatewaytemplateRoutingPoliciesTermGetArgs Empty => new GatewaytemplateRoutingPoliciesTermGetArgs();
    }
}
