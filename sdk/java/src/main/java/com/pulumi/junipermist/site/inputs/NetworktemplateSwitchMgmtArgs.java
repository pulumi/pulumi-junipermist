// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.site.inputs.NetworktemplateSwitchMgmtLocalAccountsArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateSwitchMgmtProtectReArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateSwitchMgmtTacacsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworktemplateSwitchMgmtArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplateSwitchMgmtArgs Empty = new NetworktemplateSwitchMgmtArgs();

    /**
     * ap_affinity_threshold ap_affinity_threshold can be added as a field under site/setting. By default this value is set to 12. If the field is set in both site/setting and org/setting, the value from site/setting will be used.
     * 
     */
    @Import(name="apAffinityThreshold")
    private @Nullable Output<Integer> apAffinityThreshold;

    /**
     * @return ap_affinity_threshold ap_affinity_threshold can be added as a field under site/setting. By default this value is set to 12. If the field is set in both site/setting and org/setting, the value from site/setting will be used.
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
     * the rollback timer for commit confirmed
     * 
     */
    @Import(name="configRevertTimer")
    private @Nullable Output<Integer> configRevertTimer;

    /**
     * @return the rollback timer for commit confirmed
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

    /**
     * Property key is the user name. For Local user authentication
     * 
     */
    @Import(name="localAccounts")
    private @Nullable Output<Map<String,NetworktemplateSwitchMgmtLocalAccountsArgs>> localAccounts;

    /**
     * @return Property key is the user name. For Local user authentication
     * 
     */
    public Optional<Output<Map<String,NetworktemplateSwitchMgmtLocalAccountsArgs>>> localAccounts() {
        return Optional.ofNullable(this.localAccounts);
    }

    @Import(name="mxedgeProxyHost")
    private @Nullable Output<String> mxedgeProxyHost;

    public Optional<Output<String>> mxedgeProxyHost() {
        return Optional.ofNullable(this.mxedgeProxyHost);
    }

    @Import(name="mxedgeProxyPort")
    private @Nullable Output<Integer> mxedgeProxyPort;

    public Optional<Output<Integer>> mxedgeProxyPort() {
        return Optional.ofNullable(this.mxedgeProxyPort);
    }

    /**
     * restrict inbound-traffic to host
     * when enabled, all traffic that is not essential to our operation will be dropped
     * e.g. ntp / dns / traffic to mist will be allowed by default, if dhcpd is enabled, we&#39;ll make sure it works
     * 
     */
    @Import(name="protectRe")
    private @Nullable Output<NetworktemplateSwitchMgmtProtectReArgs> protectRe;

    /**
     * @return restrict inbound-traffic to host
     * when enabled, all traffic that is not essential to our operation will be dropped
     * e.g. ntp / dns / traffic to mist will be allowed by default, if dhcpd is enabled, we&#39;ll make sure it works
     * 
     */
    public Optional<Output<NetworktemplateSwitchMgmtProtectReArgs>> protectRe() {
        return Optional.ofNullable(this.protectRe);
    }

    @Import(name="rootPassword")
    private @Nullable Output<String> rootPassword;

    public Optional<Output<String>> rootPassword() {
        return Optional.ofNullable(this.rootPassword);
    }

    @Import(name="tacacs")
    private @Nullable Output<NetworktemplateSwitchMgmtTacacsArgs> tacacs;

    public Optional<Output<NetworktemplateSwitchMgmtTacacsArgs>> tacacs() {
        return Optional.ofNullable(this.tacacs);
    }

    /**
     * to use mxedge as proxy
     * 
     */
    @Import(name="useMxedgeProxy")
    private @Nullable Output<Boolean> useMxedgeProxy;

    /**
     * @return to use mxedge as proxy
     * 
     */
    public Optional<Output<Boolean>> useMxedgeProxy() {
        return Optional.ofNullable(this.useMxedgeProxy);
    }

    private NetworktemplateSwitchMgmtArgs() {}

    private NetworktemplateSwitchMgmtArgs(NetworktemplateSwitchMgmtArgs $) {
        this.apAffinityThreshold = $.apAffinityThreshold;
        this.cliBanner = $.cliBanner;
        this.cliIdleTimeout = $.cliIdleTimeout;
        this.configRevertTimer = $.configRevertTimer;
        this.dhcpOptionFqdn = $.dhcpOptionFqdn;
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
    public static Builder builder(NetworktemplateSwitchMgmtArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplateSwitchMgmtArgs $;

        public Builder() {
            $ = new NetworktemplateSwitchMgmtArgs();
        }

        public Builder(NetworktemplateSwitchMgmtArgs defaults) {
            $ = new NetworktemplateSwitchMgmtArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apAffinityThreshold ap_affinity_threshold ap_affinity_threshold can be added as a field under site/setting. By default this value is set to 12. If the field is set in both site/setting and org/setting, the value from site/setting will be used.
         * 
         * @return builder
         * 
         */
        public Builder apAffinityThreshold(@Nullable Output<Integer> apAffinityThreshold) {
            $.apAffinityThreshold = apAffinityThreshold;
            return this;
        }

        /**
         * @param apAffinityThreshold ap_affinity_threshold ap_affinity_threshold can be added as a field under site/setting. By default this value is set to 12. If the field is set in both site/setting and org/setting, the value from site/setting will be used.
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
         * @param configRevertTimer the rollback timer for commit confirmed
         * 
         * @return builder
         * 
         */
        public Builder configRevertTimer(@Nullable Output<Integer> configRevertTimer) {
            $.configRevertTimer = configRevertTimer;
            return this;
        }

        /**
         * @param configRevertTimer the rollback timer for commit confirmed
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

        /**
         * @param localAccounts Property key is the user name. For Local user authentication
         * 
         * @return builder
         * 
         */
        public Builder localAccounts(@Nullable Output<Map<String,NetworktemplateSwitchMgmtLocalAccountsArgs>> localAccounts) {
            $.localAccounts = localAccounts;
            return this;
        }

        /**
         * @param localAccounts Property key is the user name. For Local user authentication
         * 
         * @return builder
         * 
         */
        public Builder localAccounts(Map<String,NetworktemplateSwitchMgmtLocalAccountsArgs> localAccounts) {
            return localAccounts(Output.of(localAccounts));
        }

        public Builder mxedgeProxyHost(@Nullable Output<String> mxedgeProxyHost) {
            $.mxedgeProxyHost = mxedgeProxyHost;
            return this;
        }

        public Builder mxedgeProxyHost(String mxedgeProxyHost) {
            return mxedgeProxyHost(Output.of(mxedgeProxyHost));
        }

        public Builder mxedgeProxyPort(@Nullable Output<Integer> mxedgeProxyPort) {
            $.mxedgeProxyPort = mxedgeProxyPort;
            return this;
        }

        public Builder mxedgeProxyPort(Integer mxedgeProxyPort) {
            return mxedgeProxyPort(Output.of(mxedgeProxyPort));
        }

        /**
         * @param protectRe restrict inbound-traffic to host
         * when enabled, all traffic that is not essential to our operation will be dropped
         * e.g. ntp / dns / traffic to mist will be allowed by default, if dhcpd is enabled, we&#39;ll make sure it works
         * 
         * @return builder
         * 
         */
        public Builder protectRe(@Nullable Output<NetworktemplateSwitchMgmtProtectReArgs> protectRe) {
            $.protectRe = protectRe;
            return this;
        }

        /**
         * @param protectRe restrict inbound-traffic to host
         * when enabled, all traffic that is not essential to our operation will be dropped
         * e.g. ntp / dns / traffic to mist will be allowed by default, if dhcpd is enabled, we&#39;ll make sure it works
         * 
         * @return builder
         * 
         */
        public Builder protectRe(NetworktemplateSwitchMgmtProtectReArgs protectRe) {
            return protectRe(Output.of(protectRe));
        }

        public Builder rootPassword(@Nullable Output<String> rootPassword) {
            $.rootPassword = rootPassword;
            return this;
        }

        public Builder rootPassword(String rootPassword) {
            return rootPassword(Output.of(rootPassword));
        }

        public Builder tacacs(@Nullable Output<NetworktemplateSwitchMgmtTacacsArgs> tacacs) {
            $.tacacs = tacacs;
            return this;
        }

        public Builder tacacs(NetworktemplateSwitchMgmtTacacsArgs tacacs) {
            return tacacs(Output.of(tacacs));
        }

        /**
         * @param useMxedgeProxy to use mxedge as proxy
         * 
         * @return builder
         * 
         */
        public Builder useMxedgeProxy(@Nullable Output<Boolean> useMxedgeProxy) {
            $.useMxedgeProxy = useMxedgeProxy;
            return this;
        }

        /**
         * @param useMxedgeProxy to use mxedge as proxy
         * 
         * @return builder
         * 
         */
        public Builder useMxedgeProxy(Boolean useMxedgeProxy) {
            return useMxedgeProxy(Output.of(useMxedgeProxy));
        }

        public NetworktemplateSwitchMgmtArgs build() {
            return $;
        }
    }

}
