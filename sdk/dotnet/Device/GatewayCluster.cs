// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device
{
    /// <summary>
    /// This resource can be used to form or delete a Gateway
    ///  Clusters. It can be used with two Gateways assigned to the same site.
    /// Once the Cluster is formed, it can be create just like a Gateway with the `junipermist.device.Gateway` resource:
    /// 1. Claim the gateways and assign them to a site with the `junipermist.org.Inventory` resource
    /// 2. Form the Cluster with the `junipermist.device.GatewayCluster` resource by providing the `site_id` and the two nodes MAC Addresses (the first in the list will be the node0)
    /// 3. Configure the Cluster with the `junipermist.device.Gateway` resource
    /// 
    /// Please check the Juniper Documentation first to validate the cabling between the Gateways
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
    ///     var clusterOne = new JuniperMist.Device.GatewayCluster("cluster_one", new()
    ///     {
    ///         SiteId = terraformSite2.Id,
    ///         Nodes = new[]
    ///         {
    ///             new JuniperMist.Device.Inputs.GatewayClusterNodeArgs
    ///             {
    ///                 Mac = "4c961000000",
    ///             },
    ///             new JuniperMist.Device.Inputs.GatewayClusterNodeArgs
    ///             {
    ///                 Mac = "4c961000001",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `mist_device_gateway_cluster` with:
    /// 
    /// Gateway cluster can be imported by specifying the org_id and the cluster_id
    /// 
    /// ```sh
    /// $ pulumi import junipermist:device/gatewayCluster:GatewayCluster cluster_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
    /// ```
    /// </summary>
    [JuniperMistResourceType("junipermist:device/gatewayCluster:GatewayCluster")]
    public partial class GatewayCluster : global::Pulumi.CustomResource
    {
        /// <summary>
        /// when replacing a node, either mac has to remain the same as existing cluster
        /// </summary>
        [Output("nodes")]
        public Output<ImmutableArray<Outputs.GatewayClusterNode>> Nodes { get; private set; } = null!;

        [Output("siteId")]
        public Output<string> SiteId { get; private set; } = null!;


        /// <summary>
        /// Create a GatewayCluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GatewayCluster(string name, GatewayClusterArgs args, CustomResourceOptions? options = null)
            : base("junipermist:device/gatewayCluster:GatewayCluster", name, args ?? new GatewayClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GatewayCluster(string name, Input<string> id, GatewayClusterState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:device/gatewayCluster:GatewayCluster", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GatewayCluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GatewayCluster Get(string name, Input<string> id, GatewayClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new GatewayCluster(name, id, state, options);
        }
    }

    public sealed class GatewayClusterArgs : global::Pulumi.ResourceArgs
    {
        [Input("nodes", required: true)]
        private InputList<Inputs.GatewayClusterNodeArgs>? _nodes;

        /// <summary>
        /// when replacing a node, either mac has to remain the same as existing cluster
        /// </summary>
        public InputList<Inputs.GatewayClusterNodeArgs> Nodes
        {
            get => _nodes ?? (_nodes = new InputList<Inputs.GatewayClusterNodeArgs>());
            set => _nodes = value;
        }

        [Input("siteId", required: true)]
        public Input<string> SiteId { get; set; } = null!;

        public GatewayClusterArgs()
        {
        }
        public static new GatewayClusterArgs Empty => new GatewayClusterArgs();
    }

    public sealed class GatewayClusterState : global::Pulumi.ResourceArgs
    {
        [Input("nodes")]
        private InputList<Inputs.GatewayClusterNodeGetArgs>? _nodes;

        /// <summary>
        /// when replacing a node, either mac has to remain the same as existing cluster
        /// </summary>
        public InputList<Inputs.GatewayClusterNodeGetArgs> Nodes
        {
            get => _nodes ?? (_nodes = new InputList<Inputs.GatewayClusterNodeGetArgs>());
            set => _nodes = value;
        }

        [Input("siteId")]
        public Input<string>? SiteId { get; set; }

        public GatewayClusterState()
        {
        }
        public static new GatewayClusterState Empty => new GatewayClusterState();
    }
}
