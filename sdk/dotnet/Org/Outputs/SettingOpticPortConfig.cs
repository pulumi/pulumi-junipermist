// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Outputs
{

    [OutputType]
    public sealed class SettingOpticPortConfig
    {
        /// <summary>
        /// Enable channelization
        /// </summary>
        public readonly bool? Channelized;
        /// <summary>
        /// Interface speed (e.g. `25g`, `50g`), use the chassis speed by default
        /// </summary>
        public readonly string? Speed;

        [OutputConstructor]
        private SettingOpticPortConfig(
            bool? channelized,

            string? speed)
        {
            Channelized = channelized;
            Speed = speed;
        }
    }
}
