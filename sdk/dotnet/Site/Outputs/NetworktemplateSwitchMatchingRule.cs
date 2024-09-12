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
    public sealed class NetworktemplateSwitchMatchingRule
    {
        /// <summary>
        /// additional CLI commands to append to the generated Junos config
        /// 
        /// **Note**: no check is done
        /// </summary>
        public readonly ImmutableArray<string> AdditionalConfigCmds;
        /// <summary>
        /// In-Band Management interface configuration
        /// </summary>
        public readonly Outputs.NetworktemplateSwitchMatchingRuleIpConfig? IpConfig;
        /// <summary>
        /// role to match
        /// </summary>
        public readonly string? MatchRole;
        /// <summary>
        /// 'property key define the type of matching, value is the string to match. e.g: `match_name[0:3]`, `match_name[2:6]`, `match_model`,  `match_model[0-6]`
        /// </summary>
        public readonly string? MatchType;
        public readonly string? MatchValue;
        public readonly string? Name;
        /// <summary>
        /// Out-of-Band Management interface configuration
        /// </summary>
        public readonly Outputs.NetworktemplateSwitchMatchingRuleOobIpConfig? OobIpConfig;
        /// <summary>
        /// Propery key is the interface name or interface range
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.NetworktemplateSwitchMatchingRulePortConfig>? PortConfig;
        /// <summary>
        /// Property key is the port mirroring instance name
        /// port_mirroring can be added under device/site settings. It takes interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.NetworktemplateSwitchMatchingRulePortMirroring>? PortMirroring;

        [OutputConstructor]
        private NetworktemplateSwitchMatchingRule(
            ImmutableArray<string> additionalConfigCmds,

            Outputs.NetworktemplateSwitchMatchingRuleIpConfig? ipConfig,

            string? matchRole,

            string? matchType,

            string? matchValue,

            string? name,

            Outputs.NetworktemplateSwitchMatchingRuleOobIpConfig? oobIpConfig,

            ImmutableDictionary<string, Outputs.NetworktemplateSwitchMatchingRulePortConfig>? portConfig,

            ImmutableDictionary<string, Outputs.NetworktemplateSwitchMatchingRulePortMirroring>? portMirroring)
        {
            AdditionalConfigCmds = additionalConfigCmds;
            IpConfig = ipConfig;
            MatchRole = matchRole;
            MatchType = matchType;
            MatchValue = matchValue;
            Name = name;
            OobIpConfig = oobIpConfig;
            PortConfig = portConfig;
            PortMirroring = portMirroring;
        }
    }
}
