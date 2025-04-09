// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class VpnPathsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `broadband`, `lte`
        /// </summary>
        [Input("bfdProfile")]
        public Input<string>? BfdProfile { get; set; }

        /// <summary>
        /// If `type`==`mesh` and for SSR only, whether to use tunnel mode
        /// </summary>
        [Input("bfdUseTunnelMode")]
        public Input<bool>? BfdUseTunnelMode { get; set; }

        /// <summary>
        /// If different from the wan port
        /// </summary>
        [Input("ip")]
        public Input<string>? Ip { get; set; }

        [Input("peerPaths")]
        private InputMap<Inputs.VpnPathsPeerPathsGetArgs>? _peerPaths;

        /// <summary>
        /// If `type`==`mesh`, Property key is the Peer Interface name
        /// </summary>
        public InputMap<Inputs.VpnPathsPeerPathsGetArgs> PeerPaths
        {
            get => _peerPaths ?? (_peerPaths = new InputMap<Inputs.VpnPathsPeerPathsGetArgs>());
            set => _peerPaths = value;
        }

        [Input("pod")]
        public Input<int>? Pod { get; set; }

        [Input("trafficShaping")]
        public Input<Inputs.VpnPathsTrafficShapingGetArgs>? TrafficShaping { get; set; }

        public VpnPathsGetArgs()
        {
        }
        public static new VpnPathsGetArgs Empty => new VpnPathsGetArgs();
    }
}
