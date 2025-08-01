// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplatePortConfigWanProbeOverrideGetArgs : global::Pulumi.ResourceArgs
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

        public GatewaytemplatePortConfigWanProbeOverrideGetArgs()
        {
        }
        public static new GatewaytemplatePortConfigWanProbeOverrideGetArgs Empty => new GatewaytemplatePortConfigWanProbeOverrideGetArgs();
    }
}
