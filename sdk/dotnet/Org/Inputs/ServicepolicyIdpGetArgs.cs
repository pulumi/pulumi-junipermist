// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class ServicepolicyIdpGetArgs : global::Pulumi.ResourceArgs
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

        public ServicepolicyIdpGetArgs()
        {
        }
        public static new ServicepolicyIdpGetArgs Empty => new ServicepolicyIdpGetArgs();
    }
}
