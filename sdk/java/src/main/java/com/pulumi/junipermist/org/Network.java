// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.org.NetworkArgs;
import com.pulumi.junipermist.org.inputs.NetworkState;
import com.pulumi.junipermist.org.outputs.NetworkInternalAccess;
import com.pulumi.junipermist.org.outputs.NetworkInternetAccess;
import com.pulumi.junipermist.org.outputs.NetworkMulticast;
import com.pulumi.junipermist.org.outputs.NetworkTenants;
import com.pulumi.junipermist.org.outputs.NetworkVpnAccess;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource manages the WAN Assurance Networks.
 * 
 * The Networks are used in the `service_policies` from the Gateway configuration, Gateway templates or HUB Profiles
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
 * import com.pulumi.junipermist.org.Network;
 * import com.pulumi.junipermist.org.NetworkArgs;
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
 *         var networkOne = new Network("networkOne", NetworkArgs.builder()
 *             .orgId(terraformTest.id())
 *             .name("network_one")
 *             .subnet("10.4.0.0/24")
 *             .disallowMistServices(false)
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
 * Using `pulumi import`, import `mist_org_network` with:
 * 
 * Org Network can be imported by specifying the org_id and the network_id
 * 
 * ```sh
 * $ pulumi import junipermist:org/network:Network network_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 * 
 */
@ResourceType(type="junipermist:org/network:Network")
public class Network extends com.pulumi.resources.CustomResource {
    /**
     * Whether to disallow Mist Devices in the network
     * 
     */
    @Export(name="disallowMistServices", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> disallowMistServices;

    /**
     * @return Whether to disallow Mist Devices in the network
     * 
     */
    public Output<Boolean> disallowMistServices() {
        return this.disallowMistServices;
    }
    @Export(name="gateway", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> gateway;

    public Output<Optional<String>> gateway() {
        return Codegen.optional(this.gateway);
    }
    @Export(name="gateway6", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> gateway6;

    public Output<Optional<String>> gateway6() {
        return Codegen.optional(this.gateway6);
    }
    @Export(name="internalAccess", refs={NetworkInternalAccess.class}, tree="[0]")
    private Output</* @Nullable */ NetworkInternalAccess> internalAccess;

    public Output<Optional<NetworkInternalAccess>> internalAccess() {
        return Codegen.optional(this.internalAccess);
    }
    /**
     * Whether this network has direct internet access
     * 
     */
    @Export(name="internetAccess", refs={NetworkInternetAccess.class}, tree="[0]")
    private Output</* @Nullable */ NetworkInternetAccess> internetAccess;

    /**
     * @return Whether this network has direct internet access
     * 
     */
    public Output<Optional<NetworkInternetAccess>> internetAccess() {
        return Codegen.optional(this.internetAccess);
    }
    /**
     * Whether to allow clients in the network to talk to each other
     * 
     */
    @Export(name="isolation", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isolation;

    /**
     * @return Whether to allow clients in the network to talk to each other
     * 
     */
    public Output<Optional<Boolean>> isolation() {
        return Codegen.optional(this.isolation);
    }
    /**
     * Whether to enable multicast support (only PIM-sparse mode is supported)
     * 
     */
    @Export(name="multicast", refs={NetworkMulticast.class}, tree="[0]")
    private Output</* @Nullable */ NetworkMulticast> multicast;

    /**
     * @return Whether to enable multicast support (only PIM-sparse mode is supported)
     * 
     */
    public Output<Optional<NetworkMulticast>> multicast() {
        return Codegen.optional(this.multicast);
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
     * For a Network (usually LAN), it can be routable to other networks (e.g. OSPF)
     * 
     */
    @Export(name="routedForNetworks", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> routedForNetworks;

    /**
     * @return For a Network (usually LAN), it can be routable to other networks (e.g. OSPF)
     * 
     */
    public Output<List<String>> routedForNetworks() {
        return this.routedForNetworks;
    }
    @Export(name="subnet", refs={String.class}, tree="[0]")
    private Output<String> subnet;

    public Output<String> subnet() {
        return this.subnet;
    }
    @Export(name="subnet6", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> subnet6;

    public Output<Optional<String>> subnet6() {
        return Codegen.optional(this.subnet6);
    }
    /**
     * Property key must be the user/tenant name (i.e. &#34;printer-1&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    @Export(name="tenants", refs={Map.class,String.class,NetworkTenants.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,NetworkTenants>> tenants;

    /**
     * @return Property key must be the user/tenant name (i.e. &#34;printer-1&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    public Output<Optional<Map<String,NetworkTenants>>> tenants() {
        return Codegen.optional(this.tenants);
    }
    @Export(name="vlanId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vlanId;

    public Output<Optional<String>> vlanId() {
        return Codegen.optional(this.vlanId);
    }
    /**
     * Property key is the VPN name. Whether this network can be accessed from vpn
     * 
     */
    @Export(name="vpnAccess", refs={Map.class,String.class,NetworkVpnAccess.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,NetworkVpnAccess>> vpnAccess;

    /**
     * @return Property key is the VPN name. Whether this network can be accessed from vpn
     * 
     */
    public Output<Optional<Map<String,NetworkVpnAccess>>> vpnAccess() {
        return Codegen.optional(this.vpnAccess);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Network(java.lang.String name) {
        this(name, NetworkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Network(java.lang.String name, NetworkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Network(java.lang.String name, NetworkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/network:Network", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Network(java.lang.String name, Output<java.lang.String> id, @Nullable NetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/network:Network", name, state, makeResourceOptions(options, id), false);
    }

    private static NetworkArgs makeArgs(NetworkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NetworkArgs.Empty : args;
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
    public static Network get(java.lang.String name, Output<java.lang.String> id, @Nullable NetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Network(name, id, state, options);
    }
}
