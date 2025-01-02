// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayTunnelConfigsAutoProvisionArgs : global::Pulumi.ResourceArgs
    {
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        /// <summary>
        /// API override for POP selection
        /// </summary>
        [Input("latlng")]
        public Input<Inputs.GatewayTunnelConfigsAutoProvisionLatlngArgs>? Latlng { get; set; }

        [Input("primary")]
        public Input<Inputs.GatewayTunnelConfigsAutoProvisionPrimaryArgs>? Primary { get; set; }

        /// <summary>
        /// enum: `jse-ipsec`, `zscaler-ipsec`
        /// </summary>
        [Input("provider", required: true)]
        public Input<string> Provider { get; set; } = null!;

        /// <summary>
        /// API override for POP selection
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("secondary")]
        public Input<Inputs.GatewayTunnelConfigsAutoProvisionSecondaryArgs>? Secondary { get; set; }

        public GatewayTunnelConfigsAutoProvisionArgs()
        {
        }
        public static new GatewayTunnelConfigsAutoProvisionArgs Empty => new GatewayTunnelConfigsAutoProvisionArgs();
    }
}
