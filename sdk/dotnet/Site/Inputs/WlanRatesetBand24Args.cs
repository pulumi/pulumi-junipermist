// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class WlanRatesetBand24Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// if `template`==`custom`. MCS bitmasks for 4 streams (16-bit for each stream, MCS0 is least significant bit), e.g. 00ff 00f0 001f limits HT rates to MCS 0-7 for 1 stream, MCS 4-7 for 2 stream (i.e. MCS 12-15), MCS 1-5 for 3 stream (i.e. MCS 16-20)
        /// </summary>
        [Input("ht")]
        public Input<string>? Ht { get; set; }

        [Input("legacies")]
        private InputList<string>? _legacies;

        /// <summary>
        /// if `template`==`custom`. List of supported rates (IE=1) and extended supported rates (IE=50) for custom template, append ‘b’ at the end to indicate a rate being basic/mandatory. If `template`==`custom` is configured and legacy does not define at least one basic rate, it will use `no-legacy` default values
        /// </summary>
        public InputList<string> Legacies
        {
            get => _legacies ?? (_legacies = new InputList<string>());
            set => _legacies = value;
        }

        /// <summary>
        /// Minimum RSSI for client to connect, 0 means not enforcing
        /// </summary>
        [Input("minRssi")]
        public Input<int>? MinRssi { get; set; }

        /// <summary>
        /// Data Rates template to apply. enum: 
        ///   * `no-legacy`: no 11b
        ///   * `compatible`: all, like before, default setting that Broadcom/Atheros used
        ///   * `legacy-only`: disable 802.11n and 802.11ac
        ///   * `high-density`: no 11b, no low rates
        ///   * `custom`: user defined
        /// </summary>
        [Input("template")]
        public Input<string>? Template { get; set; }

        /// <summary>
        /// if `template`==`custom`. MCS bitmasks for 4 streams (16-bit for each stream, MCS0 is least significant bit), e.g. 03ff 01ff 00ff limits VHT rates to MCS 0-9 for 1 stream, MCS 0-8 for 2 streams, and MCS 0-7 for 3 streams.
        /// </summary>
        [Input("vht")]
        public Input<string>? Vht { get; set; }

        public WlanRatesetBand24Args()
        {
        }
        public static new WlanRatesetBand24Args Empty => new WlanRatesetBand24Args();
    }
}
