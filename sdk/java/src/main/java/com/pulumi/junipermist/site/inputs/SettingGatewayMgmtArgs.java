// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.site.inputs.SettingGatewayMgmtAppProbingArgs;
import com.pulumi.junipermist.site.inputs.SettingGatewayMgmtAutoSignatureUpdateArgs;
import com.pulumi.junipermist.site.inputs.SettingGatewayMgmtProtectReArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingGatewayMgmtArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingGatewayMgmtArgs Empty = new SettingGatewayMgmtArgs();

    /**
     * For SSR only, as direct root access is not allowed
     * 
     */
    @Import(name="adminSshkeys")
    private @Nullable Output<List<String>> adminSshkeys;

    /**
     * @return For SSR only, as direct root access is not allowed
     * 
     */
    public Optional<Output<List<String>>> adminSshkeys() {
        return Optional.ofNullable(this.adminSshkeys);
    }

    @Import(name="appProbing")
    private @Nullable Output<SettingGatewayMgmtAppProbingArgs> appProbing;

    public Optional<Output<SettingGatewayMgmtAppProbingArgs>> appProbing() {
        return Optional.ofNullable(this.appProbing);
    }

    /**
     * Consumes uplink bandwidth, requires WA license
     * 
     */
    @Import(name="appUsage")
    private @Nullable Output<Boolean> appUsage;

    /**
     * @return Consumes uplink bandwidth, requires WA license
     * 
     */
    public Optional<Output<Boolean>> appUsage() {
        return Optional.ofNullable(this.appUsage);
    }

    @Import(name="autoSignatureUpdate")
    private @Nullable Output<SettingGatewayMgmtAutoSignatureUpdateArgs> autoSignatureUpdate;

    public Optional<Output<SettingGatewayMgmtAutoSignatureUpdateArgs>> autoSignatureUpdate() {
        return Optional.ofNullable(this.autoSignatureUpdate);
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
     * For both SSR and SRX disable console port
     * 
     */
    @Import(name="disableConsole")
    private @Nullable Output<Boolean> disableConsole;

    /**
     * @return For both SSR and SRX disable console port
     * 
     */
    public Optional<Output<Boolean>> disableConsole() {
        return Optional.ofNullable(this.disableConsole);
    }

    /**
     * For both SSR and SRX disable management interface
     * 
     */
    @Import(name="disableOob")
    private @Nullable Output<Boolean> disableOob;

    /**
     * @return For both SSR and SRX disable management interface
     * 
     */
    public Optional<Output<Boolean>> disableOob() {
        return Optional.ofNullable(this.disableOob);
    }

    @Import(name="probeHosts")
    private @Nullable Output<List<String>> probeHosts;

    public Optional<Output<List<String>>> probeHosts() {
        return Optional.ofNullable(this.probeHosts);
    }

    /**
     * Restrict inbound-traffic to host
     * when enabled, all traffic that is not essential to our operation will be dropped
     * e.g. ntp / dns / traffic to mist will be allowed by default, if dhcpd is enabled, we&#39;ll make sure it works
     * 
     */
    @Import(name="protectRe")
    private @Nullable Output<SettingGatewayMgmtProtectReArgs> protectRe;

    /**
     * @return Restrict inbound-traffic to host
     * when enabled, all traffic that is not essential to our operation will be dropped
     * e.g. ntp / dns / traffic to mist will be allowed by default, if dhcpd is enabled, we&#39;ll make sure it works
     * 
     */
    public Optional<Output<SettingGatewayMgmtProtectReArgs>> protectRe() {
        return Optional.ofNullable(this.protectRe);
    }

    /**
     * For SRX only
     * 
     */
    @Import(name="rootPassword")
    private @Nullable Output<String> rootPassword;

    /**
     * @return For SRX only
     * 
     */
    public Optional<Output<String>> rootPassword() {
        return Optional.ofNullable(this.rootPassword);
    }

    @Import(name="securityLogSourceAddress")
    private @Nullable Output<String> securityLogSourceAddress;

    public Optional<Output<String>> securityLogSourceAddress() {
        return Optional.ofNullable(this.securityLogSourceAddress);
    }

    @Import(name="securityLogSourceInterface")
    private @Nullable Output<String> securityLogSourceInterface;

    public Optional<Output<String>> securityLogSourceInterface() {
        return Optional.ofNullable(this.securityLogSourceInterface);
    }

    private SettingGatewayMgmtArgs() {}

    private SettingGatewayMgmtArgs(SettingGatewayMgmtArgs $) {
        this.adminSshkeys = $.adminSshkeys;
        this.appProbing = $.appProbing;
        this.appUsage = $.appUsage;
        this.autoSignatureUpdate = $.autoSignatureUpdate;
        this.configRevertTimer = $.configRevertTimer;
        this.disableConsole = $.disableConsole;
        this.disableOob = $.disableOob;
        this.probeHosts = $.probeHosts;
        this.protectRe = $.protectRe;
        this.rootPassword = $.rootPassword;
        this.securityLogSourceAddress = $.securityLogSourceAddress;
        this.securityLogSourceInterface = $.securityLogSourceInterface;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingGatewayMgmtArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingGatewayMgmtArgs $;

        public Builder() {
            $ = new SettingGatewayMgmtArgs();
        }

        public Builder(SettingGatewayMgmtArgs defaults) {
            $ = new SettingGatewayMgmtArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminSshkeys For SSR only, as direct root access is not allowed
         * 
         * @return builder
         * 
         */
        public Builder adminSshkeys(@Nullable Output<List<String>> adminSshkeys) {
            $.adminSshkeys = adminSshkeys;
            return this;
        }

        /**
         * @param adminSshkeys For SSR only, as direct root access is not allowed
         * 
         * @return builder
         * 
         */
        public Builder adminSshkeys(List<String> adminSshkeys) {
            return adminSshkeys(Output.of(adminSshkeys));
        }

        /**
         * @param adminSshkeys For SSR only, as direct root access is not allowed
         * 
         * @return builder
         * 
         */
        public Builder adminSshkeys(String... adminSshkeys) {
            return adminSshkeys(List.of(adminSshkeys));
        }

        public Builder appProbing(@Nullable Output<SettingGatewayMgmtAppProbingArgs> appProbing) {
            $.appProbing = appProbing;
            return this;
        }

        public Builder appProbing(SettingGatewayMgmtAppProbingArgs appProbing) {
            return appProbing(Output.of(appProbing));
        }

        /**
         * @param appUsage Consumes uplink bandwidth, requires WA license
         * 
         * @return builder
         * 
         */
        public Builder appUsage(@Nullable Output<Boolean> appUsage) {
            $.appUsage = appUsage;
            return this;
        }

        /**
         * @param appUsage Consumes uplink bandwidth, requires WA license
         * 
         * @return builder
         * 
         */
        public Builder appUsage(Boolean appUsage) {
            return appUsage(Output.of(appUsage));
        }

        public Builder autoSignatureUpdate(@Nullable Output<SettingGatewayMgmtAutoSignatureUpdateArgs> autoSignatureUpdate) {
            $.autoSignatureUpdate = autoSignatureUpdate;
            return this;
        }

        public Builder autoSignatureUpdate(SettingGatewayMgmtAutoSignatureUpdateArgs autoSignatureUpdate) {
            return autoSignatureUpdate(Output.of(autoSignatureUpdate));
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
         * @param disableConsole For both SSR and SRX disable console port
         * 
         * @return builder
         * 
         */
        public Builder disableConsole(@Nullable Output<Boolean> disableConsole) {
            $.disableConsole = disableConsole;
            return this;
        }

        /**
         * @param disableConsole For both SSR and SRX disable console port
         * 
         * @return builder
         * 
         */
        public Builder disableConsole(Boolean disableConsole) {
            return disableConsole(Output.of(disableConsole));
        }

        /**
         * @param disableOob For both SSR and SRX disable management interface
         * 
         * @return builder
         * 
         */
        public Builder disableOob(@Nullable Output<Boolean> disableOob) {
            $.disableOob = disableOob;
            return this;
        }

        /**
         * @param disableOob For both SSR and SRX disable management interface
         * 
         * @return builder
         * 
         */
        public Builder disableOob(Boolean disableOob) {
            return disableOob(Output.of(disableOob));
        }

        public Builder probeHosts(@Nullable Output<List<String>> probeHosts) {
            $.probeHosts = probeHosts;
            return this;
        }

        public Builder probeHosts(List<String> probeHosts) {
            return probeHosts(Output.of(probeHosts));
        }

        public Builder probeHosts(String... probeHosts) {
            return probeHosts(List.of(probeHosts));
        }

        /**
         * @param protectRe Restrict inbound-traffic to host
         * when enabled, all traffic that is not essential to our operation will be dropped
         * e.g. ntp / dns / traffic to mist will be allowed by default, if dhcpd is enabled, we&#39;ll make sure it works
         * 
         * @return builder
         * 
         */
        public Builder protectRe(@Nullable Output<SettingGatewayMgmtProtectReArgs> protectRe) {
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
        public Builder protectRe(SettingGatewayMgmtProtectReArgs protectRe) {
            return protectRe(Output.of(protectRe));
        }

        /**
         * @param rootPassword For SRX only
         * 
         * @return builder
         * 
         */
        public Builder rootPassword(@Nullable Output<String> rootPassword) {
            $.rootPassword = rootPassword;
            return this;
        }

        /**
         * @param rootPassword For SRX only
         * 
         * @return builder
         * 
         */
        public Builder rootPassword(String rootPassword) {
            return rootPassword(Output.of(rootPassword));
        }

        public Builder securityLogSourceAddress(@Nullable Output<String> securityLogSourceAddress) {
            $.securityLogSourceAddress = securityLogSourceAddress;
            return this;
        }

        public Builder securityLogSourceAddress(String securityLogSourceAddress) {
            return securityLogSourceAddress(Output.of(securityLogSourceAddress));
        }

        public Builder securityLogSourceInterface(@Nullable Output<String> securityLogSourceInterface) {
            $.securityLogSourceInterface = securityLogSourceInterface;
            return this;
        }

        public Builder securityLogSourceInterface(String securityLogSourceInterface) {
            return securityLogSourceInterface(Output.of(securityLogSourceInterface));
        }

        public SettingGatewayMgmtArgs build() {
            return $;
        }
    }

}
