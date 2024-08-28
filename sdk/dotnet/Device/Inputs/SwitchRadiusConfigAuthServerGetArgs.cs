// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchRadiusConfigAuthServerGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ip / hostname of RADIUS server
        /// </summary>
        [Input("host", required: true)]
        public Input<string> Host { get; set; } = null!;

        [Input("keywrapEnabled")]
        public Input<bool>? KeywrapEnabled { get; set; }

        /// <summary>
        /// enum: `ascii`, `hex`
        /// </summary>
        [Input("keywrapFormat")]
        public Input<string>? KeywrapFormat { get; set; }

        [Input("keywrapKek")]
        public Input<string>? KeywrapKek { get; set; }

        [Input("keywrapMack")]
        public Input<string>? KeywrapMack { get; set; }

        /// <summary>
        /// Auth port of RADIUS server
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        [Input("secret", required: true)]
        private Input<string>? _secret;

        /// <summary>
        /// secret of RADIUS server
        /// </summary>
        public Input<string>? Secret
        {
            get => _secret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public SwitchRadiusConfigAuthServerGetArgs()
        {
        }
        public static new SwitchRadiusConfigAuthServerGetArgs Empty => new SwitchRadiusConfigAuthServerGetArgs();
    }
}