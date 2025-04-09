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
    public sealed class GatewayIdpProfilesOverwrite
    {
        /// <summary>
        /// enum:
        ///   * alert (default)
        ///   * drop: silently dropping packets
        ///   * close: notify client/server to close connection
        /// </summary>
        public readonly string? Action;
        public readonly Outputs.GatewayIdpProfilesOverwriteMatching? Matching;
        public readonly string? Name;

        [OutputConstructor]
        private GatewayIdpProfilesOverwrite(
            string? action,

            Outputs.GatewayIdpProfilesOverwriteMatching? matching,

            string? name)
        {
            Action = action;
            Matching = matching;
            Name = name;
        }
    }
}
