// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApBleConfig {
    /**
     * @return Whether Mist beacons is enabled
     * 
     */
    private @Nullable Boolean beaconEnabled;
    /**
     * @return Required if `beacon_rate_mode`==`custom`, 1-10, in number-beacons-per-second
     * 
     */
    private @Nullable Integer beaconRate;
    /**
     * @return enum: `custom`, `default`
     * 
     */
    private @Nullable String beaconRateMode;
    /**
     * @return List of AP BLE location beam numbers (1-8) which should be disabled at the AP and not transmit location information (where beam 1 is oriented at the top the AP, growing counter-clock-wise, with 9 being the omni BLE beam)
     * 
     */
    private @Nullable List<Integer> beamDisableds;
    /**
     * @return Can be enabled if `beacon_enabled`==`true`, whether to send custom packet
     * 
     */
    private @Nullable Boolean customBlePacketEnabled;
    /**
     * @return The custom frame to be sent out in this beacon. The frame must be a hexstring
     * 
     */
    private @Nullable String customBlePacketFrame;
    /**
     * @return Frequency (msec) of data emitted by custom ble beacon
     * 
     */
    private @Nullable Integer customBlePacketFreqMsec;
    /**
     * @return Advertised TX Power, -100 to 20 (dBm), omit this attribute to use default
     * 
     */
    private @Nullable Integer eddystoneUidAdvPower;
    private @Nullable String eddystoneUidBeams;
    /**
     * @return Only if `beacon_enabled`==`false`, Whether Eddystone-UID beacon is enabled
     * 
     */
    private @Nullable Boolean eddystoneUidEnabled;
    /**
     * @return Frequency (msec) of data emmit by Eddystone-UID beacon
     * 
     */
    private @Nullable Integer eddystoneUidFreqMsec;
    /**
     * @return Eddystone-UID instance for the device
     * 
     */
    private @Nullable String eddystoneUidInstance;
    /**
     * @return Eddystone-UID namespace
     * 
     */
    private @Nullable String eddystoneUidNamespace;
    /**
     * @return Advertised TX Power, -100 to 20 (dBm), omit this attribute to use default
     * 
     */
    private @Nullable Integer eddystoneUrlAdvPower;
    private @Nullable String eddystoneUrlBeams;
    /**
     * @return Only if `beacon_enabled`==`false`, Whether Eddystone-URL beacon is enabled
     * 
     */
    private @Nullable Boolean eddystoneUrlEnabled;
    /**
     * @return Frequency (msec) of data emit by Eddystone-UID beacon
     * 
     */
    private @Nullable Integer eddystoneUrlFreqMsec;
    /**
     * @return URL pointed by Eddystone-URL beacon
     * 
     */
    private @Nullable String eddystoneUrlUrl;
    /**
     * @return Advertised TX Power, -100 to 20 (dBm), omit this attribute to use default
     * 
     */
    private @Nullable Integer ibeaconAdvPower;
    private @Nullable String ibeaconBeams;
    /**
     * @return Can be enabled if `beacon_enabled`==`true`, whether to send iBeacon
     * 
     */
    private @Nullable Boolean ibeaconEnabled;
    /**
     * @return Frequency (msec) of data emmit for iBeacon
     * 
     */
    private @Nullable Integer ibeaconFreqMsec;
    /**
     * @return Major number for iBeacon
     * 
     */
    private @Nullable Integer ibeaconMajor;
    /**
     * @return Minor number for iBeacon
     * 
     */
    private @Nullable Integer ibeaconMinor;
    /**
     * @return Optional, if not specified, the same UUID as the beacon will be used
     * 
     */
    private @Nullable String ibeaconUuid;
    /**
     * @return Required if `power_mode`==`custom`; else use `power_mode` as default
     * 
     */
    private @Nullable Integer power;
    /**
     * @return enum: `custom`, `default`
     * 
     */
    private @Nullable String powerMode;

    private ApBleConfig() {}
    /**
     * @return Whether Mist beacons is enabled
     * 
     */
    public Optional<Boolean> beaconEnabled() {
        return Optional.ofNullable(this.beaconEnabled);
    }
    /**
     * @return Required if `beacon_rate_mode`==`custom`, 1-10, in number-beacons-per-second
     * 
     */
    public Optional<Integer> beaconRate() {
        return Optional.ofNullable(this.beaconRate);
    }
    /**
     * @return enum: `custom`, `default`
     * 
     */
    public Optional<String> beaconRateMode() {
        return Optional.ofNullable(this.beaconRateMode);
    }
    /**
     * @return List of AP BLE location beam numbers (1-8) which should be disabled at the AP and not transmit location information (where beam 1 is oriented at the top the AP, growing counter-clock-wise, with 9 being the omni BLE beam)
     * 
     */
    public List<Integer> beamDisableds() {
        return this.beamDisableds == null ? List.of() : this.beamDisableds;
    }
    /**
     * @return Can be enabled if `beacon_enabled`==`true`, whether to send custom packet
     * 
     */
    public Optional<Boolean> customBlePacketEnabled() {
        return Optional.ofNullable(this.customBlePacketEnabled);
    }
    /**
     * @return The custom frame to be sent out in this beacon. The frame must be a hexstring
     * 
     */
    public Optional<String> customBlePacketFrame() {
        return Optional.ofNullable(this.customBlePacketFrame);
    }
    /**
     * @return Frequency (msec) of data emitted by custom ble beacon
     * 
     */
    public Optional<Integer> customBlePacketFreqMsec() {
        return Optional.ofNullable(this.customBlePacketFreqMsec);
    }
    /**
     * @return Advertised TX Power, -100 to 20 (dBm), omit this attribute to use default
     * 
     */
    public Optional<Integer> eddystoneUidAdvPower() {
        return Optional.ofNullable(this.eddystoneUidAdvPower);
    }
    public Optional<String> eddystoneUidBeams() {
        return Optional.ofNullable(this.eddystoneUidBeams);
    }
    /**
     * @return Only if `beacon_enabled`==`false`, Whether Eddystone-UID beacon is enabled
     * 
     */
    public Optional<Boolean> eddystoneUidEnabled() {
        return Optional.ofNullable(this.eddystoneUidEnabled);
    }
    /**
     * @return Frequency (msec) of data emmit by Eddystone-UID beacon
     * 
     */
    public Optional<Integer> eddystoneUidFreqMsec() {
        return Optional.ofNullable(this.eddystoneUidFreqMsec);
    }
    /**
     * @return Eddystone-UID instance for the device
     * 
     */
    public Optional<String> eddystoneUidInstance() {
        return Optional.ofNullable(this.eddystoneUidInstance);
    }
    /**
     * @return Eddystone-UID namespace
     * 
     */
    public Optional<String> eddystoneUidNamespace() {
        return Optional.ofNullable(this.eddystoneUidNamespace);
    }
    /**
     * @return Advertised TX Power, -100 to 20 (dBm), omit this attribute to use default
     * 
     */
    public Optional<Integer> eddystoneUrlAdvPower() {
        return Optional.ofNullable(this.eddystoneUrlAdvPower);
    }
    public Optional<String> eddystoneUrlBeams() {
        return Optional.ofNullable(this.eddystoneUrlBeams);
    }
    /**
     * @return Only if `beacon_enabled`==`false`, Whether Eddystone-URL beacon is enabled
     * 
     */
    public Optional<Boolean> eddystoneUrlEnabled() {
        return Optional.ofNullable(this.eddystoneUrlEnabled);
    }
    /**
     * @return Frequency (msec) of data emit by Eddystone-UID beacon
     * 
     */
    public Optional<Integer> eddystoneUrlFreqMsec() {
        return Optional.ofNullable(this.eddystoneUrlFreqMsec);
    }
    /**
     * @return URL pointed by Eddystone-URL beacon
     * 
     */
    public Optional<String> eddystoneUrlUrl() {
        return Optional.ofNullable(this.eddystoneUrlUrl);
    }
    /**
     * @return Advertised TX Power, -100 to 20 (dBm), omit this attribute to use default
     * 
     */
    public Optional<Integer> ibeaconAdvPower() {
        return Optional.ofNullable(this.ibeaconAdvPower);
    }
    public Optional<String> ibeaconBeams() {
        return Optional.ofNullable(this.ibeaconBeams);
    }
    /**
     * @return Can be enabled if `beacon_enabled`==`true`, whether to send iBeacon
     * 
     */
    public Optional<Boolean> ibeaconEnabled() {
        return Optional.ofNullable(this.ibeaconEnabled);
    }
    /**
     * @return Frequency (msec) of data emmit for iBeacon
     * 
     */
    public Optional<Integer> ibeaconFreqMsec() {
        return Optional.ofNullable(this.ibeaconFreqMsec);
    }
    /**
     * @return Major number for iBeacon
     * 
     */
    public Optional<Integer> ibeaconMajor() {
        return Optional.ofNullable(this.ibeaconMajor);
    }
    /**
     * @return Minor number for iBeacon
     * 
     */
    public Optional<Integer> ibeaconMinor() {
        return Optional.ofNullable(this.ibeaconMinor);
    }
    /**
     * @return Optional, if not specified, the same UUID as the beacon will be used
     * 
     */
    public Optional<String> ibeaconUuid() {
        return Optional.ofNullable(this.ibeaconUuid);
    }
    /**
     * @return Required if `power_mode`==`custom`; else use `power_mode` as default
     * 
     */
    public Optional<Integer> power() {
        return Optional.ofNullable(this.power);
    }
    /**
     * @return enum: `custom`, `default`
     * 
     */
    public Optional<String> powerMode() {
        return Optional.ofNullable(this.powerMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApBleConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean beaconEnabled;
        private @Nullable Integer beaconRate;
        private @Nullable String beaconRateMode;
        private @Nullable List<Integer> beamDisableds;
        private @Nullable Boolean customBlePacketEnabled;
        private @Nullable String customBlePacketFrame;
        private @Nullable Integer customBlePacketFreqMsec;
        private @Nullable Integer eddystoneUidAdvPower;
        private @Nullable String eddystoneUidBeams;
        private @Nullable Boolean eddystoneUidEnabled;
        private @Nullable Integer eddystoneUidFreqMsec;
        private @Nullable String eddystoneUidInstance;
        private @Nullable String eddystoneUidNamespace;
        private @Nullable Integer eddystoneUrlAdvPower;
        private @Nullable String eddystoneUrlBeams;
        private @Nullable Boolean eddystoneUrlEnabled;
        private @Nullable Integer eddystoneUrlFreqMsec;
        private @Nullable String eddystoneUrlUrl;
        private @Nullable Integer ibeaconAdvPower;
        private @Nullable String ibeaconBeams;
        private @Nullable Boolean ibeaconEnabled;
        private @Nullable Integer ibeaconFreqMsec;
        private @Nullable Integer ibeaconMajor;
        private @Nullable Integer ibeaconMinor;
        private @Nullable String ibeaconUuid;
        private @Nullable Integer power;
        private @Nullable String powerMode;
        public Builder() {}
        public Builder(ApBleConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.beaconEnabled = defaults.beaconEnabled;
    	      this.beaconRate = defaults.beaconRate;
    	      this.beaconRateMode = defaults.beaconRateMode;
    	      this.beamDisableds = defaults.beamDisableds;
    	      this.customBlePacketEnabled = defaults.customBlePacketEnabled;
    	      this.customBlePacketFrame = defaults.customBlePacketFrame;
    	      this.customBlePacketFreqMsec = defaults.customBlePacketFreqMsec;
    	      this.eddystoneUidAdvPower = defaults.eddystoneUidAdvPower;
    	      this.eddystoneUidBeams = defaults.eddystoneUidBeams;
    	      this.eddystoneUidEnabled = defaults.eddystoneUidEnabled;
    	      this.eddystoneUidFreqMsec = defaults.eddystoneUidFreqMsec;
    	      this.eddystoneUidInstance = defaults.eddystoneUidInstance;
    	      this.eddystoneUidNamespace = defaults.eddystoneUidNamespace;
    	      this.eddystoneUrlAdvPower = defaults.eddystoneUrlAdvPower;
    	      this.eddystoneUrlBeams = defaults.eddystoneUrlBeams;
    	      this.eddystoneUrlEnabled = defaults.eddystoneUrlEnabled;
    	      this.eddystoneUrlFreqMsec = defaults.eddystoneUrlFreqMsec;
    	      this.eddystoneUrlUrl = defaults.eddystoneUrlUrl;
    	      this.ibeaconAdvPower = defaults.ibeaconAdvPower;
    	      this.ibeaconBeams = defaults.ibeaconBeams;
    	      this.ibeaconEnabled = defaults.ibeaconEnabled;
    	      this.ibeaconFreqMsec = defaults.ibeaconFreqMsec;
    	      this.ibeaconMajor = defaults.ibeaconMajor;
    	      this.ibeaconMinor = defaults.ibeaconMinor;
    	      this.ibeaconUuid = defaults.ibeaconUuid;
    	      this.power = defaults.power;
    	      this.powerMode = defaults.powerMode;
        }

        @CustomType.Setter
        public Builder beaconEnabled(@Nullable Boolean beaconEnabled) {

            this.beaconEnabled = beaconEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder beaconRate(@Nullable Integer beaconRate) {

            this.beaconRate = beaconRate;
            return this;
        }
        @CustomType.Setter
        public Builder beaconRateMode(@Nullable String beaconRateMode) {

            this.beaconRateMode = beaconRateMode;
            return this;
        }
        @CustomType.Setter
        public Builder beamDisableds(@Nullable List<Integer> beamDisableds) {

            this.beamDisableds = beamDisableds;
            return this;
        }
        public Builder beamDisableds(Integer... beamDisableds) {
            return beamDisableds(List.of(beamDisableds));
        }
        @CustomType.Setter
        public Builder customBlePacketEnabled(@Nullable Boolean customBlePacketEnabled) {

            this.customBlePacketEnabled = customBlePacketEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder customBlePacketFrame(@Nullable String customBlePacketFrame) {

            this.customBlePacketFrame = customBlePacketFrame;
            return this;
        }
        @CustomType.Setter
        public Builder customBlePacketFreqMsec(@Nullable Integer customBlePacketFreqMsec) {

            this.customBlePacketFreqMsec = customBlePacketFreqMsec;
            return this;
        }
        @CustomType.Setter
        public Builder eddystoneUidAdvPower(@Nullable Integer eddystoneUidAdvPower) {

            this.eddystoneUidAdvPower = eddystoneUidAdvPower;
            return this;
        }
        @CustomType.Setter
        public Builder eddystoneUidBeams(@Nullable String eddystoneUidBeams) {

            this.eddystoneUidBeams = eddystoneUidBeams;
            return this;
        }
        @CustomType.Setter
        public Builder eddystoneUidEnabled(@Nullable Boolean eddystoneUidEnabled) {

            this.eddystoneUidEnabled = eddystoneUidEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder eddystoneUidFreqMsec(@Nullable Integer eddystoneUidFreqMsec) {

            this.eddystoneUidFreqMsec = eddystoneUidFreqMsec;
            return this;
        }
        @CustomType.Setter
        public Builder eddystoneUidInstance(@Nullable String eddystoneUidInstance) {

            this.eddystoneUidInstance = eddystoneUidInstance;
            return this;
        }
        @CustomType.Setter
        public Builder eddystoneUidNamespace(@Nullable String eddystoneUidNamespace) {

            this.eddystoneUidNamespace = eddystoneUidNamespace;
            return this;
        }
        @CustomType.Setter
        public Builder eddystoneUrlAdvPower(@Nullable Integer eddystoneUrlAdvPower) {

            this.eddystoneUrlAdvPower = eddystoneUrlAdvPower;
            return this;
        }
        @CustomType.Setter
        public Builder eddystoneUrlBeams(@Nullable String eddystoneUrlBeams) {

            this.eddystoneUrlBeams = eddystoneUrlBeams;
            return this;
        }
        @CustomType.Setter
        public Builder eddystoneUrlEnabled(@Nullable Boolean eddystoneUrlEnabled) {

            this.eddystoneUrlEnabled = eddystoneUrlEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder eddystoneUrlFreqMsec(@Nullable Integer eddystoneUrlFreqMsec) {

            this.eddystoneUrlFreqMsec = eddystoneUrlFreqMsec;
            return this;
        }
        @CustomType.Setter
        public Builder eddystoneUrlUrl(@Nullable String eddystoneUrlUrl) {

            this.eddystoneUrlUrl = eddystoneUrlUrl;
            return this;
        }
        @CustomType.Setter
        public Builder ibeaconAdvPower(@Nullable Integer ibeaconAdvPower) {

            this.ibeaconAdvPower = ibeaconAdvPower;
            return this;
        }
        @CustomType.Setter
        public Builder ibeaconBeams(@Nullable String ibeaconBeams) {

            this.ibeaconBeams = ibeaconBeams;
            return this;
        }
        @CustomType.Setter
        public Builder ibeaconEnabled(@Nullable Boolean ibeaconEnabled) {

            this.ibeaconEnabled = ibeaconEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder ibeaconFreqMsec(@Nullable Integer ibeaconFreqMsec) {

            this.ibeaconFreqMsec = ibeaconFreqMsec;
            return this;
        }
        @CustomType.Setter
        public Builder ibeaconMajor(@Nullable Integer ibeaconMajor) {

            this.ibeaconMajor = ibeaconMajor;
            return this;
        }
        @CustomType.Setter
        public Builder ibeaconMinor(@Nullable Integer ibeaconMinor) {

            this.ibeaconMinor = ibeaconMinor;
            return this;
        }
        @CustomType.Setter
        public Builder ibeaconUuid(@Nullable String ibeaconUuid) {

            this.ibeaconUuid = ibeaconUuid;
            return this;
        }
        @CustomType.Setter
        public Builder power(@Nullable Integer power) {

            this.power = power;
            return this;
        }
        @CustomType.Setter
        public Builder powerMode(@Nullable String powerMode) {

            this.powerMode = powerMode;
            return this;
        }
        public ApBleConfig build() {
            final var _resultValue = new ApBleConfig();
            _resultValue.beaconEnabled = beaconEnabled;
            _resultValue.beaconRate = beaconRate;
            _resultValue.beaconRateMode = beaconRateMode;
            _resultValue.beamDisableds = beamDisableds;
            _resultValue.customBlePacketEnabled = customBlePacketEnabled;
            _resultValue.customBlePacketFrame = customBlePacketFrame;
            _resultValue.customBlePacketFreqMsec = customBlePacketFreqMsec;
            _resultValue.eddystoneUidAdvPower = eddystoneUidAdvPower;
            _resultValue.eddystoneUidBeams = eddystoneUidBeams;
            _resultValue.eddystoneUidEnabled = eddystoneUidEnabled;
            _resultValue.eddystoneUidFreqMsec = eddystoneUidFreqMsec;
            _resultValue.eddystoneUidInstance = eddystoneUidInstance;
            _resultValue.eddystoneUidNamespace = eddystoneUidNamespace;
            _resultValue.eddystoneUrlAdvPower = eddystoneUrlAdvPower;
            _resultValue.eddystoneUrlBeams = eddystoneUrlBeams;
            _resultValue.eddystoneUrlEnabled = eddystoneUrlEnabled;
            _resultValue.eddystoneUrlFreqMsec = eddystoneUrlFreqMsec;
            _resultValue.eddystoneUrlUrl = eddystoneUrlUrl;
            _resultValue.ibeaconAdvPower = ibeaconAdvPower;
            _resultValue.ibeaconBeams = ibeaconBeams;
            _resultValue.ibeaconEnabled = ibeaconEnabled;
            _resultValue.ibeaconFreqMsec = ibeaconFreqMsec;
            _resultValue.ibeaconMajor = ibeaconMajor;
            _resultValue.ibeaconMinor = ibeaconMinor;
            _resultValue.ibeaconUuid = ibeaconUuid;
            _resultValue.power = power;
            _resultValue.powerMode = powerMode;
            return _resultValue;
        }
    }
}
