// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site
{
    public static class GetPsks
    {
        /// <summary>
        /// This data source provides the list of WAN Assurance Psks.The Psks are used in the `service_policies` from the Gateway configuration and Gateway templates
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
        ///     var psksVip = JuniperMist.Site.GetPsks.Invoke(new()
        ///     {
        ///         SiteId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///         Role = "vip",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetPsksResult> InvokeAsync(GetPsksArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPsksResult>("junipermist:site/getPsks:getPsks", args ?? new GetPsksArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the list of WAN Assurance Psks.The Psks are used in the `service_policies` from the Gateway configuration and Gateway templates
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
        ///     var psksVip = JuniperMist.Site.GetPsks.Invoke(new()
        ///     {
        ///         SiteId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///         Role = "vip",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPsksResult> Invoke(GetPsksInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPsksResult>("junipermist:site/getPsks:getPsks", args ?? new GetPsksInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPsksArgs : global::Pulumi.InvokeArgs
    {
        [Input("limit")]
        public int? Limit { get; set; }

        [Input("name")]
        public string? Name { get; set; }

        [Input("page")]
        public int? Page { get; set; }

        [Input("role")]
        public string? Role { get; set; }

        [Input("siteId", required: true)]
        public string SiteId { get; set; } = null!;

        [Input("ssid")]
        public string? Ssid { get; set; }

        public GetPsksArgs()
        {
        }
        public static new GetPsksArgs Empty => new GetPsksArgs();
    }

    public sealed class GetPsksInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("limit")]
        public Input<int>? Limit { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("page")]
        public Input<int>? Page { get; set; }

        [Input("role")]
        public Input<string>? Role { get; set; }

        [Input("siteId", required: true)]
        public Input<string> SiteId { get; set; } = null!;

        [Input("ssid")]
        public Input<string>? Ssid { get; set; }

        public GetPsksInvokeArgs()
        {
        }
        public static new GetPsksInvokeArgs Empty => new GetPsksInvokeArgs();
    }


    [OutputType]
    public sealed class GetPsksResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly int? Limit;
        public readonly string? Name;
        public readonly int? Page;
        public readonly string? Role;
        public readonly string SiteId;
        public readonly ImmutableArray<Outputs.GetPsksSitePskResult> SitePsks;
        public readonly string? Ssid;

        [OutputConstructor]
        private GetPsksResult(
            string id,

            int? limit,

            string? name,

            int? page,

            string? role,

            string siteId,

            ImmutableArray<Outputs.GetPsksSitePskResult> sitePsks,

            string? ssid)
        {
            Id = id;
            Limit = limit;
            Name = name;
            Page = page;
            Role = role;
            SiteId = siteId;
            SitePsks = sitePsks;
            Ssid = ssid;
        }
    }
}
