// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This resource manages the RF Templates.
 *
 * The RF Templates can be used to define Wireless Access Points radio configuration, and can be assigned to the sites
 *
 * ## Import
 *
 * Using `pulumi import`, import `mist_org_rftemplate` with:
 *
 * Org RF Template can be imported by specifying the org_id and the rftemplate_id
 *
 * ```sh
 * $ pulumi import junipermist:org/rftemplate:Rftemplate rftemplate_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 */
export class Rftemplate extends pulumi.CustomResource {
    /**
     * Get an existing Rftemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RftemplateState, opts?: pulumi.CustomResourceOptions): Rftemplate {
        return new Rftemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:org/rftemplate:Rftemplate';

    /**
     * Returns true if the given object is an instance of Rftemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Rftemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Rftemplate.__pulumiType;
    }

    public readonly antGain24!: pulumi.Output<number>;
    public readonly antGain5!: pulumi.Output<number>;
    public readonly antGain6!: pulumi.Output<number>;
    /**
     * Radio Band AP settings
     */
    public readonly band24!: pulumi.Output<outputs.org.RftemplateBand24 | undefined>;
    /**
     * enum: `24`, `5`, `6`, `auto`
     */
    public readonly band24Usage!: pulumi.Output<string | undefined>;
    /**
     * Radio Band AP settings
     */
    public readonly band5!: pulumi.Output<outputs.org.RftemplateBand5 | undefined>;
    /**
     * Radio Band AP settings
     */
    public readonly band5On24Radio!: pulumi.Output<outputs.org.RftemplateBand5On24Radio | undefined>;
    /**
     * Radio Band AP settings
     */
    public readonly band6!: pulumi.Output<outputs.org.RftemplateBand6 | undefined>;
    /**
     * Optional, country code to use. If specified, this gets applied to all sites using the RF Template
     */
    public readonly countryCode!: pulumi.Output<string | undefined>;
    /**
     * overwrites for a specific model. If a band is specified, it will shadow the default. Property key is the model name (e.g. "AP63")
     */
    public readonly modelSpecific!: pulumi.Output<{[key: string]: outputs.org.RftemplateModelSpecific} | undefined>;
    /**
     * The name of the RF template
     */
    public readonly name!: pulumi.Output<string>;
    public readonly orgId!: pulumi.Output<string>;
    /**
     * Whether scanning radio is enabled
     */
    public readonly scanningEnabled!: pulumi.Output<boolean | undefined>;

    /**
     * Create a Rftemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RftemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RftemplateArgs | RftemplateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RftemplateState | undefined;
            resourceInputs["antGain24"] = state ? state.antGain24 : undefined;
            resourceInputs["antGain5"] = state ? state.antGain5 : undefined;
            resourceInputs["antGain6"] = state ? state.antGain6 : undefined;
            resourceInputs["band24"] = state ? state.band24 : undefined;
            resourceInputs["band24Usage"] = state ? state.band24Usage : undefined;
            resourceInputs["band5"] = state ? state.band5 : undefined;
            resourceInputs["band5On24Radio"] = state ? state.band5On24Radio : undefined;
            resourceInputs["band6"] = state ? state.band6 : undefined;
            resourceInputs["countryCode"] = state ? state.countryCode : undefined;
            resourceInputs["modelSpecific"] = state ? state.modelSpecific : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["scanningEnabled"] = state ? state.scanningEnabled : undefined;
        } else {
            const args = argsOrState as RftemplateArgs | undefined;
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            resourceInputs["antGain24"] = args ? args.antGain24 : undefined;
            resourceInputs["antGain5"] = args ? args.antGain5 : undefined;
            resourceInputs["antGain6"] = args ? args.antGain6 : undefined;
            resourceInputs["band24"] = args ? args.band24 : undefined;
            resourceInputs["band24Usage"] = args ? args.band24Usage : undefined;
            resourceInputs["band5"] = args ? args.band5 : undefined;
            resourceInputs["band5On24Radio"] = args ? args.band5On24Radio : undefined;
            resourceInputs["band6"] = args ? args.band6 : undefined;
            resourceInputs["countryCode"] = args ? args.countryCode : undefined;
            resourceInputs["modelSpecific"] = args ? args.modelSpecific : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["scanningEnabled"] = args ? args.scanningEnabled : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Rftemplate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Rftemplate resources.
 */
export interface RftemplateState {
    antGain24?: pulumi.Input<number>;
    antGain5?: pulumi.Input<number>;
    antGain6?: pulumi.Input<number>;
    /**
     * Radio Band AP settings
     */
    band24?: pulumi.Input<inputs.org.RftemplateBand24>;
    /**
     * enum: `24`, `5`, `6`, `auto`
     */
    band24Usage?: pulumi.Input<string>;
    /**
     * Radio Band AP settings
     */
    band5?: pulumi.Input<inputs.org.RftemplateBand5>;
    /**
     * Radio Band AP settings
     */
    band5On24Radio?: pulumi.Input<inputs.org.RftemplateBand5On24Radio>;
    /**
     * Radio Band AP settings
     */
    band6?: pulumi.Input<inputs.org.RftemplateBand6>;
    /**
     * Optional, country code to use. If specified, this gets applied to all sites using the RF Template
     */
    countryCode?: pulumi.Input<string>;
    /**
     * overwrites for a specific model. If a band is specified, it will shadow the default. Property key is the model name (e.g. "AP63")
     */
    modelSpecific?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.RftemplateModelSpecific>}>;
    /**
     * The name of the RF template
     */
    name?: pulumi.Input<string>;
    orgId?: pulumi.Input<string>;
    /**
     * Whether scanning radio is enabled
     */
    scanningEnabled?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Rftemplate resource.
 */
export interface RftemplateArgs {
    antGain24?: pulumi.Input<number>;
    antGain5?: pulumi.Input<number>;
    antGain6?: pulumi.Input<number>;
    /**
     * Radio Band AP settings
     */
    band24?: pulumi.Input<inputs.org.RftemplateBand24>;
    /**
     * enum: `24`, `5`, `6`, `auto`
     */
    band24Usage?: pulumi.Input<string>;
    /**
     * Radio Band AP settings
     */
    band5?: pulumi.Input<inputs.org.RftemplateBand5>;
    /**
     * Radio Band AP settings
     */
    band5On24Radio?: pulumi.Input<inputs.org.RftemplateBand5On24Radio>;
    /**
     * Radio Band AP settings
     */
    band6?: pulumi.Input<inputs.org.RftemplateBand6>;
    /**
     * Optional, country code to use. If specified, this gets applied to all sites using the RF Template
     */
    countryCode?: pulumi.Input<string>;
    /**
     * overwrites for a specific model. If a band is specified, it will shadow the default. Property key is the model name (e.g. "AP63")
     */
    modelSpecific?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.RftemplateModelSpecific>}>;
    /**
     * The name of the RF template
     */
    name?: pulumi.Input<string>;
    orgId: pulumi.Input<string>;
    /**
     * Whether scanning radio is enabled
     */
    scanningEnabled?: pulumi.Input<boolean>;
}
