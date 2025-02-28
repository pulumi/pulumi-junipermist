// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Outputs
{

    [OutputType]
    public sealed class NetworktemplatePortMirroring
    {
        /// <summary>
        /// At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or `input_networks_ingress ` should be specified
        /// </summary>
        public readonly ImmutableArray<string> InputNetworksIngresses;
        /// <summary>
        /// At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or `input_networks_ingress ` should be specified
        /// </summary>
        public readonly ImmutableArray<string> InputPortIdsEgresses;
        /// <summary>
        /// At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or `input_networks_ingress ` should be specified
        /// </summary>
        public readonly ImmutableArray<string> InputPortIdsIngresses;
        /// <summary>
        /// Exaclty one of the `output_port_id` or `output_network` should be provided
        /// </summary>
        public readonly string? OutputNetwork;
        /// <summary>
        /// Exaclty one of the `output_port_id` or `output_network` should be provided
        /// </summary>
        public readonly string? OutputPortId;

        [OutputConstructor]
        private NetworktemplatePortMirroring(
            ImmutableArray<string> inputNetworksIngresses,

            ImmutableArray<string> inputPortIdsEgresses,

            ImmutableArray<string> inputPortIdsIngresses,

            string? outputNetwork,

            string? outputPortId)
        {
            InputNetworksIngresses = inputNetworksIngresses;
            InputPortIdsEgresses = inputPortIdsEgresses;
            InputPortIdsIngresses = inputPortIdsIngresses;
            OutputNetwork = outputNetwork;
            OutputPortId = outputPortId;
        }
    }
}
