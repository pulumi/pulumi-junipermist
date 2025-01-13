// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the list of Site Psks.
 *
 * A multi PSK (Pre-Shared Key) is a feature that allows the use of multiple PSKs for securing network connections.\
 * It provides a simple and comprehensive way to onboard client devices without relying on client mac addresses.\
 * Each psk has its own key name, which can be used for user-level accountability, key rotation, and visibility in the management platform. It supports the creation, rotation, and auto-expiration of psks, and allows vlan assignment and role assignment for dynamic per-user policies.\
 * Multi PSKs create virtual broadcast domains and can be used for end-user onboarding via authenticated sso login.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const psksVip = junipermist.site.getPsks({
 *     siteId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 *     name: "psk_one",
 *     role: "vip",
 *     ssid: "psk_ssid",
 * });
 * ```
 */
export function getPsks(args: GetPsksArgs, opts?: pulumi.InvokeOptions): Promise<GetPsksResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:site/getPsks:getPsks", {
        "name": args.name,
        "role": args.role,
        "siteId": args.siteId,
        "ssid": args.ssid,
    }, opts);
}

/**
 * A collection of arguments for invoking getPsks.
 */
export interface GetPsksArgs {
    name?: string;
    role?: string;
    siteId: string;
    ssid?: string;
}

/**
 * A collection of values returned by getPsks.
 */
export interface GetPsksResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name?: string;
    readonly role?: string;
    readonly siteId: string;
    readonly sitePsks: outputs.site.GetPsksSitePsk[];
    readonly ssid?: string;
}
/**
 * This data source provides the list of Site Psks.
 *
 * A multi PSK (Pre-Shared Key) is a feature that allows the use of multiple PSKs for securing network connections.\
 * It provides a simple and comprehensive way to onboard client devices without relying on client mac addresses.\
 * Each psk has its own key name, which can be used for user-level accountability, key rotation, and visibility in the management platform. It supports the creation, rotation, and auto-expiration of psks, and allows vlan assignment and role assignment for dynamic per-user policies.\
 * Multi PSKs create virtual broadcast domains and can be used for end-user onboarding via authenticated sso login.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const psksVip = junipermist.site.getPsks({
 *     siteId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 *     name: "psk_one",
 *     role: "vip",
 *     ssid: "psk_ssid",
 * });
 * ```
 */
export function getPsksOutput(args: GetPsksOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetPsksResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("junipermist:site/getPsks:getPsks", {
        "name": args.name,
        "role": args.role,
        "siteId": args.siteId,
        "ssid": args.ssid,
    }, opts);
}

/**
 * A collection of arguments for invoking getPsks.
 */
export interface GetPsksOutputArgs {
    name?: pulumi.Input<string>;
    role?: pulumi.Input<string>;
    siteId: pulumi.Input<string>;
    ssid?: pulumi.Input<string>;
}
