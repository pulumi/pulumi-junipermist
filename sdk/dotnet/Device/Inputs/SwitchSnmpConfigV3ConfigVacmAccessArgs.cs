// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchSnmpConfigV3ConfigVacmAccessArgs : global::Pulumi.ResourceArgs
    {
        [Input("groupName")]
        public Input<string>? GroupName { get; set; }

        [Input("prefixLists")]
        private InputList<Inputs.SwitchSnmpConfigV3ConfigVacmAccessPrefixListArgs>? _prefixLists;
        public InputList<Inputs.SwitchSnmpConfigV3ConfigVacmAccessPrefixListArgs> PrefixLists
        {
            get => _prefixLists ?? (_prefixLists = new InputList<Inputs.SwitchSnmpConfigV3ConfigVacmAccessPrefixListArgs>());
            set => _prefixLists = value;
        }

        public SwitchSnmpConfigV3ConfigVacmAccessArgs()
        {
        }
        public static new SwitchSnmpConfigV3ConfigVacmAccessArgs Empty => new SwitchSnmpConfigV3ConfigVacmAccessArgs();
    }
}
