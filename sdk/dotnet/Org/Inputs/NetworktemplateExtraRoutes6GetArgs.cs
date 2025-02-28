// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class NetworktemplateExtraRoutes6GetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This takes precedence
        /// </summary>
        [Input("discard")]
        public Input<bool>? Discard { get; set; }

        [Input("metric")]
        public Input<int>? Metric { get; set; }

        [Input("nextQualified")]
        private InputMap<Inputs.NetworktemplateExtraRoutes6NextQualifiedGetArgs>? _nextQualified;
        public InputMap<Inputs.NetworktemplateExtraRoutes6NextQualifiedGetArgs> NextQualified
        {
            get => _nextQualified ?? (_nextQualified = new InputMap<Inputs.NetworktemplateExtraRoutes6NextQualifiedGetArgs>());
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

        public NetworktemplateExtraRoutes6GetArgs()
        {
        }
        public static new NetworktemplateExtraRoutes6GetArgs Empty => new NetworktemplateExtraRoutes6GetArgs();
    }
}
