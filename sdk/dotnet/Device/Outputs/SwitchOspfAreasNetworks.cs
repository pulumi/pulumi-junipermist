// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Outputs
{

    [OutputType]
    public sealed class SwitchOspfAreasNetworks
    {
        /// <summary>
        /// Required if `auth_type`==`md5`. Property key is the key number
        /// </summary>
        public readonly ImmutableDictionary<string, string>? AuthKeys;
        /// <summary>
        /// Required if `auth_type`==`password`, the password, max length is 8
        /// </summary>
        public readonly string? AuthPassword;
        /// <summary>
        /// auth type. enum: `md5`, `none`, `password`
        /// </summary>
        public readonly string? AuthType;
        public readonly int? BfdMinimumInterval;
        public readonly int? DeadInterval;
        public readonly string? ExportPolicy;
        public readonly int? HelloInterval;
        public readonly string? ImportPolicy;
        /// <summary>
        /// interface type (nbma = non-broadcast multi-access). enum: `broadcast`, `nbma`, `p2mp`, `p2p`
        /// </summary>
        public readonly string? InterfaceType;
        public readonly int? Metric;
        /// <summary>
        /// By default, we'll re-advertise all learned OSPF routes toward overlay
        /// </summary>
        public readonly bool? NoReadvertiseToOverlay;
        /// <summary>
        /// Whether to send OSPF-Hello
        /// </summary>
        public readonly bool? Passive;

        [OutputConstructor]
        private SwitchOspfAreasNetworks(
            ImmutableDictionary<string, string>? authKeys,

            string? authPassword,

            string? authType,

            int? bfdMinimumInterval,

            int? deadInterval,

            string? exportPolicy,

            int? helloInterval,

            string? importPolicy,

            string? interfaceType,

            int? metric,

            bool? noReadvertiseToOverlay,

            bool? passive)
        {
            AuthKeys = authKeys;
            AuthPassword = authPassword;
            AuthType = authType;
            BfdMinimumInterval = bfdMinimumInterval;
            DeadInterval = deadInterval;
            ExportPolicy = exportPolicy;
            HelloInterval = helloInterval;
            ImportPolicy = importPolicy;
            InterfaceType = interfaceType;
            Metric = metric;
            NoReadvertiseToOverlay = noReadvertiseToOverlay;
            Passive = passive;
        }
    }
}
