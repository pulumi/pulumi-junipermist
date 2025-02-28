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
    public sealed class NetworktemplateRemoteSyslog
    {
        public readonly Outputs.NetworktemplateRemoteSyslogArchive? Archive;
        public readonly Outputs.NetworktemplateRemoteSyslogConsole? Console;
        public readonly bool? Enabled;
        public readonly ImmutableArray<Outputs.NetworktemplateRemoteSyslogFile> Files;
        /// <summary>
        /// If source_address is configured, will use the vlan firstly otherwise use source_ip
        /// </summary>
        public readonly string? Network;
        public readonly bool? SendToAllServers;
        public readonly ImmutableArray<Outputs.NetworktemplateRemoteSyslogServer> Servers;
        /// <summary>
        /// enum: `millisecond`, `year`, `year millisecond`
        /// </summary>
        public readonly string? TimeFormat;
        public readonly ImmutableArray<Outputs.NetworktemplateRemoteSyslogUser> Users;

        [OutputConstructor]
        private NetworktemplateRemoteSyslog(
            Outputs.NetworktemplateRemoteSyslogArchive? archive,

            Outputs.NetworktemplateRemoteSyslogConsole? console,

            bool? enabled,

            ImmutableArray<Outputs.NetworktemplateRemoteSyslogFile> files,

            string? network,

            bool? sendToAllServers,

            ImmutableArray<Outputs.NetworktemplateRemoteSyslogServer> servers,

            string? timeFormat,

            ImmutableArray<Outputs.NetworktemplateRemoteSyslogUser> users)
        {
            Archive = archive;
            Console = console;
            Enabled = enabled;
            Files = files;
            Network = network;
            SendToAllServers = sendToAllServers;
            Servers = servers;
            TimeFormat = timeFormat;
            Users = users;
        }
    }
}
