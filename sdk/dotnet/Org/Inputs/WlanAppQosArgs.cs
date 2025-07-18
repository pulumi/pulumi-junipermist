// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class WlanAppQosArgs : global::Pulumi.ResourceArgs
    {
        [Input("apps")]
        private InputMap<Inputs.WlanAppQosAppsArgs>? _apps;
        public InputMap<Inputs.WlanAppQosAppsArgs> Apps
        {
            get => _apps ?? (_apps = new InputMap<Inputs.WlanAppQosAppsArgs>());
            set => _apps = value;
        }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("others")]
        private InputList<Inputs.WlanAppQosOtherArgs>? _others;
        public InputList<Inputs.WlanAppQosOtherArgs> Others
        {
            get => _others ?? (_others = new InputList<Inputs.WlanAppQosOtherArgs>());
            set => _others = value;
        }

        public WlanAppQosArgs()
        {
        }
        public static new WlanAppQosArgs Empty => new WlanAppQosArgs();
    }
}
