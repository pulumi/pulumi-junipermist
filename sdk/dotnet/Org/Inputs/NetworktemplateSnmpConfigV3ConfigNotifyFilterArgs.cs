// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class NetworktemplateSnmpConfigV3ConfigNotifyFilterArgs : global::Pulumi.ResourceArgs
    {
        [Input("contents")]
        private InputList<Inputs.NetworktemplateSnmpConfigV3ConfigNotifyFilterContentArgs>? _contents;
        public InputList<Inputs.NetworktemplateSnmpConfigV3ConfigNotifyFilterContentArgs> Contents
        {
            get => _contents ?? (_contents = new InputList<Inputs.NetworktemplateSnmpConfigV3ConfigNotifyFilterContentArgs>());
            set => _contents = value;
        }

        [Input("profileName")]
        public Input<string>? ProfileName { get; set; }

        public NetworktemplateSnmpConfigV3ConfigNotifyFilterArgs()
        {
        }
        public static new NetworktemplateSnmpConfigV3ConfigNotifyFilterArgs Empty => new NetworktemplateSnmpConfigV3ConfigNotifyFilterArgs();
    }
}
