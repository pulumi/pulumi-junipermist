// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the list of Org Webhooks.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const webhooks = junipermist.org.getWebhooks({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getWebhooks(args: GetWebhooksArgs, opts?: pulumi.InvokeOptions): Promise<GetWebhooksResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:org/getWebhooks:getWebhooks", {
        "limit": args.limit,
        "orgId": args.orgId,
        "page": args.page,
    }, opts);
}

/**
 * A collection of arguments for invoking getWebhooks.
 */
export interface GetWebhooksArgs {
    limit?: number;
    orgId: string;
    page?: number;
}

/**
 * A collection of values returned by getWebhooks.
 */
export interface GetWebhooksResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly limit?: number;
    readonly orgId: string;
    readonly orgWebhooks: outputs.org.GetWebhooksOrgWebhook[];
    readonly page?: number;
}
/**
 * This data source provides the list of Org Webhooks.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const webhooks = junipermist.org.getWebhooks({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getWebhooksOutput(args: GetWebhooksOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetWebhooksResult> {
    return pulumi.output(args).apply((a: any) => getWebhooks(a, opts))
}

/**
 * A collection of arguments for invoking getWebhooks.
 */
export interface GetWebhooksOutputArgs {
    limit?: pulumi.Input<number>;
    orgId: pulumi.Input<string>;
    page?: pulumi.Input<number>;
}