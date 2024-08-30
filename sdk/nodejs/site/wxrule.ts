// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This resource manages the Site WxRules (WLAN policies).A WxLAN policy is a set of rules and settings that can be applied to devices in a network to determine how they are treated. it provides support for access policies, network segmentation, role-based policies, micro-segmentation, and least privilege. WxLAN policies are used to allow or deny specific users from accessing specific resources in a wireless network.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const wxruleOne = new junipermist.site.Wxrule("wxrule_one", {
 *     siteId: terraformTest.id,
 *     srcWxtags: [wxtagOne.id],
 *     enabled: true,
 *     action: "allow",
 *     dstDenyWxtags: [wxtagTwo.id],
 *     order: 1,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `mist_site_wxrule` with:
 *
 * Site WxRule can be imported by specifying the site_id and the wxrule_id
 *
 * ```sh
 * $ pulumi import junipermist:site/wxrule:Wxrule wxrule_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 */
export class Wxrule extends pulumi.CustomResource {
    /**
     * Get an existing Wxrule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WxruleState, opts?: pulumi.CustomResourceOptions): Wxrule {
        return new Wxrule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:site/wxrule:Wxrule';

    /**
     * Returns true if the given object is an instance of Wxrule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Wxrule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Wxrule.__pulumiType;
    }

    /**
     * type of action, allow / block. enum: `allow`, `block`
     */
    public readonly action!: pulumi.Output<string>;
    public readonly applyTags!: pulumi.Output<string[] | undefined>;
    /**
     * blocked apps (always blocking, ignoring action), the key of Get Application List
     */
    public readonly blockedApps!: pulumi.Output<string[] | undefined>;
    /**
     * tag list to indicate these tags are allowed access
     */
    public readonly dstAllowWxtags!: pulumi.Output<string[] | undefined>;
    /**
     * tag list to indicate these tags are blocked access
     */
    public readonly dstDenyWxtags!: pulumi.Output<string[] | undefined>;
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * the order how rules would be looked up, > 0 and bigger order got matched first, -1 means LAST, uniqueness not checked
     */
    public readonly order!: pulumi.Output<number>;
    public /*out*/ readonly orgId!: pulumi.Output<string>;
    public readonly siteId!: pulumi.Output<string>;
    /**
     * tag list to determine if this rule would match
     */
    public readonly srcWxtags!: pulumi.Output<string[]>;
    /**
     * Only for Org Level WxRule
     */
    public readonly templateId!: pulumi.Output<string | undefined>;

    /**
     * Create a Wxrule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WxruleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WxruleArgs | WxruleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WxruleState | undefined;
            resourceInputs["action"] = state ? state.action : undefined;
            resourceInputs["applyTags"] = state ? state.applyTags : undefined;
            resourceInputs["blockedApps"] = state ? state.blockedApps : undefined;
            resourceInputs["dstAllowWxtags"] = state ? state.dstAllowWxtags : undefined;
            resourceInputs["dstDenyWxtags"] = state ? state.dstDenyWxtags : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["order"] = state ? state.order : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["siteId"] = state ? state.siteId : undefined;
            resourceInputs["srcWxtags"] = state ? state.srcWxtags : undefined;
            resourceInputs["templateId"] = state ? state.templateId : undefined;
        } else {
            const args = argsOrState as WxruleArgs | undefined;
            if ((!args || args.action === undefined) && !opts.urn) {
                throw new Error("Missing required property 'action'");
            }
            if ((!args || args.order === undefined) && !opts.urn) {
                throw new Error("Missing required property 'order'");
            }
            if ((!args || args.siteId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'siteId'");
            }
            if ((!args || args.srcWxtags === undefined) && !opts.urn) {
                throw new Error("Missing required property 'srcWxtags'");
            }
            resourceInputs["action"] = args ? args.action : undefined;
            resourceInputs["applyTags"] = args ? args.applyTags : undefined;
            resourceInputs["blockedApps"] = args ? args.blockedApps : undefined;
            resourceInputs["dstAllowWxtags"] = args ? args.dstAllowWxtags : undefined;
            resourceInputs["dstDenyWxtags"] = args ? args.dstDenyWxtags : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["order"] = args ? args.order : undefined;
            resourceInputs["siteId"] = args ? args.siteId : undefined;
            resourceInputs["srcWxtags"] = args ? args.srcWxtags : undefined;
            resourceInputs["templateId"] = args ? args.templateId : undefined;
            resourceInputs["orgId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Wxrule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Wxrule resources.
 */
export interface WxruleState {
    /**
     * type of action, allow / block. enum: `allow`, `block`
     */
    action?: pulumi.Input<string>;
    applyTags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * blocked apps (always blocking, ignoring action), the key of Get Application List
     */
    blockedApps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * tag list to indicate these tags are allowed access
     */
    dstAllowWxtags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * tag list to indicate these tags are blocked access
     */
    dstDenyWxtags?: pulumi.Input<pulumi.Input<string>[]>;
    enabled?: pulumi.Input<boolean>;
    /**
     * the order how rules would be looked up, > 0 and bigger order got matched first, -1 means LAST, uniqueness not checked
     */
    order?: pulumi.Input<number>;
    orgId?: pulumi.Input<string>;
    siteId?: pulumi.Input<string>;
    /**
     * tag list to determine if this rule would match
     */
    srcWxtags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Only for Org Level WxRule
     */
    templateId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Wxrule resource.
 */
export interface WxruleArgs {
    /**
     * type of action, allow / block. enum: `allow`, `block`
     */
    action: pulumi.Input<string>;
    applyTags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * blocked apps (always blocking, ignoring action), the key of Get Application List
     */
    blockedApps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * tag list to indicate these tags are allowed access
     */
    dstAllowWxtags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * tag list to indicate these tags are blocked access
     */
    dstDenyWxtags?: pulumi.Input<pulumi.Input<string>[]>;
    enabled?: pulumi.Input<boolean>;
    /**
     * the order how rules would be looked up, > 0 and bigger order got matched first, -1 means LAST, uniqueness not checked
     */
    order: pulumi.Input<number>;
    siteId: pulumi.Input<string>;
    /**
     * tag list to determine if this rule would match
     */
    srcWxtags: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Only for Org Level WxRule
     */
    templateId?: pulumi.Input<string>;
}
