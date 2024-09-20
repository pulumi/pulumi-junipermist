// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingGatewayMgmtProtectReGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedServices")]
        private InputList<string>? _allowedServices;

        /// <summary>
        /// optionally, services we'll allow. enum: `icmp`, `ssh`
        /// </summary>
        public InputList<string> AllowedServices
        {
            get => _allowedServices ?? (_allowedServices = new InputList<string>());
            set => _allowedServices = value;
        }

        [Input("customs")]
        private InputList<Inputs.SettingGatewayMgmtProtectReCustomGetArgs>? _customs;
        public InputList<Inputs.SettingGatewayMgmtProtectReCustomGetArgs> Customs
        {
            get => _customs ?? (_customs = new InputList<Inputs.SettingGatewayMgmtProtectReCustomGetArgs>());
            set => _customs = value;
        }

        /// <summary>
        /// when enabled, all traffic that is not essential to our operation will be dropped
        /// e.g. ntp / dns / traffic to mist will be allowed by default
        ///      if dhcpd is enabled, we'll make sure it works
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("trustedHosts")]
        private InputList<string>? _trustedHosts;

        /// <summary>
        /// host/subnets we'll allow traffic to/from
        /// </summary>
        public InputList<string> TrustedHosts
        {
            get => _trustedHosts ?? (_trustedHosts = new InputList<string>());
            set => _trustedHosts = value;
        }

        public SettingGatewayMgmtProtectReGetArgs()
        {
        }
        public static new SettingGatewayMgmtProtectReGetArgs Empty => new SettingGatewayMgmtProtectReGetArgs();
    }
}
