// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org
{
    public static class GetNetworks
    {
        /// <summary>
        /// This data source provides the list of WAN Assurance Networks.
        /// 
        /// The Networks are used in the `service_policies` from the Gateway configuration, Gateway templates or HUB Profiles
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
        ///     var networks = JuniperMist.Org.GetNetworks.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetNetworksResult> InvokeAsync(GetNetworksArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetworksResult>("junipermist:org/getNetworks:getNetworks", args ?? new GetNetworksArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the list of WAN Assurance Networks.
        /// 
        /// The Networks are used in the `service_policies` from the Gateway configuration, Gateway templates or HUB Profiles
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
        ///     var networks = JuniperMist.Org.GetNetworks.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetNetworksResult> Invoke(GetNetworksInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworksResult>("junipermist:org/getNetworks:getNetworks", args ?? new GetNetworksInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the list of WAN Assurance Networks.
        /// 
        /// The Networks are used in the `service_policies` from the Gateway configuration, Gateway templates or HUB Profiles
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
        ///     var networks = JuniperMist.Org.GetNetworks.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetNetworksResult> Invoke(GetNetworksInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworksResult>("junipermist:org/getNetworks:getNetworks", args ?? new GetNetworksInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetworksArgs : global::Pulumi.InvokeArgs
    {
        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        public GetNetworksArgs()
        {
        }
        public static new GetNetworksArgs Empty => new GetNetworksArgs();
    }

    public sealed class GetNetworksInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        public GetNetworksInvokeArgs()
        {
        }
        public static new GetNetworksInvokeArgs Empty => new GetNetworksInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetworksResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string OrgId;
        public readonly ImmutableArray<Outputs.GetNetworksOrgNetworkResult> OrgNetworks;

        [OutputConstructor]
        private GetNetworksResult(
            string id,

            string orgId,

            ImmutableArray<Outputs.GetNetworksOrgNetworkResult> orgNetworks)
        {
            Id = id;
            OrgId = orgId;
            OrgNetworks = orgNetworks;
        }
    }
}
