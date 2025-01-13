// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This resource manages Org SSO Roles for Admin Authantication.
 *
 * SSO roles refer to the different functions assigned to users within a Single Sign-On (SSO) system.\
 * These roles determine the tasks and actions that users can perform within the SSO system. There are typically predefined roles and custom roles in an SSO system.\
 * Roles in SSO provide a well-defined separation of responsibility and visibility, allowing for granular-level access control on SSO objects..
 *
 * ## Import
 *
 * Using `pulumi import`, import `mist_org_sso_role` with:
 *
 * Org PSK can be imported by specifying the org_id and the sso_role_id
 *
 * ```sh
 * $ pulumi import junipermist:org/ssoRole:SsoRole sso_role_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 */
export class SsoRole extends pulumi.CustomResource {
    /**
     * Get an existing SsoRole resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SsoRoleState, opts?: pulumi.CustomResourceOptions): SsoRole {
        return new SsoRole(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:org/ssoRole:SsoRole';

    /**
     * Returns true if the given object is an instance of SsoRole.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SsoRole {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SsoRole.__pulumiType;
    }

    public readonly name!: pulumi.Output<string>;
    public readonly orgId!: pulumi.Output<string>;
    public readonly privileges!: pulumi.Output<outputs.org.SsoRolePrivilege[]>;

    /**
     * Create a SsoRole resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SsoRoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SsoRoleArgs | SsoRoleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SsoRoleState | undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["privileges"] = state ? state.privileges : undefined;
        } else {
            const args = argsOrState as SsoRoleArgs | undefined;
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            if ((!args || args.privileges === undefined) && !opts.urn) {
                throw new Error("Missing required property 'privileges'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["privileges"] = args ? args.privileges : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SsoRole.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SsoRole resources.
 */
export interface SsoRoleState {
    name?: pulumi.Input<string>;
    orgId?: pulumi.Input<string>;
    privileges?: pulumi.Input<pulumi.Input<inputs.org.SsoRolePrivilege>[]>;
}

/**
 * The set of arguments for constructing a SsoRole resource.
 */
export interface SsoRoleArgs {
    name?: pulumi.Input<string>;
    orgId: pulumi.Input<string>;
    privileges: pulumi.Input<pulumi.Input<inputs.org.SsoRolePrivilege>[]>;
}
