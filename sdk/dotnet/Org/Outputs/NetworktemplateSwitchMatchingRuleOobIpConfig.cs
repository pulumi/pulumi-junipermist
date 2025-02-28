// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Outputs
{

    [OutputType]
    public sealed class NetworktemplateSwitchMatchingRuleOobIpConfig
    {
        /// <summary>
        /// enum: `dhcp`, `static`
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// If supported on the platform. If enabled, DNS will be using this routing-instance, too
        /// </summary>
        public readonly bool? UseMgmtVrf;
        /// <summary>
        /// For host-out traffic (NTP/TACPLUS/RADIUS/SYSLOG/SNMP), if alternative source network/ip is desired
        /// </summary>
        public readonly bool? UseMgmtVrfForHostOut;

        [OutputConstructor]
        private NetworktemplateSwitchMatchingRuleOobIpConfig(
            string? type,

            bool? useMgmtVrf,

            bool? useMgmtVrfForHostOut)
        {
            Type = type;
            UseMgmtVrf = useMgmtVrf;
            UseMgmtVrfForHostOut = useMgmtVrfForHostOut;
        }
    }
}
