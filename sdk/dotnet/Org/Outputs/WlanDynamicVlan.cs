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
    public sealed class WlanDynamicVlan
    {
        /// <summary>
        /// Default VLAN ID(s) can be a number, a range of VLAN IDs, a variable or multiple numbers, ranges or variables as a VLAN pool. Default VLAN as a pool of VLANS requires 0.14.x or newer firmware
        /// </summary>
        public readonly ImmutableArray<string> DefaultVlanIds;
        /// <summary>
        /// Requires `vlan_enabled`==`true` to be set to `true`. Whether to enable dynamic vlan
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// vlan_ids to be locally bridged
        /// </summary>
        public readonly ImmutableArray<string> LocalVlanIds;
        /// <summary>
        /// standard (using Tunnel-Private-Group-ID, widely supported), airespace-interface-name (Airespace/Cisco). enum: `airespace-interface-name`, `standard`
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// map between vlan_id (as string) to airespace interface names (comma-separated) or null for stndard mapping
        ///   * if `dynamic_vlan.type`==`standard`, property key is the Vlan ID and property value is \"\"
        ///   * if `dynamic_vlan.type`==`airespace-interface-name`, property key is the Vlan ID and property value is the Airespace Interface Name
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Vlans;

        [OutputConstructor]
        private WlanDynamicVlan(
            ImmutableArray<string> defaultVlanIds,

            bool? enabled,

            ImmutableArray<string> localVlanIds,

            string? type,

            ImmutableDictionary<string, string>? vlans)
        {
            DefaultVlanIds = defaultVlanIds;
            Enabled = enabled;
            LocalVlanIds = localVlanIds;
            Type = type;
            Vlans = vlans;
        }
    }
}
