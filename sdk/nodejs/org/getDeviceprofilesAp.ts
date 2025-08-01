// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the list of AP Device Profiles.
 *
 * AP Device profiles are used to specify a configuration that can be applied to a select set of aps from any site in the organization. They are providing efficient application of configurations based on ap groups, wlan groups, RF settings, and sites. Device profiles enable various use cases such as activating ethernet passthrough, applying different rf settings, applying mesh configuration, activating specific features like esl or vble, and more.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const deviceprofile = junipermist.org.getDeviceprofilesAp({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getDeviceprofilesAp(args: GetDeviceprofilesApArgs, opts?: pulumi.InvokeOptions): Promise<GetDeviceprofilesApResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:org/getDeviceprofilesAp:getDeviceprofilesAp", {
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getDeviceprofilesAp.
 */
export interface GetDeviceprofilesApArgs {
    orgId: string;
}

/**
 * A collection of values returned by getDeviceprofilesAp.
 */
export interface GetDeviceprofilesApResult {
    readonly deviceprofiles: outputs.org.GetDeviceprofilesApDeviceprofile[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly orgId: string;
}
/**
 * This data source provides the list of AP Device Profiles.
 *
 * AP Device profiles are used to specify a configuration that can be applied to a select set of aps from any site in the organization. They are providing efficient application of configurations based on ap groups, wlan groups, RF settings, and sites. Device profiles enable various use cases such as activating ethernet passthrough, applying different rf settings, applying mesh configuration, activating specific features like esl or vble, and more.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const deviceprofile = junipermist.org.getDeviceprofilesAp({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getDeviceprofilesApOutput(args: GetDeviceprofilesApOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetDeviceprofilesApResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("junipermist:org/getDeviceprofilesAp:getDeviceprofilesAp", {
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getDeviceprofilesAp.
 */
export interface GetDeviceprofilesApOutputArgs {
    orgId: pulumi.Input<string>;
}
