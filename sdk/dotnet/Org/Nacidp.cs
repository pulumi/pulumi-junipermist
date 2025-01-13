// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org
{
    /// <summary>
    /// This resource manages NAC IDPs (Identity Providers).
    /// 
    /// The NAC IDPs are used to validate NAC client accounts against an IDP with OAuth2.0, LDAP/LDAPS, or a local Mist Edge.\
    /// Mist Access Assurance can also retrieve group membership from the IDP, and use this information in the NAC Rules (`junipermist.org.Nacrule` resource)
    /// 
    /// IMPORTANT:
    /// * Once created, the NAC IDP must be registered in the `junipermist.org.Setting` resource (full path: `mist_org_setting.mist_nac.idps`).
    /// * The associated REALMS are configured under `mist_org_setting.mist_nac.idps`
    /// * To make the IDP the Default IDP, set the IDP ID under `mist_org_setting.mist_nac.default_idp_id`
    /// 
    /// For SAML IDP, the NAC IDP Metadata can be retrieved with the `junipermist.org.getNacidpMetadata` data source.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using JuniperMist = Pulumi.JuniperMist;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // OAuth with Azure Example
    ///     var idpAzure = new JuniperMist.Org.Nacidp("idp_azure", new()
    ///     {
    ///         OrgId = terraformTest.Id,
    ///         Name = "idp_azure",
    ///         IdpType = "oauth",
    ///         OauthCcClientId = "client_id",
    ///         OauthCcClientSecret = "-----BEGIN CERTIFICATE-----MIIF0jC .../fSCGx7-----END CERTIFICATE-----",
    ///         OauthRopcClientId = "ropc_client_id",
    ///         OauthRopcClientSecret = "ropc_client_secret",
    ///         OauthTenantId = "tenant_id",
    ///         OauthType = "azure",
    ///     });
    /// 
    ///     // Custom LDAP Example
    ///     var idpLdap = new JuniperMist.Org.Nacidp("idp_ldap", new()
    ///     {
    ///         OrgId = terraformTest.Id,
    ///         Name = "idp_ldap",
    ///         IdpType = "ldap",
    ///         LdapType = "custom",
    ///         GroupFilter = "memberOf",
    ///         MemberFilter = "memberOf",
    ///         LdapUserFilter = "(mail=%s)",
    ///         LdapServerHosts = new[]
    ///         {
    ///             "ldap.mycorp.com",
    ///             "1.2.3.4",
    ///         },
    ///         LdapBaseDn = "DC=abc,DC=com",
    ///         LdapBindDn = "CN=admin,CN=users,DC=abc,DC=com",
    ///         LdapBindPassword = "secret!password",
    ///         LdapCacerts = new[]
    ///         {
    ///             @"-----BEGIN CERTIFICATE-----
    /// MIIFZjCCA06gAwIBAgIIP61/1qm/uDowDQYJKoZIhvcNAQELBQE
    /// -----END CERTIFICATE-----",
    ///             @"-----BEGIN CERTIFICATE-----
    /// BhMCRVMxFDASBgNVBAoMC1N0YXJ0Q29tIENBMSwwKgYDVn-----END CERTIFICATE-----",
    ///         },
    ///         LdapClientCert = @"-----BEGIN CERTIFICATE-----
    /// MIIFZjCCA06gAwIBAgIIP61/1qm/uDowDQYJKoZIhvcNAQELBQE
    /// -----END CERTIFICATE-----",
    ///         LdapClientKey = "-----BEGIN PRI...",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `mist_org_nacidp` with:
    /// 
    /// Org PSK can be imported by specifying the org_id and the nacidp_id
    /// 
    /// ```sh
    /// $ pulumi import junipermist:org/nacidp:Nacidp idp_azure 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
    /// ```
    /// </summary>
    [JuniperMistResourceType("junipermist:org/nacidp:Nacidp")]
    public partial class Nacidp : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Required if `ldap_type`==`custom`, LDAP filter that will identify the type of group
        /// </summary>
        [Output("groupFilter")]
        public Output<string?> GroupFilter { get; private set; } = null!;

        /// <summary>
        /// enum: `ldap`, `mxedge_proxy`, `oauth`
        /// </summary>
        [Output("idpType")]
        public Output<string> IdpType { get; private set; } = null!;

        /// <summary>
        /// Required if `idp_type`==`ldap`, whole domain or a specific organization unit (container) in Search base to specify where users and groups are found in the LDAP tree
        /// </summary>
        [Output("ldapBaseDn")]
        public Output<string?> LdapBaseDn { get; private set; } = null!;

        /// <summary>
        /// Required if `idp_type`==`ldap`, the account used to authenticate against the LDAP
        /// </summary>
        [Output("ldapBindDn")]
        public Output<string?> LdapBindDn { get; private set; } = null!;

        /// <summary>
        /// Required if `idp_type`==`ldap`, the password used to authenticate against the LDAP
        /// </summary>
        [Output("ldapBindPassword")]
        public Output<string?> LdapBindPassword { get; private set; } = null!;

        /// <summary>
        /// Required if `idp_type`==`ldap`, list of CA certificates to validate the LDAP certificate
        /// </summary>
        [Output("ldapCacerts")]
        public Output<ImmutableArray<string>> LdapCacerts { get; private set; } = null!;

        /// <summary>
        /// if `idp_type`==`ldap`, LDAPS Client certificate
        /// </summary>
        [Output("ldapClientCert")]
        public Output<string?> LdapClientCert { get; private set; } = null!;

        /// <summary>
        /// if `idp_type`==`ldap`, Key for the `ldap_client_cert`
        /// </summary>
        [Output("ldapClientKey")]
        public Output<string?> LdapClientKey { get; private set; } = null!;

        /// <summary>
        /// if `ldap_type`==`custom`
        /// </summary>
        [Output("ldapGroupAttr")]
        public Output<string?> LdapGroupAttr { get; private set; } = null!;

        /// <summary>
        /// if `ldap_type`==`custom`
        /// </summary>
        [Output("ldapGroupDn")]
        public Output<string?> LdapGroupDn { get; private set; } = null!;

        /// <summary>
        /// if `idp_type`==`ldap`, whether to recursively resolve LDAP groups
        /// </summary>
        [Output("ldapResolveGroups")]
        public Output<bool> LdapResolveGroups { get; private set; } = null!;

        /// <summary>
        /// if `idp_type`==`ldap`, list of LDAP/LDAPS server IP Addresses or Hostnames
        /// </summary>
        [Output("ldapServerHosts")]
        public Output<ImmutableArray<string>> LdapServerHosts { get; private set; } = null!;

        /// <summary>
        /// if `idp_type`==`ldap`. enum: `azure`, `custom`, `google`, `okta`, `ping_identity`
        /// </summary>
        [Output("ldapType")]
        public Output<string?> LdapType { get; private set; } = null!;

        /// <summary>
        /// Required if `ldap_type`==`custom`, LDAP filter that will identify the type of user
        /// </summary>
        [Output("ldapUserFilter")]
        public Output<string?> LdapUserFilter { get; private set; } = null!;

        /// <summary>
        /// Required if `ldap_type`==`custom`,LDAP filter that will identify the type of member
        /// </summary>
        [Output("memberFilter")]
        public Output<string?> MemberFilter { get; private set; } = null!;

        /// <summary>
        /// name
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Required if `idp_type`==`oauth`, Client Credentials
        /// </summary>
        [Output("oauthCcClientId")]
        public Output<string?> OauthCcClientId { get; private set; } = null!;

        /// <summary>
        /// Required if `idp_type`==`oauth`, oauth*cc*client_secret is RSA private key, of the form "-----BEGIN RSA PRIVATE KEY--...."
        /// </summary>
        [Output("oauthCcClientSecret")]
        public Output<string?> OauthCcClientSecret { get; private set; } = null!;

        /// <summary>
        /// if `idp_type`==`oauth`
        /// </summary>
        [Output("oauthDiscoveryUrl")]
        public Output<string?> OauthDiscoveryUrl { get; private set; } = null!;

        /// <summary>
        /// enum: `us` (United States, default), `ca` (Canada), `eu` (Europe), `asia` (Asia), `au` (Australia)
        /// </summary>
        [Output("oauthPingIdentityRegion")]
        public Output<string> OauthPingIdentityRegion { get; private set; } = null!;

        /// <summary>
        /// if `idp_type`==`oauth`, ropc = Resource Owner Password Credentials
        /// </summary>
        [Output("oauthRopcClientId")]
        public Output<string?> OauthRopcClientId { get; private set; } = null!;

        /// <summary>
        /// if `oauth_type`==`azure` or `oauth_type`==`azure-gov`. oauth*ropc*client_secret can be empty
        /// </summary>
        [Output("oauthRopcClientSecret")]
        public Output<string?> OauthRopcClientSecret { get; private set; } = null!;

        /// <summary>
        /// Required if `idp_type`==`oauth`, oauth*tenant*id
        /// </summary>
        [Output("oauthTenantId")]
        public Output<string?> OauthTenantId { get; private set; } = null!;

        /// <summary>
        /// if `idp_type`==`oauth`. enum: `azure`, `azure-gov`, `okta`, `ping_identity`
        /// </summary>
        [Output("oauthType")]
        public Output<string> OauthType { get; private set; } = null!;

        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// if `idp_type`==`oauth`, indicates if SCIM provisioning is enabled for the OAuth IDP
        /// </summary>
        [Output("scimEnabled")]
        public Output<bool> ScimEnabled { get; private set; } = null!;

        /// <summary>
        /// if `idp_type`==`oauth`, scim*secret*token (auto-generated when not provided by caller and `scim_enabled`==`true`, empty string when `scim_enabled`==`false`) is used as the Bearer token in the Authorization header of SCIM provisioning requests by the IDP
        /// </summary>
        [Output("scimSecretToken")]
        public Output<string> ScimSecretToken { get; private set; } = null!;


        /// <summary>
        /// Create a Nacidp resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Nacidp(string name, NacidpArgs args, CustomResourceOptions? options = null)
            : base("junipermist:org/nacidp:Nacidp", name, args ?? new NacidpArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Nacidp(string name, Input<string> id, NacidpState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:org/nacidp:Nacidp", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi/pulumi-junipermist",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Nacidp resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Nacidp Get(string name, Input<string> id, NacidpState? state = null, CustomResourceOptions? options = null)
        {
            return new Nacidp(name, id, state, options);
        }
    }

    public sealed class NacidpArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Required if `ldap_type`==`custom`, LDAP filter that will identify the type of group
        /// </summary>
        [Input("groupFilter")]
        public Input<string>? GroupFilter { get; set; }

        /// <summary>
        /// enum: `ldap`, `mxedge_proxy`, `oauth`
        /// </summary>
        [Input("idpType", required: true)]
        public Input<string> IdpType { get; set; } = null!;

        /// <summary>
        /// Required if `idp_type`==`ldap`, whole domain or a specific organization unit (container) in Search base to specify where users and groups are found in the LDAP tree
        /// </summary>
        [Input("ldapBaseDn")]
        public Input<string>? LdapBaseDn { get; set; }

        /// <summary>
        /// Required if `idp_type`==`ldap`, the account used to authenticate against the LDAP
        /// </summary>
        [Input("ldapBindDn")]
        public Input<string>? LdapBindDn { get; set; }

        /// <summary>
        /// Required if `idp_type`==`ldap`, the password used to authenticate against the LDAP
        /// </summary>
        [Input("ldapBindPassword")]
        public Input<string>? LdapBindPassword { get; set; }

        [Input("ldapCacerts")]
        private InputList<string>? _ldapCacerts;

        /// <summary>
        /// Required if `idp_type`==`ldap`, list of CA certificates to validate the LDAP certificate
        /// </summary>
        public InputList<string> LdapCacerts
        {
            get => _ldapCacerts ?? (_ldapCacerts = new InputList<string>());
            set => _ldapCacerts = value;
        }

        /// <summary>
        /// if `idp_type`==`ldap`, LDAPS Client certificate
        /// </summary>
        [Input("ldapClientCert")]
        public Input<string>? LdapClientCert { get; set; }

        /// <summary>
        /// if `idp_type`==`ldap`, Key for the `ldap_client_cert`
        /// </summary>
        [Input("ldapClientKey")]
        public Input<string>? LdapClientKey { get; set; }

        /// <summary>
        /// if `ldap_type`==`custom`
        /// </summary>
        [Input("ldapGroupAttr")]
        public Input<string>? LdapGroupAttr { get; set; }

        /// <summary>
        /// if `ldap_type`==`custom`
        /// </summary>
        [Input("ldapGroupDn")]
        public Input<string>? LdapGroupDn { get; set; }

        /// <summary>
        /// if `idp_type`==`ldap`, whether to recursively resolve LDAP groups
        /// </summary>
        [Input("ldapResolveGroups")]
        public Input<bool>? LdapResolveGroups { get; set; }

        [Input("ldapServerHosts")]
        private InputList<string>? _ldapServerHosts;

        /// <summary>
        /// if `idp_type`==`ldap`, list of LDAP/LDAPS server IP Addresses or Hostnames
        /// </summary>
        public InputList<string> LdapServerHosts
        {
            get => _ldapServerHosts ?? (_ldapServerHosts = new InputList<string>());
            set => _ldapServerHosts = value;
        }

        /// <summary>
        /// if `idp_type`==`ldap`. enum: `azure`, `custom`, `google`, `okta`, `ping_identity`
        /// </summary>
        [Input("ldapType")]
        public Input<string>? LdapType { get; set; }

        /// <summary>
        /// Required if `ldap_type`==`custom`, LDAP filter that will identify the type of user
        /// </summary>
        [Input("ldapUserFilter")]
        public Input<string>? LdapUserFilter { get; set; }

        /// <summary>
        /// Required if `ldap_type`==`custom`,LDAP filter that will identify the type of member
        /// </summary>
        [Input("memberFilter")]
        public Input<string>? MemberFilter { get; set; }

        /// <summary>
        /// name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Required if `idp_type`==`oauth`, Client Credentials
        /// </summary>
        [Input("oauthCcClientId")]
        public Input<string>? OauthCcClientId { get; set; }

        /// <summary>
        /// Required if `idp_type`==`oauth`, oauth*cc*client_secret is RSA private key, of the form "-----BEGIN RSA PRIVATE KEY--...."
        /// </summary>
        [Input("oauthCcClientSecret")]
        public Input<string>? OauthCcClientSecret { get; set; }

        /// <summary>
        /// if `idp_type`==`oauth`
        /// </summary>
        [Input("oauthDiscoveryUrl")]
        public Input<string>? OauthDiscoveryUrl { get; set; }

        /// <summary>
        /// enum: `us` (United States, default), `ca` (Canada), `eu` (Europe), `asia` (Asia), `au` (Australia)
        /// </summary>
        [Input("oauthPingIdentityRegion")]
        public Input<string>? OauthPingIdentityRegion { get; set; }

        /// <summary>
        /// if `idp_type`==`oauth`, ropc = Resource Owner Password Credentials
        /// </summary>
        [Input("oauthRopcClientId")]
        public Input<string>? OauthRopcClientId { get; set; }

        /// <summary>
        /// if `oauth_type`==`azure` or `oauth_type`==`azure-gov`. oauth*ropc*client_secret can be empty
        /// </summary>
        [Input("oauthRopcClientSecret")]
        public Input<string>? OauthRopcClientSecret { get; set; }

        /// <summary>
        /// Required if `idp_type`==`oauth`, oauth*tenant*id
        /// </summary>
        [Input("oauthTenantId")]
        public Input<string>? OauthTenantId { get; set; }

        /// <summary>
        /// if `idp_type`==`oauth`. enum: `azure`, `azure-gov`, `okta`, `ping_identity`
        /// </summary>
        [Input("oauthType")]
        public Input<string>? OauthType { get; set; }

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// if `idp_type`==`oauth`, indicates if SCIM provisioning is enabled for the OAuth IDP
        /// </summary>
        [Input("scimEnabled")]
        public Input<bool>? ScimEnabled { get; set; }

        /// <summary>
        /// if `idp_type`==`oauth`, scim*secret*token (auto-generated when not provided by caller and `scim_enabled`==`true`, empty string when `scim_enabled`==`false`) is used as the Bearer token in the Authorization header of SCIM provisioning requests by the IDP
        /// </summary>
        [Input("scimSecretToken")]
        public Input<string>? ScimSecretToken { get; set; }

        public NacidpArgs()
        {
        }
        public static new NacidpArgs Empty => new NacidpArgs();
    }

    public sealed class NacidpState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Required if `ldap_type`==`custom`, LDAP filter that will identify the type of group
        /// </summary>
        [Input("groupFilter")]
        public Input<string>? GroupFilter { get; set; }

        /// <summary>
        /// enum: `ldap`, `mxedge_proxy`, `oauth`
        /// </summary>
        [Input("idpType")]
        public Input<string>? IdpType { get; set; }

        /// <summary>
        /// Required if `idp_type`==`ldap`, whole domain or a specific organization unit (container) in Search base to specify where users and groups are found in the LDAP tree
        /// </summary>
        [Input("ldapBaseDn")]
        public Input<string>? LdapBaseDn { get; set; }

        /// <summary>
        /// Required if `idp_type`==`ldap`, the account used to authenticate against the LDAP
        /// </summary>
        [Input("ldapBindDn")]
        public Input<string>? LdapBindDn { get; set; }

        /// <summary>
        /// Required if `idp_type`==`ldap`, the password used to authenticate against the LDAP
        /// </summary>
        [Input("ldapBindPassword")]
        public Input<string>? LdapBindPassword { get; set; }

        [Input("ldapCacerts")]
        private InputList<string>? _ldapCacerts;

        /// <summary>
        /// Required if `idp_type`==`ldap`, list of CA certificates to validate the LDAP certificate
        /// </summary>
        public InputList<string> LdapCacerts
        {
            get => _ldapCacerts ?? (_ldapCacerts = new InputList<string>());
            set => _ldapCacerts = value;
        }

        /// <summary>
        /// if `idp_type`==`ldap`, LDAPS Client certificate
        /// </summary>
        [Input("ldapClientCert")]
        public Input<string>? LdapClientCert { get; set; }

        /// <summary>
        /// if `idp_type`==`ldap`, Key for the `ldap_client_cert`
        /// </summary>
        [Input("ldapClientKey")]
        public Input<string>? LdapClientKey { get; set; }

        /// <summary>
        /// if `ldap_type`==`custom`
        /// </summary>
        [Input("ldapGroupAttr")]
        public Input<string>? LdapGroupAttr { get; set; }

        /// <summary>
        /// if `ldap_type`==`custom`
        /// </summary>
        [Input("ldapGroupDn")]
        public Input<string>? LdapGroupDn { get; set; }

        /// <summary>
        /// if `idp_type`==`ldap`, whether to recursively resolve LDAP groups
        /// </summary>
        [Input("ldapResolveGroups")]
        public Input<bool>? LdapResolveGroups { get; set; }

        [Input("ldapServerHosts")]
        private InputList<string>? _ldapServerHosts;

        /// <summary>
        /// if `idp_type`==`ldap`, list of LDAP/LDAPS server IP Addresses or Hostnames
        /// </summary>
        public InputList<string> LdapServerHosts
        {
            get => _ldapServerHosts ?? (_ldapServerHosts = new InputList<string>());
            set => _ldapServerHosts = value;
        }

        /// <summary>
        /// if `idp_type`==`ldap`. enum: `azure`, `custom`, `google`, `okta`, `ping_identity`
        /// </summary>
        [Input("ldapType")]
        public Input<string>? LdapType { get; set; }

        /// <summary>
        /// Required if `ldap_type`==`custom`, LDAP filter that will identify the type of user
        /// </summary>
        [Input("ldapUserFilter")]
        public Input<string>? LdapUserFilter { get; set; }

        /// <summary>
        /// Required if `ldap_type`==`custom`,LDAP filter that will identify the type of member
        /// </summary>
        [Input("memberFilter")]
        public Input<string>? MemberFilter { get; set; }

        /// <summary>
        /// name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Required if `idp_type`==`oauth`, Client Credentials
        /// </summary>
        [Input("oauthCcClientId")]
        public Input<string>? OauthCcClientId { get; set; }

        /// <summary>
        /// Required if `idp_type`==`oauth`, oauth*cc*client_secret is RSA private key, of the form "-----BEGIN RSA PRIVATE KEY--...."
        /// </summary>
        [Input("oauthCcClientSecret")]
        public Input<string>? OauthCcClientSecret { get; set; }

        /// <summary>
        /// if `idp_type`==`oauth`
        /// </summary>
        [Input("oauthDiscoveryUrl")]
        public Input<string>? OauthDiscoveryUrl { get; set; }

        /// <summary>
        /// enum: `us` (United States, default), `ca` (Canada), `eu` (Europe), `asia` (Asia), `au` (Australia)
        /// </summary>
        [Input("oauthPingIdentityRegion")]
        public Input<string>? OauthPingIdentityRegion { get; set; }

        /// <summary>
        /// if `idp_type`==`oauth`, ropc = Resource Owner Password Credentials
        /// </summary>
        [Input("oauthRopcClientId")]
        public Input<string>? OauthRopcClientId { get; set; }

        /// <summary>
        /// if `oauth_type`==`azure` or `oauth_type`==`azure-gov`. oauth*ropc*client_secret can be empty
        /// </summary>
        [Input("oauthRopcClientSecret")]
        public Input<string>? OauthRopcClientSecret { get; set; }

        /// <summary>
        /// Required if `idp_type`==`oauth`, oauth*tenant*id
        /// </summary>
        [Input("oauthTenantId")]
        public Input<string>? OauthTenantId { get; set; }

        /// <summary>
        /// if `idp_type`==`oauth`. enum: `azure`, `azure-gov`, `okta`, `ping_identity`
        /// </summary>
        [Input("oauthType")]
        public Input<string>? OauthType { get; set; }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// if `idp_type`==`oauth`, indicates if SCIM provisioning is enabled for the OAuth IDP
        /// </summary>
        [Input("scimEnabled")]
        public Input<bool>? ScimEnabled { get; set; }

        /// <summary>
        /// if `idp_type`==`oauth`, scim*secret*token (auto-generated when not provided by caller and `scim_enabled`==`true`, empty string when `scim_enabled`==`false`) is used as the Bearer token in the Authorization header of SCIM provisioning requests by the IDP
        /// </summary>
        [Input("scimSecretToken")]
        public Input<string>? ScimSecretToken { get; set; }

        public NacidpState()
        {
        }
        public static new NacidpState Empty => new NacidpState();
    }
}
