// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This resource manages the Mist Organization.
 * An organization usually represents a customer - which has inventories, licenses.An Organization can contain multiple sites. A site usually represents a deployment at the same location (a campus, an office).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const orgOne = new junipermist.org.Base("org_one", {
 *     name: "Org One",
 *     alarmtemplateId: alarmtemplateOne.id,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `mist_org` with:
 *
 * Organization can be imported by specifying the org_id
 *
 * ```sh
 * $ pulumi import junipermist:org/base:base org_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a
 * ```
 */
export class Base extends pulumi.CustomResource {
    /**
     * Get an existing Base resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BaseState, opts?: pulumi.CustomResourceOptions): Base {
        return new Base(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:org/base:base';

    /**
     * Returns true if the given object is an instance of Base.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Base {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Base.__pulumiType;
    }

    public readonly alarmtemplateId!: pulumi.Output<string | undefined>;
    public readonly allowMist!: pulumi.Output<boolean>;
    public /*out*/ readonly mspId!: pulumi.Output<string>;
    /**
     * logo uploaded by the MSP with advanced tier, only present if provided
     */
    public readonly mspLogoUrl!: pulumi.Output<string | undefined>;
    /**
     * name of the msp the org belongs to
     */
    public readonly mspName!: pulumi.Output<string | undefined>;
    public readonly name!: pulumi.Output<string>;
    public /*out*/ readonly orggroupIds!: pulumi.Output<string[]>;
    public readonly sessionExpiry!: pulumi.Output<number>;

    /**
     * Create a Base resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: BaseArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BaseArgs | BaseState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BaseState | undefined;
            resourceInputs["alarmtemplateId"] = state ? state.alarmtemplateId : undefined;
            resourceInputs["allowMist"] = state ? state.allowMist : undefined;
            resourceInputs["mspId"] = state ? state.mspId : undefined;
            resourceInputs["mspLogoUrl"] = state ? state.mspLogoUrl : undefined;
            resourceInputs["mspName"] = state ? state.mspName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orggroupIds"] = state ? state.orggroupIds : undefined;
            resourceInputs["sessionExpiry"] = state ? state.sessionExpiry : undefined;
        } else {
            const args = argsOrState as BaseArgs | undefined;
            resourceInputs["alarmtemplateId"] = args ? args.alarmtemplateId : undefined;
            resourceInputs["allowMist"] = args ? args.allowMist : undefined;
            resourceInputs["mspLogoUrl"] = args ? args.mspLogoUrl : undefined;
            resourceInputs["mspName"] = args ? args.mspName : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["sessionExpiry"] = args ? args.sessionExpiry : undefined;
            resourceInputs["mspId"] = undefined /*out*/;
            resourceInputs["orggroupIds"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Base.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering base resources.
 */
export interface BaseState {
    alarmtemplateId?: pulumi.Input<string>;
    allowMist?: pulumi.Input<boolean>;
    mspId?: pulumi.Input<string>;
    /**
     * logo uploaded by the MSP with advanced tier, only present if provided
     */
    mspLogoUrl?: pulumi.Input<string>;
    /**
     * name of the msp the org belongs to
     */
    mspName?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    orggroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    sessionExpiry?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Base resource.
 */
export interface BaseArgs {
    alarmtemplateId?: pulumi.Input<string>;
    allowMist?: pulumi.Input<boolean>;
    /**
     * logo uploaded by the MSP with advanced tier, only present if provided
     */
    mspLogoUrl?: pulumi.Input<string>;
    /**
     * name of the msp the org belongs to
     */
    mspName?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    sessionExpiry?: pulumi.Input<number>;
}
