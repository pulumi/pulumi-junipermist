// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the list of NAC Endpoints (User MACs).
 *
 * NAC Endpoints (User MACs) provide a database of endpoints identified by their MAC addresses. They can be used assign each endpoint with various attributes, such as name, VLAN, role and client label.  Once an endpoint is labeled, the label name can be used to create `junipermist.org.Nactag` resource as match criteria.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const nacEndpoints = junipermist.org.getNacEndpoints({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 *     mac: "4a422a000000",
 *     labels: ["label_one"],
 * });
 * ```
 */
export function getNacEndpoints(args: GetNacEndpointsArgs, opts?: pulumi.InvokeOptions): Promise<GetNacEndpointsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:org/getNacEndpoints:getNacEndpoints", {
        "labels": args.labels,
        "mac": args.mac,
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getNacEndpoints.
 */
export interface GetNacEndpointsArgs {
    /**
     * Optional, array of strings of labels
     */
    labels?: string[];
    /**
     * Partial/full MAC address
     */
    mac?: string;
    orgId: string;
}

/**
 * A collection of values returned by getNacEndpoints.
 */
export interface GetNacEndpointsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Optional, array of strings of labels
     */
    readonly labels?: string[];
    /**
     * Partial/full MAC address
     */
    readonly mac?: string;
    readonly orgId: string;
    readonly orgUsermacs: outputs.org.GetNacEndpointsOrgUsermac[];
}
/**
 * This data source provides the list of NAC Endpoints (User MACs).
 *
 * NAC Endpoints (User MACs) provide a database of endpoints identified by their MAC addresses. They can be used assign each endpoint with various attributes, such as name, VLAN, role and client label.  Once an endpoint is labeled, the label name can be used to create `junipermist.org.Nactag` resource as match criteria.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const nacEndpoints = junipermist.org.getNacEndpoints({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 *     mac: "4a422a000000",
 *     labels: ["label_one"],
 * });
 * ```
 */
export function getNacEndpointsOutput(args: GetNacEndpointsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetNacEndpointsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("junipermist:org/getNacEndpoints:getNacEndpoints", {
        "labels": args.labels,
        "mac": args.mac,
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getNacEndpoints.
 */
export interface GetNacEndpointsOutputArgs {
    /**
     * Optional, array of strings of labels
     */
    labels?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Partial/full MAC address
     */
    mac?: pulumi.Input<string>;
    orgId: pulumi.Input<string>;
}
