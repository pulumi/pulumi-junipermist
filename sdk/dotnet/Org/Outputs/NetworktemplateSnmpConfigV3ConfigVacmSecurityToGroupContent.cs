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
    public sealed class NetworktemplateSnmpConfigV3ConfigVacmSecurityToGroupContent
    {
        /// <summary>
        /// Refer to group_name under access
        /// </summary>
        public readonly string? Group;
        public readonly string? SecurityName;

        [OutputConstructor]
        private NetworktemplateSnmpConfigV3ConfigVacmSecurityToGroupContent(
            string? group,

            string? securityName)
        {
            Group = group;
            SecurityName = securityName;
        }
    }
}
