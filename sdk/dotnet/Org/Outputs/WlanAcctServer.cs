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
    public sealed class WlanAcctServer
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
        public readonly string? Port;
        /// <summary>
        /// Secret of RADIUS server
        /// </summary>
        public readonly string Secret;

        [OutputConstructor]
        private WlanAcctServer(
            string host,

            bool? keywrapEnabled,

            string? keywrapFormat,

            string? keywrapKek,

            string? keywrapMack,

            string? port,

            string secret)
        {
            Host = host;
            KeywrapEnabled = keywrapEnabled;
            KeywrapFormat = keywrapFormat;
            KeywrapKek = keywrapKek;
            KeywrapMack = keywrapMack;
            Port = port;
            Secret = secret;
        }
    }
}
