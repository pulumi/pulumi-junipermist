// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site
{
    public static class GetWebhooks
    {
        /// <summary>
        /// This data source provides the list of Site Webhooks.
        /// 
        /// A Site Webhook is a configuration that allows real-time events and data from a specific site to be pushed to a provided url.  
        /// It enables the collection of information about various topics such as device events, alarms, audits, client sessions and location updates at the site level.  
        /// The Webhook can be set up and customized using the Mist API, allowing users to receive and analyze specific data from a particular site.
        /// </summary>
        public static Task<GetWebhooksResult> InvokeAsync(GetWebhooksArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetWebhooksResult>("junipermist:site/getWebhooks:getWebhooks", args ?? new GetWebhooksArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the list of Site Webhooks.
        /// 
        /// A Site Webhook is a configuration that allows real-time events and data from a specific site to be pushed to a provided url.  
        /// It enables the collection of information about various topics such as device events, alarms, audits, client sessions and location updates at the site level.  
        /// The Webhook can be set up and customized using the Mist API, allowing users to receive and analyze specific data from a particular site.
        /// </summary>
        public static Output<GetWebhooksResult> Invoke(GetWebhooksInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetWebhooksResult>("junipermist:site/getWebhooks:getWebhooks", args ?? new GetWebhooksInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the list of Site Webhooks.
        /// 
        /// A Site Webhook is a configuration that allows real-time events and data from a specific site to be pushed to a provided url.  
        /// It enables the collection of information about various topics such as device events, alarms, audits, client sessions and location updates at the site level.  
        /// The Webhook can be set up and customized using the Mist API, allowing users to receive and analyze specific data from a particular site.
        /// </summary>
        public static Output<GetWebhooksResult> Invoke(GetWebhooksInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetWebhooksResult>("junipermist:site/getWebhooks:getWebhooks", args ?? new GetWebhooksInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetWebhooksArgs : global::Pulumi.InvokeArgs
    {
        [Input("siteId", required: true)]
        public string SiteId { get; set; } = null!;

        public GetWebhooksArgs()
        {
        }
        public static new GetWebhooksArgs Empty => new GetWebhooksArgs();
    }

    public sealed class GetWebhooksInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("siteId", required: true)]
        public Input<string> SiteId { get; set; } = null!;

        public GetWebhooksInvokeArgs()
        {
        }
        public static new GetWebhooksInvokeArgs Empty => new GetWebhooksInvokeArgs();
    }


    [OutputType]
    public sealed class GetWebhooksResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string SiteId;
        public readonly ImmutableArray<Outputs.GetWebhooksSiteWebhookResult> SiteWebhooks;

        [OutputConstructor]
        private GetWebhooksResult(
            string id,

            string siteId,

            ImmutableArray<Outputs.GetWebhooksSiteWebhookResult> siteWebhooks)
        {
            Id = id;
            SiteId = siteId;
            SiteWebhooks = siteWebhooks;
        }
    }
}
