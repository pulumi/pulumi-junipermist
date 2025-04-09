// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the list of Switches with their statistics.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const switchStats = junipermist.device.getSwitchStats({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 *     mac: "485a0d000000",
 *     siteId: "4a422ae5-7ca0-4599-87a3-8e49aa63685f",
 *     status: "connected",
 *     evpnUnused: "true",
 *     evpntopoId: "92984e2f-94db-4cd8-9763-9cf83fbd079e",
 *     duration: "1d",
 *     start: 1736031600,
 *     end: 1736175934,
 * });
 * ```
 */
export function getSwitchStats(args: GetSwitchStatsArgs, opts?: pulumi.InvokeOptions): Promise<GetSwitchStatsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:device/getSwitchStats:getSwitchStats", {
        "duration": args.duration,
        "end": args.end,
        "evpnUnused": args.evpnUnused,
        "evpntopoId": args.evpntopoId,
        "mac": args.mac,
        "orgId": args.orgId,
        "siteId": args.siteId,
        "start": args.start,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getSwitchStats.
 */
export interface GetSwitchStatsArgs {
    /**
     * Duration like 7d, 2w
     */
    duration?: string;
    /**
     * End datetime, can be epoch or relative time like -1d, -2h; now if not specified
     */
    end?: number;
    /**
     * If `evpnUnused`==`true`, find EVPN eligible switches which don’t belong to any EVPN Topology yet
     */
    evpnUnused?: string;
    /**
     * EVPN Topology ID
     */
    evpntopoId?: string;
    mac?: string;
    orgId: string;
    siteId?: string;
    /**
     * Start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
     */
    start?: number;
    /**
     * enum: `all`, `connected`, `disconnected`
     */
    status?: string;
}

/**
 * A collection of values returned by getSwitchStats.
 */
export interface GetSwitchStatsResult {
    readonly deviceSwitchStats: outputs.device.GetSwitchStatsDeviceSwitchStat[];
    /**
     * Duration like 7d, 2w
     */
    readonly duration?: string;
    /**
     * End datetime, can be epoch or relative time like -1d, -2h; now if not specified
     */
    readonly end?: number;
    /**
     * If `evpnUnused`==`true`, find EVPN eligible switches which don’t belong to any EVPN Topology yet
     */
    readonly evpnUnused?: string;
    /**
     * EVPN Topology ID
     */
    readonly evpntopoId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly mac?: string;
    readonly orgId: string;
    readonly siteId?: string;
    /**
     * Start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
     */
    readonly start?: number;
    /**
     * enum: `all`, `connected`, `disconnected`
     */
    readonly status?: string;
}
/**
 * This data source provides the list of Switches with their statistics.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const switchStats = junipermist.device.getSwitchStats({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 *     mac: "485a0d000000",
 *     siteId: "4a422ae5-7ca0-4599-87a3-8e49aa63685f",
 *     status: "connected",
 *     evpnUnused: "true",
 *     evpntopoId: "92984e2f-94db-4cd8-9763-9cf83fbd079e",
 *     duration: "1d",
 *     start: 1736031600,
 *     end: 1736175934,
 * });
 * ```
 */
export function getSwitchStatsOutput(args: GetSwitchStatsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSwitchStatsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("junipermist:device/getSwitchStats:getSwitchStats", {
        "duration": args.duration,
        "end": args.end,
        "evpnUnused": args.evpnUnused,
        "evpntopoId": args.evpntopoId,
        "mac": args.mac,
        "orgId": args.orgId,
        "siteId": args.siteId,
        "start": args.start,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getSwitchStats.
 */
export interface GetSwitchStatsOutputArgs {
    /**
     * Duration like 7d, 2w
     */
    duration?: pulumi.Input<string>;
    /**
     * End datetime, can be epoch or relative time like -1d, -2h; now if not specified
     */
    end?: pulumi.Input<number>;
    /**
     * If `evpnUnused`==`true`, find EVPN eligible switches which don’t belong to any EVPN Topology yet
     */
    evpnUnused?: pulumi.Input<string>;
    /**
     * EVPN Topology ID
     */
    evpntopoId?: pulumi.Input<string>;
    mac?: pulumi.Input<string>;
    orgId: pulumi.Input<string>;
    siteId?: pulumi.Input<string>;
    /**
     * Start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
     */
    start?: pulumi.Input<number>;
    /**
     * enum: `all`, `connected`, `disconnected`
     */
    status?: pulumi.Input<string>;
}
