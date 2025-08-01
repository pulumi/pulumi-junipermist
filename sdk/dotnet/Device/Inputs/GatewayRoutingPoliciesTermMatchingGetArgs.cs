// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayRoutingPoliciesTermMatchingGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("asPaths")]
        private InputList<string>? _asPaths;

        /// <summary>
        /// takes regular expression
        /// </summary>
        public InputList<string> AsPaths
        {
            get => _asPaths ?? (_asPaths = new InputList<string>());
            set => _asPaths = value;
        }

        [Input("communities")]
        private InputList<string>? _communities;
        public InputList<string> Communities
        {
            get => _communities ?? (_communities = new InputList<string>());
            set => _communities = value;
        }

        [Input("networks")]
        private InputList<string>? _networks;
        public InputList<string> Networks
        {
            get => _networks ?? (_networks = new InputList<string>());
            set => _networks = value;
        }

        [Input("prefixes")]
        private InputList<string>? _prefixes;

        /// <summary>
        /// zero or more criteria/filter can be specified to match the term, all criteria have to be met
        /// </summary>
        public InputList<string> Prefixes
        {
            get => _prefixes ?? (_prefixes = new InputList<string>());
            set => _prefixes = value;
        }

        [Input("protocols")]
        private InputList<string>? _protocols;

        /// <summary>
        /// `direct`, `bgp`, `osp`, `static`, `aggregate`...
        /// </summary>
        public InputList<string> Protocols
        {
            get => _protocols ?? (_protocols = new InputList<string>());
            set => _protocols = value;
        }

        [Input("routeExists")]
        public Input<Inputs.GatewayRoutingPoliciesTermMatchingRouteExistsGetArgs>? RouteExists { get; set; }

        [Input("vpnNeighborMacs")]
        private InputList<string>? _vpnNeighborMacs;

        /// <summary>
        /// overlay-facing criteria (used for bgp_config where via=vpn)
        /// </summary>
        public InputList<string> VpnNeighborMacs
        {
            get => _vpnNeighborMacs ?? (_vpnNeighborMacs = new InputList<string>());
            set => _vpnNeighborMacs = value;
        }

        [Input("vpnPathSla")]
        public Input<Inputs.GatewayRoutingPoliciesTermMatchingVpnPathSlaGetArgs>? VpnPathSla { get; set; }

        [Input("vpnPaths")]
        private InputList<string>? _vpnPaths;

        /// <summary>
        /// overlay-facing criteria (used for bgp_config where via=vpn). ordered-
        /// </summary>
        public InputList<string> VpnPaths
        {
            get => _vpnPaths ?? (_vpnPaths = new InputList<string>());
            set => _vpnPaths = value;
        }

        public GatewayRoutingPoliciesTermMatchingGetArgs()
        {
        }
        public static new GatewayRoutingPoliciesTermMatchingGetArgs Empty => new GatewayRoutingPoliciesTermMatchingGetArgs();
    }
}
