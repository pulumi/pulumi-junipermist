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
    public sealed class GetPsksOrgPskResult
    {
        /// <summary>
        /// sso id for psk created from psk portal
        /// </summary>
        public readonly string AdminSsoId;
        public readonly double CreatedTime;
        /// <summary>
        /// email to send psk expiring notifications to
        /// </summary>
        public readonly string Email;
        /// <summary>
        /// Expire time for this PSK key (epoch time in seconds). Default `null` (as no expiration)
        /// </summary>
        public readonly int ExpireTime;
        /// <summary>
        /// Number of days before psk is expired. Used as to when to start sending reminder notification when the psk is about to expire
        /// </summary>
        public readonly int ExpiryNotificationTime;
        public readonly string Id;
        /// <summary>
        /// if `usage`==`single`, the mac that this PSK ties to, empty if `auto-binding`
        /// </summary>
        public readonly string Mac;
        /// <summary>
        /// if `usage`==`macs`, this list contains N number of client mac addresses or mac patterns(11:22:*) or both. This list is capped at 5000
        /// </summary>
        public readonly ImmutableArray<string> Macs;
        /// <summary>
        /// For Org PSK Only. Max concurrent users for this PSK key. Default is 0 (unlimited)
        /// </summary>
        public readonly int MaxUsage;
        public readonly double ModifiedTime;
        public readonly string Name;
        public readonly string Note;
        /// <summary>
        /// If set to true, reminder notification will be sent when psk is about to expire
        /// </summary>
        public readonly bool NotifyExpiry;
        /// <summary>
        /// If set to true, notification will be sent when psk is created or edited
        /// </summary>
        public readonly bool NotifyOnCreateOrEdit;
        /// <summary>
        /// previous passphrase of the PSK if it has been rotated
        /// </summary>
        public readonly string OldPassphrase;
        public readonly string OrgId;
        /// <summary>
        /// passphrase of the PSK (8-63 character or 64 in hex)
        /// </summary>
        public readonly string Passphrase;
        public readonly string Role;
        /// <summary>
        /// SSID this PSK should be applicable to
        /// </summary>
        public readonly string Ssid;
        /// <summary>
        /// enum: `macs`, `multi`, `single`
        /// </summary>
        public readonly string Usage;
        public readonly string VlanId;

        [OutputConstructor]
        private GetPsksOrgPskResult(
            string adminSsoId,

            double createdTime,

            string email,

            int expireTime,

            int expiryNotificationTime,

            string id,

            string mac,

            ImmutableArray<string> macs,

            int maxUsage,

            double modifiedTime,

            string name,

            string note,

            bool notifyExpiry,

            bool notifyOnCreateOrEdit,

            string oldPassphrase,

            string orgId,

            string passphrase,

            string role,

            string ssid,

            string usage,

            string vlanId)
        {
            AdminSsoId = adminSsoId;
            CreatedTime = createdTime;
            Email = email;
            ExpireTime = expireTime;
            ExpiryNotificationTime = expiryNotificationTime;
            Id = id;
            Mac = mac;
            Macs = macs;
            MaxUsage = maxUsage;
            ModifiedTime = modifiedTime;
            Name = name;
            Note = note;
            NotifyExpiry = notifyExpiry;
            NotifyOnCreateOrEdit = notifyOnCreateOrEdit;
            OldPassphrase = oldPassphrase;
            OrgId = orgId;
            Passphrase = passphrase;
            Role = role;
            Ssid = ssid;
            Usage = usage;
            VlanId = vlanId;
        }
    }
}
