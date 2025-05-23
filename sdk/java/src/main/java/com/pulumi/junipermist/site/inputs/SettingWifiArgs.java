// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingWifiArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingWifiArgs Empty = new SettingWifiArgs();

    @Import(name="ciscoEnabled")
    private @Nullable Output<Boolean> ciscoEnabled;

    public Optional<Output<Boolean>> ciscoEnabled() {
        return Optional.ofNullable(this.ciscoEnabled);
    }

    /**
     * Whether to disable 11k
     * 
     */
    @Import(name="disable11k")
    private @Nullable Output<Boolean> disable11k;

    /**
     * @return Whether to disable 11k
     * 
     */
    public Optional<Output<Boolean>> disable11k() {
        return Optional.ofNullable(this.disable11k);
    }

    @Import(name="disableRadiosWhenPowerConstrained")
    private @Nullable Output<Boolean> disableRadiosWhenPowerConstrained;

    public Optional<Output<Boolean>> disableRadiosWhenPowerConstrained() {
        return Optional.ofNullable(this.disableRadiosWhenPowerConstrained);
    }

    /**
     * When proxy_arp is enabled, check for arp spoofing.
     * 
     */
    @Import(name="enableArpSpoofCheck")
    private @Nullable Output<Boolean> enableArpSpoofCheck;

    /**
     * @return When proxy_arp is enabled, check for arp spoofing.
     * 
     */
    public Optional<Output<Boolean>> enableArpSpoofCheck() {
        return Optional.ofNullable(this.enableArpSpoofCheck);
    }

    @Import(name="enableSharedRadioScanning")
    private @Nullable Output<Boolean> enableSharedRadioScanning;

    public Optional<Output<Boolean>> enableSharedRadioScanning() {
        return Optional.ofNullable(this.enableSharedRadioScanning);
    }

    /**
     * Enable Wi-Fi feature (using SUB-MAN license)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable Wi-Fi feature (using SUB-MAN license)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Whether to locate connected clients
     * 
     */
    @Import(name="locateConnected")
    private @Nullable Output<Boolean> locateConnected;

    /**
     * @return Whether to locate connected clients
     * 
     */
    public Optional<Output<Boolean>> locateConnected() {
        return Optional.ofNullable(this.locateConnected);
    }

    /**
     * Whether to locate unconnected clients
     * 
     */
    @Import(name="locateUnconnected")
    private @Nullable Output<Boolean> locateUnconnected;

    /**
     * @return Whether to locate unconnected clients
     * 
     */
    public Optional<Output<Boolean>> locateUnconnected() {
        return Optional.ofNullable(this.locateUnconnected);
    }

    /**
     * Whether to allow Mesh to use DFS channels. For DFS channels, Remote Mesh AP would have to do CAC when scanning for new Base AP, which is slow and will disrupt the connection. If roaming is desired, keep it disabled.
     * 
     */
    @Import(name="meshAllowDfs")
    private @Nullable Output<Boolean> meshAllowDfs;

    /**
     * @return Whether to allow Mesh to use DFS channels. For DFS channels, Remote Mesh AP would have to do CAC when scanning for new Base AP, which is slow and will disrupt the connection. If roaming is desired, keep it disabled.
     * 
     */
    public Optional<Output<Boolean>> meshAllowDfs() {
        return Optional.ofNullable(this.meshAllowDfs);
    }

    /**
     * Used to enable/disable CRM
     * 
     */
    @Import(name="meshEnableCrm")
    private @Nullable Output<Boolean> meshEnableCrm;

    /**
     * @return Used to enable/disable CRM
     * 
     */
    public Optional<Output<Boolean>> meshEnableCrm() {
        return Optional.ofNullable(this.meshEnableCrm);
    }

    /**
     * Whether to enable Mesh feature for the site
     * 
     */
    @Import(name="meshEnabled")
    private @Nullable Output<Boolean> meshEnabled;

    /**
     * @return Whether to enable Mesh feature for the site
     * 
     */
    public Optional<Output<Boolean>> meshEnabled() {
        return Optional.ofNullable(this.meshEnabled);
    }

    /**
     * Optional passphrase of mesh networking, default is generated randomly
     * 
     */
    @Import(name="meshPsk")
    private @Nullable Output<String> meshPsk;

    /**
     * @return Optional passphrase of mesh networking, default is generated randomly
     * 
     */
    public Optional<Output<String>> meshPsk() {
        return Optional.ofNullable(this.meshPsk);
    }

    /**
     * Optional ssid of mesh networking, default is based on site_id
     * 
     */
    @Import(name="meshSsid")
    private @Nullable Output<String> meshSsid;

    /**
     * @return Optional ssid of mesh networking, default is based on site_id
     * 
     */
    public Optional<Output<String>> meshSsid() {
        return Optional.ofNullable(this.meshSsid);
    }

    /**
     * enum: `default`, `disabled`, `enabled`
     * 
     */
    @Import(name="proxyArp")
    private @Nullable Output<String> proxyArp;

    /**
     * @return enum: `default`, `disabled`, `enabled`
     * 
     */
    public Optional<Output<String>> proxyArp() {
        return Optional.ofNullable(this.proxyArp);
    }

    private SettingWifiArgs() {}

    private SettingWifiArgs(SettingWifiArgs $) {
        this.ciscoEnabled = $.ciscoEnabled;
        this.disable11k = $.disable11k;
        this.disableRadiosWhenPowerConstrained = $.disableRadiosWhenPowerConstrained;
        this.enableArpSpoofCheck = $.enableArpSpoofCheck;
        this.enableSharedRadioScanning = $.enableSharedRadioScanning;
        this.enabled = $.enabled;
        this.locateConnected = $.locateConnected;
        this.locateUnconnected = $.locateUnconnected;
        this.meshAllowDfs = $.meshAllowDfs;
        this.meshEnableCrm = $.meshEnableCrm;
        this.meshEnabled = $.meshEnabled;
        this.meshPsk = $.meshPsk;
        this.meshSsid = $.meshSsid;
        this.proxyArp = $.proxyArp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingWifiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingWifiArgs $;

        public Builder() {
            $ = new SettingWifiArgs();
        }

        public Builder(SettingWifiArgs defaults) {
            $ = new SettingWifiArgs(Objects.requireNonNull(defaults));
        }

        public Builder ciscoEnabled(@Nullable Output<Boolean> ciscoEnabled) {
            $.ciscoEnabled = ciscoEnabled;
            return this;
        }

        public Builder ciscoEnabled(Boolean ciscoEnabled) {
            return ciscoEnabled(Output.of(ciscoEnabled));
        }

        /**
         * @param disable11k Whether to disable 11k
         * 
         * @return builder
         * 
         */
        public Builder disable11k(@Nullable Output<Boolean> disable11k) {
            $.disable11k = disable11k;
            return this;
        }

        /**
         * @param disable11k Whether to disable 11k
         * 
         * @return builder
         * 
         */
        public Builder disable11k(Boolean disable11k) {
            return disable11k(Output.of(disable11k));
        }

        public Builder disableRadiosWhenPowerConstrained(@Nullable Output<Boolean> disableRadiosWhenPowerConstrained) {
            $.disableRadiosWhenPowerConstrained = disableRadiosWhenPowerConstrained;
            return this;
        }

        public Builder disableRadiosWhenPowerConstrained(Boolean disableRadiosWhenPowerConstrained) {
            return disableRadiosWhenPowerConstrained(Output.of(disableRadiosWhenPowerConstrained));
        }

        /**
         * @param enableArpSpoofCheck When proxy_arp is enabled, check for arp spoofing.
         * 
         * @return builder
         * 
         */
        public Builder enableArpSpoofCheck(@Nullable Output<Boolean> enableArpSpoofCheck) {
            $.enableArpSpoofCheck = enableArpSpoofCheck;
            return this;
        }

        /**
         * @param enableArpSpoofCheck When proxy_arp is enabled, check for arp spoofing.
         * 
         * @return builder
         * 
         */
        public Builder enableArpSpoofCheck(Boolean enableArpSpoofCheck) {
            return enableArpSpoofCheck(Output.of(enableArpSpoofCheck));
        }

        public Builder enableSharedRadioScanning(@Nullable Output<Boolean> enableSharedRadioScanning) {
            $.enableSharedRadioScanning = enableSharedRadioScanning;
            return this;
        }

        public Builder enableSharedRadioScanning(Boolean enableSharedRadioScanning) {
            return enableSharedRadioScanning(Output.of(enableSharedRadioScanning));
        }

        /**
         * @param enabled Enable Wi-Fi feature (using SUB-MAN license)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable Wi-Fi feature (using SUB-MAN license)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param locateConnected Whether to locate connected clients
         * 
         * @return builder
         * 
         */
        public Builder locateConnected(@Nullable Output<Boolean> locateConnected) {
            $.locateConnected = locateConnected;
            return this;
        }

        /**
         * @param locateConnected Whether to locate connected clients
         * 
         * @return builder
         * 
         */
        public Builder locateConnected(Boolean locateConnected) {
            return locateConnected(Output.of(locateConnected));
        }

        /**
         * @param locateUnconnected Whether to locate unconnected clients
         * 
         * @return builder
         * 
         */
        public Builder locateUnconnected(@Nullable Output<Boolean> locateUnconnected) {
            $.locateUnconnected = locateUnconnected;
            return this;
        }

        /**
         * @param locateUnconnected Whether to locate unconnected clients
         * 
         * @return builder
         * 
         */
        public Builder locateUnconnected(Boolean locateUnconnected) {
            return locateUnconnected(Output.of(locateUnconnected));
        }

        /**
         * @param meshAllowDfs Whether to allow Mesh to use DFS channels. For DFS channels, Remote Mesh AP would have to do CAC when scanning for new Base AP, which is slow and will disrupt the connection. If roaming is desired, keep it disabled.
         * 
         * @return builder
         * 
         */
        public Builder meshAllowDfs(@Nullable Output<Boolean> meshAllowDfs) {
            $.meshAllowDfs = meshAllowDfs;
            return this;
        }

        /**
         * @param meshAllowDfs Whether to allow Mesh to use DFS channels. For DFS channels, Remote Mesh AP would have to do CAC when scanning for new Base AP, which is slow and will disrupt the connection. If roaming is desired, keep it disabled.
         * 
         * @return builder
         * 
         */
        public Builder meshAllowDfs(Boolean meshAllowDfs) {
            return meshAllowDfs(Output.of(meshAllowDfs));
        }

        /**
         * @param meshEnableCrm Used to enable/disable CRM
         * 
         * @return builder
         * 
         */
        public Builder meshEnableCrm(@Nullable Output<Boolean> meshEnableCrm) {
            $.meshEnableCrm = meshEnableCrm;
            return this;
        }

        /**
         * @param meshEnableCrm Used to enable/disable CRM
         * 
         * @return builder
         * 
         */
        public Builder meshEnableCrm(Boolean meshEnableCrm) {
            return meshEnableCrm(Output.of(meshEnableCrm));
        }

        /**
         * @param meshEnabled Whether to enable Mesh feature for the site
         * 
         * @return builder
         * 
         */
        public Builder meshEnabled(@Nullable Output<Boolean> meshEnabled) {
            $.meshEnabled = meshEnabled;
            return this;
        }

        /**
         * @param meshEnabled Whether to enable Mesh feature for the site
         * 
         * @return builder
         * 
         */
        public Builder meshEnabled(Boolean meshEnabled) {
            return meshEnabled(Output.of(meshEnabled));
        }

        /**
         * @param meshPsk Optional passphrase of mesh networking, default is generated randomly
         * 
         * @return builder
         * 
         */
        public Builder meshPsk(@Nullable Output<String> meshPsk) {
            $.meshPsk = meshPsk;
            return this;
        }

        /**
         * @param meshPsk Optional passphrase of mesh networking, default is generated randomly
         * 
         * @return builder
         * 
         */
        public Builder meshPsk(String meshPsk) {
            return meshPsk(Output.of(meshPsk));
        }

        /**
         * @param meshSsid Optional ssid of mesh networking, default is based on site_id
         * 
         * @return builder
         * 
         */
        public Builder meshSsid(@Nullable Output<String> meshSsid) {
            $.meshSsid = meshSsid;
            return this;
        }

        /**
         * @param meshSsid Optional ssid of mesh networking, default is based on site_id
         * 
         * @return builder
         * 
         */
        public Builder meshSsid(String meshSsid) {
            return meshSsid(Output.of(meshSsid));
        }

        /**
         * @param proxyArp enum: `default`, `disabled`, `enabled`
         * 
         * @return builder
         * 
         */
        public Builder proxyArp(@Nullable Output<String> proxyArp) {
            $.proxyArp = proxyArp;
            return this;
        }

        /**
         * @param proxyArp enum: `default`, `disabled`, `enabled`
         * 
         * @return builder
         * 
         */
        public Builder proxyArp(String proxyArp) {
            return proxyArp(Output.of(proxyArp));
        }

        public SettingWifiArgs build() {
            return $;
        }
    }

}
