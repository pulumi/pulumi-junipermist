// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org
{
    public static class GetSsoRoles
    {
        /// <summary>
        /// This resource provides the list of SSO Roles.
        /// 
        /// SSO roles refer to the different functions assigned to users within a Single Sign-On (SSO) system.  
        /// These roles determine the tasks and actions that users can perform within the SSO system. There are typically predefined roles and custom roles in an SSO system.  
        /// Roles in SSO provide a well-defined separation of responsibility and visibility, allowing for granular-level access control on SSO objects.
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using JuniperMist = Pulumi.JuniperMist;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ssoRoles = JuniperMist.Org.GetSsoRoles.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetSsoRolesResult> InvokeAsync(GetSsoRolesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSsoRolesResult>("junipermist:org/getSsoRoles:getSsoRoles", args ?? new GetSsoRolesArgs(), options.WithDefaults());

        /// <summary>
        /// This resource provides the list of SSO Roles.
        /// 
        /// SSO roles refer to the different functions assigned to users within a Single Sign-On (SSO) system.  
        /// These roles determine the tasks and actions that users can perform within the SSO system. There are typically predefined roles and custom roles in an SSO system.  
        /// Roles in SSO provide a well-defined separation of responsibility and visibility, allowing for granular-level access control on SSO objects.
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using JuniperMist = Pulumi.JuniperMist;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ssoRoles = JuniperMist.Org.GetSsoRoles.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSsoRolesResult> Invoke(GetSsoRolesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSsoRolesResult>("junipermist:org/getSsoRoles:getSsoRoles", args ?? new GetSsoRolesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This resource provides the list of SSO Roles.
        /// 
        /// SSO roles refer to the different functions assigned to users within a Single Sign-On (SSO) system.  
        /// These roles determine the tasks and actions that users can perform within the SSO system. There are typically predefined roles and custom roles in an SSO system.  
        /// Roles in SSO provide a well-defined separation of responsibility and visibility, allowing for granular-level access control on SSO objects.
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using JuniperMist = Pulumi.JuniperMist;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ssoRoles = JuniperMist.Org.GetSsoRoles.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSsoRolesResult> Invoke(GetSsoRolesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSsoRolesResult>("junipermist:org/getSsoRoles:getSsoRoles", args ?? new GetSsoRolesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSsoRolesArgs : global::Pulumi.InvokeArgs
    {
        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        public GetSsoRolesArgs()
        {
        }
        public static new GetSsoRolesArgs Empty => new GetSsoRolesArgs();
    }

    public sealed class GetSsoRolesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        public GetSsoRolesInvokeArgs()
        {
        }
        public static new GetSsoRolesInvokeArgs Empty => new GetSsoRolesInvokeArgs();
    }


    [OutputType]
    public sealed class GetSsoRolesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string OrgId;
        public readonly ImmutableArray<Outputs.GetSsoRolesOrgSsoRoleResult> OrgSsoRoles;

        [OutputConstructor]
        private GetSsoRolesResult(
            string id,

            string orgId,

            ImmutableArray<Outputs.GetSsoRolesOrgSsoRoleResult> orgSsoRoles)
        {
            Id = id;
            OrgId = orgId;
            OrgSsoRoles = orgSsoRoles;
        }
    }
}
