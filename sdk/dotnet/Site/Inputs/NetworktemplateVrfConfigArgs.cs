// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplateVrfConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to enable VRF (when supported on the device)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public NetworktemplateVrfConfigArgs()
        {
        }
        public static new NetworktemplateVrfConfigArgs Empty => new NetworktemplateVrfConfigArgs();
    }
}
