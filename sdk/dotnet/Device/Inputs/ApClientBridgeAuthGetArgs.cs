// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class ApClientBridgeAuthGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("psk")]
        private Input<string>? _psk;
        public Input<string>? Psk
        {
            get => _psk;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _psk = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// wpa2-AES/CCMPp is assumed when `type`==`psk`. enum: `open`, `psk`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ApClientBridgeAuthGetArgs()
        {
        }
        public static new ApClientBridgeAuthGetArgs Empty => new ApClientBridgeAuthGetArgs();
    }
}