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
    public sealed class GetAlarmtemplatesOrgAlarmtemplateDeliveryResult
    {
        /// <summary>
        /// List of additional email string to deliver the alarms via emails
        /// </summary>
        public readonly ImmutableArray<string> AdditionalEmails;
        /// <summary>
        /// Whether to enable the alarm delivery via emails or not
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Whether to deliver the alarms via emails to Org admins or not
        /// </summary>
        public readonly bool ToOrgAdmins;
        /// <summary>
        /// Whether to deliver the alarms via emails to Site admins or not
        /// </summary>
        public readonly bool ToSiteAdmins;

        [OutputConstructor]
        private GetAlarmtemplatesOrgAlarmtemplateDeliveryResult(
            ImmutableArray<string> additionalEmails,

            bool enabled,

            bool toOrgAdmins,

            bool toSiteAdmins)
        {
            AdditionalEmails = additionalEmails;
            Enabled = enabled;
            ToOrgAdmins = toOrgAdmins;
            ToSiteAdmins = toSiteAdmins;
        }
    }
}
