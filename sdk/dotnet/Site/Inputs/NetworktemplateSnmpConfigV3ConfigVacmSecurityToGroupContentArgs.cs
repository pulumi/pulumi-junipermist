// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplateSnmpConfigV3ConfigVacmSecurityToGroupContentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Refer to group_name under access
        /// </summary>
        [Input("group")]
        public Input<string>? Group { get; set; }

        [Input("securityName")]
        public Input<string>? SecurityName { get; set; }

        public NetworktemplateSnmpConfigV3ConfigVacmSecurityToGroupContentArgs()
        {
        }
        public static new NetworktemplateSnmpConfigV3ConfigVacmSecurityToGroupContentArgs Empty => new NetworktemplateSnmpConfigV3ConfigVacmSecurityToGroupContentArgs();
    }
}
