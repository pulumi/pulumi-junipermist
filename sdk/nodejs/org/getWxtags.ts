// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This resource provides the list of Org WxLan tags (labels).
 * A WxTag is a label or tag used in the mist system to classify and categorize applications, users, and resources for the purpose of creating policies and making network management decisions.They can be used   * within the WxRules to create filtering rules, or assign specific VLAN  * in the WLANs configuration to assign a WLAN to specific APs  * to identify unknown application used by Wi-Fi clients
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const switchStats = junipermist.device.getSwitchStats({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getWxtags(args: GetWxtagsArgs, opts?: pulumi.InvokeOptions): Promise<GetWxtagsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:org/getWxtags:getWxtags", {
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getWxtags.
 */
export interface GetWxtagsArgs {
    orgId: string;
}

/**
 * A collection of values returned by getWxtags.
 */
export interface GetWxtagsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly orgId: string;
    readonly orgWxtags: outputs.org.GetWxtagsOrgWxtag[];
}
/**
 * This resource provides the list of Org WxLan tags (labels).
 * A WxTag is a label or tag used in the mist system to classify and categorize applications, users, and resources for the purpose of creating policies and making network management decisions.They can be used   * within the WxRules to create filtering rules, or assign specific VLAN  * in the WLANs configuration to assign a WLAN to specific APs  * to identify unknown application used by Wi-Fi clients
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const switchStats = junipermist.device.getSwitchStats({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getWxtagsOutput(args: GetWxtagsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetWxtagsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("junipermist:org/getWxtags:getWxtags", {
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getWxtags.
 */
export interface GetWxtagsOutputArgs {
    orgId: pulumi.Input<string>;
}
