// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.org.GatewaytemplateArgs;
import com.pulumi.junipermist.org.inputs.GatewaytemplateState;
import com.pulumi.junipermist.org.outputs.GatewaytemplateBgpConfig;
import com.pulumi.junipermist.org.outputs.GatewaytemplateDhcpdConfig;
import com.pulumi.junipermist.org.outputs.GatewaytemplateExtraRoutes6;
import com.pulumi.junipermist.org.outputs.GatewaytemplateExtraRoutes;
import com.pulumi.junipermist.org.outputs.GatewaytemplateIdpProfiles;
import com.pulumi.junipermist.org.outputs.GatewaytemplateIpConfigs;
import com.pulumi.junipermist.org.outputs.GatewaytemplateNetwork;
import com.pulumi.junipermist.org.outputs.GatewaytemplateOobIpConfig;
import com.pulumi.junipermist.org.outputs.GatewaytemplatePathPreferences;
import com.pulumi.junipermist.org.outputs.GatewaytemplatePortConfig;
import com.pulumi.junipermist.org.outputs.GatewaytemplateRoutingPolicies;
import com.pulumi.junipermist.org.outputs.GatewaytemplateServicePolicy;
import com.pulumi.junipermist.org.outputs.GatewaytemplateTunnelConfigs;
import com.pulumi.junipermist.org.outputs.GatewaytemplateTunnelProviderOptions;
import com.pulumi.junipermist.org.outputs.GatewaytemplateVrfConfig;
import com.pulumi.junipermist.org.outputs.GatewaytemplateVrfInstances;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource manages the Gateway Templates.A Gateway template is used to define the static ip address and subnet mask of the hub device, along with the gateway. It also allows for the selection of options such as enabling source nat and overriding the public ip for the hub if needed. the endpoint selected in the gateway template ties the hub and spoke devices together and creates the auto-vpn tunnel.
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
 * import com.pulumi.junipermist.org.Gatewaytemplate;
 * import com.pulumi.junipermist.org.GatewaytemplateArgs;
 * import com.pulumi.junipermist.org.inputs.GatewaytemplateServicePolicyArgs;
 * import com.pulumi.junipermist.org.inputs.GatewaytemplateServicePolicyIdpArgs;
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
 *         var gatewaytemplateOne = new Gatewaytemplate("gatewaytemplateOne", GatewaytemplateArgs.builder()
 *             .type("spoke")
 *             .name("gatewaytemplate_one")
 *             .orgId(terraformTest.id())
 *             .portConfig(Map.ofEntries(
 *                 Map.entry("ge-0/0/3", Map.ofEntries(
 *                     Map.entry("name", "FTTH"),
 *                     Map.entry("usage", "wan"),
 *                     Map.entry("aggregated", false),
 *                     Map.entry("redundant", false),
 *                     Map.entry("critical", false),
 *                     Map.entry("wanType", "broadband"),
 *                     Map.entry("ipConfig", Map.ofEntries(
 *                         Map.entry("type", "static"),
 *                         Map.entry("ip", "192.168.1.8"),
 *                         Map.entry("netmask", "/24"),
 *                         Map.entry("gateway", "192.168.1.1")
 *                     )),
 *                     Map.entry("disableAutoneg", false),
 *                     Map.entry("speed", "auto"),
 *                     Map.entry("duplex", "auto"),
 *                     Map.entry("wanSourceNat", Map.of("disabled", false)),
 *                     Map.entry("vpnPaths", Map.of("SSR_HUB_DC-MPLS.OrgOverlay", Map.ofEntries(
 *                         Map.entry("key", 0),
 *                         Map.entry("role", "spoke"),
 *                         Map.entry("bfdProfile", "broadband")
 *                     )))
 *                 )),
 *                 Map.entry("ge-0/0/5", Map.ofEntries(
 *                     Map.entry("usage", "lan"),
 *                     Map.entry("critical", false),
 *                     Map.entry("aggregated", true),
 *                     Map.entry("aeDisableLacp", false),
 *                     Map.entry("aeLacpForceUp", true),
 *                     Map.entry("aeIdx", 0),
 *                     Map.entry("redundant", false),
 *                     Map.entry("networks",                     
 *                         "PRD-Core",
 *                         "PRD-Mgmt",
 *                         "PRD-Lab")
 *                 ))
 *             ))
 *             .ipConfigs(Map.ofEntries(
 *                 Map.entry("PRD-Core", Map.ofEntries(
 *                     Map.entry("type", "static"),
 *                     Map.entry("ip", "10.3.100.9"),
 *                     Map.entry("netmask", "/24")
 *                 )),
 *                 Map.entry("PRD-Mgmt", Map.ofEntries(
 *                     Map.entry("type", "static"),
 *                     Map.entry("ip", "10.3.172.1"),
 *                     Map.entry("netmask", "/24")
 *                 )),
 *                 Map.entry("PRD-Lab", Map.ofEntries(
 *                     Map.entry("type", "static"),
 *                     Map.entry("ip", "10.3.171.1"),
 *                     Map.entry("netmask", "/24")
 *                 ))
 *             ))
 *             .servicePolicies(GatewaytemplateServicePolicyArgs.builder()
 *                 .name("Policy-14")
 *                 .tenants("PRD-Core")
 *                 .services("any")
 *                 .action("allow")
 *                 .path_preference("HUB")
 *                 .idp(GatewaytemplateServicePolicyIdpArgs.builder()
 *                     .enabled(true)
 *                     .profile("critical")
 *                     .alertOnly(false)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="junipermist:org/gatewaytemplate:Gatewaytemplate")
public class Gatewaytemplate extends com.pulumi.resources.CustomResource {
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
    @Export(name="bgpConfig", refs={Map.class,String.class,GatewaytemplateBgpConfig.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,GatewaytemplateBgpConfig>> bgpConfig;

    public Output<Optional<Map<String,GatewaytemplateBgpConfig>>> bgpConfig() {
        return Codegen.optional(this.bgpConfig);
    }
    @Export(name="dhcpdConfig", refs={GatewaytemplateDhcpdConfig.class}, tree="[0]")
    private Output</* @Nullable */ GatewaytemplateDhcpdConfig> dhcpdConfig;

    public Output<Optional<GatewaytemplateDhcpdConfig>> dhcpdConfig() {
        return Codegen.optional(this.dhcpdConfig);
    }
    @Export(name="dnsOverride", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> dnsOverride;

    public Output<Boolean> dnsOverride() {
        return this.dnsOverride;
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
    @Export(name="extraRoutes", refs={Map.class,String.class,GatewaytemplateExtraRoutes.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,GatewaytemplateExtraRoutes>> extraRoutes;

    /**
     * @return Property key is the destination CIDR (e.g. &#34;10.0.0.0/8&#34;)
     * 
     */
    public Output<Optional<Map<String,GatewaytemplateExtraRoutes>>> extraRoutes() {
        return Codegen.optional(this.extraRoutes);
    }
    /**
     * Property key is the destination CIDR (e.g. &#34;2a02:1234:420a:10c9::/64&#34;)
     * 
     */
    @Export(name="extraRoutes6", refs={Map.class,String.class,GatewaytemplateExtraRoutes6.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,GatewaytemplateExtraRoutes6>> extraRoutes6;

    /**
     * @return Property key is the destination CIDR (e.g. &#34;2a02:1234:420a:10c9::/64&#34;)
     * 
     */
    public Output<Optional<Map<String,GatewaytemplateExtraRoutes6>>> extraRoutes6() {
        return Codegen.optional(this.extraRoutes6);
    }
    /**
     * Property key is the profile name
     * 
     */
    @Export(name="idpProfiles", refs={Map.class,String.class,GatewaytemplateIdpProfiles.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,GatewaytemplateIdpProfiles>> idpProfiles;

    /**
     * @return Property key is the profile name
     * 
     */
    public Output<Optional<Map<String,GatewaytemplateIdpProfiles>>> idpProfiles() {
        return Codegen.optional(this.idpProfiles);
    }
    /**
     * Property key is the network name
     * 
     */
    @Export(name="ipConfigs", refs={Map.class,String.class,GatewaytemplateIpConfigs.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,GatewaytemplateIpConfigs>> ipConfigs;

    /**
     * @return Property key is the network name
     * 
     */
    public Output<Optional<Map<String,GatewaytemplateIpConfigs>>> ipConfigs() {
        return Codegen.optional(this.ipConfigs);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="networks", refs={List.class,GatewaytemplateNetwork.class}, tree="[0,1]")
    private Output</* @Nullable */ List<GatewaytemplateNetwork>> networks;

    public Output<Optional<List<GatewaytemplateNetwork>>> networks() {
        return Codegen.optional(this.networks);
    }
    @Export(name="ntpOverride", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> ntpOverride;

    public Output<Boolean> ntpOverride() {
        return this.ntpOverride;
    }
    /**
     * list of NTP servers specific to this device. By default, those in Site Settings will be used
     * 
     */
    @Export(name="ntpServers", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> ntpServers;

    /**
     * @return list of NTP servers specific to this device. By default, those in Site Settings will be used
     * 
     */
    public Output<Optional<List<String>>> ntpServers() {
        return Codegen.optional(this.ntpServers);
    }
    /**
     * out-of-band (vme/em0/fxp0) IP config
     * 
     */
    @Export(name="oobIpConfig", refs={GatewaytemplateOobIpConfig.class}, tree="[0]")
    private Output</* @Nullable */ GatewaytemplateOobIpConfig> oobIpConfig;

    /**
     * @return out-of-band (vme/em0/fxp0) IP config
     * 
     */
    public Output<Optional<GatewaytemplateOobIpConfig>> oobIpConfig() {
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
    @Export(name="pathPreferences", refs={Map.class,String.class,GatewaytemplatePathPreferences.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,GatewaytemplatePathPreferences>> pathPreferences;

    /**
     * @return Property key is the path name
     * 
     */
    public Output<Optional<Map<String,GatewaytemplatePathPreferences>>> pathPreferences() {
        return Codegen.optional(this.pathPreferences);
    }
    /**
     * Property key is the port(s) name or range (e.g. &#34;ge-0/0/0-10&#34;)
     * 
     */
    @Export(name="portConfig", refs={Map.class,String.class,GatewaytemplatePortConfig.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,GatewaytemplatePortConfig>> portConfig;

    /**
     * @return Property key is the port(s) name or range (e.g. &#34;ge-0/0/0-10&#34;)
     * 
     */
    public Output<Optional<Map<String,GatewaytemplatePortConfig>>> portConfig() {
        return Codegen.optional(this.portConfig);
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
    @Export(name="routingPolicies", refs={Map.class,String.class,GatewaytemplateRoutingPolicies.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,GatewaytemplateRoutingPolicies>> routingPolicies;

    /**
     * @return Property key is the routing policy name
     * 
     */
    public Output<Optional<Map<String,GatewaytemplateRoutingPolicies>>> routingPolicies() {
        return Codegen.optional(this.routingPolicies);
    }
    @Export(name="servicePolicies", refs={List.class,GatewaytemplateServicePolicy.class}, tree="[0,1]")
    private Output</* @Nullable */ List<GatewaytemplateServicePolicy>> servicePolicies;

    public Output<Optional<List<GatewaytemplateServicePolicy>>> servicePolicies() {
        return Codegen.optional(this.servicePolicies);
    }
    /**
     * Property key is the tunnel name
     * 
     */
    @Export(name="tunnelConfigs", refs={Map.class,String.class,GatewaytemplateTunnelConfigs.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,GatewaytemplateTunnelConfigs>> tunnelConfigs;

    /**
     * @return Property key is the tunnel name
     * 
     */
    public Output<Optional<Map<String,GatewaytemplateTunnelConfigs>>> tunnelConfigs() {
        return Codegen.optional(this.tunnelConfigs);
    }
    @Export(name="tunnelProviderOptions", refs={GatewaytemplateTunnelProviderOptions.class}, tree="[0]")
    private Output</* @Nullable */ GatewaytemplateTunnelProviderOptions> tunnelProviderOptions;

    public Output<Optional<GatewaytemplateTunnelProviderOptions>> tunnelProviderOptions() {
        return Codegen.optional(this.tunnelProviderOptions);
    }
    /**
     * enum: `spoke`, `standalone`
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return enum: `spoke`, `standalone`
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    @Export(name="vrfConfig", refs={GatewaytemplateVrfConfig.class}, tree="[0]")
    private Output</* @Nullable */ GatewaytemplateVrfConfig> vrfConfig;

    public Output<Optional<GatewaytemplateVrfConfig>> vrfConfig() {
        return Codegen.optional(this.vrfConfig);
    }
    /**
     * Property key is the network name
     * 
     */
    @Export(name="vrfInstances", refs={Map.class,String.class,GatewaytemplateVrfInstances.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,GatewaytemplateVrfInstances>> vrfInstances;

    /**
     * @return Property key is the network name
     * 
     */
    public Output<Optional<Map<String,GatewaytemplateVrfInstances>>> vrfInstances() {
        return Codegen.optional(this.vrfInstances);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Gatewaytemplate(java.lang.String name) {
        this(name, GatewaytemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Gatewaytemplate(java.lang.String name, GatewaytemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Gatewaytemplate(java.lang.String name, GatewaytemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/gatewaytemplate:Gatewaytemplate", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Gatewaytemplate(java.lang.String name, Output<java.lang.String> id, @Nullable GatewaytemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/gatewaytemplate:Gatewaytemplate", name, state, makeResourceOptions(options, id), false);
    }

    private static GatewaytemplateArgs makeArgs(GatewaytemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GatewaytemplateArgs.Empty : args;
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
    public static Gatewaytemplate get(java.lang.String name, Output<java.lang.String> id, @Nullable GatewaytemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Gatewaytemplate(name, id, state, options);
    }
}
