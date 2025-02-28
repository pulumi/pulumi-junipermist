// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplatePortUsagesStormControlArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to disable storm control on broadcast traffic
        /// </summary>
        [Input("noBroadcast")]
        public Input<bool>? NoBroadcast { get; set; }

        /// <summary>
        /// Whether to disable storm control on multicast traffic
        /// </summary>
        [Input("noMulticast")]
        public Input<bool>? NoMulticast { get; set; }

        /// <summary>
        /// Whether to disable storm control on registered multicast traffic
        /// </summary>
        [Input("noRegisteredMulticast")]
        public Input<bool>? NoRegisteredMulticast { get; set; }

        /// <summary>
        /// Whether to disable storm control on unknown unicast traffic
        /// </summary>
        [Input("noUnknownUnicast")]
        public Input<bool>? NoUnknownUnicast { get; set; }

        /// <summary>
        /// Bandwidth-percentage, configures the storm control level as a percentage of the available bandwidth
        /// </summary>
        [Input("percentage")]
        public Input<int>? Percentage { get; set; }

        public NetworktemplatePortUsagesStormControlArgs()
        {
        }
        public static new NetworktemplatePortUsagesStormControlArgs Empty => new NetworktemplatePortUsagesStormControlArgs();
    }
}
