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
    public sealed class NetworktemplateSnmpConfig
    {
        public readonly ImmutableArray<Outputs.NetworktemplateSnmpConfigClientList> ClientLists;
        public readonly string? Contact;
        public readonly string? Description;
        public readonly bool? Enabled;
        public readonly string? EngineId;
        /// <summary>
        /// enum: `local`, `use_mac_address`
        /// </summary>
        public readonly string? EngineIdType;
        public readonly string? Location;
        public readonly string? Name;
        public readonly string? Network;
        public readonly ImmutableArray<Outputs.NetworktemplateSnmpConfigTrapGroup> TrapGroups;
        public readonly ImmutableArray<Outputs.NetworktemplateSnmpConfigV2cConfig> V2cConfigs;
        public readonly Outputs.NetworktemplateSnmpConfigV3Config? V3Config;
        public readonly ImmutableArray<Outputs.NetworktemplateSnmpConfigView> Views;

        [OutputConstructor]
        private NetworktemplateSnmpConfig(
            ImmutableArray<Outputs.NetworktemplateSnmpConfigClientList> clientLists,

            string? contact,

            string? description,

            bool? enabled,

            string? engineId,

            string? engineIdType,

            string? location,

            string? name,

            string? network,

            ImmutableArray<Outputs.NetworktemplateSnmpConfigTrapGroup> trapGroups,

            ImmutableArray<Outputs.NetworktemplateSnmpConfigV2cConfig> v2cConfigs,

            Outputs.NetworktemplateSnmpConfigV3Config? v3Config,

            ImmutableArray<Outputs.NetworktemplateSnmpConfigView> views)
        {
            ClientLists = clientLists;
            Contact = contact;
            Description = description;
            Enabled = enabled;
            EngineId = engineId;
            EngineIdType = engineIdType;
            Location = location;
            Name = name;
            Network = network;
            TrapGroups = trapGroups;
            V2cConfigs = v2cConfigs;
            V3Config = v3Config;
            Views = views;
        }
    }
}
