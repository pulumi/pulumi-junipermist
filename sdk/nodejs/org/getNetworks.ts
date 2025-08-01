// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the list of WAN Assurance Networks.
 *
 * The Networks are used in the `servicePolicies` from the Gateway configuration, Gateway templates or HUB Profiles
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const networks = junipermist.org.getNetworks({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getNetworks(args: GetNetworksArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworksResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:org/getNetworks:getNetworks", {
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworks.
 */
export interface GetNetworksArgs {
    orgId: string;
}

/**
 * A collection of values returned by getNetworks.
 */
export interface GetNetworksResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly orgId: string;
    readonly orgNetworks: outputs.org.GetNetworksOrgNetwork[];
}
/**
 * This data source provides the list of WAN Assurance Networks.
 *
 * The Networks are used in the `servicePolicies` from the Gateway configuration, Gateway templates or HUB Profiles
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const networks = junipermist.org.getNetworks({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getNetworksOutput(args: GetNetworksOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetNetworksResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("junipermist:org/getNetworks:getNetworks", {
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworks.
 */
export interface GetNetworksOutputArgs {
    orgId: pulumi.Input<string>;
}
