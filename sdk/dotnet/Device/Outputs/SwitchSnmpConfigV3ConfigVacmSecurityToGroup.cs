// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Outputs
{

    [OutputType]
    public sealed class SwitchSnmpConfigV3ConfigVacmSecurityToGroup
    {
        public readonly ImmutableArray<Outputs.SwitchSnmpConfigV3ConfigVacmSecurityToGroupContent> Contents;
        /// <summary>
        /// enum: `usm`, `v1`, `v2c`
        /// </summary>
        public readonly string? SecurityModel;

        [OutputConstructor]
        private SwitchSnmpConfigV3ConfigVacmSecurityToGroup(
            ImmutableArray<Outputs.SwitchSnmpConfigV3ConfigVacmSecurityToGroupContent> contents,

            string? securityModel)
        {
            Contents = contents;
            SecurityModel = securityModel;
        }
    }
}
