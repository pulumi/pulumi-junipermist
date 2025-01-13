// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This resource manages NAC Tags (Auth Policy Labels).
 *
 * The NAC Tags can be used in the NAC Rules to define the matching criterias or the returned RADIUS Attributes
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const tagOne = new junipermist.org.Nactag("tag_one", {
 *     name: "tag_one",
 *     type: "match",
 *     match: "client_mac",
 *     orgId: terraformTest.id,
 *     values: ["5c5b35*"],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `mist_org_nactag` with:
 *
 * NAC Tag can be imported by specifying the org_id and the nactag_id
 *
 * ```sh
 * $ pulumi import junipermist:org/nactag:Nactag nactag_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 */
export class Nactag extends pulumi.CustomResource {
    /**
     * Get an existing Nactag resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NactagState, opts?: pulumi.CustomResourceOptions): Nactag {
        return new Nactag(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:org/nactag:Nactag';

    /**
     * Returns true if the given object is an instance of Nactag.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Nactag {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Nactag.__pulumiType;
    }

    /**
     * can be set to true to allow the override by usermac result
     */
    public readonly allowUsermacOverride!: pulumi.Output<boolean>;
    /**
     * if `type`==`egressVlanNames`, list of egress vlans to return
     */
    public readonly egressVlanNames!: pulumi.Output<string[] | undefined>;
    /**
     * if `type`==`gbpTag`
     */
    public readonly gbpTag!: pulumi.Output<number | undefined>;
    /**
     * if `type`==`match`. enum: `certCn`, `certIssuer`, `certSan`, `certSerial`, `certSub`, `clientMac`, `idpRole`,
     * `mdmStatus`, `radiusGroup`, `realm`, `ssid`, `userName`, `usermacLabel`
     */
    public readonly match!: pulumi.Output<string | undefined>;
    /**
     * This field is applicable only when `type`==`match` * `false`: means it is sufficient to match any of the values (i.e.,
     * match-any behavior) * `true`: means all values should be matched (i.e., match-all behavior) Currently it makes sense to
     * set this field to `true` only if the `match`==`idpRole` or `match`==`usermacLabel`'
     */
    public readonly matchAll!: pulumi.Output<boolean>;
    public readonly name!: pulumi.Output<string>;
    public readonly orgId!: pulumi.Output<string>;
    /**
     * if `type`==`radiusAttrs`, user can specify a list of one or more standard attributes in the field "radiusAttrs". It is
     * the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected. Note
     * that it is allowed to have more than one radiusAttrs in the result of a given rule.
     */
    public readonly radiusAttrs!: pulumi.Output<string[] | undefined>;
    /**
     * if `type`==`radiusGroup`
     */
    public readonly radiusGroup!: pulumi.Output<string | undefined>;
    /**
     * if `type`==`radiusVendorAttrs`, user can specify a list of one or more vendor-specific attributes in the field
     * "radiusVendorAttrs". It is the responsibility of the user to provide a syntactically correct string, otherwise it may
     * not work as expected. Note that it is allowed to have more than one radiusVendorAttrs in the result of a given rule.
     */
    public readonly radiusVendorAttrs!: pulumi.Output<string[] | undefined>;
    /**
     * if `type`==`session_timeout, in seconds
     */
    public readonly sessionTimeout!: pulumi.Output<number | undefined>;
    /**
     * enum: `egressVlanNames`, `gbpTag`, `match`, `radiusAttrs`, `radiusGroup`, `radiusVendorAttrs`, `sessionTimeout`, `vlan`
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * if `type`==`match`
     */
    public readonly values!: pulumi.Output<string[] | undefined>;
    /**
     * if `type`==`vlan`
     */
    public readonly vlan!: pulumi.Output<string | undefined>;

    /**
     * Create a Nactag resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NactagArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NactagArgs | NactagState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NactagState | undefined;
            resourceInputs["allowUsermacOverride"] = state ? state.allowUsermacOverride : undefined;
            resourceInputs["egressVlanNames"] = state ? state.egressVlanNames : undefined;
            resourceInputs["gbpTag"] = state ? state.gbpTag : undefined;
            resourceInputs["match"] = state ? state.match : undefined;
            resourceInputs["matchAll"] = state ? state.matchAll : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["radiusAttrs"] = state ? state.radiusAttrs : undefined;
            resourceInputs["radiusGroup"] = state ? state.radiusGroup : undefined;
            resourceInputs["radiusVendorAttrs"] = state ? state.radiusVendorAttrs : undefined;
            resourceInputs["sessionTimeout"] = state ? state.sessionTimeout : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["values"] = state ? state.values : undefined;
            resourceInputs["vlan"] = state ? state.vlan : undefined;
        } else {
            const args = argsOrState as NactagArgs | undefined;
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["allowUsermacOverride"] = args ? args.allowUsermacOverride : undefined;
            resourceInputs["egressVlanNames"] = args ? args.egressVlanNames : undefined;
            resourceInputs["gbpTag"] = args ? args.gbpTag : undefined;
            resourceInputs["match"] = args ? args.match : undefined;
            resourceInputs["matchAll"] = args ? args.matchAll : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["radiusAttrs"] = args ? args.radiusAttrs : undefined;
            resourceInputs["radiusGroup"] = args ? args.radiusGroup : undefined;
            resourceInputs["radiusVendorAttrs"] = args ? args.radiusVendorAttrs : undefined;
            resourceInputs["sessionTimeout"] = args ? args.sessionTimeout : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["values"] = args ? args.values : undefined;
            resourceInputs["vlan"] = args ? args.vlan : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Nactag.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Nactag resources.
 */
export interface NactagState {
    /**
     * can be set to true to allow the override by usermac result
     */
    allowUsermacOverride?: pulumi.Input<boolean>;
    /**
     * if `type`==`egressVlanNames`, list of egress vlans to return
     */
    egressVlanNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * if `type`==`gbpTag`
     */
    gbpTag?: pulumi.Input<number>;
    /**
     * if `type`==`match`. enum: `certCn`, `certIssuer`, `certSan`, `certSerial`, `certSub`, `clientMac`, `idpRole`,
     * `mdmStatus`, `radiusGroup`, `realm`, `ssid`, `userName`, `usermacLabel`
     */
    match?: pulumi.Input<string>;
    /**
     * This field is applicable only when `type`==`match` * `false`: means it is sufficient to match any of the values (i.e.,
     * match-any behavior) * `true`: means all values should be matched (i.e., match-all behavior) Currently it makes sense to
     * set this field to `true` only if the `match`==`idpRole` or `match`==`usermacLabel`'
     */
    matchAll?: pulumi.Input<boolean>;
    name?: pulumi.Input<string>;
    orgId?: pulumi.Input<string>;
    /**
     * if `type`==`radiusAttrs`, user can specify a list of one or more standard attributes in the field "radiusAttrs". It is
     * the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected. Note
     * that it is allowed to have more than one radiusAttrs in the result of a given rule.
     */
    radiusAttrs?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * if `type`==`radiusGroup`
     */
    radiusGroup?: pulumi.Input<string>;
    /**
     * if `type`==`radiusVendorAttrs`, user can specify a list of one or more vendor-specific attributes in the field
     * "radiusVendorAttrs". It is the responsibility of the user to provide a syntactically correct string, otherwise it may
     * not work as expected. Note that it is allowed to have more than one radiusVendorAttrs in the result of a given rule.
     */
    radiusVendorAttrs?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * if `type`==`session_timeout, in seconds
     */
    sessionTimeout?: pulumi.Input<number>;
    /**
     * enum: `egressVlanNames`, `gbpTag`, `match`, `radiusAttrs`, `radiusGroup`, `radiusVendorAttrs`, `sessionTimeout`, `vlan`
     */
    type?: pulumi.Input<string>;
    /**
     * if `type`==`match`
     */
    values?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * if `type`==`vlan`
     */
    vlan?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Nactag resource.
 */
export interface NactagArgs {
    /**
     * can be set to true to allow the override by usermac result
     */
    allowUsermacOverride?: pulumi.Input<boolean>;
    /**
     * if `type`==`egressVlanNames`, list of egress vlans to return
     */
    egressVlanNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * if `type`==`gbpTag`
     */
    gbpTag?: pulumi.Input<number>;
    /**
     * if `type`==`match`. enum: `certCn`, `certIssuer`, `certSan`, `certSerial`, `certSub`, `clientMac`, `idpRole`,
     * `mdmStatus`, `radiusGroup`, `realm`, `ssid`, `userName`, `usermacLabel`
     */
    match?: pulumi.Input<string>;
    /**
     * This field is applicable only when `type`==`match` * `false`: means it is sufficient to match any of the values (i.e.,
     * match-any behavior) * `true`: means all values should be matched (i.e., match-all behavior) Currently it makes sense to
     * set this field to `true` only if the `match`==`idpRole` or `match`==`usermacLabel`'
     */
    matchAll?: pulumi.Input<boolean>;
    name?: pulumi.Input<string>;
    orgId: pulumi.Input<string>;
    /**
     * if `type`==`radiusAttrs`, user can specify a list of one or more standard attributes in the field "radiusAttrs". It is
     * the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected. Note
     * that it is allowed to have more than one radiusAttrs in the result of a given rule.
     */
    radiusAttrs?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * if `type`==`radiusGroup`
     */
    radiusGroup?: pulumi.Input<string>;
    /**
     * if `type`==`radiusVendorAttrs`, user can specify a list of one or more vendor-specific attributes in the field
     * "radiusVendorAttrs". It is the responsibility of the user to provide a syntactically correct string, otherwise it may
     * not work as expected. Note that it is allowed to have more than one radiusVendorAttrs in the result of a given rule.
     */
    radiusVendorAttrs?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * if `type`==`session_timeout, in seconds
     */
    sessionTimeout?: pulumi.Input<number>;
    /**
     * enum: `egressVlanNames`, `gbpTag`, `match`, `radiusAttrs`, `radiusGroup`, `radiusVendorAttrs`, `sessionTimeout`, `vlan`
     */
    type: pulumi.Input<string>;
    /**
     * if `type`==`match`
     */
    values?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * if `type`==`vlan`
     */
    vlan?: pulumi.Input<string>;
}
