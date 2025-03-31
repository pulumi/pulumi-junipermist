// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org
{
    /// <summary>
    /// This resource manages WAN Assurance Services (Applications).
    /// 
    /// A Service is used to define a Custom Application that can be used in the `service_policies`. These Services can be referenced by their name in
    /// * the Service Policies (`mist_org_servicepolicy.services`)
    /// * the Gateway configuration (`mist_device_gateway.service_policies.services`)
    /// * the Gateway Templates (`mist_org_gatewaytemplate.service_policies.services`)
    /// * the HUB Profiles (`mist_org_deviceprofile_gateway.service_policies.services`)
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `mist_org_service` with:
    /// 
    /// Org Service can be imported by specifying the org_id and the service_id
    /// 
    /// ```sh
    /// $ pulumi import junipermist:org/service:Service service_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
    /// ```
    /// </summary>
    [JuniperMistResourceType("junipermist:org/service:Service")]
    public partial class Service : global::Pulumi.CustomResource
    {
        /// <summary>
        /// If `type`==`custom`, ip subnets (e.g. 10.0.0.0/8)
        /// </summary>
        [Output("addresses")]
        public Output<ImmutableArray<string>> Addresses { get; private set; } = null!;

        /// <summary>
        /// When `type`==`app_categories`, list of application categories are available through List App Category Definitions
        /// </summary>
        [Output("appCategories")]
        public Output<ImmutableArray<string>> AppCategories { get; private set; } = null!;

        /// <summary>
        /// When `type`==`app_categories`, list of application categories are available through List App Sub Category Definitions
        /// </summary>
        [Output("appSubcategories")]
        public Output<ImmutableArray<string>> AppSubcategories { get; private set; } = null!;

        /// <summary>
        /// When `type`==`apps`, list of applications are available through: * List Applications * List Gateway Applications *
        /// /insight/top_app_by-bytes?wired=true
        /// </summary>
        [Output("apps")]
        public Output<ImmutableArray<string>> Apps { get; private set; } = null!;

        /// <summary>
        /// 0 means unlimited
        /// </summary>
        [Output("clientLimitDown")]
        public Output<int> ClientLimitDown { get; private set; } = null!;

        /// <summary>
        /// 0 means unlimited
        /// </summary>
        [Output("clientLimitUp")]
        public Output<int> ClientLimitUp { get; private set; } = null!;

        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        [Output("dscp")]
        public Output<string?> Dscp { get; private set; } = null!;

        /// <summary>
        /// enum: `non_revertable`, `none`, `revertable`
        /// </summary>
        [Output("failoverPolicy")]
        public Output<string> FailoverPolicy { get; private set; } = null!;

        /// <summary>
        /// If `type`==`custom`, web filtering
        /// </summary>
        [Output("hostnames")]
        public Output<ImmutableArray<string>> Hostnames { get; private set; } = null!;

        [Output("maxJitter")]
        public Output<string?> MaxJitter { get; private set; } = null!;

        [Output("maxLatency")]
        public Output<string?> MaxLatency { get; private set; } = null!;

        [Output("maxLoss")]
        public Output<string?> MaxLoss { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// 0 means unlimited
        /// </summary>
        [Output("serviceLimitDown")]
        public Output<int> ServiceLimitDown { get; private set; } = null!;

        /// <summary>
        /// 0 means unlimited
        /// </summary>
        [Output("serviceLimitUp")]
        public Output<int> ServiceLimitUp { get; private set; } = null!;

        /// <summary>
        /// Whether to enable measure SLE
        /// </summary>
        [Output("sleEnabled")]
        public Output<bool> SleEnabled { get; private set; } = null!;

        /// <summary>
        /// When `type`==`custom`, optional, if it doesn't exist, http and https is assumed
        /// </summary>
        [Output("specs")]
        public Output<ImmutableArray<Outputs.ServiceSpec>> Specs { get; private set; } = null!;

        [Output("ssrRelaxedTcpStateEnforcement")]
        public Output<bool> SsrRelaxedTcpStateEnforcement { get; private set; } = null!;

        /// <summary>
        /// when `traffic_type`==`custom`. enum: `best_effort`, `high`, `low`, `medium`
        /// </summary>
        [Output("trafficClass")]
        public Output<string> TrafficClass { get; private set; } = null!;

        /// <summary>
        /// values from List Traffic Types
        /// </summary>
        [Output("trafficType")]
        public Output<string> TrafficType { get; private set; } = null!;

        /// <summary>
        /// enum: `app_categories`, `apps`, `custom`, `urls`
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// When `type`==`urls`, no need for spec as URL can encode the ports being used
        /// </summary>
        [Output("urls")]
        public Output<ImmutableArray<string>> Urls { get; private set; } = null!;


        /// <summary>
        /// Create a Service resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Service(string name, ServiceArgs args, CustomResourceOptions? options = null)
            : base("junipermist:org/service:Service", name, args ?? new ServiceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Service(string name, Input<string> id, ServiceState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:org/service:Service", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi/pulumi-junipermist",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Service resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Service Get(string name, Input<string> id, ServiceState? state = null, CustomResourceOptions? options = null)
        {
            return new Service(name, id, state, options);
        }
    }

    public sealed class ServiceArgs : global::Pulumi.ResourceArgs
    {
        [Input("addresses")]
        private InputList<string>? _addresses;

        /// <summary>
        /// If `type`==`custom`, ip subnets (e.g. 10.0.0.0/8)
        /// </summary>
        public InputList<string> Addresses
        {
            get => _addresses ?? (_addresses = new InputList<string>());
            set => _addresses = value;
        }

        [Input("appCategories")]
        private InputList<string>? _appCategories;

        /// <summary>
        /// When `type`==`app_categories`, list of application categories are available through List App Category Definitions
        /// </summary>
        public InputList<string> AppCategories
        {
            get => _appCategories ?? (_appCategories = new InputList<string>());
            set => _appCategories = value;
        }

        [Input("appSubcategories")]
        private InputList<string>? _appSubcategories;

        /// <summary>
        /// When `type`==`app_categories`, list of application categories are available through List App Sub Category Definitions
        /// </summary>
        public InputList<string> AppSubcategories
        {
            get => _appSubcategories ?? (_appSubcategories = new InputList<string>());
            set => _appSubcategories = value;
        }

        [Input("apps")]
        private InputList<string>? _apps;

        /// <summary>
        /// When `type`==`apps`, list of applications are available through: * List Applications * List Gateway Applications *
        /// /insight/top_app_by-bytes?wired=true
        /// </summary>
        public InputList<string> Apps
        {
            get => _apps ?? (_apps = new InputList<string>());
            set => _apps = value;
        }

        /// <summary>
        /// 0 means unlimited
        /// </summary>
        [Input("clientLimitDown")]
        public Input<int>? ClientLimitDown { get; set; }

        /// <summary>
        /// 0 means unlimited
        /// </summary>
        [Input("clientLimitUp")]
        public Input<int>? ClientLimitUp { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("dscp")]
        public Input<string>? Dscp { get; set; }

        /// <summary>
        /// enum: `non_revertable`, `none`, `revertable`
        /// </summary>
        [Input("failoverPolicy")]
        public Input<string>? FailoverPolicy { get; set; }

        [Input("hostnames")]
        private InputList<string>? _hostnames;

        /// <summary>
        /// If `type`==`custom`, web filtering
        /// </summary>
        public InputList<string> Hostnames
        {
            get => _hostnames ?? (_hostnames = new InputList<string>());
            set => _hostnames = value;
        }

        [Input("maxJitter")]
        public Input<string>? MaxJitter { get; set; }

        [Input("maxLatency")]
        public Input<string>? MaxLatency { get; set; }

        [Input("maxLoss")]
        public Input<string>? MaxLoss { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// 0 means unlimited
        /// </summary>
        [Input("serviceLimitDown")]
        public Input<int>? ServiceLimitDown { get; set; }

        /// <summary>
        /// 0 means unlimited
        /// </summary>
        [Input("serviceLimitUp")]
        public Input<int>? ServiceLimitUp { get; set; }

        /// <summary>
        /// Whether to enable measure SLE
        /// </summary>
        [Input("sleEnabled")]
        public Input<bool>? SleEnabled { get; set; }

        [Input("specs")]
        private InputList<Inputs.ServiceSpecArgs>? _specs;

        /// <summary>
        /// When `type`==`custom`, optional, if it doesn't exist, http and https is assumed
        /// </summary>
        public InputList<Inputs.ServiceSpecArgs> Specs
        {
            get => _specs ?? (_specs = new InputList<Inputs.ServiceSpecArgs>());
            set => _specs = value;
        }

        [Input("ssrRelaxedTcpStateEnforcement")]
        public Input<bool>? SsrRelaxedTcpStateEnforcement { get; set; }

        /// <summary>
        /// when `traffic_type`==`custom`. enum: `best_effort`, `high`, `low`, `medium`
        /// </summary>
        [Input("trafficClass")]
        public Input<string>? TrafficClass { get; set; }

        /// <summary>
        /// values from List Traffic Types
        /// </summary>
        [Input("trafficType")]
        public Input<string>? TrafficType { get; set; }

        /// <summary>
        /// enum: `app_categories`, `apps`, `custom`, `urls`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("urls")]
        private InputList<string>? _urls;

        /// <summary>
        /// When `type`==`urls`, no need for spec as URL can encode the ports being used
        /// </summary>
        public InputList<string> Urls
        {
            get => _urls ?? (_urls = new InputList<string>());
            set => _urls = value;
        }

        public ServiceArgs()
        {
        }
        public static new ServiceArgs Empty => new ServiceArgs();
    }

    public sealed class ServiceState : global::Pulumi.ResourceArgs
    {
        [Input("addresses")]
        private InputList<string>? _addresses;

        /// <summary>
        /// If `type`==`custom`, ip subnets (e.g. 10.0.0.0/8)
        /// </summary>
        public InputList<string> Addresses
        {
            get => _addresses ?? (_addresses = new InputList<string>());
            set => _addresses = value;
        }

        [Input("appCategories")]
        private InputList<string>? _appCategories;

        /// <summary>
        /// When `type`==`app_categories`, list of application categories are available through List App Category Definitions
        /// </summary>
        public InputList<string> AppCategories
        {
            get => _appCategories ?? (_appCategories = new InputList<string>());
            set => _appCategories = value;
        }

        [Input("appSubcategories")]
        private InputList<string>? _appSubcategories;

        /// <summary>
        /// When `type`==`app_categories`, list of application categories are available through List App Sub Category Definitions
        /// </summary>
        public InputList<string> AppSubcategories
        {
            get => _appSubcategories ?? (_appSubcategories = new InputList<string>());
            set => _appSubcategories = value;
        }

        [Input("apps")]
        private InputList<string>? _apps;

        /// <summary>
        /// When `type`==`apps`, list of applications are available through: * List Applications * List Gateway Applications *
        /// /insight/top_app_by-bytes?wired=true
        /// </summary>
        public InputList<string> Apps
        {
            get => _apps ?? (_apps = new InputList<string>());
            set => _apps = value;
        }

        /// <summary>
        /// 0 means unlimited
        /// </summary>
        [Input("clientLimitDown")]
        public Input<int>? ClientLimitDown { get; set; }

        /// <summary>
        /// 0 means unlimited
        /// </summary>
        [Input("clientLimitUp")]
        public Input<int>? ClientLimitUp { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("dscp")]
        public Input<string>? Dscp { get; set; }

        /// <summary>
        /// enum: `non_revertable`, `none`, `revertable`
        /// </summary>
        [Input("failoverPolicy")]
        public Input<string>? FailoverPolicy { get; set; }

        [Input("hostnames")]
        private InputList<string>? _hostnames;

        /// <summary>
        /// If `type`==`custom`, web filtering
        /// </summary>
        public InputList<string> Hostnames
        {
            get => _hostnames ?? (_hostnames = new InputList<string>());
            set => _hostnames = value;
        }

        [Input("maxJitter")]
        public Input<string>? MaxJitter { get; set; }

        [Input("maxLatency")]
        public Input<string>? MaxLatency { get; set; }

        [Input("maxLoss")]
        public Input<string>? MaxLoss { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// 0 means unlimited
        /// </summary>
        [Input("serviceLimitDown")]
        public Input<int>? ServiceLimitDown { get; set; }

        /// <summary>
        /// 0 means unlimited
        /// </summary>
        [Input("serviceLimitUp")]
        public Input<int>? ServiceLimitUp { get; set; }

        /// <summary>
        /// Whether to enable measure SLE
        /// </summary>
        [Input("sleEnabled")]
        public Input<bool>? SleEnabled { get; set; }

        [Input("specs")]
        private InputList<Inputs.ServiceSpecGetArgs>? _specs;

        /// <summary>
        /// When `type`==`custom`, optional, if it doesn't exist, http and https is assumed
        /// </summary>
        public InputList<Inputs.ServiceSpecGetArgs> Specs
        {
            get => _specs ?? (_specs = new InputList<Inputs.ServiceSpecGetArgs>());
            set => _specs = value;
        }

        [Input("ssrRelaxedTcpStateEnforcement")]
        public Input<bool>? SsrRelaxedTcpStateEnforcement { get; set; }

        /// <summary>
        /// when `traffic_type`==`custom`. enum: `best_effort`, `high`, `low`, `medium`
        /// </summary>
        [Input("trafficClass")]
        public Input<string>? TrafficClass { get; set; }

        /// <summary>
        /// values from List Traffic Types
        /// </summary>
        [Input("trafficType")]
        public Input<string>? TrafficType { get; set; }

        /// <summary>
        /// enum: `app_categories`, `apps`, `custom`, `urls`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("urls")]
        private InputList<string>? _urls;

        /// <summary>
        /// When `type`==`urls`, no need for spec as URL can encode the ports being used
        /// </summary>
        public InputList<string> Urls
        {
            get => _urls ?? (_urls = new InputList<string>());
            set => _urls = value;
        }

        public ServiceState()
        {
        }
        public static new ServiceState Empty => new ServiceState();
    }
}
