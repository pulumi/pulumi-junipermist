// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the list of Wireless Access Points with their statistics.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const apStats = junipermist.device.getApStats({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 *     mac: "5c5b35000000",
 *     siteId: "4a422ae5-7ca0-4599-87a3-8e49aa63685f",
 *     status: "connected",
 *     duration: "1d",
 *     start: 1736031600,
 *     end: 1736175934,
 * });
 * ```
 */
export function getApStats(args: GetApStatsArgs, opts?: pulumi.InvokeOptions): Promise<GetApStatsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:device/getApStats:getApStats", {
        "duration": args.duration,
        "end": args.end,
        "mac": args.mac,
        "orgId": args.orgId,
        "siteId": args.siteId,
        "start": args.start,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getApStats.
 */
export interface GetApStatsArgs {
    duration?: string;
    end?: number;
    mac?: string;
    orgId: string;
    siteId?: string;
    start?: number;
    status?: string;
}

/**
 * A collection of values returned by getApStats.
 */
export interface GetApStatsResult {
    readonly deviceApStats: outputs.device.GetApStatsDeviceApStat[];
    readonly duration?: string;
    readonly end?: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly mac?: string;
    readonly orgId: string;
    readonly siteId?: string;
    readonly start?: number;
    readonly status?: string;
}
/**
 * This data source provides the list of Wireless Access Points with their statistics.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const apStats = junipermist.device.getApStats({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 *     mac: "5c5b35000000",
 *     siteId: "4a422ae5-7ca0-4599-87a3-8e49aa63685f",
 *     status: "connected",
 *     duration: "1d",
 *     start: 1736031600,
 *     end: 1736175934,
 * });
 * ```
 */
export function getApStatsOutput(args: GetApStatsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetApStatsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("junipermist:device/getApStats:getApStats", {
        "duration": args.duration,
        "end": args.end,
        "mac": args.mac,
        "orgId": args.orgId,
        "siteId": args.siteId,
        "start": args.start,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getApStats.
 */
export interface GetApStatsOutputArgs {
    duration?: pulumi.Input<string>;
    end?: pulumi.Input<number>;
    mac?: pulumi.Input<string>;
    orgId: pulumi.Input<string>;
    siteId?: pulumi.Input<string>;
    start?: pulumi.Input<number>;
    status?: pulumi.Input<string>;
}
