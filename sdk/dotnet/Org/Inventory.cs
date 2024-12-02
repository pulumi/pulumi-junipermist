// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org
{
    /// <summary>
    /// This resource manages the Org Inventory.
    /// It can be used to claim, unclaim, assign, unassign, reassign devices.
    /// 
    /// -&gt;Removing a device from the `devices` list or `inventory` map will NOT release it unless `unclaim_when_destroyed` is set to `true`
    /// 
    /// &gt; **WARNING** The `devices` attribute (list) is deprecated and is replaced by the `inventory` attribute (map) as it can generate "inconsistent result after apply" errors. If this happen, is is required to force a refresh of the state to synchronise the new list.
    /// 
    /// The `devices` attribute will generate inconsistent result after apply when
    /// * a device other than the last one is removed from the list
    /// * a device is added somewhere other than the end of the list
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `mist_org_inventory` with:
    /// 
    /// Org Inventory can be imported by specifying the org_id
    /// 
    /// ```sh
    /// $ pulumi import junipermist:org/inventory:Inventory inventory_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a
    /// ```
    /// </summary>
    [JuniperMistResourceType("junipermist:org/inventory:Inventory")]
    public partial class Inventory : global::Pulumi.CustomResource
    {
        /// <summary>
        /// **DEPRECATED** List of devices to manage. Exactly one of `claim_code` or `mac` field must be set
        /// </summary>
        [Output("devices")]
        public Output<ImmutableArray<Outputs.InventoryDevice>> Devices { get; private set; } = null!;

        /// <summary>
        /// Property key can be the device Claim Code or the device MAC Address: * Claim Code: used to claim the device to the Mist
        /// Organization and manage it. Format is `[0-9A-Z]{15}` (e.g `01234ABCDE56789`) * MAC Address: used to managed a device
        /// already in the Mist Organization (claimed or adopted devices). Format is `[0-9a-f]{12}` (e.g `5684dae9ac8b`) &gt;
        /// </summary>
        [Output("inventory")]
        public Output<ImmutableDictionary<string, Outputs.InventoryInventory>> InventoryDetails { get; private set; } = null!;

        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;


        /// <summary>
        /// Create a Inventory resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Inventory(string name, InventoryArgs args, CustomResourceOptions? options = null)
            : base("junipermist:org/inventory:Inventory", name, args ?? new InventoryArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Inventory(string name, Input<string> id, InventoryState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:org/inventory:Inventory", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi/pulumi-junipermist",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Inventory resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Inventory Get(string name, Input<string> id, InventoryState? state = null, CustomResourceOptions? options = null)
        {
            return new Inventory(name, id, state, options);
        }
    }

    public sealed class InventoryArgs : global::Pulumi.ResourceArgs
    {
        [Input("devices")]
        private InputList<Inputs.InventoryDeviceArgs>? _devices;

        /// <summary>
        /// **DEPRECATED** List of devices to manage. Exactly one of `claim_code` or `mac` field must be set
        /// </summary>
        [Obsolete(@"The `devices` attribute has been deprecated in version v0.2.0 of the Juniper-Mist Provider. It has been replaced with the `inventory` map and may be removed in future versions.
Please update your configurations to use the `inventory` attribute.")]
        public InputList<Inputs.InventoryDeviceArgs> Devices
        {
            get => _devices ?? (_devices = new InputList<Inputs.InventoryDeviceArgs>());
            set => _devices = value;
        }

        [Input("inventory")]
        private InputMap<Inputs.InventoryInventoryArgs>? _inventory;

        /// <summary>
        /// Property key can be the device Claim Code or the device MAC Address: * Claim Code: used to claim the device to the Mist
        /// Organization and manage it. Format is `[0-9A-Z]{15}` (e.g `01234ABCDE56789`) * MAC Address: used to managed a device
        /// already in the Mist Organization (claimed or adopted devices). Format is `[0-9a-f]{12}` (e.g `5684dae9ac8b`) &gt;
        /// </summary>
        public InputMap<Inputs.InventoryInventoryArgs> InventoryDetails
        {
            get => _inventory ?? (_inventory = new InputMap<Inputs.InventoryInventoryArgs>());
            set => _inventory = value;
        }

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        public InventoryArgs()
        {
        }
        public static new InventoryArgs Empty => new InventoryArgs();
    }

    public sealed class InventoryState : global::Pulumi.ResourceArgs
    {
        [Input("devices")]
        private InputList<Inputs.InventoryDeviceGetArgs>? _devices;

        /// <summary>
        /// **DEPRECATED** List of devices to manage. Exactly one of `claim_code` or `mac` field must be set
        /// </summary>
        [Obsolete(@"The `devices` attribute has been deprecated in version v0.2.0 of the Juniper-Mist Provider. It has been replaced with the `inventory` map and may be removed in future versions.
Please update your configurations to use the `inventory` attribute.")]
        public InputList<Inputs.InventoryDeviceGetArgs> Devices
        {
            get => _devices ?? (_devices = new InputList<Inputs.InventoryDeviceGetArgs>());
            set => _devices = value;
        }

        [Input("inventory")]
        private InputMap<Inputs.InventoryInventoryGetArgs>? _inventory;

        /// <summary>
        /// Property key can be the device Claim Code or the device MAC Address: * Claim Code: used to claim the device to the Mist
        /// Organization and manage it. Format is `[0-9A-Z]{15}` (e.g `01234ABCDE56789`) * MAC Address: used to managed a device
        /// already in the Mist Organization (claimed or adopted devices). Format is `[0-9a-f]{12}` (e.g `5684dae9ac8b`) &gt;
        /// </summary>
        public InputMap<Inputs.InventoryInventoryGetArgs> InventoryDetails
        {
            get => _inventory ?? (_inventory = new InputMap<Inputs.InventoryInventoryGetArgs>());
            set => _inventory = value;
        }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        public InventoryState()
        {
        }
        public static new InventoryState Empty => new InventoryState();
    }
}
