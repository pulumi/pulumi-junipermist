// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This resource manages the Gateway configuration.It can be used to define specific configuration at the device level or to override Org Gateway template settings.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const gatewayOne = new junipermist.device.Gateway("gateway_one", {
 *     name: "gateway_one",
 *     deviceId: clusterOne.deviceId,
 *     siteId: clusterOne.siteId,
 *     oobIpConfig: {
 *         type: "dhcp",
 *     },
 *     dnsServers: ["8.8.8.8"],
 *     additionalConfigCmds: [
 *         "annotate system \" -- custom-main -- Template level --\"",
 *         "delete apply-groups custom-main",
 *         "delete groups custom-main",
 *         "set groups custom-main",
 *         "set groups custom-main system services ssh root-login allow",
 *         "set apply-groups custom-main",
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import junipermist:device/gateway:Gateway Using terraform import, import `mist_device_gateway` using the `import` command:
 * ```
 *
 * Gateway cluster can be imported by specifying the site_id and the device_id
 *
 * ```sh
 * $ pulumi import junipermist:device/gateway:Gateway gateway_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 *
 * In Terraform v1.5.0 and later, use an import block to import `mist_device_gateway` with `id={site_id}.{device_id}`:
 *
 * tf
 *
 * import {
 *
 *   to = mist_device_gateway.gateway_one
 *
 *   id = "17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309"
 *
 * }
 */
export class Gateway extends pulumi.CustomResource {
    /**
     * Get an existing Gateway resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GatewayState, opts?: pulumi.CustomResourceOptions): Gateway {
        return new Gateway(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:device/gateway:Gateway';

    /**
     * Returns true if the given object is an instance of Gateway.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Gateway {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Gateway.__pulumiType;
    }

    /**
     * additional CLI commands to append to the generated Junos config **Note**: no check is done
     */
    public readonly additionalConfigCmds!: pulumi.Output<string[] | undefined>;
    public readonly bgpConfig!: pulumi.Output<{[key: string]: outputs.device.GatewayBgpConfig} | undefined>;
    public readonly deviceId!: pulumi.Output<string>;
    public /*out*/ readonly deviceprofileId!: pulumi.Output<string>;
    public readonly dhcpdConfig!: pulumi.Output<outputs.device.GatewayDhcpdConfig | undefined>;
    /**
     * Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
     */
    public readonly dnsServers!: pulumi.Output<string[] | undefined>;
    /**
     * Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
     */
    public readonly dnsSuffixes!: pulumi.Output<string[] | undefined>;
    /**
     * Property key is the destination CIDR (e.g. "10.0.0.0/8")
     */
    public readonly extraRoutes!: pulumi.Output<{[key: string]: outputs.device.GatewayExtraRoutes} | undefined>;
    /**
     * Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
     */
    public readonly extraRoutes6!: pulumi.Output<{[key: string]: outputs.device.GatewayExtraRoutes6} | undefined>;
    /**
     * Property key is the profile name
     */
    public readonly idpProfiles!: pulumi.Output<{[key: string]: outputs.device.GatewayIdpProfiles} | undefined>;
    public /*out*/ readonly image1Url!: pulumi.Output<string>;
    public /*out*/ readonly image2Url!: pulumi.Output<string>;
    public /*out*/ readonly image3Url!: pulumi.Output<string>;
    /**
     * Property key is the network name
     */
    public readonly ipConfigs!: pulumi.Output<{[key: string]: outputs.device.GatewayIpConfigs} | undefined>;
    /**
     * device MAC address
     */
    public /*out*/ readonly mac!: pulumi.Output<string>;
    public readonly managed!: pulumi.Output<boolean | undefined>;
    /**
     * map where the device belongs to
     */
    public readonly mapId!: pulumi.Output<string | undefined>;
    /**
     * device Model
     */
    public /*out*/ readonly model!: pulumi.Output<string>;
    public readonly mspId!: pulumi.Output<string | undefined>;
    public readonly name!: pulumi.Output<string>;
    public readonly networks!: pulumi.Output<outputs.device.GatewayNetwork[] | undefined>;
    public readonly notes!: pulumi.Output<string | undefined>;
    public readonly ntpServers!: pulumi.Output<string[] | undefined>;
    /**
     * out-of-band (vme/em0/fxp0) IP config
     */
    public readonly oobIpConfig!: pulumi.Output<outputs.device.GatewayOobIpConfig | undefined>;
    public /*out*/ readonly orgId!: pulumi.Output<string>;
    /**
     * Property key is the path name
     */
    public readonly pathPreferences!: pulumi.Output<{[key: string]: outputs.device.GatewayPathPreferences} | undefined>;
    /**
     * Property key is the port name or range (e.g. "ge-0/0/0-10")
     */
    public readonly portConfig!: pulumi.Output<{[key: string]: outputs.device.GatewayPortConfig} | undefined>;
    public readonly portMirroring!: pulumi.Output<outputs.device.GatewayPortMirroring | undefined>;
    /**
     * auto assigned if not set
     */
    public readonly routerId!: pulumi.Output<string | undefined>;
    /**
     * Property key is the routing policy name
     */
    public readonly routingPolicies!: pulumi.Output<{[key: string]: outputs.device.GatewayRoutingPolicies} | undefined>;
    /**
     * device Serial
     */
    public /*out*/ readonly serial!: pulumi.Output<string>;
    public readonly servicePolicies!: pulumi.Output<outputs.device.GatewayServicePolicy[] | undefined>;
    public readonly siteId!: pulumi.Output<string>;
    /**
     * Property key is the tunnel name
     */
    public readonly tunnelConfigs!: pulumi.Output<{[key: string]: outputs.device.GatewayTunnelConfigs} | undefined>;
    public readonly tunnelProviderOptions!: pulumi.Output<outputs.device.GatewayTunnelProviderOptions | undefined>;
    /**
     * Device Type. enum: `gateway`
     */
    public /*out*/ readonly type!: pulumi.Output<string>;
    /**
     * a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     */
    public readonly vars!: pulumi.Output<{[key: string]: string} | undefined>;
    public readonly vrfConfig!: pulumi.Output<outputs.device.GatewayVrfConfig | undefined>;
    /**
     * Property key is the network name
     */
    public readonly vrfInstances!: pulumi.Output<{[key: string]: outputs.device.GatewayVrfInstances} | undefined>;
    /**
     * x in pixel
     */
    public readonly x!: pulumi.Output<number | undefined>;
    /**
     * y in pixel
     */
    public readonly y!: pulumi.Output<number | undefined>;

    /**
     * Create a Gateway resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GatewayArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GatewayArgs | GatewayState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GatewayState | undefined;
            resourceInputs["additionalConfigCmds"] = state ? state.additionalConfigCmds : undefined;
            resourceInputs["bgpConfig"] = state ? state.bgpConfig : undefined;
            resourceInputs["deviceId"] = state ? state.deviceId : undefined;
            resourceInputs["deviceprofileId"] = state ? state.deviceprofileId : undefined;
            resourceInputs["dhcpdConfig"] = state ? state.dhcpdConfig : undefined;
            resourceInputs["dnsServers"] = state ? state.dnsServers : undefined;
            resourceInputs["dnsSuffixes"] = state ? state.dnsSuffixes : undefined;
            resourceInputs["extraRoutes"] = state ? state.extraRoutes : undefined;
            resourceInputs["extraRoutes6"] = state ? state.extraRoutes6 : undefined;
            resourceInputs["idpProfiles"] = state ? state.idpProfiles : undefined;
            resourceInputs["image1Url"] = state ? state.image1Url : undefined;
            resourceInputs["image2Url"] = state ? state.image2Url : undefined;
            resourceInputs["image3Url"] = state ? state.image3Url : undefined;
            resourceInputs["ipConfigs"] = state ? state.ipConfigs : undefined;
            resourceInputs["mac"] = state ? state.mac : undefined;
            resourceInputs["managed"] = state ? state.managed : undefined;
            resourceInputs["mapId"] = state ? state.mapId : undefined;
            resourceInputs["model"] = state ? state.model : undefined;
            resourceInputs["mspId"] = state ? state.mspId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networks"] = state ? state.networks : undefined;
            resourceInputs["notes"] = state ? state.notes : undefined;
            resourceInputs["ntpServers"] = state ? state.ntpServers : undefined;
            resourceInputs["oobIpConfig"] = state ? state.oobIpConfig : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["pathPreferences"] = state ? state.pathPreferences : undefined;
            resourceInputs["portConfig"] = state ? state.portConfig : undefined;
            resourceInputs["portMirroring"] = state ? state.portMirroring : undefined;
            resourceInputs["routerId"] = state ? state.routerId : undefined;
            resourceInputs["routingPolicies"] = state ? state.routingPolicies : undefined;
            resourceInputs["serial"] = state ? state.serial : undefined;
            resourceInputs["servicePolicies"] = state ? state.servicePolicies : undefined;
            resourceInputs["siteId"] = state ? state.siteId : undefined;
            resourceInputs["tunnelConfigs"] = state ? state.tunnelConfigs : undefined;
            resourceInputs["tunnelProviderOptions"] = state ? state.tunnelProviderOptions : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["vars"] = state ? state.vars : undefined;
            resourceInputs["vrfConfig"] = state ? state.vrfConfig : undefined;
            resourceInputs["vrfInstances"] = state ? state.vrfInstances : undefined;
            resourceInputs["x"] = state ? state.x : undefined;
            resourceInputs["y"] = state ? state.y : undefined;
        } else {
            const args = argsOrState as GatewayArgs | undefined;
            if ((!args || args.deviceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deviceId'");
            }
            if ((!args || args.siteId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'siteId'");
            }
            resourceInputs["additionalConfigCmds"] = args ? args.additionalConfigCmds : undefined;
            resourceInputs["bgpConfig"] = args ? args.bgpConfig : undefined;
            resourceInputs["deviceId"] = args ? args.deviceId : undefined;
            resourceInputs["dhcpdConfig"] = args ? args.dhcpdConfig : undefined;
            resourceInputs["dnsServers"] = args ? args.dnsServers : undefined;
            resourceInputs["dnsSuffixes"] = args ? args.dnsSuffixes : undefined;
            resourceInputs["extraRoutes"] = args ? args.extraRoutes : undefined;
            resourceInputs["extraRoutes6"] = args ? args.extraRoutes6 : undefined;
            resourceInputs["idpProfiles"] = args ? args.idpProfiles : undefined;
            resourceInputs["ipConfigs"] = args ? args.ipConfigs : undefined;
            resourceInputs["managed"] = args ? args.managed : undefined;
            resourceInputs["mapId"] = args ? args.mapId : undefined;
            resourceInputs["mspId"] = args ? args.mspId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networks"] = args ? args.networks : undefined;
            resourceInputs["notes"] = args ? args.notes : undefined;
            resourceInputs["ntpServers"] = args ? args.ntpServers : undefined;
            resourceInputs["oobIpConfig"] = args ? args.oobIpConfig : undefined;
            resourceInputs["pathPreferences"] = args ? args.pathPreferences : undefined;
            resourceInputs["portConfig"] = args ? args.portConfig : undefined;
            resourceInputs["portMirroring"] = args ? args.portMirroring : undefined;
            resourceInputs["routerId"] = args ? args.routerId : undefined;
            resourceInputs["routingPolicies"] = args ? args.routingPolicies : undefined;
            resourceInputs["servicePolicies"] = args ? args.servicePolicies : undefined;
            resourceInputs["siteId"] = args ? args.siteId : undefined;
            resourceInputs["tunnelConfigs"] = args ? args.tunnelConfigs : undefined;
            resourceInputs["tunnelProviderOptions"] = args ? args.tunnelProviderOptions : undefined;
            resourceInputs["vars"] = args ? args.vars : undefined;
            resourceInputs["vrfConfig"] = args ? args.vrfConfig : undefined;
            resourceInputs["vrfInstances"] = args ? args.vrfInstances : undefined;
            resourceInputs["x"] = args ? args.x : undefined;
            resourceInputs["y"] = args ? args.y : undefined;
            resourceInputs["deviceprofileId"] = undefined /*out*/;
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
        super(Gateway.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Gateway resources.
 */
export interface GatewayState {
    /**
     * additional CLI commands to append to the generated Junos config **Note**: no check is done
     */
    additionalConfigCmds?: pulumi.Input<pulumi.Input<string>[]>;
    bgpConfig?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.GatewayBgpConfig>}>;
    deviceId?: pulumi.Input<string>;
    deviceprofileId?: pulumi.Input<string>;
    dhcpdConfig?: pulumi.Input<inputs.device.GatewayDhcpdConfig>;
    /**
     * Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
     */
    dnsServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
     */
    dnsSuffixes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Property key is the destination CIDR (e.g. "10.0.0.0/8")
     */
    extraRoutes?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.GatewayExtraRoutes>}>;
    /**
     * Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
     */
    extraRoutes6?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.GatewayExtraRoutes6>}>;
    /**
     * Property key is the profile name
     */
    idpProfiles?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.GatewayIdpProfiles>}>;
    image1Url?: pulumi.Input<string>;
    image2Url?: pulumi.Input<string>;
    image3Url?: pulumi.Input<string>;
    /**
     * Property key is the network name
     */
    ipConfigs?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.GatewayIpConfigs>}>;
    /**
     * device MAC address
     */
    mac?: pulumi.Input<string>;
    managed?: pulumi.Input<boolean>;
    /**
     * map where the device belongs to
     */
    mapId?: pulumi.Input<string>;
    /**
     * device Model
     */
    model?: pulumi.Input<string>;
    mspId?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    networks?: pulumi.Input<pulumi.Input<inputs.device.GatewayNetwork>[]>;
    notes?: pulumi.Input<string>;
    ntpServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * out-of-band (vme/em0/fxp0) IP config
     */
    oobIpConfig?: pulumi.Input<inputs.device.GatewayOobIpConfig>;
    orgId?: pulumi.Input<string>;
    /**
     * Property key is the path name
     */
    pathPreferences?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.GatewayPathPreferences>}>;
    /**
     * Property key is the port name or range (e.g. "ge-0/0/0-10")
     */
    portConfig?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.GatewayPortConfig>}>;
    portMirroring?: pulumi.Input<inputs.device.GatewayPortMirroring>;
    /**
     * auto assigned if not set
     */
    routerId?: pulumi.Input<string>;
    /**
     * Property key is the routing policy name
     */
    routingPolicies?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.GatewayRoutingPolicies>}>;
    /**
     * device Serial
     */
    serial?: pulumi.Input<string>;
    servicePolicies?: pulumi.Input<pulumi.Input<inputs.device.GatewayServicePolicy>[]>;
    siteId?: pulumi.Input<string>;
    /**
     * Property key is the tunnel name
     */
    tunnelConfigs?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.GatewayTunnelConfigs>}>;
    tunnelProviderOptions?: pulumi.Input<inputs.device.GatewayTunnelProviderOptions>;
    /**
     * Device Type. enum: `gateway`
     */
    type?: pulumi.Input<string>;
    /**
     * a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     */
    vars?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    vrfConfig?: pulumi.Input<inputs.device.GatewayVrfConfig>;
    /**
     * Property key is the network name
     */
    vrfInstances?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.GatewayVrfInstances>}>;
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
 * The set of arguments for constructing a Gateway resource.
 */
export interface GatewayArgs {
    /**
     * additional CLI commands to append to the generated Junos config **Note**: no check is done
     */
    additionalConfigCmds?: pulumi.Input<pulumi.Input<string>[]>;
    bgpConfig?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.GatewayBgpConfig>}>;
    deviceId: pulumi.Input<string>;
    dhcpdConfig?: pulumi.Input<inputs.device.GatewayDhcpdConfig>;
    /**
     * Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
     */
    dnsServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
     */
    dnsSuffixes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Property key is the destination CIDR (e.g. "10.0.0.0/8")
     */
    extraRoutes?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.GatewayExtraRoutes>}>;
    /**
     * Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
     */
    extraRoutes6?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.GatewayExtraRoutes6>}>;
    /**
     * Property key is the profile name
     */
    idpProfiles?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.GatewayIdpProfiles>}>;
    /**
     * Property key is the network name
     */
    ipConfigs?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.GatewayIpConfigs>}>;
    managed?: pulumi.Input<boolean>;
    /**
     * map where the device belongs to
     */
    mapId?: pulumi.Input<string>;
    mspId?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    networks?: pulumi.Input<pulumi.Input<inputs.device.GatewayNetwork>[]>;
    notes?: pulumi.Input<string>;
    ntpServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * out-of-band (vme/em0/fxp0) IP config
     */
    oobIpConfig?: pulumi.Input<inputs.device.GatewayOobIpConfig>;
    /**
     * Property key is the path name
     */
    pathPreferences?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.GatewayPathPreferences>}>;
    /**
     * Property key is the port name or range (e.g. "ge-0/0/0-10")
     */
    portConfig?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.GatewayPortConfig>}>;
    portMirroring?: pulumi.Input<inputs.device.GatewayPortMirroring>;
    /**
     * auto assigned if not set
     */
    routerId?: pulumi.Input<string>;
    /**
     * Property key is the routing policy name
     */
    routingPolicies?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.GatewayRoutingPolicies>}>;
    servicePolicies?: pulumi.Input<pulumi.Input<inputs.device.GatewayServicePolicy>[]>;
    siteId: pulumi.Input<string>;
    /**
     * Property key is the tunnel name
     */
    tunnelConfigs?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.GatewayTunnelConfigs>}>;
    tunnelProviderOptions?: pulumi.Input<inputs.device.GatewayTunnelProviderOptions>;
    /**
     * a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     */
    vars?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    vrfConfig?: pulumi.Input<inputs.device.GatewayVrfConfig>;
    /**
     * Property key is the network name
     */
    vrfInstances?: pulumi.Input<{[key: string]: pulumi.Input<inputs.device.GatewayVrfInstances>}>;
    /**
     * x in pixel
     */
    x?: pulumi.Input<number>;
    /**
     * y in pixel
     */
    y?: pulumi.Input<number>;
}
