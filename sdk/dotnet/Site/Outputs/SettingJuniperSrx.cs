// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Outputs
{

    [OutputType]
    public sealed class SettingJuniperSrx
    {
        public readonly ImmutableArray<Outputs.SettingJuniperSrxGateway> Gateways;
        public readonly bool? SendMistNacUserInfo;

        [OutputConstructor]
        private SettingJuniperSrx(
            ImmutableArray<Outputs.SettingJuniperSrxGateway> gateways,

            bool? sendMistNacUserInfo)
        {
            Gateways = gateways;
            SendMistNacUserInfo = sendMistNacUserInfo;
        }
    }
}
