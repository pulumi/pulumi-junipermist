// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplateSwitchMatchingRuleOobIpConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `dhcp`, `static`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// if supported on the platform. If enabled, DNS will be using this routing-instance, too
        /// </summary>
        [Input("useMgmtVrf")]
        public Input<bool>? UseMgmtVrf { get; set; }

        /// <summary>
        /// for host-out traffic (NTP/TACPLUS/RADIUS/SYSLOG/SNMP), if alternative source network/ip is desired
        /// </summary>
        [Input("useMgmtVrfForHostOut")]
        public Input<bool>? UseMgmtVrfForHostOut { get; set; }

        public NetworktemplateSwitchMatchingRuleOobIpConfigArgs()
        {
        }
        public static new NetworktemplateSwitchMatchingRuleOobIpConfigArgs Empty => new NetworktemplateSwitchMatchingRuleOobIpConfigArgs();
    }
}
