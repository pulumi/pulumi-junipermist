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
    public sealed class NetworktemplateOspfAreas
    {
        public readonly bool? IncludeLoopback;
        public readonly ImmutableDictionary<string, Outputs.NetworktemplateOspfAreasNetworks> Networks;
        /// <summary>
        /// OSPF type. enum: `default`, `nssa`, `stub`
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private NetworktemplateOspfAreas(
            bool? includeLoopback,

            ImmutableDictionary<string, Outputs.NetworktemplateOspfAreasNetworks> networks,

            string? type)
        {
            IncludeLoopback = includeLoopback;
            Networks = networks;
            Type = type;
        }
    }
}
