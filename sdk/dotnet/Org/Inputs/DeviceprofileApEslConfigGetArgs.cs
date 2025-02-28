// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class DeviceprofileApEslConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Only if `type`==`imagotag` or `type`==`native`
        /// </summary>
        [Input("cacert")]
        public Input<string>? Cacert { get; set; }

        /// <summary>
        /// Only if `type`==`imagotag` or `type`==`native`
        /// </summary>
        [Input("channel")]
        public Input<int>? Channel { get; set; }

        /// <summary>
        /// usb_config is ignored if esl_config enabled
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Only if `type`==`imagotag` or `type`==`native`
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// Only if `type`==`imagotag` or `type`==`native`
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// note: ble_config will be ingored if esl_config is enabled and with native mode. enum: `hanshow`, `imagotag`, `native`, `solum`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Only if `type`==`imagotag` or `type`==`native`
        /// </summary>
        [Input("verifyCert")]
        public Input<bool>? VerifyCert { get; set; }

        /// <summary>
        /// Only if `type`==`solum` or `type`==`hanshow`
        /// </summary>
        [Input("vlanId")]
        public Input<int>? VlanId { get; set; }

        public DeviceprofileApEslConfigGetArgs()
        {
        }
        public static new DeviceprofileApEslConfigGetArgs Empty => new DeviceprofileApEslConfigGetArgs();
    }
}
