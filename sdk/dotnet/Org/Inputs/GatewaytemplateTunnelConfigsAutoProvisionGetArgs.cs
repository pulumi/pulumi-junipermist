// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplateTunnelConfigsAutoProvisionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        [Input("latlng")]
        public Input<Inputs.GatewaytemplateTunnelConfigsAutoProvisionLatlngGetArgs>? Latlng { get; set; }

        [Input("primary")]
        public Input<Inputs.GatewaytemplateTunnelConfigsAutoProvisionPrimaryGetArgs>? Primary { get; set; }

        [Input("secondary")]
        public Input<Inputs.GatewaytemplateTunnelConfigsAutoProvisionSecondaryGetArgs>? Secondary { get; set; }

        public GatewaytemplateTunnelConfigsAutoProvisionGetArgs()
        {
        }
        public static new GatewaytemplateTunnelConfigsAutoProvisionGetArgs Empty => new GatewaytemplateTunnelConfigsAutoProvisionGetArgs();
    }
}
