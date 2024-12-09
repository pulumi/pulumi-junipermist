// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the list of Org Network Templates (Switch templates).
 * A network template is a predefined configuration that provides a consistent and reusable set of network settings for devices within an organization. It includes various parameters such as ip addressing, vlan configurations, routing protocols, security policies, and other network-specific settings. Network templates simplify the deployment and management of switches by ensuring consistent configurations across multiple devices and sites. They help enforce standardization, reduce human error, and streamline troubleshooting and maintenance tasks.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const templates = junipermist.org.getNetworktemplates({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getNetworktemplates(args: GetNetworktemplatesArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworktemplatesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:org/getNetworktemplates:getNetworktemplates", {
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworktemplates.
 */
export interface GetNetworktemplatesArgs {
    orgId: string;
}

/**
 * A collection of values returned by getNetworktemplates.
 */
export interface GetNetworktemplatesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly orgId: string;
    readonly orgNetworktemplates: outputs.org.GetNetworktemplatesOrgNetworktemplate[];
}
/**
 * This data source provides the list of Org Network Templates (Switch templates).
 * A network template is a predefined configuration that provides a consistent and reusable set of network settings for devices within an organization. It includes various parameters such as ip addressing, vlan configurations, routing protocols, security policies, and other network-specific settings. Network templates simplify the deployment and management of switches by ensuring consistent configurations across multiple devices and sites. They help enforce standardization, reduce human error, and streamline troubleshooting and maintenance tasks.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const templates = junipermist.org.getNetworktemplates({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getNetworktemplatesOutput(args: GetNetworktemplatesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetNetworktemplatesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("junipermist:org/getNetworktemplates:getNetworktemplates", {
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworktemplates.
 */
export interface GetNetworktemplatesOutputArgs {
    orgId: pulumi.Input<string>;
}
