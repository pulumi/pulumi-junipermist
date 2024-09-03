// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device
{
    public static class GetApStats
    {
        /// <summary>
        /// This data source provides the list of Wireless Access Points with their statistics.
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
        ///     var apStats = JuniperMist.Device.GetApStats.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetApStatsResult> InvokeAsync(GetApStatsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetApStatsResult>("junipermist:device/getApStats:getApStats", args ?? new GetApStatsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the list of Wireless Access Points with their statistics.
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
        ///     var apStats = JuniperMist.Device.GetApStats.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetApStatsResult> Invoke(GetApStatsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetApStatsResult>("junipermist:device/getApStats:getApStats", args ?? new GetApStatsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetApStatsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// duration like 7d, 2w
        /// </summary>
        [Input("duration")]
        public string? Duration { get; set; }

        /// <summary>
        /// end datetime, can be epoch or relative time like -1d, -2h; now if not specified
        /// </summary>
        [Input("end")]
        public int? End { get; set; }

        [Input("mac")]
        public string? Mac { get; set; }

        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        [Input("siteId")]
        public string? SiteId { get; set; }

        /// <summary>
        /// start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
        /// </summary>
        [Input("start")]
        public int? Start { get; set; }

        [Input("status")]
        public string? Status { get; set; }

        public GetApStatsArgs()
        {
        }
        public static new GetApStatsArgs Empty => new GetApStatsArgs();
    }

    public sealed class GetApStatsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// duration like 7d, 2w
        /// </summary>
        [Input("duration")]
        public Input<string>? Duration { get; set; }

        /// <summary>
        /// end datetime, can be epoch or relative time like -1d, -2h; now if not specified
        /// </summary>
        [Input("end")]
        public Input<int>? End { get; set; }

        [Input("mac")]
        public Input<string>? Mac { get; set; }

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        [Input("siteId")]
        public Input<string>? SiteId { get; set; }

        /// <summary>
        /// start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
        /// </summary>
        [Input("start")]
        public Input<int>? Start { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetApStatsInvokeArgs()
        {
        }
        public static new GetApStatsInvokeArgs Empty => new GetApStatsInvokeArgs();
    }


    [OutputType]
    public sealed class GetApStatsResult
    {
        public readonly ImmutableArray<Outputs.GetApStatsDeviceApStatResult> DeviceApStats;
        /// <summary>
        /// duration like 7d, 2w
        /// </summary>
        public readonly string? Duration;
        /// <summary>
        /// end datetime, can be epoch or relative time like -1d, -2h; now if not specified
        /// </summary>
        public readonly int? End;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? Mac;
        public readonly string OrgId;
        public readonly string? SiteId;
        /// <summary>
        /// start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
        /// </summary>
        public readonly int? Start;
        public readonly string? Status;

        [OutputConstructor]
        private GetApStatsResult(
            ImmutableArray<Outputs.GetApStatsDeviceApStatResult> deviceApStats,

            string? duration,

            int? end,

            string id,

            string? mac,

            string orgId,

            string? siteId,

            int? start,

            string? status)
        {
            DeviceApStats = deviceApStats;
            Duration = duration;
            End = end;
            Id = id;
            Mac = mac;
            OrgId = orgId;
            SiteId = siteId;
            Start = start;
            Status = status;
        }
    }
}
