// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileApBleConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileApBleConfigArgs Empty = new DeviceprofileApBleConfigArgs();

    /**
     * Whether Mist beacons is enabled
     * 
     */
    @Import(name="beaconEnabled")
    private @Nullable Output<Boolean> beaconEnabled;

    /**
     * @return Whether Mist beacons is enabled
     * 
     */
    public Optional<Output<Boolean>> beaconEnabled() {
        return Optional.ofNullable(this.beaconEnabled);
    }

    /**
     * Required if `beacon_rate_mode`==`custom`, 1-10, in number-beacons-per-second
     * 
     */
    @Import(name="beaconRate")
    private @Nullable Output<Integer> beaconRate;

    /**
     * @return Required if `beacon_rate_mode`==`custom`, 1-10, in number-beacons-per-second
     * 
     */
    public Optional<Output<Integer>> beaconRate() {
        return Optional.ofNullable(this.beaconRate);
    }

    /**
     * enum: `custom`, `default`
     * 
     */
    @Import(name="beaconRateMode")
    private @Nullable Output<String> beaconRateMode;

    /**
     * @return enum: `custom`, `default`
     * 
     */
    public Optional<Output<String>> beaconRateMode() {
        return Optional.ofNullable(this.beaconRateMode);
    }

    /**
     * List of AP BLE location beam numbers (1-8) which should be disabled at the AP and not transmit location information (where beam 1 is oriented at the top the AP, growing counter-clock-wise, with 9 being the omni BLE beam)
     * 
     */
    @Import(name="beamDisableds")
    private @Nullable Output<List<Integer>> beamDisableds;

    /**
     * @return List of AP BLE location beam numbers (1-8) which should be disabled at the AP and not transmit location information (where beam 1 is oriented at the top the AP, growing counter-clock-wise, with 9 being the omni BLE beam)
     * 
     */
    public Optional<Output<List<Integer>>> beamDisableds() {
        return Optional.ofNullable(this.beamDisableds);
    }

    /**
     * Can be enabled if `beacon_enabled`==`true`, whether to send custom packet
     * 
     */
    @Import(name="customBlePacketEnabled")
    private @Nullable Output<Boolean> customBlePacketEnabled;

    /**
     * @return Can be enabled if `beacon_enabled`==`true`, whether to send custom packet
     * 
     */
    public Optional<Output<Boolean>> customBlePacketEnabled() {
        return Optional.ofNullable(this.customBlePacketEnabled);
    }

    /**
     * The custom frame to be sent out in this beacon. The frame must be a hexstring
     * 
     */
    @Import(name="customBlePacketFrame")
    private @Nullable Output<String> customBlePacketFrame;

    /**
     * @return The custom frame to be sent out in this beacon. The frame must be a hexstring
     * 
     */
    public Optional<Output<String>> customBlePacketFrame() {
        return Optional.ofNullable(this.customBlePacketFrame);
    }

    /**
     * Frequency (msec) of data emitted by custom ble beacon
     * 
     */
    @Import(name="customBlePacketFreqMsec")
    private @Nullable Output<Integer> customBlePacketFreqMsec;

    /**
     * @return Frequency (msec) of data emitted by custom ble beacon
     * 
     */
    public Optional<Output<Integer>> customBlePacketFreqMsec() {
        return Optional.ofNullable(this.customBlePacketFreqMsec);
    }

    /**
     * Advertised TX Power, -100 to 20 (dBm), omit this attribute to use default
     * 
     */
    @Import(name="eddystoneUidAdvPower")
    private @Nullable Output<Integer> eddystoneUidAdvPower;

    /**
     * @return Advertised TX Power, -100 to 20 (dBm), omit this attribute to use default
     * 
     */
    public Optional<Output<Integer>> eddystoneUidAdvPower() {
        return Optional.ofNullable(this.eddystoneUidAdvPower);
    }

    @Import(name="eddystoneUidBeams")
    private @Nullable Output<String> eddystoneUidBeams;

    public Optional<Output<String>> eddystoneUidBeams() {
        return Optional.ofNullable(this.eddystoneUidBeams);
    }

    /**
     * Only if `beacon_enabled`==`false`, Whether Eddystone-UID beacon is enabled
     * 
     */
    @Import(name="eddystoneUidEnabled")
    private @Nullable Output<Boolean> eddystoneUidEnabled;

    /**
     * @return Only if `beacon_enabled`==`false`, Whether Eddystone-UID beacon is enabled
     * 
     */
    public Optional<Output<Boolean>> eddystoneUidEnabled() {
        return Optional.ofNullable(this.eddystoneUidEnabled);
    }

    /**
     * Frequency (msec) of data emit by Eddystone-UID beacon
     * 
     */
    @Import(name="eddystoneUidFreqMsec")
    private @Nullable Output<Integer> eddystoneUidFreqMsec;

    /**
     * @return Frequency (msec) of data emit by Eddystone-UID beacon
     * 
     */
    public Optional<Output<Integer>> eddystoneUidFreqMsec() {
        return Optional.ofNullable(this.eddystoneUidFreqMsec);
    }

    /**
     * Eddystone-UID instance for the device
     * 
     */
    @Import(name="eddystoneUidInstance")
    private @Nullable Output<String> eddystoneUidInstance;

    /**
     * @return Eddystone-UID instance for the device
     * 
     */
    public Optional<Output<String>> eddystoneUidInstance() {
        return Optional.ofNullable(this.eddystoneUidInstance);
    }

    /**
     * Eddystone-UID namespace
     * 
     */
    @Import(name="eddystoneUidNamespace")
    private @Nullable Output<String> eddystoneUidNamespace;

    /**
     * @return Eddystone-UID namespace
     * 
     */
    public Optional<Output<String>> eddystoneUidNamespace() {
        return Optional.ofNullable(this.eddystoneUidNamespace);
    }

    /**
     * Advertised TX Power, -100 to 20 (dBm), omit this attribute to use default
     * 
     */
    @Import(name="eddystoneUrlAdvPower")
    private @Nullable Output<Integer> eddystoneUrlAdvPower;

    /**
     * @return Advertised TX Power, -100 to 20 (dBm), omit this attribute to use default
     * 
     */
    public Optional<Output<Integer>> eddystoneUrlAdvPower() {
        return Optional.ofNullable(this.eddystoneUrlAdvPower);
    }

    @Import(name="eddystoneUrlBeams")
    private @Nullable Output<String> eddystoneUrlBeams;

    public Optional<Output<String>> eddystoneUrlBeams() {
        return Optional.ofNullable(this.eddystoneUrlBeams);
    }

    /**
     * Only if `beacon_enabled`==`false`, Whether Eddystone-URL beacon is enabled
     * 
     */
    @Import(name="eddystoneUrlEnabled")
    private @Nullable Output<Boolean> eddystoneUrlEnabled;

    /**
     * @return Only if `beacon_enabled`==`false`, Whether Eddystone-URL beacon is enabled
     * 
     */
    public Optional<Output<Boolean>> eddystoneUrlEnabled() {
        return Optional.ofNullable(this.eddystoneUrlEnabled);
    }

    /**
     * Frequency (msec) of data emit by Eddystone-UID beacon
     * 
     */
    @Import(name="eddystoneUrlFreqMsec")
    private @Nullable Output<Integer> eddystoneUrlFreqMsec;

    /**
     * @return Frequency (msec) of data emit by Eddystone-UID beacon
     * 
     */
    public Optional<Output<Integer>> eddystoneUrlFreqMsec() {
        return Optional.ofNullable(this.eddystoneUrlFreqMsec);
    }

    /**
     * URL pointed by Eddystone-URL beacon
     * 
     */
    @Import(name="eddystoneUrlUrl")
    private @Nullable Output<String> eddystoneUrlUrl;

    /**
     * @return URL pointed by Eddystone-URL beacon
     * 
     */
    public Optional<Output<String>> eddystoneUrlUrl() {
        return Optional.ofNullable(this.eddystoneUrlUrl);
    }

    /**
     * Advertised TX Power, -100 to 20 (dBm), omit this attribute to use default
     * 
     */
    @Import(name="ibeaconAdvPower")
    private @Nullable Output<Integer> ibeaconAdvPower;

    /**
     * @return Advertised TX Power, -100 to 20 (dBm), omit this attribute to use default
     * 
     */
    public Optional<Output<Integer>> ibeaconAdvPower() {
        return Optional.ofNullable(this.ibeaconAdvPower);
    }

    @Import(name="ibeaconBeams")
    private @Nullable Output<String> ibeaconBeams;

    public Optional<Output<String>> ibeaconBeams() {
        return Optional.ofNullable(this.ibeaconBeams);
    }

    /**
     * Can be enabled if `beacon_enabled`==`true`, whether to send iBeacon
     * 
     */
    @Import(name="ibeaconEnabled")
    private @Nullable Output<Boolean> ibeaconEnabled;

    /**
     * @return Can be enabled if `beacon_enabled`==`true`, whether to send iBeacon
     * 
     */
    public Optional<Output<Boolean>> ibeaconEnabled() {
        return Optional.ofNullable(this.ibeaconEnabled);
    }

    /**
     * Frequency (msec) of data emit for iBeacon
     * 
     */
    @Import(name="ibeaconFreqMsec")
    private @Nullable Output<Integer> ibeaconFreqMsec;

    /**
     * @return Frequency (msec) of data emit for iBeacon
     * 
     */
    public Optional<Output<Integer>> ibeaconFreqMsec() {
        return Optional.ofNullable(this.ibeaconFreqMsec);
    }

    /**
     * Major number for iBeacon
     * 
     */
    @Import(name="ibeaconMajor")
    private @Nullable Output<Integer> ibeaconMajor;

    /**
     * @return Major number for iBeacon
     * 
     */
    public Optional<Output<Integer>> ibeaconMajor() {
        return Optional.ofNullable(this.ibeaconMajor);
    }

    /**
     * Minor number for iBeacon
     * 
     */
    @Import(name="ibeaconMinor")
    private @Nullable Output<Integer> ibeaconMinor;

    /**
     * @return Minor number for iBeacon
     * 
     */
    public Optional<Output<Integer>> ibeaconMinor() {
        return Optional.ofNullable(this.ibeaconMinor);
    }

    /**
     * Optional, if not specified, the same UUID as the beacon will be used
     * 
     */
    @Import(name="ibeaconUuid")
    private @Nullable Output<String> ibeaconUuid;

    /**
     * @return Optional, if not specified, the same UUID as the beacon will be used
     * 
     */
    public Optional<Output<String>> ibeaconUuid() {
        return Optional.ofNullable(this.ibeaconUuid);
    }

    /**
     * Required if `power_mode`==`custom`; else use `power_mode` as default
     * 
     */
    @Import(name="power")
    private @Nullable Output<Integer> power;

    /**
     * @return Required if `power_mode`==`custom`; else use `power_mode` as default
     * 
     */
    public Optional<Output<Integer>> power() {
        return Optional.ofNullable(this.power);
    }

    /**
     * enum: `custom`, `default`
     * 
     */
    @Import(name="powerMode")
    private @Nullable Output<String> powerMode;

    /**
     * @return enum: `custom`, `default`
     * 
     */
    public Optional<Output<String>> powerMode() {
        return Optional.ofNullable(this.powerMode);
    }

    private DeviceprofileApBleConfigArgs() {}

    private DeviceprofileApBleConfigArgs(DeviceprofileApBleConfigArgs $) {
        this.beaconEnabled = $.beaconEnabled;
        this.beaconRate = $.beaconRate;
        this.beaconRateMode = $.beaconRateMode;
        this.beamDisableds = $.beamDisableds;
        this.customBlePacketEnabled = $.customBlePacketEnabled;
        this.customBlePacketFrame = $.customBlePacketFrame;
        this.customBlePacketFreqMsec = $.customBlePacketFreqMsec;
        this.eddystoneUidAdvPower = $.eddystoneUidAdvPower;
        this.eddystoneUidBeams = $.eddystoneUidBeams;
        this.eddystoneUidEnabled = $.eddystoneUidEnabled;
        this.eddystoneUidFreqMsec = $.eddystoneUidFreqMsec;
        this.eddystoneUidInstance = $.eddystoneUidInstance;
        this.eddystoneUidNamespace = $.eddystoneUidNamespace;
        this.eddystoneUrlAdvPower = $.eddystoneUrlAdvPower;
        this.eddystoneUrlBeams = $.eddystoneUrlBeams;
        this.eddystoneUrlEnabled = $.eddystoneUrlEnabled;
        this.eddystoneUrlFreqMsec = $.eddystoneUrlFreqMsec;
        this.eddystoneUrlUrl = $.eddystoneUrlUrl;
        this.ibeaconAdvPower = $.ibeaconAdvPower;
        this.ibeaconBeams = $.ibeaconBeams;
        this.ibeaconEnabled = $.ibeaconEnabled;
        this.ibeaconFreqMsec = $.ibeaconFreqMsec;
        this.ibeaconMajor = $.ibeaconMajor;
        this.ibeaconMinor = $.ibeaconMinor;
        this.ibeaconUuid = $.ibeaconUuid;
        this.power = $.power;
        this.powerMode = $.powerMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileApBleConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileApBleConfigArgs $;

        public Builder() {
            $ = new DeviceprofileApBleConfigArgs();
        }

        public Builder(DeviceprofileApBleConfigArgs defaults) {
            $ = new DeviceprofileApBleConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param beaconEnabled Whether Mist beacons is enabled
         * 
         * @return builder
         * 
         */
        public Builder beaconEnabled(@Nullable Output<Boolean> beaconEnabled) {
            $.beaconEnabled = beaconEnabled;
            return this;
        }

        /**
         * @param beaconEnabled Whether Mist beacons is enabled
         * 
         * @return builder
         * 
         */
        public Builder beaconEnabled(Boolean beaconEnabled) {
            return beaconEnabled(Output.of(beaconEnabled));
        }

        /**
         * @param beaconRate Required if `beacon_rate_mode`==`custom`, 1-10, in number-beacons-per-second
         * 
         * @return builder
         * 
         */
        public Builder beaconRate(@Nullable Output<Integer> beaconRate) {
            $.beaconRate = beaconRate;
            return this;
        }

        /**
         * @param beaconRate Required if `beacon_rate_mode`==`custom`, 1-10, in number-beacons-per-second
         * 
         * @return builder
         * 
         */
        public Builder beaconRate(Integer beaconRate) {
            return beaconRate(Output.of(beaconRate));
        }

        /**
         * @param beaconRateMode enum: `custom`, `default`
         * 
         * @return builder
         * 
         */
        public Builder beaconRateMode(@Nullable Output<String> beaconRateMode) {
            $.beaconRateMode = beaconRateMode;
            return this;
        }

        /**
         * @param beaconRateMode enum: `custom`, `default`
         * 
         * @return builder
         * 
         */
        public Builder beaconRateMode(String beaconRateMode) {
            return beaconRateMode(Output.of(beaconRateMode));
        }

        /**
         * @param beamDisableds List of AP BLE location beam numbers (1-8) which should be disabled at the AP and not transmit location information (where beam 1 is oriented at the top the AP, growing counter-clock-wise, with 9 being the omni BLE beam)
         * 
         * @return builder
         * 
         */
        public Builder beamDisableds(@Nullable Output<List<Integer>> beamDisableds) {
            $.beamDisableds = beamDisableds;
            return this;
        }

        /**
         * @param beamDisableds List of AP BLE location beam numbers (1-8) which should be disabled at the AP and not transmit location information (where beam 1 is oriented at the top the AP, growing counter-clock-wise, with 9 being the omni BLE beam)
         * 
         * @return builder
         * 
         */
        public Builder beamDisableds(List<Integer> beamDisableds) {
            return beamDisableds(Output.of(beamDisableds));
        }

        /**
         * @param beamDisableds List of AP BLE location beam numbers (1-8) which should be disabled at the AP and not transmit location information (where beam 1 is oriented at the top the AP, growing counter-clock-wise, with 9 being the omni BLE beam)
         * 
         * @return builder
         * 
         */
        public Builder beamDisableds(Integer... beamDisableds) {
            return beamDisableds(List.of(beamDisableds));
        }

        /**
         * @param customBlePacketEnabled Can be enabled if `beacon_enabled`==`true`, whether to send custom packet
         * 
         * @return builder
         * 
         */
        public Builder customBlePacketEnabled(@Nullable Output<Boolean> customBlePacketEnabled) {
            $.customBlePacketEnabled = customBlePacketEnabled;
            return this;
        }

        /**
         * @param customBlePacketEnabled Can be enabled if `beacon_enabled`==`true`, whether to send custom packet
         * 
         * @return builder
         * 
         */
        public Builder customBlePacketEnabled(Boolean customBlePacketEnabled) {
            return customBlePacketEnabled(Output.of(customBlePacketEnabled));
        }

        /**
         * @param customBlePacketFrame The custom frame to be sent out in this beacon. The frame must be a hexstring
         * 
         * @return builder
         * 
         */
        public Builder customBlePacketFrame(@Nullable Output<String> customBlePacketFrame) {
            $.customBlePacketFrame = customBlePacketFrame;
            return this;
        }

        /**
         * @param customBlePacketFrame The custom frame to be sent out in this beacon. The frame must be a hexstring
         * 
         * @return builder
         * 
         */
        public Builder customBlePacketFrame(String customBlePacketFrame) {
            return customBlePacketFrame(Output.of(customBlePacketFrame));
        }

        /**
         * @param customBlePacketFreqMsec Frequency (msec) of data emitted by custom ble beacon
         * 
         * @return builder
         * 
         */
        public Builder customBlePacketFreqMsec(@Nullable Output<Integer> customBlePacketFreqMsec) {
            $.customBlePacketFreqMsec = customBlePacketFreqMsec;
            return this;
        }

        /**
         * @param customBlePacketFreqMsec Frequency (msec) of data emitted by custom ble beacon
         * 
         * @return builder
         * 
         */
        public Builder customBlePacketFreqMsec(Integer customBlePacketFreqMsec) {
            return customBlePacketFreqMsec(Output.of(customBlePacketFreqMsec));
        }

        /**
         * @param eddystoneUidAdvPower Advertised TX Power, -100 to 20 (dBm), omit this attribute to use default
         * 
         * @return builder
         * 
         */
        public Builder eddystoneUidAdvPower(@Nullable Output<Integer> eddystoneUidAdvPower) {
            $.eddystoneUidAdvPower = eddystoneUidAdvPower;
            return this;
        }

        /**
         * @param eddystoneUidAdvPower Advertised TX Power, -100 to 20 (dBm), omit this attribute to use default
         * 
         * @return builder
         * 
         */
        public Builder eddystoneUidAdvPower(Integer eddystoneUidAdvPower) {
            return eddystoneUidAdvPower(Output.of(eddystoneUidAdvPower));
        }

        public Builder eddystoneUidBeams(@Nullable Output<String> eddystoneUidBeams) {
            $.eddystoneUidBeams = eddystoneUidBeams;
            return this;
        }

        public Builder eddystoneUidBeams(String eddystoneUidBeams) {
            return eddystoneUidBeams(Output.of(eddystoneUidBeams));
        }

        /**
         * @param eddystoneUidEnabled Only if `beacon_enabled`==`false`, Whether Eddystone-UID beacon is enabled
         * 
         * @return builder
         * 
         */
        public Builder eddystoneUidEnabled(@Nullable Output<Boolean> eddystoneUidEnabled) {
            $.eddystoneUidEnabled = eddystoneUidEnabled;
            return this;
        }

        /**
         * @param eddystoneUidEnabled Only if `beacon_enabled`==`false`, Whether Eddystone-UID beacon is enabled
         * 
         * @return builder
         * 
         */
        public Builder eddystoneUidEnabled(Boolean eddystoneUidEnabled) {
            return eddystoneUidEnabled(Output.of(eddystoneUidEnabled));
        }

        /**
         * @param eddystoneUidFreqMsec Frequency (msec) of data emit by Eddystone-UID beacon
         * 
         * @return builder
         * 
         */
        public Builder eddystoneUidFreqMsec(@Nullable Output<Integer> eddystoneUidFreqMsec) {
            $.eddystoneUidFreqMsec = eddystoneUidFreqMsec;
            return this;
        }

        /**
         * @param eddystoneUidFreqMsec Frequency (msec) of data emit by Eddystone-UID beacon
         * 
         * @return builder
         * 
         */
        public Builder eddystoneUidFreqMsec(Integer eddystoneUidFreqMsec) {
            return eddystoneUidFreqMsec(Output.of(eddystoneUidFreqMsec));
        }

        /**
         * @param eddystoneUidInstance Eddystone-UID instance for the device
         * 
         * @return builder
         * 
         */
        public Builder eddystoneUidInstance(@Nullable Output<String> eddystoneUidInstance) {
            $.eddystoneUidInstance = eddystoneUidInstance;
            return this;
        }

        /**
         * @param eddystoneUidInstance Eddystone-UID instance for the device
         * 
         * @return builder
         * 
         */
        public Builder eddystoneUidInstance(String eddystoneUidInstance) {
            return eddystoneUidInstance(Output.of(eddystoneUidInstance));
        }

        /**
         * @param eddystoneUidNamespace Eddystone-UID namespace
         * 
         * @return builder
         * 
         */
        public Builder eddystoneUidNamespace(@Nullable Output<String> eddystoneUidNamespace) {
            $.eddystoneUidNamespace = eddystoneUidNamespace;
            return this;
        }

        /**
         * @param eddystoneUidNamespace Eddystone-UID namespace
         * 
         * @return builder
         * 
         */
        public Builder eddystoneUidNamespace(String eddystoneUidNamespace) {
            return eddystoneUidNamespace(Output.of(eddystoneUidNamespace));
        }

        /**
         * @param eddystoneUrlAdvPower Advertised TX Power, -100 to 20 (dBm), omit this attribute to use default
         * 
         * @return builder
         * 
         */
        public Builder eddystoneUrlAdvPower(@Nullable Output<Integer> eddystoneUrlAdvPower) {
            $.eddystoneUrlAdvPower = eddystoneUrlAdvPower;
            return this;
        }

        /**
         * @param eddystoneUrlAdvPower Advertised TX Power, -100 to 20 (dBm), omit this attribute to use default
         * 
         * @return builder
         * 
         */
        public Builder eddystoneUrlAdvPower(Integer eddystoneUrlAdvPower) {
            return eddystoneUrlAdvPower(Output.of(eddystoneUrlAdvPower));
        }

        public Builder eddystoneUrlBeams(@Nullable Output<String> eddystoneUrlBeams) {
            $.eddystoneUrlBeams = eddystoneUrlBeams;
            return this;
        }

        public Builder eddystoneUrlBeams(String eddystoneUrlBeams) {
            return eddystoneUrlBeams(Output.of(eddystoneUrlBeams));
        }

        /**
         * @param eddystoneUrlEnabled Only if `beacon_enabled`==`false`, Whether Eddystone-URL beacon is enabled
         * 
         * @return builder
         * 
         */
        public Builder eddystoneUrlEnabled(@Nullable Output<Boolean> eddystoneUrlEnabled) {
            $.eddystoneUrlEnabled = eddystoneUrlEnabled;
            return this;
        }

        /**
         * @param eddystoneUrlEnabled Only if `beacon_enabled`==`false`, Whether Eddystone-URL beacon is enabled
         * 
         * @return builder
         * 
         */
        public Builder eddystoneUrlEnabled(Boolean eddystoneUrlEnabled) {
            return eddystoneUrlEnabled(Output.of(eddystoneUrlEnabled));
        }

        /**
         * @param eddystoneUrlFreqMsec Frequency (msec) of data emit by Eddystone-UID beacon
         * 
         * @return builder
         * 
         */
        public Builder eddystoneUrlFreqMsec(@Nullable Output<Integer> eddystoneUrlFreqMsec) {
            $.eddystoneUrlFreqMsec = eddystoneUrlFreqMsec;
            return this;
        }

        /**
         * @param eddystoneUrlFreqMsec Frequency (msec) of data emit by Eddystone-UID beacon
         * 
         * @return builder
         * 
         */
        public Builder eddystoneUrlFreqMsec(Integer eddystoneUrlFreqMsec) {
            return eddystoneUrlFreqMsec(Output.of(eddystoneUrlFreqMsec));
        }

        /**
         * @param eddystoneUrlUrl URL pointed by Eddystone-URL beacon
         * 
         * @return builder
         * 
         */
        public Builder eddystoneUrlUrl(@Nullable Output<String> eddystoneUrlUrl) {
            $.eddystoneUrlUrl = eddystoneUrlUrl;
            return this;
        }

        /**
         * @param eddystoneUrlUrl URL pointed by Eddystone-URL beacon
         * 
         * @return builder
         * 
         */
        public Builder eddystoneUrlUrl(String eddystoneUrlUrl) {
            return eddystoneUrlUrl(Output.of(eddystoneUrlUrl));
        }

        /**
         * @param ibeaconAdvPower Advertised TX Power, -100 to 20 (dBm), omit this attribute to use default
         * 
         * @return builder
         * 
         */
        public Builder ibeaconAdvPower(@Nullable Output<Integer> ibeaconAdvPower) {
            $.ibeaconAdvPower = ibeaconAdvPower;
            return this;
        }

        /**
         * @param ibeaconAdvPower Advertised TX Power, -100 to 20 (dBm), omit this attribute to use default
         * 
         * @return builder
         * 
         */
        public Builder ibeaconAdvPower(Integer ibeaconAdvPower) {
            return ibeaconAdvPower(Output.of(ibeaconAdvPower));
        }

        public Builder ibeaconBeams(@Nullable Output<String> ibeaconBeams) {
            $.ibeaconBeams = ibeaconBeams;
            return this;
        }

        public Builder ibeaconBeams(String ibeaconBeams) {
            return ibeaconBeams(Output.of(ibeaconBeams));
        }

        /**
         * @param ibeaconEnabled Can be enabled if `beacon_enabled`==`true`, whether to send iBeacon
         * 
         * @return builder
         * 
         */
        public Builder ibeaconEnabled(@Nullable Output<Boolean> ibeaconEnabled) {
            $.ibeaconEnabled = ibeaconEnabled;
            return this;
        }

        /**
         * @param ibeaconEnabled Can be enabled if `beacon_enabled`==`true`, whether to send iBeacon
         * 
         * @return builder
         * 
         */
        public Builder ibeaconEnabled(Boolean ibeaconEnabled) {
            return ibeaconEnabled(Output.of(ibeaconEnabled));
        }

        /**
         * @param ibeaconFreqMsec Frequency (msec) of data emit for iBeacon
         * 
         * @return builder
         * 
         */
        public Builder ibeaconFreqMsec(@Nullable Output<Integer> ibeaconFreqMsec) {
            $.ibeaconFreqMsec = ibeaconFreqMsec;
            return this;
        }

        /**
         * @param ibeaconFreqMsec Frequency (msec) of data emit for iBeacon
         * 
         * @return builder
         * 
         */
        public Builder ibeaconFreqMsec(Integer ibeaconFreqMsec) {
            return ibeaconFreqMsec(Output.of(ibeaconFreqMsec));
        }

        /**
         * @param ibeaconMajor Major number for iBeacon
         * 
         * @return builder
         * 
         */
        public Builder ibeaconMajor(@Nullable Output<Integer> ibeaconMajor) {
            $.ibeaconMajor = ibeaconMajor;
            return this;
        }

        /**
         * @param ibeaconMajor Major number for iBeacon
         * 
         * @return builder
         * 
         */
        public Builder ibeaconMajor(Integer ibeaconMajor) {
            return ibeaconMajor(Output.of(ibeaconMajor));
        }

        /**
         * @param ibeaconMinor Minor number for iBeacon
         * 
         * @return builder
         * 
         */
        public Builder ibeaconMinor(@Nullable Output<Integer> ibeaconMinor) {
            $.ibeaconMinor = ibeaconMinor;
            return this;
        }

        /**
         * @param ibeaconMinor Minor number for iBeacon
         * 
         * @return builder
         * 
         */
        public Builder ibeaconMinor(Integer ibeaconMinor) {
            return ibeaconMinor(Output.of(ibeaconMinor));
        }

        /**
         * @param ibeaconUuid Optional, if not specified, the same UUID as the beacon will be used
         * 
         * @return builder
         * 
         */
        public Builder ibeaconUuid(@Nullable Output<String> ibeaconUuid) {
            $.ibeaconUuid = ibeaconUuid;
            return this;
        }

        /**
         * @param ibeaconUuid Optional, if not specified, the same UUID as the beacon will be used
         * 
         * @return builder
         * 
         */
        public Builder ibeaconUuid(String ibeaconUuid) {
            return ibeaconUuid(Output.of(ibeaconUuid));
        }

        /**
         * @param power Required if `power_mode`==`custom`; else use `power_mode` as default
         * 
         * @return builder
         * 
         */
        public Builder power(@Nullable Output<Integer> power) {
            $.power = power;
            return this;
        }

        /**
         * @param power Required if `power_mode`==`custom`; else use `power_mode` as default
         * 
         * @return builder
         * 
         */
        public Builder power(Integer power) {
            return power(Output.of(power));
        }

        /**
         * @param powerMode enum: `custom`, `default`
         * 
         * @return builder
         * 
         */
        public Builder powerMode(@Nullable Output<String> powerMode) {
            $.powerMode = powerMode;
            return this;
        }

        /**
         * @param powerMode enum: `custom`, `default`
         * 
         * @return builder
         * 
         */
        public Builder powerMode(String powerMode) {
            return powerMode(Output.of(powerMode));
        }

        public DeviceprofileApBleConfigArgs build() {
            return $;
        }
    }

}
