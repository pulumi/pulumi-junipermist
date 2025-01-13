// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source provides the list of Webhook Topics.
 *
 * This information can be used to configure webhooks at the Org level (`junipermist.org.Webhook` resource) or at the Site level (`junipermist.site.Webhook` resource).
 *
 * > Only the Webhook topics with `forOrg`==`  true ` are supported at the Org level.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const listOfWebhooks = junipermist.getConstWebhooks({});
 * ```
 */
export function getConstWebhooks(opts?: pulumi.InvokeOptions): Promise<GetConstWebhooksResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:index/getConstWebhooks:getConstWebhooks", {
    }, opts);
}

/**
 * A collection of values returned by getConstWebhooks.
 */
export interface GetConstWebhooksResult {
    readonly constWebhooks: outputs.GetConstWebhooksConstWebhook[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
/**
 * This data source provides the list of Webhook Topics.
 *
 * This information can be used to configure webhooks at the Org level (`junipermist.org.Webhook` resource) or at the Site level (`junipermist.site.Webhook` resource).
 *
 * > Only the Webhook topics with `forOrg`==`  true ` are supported at the Org level.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const listOfWebhooks = junipermist.getConstWebhooks({});
 * ```
 */
export function getConstWebhooksOutput(opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetConstWebhooksResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("junipermist:index/getConstWebhooks:getConstWebhooks", {
    }, opts);
}
