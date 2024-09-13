// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class SettingPortChannelizationArgs : global::Pulumi.ResourceArgs
    {
        [Input("config")]
        private InputMap<string>? _config;

        /// <summary>
        /// Property key is the interface name or range (e.g. `et-0/0/47`, `et-0/0/48-49`), Property value is the interface speed (e.g. `25g`, `50g`)
        /// </summary>
        public InputMap<string> Config
        {
            get => _config ?? (_config = new InputMap<string>());
            set => _config = value;
        }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public SettingPortChannelizationArgs()
        {
        }
        public static new SettingPortChannelizationArgs Empty => new SettingPortChannelizationArgs();
    }
}
