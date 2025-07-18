// *** WARNING: this file was generated by pulumi-language-dotnet. ***
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
        ///         Mac = "5c5b35000000",
        ///         SiteId = "4a422ae5-7ca0-4599-87a3-8e49aa63685f",
        ///         Status = "connected",
        ///         Duration = "1d",
        ///         Start = 1736031600,
        ///         End = 1736175934,
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
        ///         Mac = "5c5b35000000",
        ///         SiteId = "4a422ae5-7ca0-4599-87a3-8e49aa63685f",
        ///         Status = "connected",
        ///         Duration = "1d",
        ///         Start = 1736031600,
        ///         End = 1736175934,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetApStatsResult> Invoke(GetApStatsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetApStatsResult>("junipermist:device/getApStats:getApStats", args ?? new GetApStatsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the list of Wireless Access Points with their statistics.
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
        ///     var apStats = JuniperMist.Device.GetApStats.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///         Mac = "5c5b35000000",
        ///         SiteId = "4a422ae5-7ca0-4599-87a3-8e49aa63685f",
        ///         Status = "connected",
        ///         Duration = "1d",
        ///         Start = 1736031600,
        ///         End = 1736175934,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetApStatsResult> Invoke(GetApStatsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetApStatsResult>("junipermist:device/getApStats:getApStats", args ?? new GetApStatsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetApStatsArgs : global::Pulumi.InvokeArgs
    {
        [Input("duration")]
        public string? Duration { get; set; }

        [Input("end")]
        public int? End { get; set; }

        [Input("mac")]
        public string? Mac { get; set; }

        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        [Input("siteId")]
        public string? SiteId { get; set; }

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
        [Input("duration")]
        public Input<string>? Duration { get; set; }

        [Input("end")]
        public Input<int>? End { get; set; }

        [Input("mac")]
        public Input<string>? Mac { get; set; }

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        [Input("siteId")]
        public Input<string>? SiteId { get; set; }

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
        public readonly string? Duration;
        public readonly int? End;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? Mac;
        public readonly string OrgId;
        public readonly string? SiteId;
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
