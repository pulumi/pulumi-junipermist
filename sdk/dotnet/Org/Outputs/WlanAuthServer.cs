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
    public sealed class WlanAuthServer
    {
        /// <summary>
        /// IP/ hostname of RADIUS server
        /// </summary>
        public readonly string Host;
        public readonly bool? KeywrapEnabled;
        /// <summary>
        /// enum: `ascii`, `hex`
        /// </summary>
        public readonly string? KeywrapFormat;
        public readonly string? KeywrapKek;
        public readonly string? KeywrapMack;
        /// <summary>
        /// Auth port of RADIUS server
        /// </summary>
        public readonly int? Port;
        /// <summary>
        /// Whether to require Message-Authenticator in requests
        /// </summary>
        public readonly bool? RequireMessageAuthenticator;
        /// <summary>
        /// Secretof RADIUS server
        /// </summary>
        public readonly string Secret;

        [OutputConstructor]
        private WlanAuthServer(
            string host,

            bool? keywrapEnabled,

            string? keywrapFormat,

            string? keywrapKek,

            string? keywrapMack,

            int? port,

            bool? requireMessageAuthenticator,

            string secret)
        {
            Host = host;
            KeywrapEnabled = keywrapEnabled;
            KeywrapFormat = keywrapFormat;
            KeywrapKek = keywrapKek;
            KeywrapMack = keywrapMack;
            Port = port;
            RequireMessageAuthenticator = requireMessageAuthenticator;
            Secret = secret;
        }
    }
}
