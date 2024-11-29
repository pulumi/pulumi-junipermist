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
    public sealed class SettingCradlepoint
    {
        public readonly string? CpApiId;
        public readonly string? CpApiKey;
        public readonly string? EcmApiId;
        public readonly string? EcmApiKey;
        public readonly bool? EnableLldp;

        [OutputConstructor]
        private SettingCradlepoint(
            string? cpApiId,

            string? cpApiKey,

            string? ecmApiId,

            string? ecmApiKey,

            bool? enableLldp)
        {
            CpApiId = cpApiId;
            CpApiKey = cpApiKey;
            EcmApiId = ecmApiId;
            EcmApiKey = ecmApiKey;
            EnableLldp = enableLldp;
        }
    }
}
