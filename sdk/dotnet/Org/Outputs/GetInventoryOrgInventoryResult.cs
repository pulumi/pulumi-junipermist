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
        /// Only if `type`==`switch` or `type`==`gateway`, whether the switch/gateway is adopted
        /// </summary>
        public readonly bool Adopted;
        /// <summary>
        /// Device claim code
        /// </summary>
        public readonly string ClaimCode;
        /// <summary>
        /// Whether the device is connected
        /// </summary>
        public readonly bool Connected;
        /// <summary>
        /// Deviceprofile id if assigned, null if not assigned
        /// </summary>
        public readonly string DeviceprofileId;
        /// <summary>
        /// Hostname reported by the device
        /// </summary>
        public readonly string Hostname;
        /// <summary>
        /// Device hardware revision number
        /// </summary>
        public readonly string HwRev;
        /// <summary>
        /// Unique ID of the object instance in the Mist Organization
        /// </summary>
        public readonly string Id;
        public readonly bool Jsi;
        /// <summary>
        /// Device MAC address
        /// </summary>
        public readonly string Mac;
        /// <summary>
        /// Device model
        /// </summary>
        public readonly string Model;
        /// <summary>
        /// Device name if configured
        /// </summary>
        public readonly string Name;
        public readonly string OrgId;
        /// <summary>
        /// Device serial
        /// </summary>
        public readonly string Serial;
        /// <summary>
        /// Site ID where the device is assigned to
        /// </summary>
        public readonly string SiteId;
        /// <summary>
        /// Device stock keeping unit
        /// </summary>
        public readonly string Sku;
        /// <summary>
        /// enum: `ap`, `gateway`, `switch`
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// If `type`==`switch` and device part of a Virtual Chassis, MAC Address of the Virtual Chassis. if `type`==`gateway` and device part of a Cluster, MAC Address of the Cluster
        /// </summary>
        public readonly string VcMac;

        [OutputConstructor]
        private GetInventoryOrgInventoryResult(
            bool adopted,

            string claimCode,

            bool connected,

            string deviceprofileId,

            string hostname,

            string hwRev,

            string id,

            bool jsi,

            string mac,

            string model,

            string name,

            string orgId,

            string serial,

            string siteId,

            string sku,

            string type,

            string vcMac)
        {
            Adopted = adopted;
            ClaimCode = claimCode;
            Connected = connected;
            DeviceprofileId = deviceprofileId;
            Hostname = hostname;
            HwRev = hwRev;
            Id = id;
            Jsi = jsi;
            Mac = mac;
            Model = model;
            Name = name;
            OrgId = orgId;
            Serial = serial;
            SiteId = siteId;
            Sku = sku;
            Type = type;
            VcMac = vcMac;
        }
    }
}
