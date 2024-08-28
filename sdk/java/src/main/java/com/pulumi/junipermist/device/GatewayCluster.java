// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.device.GatewayClusterArgs;
import com.pulumi.junipermist.device.inputs.GatewayClusterState;
import com.pulumi.junipermist.device.outputs.GatewayClusterNode;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This resource can be used to form or delete a Gateway Clusters. It can be used with two Gateways assigned to the same site.
 * Once the Cluster is formed, it can be create just like a Gateway with the `junipermist.device.Gateway` resource:
 * 1. Claim the gateways and assign them to a site with the `junipermist.org.Inventory` resource
 * 2. Form the Cluster with the `junipermist.device.GatewayCluster` resource by providing the `site_id` and the two nodes MAC Addresses (the first in the list will be the node0)
 * 3. Configure the Cluster with the `junipermist.device.Gateway` resource
 * 
 * Please check the Juniper Documentation first to validate the cabling between the Gateways
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.junipermist.device.GatewayCluster;
 * import com.pulumi.junipermist.device.GatewayClusterArgs;
 * import com.pulumi.junipermist.device.inputs.GatewayClusterNodeArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var clusterOne = new GatewayCluster("clusterOne", GatewayClusterArgs.builder()
 *             .siteId(terraformSite2.id())
 *             .nodes(            
 *                 GatewayClusterNodeArgs.builder()
 *                     .mac("4c961000000")
 *                     .build(),
 *                 GatewayClusterNodeArgs.builder()
 *                     .mac("4c961000001")
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import junipermist:device/gatewayCluster:GatewayCluster Using terraform import, import `mist_device_gateway_cluster` using the `import` command:
 * ```
 * 
 * Gateway cluster can be imported by specifying the org_id and the cluster_id
 * 
 * ```sh
 * $ pulumi import junipermist:device/gatewayCluster:GatewayCluster cluster_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 * 
 */
@ResourceType(type="junipermist:device/gatewayCluster:GatewayCluster")
public class GatewayCluster extends com.pulumi.resources.CustomResource {
    /**
     * when replacing a node, either mac has to remain the same as existing cluster
     * 
     */
    @Export(name="nodes", refs={List.class,GatewayClusterNode.class}, tree="[0,1]")
    private Output<List<GatewayClusterNode>> nodes;

    /**
     * @return when replacing a node, either mac has to remain the same as existing cluster
     * 
     */
    public Output<List<GatewayClusterNode>> nodes() {
        return this.nodes;
    }
    @Export(name="siteId", refs={String.class}, tree="[0]")
    private Output<String> siteId;

    public Output<String> siteId() {
        return this.siteId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GatewayCluster(java.lang.String name) {
        this(name, GatewayClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GatewayCluster(java.lang.String name, GatewayClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GatewayCluster(java.lang.String name, GatewayClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:device/gatewayCluster:GatewayCluster", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private GatewayCluster(java.lang.String name, Output<java.lang.String> id, @Nullable GatewayClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:device/gatewayCluster:GatewayCluster", name, state, makeResourceOptions(options, id), false);
    }

    private static GatewayClusterArgs makeArgs(GatewayClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GatewayClusterArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static GatewayCluster get(java.lang.String name, Output<java.lang.String> id, @Nullable GatewayClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GatewayCluster(name, id, state, options);
    }
}