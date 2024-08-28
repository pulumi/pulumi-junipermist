// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class DeviceprofileGatewayTunnelConfigsAutoProvisionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        [Input("latlng")]
        public Input<Inputs.DeviceprofileGatewayTunnelConfigsAutoProvisionLatlngGetArgs>? Latlng { get; set; }

        [Input("primary")]
        public Input<Inputs.DeviceprofileGatewayTunnelConfigsAutoProvisionPrimaryGetArgs>? Primary { get; set; }

        /// <summary>
        /// enum: `APAC`, `Americas`, `EMEA`, `auto`
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("secondary")]
        public Input<Inputs.DeviceprofileGatewayTunnelConfigsAutoProvisionSecondaryGetArgs>? Secondary { get; set; }

        public DeviceprofileGatewayTunnelConfigsAutoProvisionGetArgs()
        {
        }
        public static new DeviceprofileGatewayTunnelConfigsAutoProvisionGetArgs Empty => new DeviceprofileGatewayTunnelConfigsAutoProvisionGetArgs();
    }
}