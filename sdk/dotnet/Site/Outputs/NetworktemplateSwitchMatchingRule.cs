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
        /// additional CLI commands to append to the generated Junos config. **Note**: no check is done
        /// </summary>
        public readonly ImmutableArray<string> AdditionalConfigCmds;
        /// <summary>
        /// In-Band Management interface configuration
        /// </summary>
        public readonly Outputs.NetworktemplateSwitchMatchingRuleIpConfig? IpConfig;
        /// <summary>
        /// string the switch model must start with to use this rule. It is possible to combine with the `match_name` and `match_role` attributes
        /// </summary>
        public readonly string? MatchModel;
        /// <summary>
        /// string the switch name must start with to use this rule. Use the `match_name_offset` to indicate the first character of the switch name to compare to. It is possible to combine with the `match_model` and `match_role` attributes
        /// </summary>
        public readonly string? MatchName;
        /// <summary>
        /// first character of the switch name to compare to the `match_name` value
        /// </summary>
        public readonly int? MatchNameOffset;
        /// <summary>
        /// string the switch role must start with to use this rule. It is possible to combine with the `match_name` and `match_model` attributes
        /// </summary>
        public readonly string? MatchRole;
        /// <summary>
        /// property key define the type of matching, value is the string to match. e.g: `match_name[0:3]`, `match_name[2:6]`, `match_model`,  `match_model[0-6]`
        /// </summary>
        public readonly string? MatchType;
        public readonly string? MatchValue;
        /// <summary>
        /// Rule name. WARNING: the name `default` is reserved and can only be used for the last rule in the list
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Out-of-Band Management interface configuration
        /// </summary>
        public readonly Outputs.NetworktemplateSwitchMatchingRuleOobIpConfig? OobIpConfig;
        /// <summary>
        /// Property key is the port name or range (e.g. "ge-0/0/0-10")
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.NetworktemplateSwitchMatchingRulePortConfig>? PortConfig;
        /// <summary>
        /// Property key is the port mirroring instance name. `port_mirroring` can be added under device/site settings. It takes interface and ports as input for ingress, interface as input for egress and can take interface and port as output. A maximum 4 mirroring ports is allowed
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.NetworktemplateSwitchMatchingRulePortMirroring>? PortMirroring;

        [OutputConstructor]
        private NetworktemplateSwitchMatchingRule(
            ImmutableArray<string> additionalConfigCmds,

            Outputs.NetworktemplateSwitchMatchingRuleIpConfig? ipConfig,

            string? matchModel,

            string? matchName,

            int? matchNameOffset,

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
            MatchModel = matchModel;
            MatchName = matchName;
            MatchNameOffset = matchNameOffset;
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
