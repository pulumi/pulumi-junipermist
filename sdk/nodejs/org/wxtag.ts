// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This resource manages the Org WxLan tags (labels).
 *
 * A WxTag is a label or tag used in the mist system to classify and categorize applications, users, and resources for the purpose of creating policies and making network management decisions. They can be used
 * * within the Org WxRules to create filtering rules:
 *   * `mist_org_wxrule.dst_allow_wxtags`
 *   * `mist_org_wxrule.dst_deny_wxtags`
 *   * `mist_org_wxrule.dst_wxtags`
 *   * `mist_org_wxrule.src_wxtags`
 * * within the Org WxRules to assign specific VLAN:
 *   * `mist_org_wxrule.apply_tags`
 * * in the WLANs configuration to assign a WLAN to specific APs:
 *   * `mist_org_wlan.wxtag_ids`
 * * to identify unknown application used by Wi-Fi clients
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const wxtagOne = new junipermist.org.Wxtag("wxtag_one", {
 *     orgId: terraformTest.id,
 *     name: "wxtag_one",
 *     values: ["10.3.0.0/16"],
 *     op: "in",
 *     type: "match",
 *     match: "ip_range_subnet",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `mist_org_wxtag` with:
 *
 * Org WxTag can be imported by specifying the org_id and the wxtag_id
 *
 * ```sh
 * $ pulumi import junipermist:org/wxtag:Wxtag wxtag_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 */
export class Wxtag extends pulumi.CustomResource {
    /**
     * Get an existing Wxtag resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WxtagState, opts?: pulumi.CustomResourceOptions): Wxtag {
        return new Wxtag(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:org/wxtag:Wxtag';

    /**
     * Returns true if the given object is an instance of Wxtag.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Wxtag {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Wxtag.__pulumiType;
    }

    /**
     * If `type`==`client`, Client MAC Address
     */
    public readonly mac!: pulumi.Output<string | undefined>;
    /**
     * required if `type`==`match`. enum: `apId`, `app`, `assetMac`, `clientMac`, `hostname`, `ipRangeSubnet`, `port`,
     * `pskName`, `pskRole`, `radiusAttr`, `radiusClass`, `radiusGroup`, `radiusUsername`, `sdkclientUuid`, `wlanId`
     */
    public readonly match!: pulumi.Output<string | undefined>;
    /**
     * The name
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `notIn`
     */
    public readonly op!: pulumi.Output<string | undefined>;
    public readonly orgId!: pulumi.Output<string>;
    /**
     * If `type`==`spec`
     */
    public readonly specs!: pulumi.Output<outputs.org.WxtagSpec[] | undefined>;
    /**
     * enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * Required if `type`==`match` and * `match`==`apId`: list of AP IDs * `match`==`app`: list of Application Names *
     * `match`==`assetMac`: list of Asset MAC Addresses * `match`==`clientMac`: list of Client MAC Addresses *
     * `match`==`hostname`: list of Resources Hostnames * `match`==`ipRangeSubnet`: list of IP Addresses and/or CIDRs *
     * `match`==`pskName`: list of PSK Names * `match`==`pskRole`: list of PSK Roles * `match`==`port`: list of Ports or Port
     * Ranges * `match`==`radiusAttr`: list of RADIUS Attributes. The values are [ "6=1", "26=10.2.3.4" ], this support other
     * RADIUS attributes where we know the type * `match`==`radiusClass`: list of RADIUS Classes. This matches the
     * ATTR-Class(25) * `match`==`radiusGroup`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
     * Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
     * `match`==`radiusUsername`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclientUuid`: list
     * of SDK UUIDs * `match`==`wlanId`: list of WLAN IDs **Notes**: Variables are not allowed
     */
    public readonly values!: pulumi.Output<string[] | undefined>;
    public readonly vlanId!: pulumi.Output<string | undefined>;

    /**
     * Create a Wxtag resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WxtagArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WxtagArgs | WxtagState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WxtagState | undefined;
            resourceInputs["mac"] = state ? state.mac : undefined;
            resourceInputs["match"] = state ? state.match : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["op"] = state ? state.op : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["specs"] = state ? state.specs : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["values"] = state ? state.values : undefined;
            resourceInputs["vlanId"] = state ? state.vlanId : undefined;
        } else {
            const args = argsOrState as WxtagArgs | undefined;
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["mac"] = args ? args.mac : undefined;
            resourceInputs["match"] = args ? args.match : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["op"] = args ? args.op : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["specs"] = args ? args.specs : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["values"] = args ? args.values : undefined;
            resourceInputs["vlanId"] = args ? args.vlanId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Wxtag.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Wxtag resources.
 */
export interface WxtagState {
    /**
     * If `type`==`client`, Client MAC Address
     */
    mac?: pulumi.Input<string>;
    /**
     * required if `type`==`match`. enum: `apId`, `app`, `assetMac`, `clientMac`, `hostname`, `ipRangeSubnet`, `port`,
     * `pskName`, `pskRole`, `radiusAttr`, `radiusClass`, `radiusGroup`, `radiusUsername`, `sdkclientUuid`, `wlanId`
     */
    match?: pulumi.Input<string>;
    /**
     * The name
     */
    name?: pulumi.Input<string>;
    /**
     * required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `notIn`
     */
    op?: pulumi.Input<string>;
    orgId?: pulumi.Input<string>;
    /**
     * If `type`==`spec`
     */
    specs?: pulumi.Input<pulumi.Input<inputs.org.WxtagSpec>[]>;
    /**
     * enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
     */
    type?: pulumi.Input<string>;
    /**
     * Required if `type`==`match` and * `match`==`apId`: list of AP IDs * `match`==`app`: list of Application Names *
     * `match`==`assetMac`: list of Asset MAC Addresses * `match`==`clientMac`: list of Client MAC Addresses *
     * `match`==`hostname`: list of Resources Hostnames * `match`==`ipRangeSubnet`: list of IP Addresses and/or CIDRs *
     * `match`==`pskName`: list of PSK Names * `match`==`pskRole`: list of PSK Roles * `match`==`port`: list of Ports or Port
     * Ranges * `match`==`radiusAttr`: list of RADIUS Attributes. The values are [ "6=1", "26=10.2.3.4" ], this support other
     * RADIUS attributes where we know the type * `match`==`radiusClass`: list of RADIUS Classes. This matches the
     * ATTR-Class(25) * `match`==`radiusGroup`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
     * Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
     * `match`==`radiusUsername`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclientUuid`: list
     * of SDK UUIDs * `match`==`wlanId`: list of WLAN IDs **Notes**: Variables are not allowed
     */
    values?: pulumi.Input<pulumi.Input<string>[]>;
    vlanId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Wxtag resource.
 */
export interface WxtagArgs {
    /**
     * If `type`==`client`, Client MAC Address
     */
    mac?: pulumi.Input<string>;
    /**
     * required if `type`==`match`. enum: `apId`, `app`, `assetMac`, `clientMac`, `hostname`, `ipRangeSubnet`, `port`,
     * `pskName`, `pskRole`, `radiusAttr`, `radiusClass`, `radiusGroup`, `radiusUsername`, `sdkclientUuid`, `wlanId`
     */
    match?: pulumi.Input<string>;
    /**
     * The name
     */
    name?: pulumi.Input<string>;
    /**
     * required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `notIn`
     */
    op?: pulumi.Input<string>;
    orgId: pulumi.Input<string>;
    /**
     * If `type`==`spec`
     */
    specs?: pulumi.Input<pulumi.Input<inputs.org.WxtagSpec>[]>;
    /**
     * enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
     */
    type: pulumi.Input<string>;
    /**
     * Required if `type`==`match` and * `match`==`apId`: list of AP IDs * `match`==`app`: list of Application Names *
     * `match`==`assetMac`: list of Asset MAC Addresses * `match`==`clientMac`: list of Client MAC Addresses *
     * `match`==`hostname`: list of Resources Hostnames * `match`==`ipRangeSubnet`: list of IP Addresses and/or CIDRs *
     * `match`==`pskName`: list of PSK Names * `match`==`pskRole`: list of PSK Roles * `match`==`port`: list of Ports or Port
     * Ranges * `match`==`radiusAttr`: list of RADIUS Attributes. The values are [ "6=1", "26=10.2.3.4" ], this support other
     * RADIUS attributes where we know the type * `match`==`radiusClass`: list of RADIUS Classes. This matches the
     * ATTR-Class(25) * `match`==`radiusGroup`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
     * Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
     * `match`==`radiusUsername`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclientUuid`: list
     * of SDK UUIDs * `match`==`wlanId`: list of WLAN IDs **Notes**: Variables are not allowed
     */
    values?: pulumi.Input<pulumi.Input<string>[]>;
    vlanId?: pulumi.Input<string>;
}
