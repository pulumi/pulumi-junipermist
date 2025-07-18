// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Outputs
{

    [OutputType]
    public sealed class GetWxtagsOrgWxtagResult
    {
        /// <summary>
        /// When the object has been created, in epoch
        /// </summary>
        public readonly double CreatedTime;
        /// <summary>
        /// Unique ID of the object instance in the Mist Organization
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> LastIps;
        /// <summary>
        /// If `type`==`client`, Client MAC Address
        /// </summary>
        public readonly string Mac;
        /// <summary>
        /// required if `type`==`match`. enum: `ap_id`, `app`, `asset_mac`, `client_mac`, `hostname`, `ip_range_subnet`, `port`, `psk_name`, `psk_role`, `radius_attr`, `radius_class`, `radius_group`, `radius_username`, `sdkclient_uuid`, `wlan_id`
        /// </summary>
        public readonly string Match;
        /// <summary>
        /// When the object has been modified for the last time, in epoch
        /// </summary>
        public readonly double ModifiedTime;
        /// <summary>
        /// The name
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `not_in`
        /// </summary>
        public readonly string Op;
        public readonly string OrgId;
        public readonly string ResourceMac;
        public readonly ImmutableArray<string> Services;
        public readonly string SiteId;
        /// <summary>
        /// If `type`==`spec`
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWxtagsOrgWxtagSpecResult> Specs;
        public readonly string Subnet;
        /// <summary>
        /// enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Required if `type`==`match` and
        ///   * `match`==`ap_id`: list of AP IDs
        ///   * `match`==`app`: list of Application Names
        ///   * `match`==`asset_mac`: list of Asset MAC Addresses
        ///   * `match`==`client_mac`: list of Client MAC Addresses
        ///   * `match`==`hostname`: list of Resources Hostnames
        ///   * `match`==`ip_range_subnet`: list of IP Addresses and/or CIDRs
        ///   * `match`==`psk_name`: list of PSK Names
        ///   * `match`==`psk_role`: list of PSK Roles
        ///   * `match`==`port`: list of Ports or Port Ranges
        ///   * `match`==`radius_attr`: list of RADIUS Attributes. The values are [ "6=1", "26=10.2.3.4" ], this support other RADIUS attributes where we know the type
        ///   * `match`==`radius_class`: list of RADIUS Classes. This matches the ATTR-Class(25)
        ///   * `match`==`radius_group`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID, Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1)
        ///   * `match`==`radius_username`: list of RADIUS Usernames. This matches the ATTR-User-Name(1)
        ///   * `match`==`sdkclient_uuid`: list of SDK UUIDs
        ///   * `match`==`wlan_id`: list of WLAN IDs
        /// 
        /// **Notes**:
        /// Variables are not allowed
        /// </summary>
        public readonly ImmutableArray<string> Values;
        public readonly string VlanId;

        [OutputConstructor]
        private GetWxtagsOrgWxtagResult(
            double createdTime,

            string id,

            ImmutableArray<string> lastIps,

            string mac,

            string match,

            double modifiedTime,

            string name,

            string op,

            string orgId,

            string resourceMac,

            ImmutableArray<string> services,

            string siteId,

            ImmutableArray<Outputs.GetWxtagsOrgWxtagSpecResult> specs,

            string subnet,

            string type,

            ImmutableArray<string> values,

            string vlanId)
        {
            CreatedTime = createdTime;
            Id = id;
            LastIps = lastIps;
            Mac = mac;
            Match = match;
            ModifiedTime = modifiedTime;
            Name = name;
            Op = op;
            OrgId = orgId;
            ResourceMac = resourceMac;
            Services = services;
            SiteId = siteId;
            Specs = specs;
            Subnet = subnet;
            Type = type;
            Values = values;
            VlanId = vlanId;
        }
    }
}
