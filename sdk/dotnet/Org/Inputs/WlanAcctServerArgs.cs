// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class WlanAcctServerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IP/ hostname of RADIUS server
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
        /// Acct port of RADIUS server
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        [Input("secret", required: true)]
        private Input<string>? _secret;

        /// <summary>
        /// Secretof RADIUS server
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

        public WlanAcctServerArgs()
        {
        }
        public static new WlanAcctServerArgs Empty => new WlanAcctServerArgs();
    }
}
