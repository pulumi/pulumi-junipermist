// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class NetworktemplateSwitchMgmtGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AP_affinity_threshold ap_affinity_threshold can be added as a field under site/setting. By default, this value is set to 12. If the field is set in both site/setting and org/setting, the value from site/setting will be used.
        /// </summary>
        [Input("apAffinityThreshold")]
        public Input<int>? ApAffinityThreshold { get; set; }

        /// <summary>
        /// Set Banners for switches. Allows markup formatting
        /// </summary>
        [Input("cliBanner")]
        public Input<string>? CliBanner { get; set; }

        /// <summary>
        /// Sets timeout for switches
        /// </summary>
        [Input("cliIdleTimeout")]
        public Input<int>? CliIdleTimeout { get; set; }

        /// <summary>
        /// Rollback timer for commit confirmed
        /// </summary>
        [Input("configRevertTimer")]
        public Input<int>? ConfigRevertTimer { get; set; }

        /// <summary>
        /// Enable to provide the FQDN with DHCP option 81
        /// </summary>
        [Input("dhcpOptionFqdn")]
        public Input<bool>? DhcpOptionFqdn { get; set; }

        [Input("disableOobDownAlarm")]
        public Input<bool>? DisableOobDownAlarm { get; set; }

        [Input("fipsEnabled")]
        public Input<bool>? FipsEnabled { get; set; }

        [Input("localAccounts")]
        private InputMap<Inputs.NetworktemplateSwitchMgmtLocalAccountsGetArgs>? _localAccounts;

        /// <summary>
        /// Property key is the user name. For Local user authentication
        /// </summary>
        public InputMap<Inputs.NetworktemplateSwitchMgmtLocalAccountsGetArgs> LocalAccounts
        {
            get => _localAccounts ?? (_localAccounts = new InputMap<Inputs.NetworktemplateSwitchMgmtLocalAccountsGetArgs>());
            set => _localAccounts = value;
        }

        [Input("mxedgeProxyHost")]
        public Input<string>? MxedgeProxyHost { get; set; }

        [Input("mxedgeProxyPort")]
        public Input<int>? MxedgeProxyPort { get; set; }

        /// <summary>
        /// Restrict inbound-traffic to host
        /// when enabled, all traffic that is not essential to our operation will be dropped 
        /// e.g. ntp / dns / traffic to mist will be allowed by default, if dhcpd is enabled, we'll make sure it works
        /// </summary>
        [Input("protectRe")]
        public Input<Inputs.NetworktemplateSwitchMgmtProtectReGetArgs>? ProtectRe { get; set; }

        [Input("rootPassword")]
        private Input<string>? _rootPassword;
        public Input<string>? RootPassword
        {
            get => _rootPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _rootPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("tacacs")]
        public Input<Inputs.NetworktemplateSwitchMgmtTacacsGetArgs>? Tacacs { get; set; }

        /// <summary>
        /// To use mxedge as proxy
        /// </summary>
        [Input("useMxedgeProxy")]
        public Input<bool>? UseMxedgeProxy { get; set; }

        public NetworktemplateSwitchMgmtGetArgs()
        {
        }
        public static new NetworktemplateSwitchMgmtGetArgs Empty => new NetworktemplateSwitchMgmtGetArgs();
    }
}
