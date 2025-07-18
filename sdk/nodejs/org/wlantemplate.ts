// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This resource manages the Org WLAN Templates.
 *
 * A WLAN template is a collection of WLANs, tunneling policies, and wxlan policies. It is used to create and manage wlan configurations at an organizational level.\
 * WLAN templates allow for modular, scalable, and easy-to-manage configuration of ssids and their application to specific sites, site groups, or ap device profiles.\
 * They are valuable for automating configuration across multiple sites and profiles, making it easier to scale efficiently.
 *
 * ## Import
 *
 * Using `pulumi import`, import `mist_org_wlantemplate` with:
 *
 * Org WLAN Template can be imported by specifying the org_id and the wlantemplate_id
 *
 * ```sh
 * $ pulumi import junipermist:org/wlantemplate:Wlantemplate wlantemplate_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 */
export class Wlantemplate extends pulumi.CustomResource {
    /**
     * Get an existing Wlantemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WlantemplateState, opts?: pulumi.CustomResourceOptions): Wlantemplate {
        return new Wlantemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:org/wlantemplate:Wlantemplate';

    /**
     * Returns true if the given object is an instance of Wlantemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Wlantemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Wlantemplate.__pulumiType;
    }

    /**
     * Where this template should be applied to, can be org*id, site*ids, sitegroup_ids
     */
    public readonly applies!: pulumi.Output<outputs.org.WlantemplateApplies>;
    /**
     * List of Device Profile ids
     */
    public readonly deviceprofileIds!: pulumi.Output<string[]>;
    /**
     * Where this template should not be applied to (takes precedence)
     */
    public readonly exceptions!: pulumi.Output<outputs.org.WlantemplateExceptions>;
    /**
     * Whether to further filter by Device Profile
     */
    public readonly filterByDeviceprofile!: pulumi.Output<boolean>;
    public readonly name!: pulumi.Output<string>;
    public readonly orgId!: pulumi.Output<string>;

    /**
     * Create a Wlantemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WlantemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WlantemplateArgs | WlantemplateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WlantemplateState | undefined;
            resourceInputs["applies"] = state ? state.applies : undefined;
            resourceInputs["deviceprofileIds"] = state ? state.deviceprofileIds : undefined;
            resourceInputs["exceptions"] = state ? state.exceptions : undefined;
            resourceInputs["filterByDeviceprofile"] = state ? state.filterByDeviceprofile : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
        } else {
            const args = argsOrState as WlantemplateArgs | undefined;
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            resourceInputs["applies"] = args ? args.applies : undefined;
            resourceInputs["deviceprofileIds"] = args ? args.deviceprofileIds : undefined;
            resourceInputs["exceptions"] = args ? args.exceptions : undefined;
            resourceInputs["filterByDeviceprofile"] = args ? args.filterByDeviceprofile : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Wlantemplate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Wlantemplate resources.
 */
export interface WlantemplateState {
    /**
     * Where this template should be applied to, can be org*id, site*ids, sitegroup_ids
     */
    applies?: pulumi.Input<inputs.org.WlantemplateApplies>;
    /**
     * List of Device Profile ids
     */
    deviceprofileIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Where this template should not be applied to (takes precedence)
     */
    exceptions?: pulumi.Input<inputs.org.WlantemplateExceptions>;
    /**
     * Whether to further filter by Device Profile
     */
    filterByDeviceprofile?: pulumi.Input<boolean>;
    name?: pulumi.Input<string>;
    orgId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Wlantemplate resource.
 */
export interface WlantemplateArgs {
    /**
     * Where this template should be applied to, can be org*id, site*ids, sitegroup_ids
     */
    applies?: pulumi.Input<inputs.org.WlantemplateApplies>;
    /**
     * List of Device Profile ids
     */
    deviceprofileIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Where this template should not be applied to (takes precedence)
     */
    exceptions?: pulumi.Input<inputs.org.WlantemplateExceptions>;
    /**
     * Whether to further filter by Device Profile
     */
    filterByDeviceprofile?: pulumi.Input<boolean>;
    name?: pulumi.Input<string>;
    orgId: pulumi.Input<string>;
}
