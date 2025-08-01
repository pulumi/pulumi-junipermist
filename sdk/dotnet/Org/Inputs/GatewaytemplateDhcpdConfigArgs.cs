// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplateDhcpdConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("config")]
        private InputMap<Inputs.GatewaytemplateDhcpdConfigConfigArgs>? _config;

        /// <summary>
        /// Property key is the network name
        /// </summary>
        public InputMap<Inputs.GatewaytemplateDhcpdConfigConfigArgs> Config
        {
            get => _config ?? (_config = new InputMap<Inputs.GatewaytemplateDhcpdConfigConfigArgs>());
            set => _config = value;
        }

        /// <summary>
        /// If set to `false`, disable the DHCP server
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public GatewaytemplateDhcpdConfigArgs()
        {
        }
        public static new GatewaytemplateDhcpdConfigArgs Empty => new GatewaytemplateDhcpdConfigArgs();
    }
}
