// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This resource manages the WAN Assurance Networks.The Networks are used in the `servicePolicies` from the Gateway configuration and Gateway templates
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const networkOne = new junipermist.org.Network("network_one", {
 *     orgId: terraformTest.id,
 *     name: "network_one",
 *     subnet: "10.4.0.0/24",
 *     disallowMistServices: false,
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import junipermist:org/network:Network Using terraform import, import `mist_org_network` using the `import` command:
 * ```
 *
 * Gateway cluster can be imported by specifying the org_id and the network_id
 *
 * ```sh
 * $ pulumi import junipermist:org/network:Network network_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 */
export class Network extends pulumi.CustomResource {
    /**
     * Get an existing Network resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkState, opts?: pulumi.CustomResourceOptions): Network {
        return new Network(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:org/network:Network';

    /**
     * Returns true if the given object is an instance of Network.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Network {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Network.__pulumiType;
    }

    /**
     * whether to disallow Mist Devices in the network
     */
    public readonly disallowMistServices!: pulumi.Output<boolean>;
    public readonly gateway!: pulumi.Output<string | undefined>;
    public readonly gateway6!: pulumi.Output<string | undefined>;
    public readonly internalAccess!: pulumi.Output<outputs.org.NetworkInternalAccess | undefined>;
    /**
     * whether this network has direct internet access
     */
    public readonly internetAccess!: pulumi.Output<outputs.org.NetworkInternetAccess | undefined>;
    /**
     * whether to allow clients in the network to talk to each other
     */
    public readonly isolation!: pulumi.Output<boolean | undefined>;
    public readonly name!: pulumi.Output<string>;
    public readonly orgId!: pulumi.Output<string>;
    /**
     * for a Network (usually LAN), it can be routable to other networks (e.g. OSPF)
     */
    public readonly routedForNetworks!: pulumi.Output<string[] | undefined>;
    public readonly subnet!: pulumi.Output<string>;
    public readonly subnet6!: pulumi.Output<string | undefined>;
    public readonly tenants!: pulumi.Output<{[key: string]: outputs.org.NetworkTenants} | undefined>;
    public readonly vlanId!: pulumi.Output<string | undefined>;
    /**
     * Property key is the VPN name. Whether this network can be accessed from vpn
     */
    public readonly vpnAccess!: pulumi.Output<{[key: string]: outputs.org.NetworkVpnAccess} | undefined>;

    /**
     * Create a Network resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkArgs | NetworkState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetworkState | undefined;
            resourceInputs["disallowMistServices"] = state ? state.disallowMistServices : undefined;
            resourceInputs["gateway"] = state ? state.gateway : undefined;
            resourceInputs["gateway6"] = state ? state.gateway6 : undefined;
            resourceInputs["internalAccess"] = state ? state.internalAccess : undefined;
            resourceInputs["internetAccess"] = state ? state.internetAccess : undefined;
            resourceInputs["isolation"] = state ? state.isolation : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["routedForNetworks"] = state ? state.routedForNetworks : undefined;
            resourceInputs["subnet"] = state ? state.subnet : undefined;
            resourceInputs["subnet6"] = state ? state.subnet6 : undefined;
            resourceInputs["tenants"] = state ? state.tenants : undefined;
            resourceInputs["vlanId"] = state ? state.vlanId : undefined;
            resourceInputs["vpnAccess"] = state ? state.vpnAccess : undefined;
        } else {
            const args = argsOrState as NetworkArgs | undefined;
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            if ((!args || args.subnet === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subnet'");
            }
            resourceInputs["disallowMistServices"] = args ? args.disallowMistServices : undefined;
            resourceInputs["gateway"] = args ? args.gateway : undefined;
            resourceInputs["gateway6"] = args ? args.gateway6 : undefined;
            resourceInputs["internalAccess"] = args ? args.internalAccess : undefined;
            resourceInputs["internetAccess"] = args ? args.internetAccess : undefined;
            resourceInputs["isolation"] = args ? args.isolation : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["routedForNetworks"] = args ? args.routedForNetworks : undefined;
            resourceInputs["subnet"] = args ? args.subnet : undefined;
            resourceInputs["subnet6"] = args ? args.subnet6 : undefined;
            resourceInputs["tenants"] = args ? args.tenants : undefined;
            resourceInputs["vlanId"] = args ? args.vlanId : undefined;
            resourceInputs["vpnAccess"] = args ? args.vpnAccess : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Network.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Network resources.
 */
export interface NetworkState {
    /**
     * whether to disallow Mist Devices in the network
     */
    disallowMistServices?: pulumi.Input<boolean>;
    gateway?: pulumi.Input<string>;
    gateway6?: pulumi.Input<string>;
    internalAccess?: pulumi.Input<inputs.org.NetworkInternalAccess>;
    /**
     * whether this network has direct internet access
     */
    internetAccess?: pulumi.Input<inputs.org.NetworkInternetAccess>;
    /**
     * whether to allow clients in the network to talk to each other
     */
    isolation?: pulumi.Input<boolean>;
    name?: pulumi.Input<string>;
    orgId?: pulumi.Input<string>;
    /**
     * for a Network (usually LAN), it can be routable to other networks (e.g. OSPF)
     */
    routedForNetworks?: pulumi.Input<pulumi.Input<string>[]>;
    subnet?: pulumi.Input<string>;
    subnet6?: pulumi.Input<string>;
    tenants?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.NetworkTenants>}>;
    vlanId?: pulumi.Input<string>;
    /**
     * Property key is the VPN name. Whether this network can be accessed from vpn
     */
    vpnAccess?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.NetworkVpnAccess>}>;
}

/**
 * The set of arguments for constructing a Network resource.
 */
export interface NetworkArgs {
    /**
     * whether to disallow Mist Devices in the network
     */
    disallowMistServices?: pulumi.Input<boolean>;
    gateway?: pulumi.Input<string>;
    gateway6?: pulumi.Input<string>;
    internalAccess?: pulumi.Input<inputs.org.NetworkInternalAccess>;
    /**
     * whether this network has direct internet access
     */
    internetAccess?: pulumi.Input<inputs.org.NetworkInternetAccess>;
    /**
     * whether to allow clients in the network to talk to each other
     */
    isolation?: pulumi.Input<boolean>;
    name?: pulumi.Input<string>;
    orgId: pulumi.Input<string>;
    /**
     * for a Network (usually LAN), it can be routable to other networks (e.g. OSPF)
     */
    routedForNetworks?: pulumi.Input<pulumi.Input<string>[]>;
    subnet: pulumi.Input<string>;
    subnet6?: pulumi.Input<string>;
    tenants?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.NetworkTenants>}>;
    vlanId?: pulumi.Input<string>;
    /**
     * Property key is the VPN name. Whether this network can be accessed from vpn
     */
    vpnAccess?: pulumi.Input<{[key: string]: pulumi.Input<inputs.org.NetworkVpnAccess>}>;
}
