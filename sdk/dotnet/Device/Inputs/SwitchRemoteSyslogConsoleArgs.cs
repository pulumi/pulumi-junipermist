// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchRemoteSyslogConsoleArgs : global::Pulumi.ResourceArgs
    {
        [Input("contents")]
        private InputList<Inputs.SwitchRemoteSyslogConsoleContentArgs>? _contents;
        public InputList<Inputs.SwitchRemoteSyslogConsoleContentArgs> Contents
        {
            get => _contents ?? (_contents = new InputList<Inputs.SwitchRemoteSyslogConsoleContentArgs>());
            set => _contents = value;
        }

        public SwitchRemoteSyslogConsoleArgs()
        {
        }
        public static new SwitchRemoteSyslogConsoleArgs Empty => new SwitchRemoteSyslogConsoleArgs();
    }
}
