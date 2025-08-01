// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
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

        /// <summary>
        /// IP Address or FQDN of the Mist Edge used to proxy the switch management traffic to the Mist Cloud
        /// </summary>
        [Input("mxedgeProxyHost")]
        public Input<string>? MxedgeProxyHost { get; set; }

        /// <summary>
        /// Mist Edge port used to proxy the switch management traffic to the Mist Cloud. Value in range 1-65535
        /// </summary>
        [Input("mxedgeProxyPort")]
        public Input<string>? MxedgeProxyPort { get; set; }

        /// <summary>
        /// Restrict inbound-traffic to host
        /// when enabled, all traffic that is not essential to our operation will be dropped 
        /// e.g. ntp / dns / traffic to mist will be allowed by default, if dhcpd is enabled, we'll make sure it works
        /// </summary>
        [Input("protectRe")]
        public Input<Inputs.NetworktemplateSwitchMgmtProtectReGetArgs>? ProtectRe { get; set; }

        /// <summary>
        /// By default, only the configuration generated by Mist is cleaned up during the configuration process. If `true`, all the existing configuration will be removed.
        /// </summary>
        [Input("removeExistingConfigs")]
        public Input<bool>? RemoveExistingConfigs { get; set; }

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
