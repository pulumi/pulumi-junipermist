// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchDhcpSnoopingArgs : global::Pulumi.ResourceArgs
    {
        [Input("allNetworks")]
        public Input<bool>? AllNetworks { get; set; }

        /// <summary>
        /// Enable for dynamic ARP inspection check
        /// </summary>
        [Input("enableArpSpoofCheck")]
        public Input<bool>? EnableArpSpoofCheck { get; set; }

        /// <summary>
        /// Enable for check for forging source IP address
        /// </summary>
        [Input("enableIpSourceGuard")]
        public Input<bool>? EnableIpSourceGuard { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("networks")]
        private InputList<string>? _networks;

        /// <summary>
        /// If `all_networks`==`false`, list of network with DHCP snooping enabled
        /// </summary>
        public InputList<string> Networks
        {
            get => _networks ?? (_networks = new InputList<string>());
            set => _networks = value;
        }

        public SwitchDhcpSnoopingArgs()
        {
        }
        public static new SwitchDhcpSnoopingArgs Empty => new SwitchDhcpSnoopingArgs();
    }
}
