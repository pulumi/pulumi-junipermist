// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingJuniperSrxGatewayArgs : global::Pulumi.ResourceArgs
    {
        [Input("apiKey")]
        public Input<string>? ApiKey { get; set; }

        [Input("apiUrl")]
        public Input<string>? ApiUrl { get; set; }

        public SettingJuniperSrxGatewayArgs()
        {
        }
        public static new SettingJuniperSrxGatewayArgs Empty => new SettingJuniperSrxGatewayArgs();
    }
}
