// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Outputs
{

    [OutputType]
    public sealed class NetworktemplateRadiusConfigAcctServer
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
        /// Acct port of RADIUS server
        /// </summary>
        public readonly int? Port;
        /// <summary>
        /// Secret of RADIUS server
        /// </summary>
        public readonly string Secret;

        [OutputConstructor]
        private NetworktemplateRadiusConfigAcctServer(
            string host,

            bool? keywrapEnabled,

            string? keywrapFormat,

            string? keywrapKek,

            string? keywrapMack,

            int? port,

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
