// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Outputs
{

    [OutputType]
    public sealed class SwitchRemoteSyslogFileArchive
    {
        public readonly string? Files;
        public readonly string? Size;

        [OutputConstructor]
        private SwitchRemoteSyslogFileArchive(
            string? files,

            string? size)
        {
            Files = files;
            Size = size;
        }
    }
}
