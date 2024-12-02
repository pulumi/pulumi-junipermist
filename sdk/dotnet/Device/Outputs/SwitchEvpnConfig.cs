// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Outputs
{

    [OutputType]
    public sealed class SwitchEvpnConfig
    {
        public readonly bool? Enabled;
        /// <summary>
        /// enum: `access`, `collapsed-core`, `core`, `distribution`, `esilag-access`, `none`
        /// </summary>
        public readonly string? Role;

        [OutputConstructor]
        private SwitchEvpnConfig(
            bool? enabled,

            string? role)
        {
            Enabled = enabled;
            Role = role;
        }
    }
}
