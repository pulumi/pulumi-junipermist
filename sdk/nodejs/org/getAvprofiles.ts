// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the list of WAN Assurance Antivirus Profiles.
 *
 * An Antivirus Profile is used to configure the Antivirus feature on SRX devices. It specifies which content the Antivirus should analyse and which content should be ignored.
 *
 * The Antivirus profiles can be used within the following resources:
 *  * `mist_org_servicepolicy.antivirus`
 *  * `mist_org_gatewaytemplate.service_policies.antivirus`
 *  * `mist_org_deviceprofile_gateway.service_policies.antivirus`
 *  * `mist_device_gateway.service_policies.antivirus`
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const avprofiles = junipermist.org.getAvprofiles({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getAvprofiles(args: GetAvprofilesArgs, opts?: pulumi.InvokeOptions): Promise<GetAvprofilesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:org/getAvprofiles:getAvprofiles", {
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAvprofiles.
 */
export interface GetAvprofilesArgs {
    orgId: string;
}

/**
 * A collection of values returned by getAvprofiles.
 */
export interface GetAvprofilesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly orgAvprofiles: outputs.org.GetAvprofilesOrgAvprofile[];
    readonly orgId: string;
}
/**
 * This data source provides the list of WAN Assurance Antivirus Profiles.
 *
 * An Antivirus Profile is used to configure the Antivirus feature on SRX devices. It specifies which content the Antivirus should analyse and which content should be ignored.
 *
 * The Antivirus profiles can be used within the following resources:
 *  * `mist_org_servicepolicy.antivirus`
 *  * `mist_org_gatewaytemplate.service_policies.antivirus`
 *  * `mist_org_deviceprofile_gateway.service_policies.antivirus`
 *  * `mist_device_gateway.service_policies.antivirus`
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const avprofiles = junipermist.org.getAvprofiles({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getAvprofilesOutput(args: GetAvprofilesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAvprofilesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("junipermist:org/getAvprofiles:getAvprofiles", {
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAvprofiles.
 */
export interface GetAvprofilesOutputArgs {
    orgId: pulumi.Input<string>;
}
