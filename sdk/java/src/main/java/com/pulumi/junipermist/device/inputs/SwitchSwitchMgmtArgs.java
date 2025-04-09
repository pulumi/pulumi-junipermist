// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.device.inputs.SwitchSwitchMgmtLocalAccountsArgs;
import com.pulumi.junipermist.device.inputs.SwitchSwitchMgmtProtectReArgs;
import com.pulumi.junipermist.device.inputs.SwitchSwitchMgmtTacacsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchSwitchMgmtArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchSwitchMgmtArgs Empty = new SwitchSwitchMgmtArgs();

    /**
     * AP_affinity_threshold ap_affinity_threshold can be added as a field under site/setting. By default, this value is set to 12. If the field is set in both site/setting and org/setting, the value from site/setting will be used.
     * 
     */
    @Import(name="apAffinityThreshold")
    private @Nullable Output<Integer> apAffinityThreshold;

    /**
     * @return AP_affinity_threshold ap_affinity_threshold can be added as a field under site/setting. By default, this value is set to 12. If the field is set in both site/setting and org/setting, the value from site/setting will be used.
     * 
     */
    public Optional<Output<Integer>> apAffinityThreshold() {
        return Optional.ofNullable(this.apAffinityThreshold);
    }

    /**
     * Set Banners for switches. Allows markup formatting
     * 
     */
    @Import(name="cliBanner")
    private @Nullable Output<String> cliBanner;

    /**
     * @return Set Banners for switches. Allows markup formatting
     * 
     */
    public Optional<Output<String>> cliBanner() {
        return Optional.ofNullable(this.cliBanner);
    }

    /**
     * Sets timeout for switches
     * 
     */
    @Import(name="cliIdleTimeout")
    private @Nullable Output<Integer> cliIdleTimeout;

    /**
     * @return Sets timeout for switches
     * 
     */
    public Optional<Output<Integer>> cliIdleTimeout() {
        return Optional.ofNullable(this.cliIdleTimeout);
    }

    /**
     * Rollback timer for commit confirmed
     * 
     */
    @Import(name="configRevertTimer")
    private @Nullable Output<Integer> configRevertTimer;

    /**
     * @return Rollback timer for commit confirmed
     * 
     */
    public Optional<Output<Integer>> configRevertTimer() {
        return Optional.ofNullable(this.configRevertTimer);
    }

    /**
     * Enable to provide the FQDN with DHCP option 81
     * 
     */
    @Import(name="dhcpOptionFqdn")
    private @Nullable Output<Boolean> dhcpOptionFqdn;

    /**
     * @return Enable to provide the FQDN with DHCP option 81
     * 
     */
    public Optional<Output<Boolean>> dhcpOptionFqdn() {
        return Optional.ofNullable(this.dhcpOptionFqdn);
    }

    @Import(name="disableOobDownAlarm")
    private @Nullable Output<Boolean> disableOobDownAlarm;

    public Optional<Output<Boolean>> disableOobDownAlarm() {
        return Optional.ofNullable(this.disableOobDownAlarm);
    }

    @Import(name="fipsEnabled")
    private @Nullable Output<Boolean> fipsEnabled;

    public Optional<Output<Boolean>> fipsEnabled() {
        return Optional.ofNullable(this.fipsEnabled);
    }

    /**
     * Property key is the user name. For Local user authentication
     * 
     */
    @Import(name="localAccounts")
    private @Nullable Output<Map<String,SwitchSwitchMgmtLocalAccountsArgs>> localAccounts;

    /**
     * @return Property key is the user name. For Local user authentication
     * 
     */
    public Optional<Output<Map<String,SwitchSwitchMgmtLocalAccountsArgs>>> localAccounts() {
        return Optional.ofNullable(this.localAccounts);
    }

    /**
     * IP Address or FQDN of the Mist Edge used to proxy the switch management traffic to the Mist Cloud
     * 
     */
    @Import(name="mxedgeProxyHost")
    private @Nullable Output<String> mxedgeProxyHost;

    /**
     * @return IP Address or FQDN of the Mist Edge used to proxy the switch management traffic to the Mist Cloud
     * 
     */
    public Optional<Output<String>> mxedgeProxyHost() {
        return Optional.ofNullable(this.mxedgeProxyHost);
    }

    /**
     * Mist Edge port used to proxy the switch management traffic to the Mist Cloud. Value in range 1-65535
     * 
     */
    @Import(name="mxedgeProxyPort")
    private @Nullable Output<String> mxedgeProxyPort;

    /**
     * @return Mist Edge port used to proxy the switch management traffic to the Mist Cloud. Value in range 1-65535
     * 
     */
    public Optional<Output<String>> mxedgeProxyPort() {
        return Optional.ofNullable(this.mxedgeProxyPort);
    }

    /**
     * Restrict inbound-traffic to host
     * when enabled, all traffic that is not essential to our operation will be dropped
     * e.g. ntp / dns / traffic to mist will be allowed by default, if dhcpd is enabled, we&#39;ll make sure it works
     * 
     */
    @Import(name="protectRe")
    private @Nullable Output<SwitchSwitchMgmtProtectReArgs> protectRe;

    /**
     * @return Restrict inbound-traffic to host
     * when enabled, all traffic that is not essential to our operation will be dropped
     * e.g. ntp / dns / traffic to mist will be allowed by default, if dhcpd is enabled, we&#39;ll make sure it works
     * 
     */
    public Optional<Output<SwitchSwitchMgmtProtectReArgs>> protectRe() {
        return Optional.ofNullable(this.protectRe);
    }

    @Import(name="rootPassword")
    private @Nullable Output<String> rootPassword;

    public Optional<Output<String>> rootPassword() {
        return Optional.ofNullable(this.rootPassword);
    }

    @Import(name="tacacs")
    private @Nullable Output<SwitchSwitchMgmtTacacsArgs> tacacs;

    public Optional<Output<SwitchSwitchMgmtTacacsArgs>> tacacs() {
        return Optional.ofNullable(this.tacacs);
    }

    /**
     * To use mxedge as proxy
     * 
     */
    @Import(name="useMxedgeProxy")
    private @Nullable Output<Boolean> useMxedgeProxy;

    /**
     * @return To use mxedge as proxy
     * 
     */
    public Optional<Output<Boolean>> useMxedgeProxy() {
        return Optional.ofNullable(this.useMxedgeProxy);
    }

    private SwitchSwitchMgmtArgs() {}

    private SwitchSwitchMgmtArgs(SwitchSwitchMgmtArgs $) {
        this.apAffinityThreshold = $.apAffinityThreshold;
        this.cliBanner = $.cliBanner;
        this.cliIdleTimeout = $.cliIdleTimeout;
        this.configRevertTimer = $.configRevertTimer;
        this.dhcpOptionFqdn = $.dhcpOptionFqdn;
        this.disableOobDownAlarm = $.disableOobDownAlarm;
        this.fipsEnabled = $.fipsEnabled;
        this.localAccounts = $.localAccounts;
        this.mxedgeProxyHost = $.mxedgeProxyHost;
        this.mxedgeProxyPort = $.mxedgeProxyPort;
        this.protectRe = $.protectRe;
        this.rootPassword = $.rootPassword;
        this.tacacs = $.tacacs;
        this.useMxedgeProxy = $.useMxedgeProxy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchSwitchMgmtArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchSwitchMgmtArgs $;

        public Builder() {
            $ = new SwitchSwitchMgmtArgs();
        }

        public Builder(SwitchSwitchMgmtArgs defaults) {
            $ = new SwitchSwitchMgmtArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apAffinityThreshold AP_affinity_threshold ap_affinity_threshold can be added as a field under site/setting. By default, this value is set to 12. If the field is set in both site/setting and org/setting, the value from site/setting will be used.
         * 
         * @return builder
         * 
         */
        public Builder apAffinityThreshold(@Nullable Output<Integer> apAffinityThreshold) {
            $.apAffinityThreshold = apAffinityThreshold;
            return this;
        }

        /**
         * @param apAffinityThreshold AP_affinity_threshold ap_affinity_threshold can be added as a field under site/setting. By default, this value is set to 12. If the field is set in both site/setting and org/setting, the value from site/setting will be used.
         * 
         * @return builder
         * 
         */
        public Builder apAffinityThreshold(Integer apAffinityThreshold) {
            return apAffinityThreshold(Output.of(apAffinityThreshold));
        }

        /**
         * @param cliBanner Set Banners for switches. Allows markup formatting
         * 
         * @return builder
         * 
         */
        public Builder cliBanner(@Nullable Output<String> cliBanner) {
            $.cliBanner = cliBanner;
            return this;
        }

        /**
         * @param cliBanner Set Banners for switches. Allows markup formatting
         * 
         * @return builder
         * 
         */
        public Builder cliBanner(String cliBanner) {
            return cliBanner(Output.of(cliBanner));
        }

        /**
         * @param cliIdleTimeout Sets timeout for switches
         * 
         * @return builder
         * 
         */
        public Builder cliIdleTimeout(@Nullable Output<Integer> cliIdleTimeout) {
            $.cliIdleTimeout = cliIdleTimeout;
            return this;
        }

        /**
         * @param cliIdleTimeout Sets timeout for switches
         * 
         * @return builder
         * 
         */
        public Builder cliIdleTimeout(Integer cliIdleTimeout) {
            return cliIdleTimeout(Output.of(cliIdleTimeout));
        }

        /**
         * @param configRevertTimer Rollback timer for commit confirmed
         * 
         * @return builder
         * 
         */
        public Builder configRevertTimer(@Nullable Output<Integer> configRevertTimer) {
            $.configRevertTimer = configRevertTimer;
            return this;
        }

        /**
         * @param configRevertTimer Rollback timer for commit confirmed
         * 
         * @return builder
         * 
         */
        public Builder configRevertTimer(Integer configRevertTimer) {
            return configRevertTimer(Output.of(configRevertTimer));
        }

        /**
         * @param dhcpOptionFqdn Enable to provide the FQDN with DHCP option 81
         * 
         * @return builder
         * 
         */
        public Builder dhcpOptionFqdn(@Nullable Output<Boolean> dhcpOptionFqdn) {
            $.dhcpOptionFqdn = dhcpOptionFqdn;
            return this;
        }

        /**
         * @param dhcpOptionFqdn Enable to provide the FQDN with DHCP option 81
         * 
         * @return builder
         * 
         */
        public Builder dhcpOptionFqdn(Boolean dhcpOptionFqdn) {
            return dhcpOptionFqdn(Output.of(dhcpOptionFqdn));
        }

        public Builder disableOobDownAlarm(@Nullable Output<Boolean> disableOobDownAlarm) {
            $.disableOobDownAlarm = disableOobDownAlarm;
            return this;
        }

        public Builder disableOobDownAlarm(Boolean disableOobDownAlarm) {
            return disableOobDownAlarm(Output.of(disableOobDownAlarm));
        }

        public Builder fipsEnabled(@Nullable Output<Boolean> fipsEnabled) {
            $.fipsEnabled = fipsEnabled;
            return this;
        }

        public Builder fipsEnabled(Boolean fipsEnabled) {
            return fipsEnabled(Output.of(fipsEnabled));
        }

        /**
         * @param localAccounts Property key is the user name. For Local user authentication
         * 
         * @return builder
         * 
         */
        public Builder localAccounts(@Nullable Output<Map<String,SwitchSwitchMgmtLocalAccountsArgs>> localAccounts) {
            $.localAccounts = localAccounts;
            return this;
        }

        /**
         * @param localAccounts Property key is the user name. For Local user authentication
         * 
         * @return builder
         * 
         */
        public Builder localAccounts(Map<String,SwitchSwitchMgmtLocalAccountsArgs> localAccounts) {
            return localAccounts(Output.of(localAccounts));
        }

        /**
         * @param mxedgeProxyHost IP Address or FQDN of the Mist Edge used to proxy the switch management traffic to the Mist Cloud
         * 
         * @return builder
         * 
         */
        public Builder mxedgeProxyHost(@Nullable Output<String> mxedgeProxyHost) {
            $.mxedgeProxyHost = mxedgeProxyHost;
            return this;
        }

        /**
         * @param mxedgeProxyHost IP Address or FQDN of the Mist Edge used to proxy the switch management traffic to the Mist Cloud
         * 
         * @return builder
         * 
         */
        public Builder mxedgeProxyHost(String mxedgeProxyHost) {
            return mxedgeProxyHost(Output.of(mxedgeProxyHost));
        }

        /**
         * @param mxedgeProxyPort Mist Edge port used to proxy the switch management traffic to the Mist Cloud. Value in range 1-65535
         * 
         * @return builder
         * 
         */
        public Builder mxedgeProxyPort(@Nullable Output<String> mxedgeProxyPort) {
            $.mxedgeProxyPort = mxedgeProxyPort;
            return this;
        }

        /**
         * @param mxedgeProxyPort Mist Edge port used to proxy the switch management traffic to the Mist Cloud. Value in range 1-65535
         * 
         * @return builder
         * 
         */
        public Builder mxedgeProxyPort(String mxedgeProxyPort) {
            return mxedgeProxyPort(Output.of(mxedgeProxyPort));
        }

        /**
         * @param protectRe Restrict inbound-traffic to host
         * when enabled, all traffic that is not essential to our operation will be dropped
         * e.g. ntp / dns / traffic to mist will be allowed by default, if dhcpd is enabled, we&#39;ll make sure it works
         * 
         * @return builder
         * 
         */
        public Builder protectRe(@Nullable Output<SwitchSwitchMgmtProtectReArgs> protectRe) {
            $.protectRe = protectRe;
            return this;
        }

        /**
         * @param protectRe Restrict inbound-traffic to host
         * when enabled, all traffic that is not essential to our operation will be dropped
         * e.g. ntp / dns / traffic to mist will be allowed by default, if dhcpd is enabled, we&#39;ll make sure it works
         * 
         * @return builder
         * 
         */
        public Builder protectRe(SwitchSwitchMgmtProtectReArgs protectRe) {
            return protectRe(Output.of(protectRe));
        }

        public Builder rootPassword(@Nullable Output<String> rootPassword) {
            $.rootPassword = rootPassword;
            return this;
        }

        public Builder rootPassword(String rootPassword) {
            return rootPassword(Output.of(rootPassword));
        }

        public Builder tacacs(@Nullable Output<SwitchSwitchMgmtTacacsArgs> tacacs) {
            $.tacacs = tacacs;
            return this;
        }

        public Builder tacacs(SwitchSwitchMgmtTacacsArgs tacacs) {
            return tacacs(Output.of(tacacs));
        }

        /**
         * @param useMxedgeProxy To use mxedge as proxy
         * 
         * @return builder
         * 
         */
        public Builder useMxedgeProxy(@Nullable Output<Boolean> useMxedgeProxy) {
            $.useMxedgeProxy = useMxedgeProxy;
            return this;
        }

        /**
         * @param useMxedgeProxy To use mxedge as proxy
         * 
         * @return builder
         * 
         */
        public Builder useMxedgeProxy(Boolean useMxedgeProxy) {
            return useMxedgeProxy(Output.of(useMxedgeProxy));
        }

        public SwitchSwitchMgmtArgs build() {
            return $;
        }
    }

}
