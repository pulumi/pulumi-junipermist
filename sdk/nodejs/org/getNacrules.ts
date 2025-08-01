// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the list of NAC Rules (Auth Policies).
 *
 * A NAC Rule defines a list of criteria (NAC Tag) the network client must match to execute the Rule, an action (Allow/Deny)and a list of RADIUS Attributes (NAC Tags) to return
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const nacrules = junipermist.org.getNacrules({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getNacrules(args: GetNacrulesArgs, opts?: pulumi.InvokeOptions): Promise<GetNacrulesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:org/getNacrules:getNacrules", {
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getNacrules.
 */
export interface GetNacrulesArgs {
    orgId: string;
}

/**
 * A collection of values returned by getNacrules.
 */
export interface GetNacrulesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly orgId: string;
    readonly orgNacrules: outputs.org.GetNacrulesOrgNacrule[];
}
/**
 * This data source provides the list of NAC Rules (Auth Policies).
 *
 * A NAC Rule defines a list of criteria (NAC Tag) the network client must match to execute the Rule, an action (Allow/Deny)and a list of RADIUS Attributes (NAC Tags) to return
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const nacrules = junipermist.org.getNacrules({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getNacrulesOutput(args: GetNacrulesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetNacrulesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("junipermist:org/getNacrules:getNacrules", {
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getNacrules.
 */
export interface GetNacrulesOutputArgs {
    orgId: pulumi.Input<string>;
}
