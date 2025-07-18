// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingGatewayMgmtAppProbingCustomAppGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("address")]
        public Input<string>? Address { get; set; }

        [Input("appType")]
        public Input<string>? AppType { get; set; }

        [Input("hostnames", required: true)]
        private InputList<string>? _hostnames;

        /// <summary>
        /// Only 1 entry is allowed:
        ///     * if `protocol`==`http`: URL (e.g. `http://test.com` or `https://test.com`)
        ///     * if `protocol`==`icmp`: IP Address (e.g. `1.2.3.4`)
        /// </summary>
        public InputList<string> Hostnames
        {
            get => _hostnames ?? (_hostnames = new InputList<string>());
            set => _hostnames = value;
        }

        [Input("key")]
        public Input<string>? Key { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("network")]
        public Input<string>? Network { get; set; }

        /// <summary>
        /// If `protocol`==`icmp`
        /// </summary>
        [Input("packetSize")]
        public Input<int>? PacketSize { get; set; }

        /// <summary>
        /// enum: `http`, `icmp`
        /// </summary>
        [Input("protocol", required: true)]
        public Input<string> Protocol { get; set; } = null!;

        [Input("url")]
        public Input<string>? Url { get; set; }

        [Input("vrf")]
        public Input<string>? Vrf { get; set; }

        public SettingGatewayMgmtAppProbingCustomAppGetArgs()
        {
        }
        public static new SettingGatewayMgmtAppProbingCustomAppGetArgs Empty => new SettingGatewayMgmtAppProbingCustomAppGetArgs();
    }
}
