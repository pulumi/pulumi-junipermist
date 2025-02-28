// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayTunnelProviderOptionsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// For jse-ipsec, this allows provisioning of adequate resource on JSE. Make sure adequate licenses are added
        /// </summary>
        [Input("jse")]
        public Input<Inputs.GatewayTunnelProviderOptionsJseArgs>? Jse { get; set; }

        /// <summary>
        /// For zscaler-ipsec and zscaler-gre
        /// </summary>
        [Input("zscaler")]
        public Input<Inputs.GatewayTunnelProviderOptionsZscalerArgs>? Zscaler { get; set; }

        public GatewayTunnelProviderOptionsArgs()
        {
        }
        public static new GatewayTunnelProviderOptionsArgs Empty => new GatewayTunnelProviderOptionsArgs();
    }
}
