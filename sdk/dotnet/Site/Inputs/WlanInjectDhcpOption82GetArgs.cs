// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class WlanInjectDhcpOption82GetArgs : global::Pulumi.ResourceArgs
    {
        [Input("circuitId")]
        public Input<string>? CircuitId { get; set; }

        /// <summary>
        /// whether to inject option 82 when forwarding DHCP packets
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public WlanInjectDhcpOption82GetArgs()
        {
        }
        public static new WlanInjectDhcpOption82GetArgs Empty => new WlanInjectDhcpOption82GetArgs();
    }
}