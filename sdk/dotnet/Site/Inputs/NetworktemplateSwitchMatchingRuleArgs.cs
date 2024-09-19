// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplateSwitchMatchingRuleArgs : global::Pulumi.ResourceArgs
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
        public Input<Inputs.NetworktemplateSwitchMatchingRuleIpConfigArgs>? IpConfig { get; set; }

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
        public Input<Inputs.NetworktemplateSwitchMatchingRuleOobIpConfigArgs>? OobIpConfig { get; set; }

        [Input("portConfig")]
        private InputMap<Inputs.NetworktemplateSwitchMatchingRulePortConfigArgs>? _portConfig;

        /// <summary>
        /// Propery key is the interface name or interface range
        /// </summary>
        public InputMap<Inputs.NetworktemplateSwitchMatchingRulePortConfigArgs> PortConfig
        {
            get => _portConfig ?? (_portConfig = new InputMap<Inputs.NetworktemplateSwitchMatchingRulePortConfigArgs>());
            set => _portConfig = value;
        }

        [Input("portMirroring")]
        private InputMap<Inputs.NetworktemplateSwitchMatchingRulePortMirroringArgs>? _portMirroring;

        /// <summary>
        /// Property key is the port mirroring instance name (Maximum: 4)
        /// port_mirroring can be added under device/site settings. It takes interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
        /// </summary>
        public InputMap<Inputs.NetworktemplateSwitchMatchingRulePortMirroringArgs> PortMirroring
        {
            get => _portMirroring ?? (_portMirroring = new InputMap<Inputs.NetworktemplateSwitchMatchingRulePortMirroringArgs>());
            set => _portMirroring = value;
        }

        public NetworktemplateSwitchMatchingRuleArgs()
        {
        }
        public static new NetworktemplateSwitchMatchingRuleArgs Empty => new NetworktemplateSwitchMatchingRuleArgs();
    }
}
