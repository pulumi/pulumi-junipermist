// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class NetworktemplateVrfInstancesGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("evpnAutoLoopbackSubnet")]
        public Input<string>? EvpnAutoLoopbackSubnet { get; set; }

        [Input("evpnAutoLoopbackSubnet6")]
        public Input<string>? EvpnAutoLoopbackSubnet6 { get; set; }

        [Input("extraRoutes")]
        private InputMap<Inputs.NetworktemplateVrfInstancesExtraRoutesGetArgs>? _extraRoutes;

        /// <summary>
        /// Property key is the destination CIDR (e.g. "10.0.0.0/8")
        /// </summary>
        public InputMap<Inputs.NetworktemplateVrfInstancesExtraRoutesGetArgs> ExtraRoutes
        {
            get => _extraRoutes ?? (_extraRoutes = new InputMap<Inputs.NetworktemplateVrfInstancesExtraRoutesGetArgs>());
            set => _extraRoutes = value;
        }

        [Input("extraRoutes6")]
        private InputMap<Inputs.NetworktemplateVrfInstancesExtraRoutes6GetArgs>? _extraRoutes6;

        /// <summary>
        /// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
        /// </summary>
        public InputMap<Inputs.NetworktemplateVrfInstancesExtraRoutes6GetArgs> ExtraRoutes6
        {
            get => _extraRoutes6 ?? (_extraRoutes6 = new InputMap<Inputs.NetworktemplateVrfInstancesExtraRoutes6GetArgs>());
            set => _extraRoutes6 = value;
        }

        [Input("networks")]
        private InputList<string>? _networks;
        public InputList<string> Networks
        {
            get => _networks ?? (_networks = new InputList<string>());
            set => _networks = value;
        }

        public NetworktemplateVrfInstancesGetArgs()
        {
        }
        public static new NetworktemplateVrfInstancesGetArgs Empty => new NetworktemplateVrfInstancesGetArgs();
    }
}
