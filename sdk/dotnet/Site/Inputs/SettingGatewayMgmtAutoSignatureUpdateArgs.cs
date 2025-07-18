// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingGatewayMgmtAutoSignatureUpdateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `any`, `fri`, `mon`, `sat`, `sun`, `thu`, `tue`, `wed`
        /// </summary>
        [Input("dayOfWeek")]
        public Input<string>? DayOfWeek { get; set; }

        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        /// <summary>
        /// Optional, Mist will decide the timing
        /// </summary>
        [Input("timeOfDay")]
        public Input<string>? TimeOfDay { get; set; }

        public SettingGatewayMgmtAutoSignatureUpdateArgs()
        {
        }
        public static new SettingGatewayMgmtAutoSignatureUpdateArgs Empty => new SettingGatewayMgmtAutoSignatureUpdateArgs();
    }
}
