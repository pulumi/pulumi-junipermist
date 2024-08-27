// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This data source provides the list of Org PSKs.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const pskOne = new junipermist.org.Psk("psk_one", {
 *     orgId: terraformTest.id,
 *     name: "JNP-FR-PAR",
 *     passphrase: "secretone",
 *     ssid: wlanOne.ssid,
 *     usage: "multi",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import junipermist:org/psk:Psk Using terraform import, import `mist_org_psk` using the `import` command:
 * ```
 *
 * Gateway cluster can be imported by specifying the org_id and the psk_id
 *
 * ```sh
 * $ pulumi import junipermist:org/psk:Psk psk_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 *
 * In Terraform v1.5.0 and later, use an import block to import `mist_org_psk` with `id={org_id}.{psk_id}`:
 *
 * tf
 *
 * import {
 *
 *   to = mist_org_psk.psk_one
 *
 *   id = "17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309"
 *
 * }
 */
export class Psk extends pulumi.CustomResource {
    /**
     * Get an existing Psk resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PskState, opts?: pulumi.CustomResourceOptions): Psk {
        return new Psk(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:org/psk:Psk';

    /**
     * Returns true if the given object is an instance of Psk.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Psk {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Psk.__pulumiType;
    }

    /**
     * email to send psk expiring notifications to
     */
    public readonly email!: pulumi.Output<string | undefined>;
    /**
     * Expire time for this PSK key (epoch time in seconds). Default `null` (as no expiration)
     */
    public readonly expireTime!: pulumi.Output<number>;
    /**
     * Number of days before psk is expired. Used as to when to start sending reminder notification when the psk is about to expire
     */
    public readonly expiryNotificationTime!: pulumi.Output<number | undefined>;
    /**
     * if `usage`==`single`, the mac that this PSK ties to, empty if `auto-binding`
     */
    public readonly mac!: pulumi.Output<string | undefined>;
    /**
     * if `usage`==`macs`, this list contains N number of client mac addresses or mac patterns(11:22:*) or both. This list is capped at 5000
     */
    public readonly macs!: pulumi.Output<string[] | undefined>;
    /**
     * For Org PSK Only. Max concurrent users for this PSK key. Default is 0 (unlimited)
     */
    public readonly maxUsage!: pulumi.Output<number>;
    public readonly name!: pulumi.Output<string>;
    public readonly note!: pulumi.Output<string | undefined>;
    /**
     * If set to true, reminder notification will be sent when psk is about to expire
     */
    public readonly notifyExpiry!: pulumi.Output<boolean>;
    /**
     * If set to true, notification will be sent when psk is created or edited
     */
    public readonly notifyOnCreateOrEdit!: pulumi.Output<boolean | undefined>;
    /**
     * previous passphrase of the PSK if it has been rotated
     */
    public readonly oldPassphrase!: pulumi.Output<string | undefined>;
    public readonly orgId!: pulumi.Output<string>;
    /**
     * passphrase of the PSK (8-63 character or 64 in hex)
     */
    public readonly passphrase!: pulumi.Output<string>;
    public readonly role!: pulumi.Output<string | undefined>;
    /**
     * SSID this PSK should be applicable to
     */
    public readonly ssid!: pulumi.Output<string>;
    /**
     * enum: `macs`, `multi`, `single`
     */
    public readonly usage!: pulumi.Output<string>;
    public readonly vlanId!: pulumi.Output<string | undefined>;

    /**
     * Create a Psk resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PskArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PskArgs | PskState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PskState | undefined;
            resourceInputs["email"] = state ? state.email : undefined;
            resourceInputs["expireTime"] = state ? state.expireTime : undefined;
            resourceInputs["expiryNotificationTime"] = state ? state.expiryNotificationTime : undefined;
            resourceInputs["mac"] = state ? state.mac : undefined;
            resourceInputs["macs"] = state ? state.macs : undefined;
            resourceInputs["maxUsage"] = state ? state.maxUsage : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["note"] = state ? state.note : undefined;
            resourceInputs["notifyExpiry"] = state ? state.notifyExpiry : undefined;
            resourceInputs["notifyOnCreateOrEdit"] = state ? state.notifyOnCreateOrEdit : undefined;
            resourceInputs["oldPassphrase"] = state ? state.oldPassphrase : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["passphrase"] = state ? state.passphrase : undefined;
            resourceInputs["role"] = state ? state.role : undefined;
            resourceInputs["ssid"] = state ? state.ssid : undefined;
            resourceInputs["usage"] = state ? state.usage : undefined;
            resourceInputs["vlanId"] = state ? state.vlanId : undefined;
        } else {
            const args = argsOrState as PskArgs | undefined;
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            if ((!args || args.passphrase === undefined) && !opts.urn) {
                throw new Error("Missing required property 'passphrase'");
            }
            if ((!args || args.ssid === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ssid'");
            }
            resourceInputs["email"] = args ? args.email : undefined;
            resourceInputs["expireTime"] = args ? args.expireTime : undefined;
            resourceInputs["expiryNotificationTime"] = args ? args.expiryNotificationTime : undefined;
            resourceInputs["mac"] = args ? args.mac : undefined;
            resourceInputs["macs"] = args ? args.macs : undefined;
            resourceInputs["maxUsage"] = args ? args.maxUsage : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["note"] = args ? args.note : undefined;
            resourceInputs["notifyExpiry"] = args ? args.notifyExpiry : undefined;
            resourceInputs["notifyOnCreateOrEdit"] = args ? args.notifyOnCreateOrEdit : undefined;
            resourceInputs["oldPassphrase"] = args?.oldPassphrase ? pulumi.secret(args.oldPassphrase) : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["passphrase"] = args?.passphrase ? pulumi.secret(args.passphrase) : undefined;
            resourceInputs["role"] = args ? args.role : undefined;
            resourceInputs["ssid"] = args ? args.ssid : undefined;
            resourceInputs["usage"] = args ? args.usage : undefined;
            resourceInputs["vlanId"] = args ? args.vlanId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["oldPassphrase", "passphrase"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Psk.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Psk resources.
 */
export interface PskState {
    /**
     * email to send psk expiring notifications to
     */
    email?: pulumi.Input<string>;
    /**
     * Expire time for this PSK key (epoch time in seconds). Default `null` (as no expiration)
     */
    expireTime?: pulumi.Input<number>;
    /**
     * Number of days before psk is expired. Used as to when to start sending reminder notification when the psk is about to expire
     */
    expiryNotificationTime?: pulumi.Input<number>;
    /**
     * if `usage`==`single`, the mac that this PSK ties to, empty if `auto-binding`
     */
    mac?: pulumi.Input<string>;
    /**
     * if `usage`==`macs`, this list contains N number of client mac addresses or mac patterns(11:22:*) or both. This list is capped at 5000
     */
    macs?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * For Org PSK Only. Max concurrent users for this PSK key. Default is 0 (unlimited)
     */
    maxUsage?: pulumi.Input<number>;
    name?: pulumi.Input<string>;
    note?: pulumi.Input<string>;
    /**
     * If set to true, reminder notification will be sent when psk is about to expire
     */
    notifyExpiry?: pulumi.Input<boolean>;
    /**
     * If set to true, notification will be sent when psk is created or edited
     */
    notifyOnCreateOrEdit?: pulumi.Input<boolean>;
    /**
     * previous passphrase of the PSK if it has been rotated
     */
    oldPassphrase?: pulumi.Input<string>;
    orgId?: pulumi.Input<string>;
    /**
     * passphrase of the PSK (8-63 character or 64 in hex)
     */
    passphrase?: pulumi.Input<string>;
    role?: pulumi.Input<string>;
    /**
     * SSID this PSK should be applicable to
     */
    ssid?: pulumi.Input<string>;
    /**
     * enum: `macs`, `multi`, `single`
     */
    usage?: pulumi.Input<string>;
    vlanId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Psk resource.
 */
export interface PskArgs {
    /**
     * email to send psk expiring notifications to
     */
    email?: pulumi.Input<string>;
    /**
     * Expire time for this PSK key (epoch time in seconds). Default `null` (as no expiration)
     */
    expireTime?: pulumi.Input<number>;
    /**
     * Number of days before psk is expired. Used as to when to start sending reminder notification when the psk is about to expire
     */
    expiryNotificationTime?: pulumi.Input<number>;
    /**
     * if `usage`==`single`, the mac that this PSK ties to, empty if `auto-binding`
     */
    mac?: pulumi.Input<string>;
    /**
     * if `usage`==`macs`, this list contains N number of client mac addresses or mac patterns(11:22:*) or both. This list is capped at 5000
     */
    macs?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * For Org PSK Only. Max concurrent users for this PSK key. Default is 0 (unlimited)
     */
    maxUsage?: pulumi.Input<number>;
    name?: pulumi.Input<string>;
    note?: pulumi.Input<string>;
    /**
     * If set to true, reminder notification will be sent when psk is about to expire
     */
    notifyExpiry?: pulumi.Input<boolean>;
    /**
     * If set to true, notification will be sent when psk is created or edited
     */
    notifyOnCreateOrEdit?: pulumi.Input<boolean>;
    /**
     * previous passphrase of the PSK if it has been rotated
     */
    oldPassphrase?: pulumi.Input<string>;
    orgId: pulumi.Input<string>;
    /**
     * passphrase of the PSK (8-63 character or 64 in hex)
     */
    passphrase: pulumi.Input<string>;
    role?: pulumi.Input<string>;
    /**
     * SSID this PSK should be applicable to
     */
    ssid: pulumi.Input<string>;
    /**
     * enum: `macs`, `multi`, `single`
     */
    usage?: pulumi.Input<string>;
    vlanId?: pulumi.Input<string>;
}
