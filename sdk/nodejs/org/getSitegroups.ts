// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the list of Org Site Groups (sitegroups).A site group is a feature that allows users to group multiple sites together based on regions, functions, or other parameters for efficient management of devices. Sites can exist in multiple groups simultaneously, and site groups can be used to ensure consistent settings, manage administrator access, and apply specific templates to groups of sites.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const sitegroups = junipermist.org.getSitegroups({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getSitegroups(args: GetSitegroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetSitegroupsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:org/getSitegroups:getSitegroups", {
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSitegroups.
 */
export interface GetSitegroupsArgs {
    orgId: string;
}

/**
 * A collection of values returned by getSitegroups.
 */
export interface GetSitegroupsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly orgId: string;
    readonly orgSitegroups: outputs.org.GetSitegroupsOrgSitegroup[];
}
/**
 * This data source provides the list of Org Site Groups (sitegroups).A site group is a feature that allows users to group multiple sites together based on regions, functions, or other parameters for efficient management of devices. Sites can exist in multiple groups simultaneously, and site groups can be used to ensure consistent settings, manage administrator access, and apply specific templates to groups of sites.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const sitegroups = junipermist.org.getSitegroups({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getSitegroupsOutput(args: GetSitegroupsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSitegroupsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("junipermist:org/getSitegroups:getSitegroups", {
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSitegroups.
 */
export interface GetSitegroupsOutputArgs {
    orgId: pulumi.Input<string>;
}
