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
    public sealed class GetWlansOrgWlanAppQosAppsResult
    {
        public readonly int Dscp;
        /// <summary>
        /// Subnet filter is not required but helps AP to only inspect certain traffic (thus reducing AP load)
        /// </summary>
        public readonly string DstSubnet;
        /// <summary>
        /// Subnet filter is not required but helps AP to only inspect certain traffic (thus reducing AP load)
        /// </summary>
        public readonly string SrcSubnet;

        [OutputConstructor]
        private GetWlansOrgWlanAppQosAppsResult(
            int dscp,

            string dstSubnet,

            string srcSubnet)
        {
            Dscp = dscp;
            DstSubnet = dstSubnet;
            SrcSubnet = srcSubnet;
        }
    }
}
