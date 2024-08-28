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
    public sealed class ApEslConfig
    {
        /// <summary>
        /// Only if `type`==`imagotag` or `type`==`native`
        /// </summary>
        public readonly string? Cacert;
        /// <summary>
        /// Only if `type`==`imagotag` or `type`==`native`
        /// </summary>
        public readonly int? Channel;
        /// <summary>
        /// usb_config is ignored if esl_config enabled
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Only if `type`==`imagotag` or `type`==`native`
        /// </summary>
        public readonly string? Host;
        /// <summary>
        /// Only if `type`==`imagotag` or `type`==`native`
        /// </summary>
        public readonly int? Port;
        /// <summary>
        /// note: ble_config will be ingored if esl_config is enabled and with native mode. enum: `hanshow`, `imagotag`, `native`, `solum`
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// Only if `type`==`imagotag` or `type`==`native`
        /// </summary>
        public readonly bool? VerifyCert;
        /// <summary>
        /// Only if `type`==`solum` or `type`==`hanshow`
        /// </summary>
        public readonly int? VlanId;

        [OutputConstructor]
        private ApEslConfig(
            string? cacert,

            int? channel,

            bool? enabled,

            string? host,

            int? port,

            string? type,

            bool? verifyCert,

            int? vlanId)
        {
            Cacert = cacert;
            Channel = channel;
            Enabled = enabled;
            Host = host;
            Port = port;
            Type = type;
            VerifyCert = verifyCert;
            VlanId = vlanId;
        }
    }
}