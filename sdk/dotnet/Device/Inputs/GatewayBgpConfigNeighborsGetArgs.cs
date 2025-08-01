// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayBgpConfigNeighborsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, the BGP session to this neighbor will be administratively disabled/shutdown
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        [Input("exportPolicy")]
        public Input<string>? ExportPolicy { get; set; }

        [Input("holdTime")]
        public Input<int>? HoldTime { get; set; }

        [Input("importPolicy")]
        public Input<string>? ImportPolicy { get; set; }

        /// <summary>
        /// Assuming BGP neighbor is directly connected
        /// </summary>
        [Input("multihopTtl")]
        public Input<int>? MultihopTtl { get; set; }

        /// <summary>
        /// Neighbor AS. Value must be in range 1-4294967295 or a variable (e.g. `{{as_variable}}`)
        /// </summary>
        [Input("neighborAs", required: true)]
        public Input<string> NeighborAs { get; set; } = null!;

        public GatewayBgpConfigNeighborsGetArgs()
        {
        }
        public static new GatewayBgpConfigNeighborsGetArgs Empty => new GatewayBgpConfigNeighborsGetArgs();
    }
}
