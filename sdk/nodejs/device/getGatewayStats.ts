// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the list of Gateways with their statistics.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const gatewayStats = junipermist.device.getGatewayStats({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getGatewayStats(args: GetGatewayStatsArgs, opts?: pulumi.InvokeOptions): Promise<GetGatewayStatsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:device/getGatewayStats:getGatewayStats", {
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
 * A collection of arguments for invoking getGatewayStats.
 */
export interface GetGatewayStatsArgs {
    /**
     * duration like 7d, 2w
     */
    duration?: string;
    /**
     * end datetime, can be epoch or relative time like -1d, -2h; now if not specified
     */
    end?: number;
    mac?: string;
    orgId: string;
    siteId?: string;
    /**
     * start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
     */
    start?: number;
    status?: string;
}

/**
 * A collection of values returned by getGatewayStats.
 */
export interface GetGatewayStatsResult {
    readonly deviceGatewayStats: outputs.device.GetGatewayStatsDeviceGatewayStat[];
    /**
     * duration like 7d, 2w
     */
    readonly duration?: string;
    /**
     * end datetime, can be epoch or relative time like -1d, -2h; now if not specified
     */
    readonly end?: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly mac?: string;
    readonly orgId: string;
    readonly siteId?: string;
    /**
     * start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
     */
    readonly start?: number;
    readonly status?: string;
}
/**
 * This data source provides the list of Gateways with their statistics.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const gatewayStats = junipermist.device.getGatewayStats({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getGatewayStatsOutput(args: GetGatewayStatsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGatewayStatsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("junipermist:device/getGatewayStats:getGatewayStats", {
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
 * A collection of arguments for invoking getGatewayStats.
 */
export interface GetGatewayStatsOutputArgs {
    /**
     * duration like 7d, 2w
     */
    duration?: pulumi.Input<string>;
    /**
     * end datetime, can be epoch or relative time like -1d, -2h; now if not specified
     */
    end?: pulumi.Input<number>;
    mac?: pulumi.Input<string>;
    orgId: pulumi.Input<string>;
    siteId?: pulumi.Input<string>;
    /**
     * start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
     */
    start?: pulumi.Input<number>;
    status?: pulumi.Input<string>;
}
