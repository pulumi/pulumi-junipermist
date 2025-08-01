// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplateIpConfigsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("ip")]
        public Input<string>? Ip { get; set; }

        [Input("netmask")]
        public Input<string>? Netmask { get; set; }

        [Input("secondaryIps")]
        private InputList<string>? _secondaryIps;

        /// <summary>
        /// Optional list of secondary IPs in CIDR format
        /// </summary>
        public InputList<string> SecondaryIps
        {
            get => _secondaryIps ?? (_secondaryIps = new InputList<string>());
            set => _secondaryIps = value;
        }

        /// <summary>
        /// enum: `dhcp`, `static`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public GatewaytemplateIpConfigsGetArgs()
        {
        }
        public static new GatewaytemplateIpConfigsGetArgs Empty => new GatewaytemplateIpConfigsGetArgs();
    }
}
