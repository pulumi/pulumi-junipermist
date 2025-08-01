// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class WlanInjectDhcpOption82GetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Information to set in the `circuit_id` field of the DHCP Option 82. It is possible to use static string or the following variables (e.g. `{{SSID}}:{{AP_MAC}}`):
        ///   * {{AP_MAC}}
        ///   * {{AP_MAC_DASHED}}
        ///   * {{AP_MODEL}}
        ///   * {{AP_NAME}}
        ///   * {{SITE_NAME}}
        ///   * {{SSID}}
        /// </summary>
        [Input("circuitId")]
        public Input<string>? CircuitId { get; set; }

        /// <summary>
        /// Whether to inject option 82 when forwarding DHCP packets
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public WlanInjectDhcpOption82GetArgs()
        {
        }
        public static new WlanInjectDhcpOption82GetArgs Empty => new WlanInjectDhcpOption82GetArgs();
    }
}
