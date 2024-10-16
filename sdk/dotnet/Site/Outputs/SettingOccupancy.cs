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
    public sealed class SettingOccupancy
    {
        /// <summary>
        /// indicate whether named BLE assets should be included in the zone occupancy calculation
        /// </summary>
        public readonly bool? AssetsEnabled;
        /// <summary>
        /// indicate whether connected WiFi clients should be included in the zone occupancy calculation
        /// </summary>
        public readonly bool? ClientsEnabled;
        /// <summary>
        /// minimum duration
        /// </summary>
        public readonly int? MinDuration;
        /// <summary>
        /// indicate whether SDK clients should be included in the zone occupancy calculation
        /// </summary>
        public readonly bool? SdkclientsEnabled;
        /// <summary>
        /// indicate whether unconnected WiFi clients should be included in the zone occupancy calculation
        /// </summary>
        public readonly bool? UnconnectedClientsEnabled;

        [OutputConstructor]
        private SettingOccupancy(
            bool? assetsEnabled,

            bool? clientsEnabled,

            int? minDuration,

            bool? sdkclientsEnabled,

            bool? unconnectedClientsEnabled)
        {
            AssetsEnabled = assetsEnabled;
            ClientsEnabled = clientsEnabled;
            MinDuration = minDuration;
            SdkclientsEnabled = sdkclientsEnabled;
            UnconnectedClientsEnabled = unconnectedClientsEnabled;
        }
    }
}
