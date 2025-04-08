// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NacidpArgs extends com.pulumi.resources.ResourceArgs {

    public static final NacidpArgs Empty = new NacidpArgs();

    /**
     * Required if `ldap_type`==`custom`, LDAP filter that will identify the type of group
     * 
     */
    @Import(name="groupFilter")
    private @Nullable Output<String> groupFilter;

    /**
     * @return Required if `ldap_type`==`custom`, LDAP filter that will identify the type of group
     * 
     */
    public Optional<Output<String>> groupFilter() {
        return Optional.ofNullable(this.groupFilter);
    }

    /**
     * enum: `ldap`, `mxedge_proxy`, `oauth`
     * 
     */
    @Import(name="idpType", required=true)
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
    @Import(name="ldapBaseDn")
    private @Nullable Output<String> ldapBaseDn;

    /**
     * @return Required if `idp_type`==`ldap`, whole domain or a specific organization unit (container) in Search base to specify where users and groups are found in the LDAP tree
     * 
     */
    public Optional<Output<String>> ldapBaseDn() {
        return Optional.ofNullable(this.ldapBaseDn);
    }

    /**
     * Required if `idp_type`==`ldap`, the account used to authenticate against the LDAP
     * 
     */
    @Import(name="ldapBindDn")
    private @Nullable Output<String> ldapBindDn;

    /**
     * @return Required if `idp_type`==`ldap`, the account used to authenticate against the LDAP
     * 
     */
    public Optional<Output<String>> ldapBindDn() {
        return Optional.ofNullable(this.ldapBindDn);
    }

    /**
     * Required if `idp_type`==`ldap`, the password used to authenticate against the LDAP
     * 
     */
    @Import(name="ldapBindPassword")
    private @Nullable Output<String> ldapBindPassword;

    /**
     * @return Required if `idp_type`==`ldap`, the password used to authenticate against the LDAP
     * 
     */
    public Optional<Output<String>> ldapBindPassword() {
        return Optional.ofNullable(this.ldapBindPassword);
    }

    /**
     * Required if `idp_type`==`ldap`, list of CA certificates to validate the LDAP certificate
     * 
     */
    @Import(name="ldapCacerts")
    private @Nullable Output<List<String>> ldapCacerts;

    /**
     * @return Required if `idp_type`==`ldap`, list of CA certificates to validate the LDAP certificate
     * 
     */
    public Optional<Output<List<String>>> ldapCacerts() {
        return Optional.ofNullable(this.ldapCacerts);
    }

    /**
     * If `idp_type`==`ldap`, LDAPS Client certificate
     * 
     */
    @Import(name="ldapClientCert")
    private @Nullable Output<String> ldapClientCert;

    /**
     * @return If `idp_type`==`ldap`, LDAPS Client certificate
     * 
     */
    public Optional<Output<String>> ldapClientCert() {
        return Optional.ofNullable(this.ldapClientCert);
    }

    /**
     * If `idp_type`==`ldap`, Key for the `ldap_client_cert`
     * 
     */
    @Import(name="ldapClientKey")
    private @Nullable Output<String> ldapClientKey;

    /**
     * @return If `idp_type`==`ldap`, Key for the `ldap_client_cert`
     * 
     */
    public Optional<Output<String>> ldapClientKey() {
        return Optional.ofNullable(this.ldapClientKey);
    }

    /**
     * If `ldap_type`==`custom`
     * 
     */
    @Import(name="ldapGroupAttr")
    private @Nullable Output<String> ldapGroupAttr;

    /**
     * @return If `ldap_type`==`custom`
     * 
     */
    public Optional<Output<String>> ldapGroupAttr() {
        return Optional.ofNullable(this.ldapGroupAttr);
    }

    /**
     * If `ldap_type`==`custom`
     * 
     */
    @Import(name="ldapGroupDn")
    private @Nullable Output<String> ldapGroupDn;

    /**
     * @return If `ldap_type`==`custom`
     * 
     */
    public Optional<Output<String>> ldapGroupDn() {
        return Optional.ofNullable(this.ldapGroupDn);
    }

    /**
     * If `idp_type`==`ldap`, whether to recursively resolve LDAP groups
     * 
     */
    @Import(name="ldapResolveGroups")
    private @Nullable Output<Boolean> ldapResolveGroups;

    /**
     * @return If `idp_type`==`ldap`, whether to recursively resolve LDAP groups
     * 
     */
    public Optional<Output<Boolean>> ldapResolveGroups() {
        return Optional.ofNullable(this.ldapResolveGroups);
    }

    /**
     * If `idp_type`==`ldap`, list of LDAP/LDAPS server IP Addresses or Hostnames
     * 
     */
    @Import(name="ldapServerHosts")
    private @Nullable Output<List<String>> ldapServerHosts;

    /**
     * @return If `idp_type`==`ldap`, list of LDAP/LDAPS server IP Addresses or Hostnames
     * 
     */
    public Optional<Output<List<String>>> ldapServerHosts() {
        return Optional.ofNullable(this.ldapServerHosts);
    }

    /**
     * if `idp_type`==`ldap`. enum: `azure`, `custom`, `google`, `okta`, `ping_identity`
     * 
     */
    @Import(name="ldapType")
    private @Nullable Output<String> ldapType;

    /**
     * @return if `idp_type`==`ldap`. enum: `azure`, `custom`, `google`, `okta`, `ping_identity`
     * 
     */
    public Optional<Output<String>> ldapType() {
        return Optional.ofNullable(this.ldapType);
    }

    /**
     * Required if `ldap_type`==`custom`, LDAP filter that will identify the type of user
     * 
     */
    @Import(name="ldapUserFilter")
    private @Nullable Output<String> ldapUserFilter;

    /**
     * @return Required if `ldap_type`==`custom`, LDAP filter that will identify the type of user
     * 
     */
    public Optional<Output<String>> ldapUserFilter() {
        return Optional.ofNullable(this.ldapUserFilter);
    }

    /**
     * Required if `ldap_type`==`custom`,LDAP filter that will identify the type of member
     * 
     */
    @Import(name="memberFilter")
    private @Nullable Output<String> memberFilter;

    /**
     * @return Required if `ldap_type`==`custom`,LDAP filter that will identify the type of member
     * 
     */
    public Optional<Output<String>> memberFilter() {
        return Optional.ofNullable(this.memberFilter);
    }

    /**
     * Name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Required if `idp_type`==`oauth`, Client Credentials
     * 
     */
    @Import(name="oauthCcClientId")
    private @Nullable Output<String> oauthCcClientId;

    /**
     * @return Required if `idp_type`==`oauth`, Client Credentials
     * 
     */
    public Optional<Output<String>> oauthCcClientId() {
        return Optional.ofNullable(this.oauthCcClientId);
    }

    /**
     * Required if `idp_type`==`oauth`, oauth*cc*client_secret is RSA private key, of the form &#34;-----BEGIN RSA PRIVATE KEY--....&#34;
     * 
     */
    @Import(name="oauthCcClientSecret")
    private @Nullable Output<String> oauthCcClientSecret;

    /**
     * @return Required if `idp_type`==`oauth`, oauth*cc*client_secret is RSA private key, of the form &#34;-----BEGIN RSA PRIVATE KEY--....&#34;
     * 
     */
    public Optional<Output<String>> oauthCcClientSecret() {
        return Optional.ofNullable(this.oauthCcClientSecret);
    }

    /**
     * If `idp_type`==`oauth`
     * 
     */
    @Import(name="oauthDiscoveryUrl")
    private @Nullable Output<String> oauthDiscoveryUrl;

    /**
     * @return If `idp_type`==`oauth`
     * 
     */
    public Optional<Output<String>> oauthDiscoveryUrl() {
        return Optional.ofNullable(this.oauthDiscoveryUrl);
    }

    /**
     * enum: `us` (United States, default), `ca` (Canada), `eu` (Europe), `asia` (Asia), `au` (Australia)
     * 
     */
    @Import(name="oauthPingIdentityRegion")
    private @Nullable Output<String> oauthPingIdentityRegion;

    /**
     * @return enum: `us` (United States, default), `ca` (Canada), `eu` (Europe), `asia` (Asia), `au` (Australia)
     * 
     */
    public Optional<Output<String>> oauthPingIdentityRegion() {
        return Optional.ofNullable(this.oauthPingIdentityRegion);
    }

    /**
     * If `idp_type`==`oauth`, ropc = Resource Owner Password Credentials
     * 
     */
    @Import(name="oauthRopcClientId")
    private @Nullable Output<String> oauthRopcClientId;

    /**
     * @return If `idp_type`==`oauth`, ropc = Resource Owner Password Credentials
     * 
     */
    public Optional<Output<String>> oauthRopcClientId() {
        return Optional.ofNullable(this.oauthRopcClientId);
    }

    /**
     * If `oauth_type`==`azure` or `oauth_type`==`azure-gov`. oauth*ropc*client_secret can be empty
     * 
     */
    @Import(name="oauthRopcClientSecret")
    private @Nullable Output<String> oauthRopcClientSecret;

    /**
     * @return If `oauth_type`==`azure` or `oauth_type`==`azure-gov`. oauth*ropc*client_secret can be empty
     * 
     */
    public Optional<Output<String>> oauthRopcClientSecret() {
        return Optional.ofNullable(this.oauthRopcClientSecret);
    }

    /**
     * Required if `idp_type`==`oauth`, oauth*tenant*id
     * 
     */
    @Import(name="oauthTenantId")
    private @Nullable Output<String> oauthTenantId;

    /**
     * @return Required if `idp_type`==`oauth`, oauth*tenant*id
     * 
     */
    public Optional<Output<String>> oauthTenantId() {
        return Optional.ofNullable(this.oauthTenantId);
    }

    /**
     * if `idp_type`==`oauth`. enum: `azure`, `azure-gov`, `okta`, `ping_identity`
     * 
     */
    @Import(name="oauthType")
    private @Nullable Output<String> oauthType;

    /**
     * @return if `idp_type`==`oauth`. enum: `azure`, `azure-gov`, `okta`, `ping_identity`
     * 
     */
    public Optional<Output<String>> oauthType() {
        return Optional.ofNullable(this.oauthType);
    }

    @Import(name="orgId", required=true)
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    /**
     * If `idp_type`==`oauth`, indicates if SCIM provisioning is enabled for the OAuth IDP
     * 
     */
    @Import(name="scimEnabled")
    private @Nullable Output<Boolean> scimEnabled;

    /**
     * @return If `idp_type`==`oauth`, indicates if SCIM provisioning is enabled for the OAuth IDP
     * 
     */
    public Optional<Output<Boolean>> scimEnabled() {
        return Optional.ofNullable(this.scimEnabled);
    }

    /**
     * If `idp_type`==`oauth`, scim*secret*token (auto-generated when not provided by caller and `scim_enabled`==`true`, empty string when `scim_enabled`==`false`) is used as the Bearer token in the Authorization header of SCIM provisioning requests by the IDP
     * 
     */
    @Import(name="scimSecretToken")
    private @Nullable Output<String> scimSecretToken;

    /**
     * @return If `idp_type`==`oauth`, scim*secret*token (auto-generated when not provided by caller and `scim_enabled`==`true`, empty string when `scim_enabled`==`false`) is used as the Bearer token in the Authorization header of SCIM provisioning requests by the IDP
     * 
     */
    public Optional<Output<String>> scimSecretToken() {
        return Optional.ofNullable(this.scimSecretToken);
    }

    private NacidpArgs() {}

    private NacidpArgs(NacidpArgs $) {
        this.groupFilter = $.groupFilter;
        this.idpType = $.idpType;
        this.ldapBaseDn = $.ldapBaseDn;
        this.ldapBindDn = $.ldapBindDn;
        this.ldapBindPassword = $.ldapBindPassword;
        this.ldapCacerts = $.ldapCacerts;
        this.ldapClientCert = $.ldapClientCert;
        this.ldapClientKey = $.ldapClientKey;
        this.ldapGroupAttr = $.ldapGroupAttr;
        this.ldapGroupDn = $.ldapGroupDn;
        this.ldapResolveGroups = $.ldapResolveGroups;
        this.ldapServerHosts = $.ldapServerHosts;
        this.ldapType = $.ldapType;
        this.ldapUserFilter = $.ldapUserFilter;
        this.memberFilter = $.memberFilter;
        this.name = $.name;
        this.oauthCcClientId = $.oauthCcClientId;
        this.oauthCcClientSecret = $.oauthCcClientSecret;
        this.oauthDiscoveryUrl = $.oauthDiscoveryUrl;
        this.oauthPingIdentityRegion = $.oauthPingIdentityRegion;
        this.oauthRopcClientId = $.oauthRopcClientId;
        this.oauthRopcClientSecret = $.oauthRopcClientSecret;
        this.oauthTenantId = $.oauthTenantId;
        this.oauthType = $.oauthType;
        this.orgId = $.orgId;
        this.scimEnabled = $.scimEnabled;
        this.scimSecretToken = $.scimSecretToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NacidpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NacidpArgs $;

        public Builder() {
            $ = new NacidpArgs();
        }

        public Builder(NacidpArgs defaults) {
            $ = new NacidpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupFilter Required if `ldap_type`==`custom`, LDAP filter that will identify the type of group
         * 
         * @return builder
         * 
         */
        public Builder groupFilter(@Nullable Output<String> groupFilter) {
            $.groupFilter = groupFilter;
            return this;
        }

        /**
         * @param groupFilter Required if `ldap_type`==`custom`, LDAP filter that will identify the type of group
         * 
         * @return builder
         * 
         */
        public Builder groupFilter(String groupFilter) {
            return groupFilter(Output.of(groupFilter));
        }

        /**
         * @param idpType enum: `ldap`, `mxedge_proxy`, `oauth`
         * 
         * @return builder
         * 
         */
        public Builder idpType(Output<String> idpType) {
            $.idpType = idpType;
            return this;
        }

        /**
         * @param idpType enum: `ldap`, `mxedge_proxy`, `oauth`
         * 
         * @return builder
         * 
         */
        public Builder idpType(String idpType) {
            return idpType(Output.of(idpType));
        }

        /**
         * @param ldapBaseDn Required if `idp_type`==`ldap`, whole domain or a specific organization unit (container) in Search base to specify where users and groups are found in the LDAP tree
         * 
         * @return builder
         * 
         */
        public Builder ldapBaseDn(@Nullable Output<String> ldapBaseDn) {
            $.ldapBaseDn = ldapBaseDn;
            return this;
        }

        /**
         * @param ldapBaseDn Required if `idp_type`==`ldap`, whole domain or a specific organization unit (container) in Search base to specify where users and groups are found in the LDAP tree
         * 
         * @return builder
         * 
         */
        public Builder ldapBaseDn(String ldapBaseDn) {
            return ldapBaseDn(Output.of(ldapBaseDn));
        }

        /**
         * @param ldapBindDn Required if `idp_type`==`ldap`, the account used to authenticate against the LDAP
         * 
         * @return builder
         * 
         */
        public Builder ldapBindDn(@Nullable Output<String> ldapBindDn) {
            $.ldapBindDn = ldapBindDn;
            return this;
        }

        /**
         * @param ldapBindDn Required if `idp_type`==`ldap`, the account used to authenticate against the LDAP
         * 
         * @return builder
         * 
         */
        public Builder ldapBindDn(String ldapBindDn) {
            return ldapBindDn(Output.of(ldapBindDn));
        }

        /**
         * @param ldapBindPassword Required if `idp_type`==`ldap`, the password used to authenticate against the LDAP
         * 
         * @return builder
         * 
         */
        public Builder ldapBindPassword(@Nullable Output<String> ldapBindPassword) {
            $.ldapBindPassword = ldapBindPassword;
            return this;
        }

        /**
         * @param ldapBindPassword Required if `idp_type`==`ldap`, the password used to authenticate against the LDAP
         * 
         * @return builder
         * 
         */
        public Builder ldapBindPassword(String ldapBindPassword) {
            return ldapBindPassword(Output.of(ldapBindPassword));
        }

        /**
         * @param ldapCacerts Required if `idp_type`==`ldap`, list of CA certificates to validate the LDAP certificate
         * 
         * @return builder
         * 
         */
        public Builder ldapCacerts(@Nullable Output<List<String>> ldapCacerts) {
            $.ldapCacerts = ldapCacerts;
            return this;
        }

        /**
         * @param ldapCacerts Required if `idp_type`==`ldap`, list of CA certificates to validate the LDAP certificate
         * 
         * @return builder
         * 
         */
        public Builder ldapCacerts(List<String> ldapCacerts) {
            return ldapCacerts(Output.of(ldapCacerts));
        }

        /**
         * @param ldapCacerts Required if `idp_type`==`ldap`, list of CA certificates to validate the LDAP certificate
         * 
         * @return builder
         * 
         */
        public Builder ldapCacerts(String... ldapCacerts) {
            return ldapCacerts(List.of(ldapCacerts));
        }

        /**
         * @param ldapClientCert If `idp_type`==`ldap`, LDAPS Client certificate
         * 
         * @return builder
         * 
         */
        public Builder ldapClientCert(@Nullable Output<String> ldapClientCert) {
            $.ldapClientCert = ldapClientCert;
            return this;
        }

        /**
         * @param ldapClientCert If `idp_type`==`ldap`, LDAPS Client certificate
         * 
         * @return builder
         * 
         */
        public Builder ldapClientCert(String ldapClientCert) {
            return ldapClientCert(Output.of(ldapClientCert));
        }

        /**
         * @param ldapClientKey If `idp_type`==`ldap`, Key for the `ldap_client_cert`
         * 
         * @return builder
         * 
         */
        public Builder ldapClientKey(@Nullable Output<String> ldapClientKey) {
            $.ldapClientKey = ldapClientKey;
            return this;
        }

        /**
         * @param ldapClientKey If `idp_type`==`ldap`, Key for the `ldap_client_cert`
         * 
         * @return builder
         * 
         */
        public Builder ldapClientKey(String ldapClientKey) {
            return ldapClientKey(Output.of(ldapClientKey));
        }

        /**
         * @param ldapGroupAttr If `ldap_type`==`custom`
         * 
         * @return builder
         * 
         */
        public Builder ldapGroupAttr(@Nullable Output<String> ldapGroupAttr) {
            $.ldapGroupAttr = ldapGroupAttr;
            return this;
        }

        /**
         * @param ldapGroupAttr If `ldap_type`==`custom`
         * 
         * @return builder
         * 
         */
        public Builder ldapGroupAttr(String ldapGroupAttr) {
            return ldapGroupAttr(Output.of(ldapGroupAttr));
        }

        /**
         * @param ldapGroupDn If `ldap_type`==`custom`
         * 
         * @return builder
         * 
         */
        public Builder ldapGroupDn(@Nullable Output<String> ldapGroupDn) {
            $.ldapGroupDn = ldapGroupDn;
            return this;
        }

        /**
         * @param ldapGroupDn If `ldap_type`==`custom`
         * 
         * @return builder
         * 
         */
        public Builder ldapGroupDn(String ldapGroupDn) {
            return ldapGroupDn(Output.of(ldapGroupDn));
        }

        /**
         * @param ldapResolveGroups If `idp_type`==`ldap`, whether to recursively resolve LDAP groups
         * 
         * @return builder
         * 
         */
        public Builder ldapResolveGroups(@Nullable Output<Boolean> ldapResolveGroups) {
            $.ldapResolveGroups = ldapResolveGroups;
            return this;
        }

        /**
         * @param ldapResolveGroups If `idp_type`==`ldap`, whether to recursively resolve LDAP groups
         * 
         * @return builder
         * 
         */
        public Builder ldapResolveGroups(Boolean ldapResolveGroups) {
            return ldapResolveGroups(Output.of(ldapResolveGroups));
        }

        /**
         * @param ldapServerHosts If `idp_type`==`ldap`, list of LDAP/LDAPS server IP Addresses or Hostnames
         * 
         * @return builder
         * 
         */
        public Builder ldapServerHosts(@Nullable Output<List<String>> ldapServerHosts) {
            $.ldapServerHosts = ldapServerHosts;
            return this;
        }

        /**
         * @param ldapServerHosts If `idp_type`==`ldap`, list of LDAP/LDAPS server IP Addresses or Hostnames
         * 
         * @return builder
         * 
         */
        public Builder ldapServerHosts(List<String> ldapServerHosts) {
            return ldapServerHosts(Output.of(ldapServerHosts));
        }

        /**
         * @param ldapServerHosts If `idp_type`==`ldap`, list of LDAP/LDAPS server IP Addresses or Hostnames
         * 
         * @return builder
         * 
         */
        public Builder ldapServerHosts(String... ldapServerHosts) {
            return ldapServerHosts(List.of(ldapServerHosts));
        }

        /**
         * @param ldapType if `idp_type`==`ldap`. enum: `azure`, `custom`, `google`, `okta`, `ping_identity`
         * 
         * @return builder
         * 
         */
        public Builder ldapType(@Nullable Output<String> ldapType) {
            $.ldapType = ldapType;
            return this;
        }

        /**
         * @param ldapType if `idp_type`==`ldap`. enum: `azure`, `custom`, `google`, `okta`, `ping_identity`
         * 
         * @return builder
         * 
         */
        public Builder ldapType(String ldapType) {
            return ldapType(Output.of(ldapType));
        }

        /**
         * @param ldapUserFilter Required if `ldap_type`==`custom`, LDAP filter that will identify the type of user
         * 
         * @return builder
         * 
         */
        public Builder ldapUserFilter(@Nullable Output<String> ldapUserFilter) {
            $.ldapUserFilter = ldapUserFilter;
            return this;
        }

        /**
         * @param ldapUserFilter Required if `ldap_type`==`custom`, LDAP filter that will identify the type of user
         * 
         * @return builder
         * 
         */
        public Builder ldapUserFilter(String ldapUserFilter) {
            return ldapUserFilter(Output.of(ldapUserFilter));
        }

        /**
         * @param memberFilter Required if `ldap_type`==`custom`,LDAP filter that will identify the type of member
         * 
         * @return builder
         * 
         */
        public Builder memberFilter(@Nullable Output<String> memberFilter) {
            $.memberFilter = memberFilter;
            return this;
        }

        /**
         * @param memberFilter Required if `ldap_type`==`custom`,LDAP filter that will identify the type of member
         * 
         * @return builder
         * 
         */
        public Builder memberFilter(String memberFilter) {
            return memberFilter(Output.of(memberFilter));
        }

        /**
         * @param name Name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param oauthCcClientId Required if `idp_type`==`oauth`, Client Credentials
         * 
         * @return builder
         * 
         */
        public Builder oauthCcClientId(@Nullable Output<String> oauthCcClientId) {
            $.oauthCcClientId = oauthCcClientId;
            return this;
        }

        /**
         * @param oauthCcClientId Required if `idp_type`==`oauth`, Client Credentials
         * 
         * @return builder
         * 
         */
        public Builder oauthCcClientId(String oauthCcClientId) {
            return oauthCcClientId(Output.of(oauthCcClientId));
        }

        /**
         * @param oauthCcClientSecret Required if `idp_type`==`oauth`, oauth*cc*client_secret is RSA private key, of the form &#34;-----BEGIN RSA PRIVATE KEY--....&#34;
         * 
         * @return builder
         * 
         */
        public Builder oauthCcClientSecret(@Nullable Output<String> oauthCcClientSecret) {
            $.oauthCcClientSecret = oauthCcClientSecret;
            return this;
        }

        /**
         * @param oauthCcClientSecret Required if `idp_type`==`oauth`, oauth*cc*client_secret is RSA private key, of the form &#34;-----BEGIN RSA PRIVATE KEY--....&#34;
         * 
         * @return builder
         * 
         */
        public Builder oauthCcClientSecret(String oauthCcClientSecret) {
            return oauthCcClientSecret(Output.of(oauthCcClientSecret));
        }

        /**
         * @param oauthDiscoveryUrl If `idp_type`==`oauth`
         * 
         * @return builder
         * 
         */
        public Builder oauthDiscoveryUrl(@Nullable Output<String> oauthDiscoveryUrl) {
            $.oauthDiscoveryUrl = oauthDiscoveryUrl;
            return this;
        }

        /**
         * @param oauthDiscoveryUrl If `idp_type`==`oauth`
         * 
         * @return builder
         * 
         */
        public Builder oauthDiscoveryUrl(String oauthDiscoveryUrl) {
            return oauthDiscoveryUrl(Output.of(oauthDiscoveryUrl));
        }

        /**
         * @param oauthPingIdentityRegion enum: `us` (United States, default), `ca` (Canada), `eu` (Europe), `asia` (Asia), `au` (Australia)
         * 
         * @return builder
         * 
         */
        public Builder oauthPingIdentityRegion(@Nullable Output<String> oauthPingIdentityRegion) {
            $.oauthPingIdentityRegion = oauthPingIdentityRegion;
            return this;
        }

        /**
         * @param oauthPingIdentityRegion enum: `us` (United States, default), `ca` (Canada), `eu` (Europe), `asia` (Asia), `au` (Australia)
         * 
         * @return builder
         * 
         */
        public Builder oauthPingIdentityRegion(String oauthPingIdentityRegion) {
            return oauthPingIdentityRegion(Output.of(oauthPingIdentityRegion));
        }

        /**
         * @param oauthRopcClientId If `idp_type`==`oauth`, ropc = Resource Owner Password Credentials
         * 
         * @return builder
         * 
         */
        public Builder oauthRopcClientId(@Nullable Output<String> oauthRopcClientId) {
            $.oauthRopcClientId = oauthRopcClientId;
            return this;
        }

        /**
         * @param oauthRopcClientId If `idp_type`==`oauth`, ropc = Resource Owner Password Credentials
         * 
         * @return builder
         * 
         */
        public Builder oauthRopcClientId(String oauthRopcClientId) {
            return oauthRopcClientId(Output.of(oauthRopcClientId));
        }

        /**
         * @param oauthRopcClientSecret If `oauth_type`==`azure` or `oauth_type`==`azure-gov`. oauth*ropc*client_secret can be empty
         * 
         * @return builder
         * 
         */
        public Builder oauthRopcClientSecret(@Nullable Output<String> oauthRopcClientSecret) {
            $.oauthRopcClientSecret = oauthRopcClientSecret;
            return this;
        }

        /**
         * @param oauthRopcClientSecret If `oauth_type`==`azure` or `oauth_type`==`azure-gov`. oauth*ropc*client_secret can be empty
         * 
         * @return builder
         * 
         */
        public Builder oauthRopcClientSecret(String oauthRopcClientSecret) {
            return oauthRopcClientSecret(Output.of(oauthRopcClientSecret));
        }

        /**
         * @param oauthTenantId Required if `idp_type`==`oauth`, oauth*tenant*id
         * 
         * @return builder
         * 
         */
        public Builder oauthTenantId(@Nullable Output<String> oauthTenantId) {
            $.oauthTenantId = oauthTenantId;
            return this;
        }

        /**
         * @param oauthTenantId Required if `idp_type`==`oauth`, oauth*tenant*id
         * 
         * @return builder
         * 
         */
        public Builder oauthTenantId(String oauthTenantId) {
            return oauthTenantId(Output.of(oauthTenantId));
        }

        /**
         * @param oauthType if `idp_type`==`oauth`. enum: `azure`, `azure-gov`, `okta`, `ping_identity`
         * 
         * @return builder
         * 
         */
        public Builder oauthType(@Nullable Output<String> oauthType) {
            $.oauthType = oauthType;
            return this;
        }

        /**
         * @param oauthType if `idp_type`==`oauth`. enum: `azure`, `azure-gov`, `okta`, `ping_identity`
         * 
         * @return builder
         * 
         */
        public Builder oauthType(String oauthType) {
            return oauthType(Output.of(oauthType));
        }

        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param scimEnabled If `idp_type`==`oauth`, indicates if SCIM provisioning is enabled for the OAuth IDP
         * 
         * @return builder
         * 
         */
        public Builder scimEnabled(@Nullable Output<Boolean> scimEnabled) {
            $.scimEnabled = scimEnabled;
            return this;
        }

        /**
         * @param scimEnabled If `idp_type`==`oauth`, indicates if SCIM provisioning is enabled for the OAuth IDP
         * 
         * @return builder
         * 
         */
        public Builder scimEnabled(Boolean scimEnabled) {
            return scimEnabled(Output.of(scimEnabled));
        }

        /**
         * @param scimSecretToken If `idp_type`==`oauth`, scim*secret*token (auto-generated when not provided by caller and `scim_enabled`==`true`, empty string when `scim_enabled`==`false`) is used as the Bearer token in the Authorization header of SCIM provisioning requests by the IDP
         * 
         * @return builder
         * 
         */
        public Builder scimSecretToken(@Nullable Output<String> scimSecretToken) {
            $.scimSecretToken = scimSecretToken;
            return this;
        }

        /**
         * @param scimSecretToken If `idp_type`==`oauth`, scim*secret*token (auto-generated when not provided by caller and `scim_enabled`==`true`, empty string when `scim_enabled`==`false`) is used as the Bearer token in the Authorization header of SCIM provisioning requests by the IDP
         * 
         * @return builder
         * 
         */
        public Builder scimSecretToken(String scimSecretToken) {
            return scimSecretToken(Output.of(scimSecretToken));
        }

        public NacidpArgs build() {
            if ($.idpType == null) {
                throw new MissingRequiredPropertyException("NacidpArgs", "idpType");
            }
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("NacidpArgs", "orgId");
            }
            return $;
        }
    }

}
