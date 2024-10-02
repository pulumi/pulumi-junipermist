// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.site.outputs.SettingGatewayMgmtAppProbing;
import com.pulumi.junipermist.site.outputs.SettingGatewayMgmtAutoSignatureUpdate;
import com.pulumi.junipermist.site.outputs.SettingGatewayMgmtProtectRe;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SettingGatewayMgmt {
    /**
     * @return for SSR only, as direct root access is not allowed
     * 
     */
    private @Nullable List<String> adminSshkeys;
    private @Nullable SettingGatewayMgmtAppProbing appProbing;
    /**
     * @return consumes uplink bandwidth, requires WA license
     * 
     */
    private @Nullable Boolean appUsage;
    private @Nullable SettingGatewayMgmtAutoSignatureUpdate autoSignatureUpdate;
    /**
     * @return he rollback timer for commit confirmed
     * 
     */
    private @Nullable Integer configRevertTimer;
    /**
     * @return for both SSR and SRX disable console port
     * 
     */
    private @Nullable Boolean disableConsole;
    /**
     * @return for both SSR and SRX disable management interface
     * 
     */
    private @Nullable Boolean disableOob;
    private @Nullable List<String> probeHosts;
    /**
     * @return restrict inbound-traffic to host
     * when enabled, all traffic that is not essential to our operation will be dropped
     * e.g. ntp / dns / traffic to mist will be allowed by default, if dhcpd is enabled, we&#39;ll make sure it works
     * 
     */
    private @Nullable SettingGatewayMgmtProtectRe protectRe;
    /**
     * @return for SRX only
     * 
     */
    private @Nullable String rootPassword;
    private @Nullable String securityLogSourceAddress;
    private @Nullable String securityLogSourceInterface;

    private SettingGatewayMgmt() {}
    /**
     * @return for SSR only, as direct root access is not allowed
     * 
     */
    public List<String> adminSshkeys() {
        return this.adminSshkeys == null ? List.of() : this.adminSshkeys;
    }
    public Optional<SettingGatewayMgmtAppProbing> appProbing() {
        return Optional.ofNullable(this.appProbing);
    }
    /**
     * @return consumes uplink bandwidth, requires WA license
     * 
     */
    public Optional<Boolean> appUsage() {
        return Optional.ofNullable(this.appUsage);
    }
    public Optional<SettingGatewayMgmtAutoSignatureUpdate> autoSignatureUpdate() {
        return Optional.ofNullable(this.autoSignatureUpdate);
    }
    /**
     * @return he rollback timer for commit confirmed
     * 
     */
    public Optional<Integer> configRevertTimer() {
        return Optional.ofNullable(this.configRevertTimer);
    }
    /**
     * @return for both SSR and SRX disable console port
     * 
     */
    public Optional<Boolean> disableConsole() {
        return Optional.ofNullable(this.disableConsole);
    }
    /**
     * @return for both SSR and SRX disable management interface
     * 
     */
    public Optional<Boolean> disableOob() {
        return Optional.ofNullable(this.disableOob);
    }
    public List<String> probeHosts() {
        return this.probeHosts == null ? List.of() : this.probeHosts;
    }
    /**
     * @return restrict inbound-traffic to host
     * when enabled, all traffic that is not essential to our operation will be dropped
     * e.g. ntp / dns / traffic to mist will be allowed by default, if dhcpd is enabled, we&#39;ll make sure it works
     * 
     */
    public Optional<SettingGatewayMgmtProtectRe> protectRe() {
        return Optional.ofNullable(this.protectRe);
    }
    /**
     * @return for SRX only
     * 
     */
    public Optional<String> rootPassword() {
        return Optional.ofNullable(this.rootPassword);
    }
    public Optional<String> securityLogSourceAddress() {
        return Optional.ofNullable(this.securityLogSourceAddress);
    }
    public Optional<String> securityLogSourceInterface() {
        return Optional.ofNullable(this.securityLogSourceInterface);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingGatewayMgmt defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> adminSshkeys;
        private @Nullable SettingGatewayMgmtAppProbing appProbing;
        private @Nullable Boolean appUsage;
        private @Nullable SettingGatewayMgmtAutoSignatureUpdate autoSignatureUpdate;
        private @Nullable Integer configRevertTimer;
        private @Nullable Boolean disableConsole;
        private @Nullable Boolean disableOob;
        private @Nullable List<String> probeHosts;
        private @Nullable SettingGatewayMgmtProtectRe protectRe;
        private @Nullable String rootPassword;
        private @Nullable String securityLogSourceAddress;
        private @Nullable String securityLogSourceInterface;
        public Builder() {}
        public Builder(SettingGatewayMgmt defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminSshkeys = defaults.adminSshkeys;
    	      this.appProbing = defaults.appProbing;
    	      this.appUsage = defaults.appUsage;
    	      this.autoSignatureUpdate = defaults.autoSignatureUpdate;
    	      this.configRevertTimer = defaults.configRevertTimer;
    	      this.disableConsole = defaults.disableConsole;
    	      this.disableOob = defaults.disableOob;
    	      this.probeHosts = defaults.probeHosts;
    	      this.protectRe = defaults.protectRe;
    	      this.rootPassword = defaults.rootPassword;
    	      this.securityLogSourceAddress = defaults.securityLogSourceAddress;
    	      this.securityLogSourceInterface = defaults.securityLogSourceInterface;
        }

        @CustomType.Setter
        public Builder adminSshkeys(@Nullable List<String> adminSshkeys) {

            this.adminSshkeys = adminSshkeys;
            return this;
        }
        public Builder adminSshkeys(String... adminSshkeys) {
            return adminSshkeys(List.of(adminSshkeys));
        }
        @CustomType.Setter
        public Builder appProbing(@Nullable SettingGatewayMgmtAppProbing appProbing) {

            this.appProbing = appProbing;
            return this;
        }
        @CustomType.Setter
        public Builder appUsage(@Nullable Boolean appUsage) {

            this.appUsage = appUsage;
            return this;
        }
        @CustomType.Setter
        public Builder autoSignatureUpdate(@Nullable SettingGatewayMgmtAutoSignatureUpdate autoSignatureUpdate) {

            this.autoSignatureUpdate = autoSignatureUpdate;
            return this;
        }
        @CustomType.Setter
        public Builder configRevertTimer(@Nullable Integer configRevertTimer) {

            this.configRevertTimer = configRevertTimer;
            return this;
        }
        @CustomType.Setter
        public Builder disableConsole(@Nullable Boolean disableConsole) {

            this.disableConsole = disableConsole;
            return this;
        }
        @CustomType.Setter
        public Builder disableOob(@Nullable Boolean disableOob) {

            this.disableOob = disableOob;
            return this;
        }
        @CustomType.Setter
        public Builder probeHosts(@Nullable List<String> probeHosts) {

            this.probeHosts = probeHosts;
            return this;
        }
        public Builder probeHosts(String... probeHosts) {
            return probeHosts(List.of(probeHosts));
        }
        @CustomType.Setter
        public Builder protectRe(@Nullable SettingGatewayMgmtProtectRe protectRe) {

            this.protectRe = protectRe;
            return this;
        }
        @CustomType.Setter
        public Builder rootPassword(@Nullable String rootPassword) {

            this.rootPassword = rootPassword;
            return this;
        }
        @CustomType.Setter
        public Builder securityLogSourceAddress(@Nullable String securityLogSourceAddress) {

            this.securityLogSourceAddress = securityLogSourceAddress;
            return this;
        }
        @CustomType.Setter
        public Builder securityLogSourceInterface(@Nullable String securityLogSourceInterface) {

            this.securityLogSourceInterface = securityLogSourceInterface;
            return this;
        }
        public SettingGatewayMgmt build() {
            final var _resultValue = new SettingGatewayMgmt();
            _resultValue.adminSshkeys = adminSshkeys;
            _resultValue.appProbing = appProbing;
            _resultValue.appUsage = appUsage;
            _resultValue.autoSignatureUpdate = autoSignatureUpdate;
            _resultValue.configRevertTimer = configRevertTimer;
            _resultValue.disableConsole = disableConsole;
            _resultValue.disableOob = disableOob;
            _resultValue.probeHosts = probeHosts;
            _resultValue.protectRe = protectRe;
            _resultValue.rootPassword = rootPassword;
            _resultValue.securityLogSourceAddress = securityLogSourceAddress;
            _resultValue.securityLogSourceInterface = securityLogSourceInterface;
            return _resultValue;
        }
    }
}