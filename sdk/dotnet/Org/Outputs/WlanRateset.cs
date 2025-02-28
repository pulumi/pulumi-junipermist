// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Outputs
{

    [OutputType]
    public sealed class WlanRateset
    {
        /// <summary>
        /// If `template`==`custom`. MCS bitmasks for 4 streams (16-bit for each stream, MCS0 is least significant bit), e.g. 00ff 00f0 001f limits HT rates to MCS 0-7 for 1 stream, MCS 4-7 for 2 stream (i.e. MCS 12-15), MCS 1-5 for 3 stream (i.e. MCS 16-20)
        /// </summary>
        public readonly string? Ht;
        /// <summary>
        /// if `template`==`custom`. List of supported rates (IE=1) and extended supported rates (IE=50) for custom template, append ‘b’ at the end to indicate a rate being basic/mandatory. If `template`==`custom` is configured and legacy does not define at least one basic rate, it will use `no-legacy` default values. enum: `1`, `11`, `11b`, `12`, `12b`, `18`, `18b`, `1b`, `2`, `24`, `24b`, `2b`, `36`, `36b`, `48`, `48b`, `5.5`, `5.5b`, `54`, `54b`, `6`, `6b`, `9`, `9b`
        /// </summary>
        public readonly ImmutableArray<string> Legacies;
        /// <summary>
        /// Minimum RSSI for client to connect, 0 means not enforcing
        /// </summary>
        public readonly int? MinRssi;
        /// <summary>
        /// Data Rates template to apply. enum: 
        ///   * `no-legacy`: no 11b
        ///   * `compatible`: all, like before, default setting that Broadcom/Atheros used
        ///   * `legacy-only`: disable 802.11n and 802.11ac
        ///   * `high-density`: no 11b, no low rates
        ///   * `custom`: user defined
        /// </summary>
        public readonly string? Template;
        /// <summary>
        /// If `template`==`custom`. MCS bitmasks for 4 streams (16-bit for each stream, MCS0 is least significant bit), e.g. 03ff 01ff 00ff limits VHT rates to MCS 0-9 for 1 stream, MCS 0-8 for 2 streams, and MCS 0-7 for 3 streams.
        /// </summary>
        public readonly string? Vht;

        [OutputConstructor]
        private WlanRateset(
            string? ht,

            ImmutableArray<string> legacies,

            int? minRssi,

            string? template,

            string? vht)
        {
            Ht = ht;
            Legacies = legacies;
            MinRssi = minRssi;
            Template = template;
            Vht = vht;
        }
    }
}
