// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchExtraRoutes6Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// this takes precedence
        /// </summary>
        [Input("discard")]
        public Input<bool>? Discard { get; set; }

        [Input("metric")]
        public Input<int>? Metric { get; set; }

        [Input("nextQualified")]
        private InputMap<Inputs.SwitchExtraRoutes6NextQualifiedArgs>? _nextQualified;
        public InputMap<Inputs.SwitchExtraRoutes6NextQualifiedArgs> NextQualified
        {
            get => _nextQualified ?? (_nextQualified = new InputMap<Inputs.SwitchExtraRoutes6NextQualifiedArgs>());
            set => _nextQualified = value;
        }

        [Input("noResolve")]
        public Input<bool>? NoResolve { get; set; }

        [Input("preference")]
        public Input<int>? Preference { get; set; }

        /// <summary>
        /// next-hop IP Address
        /// </summary>
        [Input("via", required: true)]
        public Input<string> Via { get; set; } = null!;

        public SwitchExtraRoutes6Args()
        {
        }
        public static new SwitchExtraRoutes6Args Empty => new SwitchExtraRoutes6Args();
    }
}