// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.SettingMistNacIdpArgs;
import com.pulumi.junipermist.org.inputs.SettingMistNacServerCertArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingMistNacArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingMistNacArgs Empty = new SettingMistNacArgs();

    /**
     * list of PEM-encoded ca certs
     * 
     */
    @Import(name="cacerts")
    private @Nullable Output<List<String>> cacerts;

    /**
     * @return list of PEM-encoded ca certs
     * 
     */
    public Optional<Output<List<String>>> cacerts() {
        return Optional.ofNullable(this.cacerts);
    }

    /**
     * use this IDP when no explicit realm present in the incoming username/CN OR when no IDP is explicitly mapped to the incoming realm.
     * 
     */
    @Import(name="defaultIdpId")
    private @Nullable Output<String> defaultIdpId;

    /**
     * @return use this IDP when no explicit realm present in the incoming username/CN OR when no IDP is explicitly mapped to the incoming realm.
     * 
     */
    public Optional<Output<String>> defaultIdpId() {
        return Optional.ofNullable(this.defaultIdpId);
    }

    /**
     * to disable RSAE_PSS_SHA256, RSAE_PSS_SHA384, RSAE_PSS_SHA512 from server side. see https://www.openssl.org/docs/man3.0/man1/openssl-ciphers.html
     * 
     */
    @Import(name="disableRsaeAlgorithms")
    private @Nullable Output<Boolean> disableRsaeAlgorithms;

    /**
     * @return to disable RSAE_PSS_SHA256, RSAE_PSS_SHA384, RSAE_PSS_SHA512 from server side. see https://www.openssl.org/docs/man3.0/man1/openssl-ciphers.html
     * 
     */
    public Optional<Output<Boolean>> disableRsaeAlgorithms() {
        return Optional.ofNullable(this.disableRsaeAlgorithms);
    }

    /**
     * eap ssl security level
     * see https://www.openssl.org/docs/man1.1.1/man3/SSL_CTX_set_security_level.html#DEFAULT-CALLBACK-BEHAVIOUR
     * 
     */
    @Import(name="eapSslSecurityLevel")
    private @Nullable Output<Integer> eapSslSecurityLevel;

    /**
     * @return eap ssl security level
     * see https://www.openssl.org/docs/man1.1.1/man3/SSL_CTX_set_security_level.html#DEFAULT-CALLBACK-BEHAVIOUR
     * 
     */
    public Optional<Output<Integer>> eapSslSecurityLevel() {
        return Optional.ofNullable(this.eapSslSecurityLevel);
    }

    /**
     * By default NAC POD failover considers all NAC pods available around the globe, i.e. EU, US, or APAC based, failover happens based on geo IP of the originating site.
     * For strict GDPR compliancy NAC POD failover would only happen between the PODs located within the EU environment, and no authentication would take place outside of EU. This is an org setting that is applicable to WLANs, switch templates, mxedge clusters that have mist_nac enabled
     * 
     */
    @Import(name="euOnly")
    private @Nullable Output<Boolean> euOnly;

    /**
     * @return By default NAC POD failover considers all NAC pods available around the globe, i.e. EU, US, or APAC based, failover happens based on geo IP of the originating site.
     * For strict GDPR compliancy NAC POD failover would only happen between the PODs located within the EU environment, and no authentication would take place outside of EU. This is an org setting that is applicable to WLANs, switch templates, mxedge clusters that have mist_nac enabled
     * 
     */
    public Optional<Output<Boolean>> euOnly() {
        return Optional.ofNullable(this.euOnly);
    }

    /**
     * allow customer to choose the EAP-TLS client certificate&#39;s field to use for IDP Machine Groups lookup
     * 
     */
    @Import(name="idpMachineCertLookupField")
    private @Nullable Output<String> idpMachineCertLookupField;

    /**
     * @return allow customer to choose the EAP-TLS client certificate&#39;s field to use for IDP Machine Groups lookup
     * 
     */
    public Optional<Output<String>> idpMachineCertLookupField() {
        return Optional.ofNullable(this.idpMachineCertLookupField);
    }

    /**
     * allow customer to choose the EAP-TLS client certificate&#39;s field to use for IDP User Groups lookup
     * 
     */
    @Import(name="idpUserCertLookupField")
    private @Nullable Output<String> idpUserCertLookupField;

    /**
     * @return allow customer to choose the EAP-TLS client certificate&#39;s field to use for IDP User Groups lookup
     * 
     */
    public Optional<Output<String>> idpUserCertLookupField() {
        return Optional.ofNullable(this.idpUserCertLookupField);
    }

    @Import(name="idps")
    private @Nullable Output<List<SettingMistNacIdpArgs>> idps;

    public Optional<Output<List<SettingMistNacIdpArgs>>> idps() {
        return Optional.ofNullable(this.idps);
    }

    /**
     * radius server cert to be presented in EAP TLS
     * 
     */
    @Import(name="serverCert")
    private @Nullable Output<SettingMistNacServerCertArgs> serverCert;

    /**
     * @return radius server cert to be presented in EAP TLS
     * 
     */
    public Optional<Output<SettingMistNacServerCertArgs>> serverCert() {
        return Optional.ofNullable(this.serverCert);
    }

    /**
     * by default NAS devices(switches/aps) and proxies(mxedge) are configured to reach mist-nac via IPv4. enum: `v4`, `v6`
     * 
     */
    @Import(name="useIpVersion")
    private @Nullable Output<String> useIpVersion;

    /**
     * @return by default NAS devices(switches/aps) and proxies(mxedge) are configured to reach mist-nac via IPv4. enum: `v4`, `v6`
     * 
     */
    public Optional<Output<String>> useIpVersion() {
        return Optional.ofNullable(this.useIpVersion);
    }

    /**
     * By default NAS devices (switches/aps) and proxies(mxedge) are configured to use port TCP2083(radsec) to reach mist-nac.
     * Set `use_ssl_port`==`true` to override that port with TCP43 (ssl),
     * This is a org level setting that is applicable to wlans, switch_templates, and mxedge_clusters that have mist-nac enabled
     * 
     */
    @Import(name="useSslPort")
    private @Nullable Output<Boolean> useSslPort;

    /**
     * @return By default NAS devices (switches/aps) and proxies(mxedge) are configured to use port TCP2083(radsec) to reach mist-nac.
     * Set `use_ssl_port`==`true` to override that port with TCP43 (ssl),
     * This is a org level setting that is applicable to wlans, switch_templates, and mxedge_clusters that have mist-nac enabled
     * 
     */
    public Optional<Output<Boolean>> useSslPort() {
        return Optional.ofNullable(this.useSslPort);
    }

    private SettingMistNacArgs() {}

    private SettingMistNacArgs(SettingMistNacArgs $) {
        this.cacerts = $.cacerts;
        this.defaultIdpId = $.defaultIdpId;
        this.disableRsaeAlgorithms = $.disableRsaeAlgorithms;
        this.eapSslSecurityLevel = $.eapSslSecurityLevel;
        this.euOnly = $.euOnly;
        this.idpMachineCertLookupField = $.idpMachineCertLookupField;
        this.idpUserCertLookupField = $.idpUserCertLookupField;
        this.idps = $.idps;
        this.serverCert = $.serverCert;
        this.useIpVersion = $.useIpVersion;
        this.useSslPort = $.useSslPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingMistNacArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingMistNacArgs $;

        public Builder() {
            $ = new SettingMistNacArgs();
        }

        public Builder(SettingMistNacArgs defaults) {
            $ = new SettingMistNacArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cacerts list of PEM-encoded ca certs
         * 
         * @return builder
         * 
         */
        public Builder cacerts(@Nullable Output<List<String>> cacerts) {
            $.cacerts = cacerts;
            return this;
        }

        /**
         * @param cacerts list of PEM-encoded ca certs
         * 
         * @return builder
         * 
         */
        public Builder cacerts(List<String> cacerts) {
            return cacerts(Output.of(cacerts));
        }

        /**
         * @param cacerts list of PEM-encoded ca certs
         * 
         * @return builder
         * 
         */
        public Builder cacerts(String... cacerts) {
            return cacerts(List.of(cacerts));
        }

        /**
         * @param defaultIdpId use this IDP when no explicit realm present in the incoming username/CN OR when no IDP is explicitly mapped to the incoming realm.
         * 
         * @return builder
         * 
         */
        public Builder defaultIdpId(@Nullable Output<String> defaultIdpId) {
            $.defaultIdpId = defaultIdpId;
            return this;
        }

        /**
         * @param defaultIdpId use this IDP when no explicit realm present in the incoming username/CN OR when no IDP is explicitly mapped to the incoming realm.
         * 
         * @return builder
         * 
         */
        public Builder defaultIdpId(String defaultIdpId) {
            return defaultIdpId(Output.of(defaultIdpId));
        }

        /**
         * @param disableRsaeAlgorithms to disable RSAE_PSS_SHA256, RSAE_PSS_SHA384, RSAE_PSS_SHA512 from server side. see https://www.openssl.org/docs/man3.0/man1/openssl-ciphers.html
         * 
         * @return builder
         * 
         */
        public Builder disableRsaeAlgorithms(@Nullable Output<Boolean> disableRsaeAlgorithms) {
            $.disableRsaeAlgorithms = disableRsaeAlgorithms;
            return this;
        }

        /**
         * @param disableRsaeAlgorithms to disable RSAE_PSS_SHA256, RSAE_PSS_SHA384, RSAE_PSS_SHA512 from server side. see https://www.openssl.org/docs/man3.0/man1/openssl-ciphers.html
         * 
         * @return builder
         * 
         */
        public Builder disableRsaeAlgorithms(Boolean disableRsaeAlgorithms) {
            return disableRsaeAlgorithms(Output.of(disableRsaeAlgorithms));
        }

        /**
         * @param eapSslSecurityLevel eap ssl security level
         * see https://www.openssl.org/docs/man1.1.1/man3/SSL_CTX_set_security_level.html#DEFAULT-CALLBACK-BEHAVIOUR
         * 
         * @return builder
         * 
         */
        public Builder eapSslSecurityLevel(@Nullable Output<Integer> eapSslSecurityLevel) {
            $.eapSslSecurityLevel = eapSslSecurityLevel;
            return this;
        }

        /**
         * @param eapSslSecurityLevel eap ssl security level
         * see https://www.openssl.org/docs/man1.1.1/man3/SSL_CTX_set_security_level.html#DEFAULT-CALLBACK-BEHAVIOUR
         * 
         * @return builder
         * 
         */
        public Builder eapSslSecurityLevel(Integer eapSslSecurityLevel) {
            return eapSslSecurityLevel(Output.of(eapSslSecurityLevel));
        }

        /**
         * @param euOnly By default NAC POD failover considers all NAC pods available around the globe, i.e. EU, US, or APAC based, failover happens based on geo IP of the originating site.
         * For strict GDPR compliancy NAC POD failover would only happen between the PODs located within the EU environment, and no authentication would take place outside of EU. This is an org setting that is applicable to WLANs, switch templates, mxedge clusters that have mist_nac enabled
         * 
         * @return builder
         * 
         */
        public Builder euOnly(@Nullable Output<Boolean> euOnly) {
            $.euOnly = euOnly;
            return this;
        }

        /**
         * @param euOnly By default NAC POD failover considers all NAC pods available around the globe, i.e. EU, US, or APAC based, failover happens based on geo IP of the originating site.
         * For strict GDPR compliancy NAC POD failover would only happen between the PODs located within the EU environment, and no authentication would take place outside of EU. This is an org setting that is applicable to WLANs, switch templates, mxedge clusters that have mist_nac enabled
         * 
         * @return builder
         * 
         */
        public Builder euOnly(Boolean euOnly) {
            return euOnly(Output.of(euOnly));
        }

        /**
         * @param idpMachineCertLookupField allow customer to choose the EAP-TLS client certificate&#39;s field to use for IDP Machine Groups lookup
         * 
         * @return builder
         * 
         */
        public Builder idpMachineCertLookupField(@Nullable Output<String> idpMachineCertLookupField) {
            $.idpMachineCertLookupField = idpMachineCertLookupField;
            return this;
        }

        /**
         * @param idpMachineCertLookupField allow customer to choose the EAP-TLS client certificate&#39;s field to use for IDP Machine Groups lookup
         * 
         * @return builder
         * 
         */
        public Builder idpMachineCertLookupField(String idpMachineCertLookupField) {
            return idpMachineCertLookupField(Output.of(idpMachineCertLookupField));
        }

        /**
         * @param idpUserCertLookupField allow customer to choose the EAP-TLS client certificate&#39;s field to use for IDP User Groups lookup
         * 
         * @return builder
         * 
         */
        public Builder idpUserCertLookupField(@Nullable Output<String> idpUserCertLookupField) {
            $.idpUserCertLookupField = idpUserCertLookupField;
            return this;
        }

        /**
         * @param idpUserCertLookupField allow customer to choose the EAP-TLS client certificate&#39;s field to use for IDP User Groups lookup
         * 
         * @return builder
         * 
         */
        public Builder idpUserCertLookupField(String idpUserCertLookupField) {
            return idpUserCertLookupField(Output.of(idpUserCertLookupField));
        }

        public Builder idps(@Nullable Output<List<SettingMistNacIdpArgs>> idps) {
            $.idps = idps;
            return this;
        }

        public Builder idps(List<SettingMistNacIdpArgs> idps) {
            return idps(Output.of(idps));
        }

        public Builder idps(SettingMistNacIdpArgs... idps) {
            return idps(List.of(idps));
        }

        /**
         * @param serverCert radius server cert to be presented in EAP TLS
         * 
         * @return builder
         * 
         */
        public Builder serverCert(@Nullable Output<SettingMistNacServerCertArgs> serverCert) {
            $.serverCert = serverCert;
            return this;
        }

        /**
         * @param serverCert radius server cert to be presented in EAP TLS
         * 
         * @return builder
         * 
         */
        public Builder serverCert(SettingMistNacServerCertArgs serverCert) {
            return serverCert(Output.of(serverCert));
        }

        /**
         * @param useIpVersion by default NAS devices(switches/aps) and proxies(mxedge) are configured to reach mist-nac via IPv4. enum: `v4`, `v6`
         * 
         * @return builder
         * 
         */
        public Builder useIpVersion(@Nullable Output<String> useIpVersion) {
            $.useIpVersion = useIpVersion;
            return this;
        }

        /**
         * @param useIpVersion by default NAS devices(switches/aps) and proxies(mxedge) are configured to reach mist-nac via IPv4. enum: `v4`, `v6`
         * 
         * @return builder
         * 
         */
        public Builder useIpVersion(String useIpVersion) {
            return useIpVersion(Output.of(useIpVersion));
        }

        /**
         * @param useSslPort By default NAS devices (switches/aps) and proxies(mxedge) are configured to use port TCP2083(radsec) to reach mist-nac.
         * Set `use_ssl_port`==`true` to override that port with TCP43 (ssl),
         * This is a org level setting that is applicable to wlans, switch_templates, and mxedge_clusters that have mist-nac enabled
         * 
         * @return builder
         * 
         */
        public Builder useSslPort(@Nullable Output<Boolean> useSslPort) {
            $.useSslPort = useSslPort;
            return this;
        }

        /**
         * @param useSslPort By default NAS devices (switches/aps) and proxies(mxedge) are configured to use port TCP2083(radsec) to reach mist-nac.
         * Set `use_ssl_port`==`true` to override that port with TCP43 (ssl),
         * This is a org level setting that is applicable to wlans, switch_templates, and mxedge_clusters that have mist-nac enabled
         * 
         * @return builder
         * 
         */
        public Builder useSslPort(Boolean useSslPort) {
            return useSslPort(Output.of(useSslPort));
        }

        public SettingMistNacArgs build() {
            return $;
        }
    }

}
