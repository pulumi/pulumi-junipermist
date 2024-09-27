// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class ApitokenPrivilegeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// access permissions. enum: `admin`, `helpdesk`, `installer`, `read`, `write`
        /// </summary>
        [Input("role", required: true)]
        public Input<string> Role { get; set; } = null!;

        /// <summary>
        /// enum: `org`, `site`, `sitegroup`
        /// </summary>
        [Input("scope", required: true)]
        public Input<string> Scope { get; set; } = null!;

        /// <summary>
        /// Required if `scope`==`site`
        /// </summary>
        [Input("siteId")]
        public Input<string>? SiteId { get; set; }

        /// <summary>
        /// Required if `scope`==`sitegroup`
        /// </summary>
        [Input("sitegroupId")]
        public Input<string>? SitegroupId { get; set; }

        public ApitokenPrivilegeGetArgs()
        {
        }
        public static new ApitokenPrivilegeGetArgs Empty => new ApitokenPrivilegeGetArgs();
    }
}
