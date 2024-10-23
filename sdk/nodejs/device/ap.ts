// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This resource manages the Wireless Access Point configuration.
 * It can be used to define specific configuration at the device level or to override AP Device Profile (`junipermist.org.DeviceprofileAp`).
 *
 * ## Import
 *
 * Using `pulumi import`, import `mist_device_ap` with:
 *
 * AP Configuration can be imported by specifying the site_id and the device_id
 *
 * ```sh
 * $ pulumi import junipermist:device/ap:Ap ap_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 */
export class Ap extends pulumi.CustomResource {
    /**
     * Get an existing Ap resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApState, opts?: pulumi.CustomResourceOptions): Ap {
        return new Ap(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:device/ap:Ap';

    /**
     * Returns true if the given object is an instance of Ap.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Ap {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Ap.__pulumiType;
    }

    /**
     * Aeroscout AP settings
     */
    public readonly aeroscout!: pulumi.Output<outputs.device.ApAeroscout | undefined>;
    /**
     * BLE AP settings
     */
    public readonly bleConfig!: pulumi.Output<outputs.device.ApBleConfig | undefined>;
    public readonly centrak!: pulumi.Output<outputs.device.ApCentrak | undefined>;
    public readonly clientBridge!: pulumi.Output<outputs.device.ApClientBridge | undefined>;
    public readonly deviceId!: pulumi.Output<string>;
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
    public readonly eslConfig!: pulumi.Output<outputs.device.ApEslConfig | undefined>;
    /**
     * height, in meters, optional
     */
    public readonly height!: pulumi.Output<number | undefined>;
    public /*out*/ readonly image1Url!: pulumi.Output<string>;
    public /*out*/ readonly image2Url!: pulumi.Output<string>;
    public /*out*/ readonly image3Url!: pulumi.Output<string>;
    /**
     * IP AP settings
     */
    public readonly ipConfig!: pulumi.Output<outputs.device.ApIpConfig | undefined>;
    /**
     * LED AP settings
     */
    public readonly led!: pulumi.Output<outputs.device.ApLed | undefined>;
    /**
     * whether this map is considered locked down
     */
    public readonly locked!: pulumi.Output<boolean | undefined>;
    /**
     * device MAC address
     */
    public /*out*/ readonly mac!: pulumi.Output<string>;
    /**
     * map where the device belongs to
     */
    public readonly mapId!: pulumi.Output<string | undefined>;
    /**
     * Mesh AP settings
     */
    public readonly mesh!: pulumi.Output<outputs.device.ApMesh | undefined>;
    /**
     * device Model
     */
    public /*out*/ readonly model!: pulumi.Output<string>;
    public readonly name!: pulumi.Output<string>;
    /**
     * any notes about this AP
     */
    public readonly notes!: pulumi.Output<string | undefined>;
    public readonly ntpServers!: pulumi.Output<string[] | undefined>;
    public /*out*/ readonly orgId!: pulumi.Output<string>;
    /**
     * orientation, 0-359, in degrees, up is 0, right is 90.
     */
    public readonly orientation!: pulumi.Output<number | undefined>;
    /**
     * whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
     */
    public readonly poePassthrough!: pulumi.Output<boolean>;
    /**
     * power related configs
     */
    public readonly pwrConfig!: pulumi.Output<outputs.device.ApPwrConfig | undefined>;
    /**
     * Radio AP settings
     */
    public readonly radioConfig!: pulumi.Output<outputs.device.ApRadioConfig | undefined>;
    /**
     * device Serial
     */
    public /*out*/ readonly serial!: pulumi.Output<string>;
    public readonly siteId!: pulumi.Output<string>;
    /**
     * Device Type. enum: `ap`
     */
    public /*out*/ readonly type!: pulumi.Output<string>;
    public readonly uplinkPortConfig!: pulumi.Output<outputs.device.ApUplinkPortConfig | undefined>;
    /**
     * USB AP settings Note: if native imagotag is enabled, BLE will be disabled automatically Note: legacy, new config moved
     * to ESL Config.
     */
    public readonly usbConfig!: pulumi.Output<outputs.device.ApUsbConfig | undefined>;
    /**
     * a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     */
    public readonly vars!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * x in pixel
     */
    public readonly x!: pulumi.Output<number | undefined>;
    /**
     * y in pixel
     */
    public readonly y!: pulumi.Output<number | undefined>;

    /**
     * Create a Ap resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApArgs | ApState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApState | undefined;
            resourceInputs["aeroscout"] = state ? state.aeroscout : undefined;
            resourceInputs["bleConfig"] = state ? state.bleConfig : undefined;
            resourceInputs["centrak"] = state ? state.centrak : undefined;
            resourceInputs["clientBridge"] = state ? state.clientBridge : undefined;
            resourceInputs["deviceId"] = state ? state.deviceId : undefined;
            resourceInputs["disableEth1"] = state ? state.disableEth1 : undefined;
            resourceInputs["disableEth2"] = state ? state.disableEth2 : undefined;
            resourceInputs["disableEth3"] = state ? state.disableEth3 : undefined;
            resourceInputs["disableModule"] = state ? state.disableModule : undefined;
            resourceInputs["eslConfig"] = state ? state.eslConfig : undefined;
            resourceInputs["height"] = state ? state.height : undefined;
            resourceInputs["image1Url"] = state ? state.image1Url : undefined;
            resourceInputs["image2Url"] = state ? state.image2Url : undefined;
            resourceInputs["image3Url"] = state ? state.image3Url : undefined;
            resourceInputs["ipConfig"] = state ? state.ipConfig : undefined;
            resourceInputs["led"] = state ? state.led : undefined;
            resourceInputs["locked"] = state ? state.locked : undefined;
            resourceInputs["mac"] = state ? state.mac : undefined;
            resourceInputs["mapId"] = state ? state.mapId : undefined;
            resourceInputs["mesh"] = state ? state.mesh : undefined;
            resourceInputs["model"] = state ? state.model : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["notes"] = state ? state.notes : undefined;
            resourceInputs["ntpServers"] = state ? state.ntpServers : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["orientation"] = state ? state.orientation : undefined;
            resourceInputs["poePassthrough"] = state ? state.poePassthrough : undefined;
            resourceInputs["pwrConfig"] = state ? state.pwrConfig : undefined;
            resourceInputs["radioConfig"] = state ? state.radioConfig : undefined;
            resourceInputs["serial"] = state ? state.serial : undefined;
            resourceInputs["siteId"] = state ? state.siteId : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["uplinkPortConfig"] = state ? state.uplinkPortConfig : undefined;
            resourceInputs["usbConfig"] = state ? state.usbConfig : undefined;
            resourceInputs["vars"] = state ? state.vars : undefined;
            resourceInputs["x"] = state ? state.x : undefined;
            resourceInputs["y"] = state ? state.y : undefined;
        } else {
            const args = argsOrState as ApArgs | undefined;
            if ((!args || args.deviceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deviceId'");
            }
            if ((!args || args.siteId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'siteId'");
            }
            resourceInputs["aeroscout"] = args ? args.aeroscout : undefined;
            resourceInputs["bleConfig"] = args ? args.bleConfig : undefined;
            resourceInputs["centrak"] = args ? args.centrak : undefined;
            resourceInputs["clientBridge"] = args ? args.clientBridge : undefined;
            resourceInputs["deviceId"] = args ? args.deviceId : undefined;
            resourceInputs["disableEth1"] = args ? args.disableEth1 : undefined;
            resourceInputs["disableEth2"] = args ? args.disableEth2 : undefined;
            resourceInputs["disableEth3"] = args ? args.disableEth3 : undefined;
            resourceInputs["disableModule"] = args ? args.disableModule : undefined;
            resourceInputs["eslConfig"] = args ? args.eslConfig : undefined;
            resourceInputs["height"] = args ? args.height : undefined;
            resourceInputs["ipConfig"] = args ? args.ipConfig : undefined;
            resourceInputs["led"] = args ? args.led : undefined;
            resourceInputs["locked"] = args ? args.locked : undefined;
            resourceInputs["mapId"] = args ? args.mapId : undefined;
            resourceInputs["mesh"] = args ? args.mesh : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["notes"] = args ? args.notes : undefined;
            resourceInputs["ntpServers"] = args ? args.ntpServers : undefined;
            resourceInputs["orientation"] = args ? args.orientation : undefined;
            resourceInputs["poePassthrough"] = args ? args.poePassthrough : undefined;
            resourceInputs["pwrConfig"] = args ? args.pwrConfig : undefined;
            resourceInputs["radioConfig"] = args ? args.radioConfig : undefined;
            resourceInputs["siteId"] = args ? args.siteId : undefined;
            resourceInputs["uplinkPortConfig"] = args ? args.uplinkPortConfig : undefined;
            resourceInputs["usbConfig"] = args ? args.usbConfig : undefined;
            resourceInputs["vars"] = args ? args.vars : undefined;
            resourceInputs["x"] = args ? args.x : undefined;
            resourceInputs["y"] = args ? args.y : undefined;
            resourceInputs["image1Url"] = undefined /*out*/;
            resourceInputs["image2Url"] = undefined /*out*/;
            resourceInputs["image3Url"] = undefined /*out*/;
            resourceInputs["mac"] = undefined /*out*/;
            resourceInputs["model"] = undefined /*out*/;
            resourceInputs["orgId"] = undefined /*out*/;
            resourceInputs["serial"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Ap.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Ap resources.
 */
export interface ApState {
    /**
     * Aeroscout AP settings
     */
    aeroscout?: pulumi.Input<inputs.device.ApAeroscout>;
    /**
     * BLE AP settings
     */
    bleConfig?: pulumi.Input<inputs.device.ApBleConfig>;
    centrak?: pulumi.Input<inputs.device.ApCentrak>;
    clientBridge?: pulumi.Input<inputs.device.ApClientBridge>;
    deviceId?: pulumi.Input<string>;
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
    eslConfig?: pulumi.Input<inputs.device.ApEslConfig>;
    /**
     * height, in meters, optional
     */
    height?: pulumi.Input<number>;
    image1Url?: pulumi.Input<string>;
    image2Url?: pulumi.Input<string>;
    image3Url?: pulumi.Input<string>;
    /**
     * IP AP settings
     */
    ipConfig?: pulumi.Input<inputs.device.ApIpConfig>;
    /**
     * LED AP settings
     */
    led?: pulumi.Input<inputs.device.ApLed>;
    /**
     * whether this map is considered locked down
     */
    locked?: pulumi.Input<boolean>;
    /**
     * device MAC address
     */
    mac?: pulumi.Input<string>;
    /**
     * map where the device belongs to
     */
    mapId?: pulumi.Input<string>;
    /**
     * Mesh AP settings
     */
    mesh?: pulumi.Input<inputs.device.ApMesh>;
    /**
     * device Model
     */
    model?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    /**
     * any notes about this AP
     */
    notes?: pulumi.Input<string>;
    ntpServers?: pulumi.Input<pulumi.Input<string>[]>;
    orgId?: pulumi.Input<string>;
    /**
     * orientation, 0-359, in degrees, up is 0, right is 90.
     */
    orientation?: pulumi.Input<number>;
    /**
     * whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
     */
    poePassthrough?: pulumi.Input<boolean>;
    /**
     * power related configs
     */
    pwrConfig?: pulumi.Input<inputs.device.ApPwrConfig>;
    /**
     * Radio AP settings
     */
    radioConfig?: pulumi.Input<inputs.device.ApRadioConfig>;
    /**
     * device Serial
     */
    serial?: pulumi.Input<string>;
    siteId?: pulumi.Input<string>;
    /**
     * Device Type. enum: `ap`
     */
    type?: pulumi.Input<string>;
    uplinkPortConfig?: pulumi.Input<inputs.device.ApUplinkPortConfig>;
    /**
     * USB AP settings Note: if native imagotag is enabled, BLE will be disabled automatically Note: legacy, new config moved
     * to ESL Config.
     */
    usbConfig?: pulumi.Input<inputs.device.ApUsbConfig>;
    /**
     * a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     */
    vars?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * x in pixel
     */
    x?: pulumi.Input<number>;
    /**
     * y in pixel
     */
    y?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Ap resource.
 */
export interface ApArgs {
    /**
     * Aeroscout AP settings
     */
    aeroscout?: pulumi.Input<inputs.device.ApAeroscout>;
    /**
     * BLE AP settings
     */
    bleConfig?: pulumi.Input<inputs.device.ApBleConfig>;
    centrak?: pulumi.Input<inputs.device.ApCentrak>;
    clientBridge?: pulumi.Input<inputs.device.ApClientBridge>;
    deviceId: pulumi.Input<string>;
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
    eslConfig?: pulumi.Input<inputs.device.ApEslConfig>;
    /**
     * height, in meters, optional
     */
    height?: pulumi.Input<number>;
    /**
     * IP AP settings
     */
    ipConfig?: pulumi.Input<inputs.device.ApIpConfig>;
    /**
     * LED AP settings
     */
    led?: pulumi.Input<inputs.device.ApLed>;
    /**
     * whether this map is considered locked down
     */
    locked?: pulumi.Input<boolean>;
    /**
     * map where the device belongs to
     */
    mapId?: pulumi.Input<string>;
    /**
     * Mesh AP settings
     */
    mesh?: pulumi.Input<inputs.device.ApMesh>;
    name?: pulumi.Input<string>;
    /**
     * any notes about this AP
     */
    notes?: pulumi.Input<string>;
    ntpServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * orientation, 0-359, in degrees, up is 0, right is 90.
     */
    orientation?: pulumi.Input<number>;
    /**
     * whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
     */
    poePassthrough?: pulumi.Input<boolean>;
    /**
     * power related configs
     */
    pwrConfig?: pulumi.Input<inputs.device.ApPwrConfig>;
    /**
     * Radio AP settings
     */
    radioConfig?: pulumi.Input<inputs.device.ApRadioConfig>;
    siteId: pulumi.Input<string>;
    uplinkPortConfig?: pulumi.Input<inputs.device.ApUplinkPortConfig>;
    /**
     * USB AP settings Note: if native imagotag is enabled, BLE will be disabled automatically Note: legacy, new config moved
     * to ESL Config.
     */
    usbConfig?: pulumi.Input<inputs.device.ApUsbConfig>;
    /**
     * a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     */
    vars?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * x in pixel
     */
    x?: pulumi.Input<number>;
    /**
     * y in pixel
     */
    y?: pulumi.Input<number>;
}
