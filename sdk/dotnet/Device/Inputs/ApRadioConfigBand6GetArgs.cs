// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class ApRadioConfigBand6GetArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowRrmDisable")]
        public Input<bool>? AllowRrmDisable { get; set; }

        [Input("antGain")]
        public Input<int>? AntGain { get; set; }

        /// <summary>
        /// enum: `1x1`, `2x2`, `3x3`, `4x4`, `default`
        /// </summary>
        [Input("antennaMode")]
        public Input<string>? AntennaMode { get; set; }

        /// <summary>
        /// channel width for the 6GHz band. enum: `20`, `40`, `80`, `160`
        /// </summary>
        [Input("bandwidth")]
        public Input<int>? Bandwidth { get; set; }

        /// <summary>
        /// For Device. (primary) channel for the band, 0 means using the Site Setting
        /// </summary>
        [Input("channel")]
        public Input<int>? Channel { get; set; }

        [Input("channels")]
        private InputList<int>? _channels;

        /// <summary>
        /// For RFTemplates. List of channels, null or empty array means auto
        /// </summary>
        public InputList<int> Channels
        {
            get => _channels ?? (_channels = new InputList<int>());
            set => _channels = value;
        }

        /// <summary>
        /// Whether to disable the radio
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// TX power of the radio. For Devices, 0 means auto. -1 / -2 / -3 / …: treated as 0 / -1 / -2 / …
        /// </summary>
        [Input("power")]
        public Input<int>? Power { get; set; }

        /// <summary>
        /// When power=0, max tx power to use, HW-specific values will be used if not set
        /// </summary>
        [Input("powerMax")]
        public Input<int>? PowerMax { get; set; }

        /// <summary>
        /// When power=0, min tx power to use, HW-specific values will be used if not set
        /// </summary>
        [Input("powerMin")]
        public Input<int>? PowerMin { get; set; }

        /// <summary>
        /// enum: `auto`, `long`, `short`
        /// </summary>
        [Input("preamble")]
        public Input<string>? Preamble { get; set; }

        /// <summary>
        /// For 6GHz Only, standard-power operation, AFC (Automatic Frequency Coordination) will be performed, and we'll fall back to Low Power Indoor if AFC failed
        /// </summary>
        [Input("standardPower")]
        public Input<bool>? StandardPower { get; set; }

        public ApRadioConfigBand6GetArgs()
        {
        }
        public static new ApRadioConfigBand6GetArgs Empty => new ApRadioConfigBand6GetArgs();
    }
}
