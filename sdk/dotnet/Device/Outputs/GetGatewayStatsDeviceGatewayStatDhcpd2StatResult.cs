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
    public sealed class GetGatewayStatsDeviceGatewayStatDhcpd2StatResult
    {
        public readonly int NumIps;
        public readonly int NumLeased;

        [OutputConstructor]
        private GetGatewayStatsDeviceGatewayStatDhcpd2StatResult(
            int numIps,

            int numLeased)
        {
            NumIps = numIps;
            NumLeased = numLeased;
        }
    }
}
