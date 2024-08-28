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
    public sealed class NetworktemplateRemoteSyslogFile
    {
        public readonly Outputs.NetworktemplateRemoteSyslogFileArchive? Archive;
        public readonly ImmutableArray<Outputs.NetworktemplateRemoteSyslogFileContent> Contents;
        public readonly bool? ExplicitPriority;
        public readonly string? File;
        public readonly string? Match;
        public readonly bool? StructuredData;

        [OutputConstructor]
        private NetworktemplateRemoteSyslogFile(
            Outputs.NetworktemplateRemoteSyslogFileArchive? archive,

            ImmutableArray<Outputs.NetworktemplateRemoteSyslogFileContent> contents,

            bool? explicitPriority,

            string? file,

            string? match,

            bool? structuredData)
        {
            Archive = archive;
            Contents = contents;
            ExplicitPriority = explicitPriority;
            File = file;
            Match = match;
            StructuredData = structuredData;
        }
    }
}