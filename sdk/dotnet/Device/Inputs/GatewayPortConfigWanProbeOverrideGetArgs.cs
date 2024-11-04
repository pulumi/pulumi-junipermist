// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayPortConfigWanProbeOverrideGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("ips")]
        private InputList<string>? _ips;
        public InputList<string> Ips
        {
            get => _ips ?? (_ips = new InputList<string>());
            set => _ips = value;
        }

        /// <summary>
        /// enum: `broadband`, `lte`
        /// </summary>
        [Input("probeProfile")]
        public Input<string>? ProbeProfile { get; set; }

        public GatewayPortConfigWanProbeOverrideGetArgs()
        {
        }
        public static new GatewayPortConfigWanProbeOverrideGetArgs Empty => new GatewayPortConfigWanProbeOverrideGetArgs();
    }
}