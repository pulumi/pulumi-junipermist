// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.org.NacidpArgs;
import com.pulumi.junipermist.org.inputs.NacidpState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource manages NAC IDPs (Identity Providers).
 * 
 * The NAC IDPs are used to validate NAC client accounts against an IDP with OAuth2.0, LDAP/LDAPS, or a local Mist Edge.\
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
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.junipermist.org.Nacidp;
 * import com.pulumi.junipermist.org.NacidpArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         // OAuth with Azure Example
 *         var idpAzure = new Nacidp("idpAzure", NacidpArgs.builder()
 *             .orgId(terraformTest.id())
 *             .name("idp_azure")
 *             .idpType("oauth")
 *             .oauthCcClientId("client_id")
 *             .oauthCcClientSecret("-----BEGIN CERTIFICATE-----MIIF0jC .../fSCGx7-----END CERTIFICATE-----")
 *             .oauthRopcClientId("ropc_client_id")
 *             .oauthRopcClientSecret("ropc_client_secret")
 *             .oauthTenantId("tenant_id")
 *             .oauthType("azure")
 *             .build());
 * 
 *         // Custom LDAP Example
 *         var idpLdap = new Nacidp("idpLdap", NacidpArgs.builder()
 *             .orgId(terraformTest.id())
 *             .name("idp_ldap")
 *             .idpType("ldap")
 *             .ldapType("custom")
 *             .groupFilter("memberOf")
 *             .memberFilter("memberOf")
 *             .ldapUserFilter("(mail=%s)")
 *             .ldapServerHosts(            
 *                 "ldap.mycorp.com",
 *                 "1.2.3.4")
 *             .ldapBaseDn("DC=abc,DC=com")
 *             .ldapBindDn("CN=admin,CN=users,DC=abc,DC=com")
 *             .ldapBindPassword("secret!password")
 *             .ldapCacerts(            
 *                 """
 * -----BEGIN CERTIFICATE-----
 * MIIFZjCCA06gAwIBAgIIP61/1qm/uDowDQYJKoZIhvcNAQELBQE
 * -----END CERTIFICATE-----                """,
 *                 """
 * -----BEGIN CERTIFICATE-----
 * BhMCRVMxFDASBgNVBAoMC1N0YXJ0Q29tIENBMSwwKgYDVn-----END CERTIFICATE-----                """)
 *             .ldapClientCert("""
 * -----BEGIN CERTIFICATE-----
 * MIIFZjCCA06gAwIBAgIIP61/1qm/uDowDQYJKoZIhvcNAQELBQE
 * -----END CERTIFICATE-----            """)
 *             .ldapClientKey("-----BEGIN PRI...")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
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
 * 
 */
@ResourceType(type="junipermist:org/nacidp:Nacidp")
public class Nacidp extends com.pulumi.resources.CustomResource {
    /**
     * Required if `ldap_type`==`custom`, LDAP filter that will identify the type of group
     * 
     */
    @Export(name="groupFilter", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> groupFilter;

    /**
     * @return Required if `ldap_type`==`custom`, LDAP filter that will identify the type of group
     * 
     */
    public Output<Optional<String>> groupFilter() {
        return Codegen.optional(this.groupFilter);
    }
    /**
     * enum: `ldap`, `mxedge_proxy`, `oauth`
     * 
     */
    @Export(name="idpType", refs={String.class}, tree="[0]")
    private Output<String> idpType;

    /**
     * @return enum: `ldap`, `mxedge_proxy`, `oauth`
     * 
     */
    public Output<String> idpType() {
        return this.idpType;
    }
    /**
     * Required if `idp_type`==`ldap`, whole domain or a specific organization unit (container) in Search base to specify where users and groups are found in the LDAP tree
     * 
     */
    @Export(name="ldapBaseDn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ldapBaseDn;

    /**
     * @return Required if `idp_type`==`ldap`, whole domain or a specific organization unit (container) in Search base to specify where users and groups are found in the LDAP tree
     * 
     */
    public Output<Optional<String>> ldapBaseDn() {
        return Codegen.optional(this.ldapBaseDn);
    }
    /**
     * Required if `idp_type`==`ldap`, the account used to authenticate against the LDAP
     * 
     */
    @Export(name="ldapBindDn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ldapBindDn;

    /**
     * @return Required if `idp_type`==`ldap`, the account used to authenticate against the LDAP
     * 
     */
    public Output<Optional<String>> ldapBindDn() {
        return Codegen.optional(this.ldapBindDn);
    }
    /**
     * Required if `idp_type`==`ldap`, the password used to authenticate against the LDAP
     * 
     */
    @Export(name="ldapBindPassword", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ldapBindPassword;

    /**
     * @return Required if `idp_type`==`ldap`, the password used to authenticate against the LDAP
     * 
     */
    public Output<Optional<String>> ldapBindPassword() {
        return Codegen.optional(this.ldapBindPassword);
    }
    /**
     * Required if `idp_type`==`ldap`, list of CA certificates to validate the LDAP certificate
     * 
     */
    @Export(name="ldapCacerts", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> ldapCacerts;

    /**
     * @return Required if `idp_type`==`ldap`, list of CA certificates to validate the LDAP certificate
     * 
     */
    public Output<Optional<List<String>>> ldapCacerts() {
        return Codegen.optional(this.ldapCacerts);
    }
    /**
     * If `idp_type`==`ldap`, LDAPS Client certificate
     * 
     */
    @Export(name="ldapClientCert", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ldapClientCert;

    /**
     * @return If `idp_type`==`ldap`, LDAPS Client certificate
     * 
     */
    public Output<Optional<String>> ldapClientCert() {
        return Codegen.optional(this.ldapClientCert);
    }
    /**
     * If `idp_type`==`ldap`, Key for the `ldap_client_cert`
     * 
     */
    @Export(name="ldapClientKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ldapClientKey;

    /**
     * @return If `idp_type`==`ldap`, Key for the `ldap_client_cert`
     * 
     */
    public Output<Optional<String>> ldapClientKey() {
        return Codegen.optional(this.ldapClientKey);
    }
    /**
     * If `ldap_type`==`custom`
     * 
     */
    @Export(name="ldapGroupAttr", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ldapGroupAttr;

    /**
     * @return If `ldap_type`==`custom`
     * 
     */
    public Output<Optional<String>> ldapGroupAttr() {
        return Codegen.optional(this.ldapGroupAttr);
    }
    /**
     * If `ldap_type`==`custom`
     * 
     */
    @Export(name="ldapGroupDn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ldapGroupDn;

    /**
     * @return If `ldap_type`==`custom`
     * 
     */
    public Output<Optional<String>> ldapGroupDn() {
        return Codegen.optional(this.ldapGroupDn);
    }
    /**
     * If `idp_type`==`ldap`, whether to recursively resolve LDAP groups
     * 
     */
    @Export(name="ldapResolveGroups", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> ldapResolveGroups;

    /**
     * @return If `idp_type`==`ldap`, whether to recursively resolve LDAP groups
     * 
     */
    public Output<Boolean> ldapResolveGroups() {
        return this.ldapResolveGroups;
    }
    /**
     * If `idp_type`==`ldap`, list of LDAP/LDAPS server IP Addresses or Hostnames
     * 
     */
    @Export(name="ldapServerHosts", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> ldapServerHosts;

    /**
     * @return If `idp_type`==`ldap`, list of LDAP/LDAPS server IP Addresses or Hostnames
     * 
     */
    public Output<Optional<List<String>>> ldapServerHosts() {
        return Codegen.optional(this.ldapServerHosts);
    }
    /**
     * if `idp_type`==`ldap`. enum: `azure`, `custom`, `google`, `okta`, `ping_identity`
     * 
     */
    @Export(name="ldapType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ldapType;

    /**
     * @return if `idp_type`==`ldap`. enum: `azure`, `custom`, `google`, `okta`, `ping_identity`
     * 
     */
    public Output<Optional<String>> ldapType() {
        return Codegen.optional(this.ldapType);
    }
    /**
     * Required if `ldap_type`==`custom`, LDAP filter that will identify the type of user
     * 
     */
    @Export(name="ldapUserFilter", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ldapUserFilter;

    /**
     * @return Required if `ldap_type`==`custom`, LDAP filter that will identify the type of user
     * 
     */
    public Output<Optional<String>> ldapUserFilter() {
        return Codegen.optional(this.ldapUserFilter);
    }
    /**
     * Required if `ldap_type`==`custom`,LDAP filter that will identify the type of member
     * 
     */
    @Export(name="memberFilter", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> memberFilter;

    /**
     * @return Required if `ldap_type`==`custom`,LDAP filter that will identify the type of member
     * 
     */
    public Output<Optional<String>> memberFilter() {
        return Codegen.optional(this.memberFilter);
    }
    /**
     * Name
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Required if `idp_type`==`oauth`, Client Credentials
     * 
     */
    @Export(name="oauthCcClientId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthCcClientId;

    /**
     * @return Required if `idp_type`==`oauth`, Client Credentials
     * 
     */
    public Output<Optional<String>> oauthCcClientId() {
        return Codegen.optional(this.oauthCcClientId);
    }
    /**
     * Required if `idp_type`==`oauth`, oauth*cc*client_secret is RSA private key, of the form &#34;-----BEGIN RSA PRIVATE KEY--....&#34;
     * 
     */
    @Export(name="oauthCcClientSecret", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthCcClientSecret;

    /**
     * @return Required if `idp_type`==`oauth`, oauth*cc*client_secret is RSA private key, of the form &#34;-----BEGIN RSA PRIVATE KEY--....&#34;
     * 
     */
    public Output<Optional<String>> oauthCcClientSecret() {
        return Codegen.optional(this.oauthCcClientSecret);
    }
    /**
     * If `idp_type`==`oauth`
     * 
     */
    @Export(name="oauthDiscoveryUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthDiscoveryUrl;

    /**
     * @return If `idp_type`==`oauth`
     * 
     */
    public Output<Optional<String>> oauthDiscoveryUrl() {
        return Codegen.optional(this.oauthDiscoveryUrl);
    }
    /**
     * enum: `us` (United States, default), `ca` (Canada), `eu` (Europe), `asia` (Asia), `au` (Australia)
     * 
     */
    @Export(name="oauthPingIdentityRegion", refs={String.class}, tree="[0]")
    private Output<String> oauthPingIdentityRegion;

    /**
     * @return enum: `us` (United States, default), `ca` (Canada), `eu` (Europe), `asia` (Asia), `au` (Australia)
     * 
     */
    public Output<String> oauthPingIdentityRegion() {
        return this.oauthPingIdentityRegion;
    }
    /**
     * If `idp_type`==`oauth`, ropc = Resource Owner Password Credentials
     * 
     */
    @Export(name="oauthRopcClientId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthRopcClientId;

    /**
     * @return If `idp_type`==`oauth`, ropc = Resource Owner Password Credentials
     * 
     */
    public Output<Optional<String>> oauthRopcClientId() {
        return Codegen.optional(this.oauthRopcClientId);
    }
    /**
     * If `oauth_type`==`azure` or `oauth_type`==`azure-gov`. oauth*ropc*client_secret can be empty
     * 
     */
    @Export(name="oauthRopcClientSecret", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthRopcClientSecret;

    /**
     * @return If `oauth_type`==`azure` or `oauth_type`==`azure-gov`. oauth*ropc*client_secret can be empty
     * 
     */
    public Output<Optional<String>> oauthRopcClientSecret() {
        return Codegen.optional(this.oauthRopcClientSecret);
    }
    /**
     * Required if `idp_type`==`oauth`, oauth*tenant*id
     * 
     */
    @Export(name="oauthTenantId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthTenantId;

    /**
     * @return Required if `idp_type`==`oauth`, oauth*tenant*id
     * 
     */
    public Output<Optional<String>> oauthTenantId() {
        return Codegen.optional(this.oauthTenantId);
    }
    /**
     * if `idp_type`==`oauth`. enum: `azure`, `azure-gov`, `okta`, `ping_identity`
     * 
     */
    @Export(name="oauthType", refs={String.class}, tree="[0]")
    private Output<String> oauthType;

    /**
     * @return if `idp_type`==`oauth`. enum: `azure`, `azure-gov`, `okta`, `ping_identity`
     * 
     */
    public Output<String> oauthType() {
        return this.oauthType;
    }
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * If `idp_type`==`oauth`, indicates if SCIM provisioning is enabled for the OAuth IDP
     * 
     */
    @Export(name="scimEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> scimEnabled;

    /**
     * @return If `idp_type`==`oauth`, indicates if SCIM provisioning is enabled for the OAuth IDP
     * 
     */
    public Output<Boolean> scimEnabled() {
        return this.scimEnabled;
    }
    /**
     * If `idp_type`==`oauth`, scim*secret*token (auto-generated when not provided by caller and `scim_enabled`==`true`, empty string when `scim_enabled`==`false`) is used as the Bearer token in the Authorization header of SCIM provisioning requests by the IDP
     * 
     */
    @Export(name="scimSecretToken", refs={String.class}, tree="[0]")
    private Output<String> scimSecretToken;

    /**
     * @return If `idp_type`==`oauth`, scim*secret*token (auto-generated when not provided by caller and `scim_enabled`==`true`, empty string when `scim_enabled`==`false`) is used as the Bearer token in the Authorization header of SCIM provisioning requests by the IDP
     * 
     */
    public Output<String> scimSecretToken() {
        return this.scimSecretToken;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Nacidp(java.lang.String name) {
        this(name, NacidpArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Nacidp(java.lang.String name, NacidpArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Nacidp(java.lang.String name, NacidpArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/nacidp:Nacidp", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Nacidp(java.lang.String name, Output<java.lang.String> id, @Nullable NacidpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/nacidp:Nacidp", name, state, makeResourceOptions(options, id), false);
    }

    private static NacidpArgs makeArgs(NacidpArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NacidpArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/pulumi/pulumi-junipermist")
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Nacidp get(java.lang.String name, Output<java.lang.String> id, @Nullable NacidpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Nacidp(name, id, state, options);
    }
}
