// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the list of Gateway Templates.
 *
 * A Gateway template can be used to define generic gateway configuration at the org level and be applied to one or multiple Sites. It works like a blueprint of the network of the site.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const templates = junipermist.org.getGatewaytemplates({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getGatewaytemplates(args: GetGatewaytemplatesArgs, opts?: pulumi.InvokeOptions): Promise<GetGatewaytemplatesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:org/getGatewaytemplates:getGatewaytemplates", {
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getGatewaytemplates.
 */
export interface GetGatewaytemplatesArgs {
    orgId: string;
}

/**
 * A collection of values returned by getGatewaytemplates.
 */
export interface GetGatewaytemplatesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly orgGatewaytemplates: outputs.org.GetGatewaytemplatesOrgGatewaytemplate[];
    readonly orgId: string;
}
/**
 * This data source provides the list of Gateway Templates.
 *
 * A Gateway template can be used to define generic gateway configuration at the org level and be applied to one or multiple Sites. It works like a blueprint of the network of the site.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const templates = junipermist.org.getGatewaytemplates({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getGatewaytemplatesOutput(args: GetGatewaytemplatesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetGatewaytemplatesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("junipermist:org/getGatewaytemplates:getGatewaytemplates", {
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getGatewaytemplates.
 */
export interface GetGatewaytemplatesOutputArgs {
    orgId: pulumi.Input<string>;
}
