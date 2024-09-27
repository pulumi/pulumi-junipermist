// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This resource manages the AP Device Profiles.
 * AP Device profiles for aps are used to specify a configuration that can be applied to a select set of aps from any site in the organization. They allow for efficient application of configurations based on ap groups, wlan groups, RF settings, and sites. Device profiles enable various use cases such as activating ethernet passthrough, applying different rf settings, applying mesh configuration, activating specific features like esl or vble, and more.
 *
 * The AP Devide Profile can be assigned to a gateway with the `junipermist.org.DeviceprofileAssign` resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const deviceprofileApOne = new junipermist.org.DeviceprofileAp("deviceprofile_ap_one", {
 *     name: "deviceprofile_ap_one",
 *     orgId: terraformTest.id,
 *     eslConfig: {
 *         enabled: true,
 *         host: "1.2.3.4",
 *         type: "native",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `mist_org_deviceprofile_ap` with:
 *
 * Device Profile can be imported by specifying the org_id and the deviceprofile_id
 *
 * ```sh
 * $ pulumi import junipermist:org/deviceprofileAp:DeviceprofileAp deviceprofile_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 */
export class DeviceprofileAp extends pulumi.CustomResource {
    /**
     * Get an existing DeviceprofileAp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DeviceprofileApState, opts?: pulumi.CustomResourceOptions): DeviceprofileAp {
        return new DeviceprofileAp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:org/deviceprofileAp:DeviceprofileAp';

    /**
     * Returns true if the given object is an instance of DeviceprofileAp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DeviceprofileAp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DeviceprofileAp.__pulumiType;
    }

    /**
     * Aeroscout AP settings
     */
    public readonly aeroscout!: pulumi.Output<outputs.org.DeviceprofileApAeroscout | undefined>;
    /**
     * BLE AP settings
     */
    public readonly bleConfig!: pulumi.Output<outputs.org.DeviceprofileApBleConfig | undefined>;
    /**
     * whether to disable eth1 port
     */
    public readonly disableEth1!: pulumi.Output<boolean>;
    /**
     * whether to disable eth2 port
     */
    public readonly disableEth2!: pulumi.Output<boolean>;
    /**
     * whether to disable eth3 port
     */
    public readonly disableEth3!: pulumi.Output<boolean>;
    /**
     * whether to disable module port
     */
    public readonly disableModule!: pulumi.Output<boolean>;
    public readonly eslConfig!: pulumi.Output<outputs.org.DeviceprofileApEslConfig | undefined>;
    /**
     * IP AP settings
     */
    public readonly ipConfig!: pulumi.Output<outputs.org.DeviceprofileApIpConfig | undefined>;
    /**
     * LED AP settings
     */
    public readonly led!: pulumi.Output<outputs.org.DeviceprofileApLed | undefined>;
    /**
     * Mesh AP settings
     */
    public readonly mesh!: pulumi.Output<outputs.org.DeviceprofileApMesh | undefined>;
    public readonly name!: pulumi.Output<string>;
    public readonly ntpServers!: pulumi.Output<string[] | undefined>;
    public readonly orgId!: pulumi.Output<string>;
    /**
     * whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
     */
    public readonly poePassthrough!: pulumi.Output<boolean>;
    /**
     * power related configs
     */
    public readonly pwrConfig!: pulumi.Output<outputs.org.DeviceprofileApPwrConfig | undefined>;
    /**
     * Radio AP settings
     */
    public readonly radioConfig!: pulumi.Output<outputs.org.DeviceprofileApRadioConfig | undefined>;
    public readonly siteId!: pulumi.Output<string | undefined>;
    /**
     * Device Type. enum: `ap`
     */
    public /*out*/ readonly type!: pulumi.Output<string>;
    public readonly uplinkPortConfig!: pulumi.Output<outputs.org.DeviceprofileApUplinkPortConfig | undefined>;
    /**
     * USB AP settings
     * Note: if native imagotag is enabled, BLE will be disabled automatically
     * Note: legacy, new config moved to ESL Config.
     */
    public readonly usbConfig!: pulumi.Output<outputs.org.DeviceprofileApUsbConfig | undefined>;
    /**
     * a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     */
    public readonly vars!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a DeviceprofileAp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DeviceprofileApArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DeviceprofileApArgs | DeviceprofileApState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DeviceprofileApState | undefined;
            resourceInputs["aeroscout"] = state ? state.aeroscout : undefined;
            resourceInputs["bleConfig"] = state ? state.bleConfig : undefined;
            resourceInputs["disableEth1"] = state ? state.disableEth1 : undefined;
            resourceInputs["disableEth2"] = state ? state.disableEth2 : undefined;
            resourceInputs["disableEth3"] = state ? state.disableEth3 : undefined;
            resourceInputs["disableModule"] = state ? state.disableModule : undefined;
            resourceInputs["eslConfig"] = state ? state.eslConfig : undefined;
            resourceInputs["ipConfig"] = state ? state.ipConfig : undefined;
            resourceInputs["led"] = state ? state.led : undefined;
            resourceInputs["mesh"] = state ? state.mesh : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["ntpServers"] = state ? state.ntpServers : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["poePassthrough"] = state ? state.poePassthrough : undefined;
            resourceInputs["pwrConfig"] = state ? state.pwrConfig : undefined;
            resourceInputs["radioConfig"] = state ? state.radioConfig : undefined;
            resourceInputs["siteId"] = state ? state.siteId : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["uplinkPortConfig"] = state ? state.uplinkPortConfig : undefined;
            resourceInputs["usbConfig"] = state ? state.usbConfig : undefined;
            resourceInputs["vars"] = state ? state.vars : undefined;
        } else {
            const args = argsOrState as DeviceprofileApArgs | undefined;
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            resourceInputs["aeroscout"] = args ? args.aeroscout : undefined;
            resourceInputs["bleConfig"] = args ? args.bleConfig : undefined;
            resourceInputs["disableEth1"] = args ? args.disableEth1 : undefined;
            resourceInputs["disableEth2"] = args ? args.disableEth2 : undefined;
            resourceInputs["disableEth3"] = args ? args.disableEth3 : undefined;
            resourceInputs["disableModule"] = args ? args.disableModule : undefined;
            resourceInputs["eslConfig"] = args ? args.eslConfig : undefined;
            resourceInputs["ipConfig"] = args ? args.ipConfig : undefined;
            resourceInputs["led"] = args ? args.led : undefined;
            resourceInputs["mesh"] = args ? args.mesh : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["ntpServers"] = args ? args.ntpServers : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["poePassthrough"] = args ? args.poePassthrough : undefined;
            resourceInputs["pwrConfig"] = args ? args.pwrConfig : undefined;
            resourceInputs["radioConfig"] = args ? args.radioConfig : undefined;
            resourceInputs["siteId"] = args ? args.siteId : undefined;
            resourceInputs["uplinkPortConfig"] = args ? args.uplinkPortConfig : undefined;
            resourceInputs["usbConfig"] = args ? args.usbConfig : undefined;
            resourceInputs["vars"] = args ? args.vars : undefined;
            resourceInputs["type"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DeviceprofileAp.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DeviceprofileAp resources.
 */
export interface DeviceprofileApState {
    /**
     * Aeroscout AP settings
     */
    aeroscout?: pulumi.Input<inputs.org.DeviceprofileApAeroscout>;
    /**
     * BLE AP settings
     */
    bleConfig?: pulumi.Input<inputs.org.DeviceprofileApBleConfig>;
    /**
     * whether to disable eth1 port
     */
    disableEth1?: pulumi.Input<boolean>;
    /**
     * whether to disable eth2 port
     */
    disableEth2?: pulumi.Input<boolean>;
    /**
     * whether to disable eth3 port
     */
    disableEth3?: pulumi.Input<boolean>;
    /**
     * whether to disable module port
     */
    disableModule?: pulumi.Input<boolean>;
    eslConfig?: pulumi.Input<inputs.org.DeviceprofileApEslConfig>;
    /**
     * IP AP settings
     */
    ipConfig?: pulumi.Input<inputs.org.DeviceprofileApIpConfig>;
    /**
     * LED AP settings
     */
    led?: pulumi.Input<inputs.org.DeviceprofileApLed>;
    /**
     * Mesh AP settings
     */
    mesh?: pulumi.Input<inputs.org.DeviceprofileApMesh>;
    name?: pulumi.Input<string>;
    ntpServers?: pulumi.Input<pulumi.Input<string>[]>;
    orgId?: pulumi.Input<string>;
    /**
     * whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
     */
    poePassthrough?: pulumi.Input<boolean>;
    /**
     * power related configs
     */
    pwrConfig?: pulumi.Input<inputs.org.DeviceprofileApPwrConfig>;
    /**
     * Radio AP settings
     */
    radioConfig?: pulumi.Input<inputs.org.DeviceprofileApRadioConfig>;
    siteId?: pulumi.Input<string>;
    /**
     * Device Type. enum: `ap`
     */
    type?: pulumi.Input<string>;
    uplinkPortConfig?: pulumi.Input<inputs.org.DeviceprofileApUplinkPortConfig>;
    /**
     * USB AP settings
     * Note: if native imagotag is enabled, BLE will be disabled automatically
     * Note: legacy, new config moved to ESL Config.
     */
    usbConfig?: pulumi.Input<inputs.org.DeviceprofileApUsbConfig>;
    /**
     * a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     */
    vars?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a DeviceprofileAp resource.
 */
export interface DeviceprofileApArgs {
    /**
     * Aeroscout AP settings
     */
    aeroscout?: pulumi.Input<inputs.org.DeviceprofileApAeroscout>;
    /**
     * BLE AP settings
     */
    bleConfig?: pulumi.Input<inputs.org.DeviceprofileApBleConfig>;
    /**
     * whether to disable eth1 port
     */
    disableEth1?: pulumi.Input<boolean>;
    /**
     * whether to disable eth2 port
     */
    disableEth2?: pulumi.Input<boolean>;
    /**
     * whether to disable eth3 port
     */
    disableEth3?: pulumi.Input<boolean>;
    /**
     * whether to disable module port
     */
    disableModule?: pulumi.Input<boolean>;
    eslConfig?: pulumi.Input<inputs.org.DeviceprofileApEslConfig>;
    /**
     * IP AP settings
     */
    ipConfig?: pulumi.Input<inputs.org.DeviceprofileApIpConfig>;
    /**
     * LED AP settings
     */
    led?: pulumi.Input<inputs.org.DeviceprofileApLed>;
    /**
     * Mesh AP settings
     */
    mesh?: pulumi.Input<inputs.org.DeviceprofileApMesh>;
    name?: pulumi.Input<string>;
    ntpServers?: pulumi.Input<pulumi.Input<string>[]>;
    orgId: pulumi.Input<string>;
    /**
     * whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
     */
    poePassthrough?: pulumi.Input<boolean>;
    /**
     * power related configs
     */
    pwrConfig?: pulumi.Input<inputs.org.DeviceprofileApPwrConfig>;
    /**
     * Radio AP settings
     */
    radioConfig?: pulumi.Input<inputs.org.DeviceprofileApRadioConfig>;
    siteId?: pulumi.Input<string>;
    uplinkPortConfig?: pulumi.Input<inputs.org.DeviceprofileApUplinkPortConfig>;
    /**
     * USB AP settings
     * Note: if native imagotag is enabled, BLE will be disabled automatically
     * Note: legacy, new config moved to ESL Config.
     */
    usbConfig?: pulumi.Input<inputs.org.DeviceprofileApUsbConfig>;
    /**
     * a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     */
    vars?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
