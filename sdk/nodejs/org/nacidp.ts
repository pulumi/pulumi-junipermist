// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This resource manages NAC IDPs (Identity Providers).
 * The NAC IDPs to validate NAC client accounts against an IDP with OAuth2.0, LDAP/LDAPS, or a local Mist Edge.
 * Mist Access Assurance can also retrieve group membership from the IDP, and use this information in the NAC Rules (`junipermist.org.Nacrule` resource)
 *
 * IMPORTANT:
 * * Once created, the NAC IDP must be registered in the `junipermist.org.Setting` resource (full path: `mist_org_setting.mist_nac.idps`).
 * * The associated REALMS are configured under `mist_org_setting.mist_nac.idps`
 * * To make the IDP the Default IDP, set the IDP ID under `mist_org_setting.mist_nac.default_idp_id`
 *
 * For SAML IDP, the NAC IDP Metadata can be retrieved with the `junipermist.org.getNacidpMetadata` data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * // OAuth with Azure Example
 * const idpAzure = new junipermist.org.Nacidp("idp_azure", {
 *     orgId: terraformTest.id,
 *     name: "idp_azure",
 *     idpType: "oauth",
 *     oauthCcClientId: "client_id",
 *     oauthCcClientSecret: "-----BEGIN CERTIFICATE-----MIIF0jC .../fSCGx7-----END CERTIFICATE-----",
 *     oauthRopcClientId: "ropc_client_id",
 *     oauthRopcClientSecret: "ropc_client_secret",
 *     oauthTenantId: "tenant_id",
 *     oauthType: "azure",
 * });
 * // Custom LDAP Example
 * const idpLdap = new junipermist.org.Nacidp("idp_ldap", {
 *     orgId: terraformTest.id,
 *     name: "idp_ldap",
 *     idpType: "ldap",
 *     ldapType: "custom",
 *     groupFilter: "memberOf",
 *     memberFilter: "memberOf",
 *     ldapUserFilter: "(mail=%s)",
 *     ldapServerHosts: [
 *         "ldap.mycorp.com",
 *         "1.2.3.4",
 *     ],
 *     ldapBaseDn: "DC=abc,DC=com",
 *     ldapBindDn: "CN=admin,CN=users,DC=abc,DC=com",
 *     ldapBindPassword: "secret!password",
 *     ldapCacerts: [
 *         `-----BEGIN CERTIFICATE-----
 * MIIFZjCCA06gAwIBAgIIP61/1qm/uDowDQYJKoZIhvcNAQELBQE
 * -----END CERTIFICATE-----`,
 *         `-----BEGIN CERTIFICATE-----
 * BhMCRVMxFDASBgNVBAoMC1N0YXJ0Q29tIENBMSwwKgYDVn-----END CERTIFICATE-----`,
 *     ],
 *     ldapClientCert: `-----BEGIN CERTIFICATE-----
 * MIIFZjCCA06gAwIBAgIIP61/1qm/uDowDQYJKoZIhvcNAQELBQE
 * -----END CERTIFICATE-----`,
 *     ldapClientKey: "-----BEGIN PRI...",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `mist_org_nacidp` with:
 *
 * Org PSK can be imported by specifying the org_id and the nacidp_id
 *
 * ```sh
 * $ pulumi import junipermist:org/nacidp:Nacidp idp_azure 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 */
export class Nacidp extends pulumi.CustomResource {
    /**
     * Get an existing Nacidp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NacidpState, opts?: pulumi.CustomResourceOptions): Nacidp {
        return new Nacidp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:org/nacidp:Nacidp';

    /**
     * Returns true if the given object is an instance of Nacidp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Nacidp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Nacidp.__pulumiType;
    }

    /**
     * Required if `ldapType`==`custom`, LDAP filter that will identify the type of group
     */
    public readonly groupFilter!: pulumi.Output<string | undefined>;
    /**
     * enum: `ldap`, `mxedgeProxy`, `oauth`
     */
    public readonly idpType!: pulumi.Output<string>;
    /**
     * Required if `idpType`==`ldap`, whole domain or a specific organization unit (container) in Search base to specify where users and groups are found in the LDAP tree
     */
    public readonly ldapBaseDn!: pulumi.Output<string | undefined>;
    /**
     * Required if `idpType`==`ldap`, the account used to authenticate against the LDAP
     */
    public readonly ldapBindDn!: pulumi.Output<string | undefined>;
    /**
     * Required if `idpType`==`ldap`, the password used to authenticate against the LDAP
     */
    public readonly ldapBindPassword!: pulumi.Output<string | undefined>;
    /**
     * Required if `idpType`==`ldap`, list of CA certificates to validate the LDAP certificate
     */
    public readonly ldapCacerts!: pulumi.Output<string[] | undefined>;
    /**
     * if `idpType`==`ldap`, LDAPS Client certificate
     */
    public readonly ldapClientCert!: pulumi.Output<string | undefined>;
    /**
     * if `idpType`==`ldap`, Key for the `ldapClientCert`
     */
    public readonly ldapClientKey!: pulumi.Output<string | undefined>;
    /**
     * if `ldapType`==`custom`
     */
    public readonly ldapGroupAttr!: pulumi.Output<string | undefined>;
    /**
     * if `ldapType`==`custom`
     */
    public readonly ldapGroupDn!: pulumi.Output<string | undefined>;
    /**
     * if `idpType`==`ldap`, whether to recursively resolve LDAP groups
     */
    public readonly ldapResolveGroups!: pulumi.Output<boolean>;
    /**
     * if `idpType`==`ldap`, list of LDAP/LDAPS server IP Addresses or Hostnames
     */
    public readonly ldapServerHosts!: pulumi.Output<string[] | undefined>;
    /**
     * if `idpType`==`ldap`. enum: `azure`, `custom`, `google`, `okta`, `pingIdentity`
     */
    public readonly ldapType!: pulumi.Output<string | undefined>;
    /**
     * Required if `ldapType`==`custom`, LDAP filter that will identify the type of user
     */
    public readonly ldapUserFilter!: pulumi.Output<string | undefined>;
    /**
     * Required if `ldapType`==`custom`,LDAP filter that will identify the type of member
     */
    public readonly memberFilter!: pulumi.Output<string | undefined>;
    /**
     * name
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Required if `idpType`==`oauth`, Client Credentials
     */
    public readonly oauthCcClientId!: pulumi.Output<string | undefined>;
    /**
     * Required if `idpType`==`oauth`, oauth*cc*client_secret is RSA private key, of the form "-----BEGIN RSA PRIVATE KEY--...."
     */
    public readonly oauthCcClientSecret!: pulumi.Output<string | undefined>;
    /**
     * if `idpType`==`oauth`
     */
    public readonly oauthDiscoveryUrl!: pulumi.Output<string | undefined>;
    /**
     * if `idpType`==`oauth`, ropc = Resource Owner Password Credentials
     */
    public readonly oauthRopcClientId!: pulumi.Output<string | undefined>;
    /**
     * if `oauthType`==`azure` or `oauthType`==`azure-gov`. oauth*ropc*client_secret can be empty
     */
    public readonly oauthRopcClientSecret!: pulumi.Output<string | undefined>;
    /**
     * Required if `idpType`==`oauth`, oauth*tenant*id
     */
    public readonly oauthTenantId!: pulumi.Output<string | undefined>;
    /**
     * if `idpType`==`oauth`. enum: `azure`, `azure-gov`, `okta`, `pingIdentity`
     */
    public readonly oauthType!: pulumi.Output<string>;
    public readonly orgId!: pulumi.Output<string>;

    /**
     * Create a Nacidp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NacidpArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NacidpArgs | NacidpState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NacidpState | undefined;
            resourceInputs["groupFilter"] = state ? state.groupFilter : undefined;
            resourceInputs["idpType"] = state ? state.idpType : undefined;
            resourceInputs["ldapBaseDn"] = state ? state.ldapBaseDn : undefined;
            resourceInputs["ldapBindDn"] = state ? state.ldapBindDn : undefined;
            resourceInputs["ldapBindPassword"] = state ? state.ldapBindPassword : undefined;
            resourceInputs["ldapCacerts"] = state ? state.ldapCacerts : undefined;
            resourceInputs["ldapClientCert"] = state ? state.ldapClientCert : undefined;
            resourceInputs["ldapClientKey"] = state ? state.ldapClientKey : undefined;
            resourceInputs["ldapGroupAttr"] = state ? state.ldapGroupAttr : undefined;
            resourceInputs["ldapGroupDn"] = state ? state.ldapGroupDn : undefined;
            resourceInputs["ldapResolveGroups"] = state ? state.ldapResolveGroups : undefined;
            resourceInputs["ldapServerHosts"] = state ? state.ldapServerHosts : undefined;
            resourceInputs["ldapType"] = state ? state.ldapType : undefined;
            resourceInputs["ldapUserFilter"] = state ? state.ldapUserFilter : undefined;
            resourceInputs["memberFilter"] = state ? state.memberFilter : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["oauthCcClientId"] = state ? state.oauthCcClientId : undefined;
            resourceInputs["oauthCcClientSecret"] = state ? state.oauthCcClientSecret : undefined;
            resourceInputs["oauthDiscoveryUrl"] = state ? state.oauthDiscoveryUrl : undefined;
            resourceInputs["oauthRopcClientId"] = state ? state.oauthRopcClientId : undefined;
            resourceInputs["oauthRopcClientSecret"] = state ? state.oauthRopcClientSecret : undefined;
            resourceInputs["oauthTenantId"] = state ? state.oauthTenantId : undefined;
            resourceInputs["oauthType"] = state ? state.oauthType : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
        } else {
            const args = argsOrState as NacidpArgs | undefined;
            if ((!args || args.idpType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'idpType'");
            }
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            resourceInputs["groupFilter"] = args ? args.groupFilter : undefined;
            resourceInputs["idpType"] = args ? args.idpType : undefined;
            resourceInputs["ldapBaseDn"] = args ? args.ldapBaseDn : undefined;
            resourceInputs["ldapBindDn"] = args ? args.ldapBindDn : undefined;
            resourceInputs["ldapBindPassword"] = args ? args.ldapBindPassword : undefined;
            resourceInputs["ldapCacerts"] = args ? args.ldapCacerts : undefined;
            resourceInputs["ldapClientCert"] = args ? args.ldapClientCert : undefined;
            resourceInputs["ldapClientKey"] = args ? args.ldapClientKey : undefined;
            resourceInputs["ldapGroupAttr"] = args ? args.ldapGroupAttr : undefined;
            resourceInputs["ldapGroupDn"] = args ? args.ldapGroupDn : undefined;
            resourceInputs["ldapResolveGroups"] = args ? args.ldapResolveGroups : undefined;
            resourceInputs["ldapServerHosts"] = args ? args.ldapServerHosts : undefined;
            resourceInputs["ldapType"] = args ? args.ldapType : undefined;
            resourceInputs["ldapUserFilter"] = args ? args.ldapUserFilter : undefined;
            resourceInputs["memberFilter"] = args ? args.memberFilter : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["oauthCcClientId"] = args ? args.oauthCcClientId : undefined;
            resourceInputs["oauthCcClientSecret"] = args ? args.oauthCcClientSecret : undefined;
            resourceInputs["oauthDiscoveryUrl"] = args ? args.oauthDiscoveryUrl : undefined;
            resourceInputs["oauthRopcClientId"] = args ? args.oauthRopcClientId : undefined;
            resourceInputs["oauthRopcClientSecret"] = args ? args.oauthRopcClientSecret : undefined;
            resourceInputs["oauthTenantId"] = args ? args.oauthTenantId : undefined;
            resourceInputs["oauthType"] = args ? args.oauthType : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Nacidp.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Nacidp resources.
 */
export interface NacidpState {
    /**
     * Required if `ldapType`==`custom`, LDAP filter that will identify the type of group
     */
    groupFilter?: pulumi.Input<string>;
    /**
     * enum: `ldap`, `mxedgeProxy`, `oauth`
     */
    idpType?: pulumi.Input<string>;
    /**
     * Required if `idpType`==`ldap`, whole domain or a specific organization unit (container) in Search base to specify where users and groups are found in the LDAP tree
     */
    ldapBaseDn?: pulumi.Input<string>;
    /**
     * Required if `idpType`==`ldap`, the account used to authenticate against the LDAP
     */
    ldapBindDn?: pulumi.Input<string>;
    /**
     * Required if `idpType`==`ldap`, the password used to authenticate against the LDAP
     */
    ldapBindPassword?: pulumi.Input<string>;
    /**
     * Required if `idpType`==`ldap`, list of CA certificates to validate the LDAP certificate
     */
    ldapCacerts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * if `idpType`==`ldap`, LDAPS Client certificate
     */
    ldapClientCert?: pulumi.Input<string>;
    /**
     * if `idpType`==`ldap`, Key for the `ldapClientCert`
     */
    ldapClientKey?: pulumi.Input<string>;
    /**
     * if `ldapType`==`custom`
     */
    ldapGroupAttr?: pulumi.Input<string>;
    /**
     * if `ldapType`==`custom`
     */
    ldapGroupDn?: pulumi.Input<string>;
    /**
     * if `idpType`==`ldap`, whether to recursively resolve LDAP groups
     */
    ldapResolveGroups?: pulumi.Input<boolean>;
    /**
     * if `idpType`==`ldap`, list of LDAP/LDAPS server IP Addresses or Hostnames
     */
    ldapServerHosts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * if `idpType`==`ldap`. enum: `azure`, `custom`, `google`, `okta`, `pingIdentity`
     */
    ldapType?: pulumi.Input<string>;
    /**
     * Required if `ldapType`==`custom`, LDAP filter that will identify the type of user
     */
    ldapUserFilter?: pulumi.Input<string>;
    /**
     * Required if `ldapType`==`custom`,LDAP filter that will identify the type of member
     */
    memberFilter?: pulumi.Input<string>;
    /**
     * name
     */
    name?: pulumi.Input<string>;
    /**
     * Required if `idpType`==`oauth`, Client Credentials
     */
    oauthCcClientId?: pulumi.Input<string>;
    /**
     * Required if `idpType`==`oauth`, oauth*cc*client_secret is RSA private key, of the form "-----BEGIN RSA PRIVATE KEY--...."
     */
    oauthCcClientSecret?: pulumi.Input<string>;
    /**
     * if `idpType`==`oauth`
     */
    oauthDiscoveryUrl?: pulumi.Input<string>;
    /**
     * if `idpType`==`oauth`, ropc = Resource Owner Password Credentials
     */
    oauthRopcClientId?: pulumi.Input<string>;
    /**
     * if `oauthType`==`azure` or `oauthType`==`azure-gov`. oauth*ropc*client_secret can be empty
     */
    oauthRopcClientSecret?: pulumi.Input<string>;
    /**
     * Required if `idpType`==`oauth`, oauth*tenant*id
     */
    oauthTenantId?: pulumi.Input<string>;
    /**
     * if `idpType`==`oauth`. enum: `azure`, `azure-gov`, `okta`, `pingIdentity`
     */
    oauthType?: pulumi.Input<string>;
    orgId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Nacidp resource.
 */
export interface NacidpArgs {
    /**
     * Required if `ldapType`==`custom`, LDAP filter that will identify the type of group
     */
    groupFilter?: pulumi.Input<string>;
    /**
     * enum: `ldap`, `mxedgeProxy`, `oauth`
     */
    idpType: pulumi.Input<string>;
    /**
     * Required if `idpType`==`ldap`, whole domain or a specific organization unit (container) in Search base to specify where users and groups are found in the LDAP tree
     */
    ldapBaseDn?: pulumi.Input<string>;
    /**
     * Required if `idpType`==`ldap`, the account used to authenticate against the LDAP
     */
    ldapBindDn?: pulumi.Input<string>;
    /**
     * Required if `idpType`==`ldap`, the password used to authenticate against the LDAP
     */
    ldapBindPassword?: pulumi.Input<string>;
    /**
     * Required if `idpType`==`ldap`, list of CA certificates to validate the LDAP certificate
     */
    ldapCacerts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * if `idpType`==`ldap`, LDAPS Client certificate
     */
    ldapClientCert?: pulumi.Input<string>;
    /**
     * if `idpType`==`ldap`, Key for the `ldapClientCert`
     */
    ldapClientKey?: pulumi.Input<string>;
    /**
     * if `ldapType`==`custom`
     */
    ldapGroupAttr?: pulumi.Input<string>;
    /**
     * if `ldapType`==`custom`
     */
    ldapGroupDn?: pulumi.Input<string>;
    /**
     * if `idpType`==`ldap`, whether to recursively resolve LDAP groups
     */
    ldapResolveGroups?: pulumi.Input<boolean>;
    /**
     * if `idpType`==`ldap`, list of LDAP/LDAPS server IP Addresses or Hostnames
     */
    ldapServerHosts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * if `idpType`==`ldap`. enum: `azure`, `custom`, `google`, `okta`, `pingIdentity`
     */
    ldapType?: pulumi.Input<string>;
    /**
     * Required if `ldapType`==`custom`, LDAP filter that will identify the type of user
     */
    ldapUserFilter?: pulumi.Input<string>;
    /**
     * Required if `ldapType`==`custom`,LDAP filter that will identify the type of member
     */
    memberFilter?: pulumi.Input<string>;
    /**
     * name
     */
    name?: pulumi.Input<string>;
    /**
     * Required if `idpType`==`oauth`, Client Credentials
     */
    oauthCcClientId?: pulumi.Input<string>;
    /**
     * Required if `idpType`==`oauth`, oauth*cc*client_secret is RSA private key, of the form "-----BEGIN RSA PRIVATE KEY--...."
     */
    oauthCcClientSecret?: pulumi.Input<string>;
    /**
     * if `idpType`==`oauth`
     */
    oauthDiscoveryUrl?: pulumi.Input<string>;
    /**
     * if `idpType`==`oauth`, ropc = Resource Owner Password Credentials
     */
    oauthRopcClientId?: pulumi.Input<string>;
    /**
     * if `oauthType`==`azure` or `oauthType`==`azure-gov`. oauth*ropc*client_secret can be empty
     */
    oauthRopcClientSecret?: pulumi.Input<string>;
    /**
     * Required if `idpType`==`oauth`, oauth*tenant*id
     */
    oauthTenantId?: pulumi.Input<string>;
    /**
     * if `idpType`==`oauth`. enum: `azure`, `azure-gov`, `okta`, `pingIdentity`
     */
    oauthType?: pulumi.Input<string>;
    orgId: pulumi.Input<string>;
}