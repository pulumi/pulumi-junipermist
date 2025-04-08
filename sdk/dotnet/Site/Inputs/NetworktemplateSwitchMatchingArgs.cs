// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplateSwitchMatchingArgs : global::Pulumi.ResourceArgs
    {
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        [Input("rules")]
        private InputList<Inputs.NetworktemplateSwitchMatchingRuleArgs>? _rules;

        /// <summary>
        /// list of rules to define custom switch configuration based on different criteria. Each list must have at least one of `match_model`, `match_name` or `match_role` must be defined
        /// </summary>
        public InputList<Inputs.NetworktemplateSwitchMatchingRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.NetworktemplateSwitchMatchingRuleArgs>());
            set => _rules = value;
        }

        public NetworktemplateSwitchMatchingArgs()
        {
        }
        public static new NetworktemplateSwitchMatchingArgs Empty => new NetworktemplateSwitchMatchingArgs();
    }
}
