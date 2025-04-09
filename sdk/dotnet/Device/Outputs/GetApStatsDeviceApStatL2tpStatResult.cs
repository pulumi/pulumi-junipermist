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
        /// List of sessions
        /// </summary>
        public readonly ImmutableArray<Outputs.GetApStatsDeviceApStatL2tpStatSessionResult> Sessions;
        /// <summary>
        /// enum: `established`, `established_with_session`, `idle`, `wait-ctrl-conn`, `wait-ctrl-reply`
        /// </summary>
        public readonly string State;
        /// <summary>
        /// Uptime
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
