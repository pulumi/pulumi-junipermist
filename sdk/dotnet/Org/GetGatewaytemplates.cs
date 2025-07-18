// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org
{
    public static class GetGatewaytemplates
    {
        /// <summary>
        /// This data source provides the list of Gateway Templates.
        /// 
        /// A Gateway template can be used to define generic gateway configuration at the org level and be applied to one or multiple Sites. It works like a blueprint of the network of the site.
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
        ///     var templates = JuniperMist.Org.GetGatewaytemplates.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetGatewaytemplatesResult> InvokeAsync(GetGatewaytemplatesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGatewaytemplatesResult>("junipermist:org/getGatewaytemplates:getGatewaytemplates", args ?? new GetGatewaytemplatesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the list of Gateway Templates.
        /// 
        /// A Gateway template can be used to define generic gateway configuration at the org level and be applied to one or multiple Sites. It works like a blueprint of the network of the site.
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
        ///     var templates = JuniperMist.Org.GetGatewaytemplates.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetGatewaytemplatesResult> Invoke(GetGatewaytemplatesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGatewaytemplatesResult>("junipermist:org/getGatewaytemplates:getGatewaytemplates", args ?? new GetGatewaytemplatesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the list of Gateway Templates.
        /// 
        /// A Gateway template can be used to define generic gateway configuration at the org level and be applied to one or multiple Sites. It works like a blueprint of the network of the site.
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
        ///     var templates = JuniperMist.Org.GetGatewaytemplates.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetGatewaytemplatesResult> Invoke(GetGatewaytemplatesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetGatewaytemplatesResult>("junipermist:org/getGatewaytemplates:getGatewaytemplates", args ?? new GetGatewaytemplatesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGatewaytemplatesArgs : global::Pulumi.InvokeArgs
    {
        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        public GetGatewaytemplatesArgs()
        {
        }
        public static new GetGatewaytemplatesArgs Empty => new GetGatewaytemplatesArgs();
    }

    public sealed class GetGatewaytemplatesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        public GetGatewaytemplatesInvokeArgs()
        {
        }
        public static new GetGatewaytemplatesInvokeArgs Empty => new GetGatewaytemplatesInvokeArgs();
    }


    [OutputType]
    public sealed class GetGatewaytemplatesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetGatewaytemplatesOrgGatewaytemplateResult> OrgGatewaytemplates;
        public readonly string OrgId;

        [OutputConstructor]
        private GetGatewaytemplatesResult(
            string id,

            ImmutableArray<Outputs.GetGatewaytemplatesOrgGatewaytemplateResult> orgGatewaytemplates,

            string orgId)
        {
            Id = id;
            OrgGatewaytemplates = orgGatewaytemplates;
            OrgId = orgId;
        }
    }
}
