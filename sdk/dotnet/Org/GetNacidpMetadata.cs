// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org
{
    public static class GetNacidpMetadata
    {
        /// <summary>
        /// This data source provides the NAC IDP Metadata information.
        /// The provided information (`entity_id`, `acs_url`, `logout_url` and `metadata`) are the informationrequired to configure the IDP
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
        ///     var samlIdp = JuniperMist.Org.GetNacidpMetadata.Invoke(new()
        ///     {
        ///         OrgId = terraformTest.Id,
        ///         NacidpId = samlIdpOne.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetNacidpMetadataResult> InvokeAsync(GetNacidpMetadataArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNacidpMetadataResult>("junipermist:org/getNacidpMetadata:getNacidpMetadata", args ?? new GetNacidpMetadataArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the NAC IDP Metadata information.
        /// The provided information (`entity_id`, `acs_url`, `logout_url` and `metadata`) are the informationrequired to configure the IDP
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
        ///     var samlIdp = JuniperMist.Org.GetNacidpMetadata.Invoke(new()
        ///     {
        ///         OrgId = terraformTest.Id,
        ///         NacidpId = samlIdpOne.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetNacidpMetadataResult> Invoke(GetNacidpMetadataInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNacidpMetadataResult>("junipermist:org/getNacidpMetadata:getNacidpMetadata", args ?? new GetNacidpMetadataInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNacidpMetadataArgs : global::Pulumi.InvokeArgs
    {
        [Input("nacidpId", required: true)]
        public string NacidpId { get; set; } = null!;

        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        public GetNacidpMetadataArgs()
        {
        }
        public static new GetNacidpMetadataArgs Empty => new GetNacidpMetadataArgs();
    }

    public sealed class GetNacidpMetadataInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("nacidpId", required: true)]
        public Input<string> NacidpId { get; set; } = null!;

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        public GetNacidpMetadataInvokeArgs()
        {
        }
        public static new GetNacidpMetadataInvokeArgs Empty => new GetNacidpMetadataInvokeArgs();
    }


    [OutputType]
    public sealed class GetNacidpMetadataResult
    {
        public readonly string AcsUrl;
        public readonly string EntityId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string LogoutUrl;
        public readonly string Metadata;
        public readonly string NacidpId;
        public readonly string OrgId;

        [OutputConstructor]
        private GetNacidpMetadataResult(
            string acsUrl,

            string entityId,

            string id,

            string logoutUrl,

            string metadata,

            string nacidpId,

            string orgId)
        {
            AcsUrl = acsUrl;
            EntityId = entityId;
            Id = id;
            LogoutUrl = logoutUrl;
            Metadata = metadata;
            NacidpId = nacidpId;
            OrgId = orgId;
        }
    }
}