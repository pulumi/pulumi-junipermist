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
    public sealed class SwitchRadiusConfig
    {
        /// <summary>
        /// how frequently should interim accounting be reported, 60-65535. default is 0 (use one specified in Access-Accept request from RADIUS Server). Very frequent messages can affect the performance of the radius server, 600 and up is recommended when enabled
        /// </summary>
        public readonly int? AcctInterimInterval;
        public readonly ImmutableArray<Outputs.SwitchRadiusConfigAcctServer> AcctServers;
        public readonly ImmutableArray<Outputs.SwitchRadiusConfigAuthServer> AuthServers;
        /// <summary>
        /// radius auth session retries
        /// </summary>
        public readonly int? AuthServersRetries;
        /// <summary>
        /// radius auth session timeout
        /// </summary>
        public readonly int? AuthServersTimeout;
        public readonly bool? CoaEnabled;
        public readonly int? CoaPort;
        /// <summary>
        /// use `network`or `source_ip`
        /// which network the RADIUS server resides, if there's static IP for this network, we'd use it as source-ip
        /// </summary>
        public readonly string? Network;
        /// <summary>
        /// use `network`or `source_ip`
        /// </summary>
        public readonly string? SourceIp;

        [OutputConstructor]
        private SwitchRadiusConfig(
            int? acctInterimInterval,

            ImmutableArray<Outputs.SwitchRadiusConfigAcctServer> acctServers,

            ImmutableArray<Outputs.SwitchRadiusConfigAuthServer> authServers,

            int? authServersRetries,

            int? authServersTimeout,

            bool? coaEnabled,

            int? coaPort,

            string? network,

            string? sourceIp)
        {
            AcctInterimInterval = acctInterimInterval;
            AcctServers = acctServers;
            AuthServers = authServers;
            AuthServersRetries = authServersRetries;
            AuthServersTimeout = authServersTimeout;
            CoaEnabled = coaEnabled;
            CoaPort = coaPort;
            Network = network;
            SourceIp = sourceIp;
        }
    }
}