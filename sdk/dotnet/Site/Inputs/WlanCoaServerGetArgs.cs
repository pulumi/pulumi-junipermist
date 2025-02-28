// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class WlanCoaServerGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to disable Event-Timestamp Check
        /// </summary>
        [Input("disableEventTimestampCheck")]
        public Input<bool>? DisableEventTimestampCheck { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("ip", required: true)]
        public Input<string> Ip { get; set; } = null!;

        [Input("port")]
        public Input<int>? Port { get; set; }

        [Input("secret", required: true)]
        private Input<string>? _secret;
        public Input<string>? Secret
        {
            get => _secret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public WlanCoaServerGetArgs()
        {
        }
        public static new WlanCoaServerGetArgs Empty => new WlanCoaServerGetArgs();
    }
}
