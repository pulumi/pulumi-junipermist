// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchEvpnConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// enum: `access`, `collapsed-core`, `core`, `distribution`, `esilag-access`, `none`
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        public SwitchEvpnConfigGetArgs()
        {
        }
        public static new SwitchEvpnConfigGetArgs Empty => new SwitchEvpnConfigGetArgs();
    }
}
