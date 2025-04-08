// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplateIdpProfilesOverwriteArgs : global::Pulumi.ResourceArgs
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
        public Input<Inputs.GatewaytemplateIdpProfilesOverwriteMatchingArgs>? Matching { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        public GatewaytemplateIdpProfilesOverwriteArgs()
        {
        }
        public static new GatewaytemplateIdpProfilesOverwriteArgs Empty => new GatewaytemplateIdpProfilesOverwriteArgs();
    }
}
