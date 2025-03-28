// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This data source provides the SSO Metadata information.
 *
 * The provided information (`entityId`, `acsUrl`, `logoutUrl` and `metadata`) are the informationrequired to configure the IDP
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const ssoIdp = junipermist.org.getSsoMetadata({
 *     orgId: terraformTest.id,
 *     ssoId: ssoOne.id,
 * });
 * ```
 */
export function getSsoMetadata(args: GetSsoMetadataArgs, opts?: pulumi.InvokeOptions): Promise<GetSsoMetadataResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:org/getSsoMetadata:getSsoMetadata", {
        "orgId": args.orgId,
        "ssoId": args.ssoId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSsoMetadata.
 */
export interface GetSsoMetadataArgs {
    orgId: string;
    ssoId: string;
}

/**
 * A collection of values returned by getSsoMetadata.
 */
export interface GetSsoMetadataResult {
    readonly acsUrl: string;
    readonly entityId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly logoutUrl: string;
    readonly metadata: string;
    readonly orgId: string;
    readonly ssoId: string;
}
/**
 * This data source provides the SSO Metadata information.
 *
 * The provided information (`entityId`, `acsUrl`, `logoutUrl` and `metadata`) are the informationrequired to configure the IDP
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const ssoIdp = junipermist.org.getSsoMetadata({
 *     orgId: terraformTest.id,
 *     ssoId: ssoOne.id,
 * });
 * ```
 */
export function getSsoMetadataOutput(args: GetSsoMetadataOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSsoMetadataResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("junipermist:org/getSsoMetadata:getSsoMetadata", {
        "orgId": args.orgId,
        "ssoId": args.ssoId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSsoMetadata.
 */
export interface GetSsoMetadataOutputArgs {
    orgId: pulumi.Input<string>;
    ssoId: pulumi.Input<string>;
}
