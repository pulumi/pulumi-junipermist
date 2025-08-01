// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This provides the list of Gateway Device Profiles (Hub Profile).
 *
 * A HUB profile is a configuration profile that automates the creation of overlay networks and defines the attributes of a hub device in a network. It includes settings for wan interfaces, lan interfaces, dns servers, traffic steering preferences, application policies, and routing options.
 *
 * HUB profiles are used to create consistent configurations for hub devices and ensure efficient connectivity between hubs and spokes in a network.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const deviceprofile = junipermist.org.getDeviceprofilesGateway({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getDeviceprofilesGateway(args: GetDeviceprofilesGatewayArgs, opts?: pulumi.InvokeOptions): Promise<GetDeviceprofilesGatewayResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:org/getDeviceprofilesGateway:getDeviceprofilesGateway", {
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getDeviceprofilesGateway.
 */
export interface GetDeviceprofilesGatewayArgs {
    orgId: string;
}

/**
 * A collection of values returned by getDeviceprofilesGateway.
 */
export interface GetDeviceprofilesGatewayResult {
    readonly deviceprofiles: outputs.org.GetDeviceprofilesGatewayDeviceprofile[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly orgId: string;
}
/**
 * This provides the list of Gateway Device Profiles (Hub Profile).
 *
 * A HUB profile is a configuration profile that automates the creation of overlay networks and defines the attributes of a hub device in a network. It includes settings for wan interfaces, lan interfaces, dns servers, traffic steering preferences, application policies, and routing options.
 *
 * HUB profiles are used to create consistent configurations for hub devices and ensure efficient connectivity between hubs and spokes in a network.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const deviceprofile = junipermist.org.getDeviceprofilesGateway({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getDeviceprofilesGatewayOutput(args: GetDeviceprofilesGatewayOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetDeviceprofilesGatewayResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("junipermist:org/getDeviceprofilesGateway:getDeviceprofilesGateway", {
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getDeviceprofilesGateway.
 */
export interface GetDeviceprofilesGatewayOutputArgs {
    orgId: pulumi.Input<string>;
}
