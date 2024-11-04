// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class DeviceprofileGatewayNetworkMulticastArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// if the network will only be the soruce of the multicast traffic, IGMP can be disabled
        /// </summary>
        [Input("disableIgmp")]
        public Input<bool>? DisableIgmp { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("groups")]
        private InputMap<Inputs.DeviceprofileGatewayNetworkMulticastGroupsArgs>? _groups;

        /// <summary>
        /// Group address to RP (rendezvous point) mapping. Property Key is the CIDR (example "225.1.0.3/32")
        /// </summary>
        public InputMap<Inputs.DeviceprofileGatewayNetworkMulticastGroupsArgs> Groups
        {
            get => _groups ?? (_groups = new InputMap<Inputs.DeviceprofileGatewayNetworkMulticastGroupsArgs>());
            set => _groups = value;
        }

        public DeviceprofileGatewayNetworkMulticastArgs()
        {
        }
        public static new DeviceprofileGatewayNetworkMulticastArgs Empty => new DeviceprofileGatewayNetworkMulticastArgs();
    }
}