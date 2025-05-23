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
    public sealed class SettingCloudshark
    {
        public readonly string? Apitoken;
        /// <summary>
        /// If using CS Enterprise
        /// </summary>
        public readonly string? Url;

        [OutputConstructor]
        private SettingCloudshark(
            string? apitoken,

            string? url)
        {
            Apitoken = apitoken;
            Url = url;
        }
    }
}
