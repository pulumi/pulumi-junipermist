// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Outputs
{

    [OutputType]
    public sealed class NetworktemplatePortUsagesStormControl
    {
        /// <summary>
        /// Whether to disable storm control on broadcast traffic
        /// </summary>
        public readonly bool? NoBroadcast;
        /// <summary>
        /// Whether to disable storm control on multicast traffic
        /// </summary>
        public readonly bool? NoMulticast;
        /// <summary>
        /// Whether to disable storm control on registered multicast traffic
        /// </summary>
        public readonly bool? NoRegisteredMulticast;
        /// <summary>
        /// Whether to disable storm control on unknown unicast traffic
        /// </summary>
        public readonly bool? NoUnknownUnicast;
        /// <summary>
        /// Bandwidth-percentage, configures the storm control level as a percentage of the available bandwidth
        /// </summary>
        public readonly int? Percentage;

        [OutputConstructor]
        private NetworktemplatePortUsagesStormControl(
            bool? noBroadcast,

            bool? noMulticast,

            bool? noRegisteredMulticast,

            bool? noUnknownUnicast,

            int? percentage)
        {
            NoBroadcast = noBroadcast;
            NoMulticast = noMulticast;
            NoRegisteredMulticast = noRegisteredMulticast;
            NoUnknownUnicast = noUnknownUnicast;
            Percentage = percentage;
        }
    }
}
