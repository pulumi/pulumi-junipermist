// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org
{
    public static class GetAlarmtemplates
    {
        /// <summary>
        /// This data source provides the list of Alarm Templates.
        /// 
        /// An Alarm Template is a set of Alarm Rules that could be applied to one or more sites (while each site can only pick one Alarm Template), or to the whole org.
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
        ///     var alarmtemplates = JuniperMist.Org.GetAlarmtemplates.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetAlarmtemplatesResult> InvokeAsync(GetAlarmtemplatesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAlarmtemplatesResult>("junipermist:org/getAlarmtemplates:getAlarmtemplates", args ?? new GetAlarmtemplatesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the list of Alarm Templates.
        /// 
        /// An Alarm Template is a set of Alarm Rules that could be applied to one or more sites (while each site can only pick one Alarm Template), or to the whole org.
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
        ///     var alarmtemplates = JuniperMist.Org.GetAlarmtemplates.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAlarmtemplatesResult> Invoke(GetAlarmtemplatesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAlarmtemplatesResult>("junipermist:org/getAlarmtemplates:getAlarmtemplates", args ?? new GetAlarmtemplatesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the list of Alarm Templates.
        /// 
        /// An Alarm Template is a set of Alarm Rules that could be applied to one or more sites (while each site can only pick one Alarm Template), or to the whole org.
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
        ///     var alarmtemplates = JuniperMist.Org.GetAlarmtemplates.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAlarmtemplatesResult> Invoke(GetAlarmtemplatesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAlarmtemplatesResult>("junipermist:org/getAlarmtemplates:getAlarmtemplates", args ?? new GetAlarmtemplatesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAlarmtemplatesArgs : global::Pulumi.InvokeArgs
    {
        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        public GetAlarmtemplatesArgs()
        {
        }
        public static new GetAlarmtemplatesArgs Empty => new GetAlarmtemplatesArgs();
    }

    public sealed class GetAlarmtemplatesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        public GetAlarmtemplatesInvokeArgs()
        {
        }
        public static new GetAlarmtemplatesInvokeArgs Empty => new GetAlarmtemplatesInvokeArgs();
    }


    [OutputType]
    public sealed class GetAlarmtemplatesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetAlarmtemplatesOrgAlarmtemplateResult> OrgAlarmtemplates;
        public readonly string OrgId;

        [OutputConstructor]
        private GetAlarmtemplatesResult(
            string id,

            ImmutableArray<Outputs.GetAlarmtemplatesOrgAlarmtemplateResult> orgAlarmtemplates,

            string orgId)
        {
            Id = id;
            OrgAlarmtemplates = orgAlarmtemplates;
            OrgId = orgId;
        }
    }
}
