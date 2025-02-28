// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayServicePolicyIdpArgs : global::Pulumi.ResourceArgs
    {
        [Input("alertOnly")]
        public Input<bool>? AlertOnly { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// org_level IDP Profile can be used, this takes precedence over `profile`
        /// </summary>
        [Input("idpprofileId")]
        public Input<string>? IdpprofileId { get; set; }

        /// <summary>
        /// enum: `Custom`, `strict` (default), `standard` or keys from idp_profiles
        /// </summary>
        [Input("profile")]
        public Input<string>? Profile { get; set; }

        public GatewayServicePolicyIdpArgs()
        {
        }
        public static new GatewayServicePolicyIdpArgs Empty => new GatewayServicePolicyIdpArgs();
    }
}
