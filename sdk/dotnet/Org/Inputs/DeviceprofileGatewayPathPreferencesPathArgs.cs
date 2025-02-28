// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class DeviceprofileGatewayPathPreferencesPathArgs : global::Pulumi.ResourceArgs
    {
        [Input("cost")]
        public Input<int>? Cost { get; set; }

        /// <summary>
        /// For SSR Only. `true`, if this specific path is undesired
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// Only if `type`==`local`, if a different gateway is desired
        /// </summary>
        [Input("gatewayIp")]
        public Input<string>? GatewayIp { get; set; }

        /// <summary>
        /// Only if `type`==`vpn`, if this vpn path can be used for internet
        /// </summary>
        [Input("internetAccess")]
        public Input<bool>? InternetAccess { get; set; }

        /// <summary>
        /// Required when 
        ///   * `type`==`vpn`: the name of the VPN Path to use 
        ///   * `type`==`wan`: the name of the WAN interface to use
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networks")]
        private InputList<string>? _networks;

        /// <summary>
        /// Required when `type`==`local`
        /// </summary>
        public InputList<string> Networks
        {
            get => _networks ?? (_networks = new InputList<string>());
            set => _networks = value;
        }

        [Input("targetIps")]
        private InputList<string>? _targetIps;

        /// <summary>
        /// If `type`==`local`, if destination IP is to be replaced
        /// </summary>
        public InputList<string> TargetIps
        {
            get => _targetIps ?? (_targetIps = new InputList<string>());
            set => _targetIps = value;
        }

        /// <summary>
        /// enum: `local`, `tunnel`, `vpn`, `wan`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Optional if `type`==`vpn`
        /// </summary>
        [Input("wanName")]
        public Input<string>? WanName { get; set; }

        public DeviceprofileGatewayPathPreferencesPathArgs()
        {
        }
        public static new DeviceprofileGatewayPathPreferencesPathArgs Empty => new DeviceprofileGatewayPathPreferencesPathArgs();
    }
}
