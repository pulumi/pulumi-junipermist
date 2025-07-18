// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Outputs
{

    [OutputType]
    public sealed class SettingSimpleAlert
    {
        public readonly Outputs.SettingSimpleAlertArpFailure? ArpFailure;
        public readonly Outputs.SettingSimpleAlertDhcpFailure? DhcpFailure;
        public readonly Outputs.SettingSimpleAlertDnsFailure? DnsFailure;

        [OutputConstructor]
        private SettingSimpleAlert(
            Outputs.SettingSimpleAlertArpFailure? arpFailure,

            Outputs.SettingSimpleAlertDhcpFailure? dhcpFailure,

            Outputs.SettingSimpleAlertDnsFailure? dnsFailure)
        {
            ArpFailure = arpFailure;
            DhcpFailure = dhcpFailure;
            DnsFailure = dnsFailure;
        }
    }
}
