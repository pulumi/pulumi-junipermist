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
    public sealed class NetworktemplateRemoteSyslogServer
    {
        public readonly ImmutableArray<Outputs.NetworktemplateRemoteSyslogServerContent> Contents;
        public readonly bool? ExplicitPriority;
        /// <summary>
        /// enum: `any`, `authorization`, `change-log`, `config`, `conflict-log`, `daemon`, `dfc`, `external`, `firewall`, `ftp`, `interactive-commands`, `kernel`, `ntp`, `pfe`, `security`, `user`
        /// </summary>
        public readonly string? Facility;
        public readonly string? Host;
        public readonly string? Match;
        public readonly int? Port;
        /// <summary>
        /// enum: `tcp`, `udp`
        /// </summary>
        public readonly string? Protocol;
        public readonly string? RoutingInstance;
        /// <summary>
        /// enum: `alert`, `any`, `critical`, `emergency`, `error`, `info`, `notice`, `warning`
        /// </summary>
        public readonly string? Severity;
        /// <summary>
        /// If source_address is configured, will use the vlan firstly otherwise use source_ip
        /// </summary>
        public readonly string? SourceAddress;
        public readonly bool? StructuredData;
        public readonly string? Tag;

        [OutputConstructor]
        private NetworktemplateRemoteSyslogServer(
            ImmutableArray<Outputs.NetworktemplateRemoteSyslogServerContent> contents,

            bool? explicitPriority,

            string? facility,

            string? host,

            string? match,

            int? port,

            string? protocol,

            string? routingInstance,

            string? severity,

            string? sourceAddress,

            bool? structuredData,

            string? tag)
        {
            Contents = contents;
            ExplicitPriority = explicitPriority;
            Facility = facility;
            Host = host;
            Match = match;
            Port = port;
            Protocol = protocol;
            RoutingInstance = routingInstance;
            Severity = severity;
            SourceAddress = sourceAddress;
            StructuredData = structuredData;
            Tag = tag;
        }
    }
}
