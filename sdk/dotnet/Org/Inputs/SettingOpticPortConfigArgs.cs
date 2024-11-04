// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class SettingOpticPortConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enable channelization
        /// </summary>
        [Input("channelized")]
        public Input<bool>? Channelized { get; set; }

        /// <summary>
        /// interface speed (e.g. `25g`, `50g`), use the chassis speed by default
        /// </summary>
        [Input("speed")]
        public Input<string>? Speed { get; set; }

        public SettingOpticPortConfigArgs()
        {
        }
        public static new SettingOpticPortConfigArgs Empty => new SettingOpticPortConfigArgs();
    }
}