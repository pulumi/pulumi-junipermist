// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingSimpleAlertArgs : global::Pulumi.ResourceArgs
    {
        [Input("arpFailure")]
        public Input<Inputs.SettingSimpleAlertArpFailureArgs>? ArpFailure { get; set; }

        [Input("dhcpFailure")]
        public Input<Inputs.SettingSimpleAlertDhcpFailureArgs>? DhcpFailure { get; set; }

        [Input("dnsFailure")]
        public Input<Inputs.SettingSimpleAlertDnsFailureArgs>? DnsFailure { get; set; }

        public SettingSimpleAlertArgs()
        {
        }
        public static new SettingSimpleAlertArgs Empty => new SettingSimpleAlertArgs();
    }
}