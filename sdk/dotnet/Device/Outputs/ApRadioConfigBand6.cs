// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Outputs
{

    [OutputType]
    public sealed class ApRadioConfigBand6
    {
        public readonly bool? AllowRrmDisable;
        public readonly int? AntGain;
        /// <summary>
        /// enum: `1x1`, `2x2`, `3x3`, `4x4`, `default`
        /// </summary>
        public readonly string? AntennaMode;
        /// <summary>
        /// channel width for the 6GHz band. enum: `20`, `40`, `80`, `160`
        /// </summary>
        public readonly int? Bandwidth;
        /// <summary>
        /// For Device. (primary) channel for the band, 0 means using the Site Setting
        /// </summary>
        public readonly int? Channel;
        /// <summary>
        /// For RFTemplates. List of channels, null or empty array means auto
        /// </summary>
        public readonly ImmutableArray<int> Channels;
        /// <summary>
        /// Whether to disable the radio
        /// </summary>
        public readonly bool? Disabled;
        /// <summary>
        /// TX power of the radio. For Devices, 0 means auto. -1 / -2 / -3 / …: treated as 0 / -1 / -2 / …
        /// </summary>
        public readonly int? Power;
        /// <summary>
        /// When power=0, max tx power to use, HW-specific values will be used if not set
        /// </summary>
        public readonly int? PowerMax;
        /// <summary>
        /// When power=0, min tx power to use, HW-specific values will be used if not set
        /// </summary>
        public readonly int? PowerMin;
        /// <summary>
        /// enum: `auto`, `long`, `short`
        /// </summary>
        public readonly string? Preamble;
        /// <summary>
        /// For 6GHz Only, standard-power operation, AFC (Automatic Frequency Coordination) will be performed, and we'll fall back to Low Power Indoor if AFC failed
        /// </summary>
        public readonly bool? StandardPower;

        [OutputConstructor]
        private ApRadioConfigBand6(
            bool? allowRrmDisable,

            int? antGain,

            string? antennaMode,

            int? bandwidth,

            int? channel,

            ImmutableArray<int> channels,

            bool? disabled,

            int? power,

            int? powerMax,

            int? powerMin,

            string? preamble,

            bool? standardPower)
        {
            AllowRrmDisable = allowRrmDisable;
            AntGain = antGain;
            AntennaMode = antennaMode;
            Bandwidth = bandwidth;
            Channel = channel;
            Channels = channels;
            Disabled = disabled;
            Power = power;
            PowerMax = powerMax;
            PowerMin = powerMin;
            Preamble = preamble;
            StandardPower = standardPower;
        }
    }
}
