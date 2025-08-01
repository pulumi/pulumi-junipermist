// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchRemoteSyslogArgs : global::Pulumi.ResourceArgs
    {
        [Input("archive")]
        public Input<Inputs.SwitchRemoteSyslogArchiveArgs>? Archive { get; set; }

        [Input("cacerts")]
        private InputList<string>? _cacerts;
        public InputList<string> Cacerts
        {
            get => _cacerts ?? (_cacerts = new InputList<string>());
            set => _cacerts = value;
        }

        [Input("console")]
        public Input<Inputs.SwitchRemoteSyslogConsoleArgs>? Console { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("files")]
        private InputList<Inputs.SwitchRemoteSyslogFileArgs>? _files;
        public InputList<Inputs.SwitchRemoteSyslogFileArgs> Files
        {
            get => _files ?? (_files = new InputList<Inputs.SwitchRemoteSyslogFileArgs>());
            set => _files = value;
        }

        /// <summary>
        /// If source_address is configured, will use the vlan firstly otherwise use source_ip
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        [Input("sendToAllServers")]
        public Input<bool>? SendToAllServers { get; set; }

        [Input("servers")]
        private InputList<Inputs.SwitchRemoteSyslogServerArgs>? _servers;
        public InputList<Inputs.SwitchRemoteSyslogServerArgs> Servers
        {
            get => _servers ?? (_servers = new InputList<Inputs.SwitchRemoteSyslogServerArgs>());
            set => _servers = value;
        }

        /// <summary>
        /// enum: `millisecond`, `year`, `year millisecond`
        /// </summary>
        [Input("timeFormat")]
        public Input<string>? TimeFormat { get; set; }

        [Input("users")]
        private InputList<Inputs.SwitchRemoteSyslogUserArgs>? _users;
        public InputList<Inputs.SwitchRemoteSyslogUserArgs> Users
        {
            get => _users ?? (_users = new InputList<Inputs.SwitchRemoteSyslogUserArgs>());
            set => _users = value;
        }

        public SwitchRemoteSyslogArgs()
        {
        }
        public static new SwitchRemoteSyslogArgs Empty => new SwitchRemoteSyslogArgs();
    }
}
