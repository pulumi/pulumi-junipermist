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
    public sealed class DeviceprofileGatewayDhcpdConfigConfigFixedBindings
    {
        public readonly string Ip;
        public readonly string? Name;

        [OutputConstructor]
        private DeviceprofileGatewayDhcpdConfigConfigFixedBindings(
            string ip,

            string? name)
        {
            Ip = ip;
            Name = name;
        }
    }
}
