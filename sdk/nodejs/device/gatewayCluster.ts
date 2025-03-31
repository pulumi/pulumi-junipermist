// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This resource can be used to form or delete a Gateway Clusters.
 *
 * A Gateway Cluster can be formed with two Gateways assigned to the same site. Once the Cluster is formed, it can be configured just like a Gateway with the `junipermist.device.Gateway` resource:
 * 1. Claim the gateways and assign them to the same site with the `junipermist.org.Inventory` resource
 * 2. Form the Cluster with the `junipermist.device.GatewayCluster` resource by providing the `siteId` and the MAC Addresses of two nodes (the first in the list will be the node0)
 * 3. Configure the Cluster with the `junipermist.device.Gateway` resource
 *
 * Please check the [SRX Juniper Documentation](https://www.juniper.net/documentation/us/en/software/mist/mist-wan/topics/topic-map/srx-high-availability-configuration.html)or the [SSR Juniper Documentation](https://www.juniper.net/documentation/us/en/software/mist/mist-wan/topics/topic-map/ssr-high-availability-configuration.html) first to validate the cabling between the Gateways
 *
 * > Both gateways must belong to the same site when creating the Gateway Cluster
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const clusterOne = new junipermist.device.GatewayCluster("cluster_one", {
 *     siteId: terraformSite2.id,
 *     nodes: [
 *         {
 *             mac: "4c961000000",
 *         },
 *         {
 *             mac: "4c961000001",
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `mist_device_gateway_cluster` with:
 *
 * Gateway cluster can be imported by specifying the org_id and the cluster_id
 *
 * ```sh
 * $ pulumi import junipermist:device/gatewayCluster:GatewayCluster cluster_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 */
export class GatewayCluster extends pulumi.CustomResource {
    /**
     * Get an existing GatewayCluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GatewayClusterState, opts?: pulumi.CustomResourceOptions): GatewayCluster {
        return new GatewayCluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:device/gatewayCluster:GatewayCluster';

    /**
     * Returns true if the given object is an instance of GatewayCluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GatewayCluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GatewayCluster.__pulumiType;
    }

    /**
     * When replacing a node, either mac has to remain the same as existing cluster
     */
    public readonly nodes!: pulumi.Output<outputs.device.GatewayClusterNode[]>;
    public readonly siteId!: pulumi.Output<string>;

    /**
     * Create a GatewayCluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GatewayClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GatewayClusterArgs | GatewayClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GatewayClusterState | undefined;
            resourceInputs["nodes"] = state ? state.nodes : undefined;
            resourceInputs["siteId"] = state ? state.siteId : undefined;
        } else {
            const args = argsOrState as GatewayClusterArgs | undefined;
            if ((!args || args.nodes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nodes'");
            }
            if ((!args || args.siteId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'siteId'");
            }
            resourceInputs["nodes"] = args ? args.nodes : undefined;
            resourceInputs["siteId"] = args ? args.siteId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GatewayCluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GatewayCluster resources.
 */
export interface GatewayClusterState {
    /**
     * When replacing a node, either mac has to remain the same as existing cluster
     */
    nodes?: pulumi.Input<pulumi.Input<inputs.device.GatewayClusterNode>[]>;
    siteId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GatewayCluster resource.
 */
export interface GatewayClusterArgs {
    /**
     * When replacing a node, either mac has to remain the same as existing cluster
     */
    nodes: pulumi.Input<pulumi.Input<inputs.device.GatewayClusterNode>[]>;
    siteId: pulumi.Input<string>;
}
