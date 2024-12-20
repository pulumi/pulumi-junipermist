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
    public sealed class GetApStatsDeviceApStatL2tpStatResult
    {
        /// <summary>
        /// list of sessions
        /// </summary>
        public readonly ImmutableArray<Outputs.GetApStatsDeviceApStatL2tpStatSessionResult> Sessions;
        public readonly string State;
        /// <summary>
        /// uptime
        /// </summary>
        public readonly int Uptime;
        /// <summary>
        /// WxlanTunnel ID
        /// </summary>
        public readonly string WxtunnelId;

        [OutputConstructor]
        private GetApStatsDeviceApStatL2tpStatResult(
            ImmutableArray<Outputs.GetApStatsDeviceApStatL2tpStatSessionResult> sessions,

            string state,

            int uptime,

            string wxtunnelId)
        {
            Sessions = sessions;
            State = state;
            Uptime = uptime;
            WxtunnelId = wxtunnelId;
        }
    }
}
