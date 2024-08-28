// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source provides the of ConstAppSubCategories.This information can be used as `appSubcategories` in the `junipermist.org.Service` resource
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const listOfAppSubCategories = junipermist.getConstAppSubCategories({});
 * ```
 */
export function getConstAppSubCategories(opts?: pulumi.InvokeOptions): Promise<GetConstAppSubCategoriesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:index/getConstAppSubCategories:getConstAppSubCategories", {
    }, opts);
}

/**
 * A collection of values returned by getConstAppSubCategories.
 */
export interface GetConstAppSubCategoriesResult {
    readonly constAppSubCategories: outputs.GetConstAppSubCategoriesConstAppSubCategory[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
/**
 * This data source provides the of ConstAppSubCategories.This information can be used as `appSubcategories` in the `junipermist.org.Service` resource
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const listOfAppSubCategories = junipermist.getConstAppSubCategories({});
 * ```
 */
export function getConstAppSubCategoriesOutput(opts?: pulumi.InvokeOptions): pulumi.Output<GetConstAppSubCategoriesResult> {
    return pulumi.output(getConstAppSubCategories(opts))
}