// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class NetworkVpnAccessStaticNatGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Static NAT destination IP Address. Must be an IP Address (i.e. "192.168.70.3") or a Variable (i.e. "{{myvar}}")
        /// </summary>
        [Input("internalIp", required: true)]
        public Input<string> InternalIp { get; set; } = null!;

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public NetworkVpnAccessStaticNatGetArgs()
        {
        }
        public static new NetworkVpnAccessStaticNatGetArgs Empty => new NetworkVpnAccessStaticNatGetArgs();
    }
}
