// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This resource manages the NAC Rules (Auth Policies).
 *
 * A NAC Rule defines a list of criteria (NAC Tag) the network client must match to execute the Rule, an action (Allow/Deny)and a list of RADIUS Attributes (NAC Tags) to return
 *
 * ## Import
 *
 * Using `pulumi import`, import `mist_org_nacrule` with:
 *
 * NAC Rule can be imported by specifying the org_id and the nacrule_id
 *
 * ```sh
 * $ pulumi import junipermist:org/nacrule:Nacrule nacrule_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 */
export class Nacrule extends pulumi.CustomResource {
    /**
     * Get an existing Nacrule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NacruleState, opts?: pulumi.CustomResourceOptions): Nacrule {
        return new Nacrule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:org/nacrule:Nacrule';

    /**
     * Returns true if the given object is an instance of Nacrule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Nacrule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Nacrule.__pulumiType;
    }

    /**
     * enum: `allow`, `block`
     */
    public readonly action!: pulumi.Output<string>;
    /**
     * All optional, this goes into Access-Accept
     */
    public readonly applyTags!: pulumi.Output<string[]>;
    /**
     * Enabled or not
     */
    public readonly enabled!: pulumi.Output<boolean>;
    public readonly matching!: pulumi.Output<outputs.org.NacruleMatching | undefined>;
    public readonly name!: pulumi.Output<string>;
    public readonly notMatching!: pulumi.Output<outputs.org.NacruleNotMatching | undefined>;
    /**
     * Order of the rule, lower value implies higher priority
     */
    public readonly order!: pulumi.Output<number>;
    public readonly orgId!: pulumi.Output<string>;

    /**
     * Create a Nacrule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NacruleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NacruleArgs | NacruleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NacruleState | undefined;
            resourceInputs["action"] = state ? state.action : undefined;
            resourceInputs["applyTags"] = state ? state.applyTags : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["matching"] = state ? state.matching : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["notMatching"] = state ? state.notMatching : undefined;
            resourceInputs["order"] = state ? state.order : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
        } else {
            const args = argsOrState as NacruleArgs | undefined;
            if ((!args || args.action === undefined) && !opts.urn) {
                throw new Error("Missing required property 'action'");
            }
            if ((!args || args.order === undefined) && !opts.urn) {
                throw new Error("Missing required property 'order'");
            }
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            resourceInputs["action"] = args ? args.action : undefined;
            resourceInputs["applyTags"] = args ? args.applyTags : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["matching"] = args ? args.matching : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["notMatching"] = args ? args.notMatching : undefined;
            resourceInputs["order"] = args ? args.order : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Nacrule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Nacrule resources.
 */
export interface NacruleState {
    /**
     * enum: `allow`, `block`
     */
    action?: pulumi.Input<string>;
    /**
     * All optional, this goes into Access-Accept
     */
    applyTags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Enabled or not
     */
    enabled?: pulumi.Input<boolean>;
    matching?: pulumi.Input<inputs.org.NacruleMatching>;
    name?: pulumi.Input<string>;
    notMatching?: pulumi.Input<inputs.org.NacruleNotMatching>;
    /**
     * Order of the rule, lower value implies higher priority
     */
    order?: pulumi.Input<number>;
    orgId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Nacrule resource.
 */
export interface NacruleArgs {
    /**
     * enum: `allow`, `block`
     */
    action: pulumi.Input<string>;
    /**
     * All optional, this goes into Access-Accept
     */
    applyTags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Enabled or not
     */
    enabled?: pulumi.Input<boolean>;
    matching?: pulumi.Input<inputs.org.NacruleMatching>;
    name?: pulumi.Input<string>;
    notMatching?: pulumi.Input<inputs.org.NacruleNotMatching>;
    /**
     * Order of the rule, lower value implies higher priority
     */
    order: pulumi.Input<number>;
    orgId: pulumi.Input<string>;
}
