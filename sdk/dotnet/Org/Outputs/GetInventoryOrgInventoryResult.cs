// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Outputs
{

    [OutputType]
    public sealed class GetInventoryOrgInventoryResult
    {
        /// <summary>
        /// only if `type`==`switch` or `type`==`gateway`
        /// whether the switch/gateway is adopted
        /// </summary>
        public readonly bool Adopted;
        /// <summary>
        /// device claim code
        /// </summary>
        public readonly string ClaimCode;
        /// <summary>
        /// whether the device is connected
        /// </summary>
        public readonly bool Connected;
        /// <summary>
        /// inventory created time, in epoch
        /// </summary>
        public readonly int CreatedTime;
        /// <summary>
        /// deviceprofile id if assigned, null if not assigned
        /// </summary>
        public readonly string DeviceprofileId;
        /// <summary>
        /// hostname reported by the device
        /// </summary>
        public readonly string Hostname;
        /// <summary>
        /// device hardware revision number
        /// </summary>
        public readonly string HwRev;
        /// <summary>
        /// device id
        /// </summary>
        public readonly string Id;
        public readonly bool Jsi;
        /// <summary>
        /// device MAC address
        /// </summary>
        public readonly string Mac;
        /// <summary>
        /// device model
        /// </summary>
        public readonly string Model;
        /// <summary>
        /// inventory last modified time, in epoch
        /// </summary>
        public readonly int ModifiedTime;
        /// <summary>
        /// device name if configured
        /// </summary>
        public readonly string Name;
        public readonly string OrgId;
        /// <summary>
        /// device serial
        /// </summary>
        public readonly string Serial;
        public readonly string SiteId;
        /// <summary>
        /// device stock keeping unit
        /// </summary>
        public readonly string Sku;
        /// <summary>
        /// only if `type`==`switch`, MAC Address of the Virtual Chassis
        /// </summary>
        public readonly string VcMac;

        [OutputConstructor]
        private GetInventoryOrgInventoryResult(
            bool adopted,

            string claimCode,

            bool connected,

            int createdTime,

            string deviceprofileId,

            string hostname,

            string hwRev,

            string id,

            bool jsi,

            string mac,

            string model,

            int modifiedTime,

            string name,

            string orgId,

            string serial,

            string siteId,

            string sku,

            string vcMac)
        {
            Adopted = adopted;
            ClaimCode = claimCode;
            Connected = connected;
            CreatedTime = createdTime;
            DeviceprofileId = deviceprofileId;
            Hostname = hostname;
            HwRev = hwRev;
            Id = id;
            Jsi = jsi;
            Mac = mac;
            Model = model;
            ModifiedTime = modifiedTime;
            Name = name;
            OrgId = orgId;
            Serial = serial;
            SiteId = siteId;
            Sku = sku;
            VcMac = vcMac;
        }
    }
}