// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org
{
    public static class GetVpns
    {
        /// <summary>
        /// This data source provide the list of the Org VPNs.
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
        ///     var vpns = JuniperMist.Org.GetVpns.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetVpnsResult> InvokeAsync(GetVpnsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVpnsResult>("junipermist:org/getVpns:getVpns", args ?? new GetVpnsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provide the list of the Org VPNs.
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
        ///     var vpns = JuniperMist.Org.GetVpns.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetVpnsResult> Invoke(GetVpnsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVpnsResult>("junipermist:org/getVpns:getVpns", args ?? new GetVpnsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provide the list of the Org VPNs.
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
        ///     var vpns = JuniperMist.Org.GetVpns.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetVpnsResult> Invoke(GetVpnsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetVpnsResult>("junipermist:org/getVpns:getVpns", args ?? new GetVpnsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVpnsArgs : global::Pulumi.InvokeArgs
    {
        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        public GetVpnsArgs()
        {
        }
        public static new GetVpnsArgs Empty => new GetVpnsArgs();
    }

    public sealed class GetVpnsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        public GetVpnsInvokeArgs()
        {
        }
        public static new GetVpnsInvokeArgs Empty => new GetVpnsInvokeArgs();
    }


    [OutputType]
    public sealed class GetVpnsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string OrgId;
        public readonly ImmutableArray<Outputs.GetVpnsOrgVpnResult> OrgVpns;

        [OutputConstructor]
        private GetVpnsResult(
            string id,

            string orgId,

            ImmutableArray<Outputs.GetVpnsOrgVpnResult> orgVpns)
        {
            Id = id;
            OrgId = orgId;
            OrgVpns = orgVpns;
        }
    }
}
