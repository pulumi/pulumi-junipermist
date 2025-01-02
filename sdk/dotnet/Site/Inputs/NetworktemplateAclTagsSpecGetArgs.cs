// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplateAclTagsSpecGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// matched dst port, "0" means any
        /// </summary>
        [Input("portRange")]
        public Input<string>? PortRange { get; set; }

        /// <summary>
        /// `tcp` / `udp` / `icmp` / `icmp6` / `gre` / `any` / `:protocol_number`, `protocol_number` is between 1-254, default is `any` `protocol_number` is between 1-254
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        public NetworktemplateAclTagsSpecGetArgs()
        {
        }
        public static new NetworktemplateAclTagsSpecGetArgs Empty => new NetworktemplateAclTagsSpecGetArgs();
    }
}
