// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayServicePolicyAntivirusGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// org-level AV Profile can be used, this takes precendence over 'profile'
        /// </summary>
        [Input("avprofileId")]
        public Input<string>? AvprofileId { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Default / noftp / httponly / or keys from av_profiles
        /// </summary>
        [Input("profile")]
        public Input<string>? Profile { get; set; }

        public GatewayServicePolicyAntivirusGetArgs()
        {
        }
        public static new GatewayServicePolicyAntivirusGetArgs Empty => new GatewayServicePolicyAntivirusGetArgs();
    }
}
