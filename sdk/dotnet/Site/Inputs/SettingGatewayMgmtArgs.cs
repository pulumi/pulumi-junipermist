// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingGatewayMgmtArgs : global::Pulumi.ResourceArgs
    {
        [Input("adminSshkeys")]
        private InputList<string>? _adminSshkeys;

        /// <summary>
        /// for SSR only, as direct root access is not allowed
        /// </summary>
        public InputList<string> AdminSshkeys
        {
            get => _adminSshkeys ?? (_adminSshkeys = new InputList<string>());
            set => _adminSshkeys = value;
        }

        [Input("appProbing")]
        public Input<Inputs.SettingGatewayMgmtAppProbingArgs>? AppProbing { get; set; }

        /// <summary>
        /// consumes uplink bandwidth, requires WA license
        /// </summary>
        [Input("appUsage")]
        public Input<bool>? AppUsage { get; set; }

        [Input("autoSignatureUpdate")]
        public Input<Inputs.SettingGatewayMgmtAutoSignatureUpdateArgs>? AutoSignatureUpdate { get; set; }

        /// <summary>
        /// he rollback timer for commit confirmed
        /// </summary>
        [Input("configRevertTimer")]
        public Input<int>? ConfigRevertTimer { get; set; }

        /// <summary>
        /// for both SSR and SRX disable console port
        /// </summary>
        [Input("disableConsole")]
        public Input<bool>? DisableConsole { get; set; }

        /// <summary>
        /// for both SSR and SRX disable management interface
        /// </summary>
        [Input("disableOob")]
        public Input<bool>? DisableOob { get; set; }

        [Input("probeHosts")]
        private InputList<string>? _probeHosts;
        public InputList<string> ProbeHosts
        {
            get => _probeHosts ?? (_probeHosts = new InputList<string>());
            set => _probeHosts = value;
        }

        /// <summary>
        /// restrict inbound-traffic to host
        /// when enabled, all traffic that is not essential to our operation will be dropped 
        /// e.g. ntp / dns / traffic to mist will be allowed by default, if dhcpd is enabled, we'll make sure it works
        /// </summary>
        [Input("protectRe")]
        public Input<Inputs.SettingGatewayMgmtProtectReArgs>? ProtectRe { get; set; }

        [Input("rootPassword")]
        private Input<string>? _rootPassword;

        /// <summary>
        /// for SRX only
        /// </summary>
        public Input<string>? RootPassword
        {
            get => _rootPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _rootPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("securityLogSourceAddress")]
        public Input<string>? SecurityLogSourceAddress { get; set; }

        [Input("securityLogSourceInterface")]
        public Input<string>? SecurityLogSourceInterface { get; set; }

        public SettingGatewayMgmtArgs()
        {
        }
        public static new SettingGatewayMgmtArgs Empty => new SettingGatewayMgmtArgs();
    }
}
