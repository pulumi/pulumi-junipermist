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
    public sealed class GatewayRoutingPoliciesTermMatchingRouteExists
    {
        public readonly string? Route;
        /// <summary>
        /// name of the vrf instance
        /// it can also be the name of the VPN or wan if they
        /// </summary>
        public readonly string? VrfName;

        [OutputConstructor]
        private GatewayRoutingPoliciesTermMatchingRouteExists(
            string? route,

            string? vrfName)
        {
            Route = route;
            VrfName = vrfName;
        }
    }
}