// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingSyntheticTestArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `auto`, `high`, `low`
        /// </summary>
        [Input("aggressiveness")]
        public Input<string>? Aggressiveness { get; set; }

        [Input("customProbes")]
        private InputMap<Inputs.SettingSyntheticTestCustomProbesArgs>? _customProbes;

        /// <summary>
        /// Custom probes to be used for synthetic tests
        /// </summary>
        public InputMap<Inputs.SettingSyntheticTestCustomProbesArgs> CustomProbes
        {
            get => _customProbes ?? (_customProbes = new InputMap<Inputs.SettingSyntheticTestCustomProbesArgs>());
            set => _customProbes = value;
        }

        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        [Input("lanNetworks")]
        private InputList<Inputs.SettingSyntheticTestLanNetworkArgs>? _lanNetworks;

        /// <summary>
        /// List of networks to be used for synthetic tests
        /// </summary>
        public InputList<Inputs.SettingSyntheticTestLanNetworkArgs> LanNetworks
        {
            get => _lanNetworks ?? (_lanNetworks = new InputList<Inputs.SettingSyntheticTestLanNetworkArgs>());
            set => _lanNetworks = value;
        }

        [Input("vlans")]
        private InputList<Inputs.SettingSyntheticTestVlanArgs>? _vlans;
        public InputList<Inputs.SettingSyntheticTestVlanArgs> Vlans
        {
            get => _vlans ?? (_vlans = new InputList<Inputs.SettingSyntheticTestVlanArgs>());
            set => _vlans = value;
        }

        [Input("wanSpeedtest")]
        public Input<Inputs.SettingSyntheticTestWanSpeedtestArgs>? WanSpeedtest { get; set; }

        public SettingSyntheticTestArgs()
        {
        }
        public static new SettingSyntheticTestArgs Empty => new SettingSyntheticTestArgs();
    }
}
