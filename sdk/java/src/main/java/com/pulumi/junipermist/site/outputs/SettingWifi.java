// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SettingWifi {
    private @Nullable Boolean ciscoEnabled;
    /**
     * @return Whether to disable 11k
     * 
     */
    private @Nullable Boolean disable11k;
    private @Nullable Boolean disableRadiosWhenPowerConstrained;
    /**
     * @return When proxy_arp is enabled, check for arp spoofing.
     * 
     */
    private @Nullable Boolean enableArpSpoofCheck;
    private @Nullable Boolean enableSharedRadioScanning;
    /**
     * @return Enable Wi-Fi feature (using SUB-MAN license)
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Whether to locate connected clients
     * 
     */
    private @Nullable Boolean locateConnected;
    /**
     * @return Whether to locate unconnected clients
     * 
     */
    private @Nullable Boolean locateUnconnected;
    /**
     * @return Whether to allow Mesh to use DFS channels. For DFS channels, Remote Mesh AP would have to do CAC when scanning for new Base AP, which is slow and will disrupt the connection. If roaming is desired, keep it disabled.
     * 
     */
    private @Nullable Boolean meshAllowDfs;
    /**
     * @return Used to enable/disable CRM
     * 
     */
    private @Nullable Boolean meshEnableCrm;
    /**
     * @return Whether to enable Mesh feature for the site
     * 
     */
    private @Nullable Boolean meshEnabled;
    /**
     * @return Optional passphrase of mesh networking, default is generated randomly
     * 
     */
    private @Nullable String meshPsk;
    /**
     * @return Optional ssid of mesh networking, default is based on site_id
     * 
     */
    private @Nullable String meshSsid;
    /**
     * @return enum: `default`, `disabled`, `enabled`
     * 
     */
    private @Nullable String proxyArp;

    private SettingWifi() {}
    public Optional<Boolean> ciscoEnabled() {
        return Optional.ofNullable(this.ciscoEnabled);
    }
    /**
     * @return Whether to disable 11k
     * 
     */
    public Optional<Boolean> disable11k() {
        return Optional.ofNullable(this.disable11k);
    }
    public Optional<Boolean> disableRadiosWhenPowerConstrained() {
        return Optional.ofNullable(this.disableRadiosWhenPowerConstrained);
    }
    /**
     * @return When proxy_arp is enabled, check for arp spoofing.
     * 
     */
    public Optional<Boolean> enableArpSpoofCheck() {
        return Optional.ofNullable(this.enableArpSpoofCheck);
    }
    public Optional<Boolean> enableSharedRadioScanning() {
        return Optional.ofNullable(this.enableSharedRadioScanning);
    }
    /**
     * @return Enable Wi-Fi feature (using SUB-MAN license)
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Whether to locate connected clients
     * 
     */
    public Optional<Boolean> locateConnected() {
        return Optional.ofNullable(this.locateConnected);
    }
    /**
     * @return Whether to locate unconnected clients
     * 
     */
    public Optional<Boolean> locateUnconnected() {
        return Optional.ofNullable(this.locateUnconnected);
    }
    /**
     * @return Whether to allow Mesh to use DFS channels. For DFS channels, Remote Mesh AP would have to do CAC when scanning for new Base AP, which is slow and will disrupt the connection. If roaming is desired, keep it disabled.
     * 
     */
    public Optional<Boolean> meshAllowDfs() {
        return Optional.ofNullable(this.meshAllowDfs);
    }
    /**
     * @return Used to enable/disable CRM
     * 
     */
    public Optional<Boolean> meshEnableCrm() {
        return Optional.ofNullable(this.meshEnableCrm);
    }
    /**
     * @return Whether to enable Mesh feature for the site
     * 
     */
    public Optional<Boolean> meshEnabled() {
        return Optional.ofNullable(this.meshEnabled);
    }
    /**
     * @return Optional passphrase of mesh networking, default is generated randomly
     * 
     */
    public Optional<String> meshPsk() {
        return Optional.ofNullable(this.meshPsk);
    }
    /**
     * @return Optional ssid of mesh networking, default is based on site_id
     * 
     */
    public Optional<String> meshSsid() {
        return Optional.ofNullable(this.meshSsid);
    }
    /**
     * @return enum: `default`, `disabled`, `enabled`
     * 
     */
    public Optional<String> proxyArp() {
        return Optional.ofNullable(this.proxyArp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingWifi defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean ciscoEnabled;
        private @Nullable Boolean disable11k;
        private @Nullable Boolean disableRadiosWhenPowerConstrained;
        private @Nullable Boolean enableArpSpoofCheck;
        private @Nullable Boolean enableSharedRadioScanning;
        private @Nullable Boolean enabled;
        private @Nullable Boolean locateConnected;
        private @Nullable Boolean locateUnconnected;
        private @Nullable Boolean meshAllowDfs;
        private @Nullable Boolean meshEnableCrm;
        private @Nullable Boolean meshEnabled;
        private @Nullable String meshPsk;
        private @Nullable String meshSsid;
        private @Nullable String proxyArp;
        public Builder() {}
        public Builder(SettingWifi defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ciscoEnabled = defaults.ciscoEnabled;
    	      this.disable11k = defaults.disable11k;
    	      this.disableRadiosWhenPowerConstrained = defaults.disableRadiosWhenPowerConstrained;
    	      this.enableArpSpoofCheck = defaults.enableArpSpoofCheck;
    	      this.enableSharedRadioScanning = defaults.enableSharedRadioScanning;
    	      this.enabled = defaults.enabled;
    	      this.locateConnected = defaults.locateConnected;
    	      this.locateUnconnected = defaults.locateUnconnected;
    	      this.meshAllowDfs = defaults.meshAllowDfs;
    	      this.meshEnableCrm = defaults.meshEnableCrm;
    	      this.meshEnabled = defaults.meshEnabled;
    	      this.meshPsk = defaults.meshPsk;
    	      this.meshSsid = defaults.meshSsid;
    	      this.proxyArp = defaults.proxyArp;
        }

        @CustomType.Setter
        public Builder ciscoEnabled(@Nullable Boolean ciscoEnabled) {

            this.ciscoEnabled = ciscoEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder disable11k(@Nullable Boolean disable11k) {

            this.disable11k = disable11k;
            return this;
        }
        @CustomType.Setter
        public Builder disableRadiosWhenPowerConstrained(@Nullable Boolean disableRadiosWhenPowerConstrained) {

            this.disableRadiosWhenPowerConstrained = disableRadiosWhenPowerConstrained;
            return this;
        }
        @CustomType.Setter
        public Builder enableArpSpoofCheck(@Nullable Boolean enableArpSpoofCheck) {

            this.enableArpSpoofCheck = enableArpSpoofCheck;
            return this;
        }
        @CustomType.Setter
        public Builder enableSharedRadioScanning(@Nullable Boolean enableSharedRadioScanning) {

            this.enableSharedRadioScanning = enableSharedRadioScanning;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder locateConnected(@Nullable Boolean locateConnected) {

            this.locateConnected = locateConnected;
            return this;
        }
        @CustomType.Setter
        public Builder locateUnconnected(@Nullable Boolean locateUnconnected) {

            this.locateUnconnected = locateUnconnected;
            return this;
        }
        @CustomType.Setter
        public Builder meshAllowDfs(@Nullable Boolean meshAllowDfs) {

            this.meshAllowDfs = meshAllowDfs;
            return this;
        }
        @CustomType.Setter
        public Builder meshEnableCrm(@Nullable Boolean meshEnableCrm) {

            this.meshEnableCrm = meshEnableCrm;
            return this;
        }
        @CustomType.Setter
        public Builder meshEnabled(@Nullable Boolean meshEnabled) {

            this.meshEnabled = meshEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder meshPsk(@Nullable String meshPsk) {

            this.meshPsk = meshPsk;
            return this;
        }
        @CustomType.Setter
        public Builder meshSsid(@Nullable String meshSsid) {

            this.meshSsid = meshSsid;
            return this;
        }
        @CustomType.Setter
        public Builder proxyArp(@Nullable String proxyArp) {

            this.proxyArp = proxyArp;
            return this;
        }
        public SettingWifi build() {
            final var _resultValue = new SettingWifi();
            _resultValue.ciscoEnabled = ciscoEnabled;
            _resultValue.disable11k = disable11k;
            _resultValue.disableRadiosWhenPowerConstrained = disableRadiosWhenPowerConstrained;
            _resultValue.enableArpSpoofCheck = enableArpSpoofCheck;
            _resultValue.enableSharedRadioScanning = enableSharedRadioScanning;
            _resultValue.enabled = enabled;
            _resultValue.locateConnected = locateConnected;
            _resultValue.locateUnconnected = locateUnconnected;
            _resultValue.meshAllowDfs = meshAllowDfs;
            _resultValue.meshEnableCrm = meshEnableCrm;
            _resultValue.meshEnabled = meshEnabled;
            _resultValue.meshPsk = meshPsk;
            _resultValue.meshSsid = meshSsid;
            _resultValue.proxyArp = proxyArp;
            return _resultValue;
        }
    }
}
