// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.InventoryInventoryArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InventoryState extends com.pulumi.resources.ResourceArgs {

    public static final InventoryState Empty = new InventoryState();

    /**
     * Property key can be the device Claim Code or the device MAC Address: * Claim Code: used to claim the device to the Mist
     * Organization and manage it. Format is `[0-9A-Z]{15}` (e.g `01234ABCDE56789`) * MAC Address: used to manage a device
     * already in the Mist Organization (claimed or adopted devices). Format is `[0-9a-f]{12}` (e.g `5684dae9ac8b`) &gt;
     * 
     */
    @Import(name="inventory")
    private @Nullable Output<Map<String,InventoryInventoryArgs>> inventory;

    /**
     * @return Property key can be the device Claim Code or the device MAC Address: * Claim Code: used to claim the device to the Mist
     * Organization and manage it. Format is `[0-9A-Z]{15}` (e.g `01234ABCDE56789`) * MAC Address: used to manage a device
     * already in the Mist Organization (claimed or adopted devices). Format is `[0-9a-f]{12}` (e.g `5684dae9ac8b`) &gt;
     * 
     */
    public Optional<Output<Map<String,InventoryInventoryArgs>>> inventory() {
        return Optional.ofNullable(this.inventory);
    }

    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    private InventoryState() {}

    private InventoryState(InventoryState $) {
        this.inventory = $.inventory;
        this.orgId = $.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InventoryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InventoryState $;

        public Builder() {
            $ = new InventoryState();
        }

        public Builder(InventoryState defaults) {
            $ = new InventoryState(Objects.requireNonNull(defaults));
        }

        /**
         * @param inventory Property key can be the device Claim Code or the device MAC Address: * Claim Code: used to claim the device to the Mist
         * Organization and manage it. Format is `[0-9A-Z]{15}` (e.g `01234ABCDE56789`) * MAC Address: used to manage a device
         * already in the Mist Organization (claimed or adopted devices). Format is `[0-9a-f]{12}` (e.g `5684dae9ac8b`) &gt;
         * 
         * @return builder
         * 
         */
        public Builder inventory(@Nullable Output<Map<String,InventoryInventoryArgs>> inventory) {
            $.inventory = inventory;
            return this;
        }

        /**
         * @param inventory Property key can be the device Claim Code or the device MAC Address: * Claim Code: used to claim the device to the Mist
         * Organization and manage it. Format is `[0-9A-Z]{15}` (e.g `01234ABCDE56789`) * MAC Address: used to manage a device
         * already in the Mist Organization (claimed or adopted devices). Format is `[0-9a-f]{12}` (e.g `5684dae9ac8b`) &gt;
         * 
         * @return builder
         * 
         */
        public Builder inventory(Map<String,InventoryInventoryArgs> inventory) {
            return inventory(Output.of(inventory));
        }

        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public InventoryState build() {
            return $;
        }
    }

}
