// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This resource manages the Gateway Device Profiles (HUB Profiles).
 * A HUB profile is a configuration profile that automates the creation of overlay networks and defines the attributes of a hub device in a network. It includes settings for wan interfaces, lan interfaces, dns servers, traffic steering preferences, application policies, and routing options. HUB profiles are used to create consistent configurations for hub devices and ensure efficient connectivity between hubs and spokes in a network.
 *
 * The Gateway Devide Profile can be assigned to a gateway with the `junipermist.org.DeviceprofileAssign` resource.
 *
 * ## Import
 *
 * Using `pulumi import`, import `mist_org_deviceprofile_gateway` with:
 *
 * Device Profile can be imported by specifying the org_id and the deviceprofile_id
 *
 * ```sh
 * $ pulumi import junipermist:org/deviceprofileGateway:DeviceprofileGateway deviceprofile_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 */
export class DeviceprofileGateway extends pulumi.CustomResource {
    /**
     * Get an existing DeviceprofileGateway resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DeviceprofileGatewayState, opts?: pulumi.CustomResourceOptions): DeviceprofileGateway {
        return new DeviceprofileGateway(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:org/deviceprofileGateway:DeviceprofileGateway';

    /**
     * Returns true if the given object is an instance of DeviceprofileGateway.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DeviceprofileGateway {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DeviceprofileGateway.__pulumiType;
    }

    /**
     * additional CLI commands to append to the generated Junos config **Note**: no check is done
     */
    public readonly additionalConfigCmds!: pulumi.Output<string[] | undefined>;
    public readonly bgpConfig!: pulumi.Output<{[key: string]: outputs.org.DeviceprofileGatewayBgpConfig} | undefined>;
    public readonly createdTime!: pulumi.Output<number | undefined>;
    public readonly dhcpdConfig!: pulumi.Output<outputs.org.DeviceprofileGatewayDhcpdConfig | undefined>;
    public readonly dnsOverride!: pulumi.Output<boolean>;
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
    public readonly extraRoutes!: pulumi.Output<{[key: string]: outputs.org.DeviceprofileGatewayExtraRoutes} | undefined>;
    /**
     * Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
     */
    public readonly extraRoutes6!: pulumi.Output<{[key: string]: outputs.org.DeviceprofileGatewayExtraRoutes6} | undefined>;
    /**
     * Property key is the profile name
     */
    public readonly idpProfiles!: pulumi.Output<{[key: string]: outputs.org.DeviceprofileGatewayIdpProfiles} | undefined>;
    /**
     * Property key is the network name
     */
    public readonly ipConfigs!: pulumi.Output<{[key: string]: outputs.org.DeviceprofileGatewayIpConfigs} | undefined>;
    public readonly modifiedTime!: pulumi.Output<number | undefined>;
    public readonly name!: pulumi.Output<string>;
    public readonly networks!: pulumi.Output<outputs.org.DeviceprofileGatewayNetwork[] | undefined>;
    public readonly ntpOverride!: pulumi.Output<boolean>;
    /**
     * list of NTP servers specific to this device. By default, those in Site Settings will be used
     */
    public readonly ntpServers!: pulumi.Output<string[] | undefined>;
    /**
     * out-of-band (vme/em0/fxp0) IP config
     */
    public readonly oobIpConfig!: pulumi.Output<outputs.org.DeviceprofileGatewayOobIpConfig | undefined>;
    public readonly orgId!: pulumi.Output<string>;
    /**
     * Property key is the path name
     */
    public readonly pathPreferences!: pulumi.Output<{[key: string]: outputs.org.DeviceprofileGatewayPathPreferences} | undefined>;
    /**
     * Property key is the port(s) name or range (e.g. "ge-0/0/0-10")
     */
    public readonly portConfig!: pulumi.Output<{[key: string]: outputs.org.DeviceprofileGatewayPortConfig} | undefined>;
    /**
     * auto assigned if not set
     */
    public readonly routerId!: pulumi.Output<string | undefined>;
    /**
     * Property key is the routing policy name
     */
    public readonly routingPolicies!: pulumi.Output<{[key: string]: outputs.org.DeviceprofileGatewayRoutingPolicies} | undefined>;
    public readonly servicePolicies!: pulumi.Output<outputs.org.DeviceprofileGatewayServicePolicy[] | undefined>;
    /**
     * Property key is the tunnel name
     */
    public readonly tunnelConfigs!: pulumi.Output<{[key: string]: outputs.org.DeviceprofileGatewayTunnelConfigs} | undefined>;
    public readonly tunnelProviderOptions!: pulumi.Output<outputs.org.DeviceprofileGatewayTunnelProviderOptions | undefined>;
    /**
     * Device Type. enum: `gateway`
     */
    public /*out*/ readonly type!: pulumi.Output<string>;
    public readonly vrfConfig!: pulumi.Output<outputs.org.DeviceprofileGatewayVrfConfig | undefined>;
    /**
     * Property key is the network name
     */
    public readonly vrfInstances!: pulumi.Output<{[key: string]: outputs.org.DeviceprofileGatewayVrfInstances} | undefined>;

    /**
     * Create a DeviceprofileGateway resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DeviceprofileGatewayArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DeviceprofileGatewayArgs | DeviceprofileGatewayState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DeviceprofileGatewayState | undefined;
            resourceInputs["additionalConfigCmds"] = state ? state.additionalConfigCmds : undefined;
            resourceInputs["bgpConfig"] = state ? state.bgpConfig : undefined;
            resourceInputs["createdTime"] = state ? state.createdTime : undefined;
            resourceInputs["dhcpdConfig"] = state ? state.dhcpdConfig : undefined;
            resourceInputs["dnsOverride"] = state ? state.dnsOverride : undefined;
            resourceInputs["dnsServers"] = state ? state.dnsServers : undefined;
            resourceInputs["dnsSuffixes"] = state ? state.dnsSuffixes : undefined;
            resourceInputs["extraRoutes"] = state ? state.extraRoutes : undefined;
            resourceInputs["extraRoutes6"] = state ? state.extraRoutes6 : undefined;
            resourceInputs["idpProfiles"] = state ? state.idpProfiles : undefined;
            resourceInputs["ipConfigs"] = state ? state.ipConfigs : undefined;
            resourceInputs["modifiedTime"] = state ? state.modifiedTime : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networks"] = state ? state.networks : undefined;
            resourceInputs["ntpOverride"] = state ? state.ntpOverride : undefined;
            resourceInputs["ntpServers"] = state ? state.ntpServers : undefined;
            resourceInputs["oobIpConfig"] = state ? state.oobIpConfig : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["pathPreferences"] = state ? state.pathPreferences : undefined;
            resourceInputs["portConfig"] = state ? state.portConfig : undefined;
            resourceInputs["routerId"] = state ? state.routerId : undefined;
            resourceInputs["routingPolicies"] = state ? state.routingPolicies : undefined;
            resourceInputs["servicePolicies"] = state ? state.servicePolicies : undefined;
            resourceInputs["tunnelConfigs"] = state ? state.tunnelConfigs : undefined;
            resourceInputs["tunnelProviderOptions"] = state ? state.tunnelProviderOptions : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["vrfConfig"] = state ? state.vrfConfig : undefined;
            resourceInputs["vrfInstances"] = state ? state.vrfInstances : undefined;
        } else {
            const args = argsOrState as DeviceprofileGatewayArgs | undefined;
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            resourceInputs["additionalConfigCmds"] = args ? args.additionalConfigCmds : undefined;
            resourceInputs["bgpConfig"] = args ? args.bgpConfig : undefined;
            resourceInputs["createdTime"] = args ? args.createdTime : undefined;
            resourceInputs["dhcpdConfig"] = args ? args.dhcpdConfig : undefined;
            resourceInputs["dnsOverride"] = args ? args.dnsOverride : undefined;
            resourceInputs["dnsServers"] = args ? args.dnsServers : undefined;
            resourceInputs["dnsSuffixes"] = args ? args.dnsSuffixes : undefined;
            resourceInputs["extraRoutes"] = args ? args.extraRoutes : undefined;
            resourceInputs["extraRoutes6"] = args ? args.extraRoutes6 : undefined;
            resourceInputs["idpProfiles"] = args ? args.idpProfiles : undefined;
            resourceInputs["ipConfigs"] = args ? args.ipConfigs : undefined;
            resourceInputs["modifiedTime"] = args ? args.modifiedTime : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networks"] = args ? args.networks : undefined;
            resourceInputs["ntpOverride"] = args ? args.ntpOverride : undefined;
            resourceInputs["ntpServers"] = args ? args.ntpServers : undefined;
            resourceInputs["oobIpConfig"] = args ? args.oobIpConfig : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["pathPreferences"] = args ? args.pathPreferences : undefined;
            resourceInputs["portConfig"] = args ? args.portConfig : undefined;
            resourceInputs["routerId"] = args ? args.routerId : undefined;
            resourceInputs["routingPolicies"] = args ? args.routingPolicies : undefined;
            resourceInputs["servicePolicies"] = args ? args.servicePolicies : undefined;
            resourceInputs["tunnelConfigs"] = args ? args.tunnelConfigs : undefined;
            resourceInputs["tunnelProviderOptions"] = args ? args.tunnelProviderOptions : undefined;
            resourceInputs["vrfConfig"] = args ? args.vrfConfig : undefined;
            resourceInputs["vrfInstances"] = args ? args.vrfInstances : undefined;
            resourceInputs["type"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DeviceprofileGateway.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DeviceprofileGateway resources.
 */
export interface DeviceprofileGatewayState {
    /**
     * additional CLI commands to append to the generated Junos config **Note**: no check is done
     */
    additionalConfigCmds?: pulumi.Input<pulumi.Input<string>[]>;
    bgpConfig?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.DeviceprofileGatewayBgpConfig>}>;
    createdTime?: pulumi.Input<number>;
    dhcpdConfig?: pulumi.Input<inputs.org.DeviceprofileGatewayDhcpdConfig>;
    dnsOverride?: pulumi.Input<boolean>;
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
    extraRoutes?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.DeviceprofileGatewayExtraRoutes>}>;
    /**
     * Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
     */
    extraRoutes6?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.DeviceprofileGatewayExtraRoutes6>}>;
    /**
     * Property key is the profile name
     */
    idpProfiles?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.DeviceprofileGatewayIdpProfiles>}>;
    /**
     * Property key is the network name
     */
    ipConfigs?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.DeviceprofileGatewayIpConfigs>}>;
    modifiedTime?: pulumi.Input<number>;
    name?: pulumi.Input<string>;
    networks?: pulumi.Input<pulumi.Input<inputs.org.DeviceprofileGatewayNetwork>[]>;
    ntpOverride?: pulumi.Input<boolean>;
    /**
     * list of NTP servers specific to this device. By default, those in Site Settings will be used
     */
    ntpServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * out-of-band (vme/em0/fxp0) IP config
     */
    oobIpConfig?: pulumi.Input<inputs.org.DeviceprofileGatewayOobIpConfig>;
    orgId?: pulumi.Input<string>;
    /**
     * Property key is the path name
     */
    pathPreferences?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.DeviceprofileGatewayPathPreferences>}>;
    /**
     * Property key is the port(s) name or range (e.g. "ge-0/0/0-10")
     */
    portConfig?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.DeviceprofileGatewayPortConfig>}>;
    /**
     * auto assigned if not set
     */
    routerId?: pulumi.Input<string>;
    /**
     * Property key is the routing policy name
     */
    routingPolicies?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.DeviceprofileGatewayRoutingPolicies>}>;
    servicePolicies?: pulumi.Input<pulumi.Input<inputs.org.DeviceprofileGatewayServicePolicy>[]>;
    /**
     * Property key is the tunnel name
     */
    tunnelConfigs?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.DeviceprofileGatewayTunnelConfigs>}>;
    tunnelProviderOptions?: pulumi.Input<inputs.org.DeviceprofileGatewayTunnelProviderOptions>;
    /**
     * Device Type. enum: `gateway`
     */
    type?: pulumi.Input<string>;
    vrfConfig?: pulumi.Input<inputs.org.DeviceprofileGatewayVrfConfig>;
    /**
     * Property key is the network name
     */
    vrfInstances?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.DeviceprofileGatewayVrfInstances>}>;
}

/**
 * The set of arguments for constructing a DeviceprofileGateway resource.
 */
export interface DeviceprofileGatewayArgs {
    /**
     * additional CLI commands to append to the generated Junos config **Note**: no check is done
     */
    additionalConfigCmds?: pulumi.Input<pulumi.Input<string>[]>;
    bgpConfig?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.DeviceprofileGatewayBgpConfig>}>;
    createdTime?: pulumi.Input<number>;
    dhcpdConfig?: pulumi.Input<inputs.org.DeviceprofileGatewayDhcpdConfig>;
    dnsOverride?: pulumi.Input<boolean>;
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
    extraRoutes?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.DeviceprofileGatewayExtraRoutes>}>;
    /**
     * Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
     */
    extraRoutes6?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.DeviceprofileGatewayExtraRoutes6>}>;
    /**
     * Property key is the profile name
     */
    idpProfiles?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.DeviceprofileGatewayIdpProfiles>}>;
    /**
     * Property key is the network name
     */
    ipConfigs?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.DeviceprofileGatewayIpConfigs>}>;
    modifiedTime?: pulumi.Input<number>;
    name?: pulumi.Input<string>;
    networks?: pulumi.Input<pulumi.Input<inputs.org.DeviceprofileGatewayNetwork>[]>;
    ntpOverride?: pulumi.Input<boolean>;
    /**
     * list of NTP servers specific to this device. By default, those in Site Settings will be used
     */
    ntpServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * out-of-band (vme/em0/fxp0) IP config
     */
    oobIpConfig?: pulumi.Input<inputs.org.DeviceprofileGatewayOobIpConfig>;
    orgId: pulumi.Input<string>;
    /**
     * Property key is the path name
     */
    pathPreferences?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.DeviceprofileGatewayPathPreferences>}>;
    /**
     * Property key is the port(s) name or range (e.g. "ge-0/0/0-10")
     */
    portConfig?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.DeviceprofileGatewayPortConfig>}>;
    /**
     * auto assigned if not set
     */
    routerId?: pulumi.Input<string>;
    /**
     * Property key is the routing policy name
     */
    routingPolicies?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.DeviceprofileGatewayRoutingPolicies>}>;
    servicePolicies?: pulumi.Input<pulumi.Input<inputs.org.DeviceprofileGatewayServicePolicy>[]>;
    /**
     * Property key is the tunnel name
     */
    tunnelConfigs?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.DeviceprofileGatewayTunnelConfigs>}>;
    tunnelProviderOptions?: pulumi.Input<inputs.org.DeviceprofileGatewayTunnelProviderOptions>;
    vrfConfig?: pulumi.Input<inputs.org.DeviceprofileGatewayVrfConfig>;
    /**
     * Property key is the network name
     */
    vrfInstances?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.DeviceprofileGatewayVrfInstances>}>;
}
