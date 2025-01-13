// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source provides the of ConstTrafficTypes.
 *
 * The Traffic Type values can be used to define the `trafficType` attribute in the `junipermist.org.Service` resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const listOfTrafficTypes = junipermist.getConstTrafficTypes({});
 * ```
 */
export function getConstTrafficTypes(opts?: pulumi.InvokeOptions): Promise<GetConstTrafficTypesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:index/getConstTrafficTypes:getConstTrafficTypes", {
    }, opts);
}

/**
 * A collection of values returned by getConstTrafficTypes.
 */
export interface GetConstTrafficTypesResult {
    readonly constTrafficTypes: outputs.GetConstTrafficTypesConstTrafficType[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
/**
 * This data source provides the of ConstTrafficTypes.
 *
 * The Traffic Type values can be used to define the `trafficType` attribute in the `junipermist.org.Service` resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const listOfTrafficTypes = junipermist.getConstTrafficTypes({});
 * ```
 */
export function getConstTrafficTypesOutput(opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetConstTrafficTypesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("junipermist:index/getConstTrafficTypes:getConstTrafficTypes", {
    }, opts);
}
