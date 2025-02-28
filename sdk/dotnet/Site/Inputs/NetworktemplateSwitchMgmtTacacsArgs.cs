// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplateSwitchMgmtTacacsArgs : global::Pulumi.ResourceArgs
    {
        [Input("acctServers")]
        private InputList<Inputs.NetworktemplateSwitchMgmtTacacsAcctServerArgs>? _acctServers;
        public InputList<Inputs.NetworktemplateSwitchMgmtTacacsAcctServerArgs> AcctServers
        {
            get => _acctServers ?? (_acctServers = new InputList<Inputs.NetworktemplateSwitchMgmtTacacsAcctServerArgs>());
            set => _acctServers = value;
        }

        /// <summary>
        /// enum: `admin`, `helpdesk`, `none`, `read`
        /// </summary>
        [Input("defaultRole")]
        public Input<string>? DefaultRole { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Which network the TACACS server resides
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        [Input("tacplusServers")]
        private InputList<Inputs.NetworktemplateSwitchMgmtTacacsTacplusServerArgs>? _tacplusServers;
        public InputList<Inputs.NetworktemplateSwitchMgmtTacacsTacplusServerArgs> TacplusServers
        {
            get => _tacplusServers ?? (_tacplusServers = new InputList<Inputs.NetworktemplateSwitchMgmtTacacsTacplusServerArgs>());
            set => _tacplusServers = value;
        }

        public NetworktemplateSwitchMgmtTacacsArgs()
        {
        }
        public static new NetworktemplateSwitchMgmtTacacsArgs Empty => new NetworktemplateSwitchMgmtTacacsArgs();
    }
}
