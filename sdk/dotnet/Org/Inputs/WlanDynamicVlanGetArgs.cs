// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class WlanDynamicVlanGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("defaultVlanIds", required: true)]
        private InputList<string>? _defaultVlanIds;

        /// <summary>
        /// Default VLAN ID(s) can be a number, a range of VLAN IDs, a variable or multiple numbers, ranges or variables as a VLAN pool. Default VLAN as a pool of VLANS requires 0.14.x or newer firmware
        /// </summary>
        public InputList<string> DefaultVlanIds
        {
            get => _defaultVlanIds ?? (_defaultVlanIds = new InputList<string>());
            set => _defaultVlanIds = value;
        }

        /// <summary>
        /// Requires `vlan_enabled`==`true` to be set to `true`. Whether to enable dynamic vlan
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("localVlanIds")]
        private InputList<string>? _localVlanIds;

        /// <summary>
        /// VLAN_ids to be locally bridged
        /// </summary>
        public InputList<string> LocalVlanIds
        {
            get => _localVlanIds ?? (_localVlanIds = new InputList<string>());
            set => _localVlanIds = value;
        }

        /// <summary>
        /// standard (using Tunnel-Private-Group-ID, widely supported), airespace-interface-name (Airespace/Cisco). enum: `airespace-interface-name`, `standard`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("vlans")]
        private InputMap<string>? _vlans;

        /// <summary>
        /// Map between vlan_id (as string) to airespace interface names (comma-separated) or null for standard mapping
        ///   * if `dynamic_vlan.type`==`standard`, property key is the Vlan ID and property value is \"\"
        ///   * if `dynamic_vlan.type`==`airespace-interface-name`, property key is the Vlan ID and property value is the Airespace Interface Name
        /// </summary>
        public InputMap<string> Vlans
        {
            get => _vlans ?? (_vlans = new InputMap<string>());
            set => _vlans = value;
        }

        public WlanDynamicVlanGetArgs()
        {
        }
        public static new WlanDynamicVlanGetArgs Empty => new WlanDynamicVlanGetArgs();
    }
}
