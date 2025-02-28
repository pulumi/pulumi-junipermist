// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Outputs
{

    [OutputType]
    public sealed class SettingBleConfig
    {
        /// <summary>
        /// Whether Mist beacons is enabled
        /// </summary>
        public readonly bool? BeaconEnabled;
        /// <summary>
        /// Required if `beacon_rate_mode`==`custom`, 1-10, in number-beacons-per-second
        /// </summary>
        public readonly int? BeaconRate;
        /// <summary>
        /// enum: `custom`, `default`
        /// </summary>
        public readonly string? BeaconRateMode;
        /// <summary>
        /// List of AP BLE location beam numbers (1-8) which should be disabled at the AP and not transmit location information (where beam 1 is oriented at the top the AP, growing counter-clock-wise, with 9 being the omni BLE beam)
        /// </summary>
        public readonly ImmutableArray<int> BeamDisableds;
        /// <summary>
        /// Can be enabled if `beacon_enabled`==`true`, whether to send custom packet
        /// </summary>
        public readonly bool? CustomBlePacketEnabled;
        /// <summary>
        /// The custom frame to be sent out in this beacon. The frame must be a hexstring
        /// </summary>
        public readonly string? CustomBlePacketFrame;
        /// <summary>
        /// Frequency (msec) of data emitted by custom ble beacon
        /// </summary>
        public readonly int? CustomBlePacketFreqMsec;
        /// <summary>
        /// Advertised TX Power, -100 to 20 (dBm), omit this attribute to use default
        /// </summary>
        public readonly int? EddystoneUidAdvPower;
        public readonly string? EddystoneUidBeams;
        /// <summary>
        /// Only if `beacon_enabled`==`false`, Whether Eddystone-UID beacon is enabled
        /// </summary>
        public readonly bool? EddystoneUidEnabled;
        /// <summary>
        /// Frequency (msec) of data emmit by Eddystone-UID beacon
        /// </summary>
        public readonly int? EddystoneUidFreqMsec;
        /// <summary>
        /// Eddystone-UID instance for the device
        /// </summary>
        public readonly string? EddystoneUidInstance;
        /// <summary>
        /// Eddystone-UID namespace
        /// </summary>
        public readonly string? EddystoneUidNamespace;
        /// <summary>
        /// Advertised TX Power, -100 to 20 (dBm), omit this attribute to use default
        /// </summary>
        public readonly int? EddystoneUrlAdvPower;
        public readonly string? EddystoneUrlBeams;
        /// <summary>
        /// Only if `beacon_enabled`==`false`, Whether Eddystone-URL beacon is enabled
        /// </summary>
        public readonly bool? EddystoneUrlEnabled;
        /// <summary>
        /// Frequency (msec) of data emit by Eddystone-UID beacon
        /// </summary>
        public readonly int? EddystoneUrlFreqMsec;
        /// <summary>
        /// URL pointed by Eddystone-URL beacon
        /// </summary>
        public readonly string? EddystoneUrlUrl;
        /// <summary>
        /// Advertised TX Power, -100 to 20 (dBm), omit this attribute to use default
        /// </summary>
        public readonly int? IbeaconAdvPower;
        public readonly string? IbeaconBeams;
        /// <summary>
        /// Can be enabled if `beacon_enabled`==`true`, whether to send iBeacon
        /// </summary>
        public readonly bool? IbeaconEnabled;
        /// <summary>
        /// Frequency (msec) of data emmit for iBeacon
        /// </summary>
        public readonly int? IbeaconFreqMsec;
        /// <summary>
        /// Major number for iBeacon
        /// </summary>
        public readonly int? IbeaconMajor;
        /// <summary>
        /// Minor number for iBeacon
        /// </summary>
        public readonly int? IbeaconMinor;
        /// <summary>
        /// Optional, if not specified, the same UUID as the beacon will be used
        /// </summary>
        public readonly string? IbeaconUuid;
        /// <summary>
        /// Required if `power_mode`==`custom`; else use `power_mode` as default
        /// </summary>
        public readonly int? Power;
        /// <summary>
        /// enum: `custom`, `default`
        /// </summary>
        public readonly string? PowerMode;

        [OutputConstructor]
        private SettingBleConfig(
            bool? beaconEnabled,

            int? beaconRate,

            string? beaconRateMode,

            ImmutableArray<int> beamDisableds,

            bool? customBlePacketEnabled,

            string? customBlePacketFrame,

            int? customBlePacketFreqMsec,

            int? eddystoneUidAdvPower,

            string? eddystoneUidBeams,

            bool? eddystoneUidEnabled,

            int? eddystoneUidFreqMsec,

            string? eddystoneUidInstance,

            string? eddystoneUidNamespace,

            int? eddystoneUrlAdvPower,

            string? eddystoneUrlBeams,

            bool? eddystoneUrlEnabled,

            int? eddystoneUrlFreqMsec,

            string? eddystoneUrlUrl,

            int? ibeaconAdvPower,

            string? ibeaconBeams,

            bool? ibeaconEnabled,

            int? ibeaconFreqMsec,

            int? ibeaconMajor,

            int? ibeaconMinor,

            string? ibeaconUuid,

            int? power,

            string? powerMode)
        {
            BeaconEnabled = beaconEnabled;
            BeaconRate = beaconRate;
            BeaconRateMode = beaconRateMode;
            BeamDisableds = beamDisableds;
            CustomBlePacketEnabled = customBlePacketEnabled;
            CustomBlePacketFrame = customBlePacketFrame;
            CustomBlePacketFreqMsec = customBlePacketFreqMsec;
            EddystoneUidAdvPower = eddystoneUidAdvPower;
            EddystoneUidBeams = eddystoneUidBeams;
            EddystoneUidEnabled = eddystoneUidEnabled;
            EddystoneUidFreqMsec = eddystoneUidFreqMsec;
            EddystoneUidInstance = eddystoneUidInstance;
            EddystoneUidNamespace = eddystoneUidNamespace;
            EddystoneUrlAdvPower = eddystoneUrlAdvPower;
            EddystoneUrlBeams = eddystoneUrlBeams;
            EddystoneUrlEnabled = eddystoneUrlEnabled;
            EddystoneUrlFreqMsec = eddystoneUrlFreqMsec;
            EddystoneUrlUrl = eddystoneUrlUrl;
            IbeaconAdvPower = ibeaconAdvPower;
            IbeaconBeams = ibeaconBeams;
            IbeaconEnabled = ibeaconEnabled;
            IbeaconFreqMsec = ibeaconFreqMsec;
            IbeaconMajor = ibeaconMajor;
            IbeaconMinor = ibeaconMinor;
            IbeaconUuid = ibeaconUuid;
            Power = power;
            PowerMode = powerMode;
        }
    }
}
