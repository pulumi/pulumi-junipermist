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
    public sealed class GetWlansOrgWlanAppQosOtherResult
    {
        public readonly string Dscp;
        public readonly string DstSubnet;
        public readonly string PortRanges;
        public readonly string Protocol;
        public readonly string SrcSubnet;

        [OutputConstructor]
        private GetWlansOrgWlanAppQosOtherResult(
            string dscp,

            string dstSubnet,

            string portRanges,

            string protocol,

            string srcSubnet)
        {
            Dscp = dscp;
            DstSubnet = dstSubnet;
            PortRanges = portRanges;
            Protocol = protocol;
            SrcSubnet = srcSubnet;
        }
    }
}
