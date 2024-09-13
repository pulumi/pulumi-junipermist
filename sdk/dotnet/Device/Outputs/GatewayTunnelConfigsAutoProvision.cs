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
    public sealed class GatewayTunnelConfigsAutoProvision
    {
        public readonly bool? Enable;
        public readonly Outputs.GatewayTunnelConfigsAutoProvisionLatlng? Latlng;
        public readonly Outputs.GatewayTunnelConfigsAutoProvisionPrimary? Primary;
        public readonly Outputs.GatewayTunnelConfigsAutoProvisionSecondary? Secondary;

        [OutputConstructor]
        private GatewayTunnelConfigsAutoProvision(
            bool? enable,

            Outputs.GatewayTunnelConfigsAutoProvisionLatlng? latlng,

            Outputs.GatewayTunnelConfigsAutoProvisionPrimary? primary,

            Outputs.GatewayTunnelConfigsAutoProvisionSecondary? secondary)
        {
            Enable = enable;
            Latlng = latlng;
            Primary = primary;
            Secondary = secondary;
        }
    }
}
