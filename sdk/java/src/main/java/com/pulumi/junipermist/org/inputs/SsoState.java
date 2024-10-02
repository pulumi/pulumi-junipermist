// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SsoState extends com.pulumi.resources.ResourceArgs {

    public static final SsoState Empty = new SsoState();

    /**
     * a URL we will redirect the user after user logout from Mist (for some IdP which supports a custom logout URL that is
     * different from SP-initiated SLO process)
     * 
     */
    @Import(name="customLogoutUrl")
    private @Nullable Output<String> customLogoutUrl;

    /**
     * @return a URL we will redirect the user after user logout from Mist (for some IdP which supports a custom logout URL that is
     * different from SP-initiated SLO process)
     * 
     */
    public Optional<Output<String>> customLogoutUrl() {
        return Optional.ofNullable(this.customLogoutUrl);
    }

    /**
     * default role to assign if there’s no match. By default, an assertion is treated as invalid when there’s no role
     * matched
     * 
     */
    @Import(name="defaultRole")
    private @Nullable Output<String> defaultRole;

    /**
     * @return default role to assign if there’s no match. By default, an assertion is treated as invalid when there’s no role
     * matched
     * 
     */
    public Optional<Output<String>> defaultRole() {
        return Optional.ofNullable(this.defaultRole);
    }

    /**
     * random string generated during the SSO creation and used to generate the SAML URLs: * ACS URL =
     * `/api/v1/saml/{domain}/login` (e.g. `https://api.mist.com/api/v1/saml/s4t5vwv8/login`) * Single Logout URL =
     * `/api/v1/saml/{domain}/logout` (e.g. `https://api.mist.com/api/v1/saml/s4t5vwv8/logout`)
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return random string generated during the SSO creation and used to generate the SAML URLs: * ACS URL =
     * `/api/v1/saml/{domain}/login` (e.g. `https://api.mist.com/api/v1/saml/s4t5vwv8/login`) * Single Logout URL =
     * `/api/v1/saml/{domain}/logout` (e.g. `https://api.mist.com/api/v1/saml/s4t5vwv8/logout`)
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * IDP Cert (used to verify the signed response)
     * 
     */
    @Import(name="idpCert")
    private @Nullable Output<String> idpCert;

    /**
     * @return IDP Cert (used to verify the signed response)
     * 
     */
    public Optional<Output<String>> idpCert() {
        return Optional.ofNullable(this.idpCert);
    }

    /**
     * Signing algorithm for SAML Assertion. enum `sha1`, `sha256`, `sha384`, `sha512`
     * 
     */
    @Import(name="idpSignAlgo")
    private @Nullable Output<String> idpSignAlgo;

    /**
     * @return Signing algorithm for SAML Assertion. enum `sha1`, `sha256`, `sha384`, `sha512`
     * 
     */
    public Optional<Output<String>> idpSignAlgo() {
        return Optional.ofNullable(this.idpSignAlgo);
    }

    /**
     * IDP Single-Sign-On URL
     * 
     */
    @Import(name="idpSsoUrl")
    private @Nullable Output<String> idpSsoUrl;

    /**
     * @return IDP Single-Sign-On URL
     * 
     */
    public Optional<Output<String>> idpSsoUrl() {
        return Optional.ofNullable(this.idpSsoUrl);
    }

    /**
     * ignore any unmatched roles provided in assertion. By default, an assertion is treated as invalid for any unmatched role
     * 
     */
    @Import(name="ignoreUnmatchedRoles")
    private @Nullable Output<Boolean> ignoreUnmatchedRoles;

    /**
     * @return ignore any unmatched roles provided in assertion. By default, an assertion is treated as invalid for any unmatched role
     * 
     */
    public Optional<Output<Boolean>> ignoreUnmatchedRoles() {
        return Optional.ofNullable(this.ignoreUnmatchedRoles);
    }

    /**
     * IDP issuer URL
     * 
     */
    @Import(name="issuer")
    private @Nullable Output<String> issuer;

    /**
     * @return IDP issuer URL
     * 
     */
    public Optional<Output<String>> issuer() {
        return Optional.ofNullable(this.issuer);
    }

    /**
     * name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * enum: `email`, `unspecified`
     * 
     */
    @Import(name="nameidFormat")
    private @Nullable Output<String> nameidFormat;

    /**
     * @return enum: `email`, `unspecified`
     * 
     */
    public Optional<Output<String>> nameidFormat() {
        return Optional.ofNullable(this.nameidFormat);
    }

    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * custom role attribute parsing scheme\n\nSupported Role Parsing
     * Schemes\n&lt;table&gt;&lt;tr&gt;&lt;th&gt;Name&lt;/th&gt;&lt;th&gt;Scheme&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;cn&lt;/td&gt;&lt;td&gt;&lt;ul&gt;&lt;li&gt;The expected role attribute format in
     * SAML Assertion is “CN=cn,OU=ou1,OU=ou2,…”&lt;/li&gt;&lt;li&gt;CN (the key) is case insensitive and exactly 1 CN is expected
     * (or the entire entry will be ignored)&lt;/li&gt;&lt;li&gt;E.g. if role attribute is “CN=cn,OU=ou1,OU=ou2” then parsed role value
     * is “cn”&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;
     * 
     */
    @Import(name="roleAttrExtraction")
    private @Nullable Output<String> roleAttrExtraction;

    /**
     * @return custom role attribute parsing scheme\n\nSupported Role Parsing
     * Schemes\n&lt;table&gt;&lt;tr&gt;&lt;th&gt;Name&lt;/th&gt;&lt;th&gt;Scheme&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;cn&lt;/td&gt;&lt;td&gt;&lt;ul&gt;&lt;li&gt;The expected role attribute format in
     * SAML Assertion is “CN=cn,OU=ou1,OU=ou2,…”&lt;/li&gt;&lt;li&gt;CN (the key) is case insensitive and exactly 1 CN is expected
     * (or the entire entry will be ignored)&lt;/li&gt;&lt;li&gt;E.g. if role attribute is “CN=cn,OU=ou1,OU=ou2” then parsed role value
     * is “cn”&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;
     * 
     */
    public Optional<Output<String>> roleAttrExtraction() {
        return Optional.ofNullable(this.roleAttrExtraction);
    }

    /**
     * name of the attribute in SAML Assertion to extract role from. Default: `Role`
     * 
     */
    @Import(name="roleAttrFrom")
    private @Nullable Output<String> roleAttrFrom;

    /**
     * @return name of the attribute in SAML Assertion to extract role from. Default: `Role`
     * 
     */
    public Optional<Output<String>> roleAttrFrom() {
        return Optional.ofNullable(this.roleAttrFrom);
    }

    /**
     * if `idp_type`==`oauth`, indicates if SCIM provisioning is enabled for the OAuth IDP
     * 
     */
    @Import(name="scimEnabled")
    private @Nullable Output<Boolean> scimEnabled;

    /**
     * @return if `idp_type`==`oauth`, indicates if SCIM provisioning is enabled for the OAuth IDP
     * 
     */
    public Optional<Output<Boolean>> scimEnabled() {
        return Optional.ofNullable(this.scimEnabled);
    }

    /**
     * if `idp_type`==`oauth`, scim_secret_token (generated by caller, crypto-random) is used as the Bearer token in the
     * Authorization header of SCIM provisioning requests by the IDP
     * 
     */
    @Import(name="scimSecretToken")
    private @Nullable Output<String> scimSecretToken;

    /**
     * @return if `idp_type`==`oauth`, scim_secret_token (generated by caller, crypto-random) is used as the Bearer token in the
     * Authorization header of SCIM provisioning requests by the IDP
     * 
     */
    public Optional<Output<String>> scimSecretToken() {
        return Optional.ofNullable(this.scimSecretToken);
    }

    private SsoState() {}

    private SsoState(SsoState $) {
        this.customLogoutUrl = $.customLogoutUrl;
        this.defaultRole = $.defaultRole;
        this.domain = $.domain;
        this.idpCert = $.idpCert;
        this.idpSignAlgo = $.idpSignAlgo;
        this.idpSsoUrl = $.idpSsoUrl;
        this.ignoreUnmatchedRoles = $.ignoreUnmatchedRoles;
        this.issuer = $.issuer;
        this.name = $.name;
        this.nameidFormat = $.nameidFormat;
        this.orgId = $.orgId;
        this.roleAttrExtraction = $.roleAttrExtraction;
        this.roleAttrFrom = $.roleAttrFrom;
        this.scimEnabled = $.scimEnabled;
        this.scimSecretToken = $.scimSecretToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SsoState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SsoState $;

        public Builder() {
            $ = new SsoState();
        }

        public Builder(SsoState defaults) {
            $ = new SsoState(Objects.requireNonNull(defaults));
        }

        /**
         * @param customLogoutUrl a URL we will redirect the user after user logout from Mist (for some IdP which supports a custom logout URL that is
         * different from SP-initiated SLO process)
         * 
         * @return builder
         * 
         */
        public Builder customLogoutUrl(@Nullable Output<String> customLogoutUrl) {
            $.customLogoutUrl = customLogoutUrl;
            return this;
        }

        /**
         * @param customLogoutUrl a URL we will redirect the user after user logout from Mist (for some IdP which supports a custom logout URL that is
         * different from SP-initiated SLO process)
         * 
         * @return builder
         * 
         */
        public Builder customLogoutUrl(String customLogoutUrl) {
            return customLogoutUrl(Output.of(customLogoutUrl));
        }

        /**
         * @param defaultRole default role to assign if there’s no match. By default, an assertion is treated as invalid when there’s no role
         * matched
         * 
         * @return builder
         * 
         */
        public Builder defaultRole(@Nullable Output<String> defaultRole) {
            $.defaultRole = defaultRole;
            return this;
        }

        /**
         * @param defaultRole default role to assign if there’s no match. By default, an assertion is treated as invalid when there’s no role
         * matched
         * 
         * @return builder
         * 
         */
        public Builder defaultRole(String defaultRole) {
            return defaultRole(Output.of(defaultRole));
        }

        /**
         * @param domain random string generated during the SSO creation and used to generate the SAML URLs: * ACS URL =
         * `/api/v1/saml/{domain}/login` (e.g. `https://api.mist.com/api/v1/saml/s4t5vwv8/login`) * Single Logout URL =
         * `/api/v1/saml/{domain}/logout` (e.g. `https://api.mist.com/api/v1/saml/s4t5vwv8/logout`)
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain random string generated during the SSO creation and used to generate the SAML URLs: * ACS URL =
         * `/api/v1/saml/{domain}/login` (e.g. `https://api.mist.com/api/v1/saml/s4t5vwv8/login`) * Single Logout URL =
         * `/api/v1/saml/{domain}/logout` (e.g. `https://api.mist.com/api/v1/saml/s4t5vwv8/logout`)
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param idpCert IDP Cert (used to verify the signed response)
         * 
         * @return builder
         * 
         */
        public Builder idpCert(@Nullable Output<String> idpCert) {
            $.idpCert = idpCert;
            return this;
        }

        /**
         * @param idpCert IDP Cert (used to verify the signed response)
         * 
         * @return builder
         * 
         */
        public Builder idpCert(String idpCert) {
            return idpCert(Output.of(idpCert));
        }

        /**
         * @param idpSignAlgo Signing algorithm for SAML Assertion. enum `sha1`, `sha256`, `sha384`, `sha512`
         * 
         * @return builder
         * 
         */
        public Builder idpSignAlgo(@Nullable Output<String> idpSignAlgo) {
            $.idpSignAlgo = idpSignAlgo;
            return this;
        }

        /**
         * @param idpSignAlgo Signing algorithm for SAML Assertion. enum `sha1`, `sha256`, `sha384`, `sha512`
         * 
         * @return builder
         * 
         */
        public Builder idpSignAlgo(String idpSignAlgo) {
            return idpSignAlgo(Output.of(idpSignAlgo));
        }

        /**
         * @param idpSsoUrl IDP Single-Sign-On URL
         * 
         * @return builder
         * 
         */
        public Builder idpSsoUrl(@Nullable Output<String> idpSsoUrl) {
            $.idpSsoUrl = idpSsoUrl;
            return this;
        }

        /**
         * @param idpSsoUrl IDP Single-Sign-On URL
         * 
         * @return builder
         * 
         */
        public Builder idpSsoUrl(String idpSsoUrl) {
            return idpSsoUrl(Output.of(idpSsoUrl));
        }

        /**
         * @param ignoreUnmatchedRoles ignore any unmatched roles provided in assertion. By default, an assertion is treated as invalid for any unmatched role
         * 
         * @return builder
         * 
         */
        public Builder ignoreUnmatchedRoles(@Nullable Output<Boolean> ignoreUnmatchedRoles) {
            $.ignoreUnmatchedRoles = ignoreUnmatchedRoles;
            return this;
        }

        /**
         * @param ignoreUnmatchedRoles ignore any unmatched roles provided in assertion. By default, an assertion is treated as invalid for any unmatched role
         * 
         * @return builder
         * 
         */
        public Builder ignoreUnmatchedRoles(Boolean ignoreUnmatchedRoles) {
            return ignoreUnmatchedRoles(Output.of(ignoreUnmatchedRoles));
        }

        /**
         * @param issuer IDP issuer URL
         * 
         * @return builder
         * 
         */
        public Builder issuer(@Nullable Output<String> issuer) {
            $.issuer = issuer;
            return this;
        }

        /**
         * @param issuer IDP issuer URL
         * 
         * @return builder
         * 
         */
        public Builder issuer(String issuer) {
            return issuer(Output.of(issuer));
        }

        /**
         * @param name name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nameidFormat enum: `email`, `unspecified`
         * 
         * @return builder
         * 
         */
        public Builder nameidFormat(@Nullable Output<String> nameidFormat) {
            $.nameidFormat = nameidFormat;
            return this;
        }

        /**
         * @param nameidFormat enum: `email`, `unspecified`
         * 
         * @return builder
         * 
         */
        public Builder nameidFormat(String nameidFormat) {
            return nameidFormat(Output.of(nameidFormat));
        }

        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param roleAttrExtraction custom role attribute parsing scheme\n\nSupported Role Parsing
         * Schemes\n&lt;table&gt;&lt;tr&gt;&lt;th&gt;Name&lt;/th&gt;&lt;th&gt;Scheme&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;cn&lt;/td&gt;&lt;td&gt;&lt;ul&gt;&lt;li&gt;The expected role attribute format in
         * SAML Assertion is “CN=cn,OU=ou1,OU=ou2,…”&lt;/li&gt;&lt;li&gt;CN (the key) is case insensitive and exactly 1 CN is expected
         * (or the entire entry will be ignored)&lt;/li&gt;&lt;li&gt;E.g. if role attribute is “CN=cn,OU=ou1,OU=ou2” then parsed role value
         * is “cn”&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;
         * 
         * @return builder
         * 
         */
        public Builder roleAttrExtraction(@Nullable Output<String> roleAttrExtraction) {
            $.roleAttrExtraction = roleAttrExtraction;
            return this;
        }

        /**
         * @param roleAttrExtraction custom role attribute parsing scheme\n\nSupported Role Parsing
         * Schemes\n&lt;table&gt;&lt;tr&gt;&lt;th&gt;Name&lt;/th&gt;&lt;th&gt;Scheme&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;cn&lt;/td&gt;&lt;td&gt;&lt;ul&gt;&lt;li&gt;The expected role attribute format in
         * SAML Assertion is “CN=cn,OU=ou1,OU=ou2,…”&lt;/li&gt;&lt;li&gt;CN (the key) is case insensitive and exactly 1 CN is expected
         * (or the entire entry will be ignored)&lt;/li&gt;&lt;li&gt;E.g. if role attribute is “CN=cn,OU=ou1,OU=ou2” then parsed role value
         * is “cn”&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;
         * 
         * @return builder
         * 
         */
        public Builder roleAttrExtraction(String roleAttrExtraction) {
            return roleAttrExtraction(Output.of(roleAttrExtraction));
        }

        /**
         * @param roleAttrFrom name of the attribute in SAML Assertion to extract role from. Default: `Role`
         * 
         * @return builder
         * 
         */
        public Builder roleAttrFrom(@Nullable Output<String> roleAttrFrom) {
            $.roleAttrFrom = roleAttrFrom;
            return this;
        }

        /**
         * @param roleAttrFrom name of the attribute in SAML Assertion to extract role from. Default: `Role`
         * 
         * @return builder
         * 
         */
        public Builder roleAttrFrom(String roleAttrFrom) {
            return roleAttrFrom(Output.of(roleAttrFrom));
        }

        /**
         * @param scimEnabled if `idp_type`==`oauth`, indicates if SCIM provisioning is enabled for the OAuth IDP
         * 
         * @return builder
         * 
         */
        public Builder scimEnabled(@Nullable Output<Boolean> scimEnabled) {
            $.scimEnabled = scimEnabled;
            return this;
        }

        /**
         * @param scimEnabled if `idp_type`==`oauth`, indicates if SCIM provisioning is enabled for the OAuth IDP
         * 
         * @return builder
         * 
         */
        public Builder scimEnabled(Boolean scimEnabled) {
            return scimEnabled(Output.of(scimEnabled));
        }

        /**
         * @param scimSecretToken if `idp_type`==`oauth`, scim_secret_token (generated by caller, crypto-random) is used as the Bearer token in the
         * Authorization header of SCIM provisioning requests by the IDP
         * 
         * @return builder
         * 
         */
        public Builder scimSecretToken(@Nullable Output<String> scimSecretToken) {
            $.scimSecretToken = scimSecretToken;
            return this;
        }

        /**
         * @param scimSecretToken if `idp_type`==`oauth`, scim_secret_token (generated by caller, crypto-random) is used as the Bearer token in the
         * Authorization header of SCIM provisioning requests by the IDP
         * 
         * @return builder
         * 
         */
        public Builder scimSecretToken(String scimSecretToken) {
            return scimSecretToken(Output.of(scimSecretToken));
        }

        public SsoState build() {
            return $;
        }
    }

}