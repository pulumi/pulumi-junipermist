// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.org.InventoryArgs;
import com.pulumi.junipermist.org.inputs.InventoryState;
import com.pulumi.junipermist.org.outputs.InventoryInventory;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This resource manages the Org Inventory.
 * 
 * It can be used to claim, unclaim, assign, unassign, reassign devices.
 * 
 * -&gt;Removing a device from the `devices` list or `inventory` map will NOT release it unless `unclaim_when_destroyed` is set to `true`
 * 
 * !&gt; The `devices` attribute (List) is deprecated and is replaced by the `inventory` attribute (Map) as it can generate &#34;inconsistent result after apply&#34; errors. If this happens, it is required to force a refresh of the state to synchronise the new list.\
 * The `devices` attribute will generate inconsistent result after apply when a device other than the last one is removed from the list or when a device is added somewhere other than the end of the list
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `mist_org_inventory` with:
 * 
 * Org Inventory can be imported by specifying the org_id
 * 
 * ```sh
 * $ pulumi import junipermist:org/inventory:Inventory inventory_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a
 * ```
 * 
 */
@ResourceType(type="junipermist:org/inventory:Inventory")
public class Inventory extends com.pulumi.resources.CustomResource {
    /**
     * Property key can be the device Claim Code or the device MAC Address: * Claim Code: used to claim the device to the Mist
     * Organization and manage it. Format is `[0-9A-Z]{15}` (e.g `01234ABCDE56789`) * MAC Address: used to manage a device
     * already in the Mist Organization (claimed or adopted devices). Format is `[0-9a-f]{12}` (e.g `5684dae9ac8b`) &gt;
     * 
     */
    @Export(name="inventory", refs={Map.class,String.class,InventoryInventory.class}, tree="[0,1,2]")
    private Output<Map<String,InventoryInventory>> inventory;

    /**
     * @return Property key can be the device Claim Code or the device MAC Address: * Claim Code: used to claim the device to the Mist
     * Organization and manage it. Format is `[0-9A-Z]{15}` (e.g `01234ABCDE56789`) * MAC Address: used to manage a device
     * already in the Mist Organization (claimed or adopted devices). Format is `[0-9a-f]{12}` (e.g `5684dae9ac8b`) &gt;
     * 
     */
    public Output<Map<String,InventoryInventory>> inventory() {
        return this.inventory;
    }
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Inventory(java.lang.String name) {
        this(name, InventoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Inventory(java.lang.String name, InventoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Inventory(java.lang.String name, InventoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/inventory:Inventory", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Inventory(java.lang.String name, Output<java.lang.String> id, @Nullable InventoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/inventory:Inventory", name, state, makeResourceOptions(options, id), false);
    }

    private static InventoryArgs makeArgs(InventoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? InventoryArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Inventory get(java.lang.String name, Output<java.lang.String> id, @Nullable InventoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Inventory(name, id, state, options);
    }
}
