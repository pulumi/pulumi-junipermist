// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class DeviceprofileApAeroscoutGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to enable aeroscout config
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Required if enabled, aeroscout server host
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// Whether to enable the feature to allow wireless clients data received and sent to AES server for location calculation
        /// </summary>
        [Input("locateConnected")]
        public Input<bool>? LocateConnected { get; set; }

        [Input("port")]
        public Input<int>? Port { get; set; }

        public DeviceprofileApAeroscoutGetArgs()
        {
        }
        public static new DeviceprofileApAeroscoutGetArgs Empty => new DeviceprofileApAeroscoutGetArgs();
    }
}
