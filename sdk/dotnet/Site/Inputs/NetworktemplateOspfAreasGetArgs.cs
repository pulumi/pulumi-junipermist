// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplateOspfAreasGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("includeLoopback")]
        public Input<bool>? IncludeLoopback { get; set; }

        [Input("networks", required: true)]
        private InputMap<Inputs.NetworktemplateOspfAreasNetworksGetArgs>? _networks;
        public InputMap<Inputs.NetworktemplateOspfAreasNetworksGetArgs> Networks
        {
            get => _networks ?? (_networks = new InputMap<Inputs.NetworktemplateOspfAreasNetworksGetArgs>());
            set => _networks = value;
        }

        /// <summary>
        /// OSPF type. enum: `default`, `nssa`, `stub`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public NetworktemplateOspfAreasGetArgs()
        {
        }
        public static new NetworktemplateOspfAreasGetArgs Empty => new NetworktemplateOspfAreasGetArgs();
    }
}
