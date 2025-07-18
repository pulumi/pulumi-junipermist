// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This resource manages the Org VPN.
 *
 * ## Import
 *
 * Using `pulumi import`, import `mist_org_vpn` with:
 *
 * Org VPN can be imported by specifying the org_id and the vpn_id
 *
 * ```sh
 * $ pulumi import junipermist:org/vpn:Vpn vpn_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 */
export class Vpn extends pulumi.CustomResource {
    /**
     * Get an existing Vpn resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VpnState, opts?: pulumi.CustomResourceOptions): Vpn {
        return new Vpn(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:org/vpn:Vpn';

    /**
     * Returns true if the given object is an instance of Vpn.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Vpn {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Vpn.__pulumiType;
    }

    public readonly name!: pulumi.Output<string>;
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Only if `type`==`hubSpoke`
     */
    public readonly pathSelection!: pulumi.Output<outputs.org.VpnPathSelection | undefined>;
    /**
     * For `type`==`hubSpoke`, Property key is the VPN name. For `type`==`mesh`, Property key is the Interface name
     */
    public readonly paths!: pulumi.Output<{[key: string]: outputs.org.VpnPaths}>;
    /**
     * enum: `hubSpoke`, `mesh`
     */
    public readonly type!: pulumi.Output<string | undefined>;

    /**
     * Create a Vpn resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VpnArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VpnArgs | VpnState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VpnState | undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["pathSelection"] = state ? state.pathSelection : undefined;
            resourceInputs["paths"] = state ? state.paths : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as VpnArgs | undefined;
            if ((!args || args.paths === undefined) && !opts.urn) {
                throw new Error("Missing required property 'paths'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["pathSelection"] = args ? args.pathSelection : undefined;
            resourceInputs["paths"] = args ? args.paths : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Vpn.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Vpn resources.
 */
export interface VpnState {
    name?: pulumi.Input<string>;
    orgId?: pulumi.Input<string>;
    /**
     * Only if `type`==`hubSpoke`
     */
    pathSelection?: pulumi.Input<inputs.org.VpnPathSelection>;
    /**
     * For `type`==`hubSpoke`, Property key is the VPN name. For `type`==`mesh`, Property key is the Interface name
     */
    paths?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.VpnPaths>}>;
    /**
     * enum: `hubSpoke`, `mesh`
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Vpn resource.
 */
export interface VpnArgs {
    name?: pulumi.Input<string>;
    orgId?: pulumi.Input<string>;
    /**
     * Only if `type`==`hubSpoke`
     */
    pathSelection?: pulumi.Input<inputs.org.VpnPathSelection>;
    /**
     * For `type`==`hubSpoke`, Property key is the VPN name. For `type`==`mesh`, Property key is the Interface name
     */
    paths: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.VpnPaths>}>;
    /**
     * enum: `hubSpoke`, `mesh`
     */
    type?: pulumi.Input<string>;
}
