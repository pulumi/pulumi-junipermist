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
    public sealed class NetworkInternetAccess
    {
        public readonly bool? CreateSimpleServicePolicy;
        /// <summary>
        /// Property key can be an External IP (i.e. "63.16.0.3"), an External IP:Port (i.e. "63.16.0.3:443"), an External Port (i.e. ":443"), an External CIDR (i.e. "63.16.0.0/30"), an External CIDR:Port (i.e. "63.16.0.0/30:443") or a Variable (i.e. "{{myvar}}"). At least one of the `internal_ip` or `port` must be defined
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.NetworkInternetAccessDestinationNat>? DestinationNat;
        public readonly bool? Enabled;
        /// <summary>
        /// By default, all access is allowed, to only allow certain traffic, make `restricted`=`true` and define service_policies
        /// </summary>
        public readonly bool? Restricted;
        /// <summary>
        /// Property key may be an External IP Address (i.e. "63.16.0.3"), a CIDR (i.e. "63.16.0.12/20") or a Variable (i.e. "{{myvar}}")
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.NetworkInternetAccessStaticNat>? StaticNat;

        [OutputConstructor]
        private NetworkInternetAccess(
            bool? createSimpleServicePolicy,

            ImmutableDictionary<string, Outputs.NetworkInternetAccessDestinationNat>? destinationNat,

            bool? enabled,

            bool? restricted,

            ImmutableDictionary<string, Outputs.NetworkInternetAccessStaticNat>? staticNat)
        {
            CreateSimpleServicePolicy = createSimpleServicePolicy;
            DestinationNat = destinationNat;
            Enabled = enabled;
            Restricted = restricted;
            StaticNat = staticNat;
        }
    }
}
