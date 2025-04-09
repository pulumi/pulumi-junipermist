// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This resource manages the Site basic information.
 *
 * This resource can be used to assign templates to a site, or to change basic information (e.g. Site Address)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const juniperFrance = new junipermist.site.Base("juniper_france", {
 *     orgId: terraformTest.id,
 *     name: "JNP-FR-PAR",
 *     countryCode: "FR",
 *     timezone: "Europe/Paris",
 *     address: "41 Rue de Villiers, 92100 Neuilly sur Seine, France",
 *     notes: "Created with Terraform, Updated with Terraform",
 *     latlng: {
 *         lat: 48.899268,
 *         lng: 2.214447,
 *     },
 *     sitegroupIds: [
 *         testGroup.id,
 *         testGroup2.id,
 *     ],
 *     networktemplateId: networktemplateOne.id,
 *     rftemplateId: rftemplateOne.id,
 *     gatewaytemplateId: gatewaytemplateOne.id,
 *     alarmtemplateId: alarmtemplateOne.id,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `mist_site` with:
 *
 * Site can be imported by specifying the site_id
 *
 * ```sh
 * $ pulumi import junipermist:site/base:base site_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
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
    public static readonly __pulumiType = 'junipermist:site/base:base';

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

    /**
     * full address of the site
     */
    public readonly address!: pulumi.Output<string>;
    /**
     * Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
     */
    public readonly alarmtemplateId!: pulumi.Output<string | undefined>;
    /**
     * AP Template ID, used by APs
     */
    public readonly aptemplateId!: pulumi.Output<string | undefined>;
    /**
     * Country code for the site (for AP config generation), in two-character
     */
    public readonly countryCode!: pulumi.Output<string | undefined>;
    /**
     * Gateway Template ID, used by gateways
     */
    public readonly gatewaytemplateId!: pulumi.Output<string | undefined>;
    public readonly latlng!: pulumi.Output<outputs.site.BaseLatlng | undefined>;
    public readonly name!: pulumi.Output<string>;
    /**
     * Network Template ID, this takes precedence over Site Settings
     */
    public readonly networktemplateId!: pulumi.Output<string | undefined>;
    /**
     * Optional, any notes about the site
     */
    public readonly notes!: pulumi.Output<string>;
    public readonly orgId!: pulumi.Output<string>;
    /**
     * RF Template ID, this takes precedence over Site Settings
     */
    public readonly rftemplateId!: pulumi.Output<string | undefined>;
    /**
     * SecPolicy ID
     */
    public readonly secpolicyId!: pulumi.Output<string | undefined>;
    /**
     * Sitegroups this site belongs to
     */
    public readonly sitegroupIds!: pulumi.Output<string[]>;
    /**
     * Site Template ID
     */
    public readonly sitetemplateId!: pulumi.Output<string | undefined>;
    /**
     * Timezone the site is at
     */
    public readonly timezone!: pulumi.Output<string>;
    public /*out*/ readonly tzoffset!: pulumi.Output<number>;

    /**
     * Create a Base resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BaseArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BaseArgs | BaseState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BaseState | undefined;
            resourceInputs["address"] = state ? state.address : undefined;
            resourceInputs["alarmtemplateId"] = state ? state.alarmtemplateId : undefined;
            resourceInputs["aptemplateId"] = state ? state.aptemplateId : undefined;
            resourceInputs["countryCode"] = state ? state.countryCode : undefined;
            resourceInputs["gatewaytemplateId"] = state ? state.gatewaytemplateId : undefined;
            resourceInputs["latlng"] = state ? state.latlng : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networktemplateId"] = state ? state.networktemplateId : undefined;
            resourceInputs["notes"] = state ? state.notes : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["rftemplateId"] = state ? state.rftemplateId : undefined;
            resourceInputs["secpolicyId"] = state ? state.secpolicyId : undefined;
            resourceInputs["sitegroupIds"] = state ? state.sitegroupIds : undefined;
            resourceInputs["sitetemplateId"] = state ? state.sitetemplateId : undefined;
            resourceInputs["timezone"] = state ? state.timezone : undefined;
            resourceInputs["tzoffset"] = state ? state.tzoffset : undefined;
        } else {
            const args = argsOrState as BaseArgs | undefined;
            if ((!args || args.address === undefined) && !opts.urn) {
                throw new Error("Missing required property 'address'");
            }
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            resourceInputs["address"] = args ? args.address : undefined;
            resourceInputs["alarmtemplateId"] = args ? args.alarmtemplateId : undefined;
            resourceInputs["aptemplateId"] = args ? args.aptemplateId : undefined;
            resourceInputs["countryCode"] = args ? args.countryCode : undefined;
            resourceInputs["gatewaytemplateId"] = args ? args.gatewaytemplateId : undefined;
            resourceInputs["latlng"] = args ? args.latlng : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networktemplateId"] = args ? args.networktemplateId : undefined;
            resourceInputs["notes"] = args ? args.notes : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["rftemplateId"] = args ? args.rftemplateId : undefined;
            resourceInputs["secpolicyId"] = args ? args.secpolicyId : undefined;
            resourceInputs["sitegroupIds"] = args ? args.sitegroupIds : undefined;
            resourceInputs["sitetemplateId"] = args ? args.sitetemplateId : undefined;
            resourceInputs["timezone"] = args ? args.timezone : undefined;
            resourceInputs["tzoffset"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const aliasOpts = { aliases: [{ type: "junipermist:device/base:base" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        super(Base.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering base resources.
 */
export interface BaseState {
    /**
     * full address of the site
     */
    address?: pulumi.Input<string>;
    /**
     * Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
     */
    alarmtemplateId?: pulumi.Input<string>;
    /**
     * AP Template ID, used by APs
     */
    aptemplateId?: pulumi.Input<string>;
    /**
     * Country code for the site (for AP config generation), in two-character
     */
    countryCode?: pulumi.Input<string>;
    /**
     * Gateway Template ID, used by gateways
     */
    gatewaytemplateId?: pulumi.Input<string>;
    latlng?: pulumi.Input<inputs.site.BaseLatlng>;
    name?: pulumi.Input<string>;
    /**
     * Network Template ID, this takes precedence over Site Settings
     */
    networktemplateId?: pulumi.Input<string>;
    /**
     * Optional, any notes about the site
     */
    notes?: pulumi.Input<string>;
    orgId?: pulumi.Input<string>;
    /**
     * RF Template ID, this takes precedence over Site Settings
     */
    rftemplateId?: pulumi.Input<string>;
    /**
     * SecPolicy ID
     */
    secpolicyId?: pulumi.Input<string>;
    /**
     * Sitegroups this site belongs to
     */
    sitegroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Site Template ID
     */
    sitetemplateId?: pulumi.Input<string>;
    /**
     * Timezone the site is at
     */
    timezone?: pulumi.Input<string>;
    tzoffset?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Base resource.
 */
export interface BaseArgs {
    /**
     * full address of the site
     */
    address: pulumi.Input<string>;
    /**
     * Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
     */
    alarmtemplateId?: pulumi.Input<string>;
    /**
     * AP Template ID, used by APs
     */
    aptemplateId?: pulumi.Input<string>;
    /**
     * Country code for the site (for AP config generation), in two-character
     */
    countryCode?: pulumi.Input<string>;
    /**
     * Gateway Template ID, used by gateways
     */
    gatewaytemplateId?: pulumi.Input<string>;
    latlng?: pulumi.Input<inputs.site.BaseLatlng>;
    name?: pulumi.Input<string>;
    /**
     * Network Template ID, this takes precedence over Site Settings
     */
    networktemplateId?: pulumi.Input<string>;
    /**
     * Optional, any notes about the site
     */
    notes?: pulumi.Input<string>;
    orgId: pulumi.Input<string>;
    /**
     * RF Template ID, this takes precedence over Site Settings
     */
    rftemplateId?: pulumi.Input<string>;
    /**
     * SecPolicy ID
     */
    secpolicyId?: pulumi.Input<string>;
    /**
     * Sitegroups this site belongs to
     */
    sitegroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Site Template ID
     */
    sitetemplateId?: pulumi.Input<string>;
    /**
     * Timezone the site is at
     */
    timezone?: pulumi.Input<string>;
}
