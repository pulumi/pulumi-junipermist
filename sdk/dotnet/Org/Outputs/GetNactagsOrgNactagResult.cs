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
    public sealed class GetNactagsOrgNactagResult
    {
        /// <summary>
        /// can be set to true to allow the override by usermac result
        /// </summary>
        public readonly bool AllowUsermacOverride;
        public readonly double CreatedTime;
        /// <summary>
        /// if `type`==`egress_vlan_names`, list of egress vlans to return
        /// </summary>
        public readonly ImmutableArray<string> EgressVlanNames;
        /// <summary>
        /// if `type`==`gbp_tag`
        /// </summary>
        public readonly int GbpTag;
        public readonly string Id;
        /// <summary>
        /// if `type`==`match`. enum: `cert_cn`, `cert_issuer`, `cert_san`, `cert_serial`, `cert_sub`, `client_mac`, `idp_role`, `mdm_status`, `radius_group`, `realm`, `ssid`, `user_name`, `usermac_label`
        /// </summary>
        public readonly string Match;
        /// <summary>
        /// This field is applicable only when `type`==`match`
        ///   * `false`: means it is sufficient to match any of the values (i.e., match-any behavior)
        ///   * `true`: means all values should be matched (i.e., match-all behavior)
        /// 
        /// 
        /// Currently it makes sense to set this field to `true` only if the `match`==`idp_role` or `match`==`usermac_label`'
        /// </summary>
        public readonly bool MatchAll;
        public readonly double ModifiedTime;
        public readonly string Name;
        public readonly string OrgId;
        /// <summary>
        /// if `type`==`radius_attrs`, user can specify a list of one or more standard attributes in the field "radius_attrs". 
        /// It is the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected.
        /// Note that it is allowed to have more than one radius_attrs in the result of a given rule.
        /// </summary>
        public readonly ImmutableArray<string> RadiusAttrs;
        /// <summary>
        /// if `type`==`radius_group`
        /// </summary>
        public readonly string RadiusGroup;
        /// <summary>
        /// if `type`==`radius_vendor_attrs`, user can specify a list of one or more vendor-specific attributes in the field "radius_vendor_attrs". 
        /// It is the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected.
        /// Note that it is allowed to have more than one radius_vendor_attrs in the result of a given rule.
        /// </summary>
        public readonly ImmutableArray<string> RadiusVendorAttrs;
        /// <summary>
        /// if `type`==`session_timeout, in seconds
        /// </summary>
        public readonly int SessionTimeout;
        /// <summary>
        /// enum: `egress_vlan_names`, `gbp_tag`, `match`, `radius_attrs`, `radius_group`, `radius_vendor_attrs`, `session_timeout`, `username_attr`, `vlan`
        /// </summary>
        public readonly string Type;
        public readonly string UsernameAttr;
        /// <summary>
        /// if `type`==`match`
        /// </summary>
        public readonly ImmutableArray<string> Values;
        /// <summary>
        /// if `type`==`vlan`
        /// </summary>
        public readonly string Vlan;

        [OutputConstructor]
        private GetNactagsOrgNactagResult(
            bool allowUsermacOverride,

            double createdTime,

            ImmutableArray<string> egressVlanNames,

            int gbpTag,

            string id,

            string match,

            bool matchAll,

            double modifiedTime,

            string name,

            string orgId,

            ImmutableArray<string> radiusAttrs,

            string radiusGroup,

            ImmutableArray<string> radiusVendorAttrs,

            int sessionTimeout,

            string type,

            string usernameAttr,

            ImmutableArray<string> values,

            string vlan)
        {
            AllowUsermacOverride = allowUsermacOverride;
            CreatedTime = createdTime;
            EgressVlanNames = egressVlanNames;
            GbpTag = gbpTag;
            Id = id;
            Match = match;
            MatchAll = matchAll;
            ModifiedTime = modifiedTime;
            Name = name;
            OrgId = orgId;
            RadiusAttrs = radiusAttrs;
            RadiusGroup = radiusGroup;
            RadiusVendorAttrs = radiusVendorAttrs;
            SessionTimeout = sessionTimeout;
            Type = type;
            UsernameAttr = usernameAttr;
            Values = values;
            Vlan = vlan;
        }
    }
}
