// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This resource manages the Site Network configuration (Switch configuration).The Site Network template can be used to override the Org Network template assign to the site, or to configure common switch settings accross the site without having to create an Org Network template.
 *
 * ## Import
 *
 * Using `pulumi import`, import `mist_site_networktemplate` with:
 *
 * Site Network Template can be imported by specifying the site_id
 *
 * ```sh
 * $ pulumi import junipermist:site/networktemplate:Networktemplate networktemplate_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a
 * ```
 */
export class Networktemplate extends pulumi.CustomResource {
    /**
     * Get an existing Networktemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworktemplateState, opts?: pulumi.CustomResourceOptions): Networktemplate {
        return new Networktemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:site/networktemplate:Networktemplate';

    /**
     * Returns true if the given object is an instance of Networktemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Networktemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Networktemplate.__pulumiType;
    }

    public readonly aclPolicies!: pulumi.Output<outputs.site.NetworktemplateAclPolicy[] | undefined>;
    /**
     * ACL Tags to identify traffic source or destination. Key name is the tag name
     */
    public readonly aclTags!: pulumi.Output<{[key: string]: outputs.site.NetworktemplateAclTags} | undefined>;
    /**
     * additional CLI commands to append to the generated Junos config **Note**: no check is done
     */
    public readonly additionalConfigCmds!: pulumi.Output<string[] | undefined>;
    public readonly dhcpSnooping!: pulumi.Output<outputs.site.NetworktemplateDhcpSnooping | undefined>;
    /**
     * Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
     */
    public readonly dnsServers!: pulumi.Output<string[] | undefined>;
    /**
     * Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
     */
    public readonly dnsSuffixes!: pulumi.Output<string[] | undefined>;
    public readonly extraRoutes!: pulumi.Output<{[key: string]: outputs.site.NetworktemplateExtraRoutes} | undefined>;
    /**
     * Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
     */
    public readonly extraRoutes6!: pulumi.Output<{[key: string]: outputs.site.NetworktemplateExtraRoutes6} | undefined>;
    /**
     * enable mistNac to use radsec
     */
    public readonly mistNac!: pulumi.Output<outputs.site.NetworktemplateMistNac | undefined>;
    /**
     * Property key is network name
     */
    public readonly networks!: pulumi.Output<{[key: string]: outputs.site.NetworktemplateNetworks} | undefined>;
    /**
     * list of NTP servers
     */
    public readonly ntpServers!: pulumi.Output<string[] | undefined>;
    /**
     * Property key is the port mirroring instance name portMirroring can be added under device/site settings. It takes
     * interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
     */
    public readonly portMirroring!: pulumi.Output<{[key: string]: outputs.site.NetworktemplatePortMirroring} | undefined>;
    public readonly portUsages!: pulumi.Output<{[key: string]: outputs.site.NetworktemplatePortUsages} | undefined>;
    /**
     * Junos Radius config
     */
    public readonly radiusConfig!: pulumi.Output<outputs.site.NetworktemplateRadiusConfig | undefined>;
    public readonly remoteSyslog!: pulumi.Output<outputs.site.NetworktemplateRemoteSyslog | undefined>;
    /**
     * by default, when we configure a device, we only clean up config we generates. Remove existing configs if enabled
     */
    public readonly removeExistingConfigs!: pulumi.Output<boolean>;
    public readonly siteId!: pulumi.Output<string>;
    public readonly snmpConfig!: pulumi.Output<outputs.site.NetworktemplateSnmpConfig | undefined>;
    /**
     * Switch template
     */
    public readonly switchMatching!: pulumi.Output<outputs.site.NetworktemplateSwitchMatching | undefined>;
    /**
     * Switch settings
     */
    public readonly switchMgmt!: pulumi.Output<outputs.site.NetworktemplateSwitchMgmt | undefined>;
    public readonly uplinkPortConfig!: pulumi.Output<outputs.site.NetworktemplateUplinkPortConfig | undefined>;
    public readonly vrfConfig!: pulumi.Output<outputs.site.NetworktemplateVrfConfig | undefined>;
    /**
     * Property key is the network name
     */
    public readonly vrfInstances!: pulumi.Output<{[key: string]: outputs.site.NetworktemplateVrfInstances} | undefined>;

    /**
     * Create a Networktemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworktemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworktemplateArgs | NetworktemplateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetworktemplateState | undefined;
            resourceInputs["aclPolicies"] = state ? state.aclPolicies : undefined;
            resourceInputs["aclTags"] = state ? state.aclTags : undefined;
            resourceInputs["additionalConfigCmds"] = state ? state.additionalConfigCmds : undefined;
            resourceInputs["dhcpSnooping"] = state ? state.dhcpSnooping : undefined;
            resourceInputs["dnsServers"] = state ? state.dnsServers : undefined;
            resourceInputs["dnsSuffixes"] = state ? state.dnsSuffixes : undefined;
            resourceInputs["extraRoutes"] = state ? state.extraRoutes : undefined;
            resourceInputs["extraRoutes6"] = state ? state.extraRoutes6 : undefined;
            resourceInputs["mistNac"] = state ? state.mistNac : undefined;
            resourceInputs["networks"] = state ? state.networks : undefined;
            resourceInputs["ntpServers"] = state ? state.ntpServers : undefined;
            resourceInputs["portMirroring"] = state ? state.portMirroring : undefined;
            resourceInputs["portUsages"] = state ? state.portUsages : undefined;
            resourceInputs["radiusConfig"] = state ? state.radiusConfig : undefined;
            resourceInputs["remoteSyslog"] = state ? state.remoteSyslog : undefined;
            resourceInputs["removeExistingConfigs"] = state ? state.removeExistingConfigs : undefined;
            resourceInputs["siteId"] = state ? state.siteId : undefined;
            resourceInputs["snmpConfig"] = state ? state.snmpConfig : undefined;
            resourceInputs["switchMatching"] = state ? state.switchMatching : undefined;
            resourceInputs["switchMgmt"] = state ? state.switchMgmt : undefined;
            resourceInputs["uplinkPortConfig"] = state ? state.uplinkPortConfig : undefined;
            resourceInputs["vrfConfig"] = state ? state.vrfConfig : undefined;
            resourceInputs["vrfInstances"] = state ? state.vrfInstances : undefined;
        } else {
            const args = argsOrState as NetworktemplateArgs | undefined;
            if ((!args || args.siteId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'siteId'");
            }
            resourceInputs["aclPolicies"] = args ? args.aclPolicies : undefined;
            resourceInputs["aclTags"] = args ? args.aclTags : undefined;
            resourceInputs["additionalConfigCmds"] = args ? args.additionalConfigCmds : undefined;
            resourceInputs["dhcpSnooping"] = args ? args.dhcpSnooping : undefined;
            resourceInputs["dnsServers"] = args ? args.dnsServers : undefined;
            resourceInputs["dnsSuffixes"] = args ? args.dnsSuffixes : undefined;
            resourceInputs["extraRoutes"] = args ? args.extraRoutes : undefined;
            resourceInputs["extraRoutes6"] = args ? args.extraRoutes6 : undefined;
            resourceInputs["mistNac"] = args ? args.mistNac : undefined;
            resourceInputs["networks"] = args ? args.networks : undefined;
            resourceInputs["ntpServers"] = args ? args.ntpServers : undefined;
            resourceInputs["portMirroring"] = args ? args.portMirroring : undefined;
            resourceInputs["portUsages"] = args ? args.portUsages : undefined;
            resourceInputs["radiusConfig"] = args ? args.radiusConfig : undefined;
            resourceInputs["remoteSyslog"] = args ? args.remoteSyslog : undefined;
            resourceInputs["removeExistingConfigs"] = args ? args.removeExistingConfigs : undefined;
            resourceInputs["siteId"] = args ? args.siteId : undefined;
            resourceInputs["snmpConfig"] = args ? args.snmpConfig : undefined;
            resourceInputs["switchMatching"] = args ? args.switchMatching : undefined;
            resourceInputs["switchMgmt"] = args ? args.switchMgmt : undefined;
            resourceInputs["uplinkPortConfig"] = args ? args.uplinkPortConfig : undefined;
            resourceInputs["vrfConfig"] = args ? args.vrfConfig : undefined;
            resourceInputs["vrfInstances"] = args ? args.vrfInstances : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Networktemplate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Networktemplate resources.
 */
export interface NetworktemplateState {
    aclPolicies?: pulumi.Input<pulumi.Input<inputs.site.NetworktemplateAclPolicy>[]>;
    /**
     * ACL Tags to identify traffic source or destination. Key name is the tag name
     */
    aclTags?: pulumi.Input<{[key: string]: pulumi.Input<inputs.site.NetworktemplateAclTags>}>;
    /**
     * additional CLI commands to append to the generated Junos config **Note**: no check is done
     */
    additionalConfigCmds?: pulumi.Input<pulumi.Input<string>[]>;
    dhcpSnooping?: pulumi.Input<inputs.site.NetworktemplateDhcpSnooping>;
    /**
     * Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
     */
    dnsServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
     */
    dnsSuffixes?: pulumi.Input<pulumi.Input<string>[]>;
    extraRoutes?: pulumi.Input<{[key: string]: pulumi.Input<inputs.site.NetworktemplateExtraRoutes>}>;
    /**
     * Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
     */
    extraRoutes6?: pulumi.Input<{[key: string]: pulumi.Input<inputs.site.NetworktemplateExtraRoutes6>}>;
    /**
     * enable mistNac to use radsec
     */
    mistNac?: pulumi.Input<inputs.site.NetworktemplateMistNac>;
    /**
     * Property key is network name
     */
    networks?: pulumi.Input<{[key: string]: pulumi.Input<inputs.site.NetworktemplateNetworks>}>;
    /**
     * list of NTP servers
     */
    ntpServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Property key is the port mirroring instance name portMirroring can be added under device/site settings. It takes
     * interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
     */
    portMirroring?: pulumi.Input<{[key: string]: pulumi.Input<inputs.site.NetworktemplatePortMirroring>}>;
    portUsages?: pulumi.Input<{[key: string]: pulumi.Input<inputs.site.NetworktemplatePortUsages>}>;
    /**
     * Junos Radius config
     */
    radiusConfig?: pulumi.Input<inputs.site.NetworktemplateRadiusConfig>;
    remoteSyslog?: pulumi.Input<inputs.site.NetworktemplateRemoteSyslog>;
    /**
     * by default, when we configure a device, we only clean up config we generates. Remove existing configs if enabled
     */
    removeExistingConfigs?: pulumi.Input<boolean>;
    siteId?: pulumi.Input<string>;
    snmpConfig?: pulumi.Input<inputs.site.NetworktemplateSnmpConfig>;
    /**
     * Switch template
     */
    switchMatching?: pulumi.Input<inputs.site.NetworktemplateSwitchMatching>;
    /**
     * Switch settings
     */
    switchMgmt?: pulumi.Input<inputs.site.NetworktemplateSwitchMgmt>;
    uplinkPortConfig?: pulumi.Input<inputs.site.NetworktemplateUplinkPortConfig>;
    vrfConfig?: pulumi.Input<inputs.site.NetworktemplateVrfConfig>;
    /**
     * Property key is the network name
     */
    vrfInstances?: pulumi.Input<{[key: string]: pulumi.Input<inputs.site.NetworktemplateVrfInstances>}>;
}

/**
 * The set of arguments for constructing a Networktemplate resource.
 */
export interface NetworktemplateArgs {
    aclPolicies?: pulumi.Input<pulumi.Input<inputs.site.NetworktemplateAclPolicy>[]>;
    /**
     * ACL Tags to identify traffic source or destination. Key name is the tag name
     */
    aclTags?: pulumi.Input<{[key: string]: pulumi.Input<inputs.site.NetworktemplateAclTags>}>;
    /**
     * additional CLI commands to append to the generated Junos config **Note**: no check is done
     */
    additionalConfigCmds?: pulumi.Input<pulumi.Input<string>[]>;
    dhcpSnooping?: pulumi.Input<inputs.site.NetworktemplateDhcpSnooping>;
    /**
     * Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
     */
    dnsServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
     */
    dnsSuffixes?: pulumi.Input<pulumi.Input<string>[]>;
    extraRoutes?: pulumi.Input<{[key: string]: pulumi.Input<inputs.site.NetworktemplateExtraRoutes>}>;
    /**
     * Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
     */
    extraRoutes6?: pulumi.Input<{[key: string]: pulumi.Input<inputs.site.NetworktemplateExtraRoutes6>}>;
    /**
     * enable mistNac to use radsec
     */
    mistNac?: pulumi.Input<inputs.site.NetworktemplateMistNac>;
    /**
     * Property key is network name
     */
    networks?: pulumi.Input<{[key: string]: pulumi.Input<inputs.site.NetworktemplateNetworks>}>;
    /**
     * list of NTP servers
     */
    ntpServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Property key is the port mirroring instance name portMirroring can be added under device/site settings. It takes
     * interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
     */
    portMirroring?: pulumi.Input<{[key: string]: pulumi.Input<inputs.site.NetworktemplatePortMirroring>}>;
    portUsages?: pulumi.Input<{[key: string]: pulumi.Input<inputs.site.NetworktemplatePortUsages>}>;
    /**
     * Junos Radius config
     */
    radiusConfig?: pulumi.Input<inputs.site.NetworktemplateRadiusConfig>;
    remoteSyslog?: pulumi.Input<inputs.site.NetworktemplateRemoteSyslog>;
    /**
     * by default, when we configure a device, we only clean up config we generates. Remove existing configs if enabled
     */
    removeExistingConfigs?: pulumi.Input<boolean>;
    siteId: pulumi.Input<string>;
    snmpConfig?: pulumi.Input<inputs.site.NetworktemplateSnmpConfig>;
    /**
     * Switch template
     */
    switchMatching?: pulumi.Input<inputs.site.NetworktemplateSwitchMatching>;
    /**
     * Switch settings
     */
    switchMgmt?: pulumi.Input<inputs.site.NetworktemplateSwitchMgmt>;
    uplinkPortConfig?: pulumi.Input<inputs.site.NetworktemplateUplinkPortConfig>;
    vrfConfig?: pulumi.Input<inputs.site.NetworktemplateVrfConfig>;
    /**
     * Property key is the network name
     */
    vrfInstances?: pulumi.Input<{[key: string]: pulumi.Input<inputs.site.NetworktemplateVrfInstances>}>;
}
