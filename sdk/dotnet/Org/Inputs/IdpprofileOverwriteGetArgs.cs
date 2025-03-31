// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class IdpprofileOverwriteGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum:
        ///   * alert (default)
        ///   * drop: silently dropping packets
        ///   * close: notify client/server to close connection
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        [Input("matching")]
        public Input<Inputs.IdpprofileOverwriteMatchingGetArgs>? Matching { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public IdpprofileOverwriteGetArgs()
        {
        }
        public static new IdpprofileOverwriteGetArgs Empty => new IdpprofileOverwriteGetArgs();
    }
}
