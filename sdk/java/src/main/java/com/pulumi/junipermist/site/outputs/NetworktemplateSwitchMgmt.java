// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.site.outputs.NetworktemplateSwitchMgmtLocalAccounts;
import com.pulumi.junipermist.site.outputs.NetworktemplateSwitchMgmtProtectRe;
import com.pulumi.junipermist.site.outputs.NetworktemplateSwitchMgmtTacacs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworktemplateSwitchMgmt {
    /**
     * @return AP_affinity_threshold ap_affinity_threshold can be added as a field under site/setting. By default, this value is set to 12. If the field is set in both site/setting and org/setting, the value from site/setting will be used.
     * 
     */
    private @Nullable Integer apAffinityThreshold;
    /**
     * @return Set Banners for switches. Allows markup formatting
     * 
     */
    private @Nullable String cliBanner;
    /**
     * @return Sets timeout for switches
     * 
     */
    private @Nullable Integer cliIdleTimeout;
    /**
     * @return Rollback timer for commit confirmed
     * 
     */
    private @Nullable Integer configRevertTimer;
    /**
     * @return Enable to provide the FQDN with DHCP option 81
     * 
     */
    private @Nullable Boolean dhcpOptionFqdn;
    private @Nullable Boolean disableOobDownAlarm;
    private @Nullable Boolean fipsEnabled;
    /**
     * @return Property key is the user name. For Local user authentication
     * 
     */
    private @Nullable Map<String,NetworktemplateSwitchMgmtLocalAccounts> localAccounts;
    /**
     * @return IP Address or FQDN of the Mist Edge used to proxy the switch management traffic to the Mist Cloud
     * 
     */
    private @Nullable String mxedgeProxyHost;
    /**
     * @return Mist Edge port used to proxy the switch management traffic to the Mist Cloud. Value in range 1-65535
     * 
     */
    private @Nullable String mxedgeProxyPort;
    /**
     * @return Restrict inbound-traffic to host
     * when enabled, all traffic that is not essential to our operation will be dropped
     * e.g. ntp / dns / traffic to mist will be allowed by default, if dhcpd is enabled, we&#39;ll make sure it works
     * 
     */
    private @Nullable NetworktemplateSwitchMgmtProtectRe protectRe;
    /**
     * @return By default, only the configuration generated by Mist is cleaned up during the configuration process. If `true`, all the existing configuration will be removed.
     * 
     */
    private @Nullable Boolean removeExistingConfigs;
    private @Nullable String rootPassword;
    private @Nullable NetworktemplateSwitchMgmtTacacs tacacs;
    /**
     * @return To use mxedge as proxy
     * 
     */
    private @Nullable Boolean useMxedgeProxy;

    private NetworktemplateSwitchMgmt() {}
    /**
     * @return AP_affinity_threshold ap_affinity_threshold can be added as a field under site/setting. By default, this value is set to 12. If the field is set in both site/setting and org/setting, the value from site/setting will be used.
     * 
     */
    public Optional<Integer> apAffinityThreshold() {
        return Optional.ofNullable(this.apAffinityThreshold);
    }
    /**
     * @return Set Banners for switches. Allows markup formatting
     * 
     */
    public Optional<String> cliBanner() {
        return Optional.ofNullable(this.cliBanner);
    }
    /**
     * @return Sets timeout for switches
     * 
     */
    public Optional<Integer> cliIdleTimeout() {
        return Optional.ofNullable(this.cliIdleTimeout);
    }
    /**
     * @return Rollback timer for commit confirmed
     * 
     */
    public Optional<Integer> configRevertTimer() {
        return Optional.ofNullable(this.configRevertTimer);
    }
    /**
     * @return Enable to provide the FQDN with DHCP option 81
     * 
     */
    public Optional<Boolean> dhcpOptionFqdn() {
        return Optional.ofNullable(this.dhcpOptionFqdn);
    }
    public Optional<Boolean> disableOobDownAlarm() {
        return Optional.ofNullable(this.disableOobDownAlarm);
    }
    public Optional<Boolean> fipsEnabled() {
        return Optional.ofNullable(this.fipsEnabled);
    }
    /**
     * @return Property key is the user name. For Local user authentication
     * 
     */
    public Map<String,NetworktemplateSwitchMgmtLocalAccounts> localAccounts() {
        return this.localAccounts == null ? Map.of() : this.localAccounts;
    }
    /**
     * @return IP Address or FQDN of the Mist Edge used to proxy the switch management traffic to the Mist Cloud
     * 
     */
    public Optional<String> mxedgeProxyHost() {
        return Optional.ofNullable(this.mxedgeProxyHost);
    }
    /**
     * @return Mist Edge port used to proxy the switch management traffic to the Mist Cloud. Value in range 1-65535
     * 
     */
    public Optional<String> mxedgeProxyPort() {
        return Optional.ofNullable(this.mxedgeProxyPort);
    }
    /**
     * @return Restrict inbound-traffic to host
     * when enabled, all traffic that is not essential to our operation will be dropped
     * e.g. ntp / dns / traffic to mist will be allowed by default, if dhcpd is enabled, we&#39;ll make sure it works
     * 
     */
    public Optional<NetworktemplateSwitchMgmtProtectRe> protectRe() {
        return Optional.ofNullable(this.protectRe);
    }
    /**
     * @return By default, only the configuration generated by Mist is cleaned up during the configuration process. If `true`, all the existing configuration will be removed.
     * 
     */
    public Optional<Boolean> removeExistingConfigs() {
        return Optional.ofNullable(this.removeExistingConfigs);
    }
    public Optional<String> rootPassword() {
        return Optional.ofNullable(this.rootPassword);
    }
    public Optional<NetworktemplateSwitchMgmtTacacs> tacacs() {
        return Optional.ofNullable(this.tacacs);
    }
    /**
     * @return To use mxedge as proxy
     * 
     */
    public Optional<Boolean> useMxedgeProxy() {
        return Optional.ofNullable(this.useMxedgeProxy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplateSwitchMgmt defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer apAffinityThreshold;
        private @Nullable String cliBanner;
        private @Nullable Integer cliIdleTimeout;
        private @Nullable Integer configRevertTimer;
        private @Nullable Boolean dhcpOptionFqdn;
        private @Nullable Boolean disableOobDownAlarm;
        private @Nullable Boolean fipsEnabled;
        private @Nullable Map<String,NetworktemplateSwitchMgmtLocalAccounts> localAccounts;
        private @Nullable String mxedgeProxyHost;
        private @Nullable String mxedgeProxyPort;
        private @Nullable NetworktemplateSwitchMgmtProtectRe protectRe;
        private @Nullable Boolean removeExistingConfigs;
        private @Nullable String rootPassword;
        private @Nullable NetworktemplateSwitchMgmtTacacs tacacs;
        private @Nullable Boolean useMxedgeProxy;
        public Builder() {}
        public Builder(NetworktemplateSwitchMgmt defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apAffinityThreshold = defaults.apAffinityThreshold;
    	      this.cliBanner = defaults.cliBanner;
    	      this.cliIdleTimeout = defaults.cliIdleTimeout;
    	      this.configRevertTimer = defaults.configRevertTimer;
    	      this.dhcpOptionFqdn = defaults.dhcpOptionFqdn;
    	      this.disableOobDownAlarm = defaults.disableOobDownAlarm;
    	      this.fipsEnabled = defaults.fipsEnabled;
    	      this.localAccounts = defaults.localAccounts;
    	      this.mxedgeProxyHost = defaults.mxedgeProxyHost;
    	      this.mxedgeProxyPort = defaults.mxedgeProxyPort;
    	      this.protectRe = defaults.protectRe;
    	      this.removeExistingConfigs = defaults.removeExistingConfigs;
    	      this.rootPassword = defaults.rootPassword;
    	      this.tacacs = defaults.tacacs;
    	      this.useMxedgeProxy = defaults.useMxedgeProxy;
        }

        @CustomType.Setter
        public Builder apAffinityThreshold(@Nullable Integer apAffinityThreshold) {

            this.apAffinityThreshold = apAffinityThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder cliBanner(@Nullable String cliBanner) {

            this.cliBanner = cliBanner;
            return this;
        }
        @CustomType.Setter
        public Builder cliIdleTimeout(@Nullable Integer cliIdleTimeout) {

            this.cliIdleTimeout = cliIdleTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder configRevertTimer(@Nullable Integer configRevertTimer) {

            this.configRevertTimer = configRevertTimer;
            return this;
        }
        @CustomType.Setter
        public Builder dhcpOptionFqdn(@Nullable Boolean dhcpOptionFqdn) {

            this.dhcpOptionFqdn = dhcpOptionFqdn;
            return this;
        }
        @CustomType.Setter
        public Builder disableOobDownAlarm(@Nullable Boolean disableOobDownAlarm) {

            this.disableOobDownAlarm = disableOobDownAlarm;
            return this;
        }
        @CustomType.Setter
        public Builder fipsEnabled(@Nullable Boolean fipsEnabled) {

            this.fipsEnabled = fipsEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder localAccounts(@Nullable Map<String,NetworktemplateSwitchMgmtLocalAccounts> localAccounts) {

            this.localAccounts = localAccounts;
            return this;
        }
        @CustomType.Setter
        public Builder mxedgeProxyHost(@Nullable String mxedgeProxyHost) {

            this.mxedgeProxyHost = mxedgeProxyHost;
            return this;
        }
        @CustomType.Setter
        public Builder mxedgeProxyPort(@Nullable String mxedgeProxyPort) {

            this.mxedgeProxyPort = mxedgeProxyPort;
            return this;
        }
        @CustomType.Setter
        public Builder protectRe(@Nullable NetworktemplateSwitchMgmtProtectRe protectRe) {

            this.protectRe = protectRe;
            return this;
        }
        @CustomType.Setter
        public Builder removeExistingConfigs(@Nullable Boolean removeExistingConfigs) {

            this.removeExistingConfigs = removeExistingConfigs;
            return this;
        }
        @CustomType.Setter
        public Builder rootPassword(@Nullable String rootPassword) {

            this.rootPassword = rootPassword;
            return this;
        }
        @CustomType.Setter
        public Builder tacacs(@Nullable NetworktemplateSwitchMgmtTacacs tacacs) {

            this.tacacs = tacacs;
            return this;
        }
        @CustomType.Setter
        public Builder useMxedgeProxy(@Nullable Boolean useMxedgeProxy) {

            this.useMxedgeProxy = useMxedgeProxy;
            return this;
        }
        public NetworktemplateSwitchMgmt build() {
            final var _resultValue = new NetworktemplateSwitchMgmt();
            _resultValue.apAffinityThreshold = apAffinityThreshold;
            _resultValue.cliBanner = cliBanner;
            _resultValue.cliIdleTimeout = cliIdleTimeout;
            _resultValue.configRevertTimer = configRevertTimer;
            _resultValue.dhcpOptionFqdn = dhcpOptionFqdn;
            _resultValue.disableOobDownAlarm = disableOobDownAlarm;
            _resultValue.fipsEnabled = fipsEnabled;
            _resultValue.localAccounts = localAccounts;
            _resultValue.mxedgeProxyHost = mxedgeProxyHost;
            _resultValue.mxedgeProxyPort = mxedgeProxyPort;
            _resultValue.protectRe = protectRe;
            _resultValue.removeExistingConfigs = removeExistingConfigs;
            _resultValue.rootPassword = rootPassword;
            _resultValue.tacacs = tacacs;
            _resultValue.useMxedgeProxy = useMxedgeProxy;
            return _resultValue;
        }
    }
}
