// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org
{
    public static class GetNacEndpoints
    {
        /// <summary>
        /// This data source provides the list of NAC Endpoints (User MACs).
        /// 
        /// NAC Endpoints (User MACs) provide a database of endpoints identified by their MAC addresses. They can be used assign each endpoint with various attributes, such as name, VLAN, role and client label.  Once an endpoint is labeled, the label name can be used to create `junipermist.org.Nactag` resource as match criteria.
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
        ///     var nacEndpoints = JuniperMist.Org.GetNacEndpoints.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///         Mac = "4a422a000000",
        ///         Labels = new[]
        ///         {
        ///             "label_one",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetNacEndpointsResult> InvokeAsync(GetNacEndpointsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNacEndpointsResult>("junipermist:org/getNacEndpoints:getNacEndpoints", args ?? new GetNacEndpointsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the list of NAC Endpoints (User MACs).
        /// 
        /// NAC Endpoints (User MACs) provide a database of endpoints identified by their MAC addresses. They can be used assign each endpoint with various attributes, such as name, VLAN, role and client label.  Once an endpoint is labeled, the label name can be used to create `junipermist.org.Nactag` resource as match criteria.
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
        ///     var nacEndpoints = JuniperMist.Org.GetNacEndpoints.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///         Mac = "4a422a000000",
        ///         Labels = new[]
        ///         {
        ///             "label_one",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetNacEndpointsResult> Invoke(GetNacEndpointsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNacEndpointsResult>("junipermist:org/getNacEndpoints:getNacEndpoints", args ?? new GetNacEndpointsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the list of NAC Endpoints (User MACs).
        /// 
        /// NAC Endpoints (User MACs) provide a database of endpoints identified by their MAC addresses. They can be used assign each endpoint with various attributes, such as name, VLAN, role and client label.  Once an endpoint is labeled, the label name can be used to create `junipermist.org.Nactag` resource as match criteria.
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
        ///     var nacEndpoints = JuniperMist.Org.GetNacEndpoints.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///         Mac = "4a422a000000",
        ///         Labels = new[]
        ///         {
        ///             "label_one",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetNacEndpointsResult> Invoke(GetNacEndpointsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetNacEndpointsResult>("junipermist:org/getNacEndpoints:getNacEndpoints", args ?? new GetNacEndpointsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNacEndpointsArgs : global::Pulumi.InvokeArgs
    {
        [Input("labels")]
        private List<string>? _labels;

        /// <summary>
        /// Optional, array of strings of labels
        /// </summary>
        public List<string> Labels
        {
            get => _labels ?? (_labels = new List<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Partial/full MAC address
        /// </summary>
        [Input("mac")]
        public string? Mac { get; set; }

        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        public GetNacEndpointsArgs()
        {
        }
        public static new GetNacEndpointsArgs Empty => new GetNacEndpointsArgs();
    }

    public sealed class GetNacEndpointsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("labels")]
        private InputList<string>? _labels;

        /// <summary>
        /// Optional, array of strings of labels
        /// </summary>
        public InputList<string> Labels
        {
            get => _labels ?? (_labels = new InputList<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Partial/full MAC address
        /// </summary>
        [Input("mac")]
        public Input<string>? Mac { get; set; }

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        public GetNacEndpointsInvokeArgs()
        {
        }
        public static new GetNacEndpointsInvokeArgs Empty => new GetNacEndpointsInvokeArgs();
    }


    [OutputType]
    public sealed class GetNacEndpointsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Optional, array of strings of labels
        /// </summary>
        public readonly ImmutableArray<string> Labels;
        /// <summary>
        /// Partial/full MAC address
        /// </summary>
        public readonly string? Mac;
        public readonly string OrgId;
        public readonly ImmutableArray<Outputs.GetNacEndpointsOrgUsermacResult> OrgUsermacs;

        [OutputConstructor]
        private GetNacEndpointsResult(
            string id,

            ImmutableArray<string> labels,

            string? mac,

            string orgId,

            ImmutableArray<Outputs.GetNacEndpointsOrgUsermacResult> orgUsermacs)
        {
            Id = id;
            Labels = labels;
            Mac = mac;
            OrgId = orgId;
            OrgUsermacs = orgUsermacs;
        }
    }
}
