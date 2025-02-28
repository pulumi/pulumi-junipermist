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
    public sealed class GatewaytemplateDhcpdConfig
    {
        /// <summary>
        /// Property key is the network name
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GatewaytemplateDhcpdConfigConfig>? Config;
        /// <summary>
        /// If set to `false`, disable the DHCP server
        /// </summary>
        public readonly bool? Enabled;

        [OutputConstructor]
        private GatewaytemplateDhcpdConfig(
            ImmutableDictionary<string, Outputs.GatewaytemplateDhcpdConfigConfig>? config,

            bool? enabled)
        {
            Config = config;
            Enabled = enabled;
        }
    }
}
