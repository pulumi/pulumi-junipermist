// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Outputs
{

    [OutputType]
    public sealed class GatewayPathPreferences
    {
        public readonly ImmutableArray<Outputs.GatewayPathPreferencesPath> Paths;
        /// <summary>
        /// enum: `ecmp`, `ordered`, `weighted`
        /// </summary>
        public readonly string? Strategy;

        [OutputConstructor]
        private GatewayPathPreferences(
            ImmutableArray<Outputs.GatewayPathPreferencesPath> paths,

            string? strategy)
        {
            Paths = paths;
            Strategy = strategy;
        }
    }
}
