// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class DeviceprofileApUplinkPortConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to do 802.1x against uplink switch. When enabled, AP cert will be used to do EAP-TLS and the Org's CA Cert has to be provisioned at the switch
        /// </summary>
        [Input("dot1x")]
        public Input<bool>? Dot1x { get; set; }

        /// <summary>
        /// By default, WLANs are disabled when uplink is down. In some scenario, like SiteSurvey, one would want the AP to keep sending beacons.
        /// </summary>
        [Input("keepWlansUpIfDown")]
        public Input<bool>? KeepWlansUpIfDown { get; set; }

        public DeviceprofileApUplinkPortConfigGetArgs()
        {
        }
        public static new DeviceprofileApUplinkPortConfigGetArgs Empty => new DeviceprofileApUplinkPortConfigGetArgs();
    }
}
