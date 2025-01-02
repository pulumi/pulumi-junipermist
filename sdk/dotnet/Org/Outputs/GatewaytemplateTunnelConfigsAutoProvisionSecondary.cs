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
    public sealed class GatewaytemplateTunnelConfigsAutoProvisionSecondary
    {
        public readonly ImmutableArray<string> ProbeIps;
        /// <summary>
        /// optional, only needed if `vars_only`==`false`
        /// </summary>
        public readonly ImmutableArray<string> WanNames;

        [OutputConstructor]
        private GatewaytemplateTunnelConfigsAutoProvisionSecondary(
            ImmutableArray<string> probeIps,

            ImmutableArray<string> wanNames)
        {
            ProbeIps = probeIps;
            WanNames = wanNames;
        }
    }
}
