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
    public sealed class SettingSwitchMgmt
    {
        /// <summary>
        /// If the field is set in both site/setting and org/setting, the value from site/setting will be used.
        /// </summary>
        public readonly int? ApAffinityThreshold;
        /// <summary>
        /// If `false`, only the configuration generated by Mist is cleaned up during the configuration process. If `true`, all the existing configuration will be removed.
        /// </summary>
        public readonly bool? RemoveExistingConfigs;

        [OutputConstructor]
        private SettingSwitchMgmt(
            int? apAffinityThreshold,

            bool? removeExistingConfigs)
        {
            ApAffinityThreshold = apAffinityThreshold;
            RemoveExistingConfigs = removeExistingConfigs;
        }
    }
}
