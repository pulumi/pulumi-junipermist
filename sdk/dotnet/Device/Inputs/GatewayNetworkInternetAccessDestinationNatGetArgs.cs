// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayNetworkInternetAccessDestinationNatGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Destination NAT destination IP Address. Must be an IP (i.e. "192.168.70.30") or a Variable (i.e. "{{myvar}}")
        /// </summary>
        [Input("internalIp")]
        public Input<string>? InternalIp { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Destination NAT destination IP Address. Must be a Port (i.e. "443") or a Variable (i.e. "{{myvar}}")
        /// </summary>
        [Input("port")]
        public Input<string>? Port { get; set; }

        /// <summary>
        /// SRX Only. If not set, we configure the nat policies against all WAN ports for simplicity
        /// </summary>
        [Input("wanName")]
        public Input<string>? WanName { get; set; }

        public GatewayNetworkInternetAccessDestinationNatGetArgs()
        {
        }
        public static new GatewayNetworkInternetAccessDestinationNatGetArgs Empty => new GatewayNetworkInternetAccessDestinationNatGetArgs();
    }
}
