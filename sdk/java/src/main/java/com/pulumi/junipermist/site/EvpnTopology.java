// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.site.EvpnTopologyArgs;
import com.pulumi.junipermist.site.inputs.EvpnTopologyState;
import com.pulumi.junipermist.site.outputs.EvpnTopologyEvpnOptions;
import com.pulumi.junipermist.site.outputs.EvpnTopologySwitches;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource manages the Site Evpn Topology.
 * 
 * EVPN allows an alternative but more efficient LAN architecture utilizing VxLAN / MP-BGP to separate the control plane (MAC / IP Learning) from the forwarding plane.
 * 
 * &gt; To create or manage your EVPN Topology with the Mist Provider, please refer to the `How To - EVPN Topology` Guide.
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
 * import com.pulumi.mist.siteSiteEvpnTopology;
 * import com.pulumi.mist.siteSiteEvpnTopologyArgs;
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
 *         var evpnOne = new SiteSiteEvpnTopology("evpnOne", SiteSiteEvpnTopologyArgs.builder()
 *             .siteId(terraformTest.id())
 *             .name("evpn_one")
 *             .evpnOptions(Map.ofEntries(
 *                 Map.entry("routedAt", "core"),
 *                 Map.entry("overlay", Map.of("as", 65000)),
 *                 Map.entry("coreAsBorder", true),
 *                 Map.entry("autoLoopbackSubnet", "172.16.192.0/24"),
 *                 Map.entry("autoLoopbackSubnet6", "fd33:ab00:2::/64"),
 *                 Map.entry("perVlanVgaV4Mac", false),
 *                 Map.entry("underlay", Map.ofEntries(
 *                     Map.entry("asBase", 65001),
 *                     Map.entry("useIpv6", false),
 *                     Map.entry("subnet", "10.255.240.0/20")
 *                 )),
 *                 Map.entry("autoRouterIdSubnet", "172.16.254.0/23")
 *             ))
 *             .switches(List.of(            
 *                 Map.ofEntries(
 *                     Map.entry("mac", "020004000001"),
 *                     Map.entry("role", "core")
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry("mac", "02000400002"),
 *                     Map.entry("role", "core")
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry("mac", "02000400003"),
 *                     Map.entry("role", "distribution")
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry("mac", "02000400004"),
 *                     Map.entry("role", "distribution")
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry("mac", "02000400005"),
 *                     Map.entry("role", "access")
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry("mac", "02000400006"),
 *                     Map.entry("role", "access")
 *                 )))
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
 * Using `pulumi import`, import `mist_site_evpn_topology` with:
 * 
 * EVPN Topology can be imported by specifying the site_id and the evpn_topology_id
 * 
 * ```sh
 * $ pulumi import junipermist:site/evpnTopology:EvpnTopology evpn_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 * 
 */
@ResourceType(type="junipermist:site/evpnTopology:EvpnTopology")
public class EvpnTopology extends com.pulumi.resources.CustomResource {
    /**
     * EVPN Options
     * 
     */
    @Export(name="evpnOptions", refs={EvpnTopologyEvpnOptions.class}, tree="[0]")
    private Output</* @Nullable */ EvpnTopologyEvpnOptions> evpnOptions;

    /**
     * @return EVPN Options
     * 
     */
    public Output<Optional<EvpnTopologyEvpnOptions>> evpnOptions() {
        return Codegen.optional(this.evpnOptions);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * Property key is the pod number
     * 
     */
    @Export(name="podNames", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> podNames;

    /**
     * @return Property key is the pod number
     * 
     */
    public Output<Map<String,String>> podNames() {
        return this.podNames;
    }
    @Export(name="siteId", refs={String.class}, tree="[0]")
    private Output<String> siteId;

    public Output<String> siteId() {
        return this.siteId;
    }
    /**
     * Property key can be the switch MAC Address
     * 
     */
    @Export(name="switches", refs={Map.class,String.class,EvpnTopologySwitches.class}, tree="[0,1,2]")
    private Output<Map<String,EvpnTopologySwitches>> switches;

    /**
     * @return Property key can be the switch MAC Address
     * 
     */
    public Output<Map<String,EvpnTopologySwitches>> switches() {
        return this.switches;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EvpnTopology(java.lang.String name) {
        this(name, EvpnTopologyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EvpnTopology(java.lang.String name, EvpnTopologyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EvpnTopology(java.lang.String name, EvpnTopologyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:site/evpnTopology:EvpnTopology", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private EvpnTopology(java.lang.String name, Output<java.lang.String> id, @Nullable EvpnTopologyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:site/evpnTopology:EvpnTopology", name, state, makeResourceOptions(options, id), false);
    }

    private static EvpnTopologyArgs makeArgs(EvpnTopologyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? EvpnTopologyArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/pulumi/pulumi-junipermist")
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
    public static EvpnTopology get(java.lang.String name, Output<java.lang.String> id, @Nullable EvpnTopologyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EvpnTopology(name, id, state, options);
    }
}
