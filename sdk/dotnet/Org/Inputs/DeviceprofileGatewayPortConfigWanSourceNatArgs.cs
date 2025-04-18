// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class DeviceprofileGatewayPortConfigWanSourceNatArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Or to disable the source-nat
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// If alternative nat_pool is desired
        /// </summary>
        [Input("natPool")]
        public Input<string>? NatPool { get; set; }

        public DeviceprofileGatewayPortConfigWanSourceNatArgs()
        {
        }
        public static new DeviceprofileGatewayPortConfigWanSourceNatArgs Empty => new DeviceprofileGatewayPortConfigWanSourceNatArgs();
    }
}
