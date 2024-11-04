// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplatePortConfigWanProbeOverrideArgs : global::Pulumi.ResourceArgs
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

        public GatewaytemplatePortConfigWanProbeOverrideArgs()
        {
        }
        public static new GatewaytemplatePortConfigWanProbeOverrideArgs Empty => new GatewaytemplatePortConfigWanProbeOverrideArgs();
    }
}