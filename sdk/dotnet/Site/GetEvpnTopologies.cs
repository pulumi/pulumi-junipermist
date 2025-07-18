// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site
{
    public static class GetEvpnTopologies
    {
        /// <summary>
        /// This data source provides the list of Site Evpn Topologies
        /// 
        /// EVPN allows an alternative but more efficient LAN architecture utilizing VxLAN / MP-BGP to separate the control plane (MAC / IP Learning) from the forwarding plane.
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
        ///     var siteEvpnTopologies = JuniperMist.Site.GetEvpnTopologies.Invoke(new()
        ///     {
        ///         SiteId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetEvpnTopologiesResult> InvokeAsync(GetEvpnTopologiesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEvpnTopologiesResult>("junipermist:site/getEvpnTopologies:getEvpnTopologies", args ?? new GetEvpnTopologiesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the list of Site Evpn Topologies
        /// 
        /// EVPN allows an alternative but more efficient LAN architecture utilizing VxLAN / MP-BGP to separate the control plane (MAC / IP Learning) from the forwarding plane.
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
        ///     var siteEvpnTopologies = JuniperMist.Site.GetEvpnTopologies.Invoke(new()
        ///     {
        ///         SiteId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetEvpnTopologiesResult> Invoke(GetEvpnTopologiesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEvpnTopologiesResult>("junipermist:site/getEvpnTopologies:getEvpnTopologies", args ?? new GetEvpnTopologiesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the list of Site Evpn Topologies
        /// 
        /// EVPN allows an alternative but more efficient LAN architecture utilizing VxLAN / MP-BGP to separate the control plane (MAC / IP Learning) from the forwarding plane.
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
        ///     var siteEvpnTopologies = JuniperMist.Site.GetEvpnTopologies.Invoke(new()
        ///     {
        ///         SiteId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetEvpnTopologiesResult> Invoke(GetEvpnTopologiesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetEvpnTopologiesResult>("junipermist:site/getEvpnTopologies:getEvpnTopologies", args ?? new GetEvpnTopologiesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEvpnTopologiesArgs : global::Pulumi.InvokeArgs
    {
        [Input("siteId", required: true)]
        public string SiteId { get; set; } = null!;

        public GetEvpnTopologiesArgs()
        {
        }
        public static new GetEvpnTopologiesArgs Empty => new GetEvpnTopologiesArgs();
    }

    public sealed class GetEvpnTopologiesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("siteId", required: true)]
        public Input<string> SiteId { get; set; } = null!;

        public GetEvpnTopologiesInvokeArgs()
        {
        }
        public static new GetEvpnTopologiesInvokeArgs Empty => new GetEvpnTopologiesInvokeArgs();
    }


    [OutputType]
    public sealed class GetEvpnTopologiesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetEvpnTopologiesSiteEvpnTopologyResult> SiteEvpnTopologies;
        public readonly string SiteId;

        [OutputConstructor]
        private GetEvpnTopologiesResult(
            string id,

            ImmutableArray<Outputs.GetEvpnTopologiesSiteEvpnTopologyResult> siteEvpnTopologies,

            string siteId)
        {
            Id = id;
            SiteEvpnTopologies = siteEvpnTopologies;
            SiteId = siteId;
        }
    }
}
