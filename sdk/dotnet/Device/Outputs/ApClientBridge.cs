// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Outputs
{

    [OutputType]
    public sealed class ApClientBridge
    {
        public readonly Outputs.ApClientBridgeAuth? Auth;
        /// <summary>
        /// When acted as client bridge:
        ///   * only 5G radio can be used
        ///   * will not serve as AP on any radios
        /// </summary>
        public readonly bool? Enabled;
        public readonly string? Ssid;

        [OutputConstructor]
        private ApClientBridge(
            Outputs.ApClientBridgeAuth? auth,

            bool? enabled,

            string? ssid)
        {
            Auth = auth;
            Enabled = enabled;
            Ssid = ssid;
        }
    }
}
