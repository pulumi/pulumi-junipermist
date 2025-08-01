// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Outputs
{

    [OutputType]
    public sealed class DeviceprofileGatewayIdpProfilesOverwrite
    {
        /// <summary>
        /// enum:
        ///   * alert (default)
        ///   * drop: silently dropping packets
        ///   * close: notify client/server to close connection
        /// </summary>
        public readonly string? Action;
        public readonly Outputs.DeviceprofileGatewayIdpProfilesOverwriteMatching? Matching;
        public readonly string? Name;

        [OutputConstructor]
        private DeviceprofileGatewayIdpProfilesOverwrite(
            string? action,

            Outputs.DeviceprofileGatewayIdpProfilesOverwriteMatching? matching,

            string? name)
        {
            Action = action;
            Matching = matching;
            Name = name;
        }
    }
}
