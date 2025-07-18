// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class ApRadioConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowRrmDisable")]
        public Input<bool>? AllowRrmDisable { get; set; }

        /// <summary>
        /// Antenna gain for 2.4G - for models with external antenna only
        /// </summary>
        [Input("antGain24")]
        public Input<int>? AntGain24 { get; set; }

        /// <summary>
        /// Antenna gain for 5G - for models with external antenna only
        /// </summary>
        [Input("antGain5")]
        public Input<int>? AntGain5 { get; set; }

        /// <summary>
        /// Antenna gain for 6G - for models with external antenna only
        /// </summary>
        [Input("antGain6")]
        public Input<int>? AntGain6 { get; set; }

        /// <summary>
        /// enum: `1x1`, `2x2`, `3x3`, `4x4`, `default`
        /// </summary>
        [Input("antennaMode")]
        public Input<string>? AntennaMode { get; set; }

        /// <summary>
        /// Radio Band AP settings
        /// </summary>
        [Input("band24")]
        public Input<Inputs.ApRadioConfigBand24GetArgs>? Band24 { get; set; }

        /// <summary>
        /// enum: `24`, `5`, `6`, `auto`
        /// </summary>
        [Input("band24Usage")]
        public Input<string>? Band24Usage { get; set; }

        /// <summary>
        /// Radio Band AP settings
        /// </summary>
        [Input("band5")]
        public Input<Inputs.ApRadioConfigBand5GetArgs>? Band5 { get; set; }

        /// <summary>
        /// Radio Band AP settings
        /// </summary>
        [Input("band5On24Radio")]
        public Input<Inputs.ApRadioConfigBand5On24RadioGetArgs>? Band5On24Radio { get; set; }

        /// <summary>
        /// Radio Band AP settings
        /// </summary>
        [Input("band6")]
        public Input<Inputs.ApRadioConfigBand6GetArgs>? Band6 { get; set; }

        /// <summary>
        /// Let RRM control everything, only the `channels` and `ant_gain` will be honored (i.e. disabled/bandwidth/power/band_24_usage are all controlled by RRM)
        /// </summary>
        [Input("fullAutomaticRrm")]
        public Input<bool>? FullAutomaticRrm { get; set; }

        /// <summary>
        /// To make an outdoor operate indoor. For an outdoor-ap, some channels are disallowed by default, this allows the user to use it as an indoor-ap
        /// </summary>
        [Input("indoorUse")]
        public Input<bool>? IndoorUse { get; set; }

        /// <summary>
        /// Whether scanning radio is enabled
        /// </summary>
        [Input("scanningEnabled")]
        public Input<bool>? ScanningEnabled { get; set; }

        public ApRadioConfigGetArgs()
        {
        }
        public static new ApRadioConfigGetArgs Empty => new ApRadioConfigGetArgs();
    }
}
