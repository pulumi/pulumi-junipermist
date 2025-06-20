// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Outputs
{

    [OutputType]
    public sealed class GetApStatsDeviceApStatUsbStatResult
    {
        public readonly int Channel;
        public readonly bool Connected;
        public readonly int LastActivity;
        public readonly string Type;
        public readonly bool Up;

        [OutputConstructor]
        private GetApStatsDeviceApStatUsbStatResult(
            int channel,

            bool connected,

            int lastActivity,

            string type,

            bool up)
        {
            Channel = channel;
            Connected = connected;
            LastActivity = lastActivity;
            Type = type;
            Up = up;
        }
    }
}
