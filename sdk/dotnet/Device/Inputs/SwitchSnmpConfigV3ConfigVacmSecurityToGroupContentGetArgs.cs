// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchSnmpConfigV3ConfigVacmSecurityToGroupContentGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Refer to group_name under access
        /// </summary>
        [Input("group")]
        public Input<string>? Group { get; set; }

        [Input("securityName")]
        public Input<string>? SecurityName { get; set; }

        public SwitchSnmpConfigV3ConfigVacmSecurityToGroupContentGetArgs()
        {
        }
        public static new SwitchSnmpConfigV3ConfigVacmSecurityToGroupContentGetArgs Empty => new SwitchSnmpConfigV3ConfigVacmSecurityToGroupContentGetArgs();
    }
}
