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
    public sealed class NetworktemplateSnmpConfigTrapGroup
    {
        public readonly ImmutableArray<string> Categories;
        /// <summary>
        /// Categories list can refer to https://www.juniper.net/documentation/software/topics/task/configuration/snmp_trap-groups-configuring-junos-nm.html
        /// </summary>
        public readonly string? GroupName;
        public readonly ImmutableArray<string> Targets;
        /// <summary>
        /// enum: `all`, `v1`, `v2`
        /// </summary>
        public readonly string? Version;

        [OutputConstructor]
        private NetworktemplateSnmpConfigTrapGroup(
            ImmutableArray<string> categories,

            string? groupName,

            ImmutableArray<string> targets,

            string? version)
        {
            Categories = categories;
            GroupName = groupName;
            Targets = targets;
            Version = version;
        }
    }
}