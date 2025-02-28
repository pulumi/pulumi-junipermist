// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchExtraRoutes6GetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This takes precedence
        /// </summary>
        [Input("discard")]
        public Input<bool>? Discard { get; set; }

        [Input("metric")]
        public Input<int>? Metric { get; set; }

        [Input("nextQualified")]
        private InputMap<Inputs.SwitchExtraRoutes6NextQualifiedGetArgs>? _nextQualified;
        public InputMap<Inputs.SwitchExtraRoutes6NextQualifiedGetArgs> NextQualified
        {
            get => _nextQualified ?? (_nextQualified = new InputMap<Inputs.SwitchExtraRoutes6NextQualifiedGetArgs>());
            set => _nextQualified = value;
        }

        [Input("noResolve")]
        public Input<bool>? NoResolve { get; set; }

        [Input("preference")]
        public Input<int>? Preference { get; set; }

        /// <summary>
        /// Next-hop IP Address
        /// </summary>
        [Input("via", required: true)]
        public Input<string> Via { get; set; } = null!;

        public SwitchExtraRoutes6GetArgs()
        {
        }
        public static new SwitchExtraRoutes6GetArgs Empty => new SwitchExtraRoutes6GetArgs();
    }
}
