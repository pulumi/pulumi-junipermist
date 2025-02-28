// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingSkyatpArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Whether to send IP-MAC mapping to SkyATP
        /// </summary>
        [Input("sendIpMacMapping")]
        public Input<bool>? SendIpMacMapping { get; set; }

        public SettingSkyatpArgs()
        {
        }
        public static new SettingSkyatpArgs Empty => new SettingSkyatpArgs();
    }
}
