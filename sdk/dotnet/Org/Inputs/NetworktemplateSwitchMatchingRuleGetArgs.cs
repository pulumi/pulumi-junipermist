// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class NetworktemplateSwitchMatchingRuleGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("additionalConfigCmds")]
        private InputList<string>? _additionalConfigCmds;

        /// <summary>
        /// additional CLI commands to append to the generated Junos config
        /// 
        /// **Note**: no check is done
        /// </summary>
        public InputList<string> AdditionalConfigCmds
        {
            get => _additionalConfigCmds ?? (_additionalConfigCmds = new InputList<string>());
            set => _additionalConfigCmds = value;
        }

        /// <summary>
        /// In-Band Management interface configuration
        /// </summary>
        [Input("ipConfig")]
        public Input<Inputs.NetworktemplateSwitchMatchingRuleIpConfigGetArgs>? IpConfig { get; set; }

        /// <summary>
        /// role to match
        /// </summary>
        [Input("matchRole")]
        public Input<string>? MatchRole { get; set; }

        /// <summary>
        /// 'property key define the type of matching, value is the string to match. e.g: `match_name[0:3]`, `match_name[2:6]`, `match_model`,  `match_model[0-6]`
        /// </summary>
        [Input("matchType")]
        public Input<string>? MatchType { get; set; }

        [Input("matchValue")]
        public Input<string>? MatchValue { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Out-of-Band Management interface configuration
        /// </summary>
        [Input("oobIpConfig")]
        public Input<Inputs.NetworktemplateSwitchMatchingRuleOobIpConfigGetArgs>? OobIpConfig { get; set; }

        [Input("portConfig")]
        private InputMap<Inputs.NetworktemplateSwitchMatchingRulePortConfigGetArgs>? _portConfig;

        /// <summary>
        /// Propery key is the interface name or interface range
        /// </summary>
        public InputMap<Inputs.NetworktemplateSwitchMatchingRulePortConfigGetArgs> PortConfig
        {
            get => _portConfig ?? (_portConfig = new InputMap<Inputs.NetworktemplateSwitchMatchingRulePortConfigGetArgs>());
            set => _portConfig = value;
        }

        [Input("portMirroring")]
        private InputMap<Inputs.NetworktemplateSwitchMatchingRulePortMirroringGetArgs>? _portMirroring;

        /// <summary>
        /// Property key is the port mirroring instance name
        /// port_mirroring can be added under device/site settings. It takes interface and ports as input for ingress, interface as input for egress and can take interface and port as output. A maximum 4 port mirrorings is allowed
        /// </summary>
        public InputMap<Inputs.NetworktemplateSwitchMatchingRulePortMirroringGetArgs> PortMirroring
        {
            get => _portMirroring ?? (_portMirroring = new InputMap<Inputs.NetworktemplateSwitchMatchingRulePortMirroringGetArgs>());
            set => _portMirroring = value;
        }

        public NetworktemplateSwitchMatchingRuleGetArgs()
        {
        }
        public static new NetworktemplateSwitchMatchingRuleGetArgs Empty => new NetworktemplateSwitchMatchingRuleGetArgs();
    }
}
