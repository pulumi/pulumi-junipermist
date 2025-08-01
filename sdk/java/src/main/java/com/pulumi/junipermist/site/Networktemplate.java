// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.site.NetworktemplateArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateState;
import com.pulumi.junipermist.site.outputs.NetworktemplateAclPolicy;
import com.pulumi.junipermist.site.outputs.NetworktemplateAclTags;
import com.pulumi.junipermist.site.outputs.NetworktemplateDhcpSnooping;
import com.pulumi.junipermist.site.outputs.NetworktemplateExtraRoutes6;
import com.pulumi.junipermist.site.outputs.NetworktemplateExtraRoutes;
import com.pulumi.junipermist.site.outputs.NetworktemplateMistNac;
import com.pulumi.junipermist.site.outputs.NetworktemplateNetworks;
import com.pulumi.junipermist.site.outputs.NetworktemplateOspfAreas;
import com.pulumi.junipermist.site.outputs.NetworktemplatePortMirroring;
import com.pulumi.junipermist.site.outputs.NetworktemplatePortUsages;
import com.pulumi.junipermist.site.outputs.NetworktemplateRadiusConfig;
import com.pulumi.junipermist.site.outputs.NetworktemplateRemoteSyslog;
import com.pulumi.junipermist.site.outputs.NetworktemplateSnmpConfig;
import com.pulumi.junipermist.site.outputs.NetworktemplateSwitchMatching;
import com.pulumi.junipermist.site.outputs.NetworktemplateSwitchMgmt;
import com.pulumi.junipermist.site.outputs.NetworktemplateVrfConfig;
import com.pulumi.junipermist.site.outputs.NetworktemplateVrfInstances;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource manages the Site Network configuration (Switch configuration).
 * 
 * The Site Network template can be used to override the Org Network template assign to the site, or to configure common switch settings across the site without having to create an Org Network template.
 * 
 * &gt; When using the Mist APIs, all the switch settings defined at the site level are stored under the site settings with all the rest of the site configuration (`/api/v1/sites/{site_id}/setting` Mist API Endpoint). To simplify this resource, the `junipermist.site.Networktemplate` resource has been created to centralize all the site level switches related settings.
 * 
 * !&gt; Only ONE `junipermist.site.Networktemplate` resource can be configured per site. If multiple ones are configured, only the last one defined we be successfully deployed to Mist
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `mist_site_networktemplate` with:
 * 
 * Site Network Template can be imported by specifying the site_id
 * 
 * ```sh
 * $ pulumi import junipermist:site/networktemplate:Networktemplate networktemplate_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a
 * ```
 * 
 */
@ResourceType(type="junipermist:site/networktemplate:Networktemplate")
public class Networktemplate extends com.pulumi.resources.CustomResource {
    @Export(name="aclPolicies", refs={List.class,NetworktemplateAclPolicy.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NetworktemplateAclPolicy>> aclPolicies;

    public Output<Optional<List<NetworktemplateAclPolicy>>> aclPolicies() {
        return Codegen.optional(this.aclPolicies);
    }
    /**
     * ACL Tags to identify traffic source or destination. Key name is the tag name
     * 
     */
    @Export(name="aclTags", refs={Map.class,String.class,NetworktemplateAclTags.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,NetworktemplateAclTags>> aclTags;

    /**
     * @return ACL Tags to identify traffic source or destination. Key name is the tag name
     * 
     */
    public Output<Optional<Map<String,NetworktemplateAclTags>>> aclTags() {
        return Codegen.optional(this.aclTags);
    }
    /**
     * additional CLI commands to append to the generated Junos config. **Note**: no check is done
     * 
     */
    @Export(name="additionalConfigCmds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> additionalConfigCmds;

    /**
     * @return additional CLI commands to append to the generated Junos config. **Note**: no check is done
     * 
     */
    public Output<Optional<List<String>>> additionalConfigCmds() {
        return Codegen.optional(this.additionalConfigCmds);
    }
    @Export(name="autoUpgradeLinecard", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> autoUpgradeLinecard;

    public Output<Boolean> autoUpgradeLinecard() {
        return this.autoUpgradeLinecard;
    }
    /**
     * Port usage to assign to switch ports without any port usage assigned. Default: `default` to preserve default behavior
     * 
     */
    @Export(name="defaultPortUsage", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> defaultPortUsage;

    /**
     * @return Port usage to assign to switch ports without any port usage assigned. Default: `default` to preserve default behavior
     * 
     */
    public Output<Optional<String>> defaultPortUsage() {
        return Codegen.optional(this.defaultPortUsage);
    }
    @Export(name="dhcpSnooping", refs={NetworktemplateDhcpSnooping.class}, tree="[0]")
    private Output</* @Nullable */ NetworktemplateDhcpSnooping> dhcpSnooping;

    public Output<Optional<NetworktemplateDhcpSnooping>> dhcpSnooping() {
        return Codegen.optional(this.dhcpSnooping);
    }
    /**
     * If some system-default port usages are not desired - namely, ap / iot / uplink
     * 
     */
    @Export(name="disabledSystemDefinedPortUsages", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> disabledSystemDefinedPortUsages;

    /**
     * @return If some system-default port usages are not desired - namely, ap / iot / uplink
     * 
     */
    public Output<Optional<List<String>>> disabledSystemDefinedPortUsages() {
        return Codegen.optional(this.disabledSystemDefinedPortUsages);
    }
    /**
     * Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
     * 
     */
    @Export(name="dnsServers", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> dnsServers;

    /**
     * @return Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
     * 
     */
    public Output<List<String>> dnsServers() {
        return this.dnsServers;
    }
    /**
     * Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
     * 
     */
    @Export(name="dnsSuffixes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> dnsSuffixes;

    /**
     * @return Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
     * 
     */
    public Output<List<String>> dnsSuffixes() {
        return this.dnsSuffixes;
    }
    /**
     * Property key is the destination CIDR (e.g. &#34;10.0.0.0/8&#34;)
     * 
     */
    @Export(name="extraRoutes", refs={Map.class,String.class,NetworktemplateExtraRoutes.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,NetworktemplateExtraRoutes>> extraRoutes;

    /**
     * @return Property key is the destination CIDR (e.g. &#34;10.0.0.0/8&#34;)
     * 
     */
    public Output<Optional<Map<String,NetworktemplateExtraRoutes>>> extraRoutes() {
        return Codegen.optional(this.extraRoutes);
    }
    /**
     * Property key is the destination CIDR (e.g. &#34;2a02:1234:420a:10c9::/64&#34;)
     * 
     */
    @Export(name="extraRoutes6", refs={Map.class,String.class,NetworktemplateExtraRoutes6.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,NetworktemplateExtraRoutes6>> extraRoutes6;

    /**
     * @return Property key is the destination CIDR (e.g. &#34;2a02:1234:420a:10c9::/64&#34;)
     * 
     */
    public Output<Optional<Map<String,NetworktemplateExtraRoutes6>>> extraRoutes6() {
        return Codegen.optional(this.extraRoutes6);
    }
    /**
     * Enable mist_nac to use RadSec
     * 
     */
    @Export(name="mistNac", refs={NetworktemplateMistNac.class}, tree="[0]")
    private Output</* @Nullable */ NetworktemplateMistNac> mistNac;

    /**
     * @return Enable mist_nac to use RadSec
     * 
     */
    public Output<Optional<NetworktemplateMistNac>> mistNac() {
        return Codegen.optional(this.mistNac);
    }
    /**
     * Property key is network name
     * 
     */
    @Export(name="networks", refs={Map.class,String.class,NetworktemplateNetworks.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,NetworktemplateNetworks>> networks;

    /**
     * @return Property key is network name
     * 
     */
    public Output<Optional<Map<String,NetworktemplateNetworks>>> networks() {
        return Codegen.optional(this.networks);
    }
    /**
     * List of NTP servers
     * 
     */
    @Export(name="ntpServers", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> ntpServers;

    /**
     * @return List of NTP servers
     * 
     */
    public Output<List<String>> ntpServers() {
        return this.ntpServers;
    }
    /**
     * Junos OSPF areas. Property key is the OSPF Area (Area should be a number (0-255) / IP address)
     * 
     */
    @Export(name="ospfAreas", refs={Map.class,String.class,NetworktemplateOspfAreas.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,NetworktemplateOspfAreas>> ospfAreas;

    /**
     * @return Junos OSPF areas. Property key is the OSPF Area (Area should be a number (0-255) / IP address)
     * 
     */
    public Output<Optional<Map<String,NetworktemplateOspfAreas>>> ospfAreas() {
        return Codegen.optional(this.ospfAreas);
    }
    /**
     * Property key is the port mirroring instance name. `port_mirroring` can be added under device/site settings. It takes
     * interface and ports as input for ingress, interface as input for egress and can take interface and port as output. A
     * maximum 4 mirroring ports is allowed
     * 
     */
    @Export(name="portMirroring", refs={Map.class,String.class,NetworktemplatePortMirroring.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,NetworktemplatePortMirroring>> portMirroring;

    /**
     * @return Property key is the port mirroring instance name. `port_mirroring` can be added under device/site settings. It takes
     * interface and ports as input for ingress, interface as input for egress and can take interface and port as output. A
     * maximum 4 mirroring ports is allowed
     * 
     */
    public Output<Optional<Map<String,NetworktemplatePortMirroring>>> portMirroring() {
        return Codegen.optional(this.portMirroring);
    }
    /**
     * Property key is the port usage name. Defines the profiles of port configuration configured on the switch
     * 
     */
    @Export(name="portUsages", refs={Map.class,String.class,NetworktemplatePortUsages.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,NetworktemplatePortUsages>> portUsages;

    /**
     * @return Property key is the port usage name. Defines the profiles of port configuration configured on the switch
     * 
     */
    public Output<Optional<Map<String,NetworktemplatePortUsages>>> portUsages() {
        return Codegen.optional(this.portUsages);
    }
    /**
     * Junos Radius config
     * 
     */
    @Export(name="radiusConfig", refs={NetworktemplateRadiusConfig.class}, tree="[0]")
    private Output</* @Nullable */ NetworktemplateRadiusConfig> radiusConfig;

    /**
     * @return Junos Radius config
     * 
     */
    public Output<Optional<NetworktemplateRadiusConfig>> radiusConfig() {
        return Codegen.optional(this.radiusConfig);
    }
    @Export(name="remoteSyslog", refs={NetworktemplateRemoteSyslog.class}, tree="[0]")
    private Output</* @Nullable */ NetworktemplateRemoteSyslog> remoteSyslog;

    public Output<Optional<NetworktemplateRemoteSyslog>> remoteSyslog() {
        return Codegen.optional(this.remoteSyslog);
    }
    /**
     * Unique ID of the object instance in the Mist Organization
     * 
     */
    @Export(name="siteId", refs={String.class}, tree="[0]")
    private Output<String> siteId;

    /**
     * @return Unique ID of the object instance in the Mist Organization
     * 
     */
    public Output<String> siteId() {
        return this.siteId;
    }
    @Export(name="snmpConfig", refs={NetworktemplateSnmpConfig.class}, tree="[0]")
    private Output</* @Nullable */ NetworktemplateSnmpConfig> snmpConfig;

    public Output<Optional<NetworktemplateSnmpConfig>> snmpConfig() {
        return Codegen.optional(this.snmpConfig);
    }
    /**
     * Defines custom switch configuration based on different criteria
     * 
     */
    @Export(name="switchMatching", refs={NetworktemplateSwitchMatching.class}, tree="[0]")
    private Output</* @Nullable */ NetworktemplateSwitchMatching> switchMatching;

    /**
     * @return Defines custom switch configuration based on different criteria
     * 
     */
    public Output<Optional<NetworktemplateSwitchMatching>> switchMatching() {
        return Codegen.optional(this.switchMatching);
    }
    /**
     * Switch settings
     * 
     */
    @Export(name="switchMgmt", refs={NetworktemplateSwitchMgmt.class}, tree="[0]")
    private Output</* @Nullable */ NetworktemplateSwitchMgmt> switchMgmt;

    /**
     * @return Switch settings
     * 
     */
    public Output<Optional<NetworktemplateSwitchMgmt>> switchMgmt() {
        return Codegen.optional(this.switchMgmt);
    }
    @Export(name="vrfConfig", refs={NetworktemplateVrfConfig.class}, tree="[0]")
    private Output</* @Nullable */ NetworktemplateVrfConfig> vrfConfig;

    public Output<Optional<NetworktemplateVrfConfig>> vrfConfig() {
        return Codegen.optional(this.vrfConfig);
    }
    /**
     * Property key is the network name
     * 
     */
    @Export(name="vrfInstances", refs={Map.class,String.class,NetworktemplateVrfInstances.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,NetworktemplateVrfInstances>> vrfInstances;

    /**
     * @return Property key is the network name
     * 
     */
    public Output<Optional<Map<String,NetworktemplateVrfInstances>>> vrfInstances() {
        return Codegen.optional(this.vrfInstances);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Networktemplate(java.lang.String name) {
        this(name, NetworktemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Networktemplate(java.lang.String name, NetworktemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Networktemplate(java.lang.String name, NetworktemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:site/networktemplate:Networktemplate", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Networktemplate(java.lang.String name, Output<java.lang.String> id, @Nullable NetworktemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:site/networktemplate:Networktemplate", name, state, makeResourceOptions(options, id), false);
    }

    private static NetworktemplateArgs makeArgs(NetworktemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NetworktemplateArgs.Empty : args;
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
    public static Networktemplate get(java.lang.String name, Output<java.lang.String> id, @Nullable NetworktemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Networktemplate(name, id, state, options);
    }
}
