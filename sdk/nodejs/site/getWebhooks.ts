// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the list of Site Webhooks.
 *
 * A Site Webhook is a configuration that allows real-time events and data from a specific site to be pushed to a provided url.\
 * It enables the collection of information about various topics such as device events, alarms, audits, client sessions and location updates at the site level.\
 * The Webhook can be set up and customized using the Mist API, allowing users to receive and analyze specific data from a particular site.
 */
export function getWebhooks(args: GetWebhooksArgs, opts?: pulumi.InvokeOptions): Promise<GetWebhooksResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:site/getWebhooks:getWebhooks", {
        "siteId": args.siteId,
    }, opts);
}

/**
 * A collection of arguments for invoking getWebhooks.
 */
export interface GetWebhooksArgs {
    siteId: string;
}

/**
 * A collection of values returned by getWebhooks.
 */
export interface GetWebhooksResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly siteId: string;
    readonly siteWebhooks: outputs.site.GetWebhooksSiteWebhook[];
}
/**
 * This data source provides the list of Site Webhooks.
 *
 * A Site Webhook is a configuration that allows real-time events and data from a specific site to be pushed to a provided url.\
 * It enables the collection of information about various topics such as device events, alarms, audits, client sessions and location updates at the site level.\
 * The Webhook can be set up and customized using the Mist API, allowing users to receive and analyze specific data from a particular site.
 */
export function getWebhooksOutput(args: GetWebhooksOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetWebhooksResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("junipermist:site/getWebhooks:getWebhooks", {
        "siteId": args.siteId,
    }, opts);
}

/**
 * A collection of arguments for invoking getWebhooks.
 */
export interface GetWebhooksOutputArgs {
    siteId: pulumi.Input<string>;
}
