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
    public sealed class NetworktemplateSnmpConfigV3ConfigTargetAddress
    {
        public readonly string? Address;
        public readonly string? AddressMask;
        public readonly int? Port;
        /// <summary>
        /// &lt;refer to notify tag, can be multiple with blank
        /// </summary>
        public readonly string? TagList;
        public readonly string? TargetAddressName;
        /// <summary>
        /// refer to notify target parameters name
        /// </summary>
        public readonly string? TargetParameters;

        [OutputConstructor]
        private NetworktemplateSnmpConfigV3ConfigTargetAddress(
            string? address,

            string? addressMask,

            int? port,

            string? tagList,

            string? targetAddressName,

            string? targetParameters)
        {
            Address = address;
            AddressMask = addressMask;
            Port = port;
            TagList = tagList;
            TargetAddressName = targetAddressName;
            TargetParameters = targetParameters;
        }
    }
}