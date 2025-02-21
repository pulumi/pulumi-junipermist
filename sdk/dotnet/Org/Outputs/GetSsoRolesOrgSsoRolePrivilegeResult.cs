// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Outputs
{

    [OutputType]
    public sealed class GetSsoRolesOrgSsoRolePrivilegeResult
    {
        /// <summary>
        /// access permissions. enum: `admin`, `helpdesk`, `installer`, `read`, `write`
        /// </summary>
        public readonly string Role;
        /// <summary>
        /// enum: `org`, `site`, `sitegroup`
        /// </summary>
        public readonly string Scope;
        /// <summary>
        /// If `scope`==`site`
        /// </summary>
        public readonly string SiteId;
        /// <summary>
        /// If `scope`==`sitegroup`
        /// </summary>
        public readonly string SitegroupId;
        /// <summary>
        /// Custom roles restrict Org users to specific UI views. This is useful for limiting UI access of Org users. Custom roles restrict Org users to specific UI views. This is useful for limiting UI access of Org users.  
        /// You can define custom roles by adding the `views` attribute along with `role` when assigning privileges.  
        /// Below are the list of supported UI views. Note that this is UI only feature.  
        /// 
        ///   | UI View | Required Role | Description |
        ///   | --- | --- | --- |
        ///   | `reporting` | `read` | full access to all analytics tools |
        ///   | `marketing` | `read` | can view analytics and location maps |
        ///   | `super_observer` | `read` | can view all the organization except the subscription page |
        ///   | `location` | `write` | can view and manage location maps, can view analytics |
        ///   | `security` | `write` | can view and manage site labels, policies and security |
        ///   | `switch_admin` | `helpdesk` | can view and manage Switch ports, can view wired clients |
        ///   | `mxedge_admin` | `admin` | can view and manage Mist edges and Mist tunnels |
        ///   | `lobby_admin` | `admin` | full access to Org and Site Pre-shared keys |
        /// </summary>
        public readonly ImmutableArray<string> Views;

        [OutputConstructor]
        private GetSsoRolesOrgSsoRolePrivilegeResult(
            string role,

            string scope,

            string siteId,

            string sitegroupId,

            ImmutableArray<string> views)
        {
            Role = role;
            Scope = scope;
            SiteId = siteId;
            SitegroupId = sitegroupId;
            Views = views;
        }
    }
}
