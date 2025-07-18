// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org
{
    /// <summary>
    /// This resource manages the NAC Endpoints (User MACs).
    /// 
    /// NAC Endpoints (User MACs) provide a database of endpoints identified by their MAC addresses. They can be used assign each endpoint with various attributes, such as name, VLAN, role and client label.  Once an endpoint is labeled, the label name can be used to create `junipermist.org.Nactag` resource as match criteria.
    /// 
    /// The `junipermist.org.Nactag` resource can be used to create Tags regrouping one or multiple endpoint MAC Addresses, but the use of the User MACs provides additional features:
    /// * possibility to assign specific attributes, like a Name, a Radius Group, a VLAN ID, ...
    /// * possibility to assign one or multiple Tags (Labels) to a User MAC
    /// * improved management for large list of MAC Addresses
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
    ///     var endpointOne = new JuniperMist.Org.NacEndpoint("endpoint_one", new()
    ///     {
    ///         Mac = "921b638445cd",
    ///         Labels = new[]
    ///         {
    ///             "byod",
    ///             "flr1",
    ///         },
    ///         Vlan = "30",
    ///         Notes = "mac address refers to Canon printers",
    ///         Name = "endpoint_one",
    ///         RadiusGroup = "VIP",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `mist_org_nac_endpoint` with:
    /// 
    /// NAC Endpoint can be imported by specifying the org_id and the nac_endpoint_id
    /// 
    /// ```sh
    /// $ pulumi import junipermist:org/nacEndpoint:NacEndpoint endpoint_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
    /// ```
    /// </summary>
    [JuniperMistResourceType("junipermist:org/nacEndpoint:NacEndpoint")]
    public partial class NacEndpoint : global::Pulumi.CustomResource
    {
        [Output("labels")]
        public Output<ImmutableArray<string>> Labels { get; private set; } = null!;

        /// <summary>
        /// Only non-local-admin MAC is accepted
        /// </summary>
        [Output("mac")]
        public Output<string> Mac { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("notes")]
        public Output<string> Notes { get; private set; } = null!;

        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        [Output("radiusGroup")]
        public Output<string> RadiusGroup { get; private set; } = null!;

        [Output("vlan")]
        public Output<string> Vlan { get; private set; } = null!;


        /// <summary>
        /// Create a NacEndpoint resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NacEndpoint(string name, NacEndpointArgs args, CustomResourceOptions? options = null)
            : base("junipermist:org/nacEndpoint:NacEndpoint", name, args ?? new NacEndpointArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NacEndpoint(string name, Input<string> id, NacEndpointState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:org/nacEndpoint:NacEndpoint", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NacEndpoint resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NacEndpoint Get(string name, Input<string> id, NacEndpointState? state = null, CustomResourceOptions? options = null)
        {
            return new NacEndpoint(name, id, state, options);
        }
    }

    public sealed class NacEndpointArgs : global::Pulumi.ResourceArgs
    {
        [Input("labels")]
        private InputList<string>? _labels;
        public InputList<string> Labels
        {
            get => _labels ?? (_labels = new InputList<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Only non-local-admin MAC is accepted
        /// </summary>
        [Input("mac", required: true)]
        public Input<string> Mac { get; set; } = null!;

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notes")]
        public Input<string>? Notes { get; set; }

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        [Input("radiusGroup")]
        public Input<string>? RadiusGroup { get; set; }

        [Input("vlan")]
        public Input<string>? Vlan { get; set; }

        public NacEndpointArgs()
        {
        }
        public static new NacEndpointArgs Empty => new NacEndpointArgs();
    }

    public sealed class NacEndpointState : global::Pulumi.ResourceArgs
    {
        [Input("labels")]
        private InputList<string>? _labels;
        public InputList<string> Labels
        {
            get => _labels ?? (_labels = new InputList<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Only non-local-admin MAC is accepted
        /// </summary>
        [Input("mac")]
        public Input<string>? Mac { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notes")]
        public Input<string>? Notes { get; set; }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("radiusGroup")]
        public Input<string>? RadiusGroup { get; set; }

        [Input("vlan")]
        public Input<string>? Vlan { get; set; }

        public NacEndpointState()
        {
        }
        public static new NacEndpointState Empty => new NacEndpointState();
    }
}
