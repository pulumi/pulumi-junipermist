// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SsoArgs extends com.pulumi.resources.ResourceArgs {

    public static final SsoArgs Empty = new SsoArgs();

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
     * IDP Cert (used to verify the signed response)
     * 
     */
    @Import(name="idpCert", required=true)
    private Output<String> idpCert;

    /**
     * @return IDP Cert (used to verify the signed response)
     * 
     */
    public Output<String> idpCert() {
        return this.idpCert;
    }

    /**
     * Signing algorithm for SAML Assertion. enum `sha1`, `sha256`, `sha384`, `sha512`
     * 
     */
    @Import(name="idpSignAlgo", required=true)
    private Output<String> idpSignAlgo;

    /**
     * @return Signing algorithm for SAML Assertion. enum `sha1`, `sha256`, `sha384`, `sha512`
     * 
     */
    public Output<String> idpSignAlgo() {
        return this.idpSignAlgo;
    }

    /**
     * IDP Single-Sign-On URL
     * 
     */
    @Import(name="idpSsoUrl", required=true)
    private Output<String> idpSsoUrl;

    /**
     * @return IDP Single-Sign-On URL
     * 
     */
    public Output<String> idpSsoUrl() {
        return this.idpSsoUrl;
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
    @Import(name="issuer", required=true)
    private Output<String> issuer;

    /**
     * @return IDP issuer URL
     * 
     */
    public Output<String> issuer() {
        return this.issuer;
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

    @Import(name="orgId", required=true)
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    /**
     * custom role attribute parsing scheme. Supported Role Parsing Schemes
     * &lt;table&gt;&lt;tr&gt;&lt;th&gt;Name&lt;/th&gt;&lt;th&gt;Scheme&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;`cn`&lt;/td&gt;&lt;td&gt;&lt;ul&gt;&lt;li&gt;The expected role attribute format in SAML
     * Assertion is “CN=cn,OU=ou1,OU=ou2,…”&lt;/li&gt;&lt;li&gt;CN (the key) is case insensitive and exactly 1 CN is expected (or the
     * entire entry will be ignored)&lt;/li&gt;&lt;/ul&gt;E.g. if role attribute is “CN=cn,OU=ou1,OU=ou2” then parsed role value is
     * “cn”&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;
     * 
     */
    @Import(name="roleAttrExtraction")
    private @Nullable Output<String> roleAttrExtraction;

    /**
     * @return custom role attribute parsing scheme. Supported Role Parsing Schemes
     * &lt;table&gt;&lt;tr&gt;&lt;th&gt;Name&lt;/th&gt;&lt;th&gt;Scheme&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;`cn`&lt;/td&gt;&lt;td&gt;&lt;ul&gt;&lt;li&gt;The expected role attribute format in SAML
     * Assertion is “CN=cn,OU=ou1,OU=ou2,…”&lt;/li&gt;&lt;li&gt;CN (the key) is case insensitive and exactly 1 CN is expected (or the
     * entire entry will be ignored)&lt;/li&gt;&lt;/ul&gt;E.g. if role attribute is “CN=cn,OU=ou1,OU=ou2” then parsed role value is
     * “cn”&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;
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

    private SsoArgs() {}

    private SsoArgs(SsoArgs $) {
        this.customLogoutUrl = $.customLogoutUrl;
        this.defaultRole = $.defaultRole;
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
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SsoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SsoArgs $;

        public Builder() {
            $ = new SsoArgs();
        }

        public Builder(SsoArgs defaults) {
            $ = new SsoArgs(Objects.requireNonNull(defaults));
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
         * @param idpCert IDP Cert (used to verify the signed response)
         * 
         * @return builder
         * 
         */
        public Builder idpCert(Output<String> idpCert) {
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
        public Builder idpSignAlgo(Output<String> idpSignAlgo) {
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
        public Builder idpSsoUrl(Output<String> idpSsoUrl) {
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
        public Builder issuer(Output<String> issuer) {
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

        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param roleAttrExtraction custom role attribute parsing scheme. Supported Role Parsing Schemes
         * &lt;table&gt;&lt;tr&gt;&lt;th&gt;Name&lt;/th&gt;&lt;th&gt;Scheme&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;`cn`&lt;/td&gt;&lt;td&gt;&lt;ul&gt;&lt;li&gt;The expected role attribute format in SAML
         * Assertion is “CN=cn,OU=ou1,OU=ou2,…”&lt;/li&gt;&lt;li&gt;CN (the key) is case insensitive and exactly 1 CN is expected (or the
         * entire entry will be ignored)&lt;/li&gt;&lt;/ul&gt;E.g. if role attribute is “CN=cn,OU=ou1,OU=ou2” then parsed role value is
         * “cn”&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;
         * 
         * @return builder
         * 
         */
        public Builder roleAttrExtraction(@Nullable Output<String> roleAttrExtraction) {
            $.roleAttrExtraction = roleAttrExtraction;
            return this;
        }

        /**
         * @param roleAttrExtraction custom role attribute parsing scheme. Supported Role Parsing Schemes
         * &lt;table&gt;&lt;tr&gt;&lt;th&gt;Name&lt;/th&gt;&lt;th&gt;Scheme&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;`cn`&lt;/td&gt;&lt;td&gt;&lt;ul&gt;&lt;li&gt;The expected role attribute format in SAML
         * Assertion is “CN=cn,OU=ou1,OU=ou2,…”&lt;/li&gt;&lt;li&gt;CN (the key) is case insensitive and exactly 1 CN is expected (or the
         * entire entry will be ignored)&lt;/li&gt;&lt;/ul&gt;E.g. if role attribute is “CN=cn,OU=ou1,OU=ou2” then parsed role value is
         * “cn”&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;
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

        public SsoArgs build() {
            if ($.idpCert == null) {
                throw new MissingRequiredPropertyException("SsoArgs", "idpCert");
            }
            if ($.idpSignAlgo == null) {
                throw new MissingRequiredPropertyException("SsoArgs", "idpSignAlgo");
            }
            if ($.idpSsoUrl == null) {
                throw new MissingRequiredPropertyException("SsoArgs", "idpSsoUrl");
            }
            if ($.issuer == null) {
                throw new MissingRequiredPropertyException("SsoArgs", "issuer");
            }
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("SsoArgs", "orgId");
            }
            return $;
        }
    }

}
