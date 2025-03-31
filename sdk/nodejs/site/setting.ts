// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This resource manages the Site Settings.
 *
 * The Site Settings can be used to customize the Site configuration and assign Site Variables (Sites Variables can be reused in configuration templates)
 *
 * > When using the Mist APIs, all the switch settings defined at the site level are stored under the site settings with all the rest of the site configuration (`/api/v1/sites/{site_id}/setting` Mist API Endpoint). To simplify this resource, all the site level switches related settings are moved into the `junipermist.site.Networktemplate` resource
 *
 * !> Only ONE `junipermist.site.Setting` resource can be configured per site. If multiple ones are configured, only the last one defined we be successfully deployed to Mist
 *
 * ## Import
 *
 * Using `pulumi import`, import `mist_site_setting` with:
 *
 * Site Setting can be imported by specifying the site_id
 *
 * ```sh
 * $ pulumi import junipermist:site/setting:Setting site_setting_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a
 * ```
 */
export class Setting extends pulumi.CustomResource {
    /**
     * Get an existing Setting resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SettingState, opts?: pulumi.CustomResourceOptions): Setting {
        return new Setting(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:site/setting:Setting';

    /**
     * Returns true if the given object is an instance of Setting.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Setting {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Setting.__pulumiType;
    }

    public readonly analytic!: pulumi.Output<outputs.site.SettingAnalytic | undefined>;
    /**
     * Enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and
     * `deviceUpdownThreshold` is ignored.
     */
    public readonly apUpdownThreshold!: pulumi.Output<number>;
    /**
     * Auto Upgrade Settings
     */
    public readonly autoUpgrade!: pulumi.Output<outputs.site.SettingAutoUpgrade | undefined>;
    public /*out*/ readonly blacklistUrl!: pulumi.Output<string>;
    /**
     * BLE AP settings
     */
    public readonly bleConfig!: pulumi.Output<outputs.site.SettingBleConfig | undefined>;
    /**
     * Whether to enable ap auto config revert
     */
    public readonly configAutoRevert!: pulumi.Output<boolean>;
    /**
     * Mist also uses some heuristic rules to prevent destructive configs from being pushed
     */
    public readonly configPushPolicy!: pulumi.Output<outputs.site.SettingConfigPushPolicy | undefined>;
    /**
     * You can define some URLs that's critical to site operations the latency will be captured and considered for site health
     */
    public readonly criticalUrlMonitoring!: pulumi.Output<outputs.site.SettingCriticalUrlMonitoring | undefined>;
    /**
     * By default, device_updown_threshold, if set, will apply to all devices types if different values for specific device
     * type is desired, use the following
     */
    public readonly deviceUpdownThreshold!: pulumi.Output<number>;
    public readonly enableUnii4!: pulumi.Output<boolean>;
    /**
     * **Note**: if hours does not exist, it's treated as everyday of the week, 00:00-23:59. Currently, we don't allow multiple
     * ranges for the same day
     */
    public readonly engagement!: pulumi.Output<outputs.site.SettingEngagement | undefined>;
    /**
     * Gateway Site settings
     */
    public readonly gatewayMgmt!: pulumi.Output<outputs.site.SettingGatewayMgmt | undefined>;
    /**
     * Enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
     * `deviceUpdownThreshold` is ignored.
     */
    public readonly gatewayUpdownThreshold!: pulumi.Output<number>;
    public readonly juniperSrx!: pulumi.Output<outputs.site.SettingJuniperSrx | undefined>;
    /**
     * LED AP settings
     */
    public readonly led!: pulumi.Output<outputs.site.SettingLed | undefined>;
    /**
     * Occupancy Analytics settings
     */
    public readonly occupancy!: pulumi.Output<outputs.site.SettingOccupancy | undefined>;
    /**
     * Whether to store the config on AP
     */
    public readonly persistConfigOnDevice!: pulumi.Output<boolean>;
    /**
     * Proxy Configuration to talk to Mist
     */
    public readonly proxy!: pulumi.Output<outputs.site.SettingProxy | undefined>;
    /**
     * By default, when we configure a device, we only clean up config we generate. Remove existing configs if enabled
     */
    public readonly removeExistingConfigs!: pulumi.Output<boolean>;
    /**
     * Whether AP should periodically connect to BLE devices and report GATT device info (device name, manufacturer name,
     * serial number, battery %, temperature, humidity)
     */
    public readonly reportGatt!: pulumi.Output<boolean>;
    /**
     * Rogue site settings
     */
    public readonly rogue!: pulumi.Output<outputs.site.SettingRogue | undefined>;
    /**
     * Managed mobility
     */
    public readonly rtsa!: pulumi.Output<outputs.site.SettingRtsa | undefined>;
    /**
     * Set of heuristic rules will be enabled when marvis subscription is not available. It triggers when, in a Z minute
     * window, there are more than Y distinct client encountering over X failures
     */
    public readonly simpleAlert!: pulumi.Output<outputs.site.SettingSimpleAlert | undefined>;
    public readonly siteId!: pulumi.Output<string>;
    public readonly skyatp!: pulumi.Output<outputs.site.SettingSkyatp | undefined>;
    public readonly srxApp!: pulumi.Output<outputs.site.SettingSrxApp | undefined>;
    /**
     * When limitSshAccess = true in Org Setting, list of SSH public keys provided by Mist Support to install onto APs (see
     * Org:Setting)
     */
    public readonly sshKeys!: pulumi.Output<string[]>;
    public readonly ssr!: pulumi.Output<outputs.site.SettingSsr | undefined>;
    /**
     * Enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
     * `deviceUpdownThreshold` is ignored.
     */
    public readonly switchUpdownThreshold!: pulumi.Output<number>;
    public readonly syntheticTest!: pulumi.Output<outputs.site.SettingSyntheticTest | undefined>;
    /**
     * Whether to track anonymous BLE assets (requires ‘track_asset’ enabled)
     */
    public readonly trackAnonymousDevices!: pulumi.Output<boolean>;
    /**
     * AP Uplink port configuration
     */
    public readonly uplinkPortConfig!: pulumi.Output<outputs.site.SettingUplinkPortConfig | undefined>;
    /**
     * Dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     */
    public readonly vars!: pulumi.Output<{[key: string]: string} | undefined>;
    public readonly vna!: pulumi.Output<outputs.site.SettingVna | undefined>;
    /**
     * Optional, for EX9200 only to segregate virtual-switches. Property key is the instance name
     */
    public readonly vsInstance!: pulumi.Output<{[key: string]: outputs.site.SettingVsInstance} | undefined>;
    public readonly wanVna!: pulumi.Output<outputs.site.SettingWanVna | undefined>;
    public /*out*/ readonly watchedStationUrl!: pulumi.Output<string>;
    public /*out*/ readonly whitelistUrl!: pulumi.Output<string>;
    /**
     * WIDS site settings
     */
    public readonly wids!: pulumi.Output<outputs.site.SettingWids | undefined>;
    /**
     * Wi-Fi site settings
     */
    public readonly wifi!: pulumi.Output<outputs.site.SettingWifi | undefined>;
    public readonly wiredVna!: pulumi.Output<outputs.site.SettingWiredVna | undefined>;
    /**
     * Zone Occupancy alert site settings
     */
    public readonly zoneOccupancyAlert!: pulumi.Output<outputs.site.SettingZoneOccupancyAlert | undefined>;

    /**
     * Create a Setting resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SettingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SettingArgs | SettingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SettingState | undefined;
            resourceInputs["analytic"] = state ? state.analytic : undefined;
            resourceInputs["apUpdownThreshold"] = state ? state.apUpdownThreshold : undefined;
            resourceInputs["autoUpgrade"] = state ? state.autoUpgrade : undefined;
            resourceInputs["blacklistUrl"] = state ? state.blacklistUrl : undefined;
            resourceInputs["bleConfig"] = state ? state.bleConfig : undefined;
            resourceInputs["configAutoRevert"] = state ? state.configAutoRevert : undefined;
            resourceInputs["configPushPolicy"] = state ? state.configPushPolicy : undefined;
            resourceInputs["criticalUrlMonitoring"] = state ? state.criticalUrlMonitoring : undefined;
            resourceInputs["deviceUpdownThreshold"] = state ? state.deviceUpdownThreshold : undefined;
            resourceInputs["enableUnii4"] = state ? state.enableUnii4 : undefined;
            resourceInputs["engagement"] = state ? state.engagement : undefined;
            resourceInputs["gatewayMgmt"] = state ? state.gatewayMgmt : undefined;
            resourceInputs["gatewayUpdownThreshold"] = state ? state.gatewayUpdownThreshold : undefined;
            resourceInputs["juniperSrx"] = state ? state.juniperSrx : undefined;
            resourceInputs["led"] = state ? state.led : undefined;
            resourceInputs["occupancy"] = state ? state.occupancy : undefined;
            resourceInputs["persistConfigOnDevice"] = state ? state.persistConfigOnDevice : undefined;
            resourceInputs["proxy"] = state ? state.proxy : undefined;
            resourceInputs["removeExistingConfigs"] = state ? state.removeExistingConfigs : undefined;
            resourceInputs["reportGatt"] = state ? state.reportGatt : undefined;
            resourceInputs["rogue"] = state ? state.rogue : undefined;
            resourceInputs["rtsa"] = state ? state.rtsa : undefined;
            resourceInputs["simpleAlert"] = state ? state.simpleAlert : undefined;
            resourceInputs["siteId"] = state ? state.siteId : undefined;
            resourceInputs["skyatp"] = state ? state.skyatp : undefined;
            resourceInputs["srxApp"] = state ? state.srxApp : undefined;
            resourceInputs["sshKeys"] = state ? state.sshKeys : undefined;
            resourceInputs["ssr"] = state ? state.ssr : undefined;
            resourceInputs["switchUpdownThreshold"] = state ? state.switchUpdownThreshold : undefined;
            resourceInputs["syntheticTest"] = state ? state.syntheticTest : undefined;
            resourceInputs["trackAnonymousDevices"] = state ? state.trackAnonymousDevices : undefined;
            resourceInputs["uplinkPortConfig"] = state ? state.uplinkPortConfig : undefined;
            resourceInputs["vars"] = state ? state.vars : undefined;
            resourceInputs["vna"] = state ? state.vna : undefined;
            resourceInputs["vsInstance"] = state ? state.vsInstance : undefined;
            resourceInputs["wanVna"] = state ? state.wanVna : undefined;
            resourceInputs["watchedStationUrl"] = state ? state.watchedStationUrl : undefined;
            resourceInputs["whitelistUrl"] = state ? state.whitelistUrl : undefined;
            resourceInputs["wids"] = state ? state.wids : undefined;
            resourceInputs["wifi"] = state ? state.wifi : undefined;
            resourceInputs["wiredVna"] = state ? state.wiredVna : undefined;
            resourceInputs["zoneOccupancyAlert"] = state ? state.zoneOccupancyAlert : undefined;
        } else {
            const args = argsOrState as SettingArgs | undefined;
            if ((!args || args.siteId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'siteId'");
            }
            resourceInputs["analytic"] = args ? args.analytic : undefined;
            resourceInputs["apUpdownThreshold"] = args ? args.apUpdownThreshold : undefined;
            resourceInputs["autoUpgrade"] = args ? args.autoUpgrade : undefined;
            resourceInputs["bleConfig"] = args ? args.bleConfig : undefined;
            resourceInputs["configAutoRevert"] = args ? args.configAutoRevert : undefined;
            resourceInputs["configPushPolicy"] = args ? args.configPushPolicy : undefined;
            resourceInputs["criticalUrlMonitoring"] = args ? args.criticalUrlMonitoring : undefined;
            resourceInputs["deviceUpdownThreshold"] = args ? args.deviceUpdownThreshold : undefined;
            resourceInputs["enableUnii4"] = args ? args.enableUnii4 : undefined;
            resourceInputs["engagement"] = args ? args.engagement : undefined;
            resourceInputs["gatewayMgmt"] = args ? args.gatewayMgmt : undefined;
            resourceInputs["gatewayUpdownThreshold"] = args ? args.gatewayUpdownThreshold : undefined;
            resourceInputs["juniperSrx"] = args ? args.juniperSrx : undefined;
            resourceInputs["led"] = args ? args.led : undefined;
            resourceInputs["occupancy"] = args ? args.occupancy : undefined;
            resourceInputs["persistConfigOnDevice"] = args ? args.persistConfigOnDevice : undefined;
            resourceInputs["proxy"] = args ? args.proxy : undefined;
            resourceInputs["removeExistingConfigs"] = args ? args.removeExistingConfigs : undefined;
            resourceInputs["reportGatt"] = args ? args.reportGatt : undefined;
            resourceInputs["rogue"] = args ? args.rogue : undefined;
            resourceInputs["rtsa"] = args ? args.rtsa : undefined;
            resourceInputs["simpleAlert"] = args ? args.simpleAlert : undefined;
            resourceInputs["siteId"] = args ? args.siteId : undefined;
            resourceInputs["skyatp"] = args ? args.skyatp : undefined;
            resourceInputs["srxApp"] = args ? args.srxApp : undefined;
            resourceInputs["sshKeys"] = args ? args.sshKeys : undefined;
            resourceInputs["ssr"] = args ? args.ssr : undefined;
            resourceInputs["switchUpdownThreshold"] = args ? args.switchUpdownThreshold : undefined;
            resourceInputs["syntheticTest"] = args ? args.syntheticTest : undefined;
            resourceInputs["trackAnonymousDevices"] = args ? args.trackAnonymousDevices : undefined;
            resourceInputs["uplinkPortConfig"] = args ? args.uplinkPortConfig : undefined;
            resourceInputs["vars"] = args ? args.vars : undefined;
            resourceInputs["vna"] = args ? args.vna : undefined;
            resourceInputs["vsInstance"] = args ? args.vsInstance : undefined;
            resourceInputs["wanVna"] = args ? args.wanVna : undefined;
            resourceInputs["wids"] = args ? args.wids : undefined;
            resourceInputs["wifi"] = args ? args.wifi : undefined;
            resourceInputs["wiredVna"] = args ? args.wiredVna : undefined;
            resourceInputs["zoneOccupancyAlert"] = args ? args.zoneOccupancyAlert : undefined;
            resourceInputs["blacklistUrl"] = undefined /*out*/;
            resourceInputs["watchedStationUrl"] = undefined /*out*/;
            resourceInputs["whitelistUrl"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Setting.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Setting resources.
 */
export interface SettingState {
    analytic?: pulumi.Input<inputs.site.SettingAnalytic>;
    /**
     * Enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and
     * `deviceUpdownThreshold` is ignored.
     */
    apUpdownThreshold?: pulumi.Input<number>;
    /**
     * Auto Upgrade Settings
     */
    autoUpgrade?: pulumi.Input<inputs.site.SettingAutoUpgrade>;
    blacklistUrl?: pulumi.Input<string>;
    /**
     * BLE AP settings
     */
    bleConfig?: pulumi.Input<inputs.site.SettingBleConfig>;
    /**
     * Whether to enable ap auto config revert
     */
    configAutoRevert?: pulumi.Input<boolean>;
    /**
     * Mist also uses some heuristic rules to prevent destructive configs from being pushed
     */
    configPushPolicy?: pulumi.Input<inputs.site.SettingConfigPushPolicy>;
    /**
     * You can define some URLs that's critical to site operations the latency will be captured and considered for site health
     */
    criticalUrlMonitoring?: pulumi.Input<inputs.site.SettingCriticalUrlMonitoring>;
    /**
     * By default, device_updown_threshold, if set, will apply to all devices types if different values for specific device
     * type is desired, use the following
     */
    deviceUpdownThreshold?: pulumi.Input<number>;
    enableUnii4?: pulumi.Input<boolean>;
    /**
     * **Note**: if hours does not exist, it's treated as everyday of the week, 00:00-23:59. Currently, we don't allow multiple
     * ranges for the same day
     */
    engagement?: pulumi.Input<inputs.site.SettingEngagement>;
    /**
     * Gateway Site settings
     */
    gatewayMgmt?: pulumi.Input<inputs.site.SettingGatewayMgmt>;
    /**
     * Enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
     * `deviceUpdownThreshold` is ignored.
     */
    gatewayUpdownThreshold?: pulumi.Input<number>;
    juniperSrx?: pulumi.Input<inputs.site.SettingJuniperSrx>;
    /**
     * LED AP settings
     */
    led?: pulumi.Input<inputs.site.SettingLed>;
    /**
     * Occupancy Analytics settings
     */
    occupancy?: pulumi.Input<inputs.site.SettingOccupancy>;
    /**
     * Whether to store the config on AP
     */
    persistConfigOnDevice?: pulumi.Input<boolean>;
    /**
     * Proxy Configuration to talk to Mist
     */
    proxy?: pulumi.Input<inputs.site.SettingProxy>;
    /**
     * By default, when we configure a device, we only clean up config we generate. Remove existing configs if enabled
     */
    removeExistingConfigs?: pulumi.Input<boolean>;
    /**
     * Whether AP should periodically connect to BLE devices and report GATT device info (device name, manufacturer name,
     * serial number, battery %, temperature, humidity)
     */
    reportGatt?: pulumi.Input<boolean>;
    /**
     * Rogue site settings
     */
    rogue?: pulumi.Input<inputs.site.SettingRogue>;
    /**
     * Managed mobility
     */
    rtsa?: pulumi.Input<inputs.site.SettingRtsa>;
    /**
     * Set of heuristic rules will be enabled when marvis subscription is not available. It triggers when, in a Z minute
     * window, there are more than Y distinct client encountering over X failures
     */
    simpleAlert?: pulumi.Input<inputs.site.SettingSimpleAlert>;
    siteId?: pulumi.Input<string>;
    skyatp?: pulumi.Input<inputs.site.SettingSkyatp>;
    srxApp?: pulumi.Input<inputs.site.SettingSrxApp>;
    /**
     * When limitSshAccess = true in Org Setting, list of SSH public keys provided by Mist Support to install onto APs (see
     * Org:Setting)
     */
    sshKeys?: pulumi.Input<pulumi.Input<string>[]>;
    ssr?: pulumi.Input<inputs.site.SettingSsr>;
    /**
     * Enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
     * `deviceUpdownThreshold` is ignored.
     */
    switchUpdownThreshold?: pulumi.Input<number>;
    syntheticTest?: pulumi.Input<inputs.site.SettingSyntheticTest>;
    /**
     * Whether to track anonymous BLE assets (requires ‘track_asset’ enabled)
     */
    trackAnonymousDevices?: pulumi.Input<boolean>;
    /**
     * AP Uplink port configuration
     */
    uplinkPortConfig?: pulumi.Input<inputs.site.SettingUplinkPortConfig>;
    /**
     * Dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     */
    vars?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    vna?: pulumi.Input<inputs.site.SettingVna>;
    /**
     * Optional, for EX9200 only to segregate virtual-switches. Property key is the instance name
     */
    vsInstance?: pulumi.Input<{[key: string]: pulumi.Input<inputs.site.SettingVsInstance>}>;
    wanVna?: pulumi.Input<inputs.site.SettingWanVna>;
    watchedStationUrl?: pulumi.Input<string>;
    whitelistUrl?: pulumi.Input<string>;
    /**
     * WIDS site settings
     */
    wids?: pulumi.Input<inputs.site.SettingWids>;
    /**
     * Wi-Fi site settings
     */
    wifi?: pulumi.Input<inputs.site.SettingWifi>;
    wiredVna?: pulumi.Input<inputs.site.SettingWiredVna>;
    /**
     * Zone Occupancy alert site settings
     */
    zoneOccupancyAlert?: pulumi.Input<inputs.site.SettingZoneOccupancyAlert>;
}

/**
 * The set of arguments for constructing a Setting resource.
 */
export interface SettingArgs {
    analytic?: pulumi.Input<inputs.site.SettingAnalytic>;
    /**
     * Enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and
     * `deviceUpdownThreshold` is ignored.
     */
    apUpdownThreshold?: pulumi.Input<number>;
    /**
     * Auto Upgrade Settings
     */
    autoUpgrade?: pulumi.Input<inputs.site.SettingAutoUpgrade>;
    /**
     * BLE AP settings
     */
    bleConfig?: pulumi.Input<inputs.site.SettingBleConfig>;
    /**
     * Whether to enable ap auto config revert
     */
    configAutoRevert?: pulumi.Input<boolean>;
    /**
     * Mist also uses some heuristic rules to prevent destructive configs from being pushed
     */
    configPushPolicy?: pulumi.Input<inputs.site.SettingConfigPushPolicy>;
    /**
     * You can define some URLs that's critical to site operations the latency will be captured and considered for site health
     */
    criticalUrlMonitoring?: pulumi.Input<inputs.site.SettingCriticalUrlMonitoring>;
    /**
     * By default, device_updown_threshold, if set, will apply to all devices types if different values for specific device
     * type is desired, use the following
     */
    deviceUpdownThreshold?: pulumi.Input<number>;
    enableUnii4?: pulumi.Input<boolean>;
    /**
     * **Note**: if hours does not exist, it's treated as everyday of the week, 00:00-23:59. Currently, we don't allow multiple
     * ranges for the same day
     */
    engagement?: pulumi.Input<inputs.site.SettingEngagement>;
    /**
     * Gateway Site settings
     */
    gatewayMgmt?: pulumi.Input<inputs.site.SettingGatewayMgmt>;
    /**
     * Enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
     * `deviceUpdownThreshold` is ignored.
     */
    gatewayUpdownThreshold?: pulumi.Input<number>;
    juniperSrx?: pulumi.Input<inputs.site.SettingJuniperSrx>;
    /**
     * LED AP settings
     */
    led?: pulumi.Input<inputs.site.SettingLed>;
    /**
     * Occupancy Analytics settings
     */
    occupancy?: pulumi.Input<inputs.site.SettingOccupancy>;
    /**
     * Whether to store the config on AP
     */
    persistConfigOnDevice?: pulumi.Input<boolean>;
    /**
     * Proxy Configuration to talk to Mist
     */
    proxy?: pulumi.Input<inputs.site.SettingProxy>;
    /**
     * By default, when we configure a device, we only clean up config we generate. Remove existing configs if enabled
     */
    removeExistingConfigs?: pulumi.Input<boolean>;
    /**
     * Whether AP should periodically connect to BLE devices and report GATT device info (device name, manufacturer name,
     * serial number, battery %, temperature, humidity)
     */
    reportGatt?: pulumi.Input<boolean>;
    /**
     * Rogue site settings
     */
    rogue?: pulumi.Input<inputs.site.SettingRogue>;
    /**
     * Managed mobility
     */
    rtsa?: pulumi.Input<inputs.site.SettingRtsa>;
    /**
     * Set of heuristic rules will be enabled when marvis subscription is not available. It triggers when, in a Z minute
     * window, there are more than Y distinct client encountering over X failures
     */
    simpleAlert?: pulumi.Input<inputs.site.SettingSimpleAlert>;
    siteId: pulumi.Input<string>;
    skyatp?: pulumi.Input<inputs.site.SettingSkyatp>;
    srxApp?: pulumi.Input<inputs.site.SettingSrxApp>;
    /**
     * When limitSshAccess = true in Org Setting, list of SSH public keys provided by Mist Support to install onto APs (see
     * Org:Setting)
     */
    sshKeys?: pulumi.Input<pulumi.Input<string>[]>;
    ssr?: pulumi.Input<inputs.site.SettingSsr>;
    /**
     * Enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
     * `deviceUpdownThreshold` is ignored.
     */
    switchUpdownThreshold?: pulumi.Input<number>;
    syntheticTest?: pulumi.Input<inputs.site.SettingSyntheticTest>;
    /**
     * Whether to track anonymous BLE assets (requires ‘track_asset’ enabled)
     */
    trackAnonymousDevices?: pulumi.Input<boolean>;
    /**
     * AP Uplink port configuration
     */
    uplinkPortConfig?: pulumi.Input<inputs.site.SettingUplinkPortConfig>;
    /**
     * Dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     */
    vars?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    vna?: pulumi.Input<inputs.site.SettingVna>;
    /**
     * Optional, for EX9200 only to segregate virtual-switches. Property key is the instance name
     */
    vsInstance?: pulumi.Input<{[key: string]: pulumi.Input<inputs.site.SettingVsInstance>}>;
    wanVna?: pulumi.Input<inputs.site.SettingWanVna>;
    /**
     * WIDS site settings
     */
    wids?: pulumi.Input<inputs.site.SettingWids>;
    /**
     * Wi-Fi site settings
     */
    wifi?: pulumi.Input<inputs.site.SettingWifi>;
    wiredVna?: pulumi.Input<inputs.site.SettingWiredVna>;
    /**
     * Zone Occupancy alert site settings
     */
    zoneOccupancyAlert?: pulumi.Input<inputs.site.SettingZoneOccupancyAlert>;
}
