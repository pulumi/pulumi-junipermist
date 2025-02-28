// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class WlanAirwatchGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// API Key
        /// </summary>
        [Input("apiKey")]
        public Input<string>? ApiKey { get; set; }

        /// <summary>
        /// Console URL
        /// </summary>
        [Input("consoleUrl")]
        public Input<string>? ConsoleUrl { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// Password
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Username
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public WlanAirwatchGetArgs()
        {
        }
        public static new WlanAirwatchGetArgs Empty => new WlanAirwatchGetArgs();
    }
}
