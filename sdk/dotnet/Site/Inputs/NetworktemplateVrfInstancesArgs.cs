// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplateVrfInstancesArgs : global::Pulumi.ResourceArgs
    {
        [Input("extraRoutes")]
        private InputMap<Inputs.NetworktemplateVrfInstancesExtraRoutesArgs>? _extraRoutes;

        /// <summary>
        /// Property key is the destination CIDR (e.g. "10.0.0.0/8")
        /// </summary>
        public InputMap<Inputs.NetworktemplateVrfInstancesExtraRoutesArgs> ExtraRoutes
        {
            get => _extraRoutes ?? (_extraRoutes = new InputMap<Inputs.NetworktemplateVrfInstancesExtraRoutesArgs>());
            set => _extraRoutes = value;
        }

        [Input("networks")]
        private InputList<string>? _networks;
        public InputList<string> Networks
        {
            get => _networks ?? (_networks = new InputList<string>());
            set => _networks = value;
        }

        public NetworktemplateVrfInstancesArgs()
        {
        }
        public static new NetworktemplateVrfInstancesArgs Empty => new NetworktemplateVrfInstancesArgs();
    }
}
