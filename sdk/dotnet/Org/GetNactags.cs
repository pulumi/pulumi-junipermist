// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org
{
    public static class GetNactags
    {
        /// <summary>
        /// This data source provides the list of NAC Tags (Auth Policy Labels).
        /// The NAC Tags can be used in the NAC Rules to define the matching criterias or the returned RADIUS Attributes
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
        ///     var nactags = JuniperMist.Org.GetNactags.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetNactagsResult> InvokeAsync(GetNactagsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNactagsResult>("junipermist:org/getNactags:getNactags", args ?? new GetNactagsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the list of NAC Tags (Auth Policy Labels).
        /// The NAC Tags can be used in the NAC Rules to define the matching criterias or the returned RADIUS Attributes
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
        ///     var nactags = JuniperMist.Org.GetNactags.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetNactagsResult> Invoke(GetNactagsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNactagsResult>("junipermist:org/getNactags:getNactags", args ?? new GetNactagsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNactagsArgs : global::Pulumi.InvokeArgs
    {
        [Input("limit")]
        public int? Limit { get; set; }

        [Input("match")]
        public string? Match { get; set; }

        [Input("name")]
        public string? Name { get; set; }

        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        [Input("page")]
        public int? Page { get; set; }

        [Input("type")]
        public string? Type { get; set; }

        public GetNactagsArgs()
        {
        }
        public static new GetNactagsArgs Empty => new GetNactagsArgs();
    }

    public sealed class GetNactagsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("limit")]
        public Input<int>? Limit { get; set; }

        [Input("match")]
        public Input<string>? Match { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        [Input("page")]
        public Input<int>? Page { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        public GetNactagsInvokeArgs()
        {
        }
        public static new GetNactagsInvokeArgs Empty => new GetNactagsInvokeArgs();
    }


    [OutputType]
    public sealed class GetNactagsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly int? Limit;
        public readonly string? Match;
        public readonly string? Name;
        public readonly string OrgId;
        public readonly ImmutableArray<Outputs.GetNactagsOrgNactagResult> OrgNactags;
        public readonly int? Page;
        public readonly string? Type;

        [OutputConstructor]
        private GetNactagsResult(
            string id,

            int? limit,

            string? match,

            string? name,

            string orgId,

            ImmutableArray<Outputs.GetNactagsOrgNactagResult> orgNactags,

            int? page,

            string? type)
        {
            Id = id;
            Limit = limit;
            Match = match;
            Name = name;
            OrgId = orgId;
            OrgNactags = orgNactags;
            Page = page;
            Type = type;
        }
    }
}