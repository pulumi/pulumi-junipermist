// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org
{
    public static class GetServicepolicies
    {
        /// <summary>
        /// This data source provides the list of WAN Assurance Service Policies (Application Policies).
        /// 
        /// The Service Policies can be used in the `service_policies` object by referencing the Service Policy ID as the `servicepolicy_id` in:
        /// * the Gateway configuration (`mist_device_gateway.service_policies`)
        /// * the Gateway Templates (`mist_org_gatewaytemplate.service_policies`)
        /// * the HUB Profiles (`mist_org_deviceprofile_gateway.service_policies`)
        /// They can be used to manage common policies between multiples configurations
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
        ///     var servicepolicies = JuniperMist.Org.GetServicepolicies.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetServicepoliciesResult> InvokeAsync(GetServicepoliciesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServicepoliciesResult>("junipermist:org/getServicepolicies:getServicepolicies", args ?? new GetServicepoliciesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the list of WAN Assurance Service Policies (Application Policies).
        /// 
        /// The Service Policies can be used in the `service_policies` object by referencing the Service Policy ID as the `servicepolicy_id` in:
        /// * the Gateway configuration (`mist_device_gateway.service_policies`)
        /// * the Gateway Templates (`mist_org_gatewaytemplate.service_policies`)
        /// * the HUB Profiles (`mist_org_deviceprofile_gateway.service_policies`)
        /// They can be used to manage common policies between multiples configurations
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
        ///     var servicepolicies = JuniperMist.Org.GetServicepolicies.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetServicepoliciesResult> Invoke(GetServicepoliciesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServicepoliciesResult>("junipermist:org/getServicepolicies:getServicepolicies", args ?? new GetServicepoliciesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the list of WAN Assurance Service Policies (Application Policies).
        /// 
        /// The Service Policies can be used in the `service_policies` object by referencing the Service Policy ID as the `servicepolicy_id` in:
        /// * the Gateway configuration (`mist_device_gateway.service_policies`)
        /// * the Gateway Templates (`mist_org_gatewaytemplate.service_policies`)
        /// * the HUB Profiles (`mist_org_deviceprofile_gateway.service_policies`)
        /// They can be used to manage common policies between multiples configurations
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
        ///     var servicepolicies = JuniperMist.Org.GetServicepolicies.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetServicepoliciesResult> Invoke(GetServicepoliciesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetServicepoliciesResult>("junipermist:org/getServicepolicies:getServicepolicies", args ?? new GetServicepoliciesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServicepoliciesArgs : global::Pulumi.InvokeArgs
    {
        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        public GetServicepoliciesArgs()
        {
        }
        public static new GetServicepoliciesArgs Empty => new GetServicepoliciesArgs();
    }

    public sealed class GetServicepoliciesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        public GetServicepoliciesInvokeArgs()
        {
        }
        public static new GetServicepoliciesInvokeArgs Empty => new GetServicepoliciesInvokeArgs();
    }


    [OutputType]
    public sealed class GetServicepoliciesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string OrgId;
        public readonly ImmutableArray<Outputs.GetServicepoliciesOrgServicepolicyResult> OrgServicepolicies;

        [OutputConstructor]
        private GetServicepoliciesResult(
            string id,

            string orgId,

            ImmutableArray<Outputs.GetServicepoliciesOrgServicepolicyResult> orgServicepolicies)
        {
            Id = id;
            OrgId = orgId;
            OrgServicepolicies = orgServicepolicies;
        }
    }
}
