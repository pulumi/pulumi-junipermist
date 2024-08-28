// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the list of Devices in the Org inventory.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const inventory = junipermist.org.getInventory({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getInventory(args: GetInventoryArgs, opts?: pulumi.InvokeOptions): Promise<GetInventoryResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:org/getInventory:getInventory", {
        "mac": args.mac,
        "model": args.model,
        "orgId": args.orgId,
        "serial": args.serial,
        "siteId": args.siteId,
        "unassigned": args.unassigned,
        "vc": args.vc,
        "vcMac": args.vcMac,
    }, opts);
}

/**
 * A collection of arguments for invoking getInventory.
 */
export interface GetInventoryArgs {
    /**
     * MAC address
     */
    mac?: string;
    /**
     * device model
     */
    model?: string;
    orgId: string;
    /**
     * device serial
     */
    serial?: string;
    /**
     * site id if assigned, null if not assigned
     */
    siteId?: string;
    /**
     * to display Unassigned devices
     */
    unassigned?: boolean;
    /**
     * To display Virtual Chassis members
     */
    vc?: boolean;
    /**
     * Virtual Chassis MAC Address
     */
    vcMac?: string;
}

/**
 * A collection of values returned by getInventory.
 */
export interface GetInventoryResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * MAC address
     */
    readonly mac?: string;
    /**
     * device model
     */
    readonly model?: string;
    readonly orgId: string;
    readonly orgInventories: outputs.org.GetInventoryOrgInventory[];
    /**
     * device serial
     */
    readonly serial?: string;
    /**
     * site id if assigned, null if not assigned
     */
    readonly siteId?: string;
    /**
     * to display Unassigned devices
     */
    readonly unassigned?: boolean;
    /**
     * To display Virtual Chassis members
     */
    readonly vc?: boolean;
    /**
     * Virtual Chassis MAC Address
     */
    readonly vcMac?: string;
}
/**
 * This data source provides the list of Devices in the Org inventory.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const inventory = junipermist.org.getInventory({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getInventoryOutput(args: GetInventoryOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetInventoryResult> {
    return pulumi.output(args).apply((a: any) => getInventory(a, opts))
}

/**
 * A collection of arguments for invoking getInventory.
 */
export interface GetInventoryOutputArgs {
    /**
     * MAC address
     */
    mac?: pulumi.Input<string>;
    /**
     * device model
     */
    model?: pulumi.Input<string>;
    orgId: pulumi.Input<string>;
    /**
     * device serial
     */
    serial?: pulumi.Input<string>;
    /**
     * site id if assigned, null if not assigned
     */
    siteId?: pulumi.Input<string>;
    /**
     * to display Unassigned devices
     */
    unassigned?: pulumi.Input<boolean>;
    /**
     * To display Virtual Chassis members
     */
    vc?: pulumi.Input<boolean>;
    /**
     * Virtual Chassis MAC Address
     */
    vcMac?: pulumi.Input<string>;
}