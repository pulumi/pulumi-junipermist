// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.device.GatewayArgs;
import com.pulumi.junipermist.device.inputs.GatewayState;
import com.pulumi.junipermist.device.outputs.GatewayBgpConfig;
import com.pulumi.junipermist.device.outputs.GatewayDhcpdConfig;
import com.pulumi.junipermist.device.outputs.GatewayExtraRoutes6;
import com.pulumi.junipermist.device.outputs.GatewayExtraRoutes;
import com.pulumi.junipermist.device.outputs.GatewayIdpProfiles;
import com.pulumi.junipermist.device.outputs.GatewayIpConfigs;
import com.pulumi.junipermist.device.outputs.GatewayNetwork;
import com.pulumi.junipermist.device.outputs.GatewayOobIpConfig;
import com.pulumi.junipermist.device.outputs.GatewayPathPreferences;
import com.pulumi.junipermist.device.outputs.GatewayPortConfig;
import com.pulumi.junipermist.device.outputs.GatewayPortMirroring;
import com.pulumi.junipermist.device.outputs.GatewayRoutingPolicies;
import com.pulumi.junipermist.device.outputs.GatewayServicePolicy;
import com.pulumi.junipermist.device.outputs.GatewayTunnelConfigs;
import com.pulumi.junipermist.device.outputs.GatewayTunnelProviderOptions;
import com.pulumi.junipermist.device.outputs.GatewayVrfConfig;
import com.pulumi.junipermist.device.outputs.GatewayVrfInstances;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource manages the Gateway configuration.
 * It can be used to define specific configuration at the device level or to override Org Gateway template settings.
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
 * import com.pulumi.junipermist.device.Gateway;
 * import com.pulumi.junipermist.device.GatewayArgs;
 * import com.pulumi.junipermist.device.inputs.GatewayOobIpConfigArgs;
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
 *         var gatewayOne = new Gateway("gatewayOne", GatewayArgs.builder()
 *             .name("gateway_one")
 *             .deviceId(clusterOne.deviceId())
 *             .siteId(clusterOne.siteId())
 *             .oobIpConfig(GatewayOobIpConfigArgs.builder()
 *                 .type("dhcp")
 *                 .build())
 *             .dnsServers("8.8.8.8")
 *             .additionalConfigCmds(            
 *                 "annotate system \" -- custom-main -- Template level --\"",
 *                 "delete apply-groups custom-main",
 *                 "delete groups custom-main",
 *                 "set groups custom-main",
 *                 "set groups custom-main system services ssh root-login allow",
 *                 "set apply-groups custom-main")
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
 * Using `pulumi import`, import `mist_device_gateway` with:
 * 
 * Gateway Configuration can be imported by specifying the site_id and the device_id
 * 
 * ```sh
 * $ pulumi import junipermist:device/gateway:Gateway gateway_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 * 
 */
@ResourceType(type="junipermist:device/gateway:Gateway")
public class Gateway extends com.pulumi.resources.CustomResource {
    /**
     * additional CLI commands to append to the generated Junos config **Note**: no check is done
     * 
     */
    @Export(name="additionalConfigCmds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> additionalConfigCmds;

    /**
     * @return additional CLI commands to append to the generated Junos config **Note**: no check is done
     * 
     */
    public Output<Optional<List<String>>> additionalConfigCmds() {
        return Codegen.optional(this.additionalConfigCmds);
    }
    @Export(name="bgpConfig", refs={Map.class,String.class,GatewayBgpConfig.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,GatewayBgpConfig>> bgpConfig;

    public Output<Optional<Map<String,GatewayBgpConfig>>> bgpConfig() {
        return Codegen.optional(this.bgpConfig);
    }
    @Export(name="deviceId", refs={String.class}, tree="[0]")
    private Output<String> deviceId;

    public Output<String> deviceId() {
        return this.deviceId;
    }
    @Export(name="dhcpdConfig", refs={GatewayDhcpdConfig.class}, tree="[0]")
    private Output</* @Nullable */ GatewayDhcpdConfig> dhcpdConfig;

    public Output<Optional<GatewayDhcpdConfig>> dhcpdConfig() {
        return Codegen.optional(this.dhcpdConfig);
    }
    /**
     * Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
     * 
     */
    @Export(name="dnsServers", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> dnsServers;

    /**
     * @return Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
     * 
     */
    public Output<Optional<List<String>>> dnsServers() {
        return Codegen.optional(this.dnsServers);
    }
    /**
     * Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
     * 
     */
    @Export(name="dnsSuffixes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> dnsSuffixes;

    /**
     * @return Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
     * 
     */
    public Output<Optional<List<String>>> dnsSuffixes() {
        return Codegen.optional(this.dnsSuffixes);
    }
    /**
     * Property key is the destination CIDR (e.g. &#34;10.0.0.0/8&#34;)
     * 
     */
    @Export(name="extraRoutes", refs={Map.class,String.class,GatewayExtraRoutes.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,GatewayExtraRoutes>> extraRoutes;

    /**
     * @return Property key is the destination CIDR (e.g. &#34;10.0.0.0/8&#34;)
     * 
     */
    public Output<Optional<Map<String,GatewayExtraRoutes>>> extraRoutes() {
        return Codegen.optional(this.extraRoutes);
    }
    /**
     * Property key is the destination CIDR (e.g. &#34;2a02:1234:420a:10c9::/64&#34;)
     * 
     */
    @Export(name="extraRoutes6", refs={Map.class,String.class,GatewayExtraRoutes6.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,GatewayExtraRoutes6>> extraRoutes6;

    /**
     * @return Property key is the destination CIDR (e.g. &#34;2a02:1234:420a:10c9::/64&#34;)
     * 
     */
    public Output<Optional<Map<String,GatewayExtraRoutes6>>> extraRoutes6() {
        return Codegen.optional(this.extraRoutes6);
    }
    /**
     * Property key is the profile name
     * 
     */
    @Export(name="idpProfiles", refs={Map.class,String.class,GatewayIdpProfiles.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,GatewayIdpProfiles>> idpProfiles;

    /**
     * @return Property key is the profile name
     * 
     */
    public Output<Optional<Map<String,GatewayIdpProfiles>>> idpProfiles() {
        return Codegen.optional(this.idpProfiles);
    }
    @Export(name="image1Url", refs={String.class}, tree="[0]")
    private Output<String> image1Url;

    public Output<String> image1Url() {
        return this.image1Url;
    }
    @Export(name="image2Url", refs={String.class}, tree="[0]")
    private Output<String> image2Url;

    public Output<String> image2Url() {
        return this.image2Url;
    }
    @Export(name="image3Url", refs={String.class}, tree="[0]")
    private Output<String> image3Url;

    public Output<String> image3Url() {
        return this.image3Url;
    }
    /**
     * Property key is the network name
     * 
     */
    @Export(name="ipConfigs", refs={Map.class,String.class,GatewayIpConfigs.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,GatewayIpConfigs>> ipConfigs;

    /**
     * @return Property key is the network name
     * 
     */
    public Output<Optional<Map<String,GatewayIpConfigs>>> ipConfigs() {
        return Codegen.optional(this.ipConfigs);
    }
    /**
     * device MAC address
     * 
     */
    @Export(name="mac", refs={String.class}, tree="[0]")
    private Output<String> mac;

    /**
     * @return device MAC address
     * 
     */
    public Output<String> mac() {
        return this.mac;
    }
    @Export(name="managed", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> managed;

    public Output<Optional<Boolean>> managed() {
        return Codegen.optional(this.managed);
    }
    /**
     * map where the device belongs to
     * 
     */
    @Export(name="mapId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> mapId;

    /**
     * @return map where the device belongs to
     * 
     */
    public Output<Optional<String>> mapId() {
        return Codegen.optional(this.mapId);
    }
    /**
     * device Model
     * 
     */
    @Export(name="model", refs={String.class}, tree="[0]")
    private Output<String> model;

    /**
     * @return device Model
     * 
     */
    public Output<String> model() {
        return this.model;
    }
    @Export(name="mspId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> mspId;

    public Output<Optional<String>> mspId() {
        return Codegen.optional(this.mspId);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="networks", refs={List.class,GatewayNetwork.class}, tree="[0,1]")
    private Output</* @Nullable */ List<GatewayNetwork>> networks;

    public Output<Optional<List<GatewayNetwork>>> networks() {
        return Codegen.optional(this.networks);
    }
    @Export(name="notes", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> notes;

    public Output<Optional<String>> notes() {
        return Codegen.optional(this.notes);
    }
    @Export(name="ntpServers", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> ntpServers;

    public Output<Optional<List<String>>> ntpServers() {
        return Codegen.optional(this.ntpServers);
    }
    /**
     * out-of-band (vme/em0/fxp0) IP config
     * 
     */
    @Export(name="oobIpConfig", refs={GatewayOobIpConfig.class}, tree="[0]")
    private Output</* @Nullable */ GatewayOobIpConfig> oobIpConfig;

    /**
     * @return out-of-band (vme/em0/fxp0) IP config
     * 
     */
    public Output<Optional<GatewayOobIpConfig>> oobIpConfig() {
        return Codegen.optional(this.oobIpConfig);
    }
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * Property key is the path name
     * 
     */
    @Export(name="pathPreferences", refs={Map.class,String.class,GatewayPathPreferences.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,GatewayPathPreferences>> pathPreferences;

    /**
     * @return Property key is the path name
     * 
     */
    public Output<Optional<Map<String,GatewayPathPreferences>>> pathPreferences() {
        return Codegen.optional(this.pathPreferences);
    }
    /**
     * Property key is the port name or range (e.g. &#34;ge-0/0/0-10&#34;)
     * 
     */
    @Export(name="portConfig", refs={Map.class,String.class,GatewayPortConfig.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,GatewayPortConfig>> portConfig;

    /**
     * @return Property key is the port name or range (e.g. &#34;ge-0/0/0-10&#34;)
     * 
     */
    public Output<Optional<Map<String,GatewayPortConfig>>> portConfig() {
        return Codegen.optional(this.portConfig);
    }
    @Export(name="portMirroring", refs={GatewayPortMirroring.class}, tree="[0]")
    private Output</* @Nullable */ GatewayPortMirroring> portMirroring;

    public Output<Optional<GatewayPortMirroring>> portMirroring() {
        return Codegen.optional(this.portMirroring);
    }
    /**
     * auto assigned if not set
     * 
     */
    @Export(name="routerId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> routerId;

    /**
     * @return auto assigned if not set
     * 
     */
    public Output<Optional<String>> routerId() {
        return Codegen.optional(this.routerId);
    }
    /**
     * Property key is the routing policy name
     * 
     */
    @Export(name="routingPolicies", refs={Map.class,String.class,GatewayRoutingPolicies.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,GatewayRoutingPolicies>> routingPolicies;

    /**
     * @return Property key is the routing policy name
     * 
     */
    public Output<Optional<Map<String,GatewayRoutingPolicies>>> routingPolicies() {
        return Codegen.optional(this.routingPolicies);
    }
    /**
     * device Serial
     * 
     */
    @Export(name="serial", refs={String.class}, tree="[0]")
    private Output<String> serial;

    /**
     * @return device Serial
     * 
     */
    public Output<String> serial() {
        return this.serial;
    }
    @Export(name="servicePolicies", refs={List.class,GatewayServicePolicy.class}, tree="[0,1]")
    private Output</* @Nullable */ List<GatewayServicePolicy>> servicePolicies;

    public Output<Optional<List<GatewayServicePolicy>>> servicePolicies() {
        return Codegen.optional(this.servicePolicies);
    }
    @Export(name="siteId", refs={String.class}, tree="[0]")
    private Output<String> siteId;

    public Output<String> siteId() {
        return this.siteId;
    }
    /**
     * Property key is the tunnel name
     * 
     */
    @Export(name="tunnelConfigs", refs={Map.class,String.class,GatewayTunnelConfigs.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,GatewayTunnelConfigs>> tunnelConfigs;

    /**
     * @return Property key is the tunnel name
     * 
     */
    public Output<Optional<Map<String,GatewayTunnelConfigs>>> tunnelConfigs() {
        return Codegen.optional(this.tunnelConfigs);
    }
    @Export(name="tunnelProviderOptions", refs={GatewayTunnelProviderOptions.class}, tree="[0]")
    private Output</* @Nullable */ GatewayTunnelProviderOptions> tunnelProviderOptions;

    public Output<Optional<GatewayTunnelProviderOptions>> tunnelProviderOptions() {
        return Codegen.optional(this.tunnelProviderOptions);
    }
    /**
     * Device Type. enum: `gateway`
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Device Type. enum: `gateway`
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * a dictionary of name-&gt;value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     * 
     */
    @Export(name="vars", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> vars;

    /**
     * @return a dictionary of name-&gt;value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     * 
     */
    public Output<Optional<Map<String,String>>> vars() {
        return Codegen.optional(this.vars);
    }
    @Export(name="vrfConfig", refs={GatewayVrfConfig.class}, tree="[0]")
    private Output</* @Nullable */ GatewayVrfConfig> vrfConfig;

    public Output<Optional<GatewayVrfConfig>> vrfConfig() {
        return Codegen.optional(this.vrfConfig);
    }
    /**
     * Property key is the network name
     * 
     */
    @Export(name="vrfInstances", refs={Map.class,String.class,GatewayVrfInstances.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,GatewayVrfInstances>> vrfInstances;

    /**
     * @return Property key is the network name
     * 
     */
    public Output<Optional<Map<String,GatewayVrfInstances>>> vrfInstances() {
        return Codegen.optional(this.vrfInstances);
    }
    /**
     * x in pixel
     * 
     */
    @Export(name="x", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> x;

    /**
     * @return x in pixel
     * 
     */
    public Output<Optional<Double>> x() {
        return Codegen.optional(this.x);
    }
    /**
     * y in pixel
     * 
     */
    @Export(name="y", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> y;

    /**
     * @return y in pixel
     * 
     */
    public Output<Optional<Double>> y() {
        return Codegen.optional(this.y);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Gateway(java.lang.String name) {
        this(name, GatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Gateway(java.lang.String name, GatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Gateway(java.lang.String name, GatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:device/gateway:Gateway", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Gateway(java.lang.String name, Output<java.lang.String> id, @Nullable GatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:device/gateway:Gateway", name, state, makeResourceOptions(options, id), false);
    }

    private static GatewayArgs makeArgs(GatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GatewayArgs.Empty : args;
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
    public static Gateway get(java.lang.String name, Output<java.lang.String> id, @Nullable GatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Gateway(name, id, state, options);
    }
}
