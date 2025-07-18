// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class NetworktemplateRemoteSyslogUserArgs : global::Pulumi.ResourceArgs
    {
        [Input("contents")]
        private InputList<Inputs.NetworktemplateRemoteSyslogUserContentArgs>? _contents;
        public InputList<Inputs.NetworktemplateRemoteSyslogUserContentArgs> Contents
        {
            get => _contents ?? (_contents = new InputList<Inputs.NetworktemplateRemoteSyslogUserContentArgs>());
            set => _contents = value;
        }

        [Input("match")]
        public Input<string>? Match { get; set; }

        [Input("user")]
        public Input<string>? User { get; set; }

        public NetworktemplateRemoteSyslogUserArgs()
        {
        }
        public static new NetworktemplateRemoteSyslogUserArgs Empty => new NetworktemplateRemoteSyslogUserArgs();
    }
}
