// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This resource manages the Switch configuration.
 * It can be used to define specific configuration at the device level or to override Org/Site Network template settings.
 *
 * > **WARNING** For **adopted** devices, make sure to set `managed`=`true` to allow Mist to manage the switch
 *
 * ## Import
 *
 * Using `pulumi import`, import `mist_device_switch` with:
 *
 * Switch Configuration can be imported by specifying the site_id and the device_id
 *
 * ```sh
 * $ pulumi import junipermist:device/switch:Switch switch_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 */
export class Switch extends pulumi.CustomResource {
    /**
     * Get an existing Switch resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SwitchState, opts?: pulumi.CustomResourceOptions): Switch {
        return new Switch(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:device/switch:Switch';

    /**
     * Returns true if the given object is an instance of Switch.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Switch {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Switch.__pulumiType;
    }

    public readonly aclPolicies!: pulumi.Output<outputs.device.SwitchAclPolicy[] | undefined>;
    /**
     * ACL Tags to identify traffic source or destination. Key name is the tag name
     */
    public readonly aclTags!: pulumi.Output<{[key: string]: outputs.device.SwitchAclTags} | undefined>;
    /**
     * additional CLI commands to append to the generated Junos config. **Note**: no check is done
     */
    public readonly additionalConfigCmds!: pulumi.Output<string[] | undefined>;
    public readonly deviceId!: pulumi.Output<string>;
    public readonly dhcpSnooping!: pulumi.Output<outputs.device.SwitchDhcpSnooping | undefined>;
    public readonly dhcpdConfig!: pulumi.Output<outputs.device.SwitchDhcpdConfig | undefined>;
    /**
     * for a claimed switch, we control the configs by default. This option (disables the behavior)
     */
    public readonly disableAutoConfig!: pulumi.Output<boolean>;
    /**
     * Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
     */
    public readonly dnsServers!: pulumi.Output<string[] | undefined>;
    /**
     * Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
     */
    public readonly dnsSuffixes!: pulumi.Output<string[] | undefined>;
    public readonly extraRoutes!: pulumi.Output<{[key: string]: outputs.device.SwitchExtraRoutes} | undefined>;
    /**
     * Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
     */
    public readonly extraRoutes6!: pulumi.Output<{[key: string]: outputs.device.SwitchExtraRoutes6} | undefined>;
    public /*out*/ readonly image1Url!: pulumi.Output<string>;
    public /*out*/ readonly image2Url!: pulumi.Output<string>;
    public /*out*/ readonly image3Url!: pulumi.Output<string>;
    /**
     * Junos IP Config
     */
    public readonly ipConfig!: pulumi.Output<outputs.device.SwitchIpConfig | undefined>;
    /**
     * Local port override, overriding the port configuration from `portConfig`. Property key is the port name or range (e.g.
     * "ge-0/0/0-10")
     */
    public readonly localPortConfig!: pulumi.Output<{[key: string]: outputs.device.SwitchLocalPortConfig} | undefined>;
    /**
     * device MAC address
     */
    public /*out*/ readonly mac!: pulumi.Output<string>;
    /**
     * for an adopted switch, we don’t overwrite their existing configs automatically
     */
    public readonly managed!: pulumi.Output<boolean>;
    /**
     * map where the device belongs to
     */
    public readonly mapId!: pulumi.Output<string | undefined>;
    /**
     * enable mistNac to use radsec
     */
    public readonly mistNac!: pulumi.Output<outputs.device.SwitchMistNac | undefined>;
    /**
     * device Model
     */
    public /*out*/ readonly model!: pulumi.Output<string>;
    public readonly name!: pulumi.Output<string>;
    /**
     * Property key is network name
     */
    public readonly networks!: pulumi.Output<{[key: string]: outputs.device.SwitchNetworks} | undefined>;
    public readonly notes!: pulumi.Output<string | undefined>;
    /**
     * list of NTP servers specific to this device. By default, those in Site Settings will be used
     */
    public readonly ntpServers!: pulumi.Output<string[] | undefined>;
    /**
     * Switch OOB IP Config: - If HA configuration: key parameter will be nodeX (eg: node1) - If there are 2 routing engines,
     * re1 mgmt IP has to be set separately (if desired): key parameter = `re1`
     */
    public readonly oobIpConfig!: pulumi.Output<outputs.device.SwitchOobIpConfig | undefined>;
    public /*out*/ readonly orgId!: pulumi.Output<string>;
    /**
     * Junos OSPF areas
     */
    public readonly ospfAreas!: pulumi.Output<{[key: string]: outputs.device.SwitchOspfAreas} | undefined>;
    /**
     * Property key is the network name. Defines the additional IP Addresses configured on the device.
     */
    public readonly otherIpConfigs!: pulumi.Output<{[key: string]: outputs.device.SwitchOtherIpConfigs} | undefined>;
    /**
     * Property key is the port name or range (e.g. "ge-0/0/0-10")
     */
    public readonly portConfig!: pulumi.Output<{[key: string]: outputs.device.SwitchPortConfig} | undefined>;
    /**
     * Property key is the port mirroring instance name. `portMirroring` can be added under device/site settings. It takes
     * interface and ports as input for ingress, interface as input for egress and can take interface and port as output. A
     * maximum 4 port mirrorings is allowed
     */
    public readonly portMirroring!: pulumi.Output<{[key: string]: outputs.device.SwitchPortMirroring} | undefined>;
    /**
     * Property key is the port usage name. Defines the profiles of port configuration configured on the switch
     */
    public readonly portUsages!: pulumi.Output<{[key: string]: outputs.device.SwitchPortUsages} | undefined>;
    /**
     * Junos Radius config
     */
    public readonly radiusConfig!: pulumi.Output<outputs.device.SwitchRadiusConfig | undefined>;
    public readonly remoteSyslog!: pulumi.Output<outputs.device.SwitchRemoteSyslog | undefined>;
    public readonly role!: pulumi.Output<string | undefined>;
    /**
     * used for OSPF / BGP / EVPN
     */
    public readonly routerId!: pulumi.Output<string>;
    /**
     * device Serial
     */
    public /*out*/ readonly serial!: pulumi.Output<string>;
    public readonly siteId!: pulumi.Output<string>;
    public readonly snmpConfig!: pulumi.Output<outputs.device.SwitchSnmpConfig | undefined>;
    public readonly stpConfig!: pulumi.Output<outputs.device.SwitchStpConfig | undefined>;
    /**
     * Switch settings
     */
    public readonly switchMgmt!: pulumi.Output<outputs.device.SwitchSwitchMgmt | undefined>;
    /**
     * Device Type. enum: `switch`
     */
    public /*out*/ readonly type!: pulumi.Output<string>;
    /**
     * whether to use it for snmp / syslog / tacplus / radius
     */
    public readonly useRouterIdAsSourceIp!: pulumi.Output<boolean>;
    /**
     * a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     */
    public readonly vars!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * required for preprovisioned Virtual Chassis
     */
    public readonly virtualChassis!: pulumi.Output<outputs.device.SwitchVirtualChassis | undefined>;
    public readonly vrfConfig!: pulumi.Output<outputs.device.SwitchVrfConfig | undefined>;
    /**
     * Property key is the network name
     */
    public readonly vrfInstances!: pulumi.Output<{[key: string]: outputs.device.SwitchVrfInstances} | undefined>;
    /**
     * Junos VRRP config
     */
    public readonly vrrpConfig!: pulumi.Output<outputs.device.SwitchVrrpConfig | undefined>;
    /**
     * x in pixel
     */
    public readonly x!: pulumi.Output<number | undefined>;
    /**
     * y in pixel
     */
    public readonly y!: pulumi.Output<number | undefined>;

    /**
     * Create a Switch resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SwitchArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SwitchArgs | SwitchState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SwitchState | undefined;
            resourceInputs["aclPolicies"] = state ? state.aclPolicies : undefined;
            resourceInputs["aclTags"] = state ? state.aclTags : undefined;
            resourceInputs["additionalConfigCmds"] = state ? state.additionalConfigCmds : undefined;
            resourceInputs["deviceId"] = state ? state.deviceId : undefined;
            resourceInputs["dhcpSnooping"] = state ? state.dhcpSnooping : undefined;
            resourceInputs["dhcpdConfig"] = state ? state.dhcpdConfig : undefined;
            resourceInputs["disableAutoConfig"] = state ? state.disableAutoConfig : undefined;
            resourceInputs["dnsServers"] = state ? state.dnsServers : undefined;
            resourceInputs["dnsSuffixes"] = state ? state.dnsSuffixes : undefined;
            resourceInputs["extraRoutes"] = state ? state.extraRoutes : undefined;
            resourceInputs["extraRoutes6"] = state ? state.extraRoutes6 : undefined;
            resourceInputs["image1Url"] = state ? state.image1Url : undefined;
            resourceInputs["image2Url"] = state ? state.image2Url : undefined;
            resourceInputs["image3Url"] = state ? state.image3Url : undefined;
            resourceInputs["ipConfig"] = state ? state.ipConfig : undefined;
            resourceInputs["localPortConfig"] = state ? state.localPortConfig : undefined;
            resourceInputs["mac"] = state ? state.mac : undefined;
            resourceInputs["managed"] = state ? state.managed : undefined;
            resourceInputs["mapId"] = state ? state.mapId : undefined;
            resourceInputs["mistNac"] = state ? state.mistNac : undefined;
            resourceInputs["model"] = state ? state.model : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networks"] = state ? state.networks : undefined;
            resourceInputs["notes"] = state ? state.notes : undefined;
            resourceInputs["ntpServers"] = state ? state.ntpServers : undefined;
            resourceInputs["oobIpConfig"] = state ? state.oobIpConfig : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["ospfAreas"] = state ? state.ospfAreas : undefined;
            resourceInputs["otherIpConfigs"] = state ? state.otherIpConfigs : undefined;
            resourceInputs["portConfig"] = state ? state.portConfig : undefined;
            resourceInputs["portMirroring"] = state ? state.portMirroring : undefined;
            resourceInputs["portUsages"] = state ? state.portUsages : undefined;
            resourceInputs["radiusConfig"] = state ? state.radiusConfig : undefined;
            resourceInputs["remoteSyslog"] = state ? state.remoteSyslog : undefined;
            resourceInputs["role"] = state ? state.role : undefined;
            resourceInputs["routerId"] = state ? state.routerId : undefined;
            resourceInputs["serial"] = state ? state.serial : undefined;
            resourceInputs["siteId"] = state ? state.siteId : undefined;
            resourceInputs["snmpConfig"] = state ? state.snmpConfig : undefined;
            resourceInputs["stpConfig"] = state ? state.stpConfig : undefined;
            resourceInputs["switchMgmt"] = state ? state.switchMgmt : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["useRouterIdAsSourceIp"] = state ? state.useRouterIdAsSourceIp : undefined;
            resourceInputs["vars"] = state ? state.vars : undefined;
            resourceInputs["virtualChassis"] = state ? state.virtualChassis : undefined;
            resourceInputs["vrfConfig"] = state ? state.vrfConfig : undefined;
            resourceInputs["vrfInstances"] = state ? state.vrfInstances : undefined;
            resourceInputs["vrrpConfig"] = state ? state.vrrpConfig : undefined;
            resourceInputs["x"] = state ? state.x : undefined;
            resourceInputs["y"] = state ? state.y : undefined;
        } else {
            const args = argsOrState as SwitchArgs | undefined;
            if ((!args || args.deviceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deviceId'");
            }
            if ((!args || args.siteId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'siteId'");
            }
            resourceInputs["aclPolicies"] = args ? args.aclPolicies : undefined;
            resourceInputs["aclTags"] = args ? args.aclTags : undefined;
            resourceInputs["additionalConfigCmds"] = args ? args.additionalConfigCmds : undefined;
            resourceInputs["deviceId"] = args ? args.deviceId : undefined;
            resourceInputs["dhcpSnooping"] = args ? args.dhcpSnooping : undefined;
            resourceInputs["dhcpdConfig"] = args ? args.dhcpdConfig : undefined;
            resourceInputs["disableAutoConfig"] = args ? args.disableAutoConfig : undefined;
            resourceInputs["dnsServers"] = args ? args.dnsServers : undefined;
            resourceInputs["dnsSuffixes"] = args ? args.dnsSuffixes : undefined;
            resourceInputs["extraRoutes"] = args ? args.extraRoutes : undefined;
            resourceInputs["extraRoutes6"] = args ? args.extraRoutes6 : undefined;
            resourceInputs["ipConfig"] = args ? args.ipConfig : undefined;
            resourceInputs["localPortConfig"] = args ? args.localPortConfig : undefined;
            resourceInputs["managed"] = args ? args.managed : undefined;
            resourceInputs["mapId"] = args ? args.mapId : undefined;
            resourceInputs["mistNac"] = args ? args.mistNac : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networks"] = args ? args.networks : undefined;
            resourceInputs["notes"] = args ? args.notes : undefined;
            resourceInputs["ntpServers"] = args ? args.ntpServers : undefined;
            resourceInputs["oobIpConfig"] = args ? args.oobIpConfig : undefined;
            resourceInputs["ospfAreas"] = args ? args.ospfAreas : undefined;
            resourceInputs["otherIpConfigs"] = args ? args.otherIpConfigs : undefined;
            resourceInputs["portConfig"] = args ? args.portConfig : undefined;
            resourceInputs["portMirroring"] = args ? args.portMirroring : undefined;
            resourceInputs["portUsages"] = args ? args.portUsages : undefined;
            resourceInputs["radiusConfig"] = args ? args.radiusConfig : undefined;
            resourceInputs["remoteSyslog"] = args ? args.remoteSyslog : undefined;
            resourceInputs["role"] = args ? args.role : undefined;
            resourceInputs["routerId"] = args ? args.routerId : undefined;
            resourceInputs["siteId"] = args ? args.siteId : undefined;
            resourceInputs["snmpConfig"] = args ? args.snmpConfig : undefined;
            resourceInputs["stpConfig"] = args ? args.stpConfig : undefined;
            resourceInputs["switchMgmt"] = args ? args.switchMgmt : undefined;
            resourceInputs["useRouterIdAsSourceIp"] = args ? args.useRouterIdAsSourceIp : undefined;
            resourceInputs["vars"] = args ? args.vars : undefined;
            resourceInputs["virtualChassis"] = args ? args.virtualChassis : undefined;
            resourceInputs["vrfConfig"] = args ? args.vrfConfig : undefined;
            resourceInputs["vrfInstances"] = args ? args.vrfInstances : undefined;
            resourceInputs["vrrpConfig"] = args ? args.vrrpConfig : undefined;
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
        super(Switch.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Switch resources.
 */
export interface SwitchState {
    aclPolicies?: pulumi.Input<pulumi.Input<inputs.device.SwitchAclPolicy>[]>;
    /**
     * ACL Tags to identify traffic source or destination. Key name is the tag name
     */
    aclTags?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.SwitchAclTags>}>;
    /**
     * additional CLI commands to append to the generated Junos config. **Note**: no check is done
     */
    additionalConfigCmds?: pulumi.Input<pulumi.Input<string>[]>;
    deviceId?: pulumi.Input<string>;
    dhcpSnooping?: pulumi.Input<inputs.device.SwitchDhcpSnooping>;
    dhcpdConfig?: pulumi.Input<inputs.device.SwitchDhcpdConfig>;
    /**
     * for a claimed switch, we control the configs by default. This option (disables the behavior)
     */
    disableAutoConfig?: pulumi.Input<boolean>;
    /**
     * Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
     */
    dnsServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
     */
    dnsSuffixes?: pulumi.Input<pulumi.Input<string>[]>;
    extraRoutes?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.SwitchExtraRoutes>}>;
    /**
     * Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
     */
    extraRoutes6?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.SwitchExtraRoutes6>}>;
    image1Url?: pulumi.Input<string>;
    image2Url?: pulumi.Input<string>;
    image3Url?: pulumi.Input<string>;
    /**
     * Junos IP Config
     */
    ipConfig?: pulumi.Input<inputs.device.SwitchIpConfig>;
    /**
     * Local port override, overriding the port configuration from `portConfig`. Property key is the port name or range (e.g.
     * "ge-0/0/0-10")
     */
    localPortConfig?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.SwitchLocalPortConfig>}>;
    /**
     * device MAC address
     */
    mac?: pulumi.Input<string>;
    /**
     * for an adopted switch, we don’t overwrite their existing configs automatically
     */
    managed?: pulumi.Input<boolean>;
    /**
     * map where the device belongs to
     */
    mapId?: pulumi.Input<string>;
    /**
     * enable mistNac to use radsec
     */
    mistNac?: pulumi.Input<inputs.device.SwitchMistNac>;
    /**
     * device Model
     */
    model?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    /**
     * Property key is network name
     */
    networks?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.SwitchNetworks>}>;
    notes?: pulumi.Input<string>;
    /**
     * list of NTP servers specific to this device. By default, those in Site Settings will be used
     */
    ntpServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Switch OOB IP Config: - If HA configuration: key parameter will be nodeX (eg: node1) - If there are 2 routing engines,
     * re1 mgmt IP has to be set separately (if desired): key parameter = `re1`
     */
    oobIpConfig?: pulumi.Input<inputs.device.SwitchOobIpConfig>;
    orgId?: pulumi.Input<string>;
    /**
     * Junos OSPF areas
     */
    ospfAreas?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.SwitchOspfAreas>}>;
    /**
     * Property key is the network name. Defines the additional IP Addresses configured on the device.
     */
    otherIpConfigs?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.SwitchOtherIpConfigs>}>;
    /**
     * Property key is the port name or range (e.g. "ge-0/0/0-10")
     */
    portConfig?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.SwitchPortConfig>}>;
    /**
     * Property key is the port mirroring instance name. `portMirroring` can be added under device/site settings. It takes
     * interface and ports as input for ingress, interface as input for egress and can take interface and port as output. A
     * maximum 4 port mirrorings is allowed
     */
    portMirroring?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.SwitchPortMirroring>}>;
    /**
     * Property key is the port usage name. Defines the profiles of port configuration configured on the switch
     */
    portUsages?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.SwitchPortUsages>}>;
    /**
     * Junos Radius config
     */
    radiusConfig?: pulumi.Input<inputs.device.SwitchRadiusConfig>;
    remoteSyslog?: pulumi.Input<inputs.device.SwitchRemoteSyslog>;
    role?: pulumi.Input<string>;
    /**
     * used for OSPF / BGP / EVPN
     */
    routerId?: pulumi.Input<string>;
    /**
     * device Serial
     */
    serial?: pulumi.Input<string>;
    siteId?: pulumi.Input<string>;
    snmpConfig?: pulumi.Input<inputs.device.SwitchSnmpConfig>;
    stpConfig?: pulumi.Input<inputs.device.SwitchStpConfig>;
    /**
     * Switch settings
     */
    switchMgmt?: pulumi.Input<inputs.device.SwitchSwitchMgmt>;
    /**
     * Device Type. enum: `switch`
     */
    type?: pulumi.Input<string>;
    /**
     * whether to use it for snmp / syslog / tacplus / radius
     */
    useRouterIdAsSourceIp?: pulumi.Input<boolean>;
    /**
     * a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     */
    vars?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * required for preprovisioned Virtual Chassis
     */
    virtualChassis?: pulumi.Input<inputs.device.SwitchVirtualChassis>;
    vrfConfig?: pulumi.Input<inputs.device.SwitchVrfConfig>;
    /**
     * Property key is the network name
     */
    vrfInstances?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.SwitchVrfInstances>}>;
    /**
     * Junos VRRP config
     */
    vrrpConfig?: pulumi.Input<inputs.device.SwitchVrrpConfig>;
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
 * The set of arguments for constructing a Switch resource.
 */
export interface SwitchArgs {
    aclPolicies?: pulumi.Input<pulumi.Input<inputs.device.SwitchAclPolicy>[]>;
    /**
     * ACL Tags to identify traffic source or destination. Key name is the tag name
     */
    aclTags?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.SwitchAclTags>}>;
    /**
     * additional CLI commands to append to the generated Junos config. **Note**: no check is done
     */
    additionalConfigCmds?: pulumi.Input<pulumi.Input<string>[]>;
    deviceId: pulumi.Input<string>;
    dhcpSnooping?: pulumi.Input<inputs.device.SwitchDhcpSnooping>;
    dhcpdConfig?: pulumi.Input<inputs.device.SwitchDhcpdConfig>;
    /**
     * for a claimed switch, we control the configs by default. This option (disables the behavior)
     */
    disableAutoConfig?: pulumi.Input<boolean>;
    /**
     * Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
     */
    dnsServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
     */
    dnsSuffixes?: pulumi.Input<pulumi.Input<string>[]>;
    extraRoutes?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.SwitchExtraRoutes>}>;
    /**
     * Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
     */
    extraRoutes6?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.SwitchExtraRoutes6>}>;
    /**
     * Junos IP Config
     */
    ipConfig?: pulumi.Input<inputs.device.SwitchIpConfig>;
    /**
     * Local port override, overriding the port configuration from `portConfig`. Property key is the port name or range (e.g.
     * "ge-0/0/0-10")
     */
    localPortConfig?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.SwitchLocalPortConfig>}>;
    /**
     * for an adopted switch, we don’t overwrite their existing configs automatically
     */
    managed?: pulumi.Input<boolean>;
    /**
     * map where the device belongs to
     */
    mapId?: pulumi.Input<string>;
    /**
     * enable mistNac to use radsec
     */
    mistNac?: pulumi.Input<inputs.device.SwitchMistNac>;
    name?: pulumi.Input<string>;
    /**
     * Property key is network name
     */
    networks?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.SwitchNetworks>}>;
    notes?: pulumi.Input<string>;
    /**
     * list of NTP servers specific to this device. By default, those in Site Settings will be used
     */
    ntpServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Switch OOB IP Config: - If HA configuration: key parameter will be nodeX (eg: node1) - If there are 2 routing engines,
     * re1 mgmt IP has to be set separately (if desired): key parameter = `re1`
     */
    oobIpConfig?: pulumi.Input<inputs.device.SwitchOobIpConfig>;
    /**
     * Junos OSPF areas
     */
    ospfAreas?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.SwitchOspfAreas>}>;
    /**
     * Property key is the network name. Defines the additional IP Addresses configured on the device.
     */
    otherIpConfigs?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.SwitchOtherIpConfigs>}>;
    /**
     * Property key is the port name or range (e.g. "ge-0/0/0-10")
     */
    portConfig?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.SwitchPortConfig>}>;
    /**
     * Property key is the port mirroring instance name. `portMirroring` can be added under device/site settings. It takes
     * interface and ports as input for ingress, interface as input for egress and can take interface and port as output. A
     * maximum 4 port mirrorings is allowed
     */
    portMirroring?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.SwitchPortMirroring>}>;
    /**
     * Property key is the port usage name. Defines the profiles of port configuration configured on the switch
     */
    portUsages?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.SwitchPortUsages>}>;
    /**
     * Junos Radius config
     */
    radiusConfig?: pulumi.Input<inputs.device.SwitchRadiusConfig>;
    remoteSyslog?: pulumi.Input<inputs.device.SwitchRemoteSyslog>;
    role?: pulumi.Input<string>;
    /**
     * used for OSPF / BGP / EVPN
     */
    routerId?: pulumi.Input<string>;
    siteId: pulumi.Input<string>;
    snmpConfig?: pulumi.Input<inputs.device.SwitchSnmpConfig>;
    stpConfig?: pulumi.Input<inputs.device.SwitchStpConfig>;
    /**
     * Switch settings
     */
    switchMgmt?: pulumi.Input<inputs.device.SwitchSwitchMgmt>;
    /**
     * whether to use it for snmp / syslog / tacplus / radius
     */
    useRouterIdAsSourceIp?: pulumi.Input<boolean>;
    /**
     * a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     */
    vars?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * required for preprovisioned Virtual Chassis
     */
    virtualChassis?: pulumi.Input<inputs.device.SwitchVirtualChassis>;
    vrfConfig?: pulumi.Input<inputs.device.SwitchVrfConfig>;
    /**
     * Property key is the network name
     */
    vrfInstances?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.SwitchVrfInstances>}>;
    /**
     * Junos VRRP config
     */
    vrrpConfig?: pulumi.Input<inputs.device.SwitchVrrpConfig>;
    /**
     * x in pixel
     */
    x?: pulumi.Input<number>;
    /**
     * y in pixel
     */
    y?: pulumi.Input<number>;
}
