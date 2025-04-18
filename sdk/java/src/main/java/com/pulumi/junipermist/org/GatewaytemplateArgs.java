// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.inputs.GatewaytemplateBgpConfigArgs;
import com.pulumi.junipermist.org.inputs.GatewaytemplateDhcpdConfigArgs;
import com.pulumi.junipermist.org.inputs.GatewaytemplateExtraRoutes6Args;
import com.pulumi.junipermist.org.inputs.GatewaytemplateExtraRoutesArgs;
import com.pulumi.junipermist.org.inputs.GatewaytemplateIdpProfilesArgs;
import com.pulumi.junipermist.org.inputs.GatewaytemplateIpConfigsArgs;
import com.pulumi.junipermist.org.inputs.GatewaytemplateNetworkArgs;
import com.pulumi.junipermist.org.inputs.GatewaytemplateOobIpConfigArgs;
import com.pulumi.junipermist.org.inputs.GatewaytemplatePathPreferencesArgs;
import com.pulumi.junipermist.org.inputs.GatewaytemplatePortConfigArgs;
import com.pulumi.junipermist.org.inputs.GatewaytemplateRoutingPoliciesArgs;
import com.pulumi.junipermist.org.inputs.GatewaytemplateServicePolicyArgs;
import com.pulumi.junipermist.org.inputs.GatewaytemplateTunnelConfigsArgs;
import com.pulumi.junipermist.org.inputs.GatewaytemplateTunnelProviderOptionsArgs;
import com.pulumi.junipermist.org.inputs.GatewaytemplateVrfConfigArgs;
import com.pulumi.junipermist.org.inputs.GatewaytemplateVrfInstancesArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewaytemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewaytemplateArgs Empty = new GatewaytemplateArgs();

    /**
     * additional CLI commands to append to the generated Junos config. **Note**: no check is done
     * 
     */
    @Import(name="additionalConfigCmds")
    private @Nullable Output<List<String>> additionalConfigCmds;

    /**
     * @return additional CLI commands to append to the generated Junos config. **Note**: no check is done
     * 
     */
    public Optional<Output<List<String>>> additionalConfigCmds() {
        return Optional.ofNullable(this.additionalConfigCmds);
    }

    @Import(name="bgpConfig")
    private @Nullable Output<Map<String,GatewaytemplateBgpConfigArgs>> bgpConfig;

    public Optional<Output<Map<String,GatewaytemplateBgpConfigArgs>>> bgpConfig() {
        return Optional.ofNullable(this.bgpConfig);
    }

    @Import(name="dhcpdConfig")
    private @Nullable Output<GatewaytemplateDhcpdConfigArgs> dhcpdConfig;

    public Optional<Output<GatewaytemplateDhcpdConfigArgs>> dhcpdConfig() {
        return Optional.ofNullable(this.dhcpdConfig);
    }

    @Import(name="dnsOverride")
    private @Nullable Output<Boolean> dnsOverride;

    public Optional<Output<Boolean>> dnsOverride() {
        return Optional.ofNullable(this.dnsOverride);
    }

    /**
     * Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
     * 
     */
    @Import(name="dnsServers")
    private @Nullable Output<List<String>> dnsServers;

    /**
     * @return Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
     * 
     */
    public Optional<Output<List<String>>> dnsServers() {
        return Optional.ofNullable(this.dnsServers);
    }

    /**
     * Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
     * 
     */
    @Import(name="dnsSuffixes")
    private @Nullable Output<List<String>> dnsSuffixes;

    /**
     * @return Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
     * 
     */
    public Optional<Output<List<String>>> dnsSuffixes() {
        return Optional.ofNullable(this.dnsSuffixes);
    }

    /**
     * Property key is the destination CIDR (e.g. &#34;10.0.0.0/8&#34;), the destination Network name or a variable (e.g. &#34;{{myvar}}&#34;)
     * 
     */
    @Import(name="extraRoutes")
    private @Nullable Output<Map<String,GatewaytemplateExtraRoutesArgs>> extraRoutes;

    /**
     * @return Property key is the destination CIDR (e.g. &#34;10.0.0.0/8&#34;), the destination Network name or a variable (e.g. &#34;{{myvar}}&#34;)
     * 
     */
    public Optional<Output<Map<String,GatewaytemplateExtraRoutesArgs>>> extraRoutes() {
        return Optional.ofNullable(this.extraRoutes);
    }

    /**
     * Property key is the destination CIDR (e.g. &#34;2a02:1234:420a:10c9::/64&#34;), the destination Network name or a variable (e.g.
     * &#34;{{myvar}}&#34;)
     * 
     */
    @Import(name="extraRoutes6")
    private @Nullable Output<Map<String,GatewaytemplateExtraRoutes6Args>> extraRoutes6;

    /**
     * @return Property key is the destination CIDR (e.g. &#34;2a02:1234:420a:10c9::/64&#34;), the destination Network name or a variable (e.g.
     * &#34;{{myvar}}&#34;)
     * 
     */
    public Optional<Output<Map<String,GatewaytemplateExtraRoutes6Args>>> extraRoutes6() {
        return Optional.ofNullable(this.extraRoutes6);
    }

    /**
     * Property key is the profile name
     * 
     */
    @Import(name="idpProfiles")
    private @Nullable Output<Map<String,GatewaytemplateIdpProfilesArgs>> idpProfiles;

    /**
     * @return Property key is the profile name
     * 
     */
    public Optional<Output<Map<String,GatewaytemplateIdpProfilesArgs>>> idpProfiles() {
        return Optional.ofNullable(this.idpProfiles);
    }

    /**
     * Property key is the network name
     * 
     */
    @Import(name="ipConfigs")
    private @Nullable Output<Map<String,GatewaytemplateIpConfigsArgs>> ipConfigs;

    /**
     * @return Property key is the network name
     * 
     */
    public Optional<Output<Map<String,GatewaytemplateIpConfigsArgs>>> ipConfigs() {
        return Optional.ofNullable(this.ipConfigs);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="networks")
    private @Nullable Output<List<GatewaytemplateNetworkArgs>> networks;

    public Optional<Output<List<GatewaytemplateNetworkArgs>>> networks() {
        return Optional.ofNullable(this.networks);
    }

    @Import(name="ntpOverride")
    private @Nullable Output<Boolean> ntpOverride;

    public Optional<Output<Boolean>> ntpOverride() {
        return Optional.ofNullable(this.ntpOverride);
    }

    /**
     * List of NTP servers specific to this device. By default, those in Site Settings will be used
     * 
     */
    @Import(name="ntpServers")
    private @Nullable Output<List<String>> ntpServers;

    /**
     * @return List of NTP servers specific to this device. By default, those in Site Settings will be used
     * 
     */
    public Optional<Output<List<String>>> ntpServers() {
        return Optional.ofNullable(this.ntpServers);
    }

    /**
     * Out-of-band (vme/em0/fxp0) IP config
     * 
     */
    @Import(name="oobIpConfig")
    private @Nullable Output<GatewaytemplateOobIpConfigArgs> oobIpConfig;

    /**
     * @return Out-of-band (vme/em0/fxp0) IP config
     * 
     */
    public Optional<Output<GatewaytemplateOobIpConfigArgs>> oobIpConfig() {
        return Optional.ofNullable(this.oobIpConfig);
    }

    @Import(name="orgId", required=true)
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    /**
     * Property key is the path name
     * 
     */
    @Import(name="pathPreferences")
    private @Nullable Output<Map<String,GatewaytemplatePathPreferencesArgs>> pathPreferences;

    /**
     * @return Property key is the path name
     * 
     */
    public Optional<Output<Map<String,GatewaytemplatePathPreferencesArgs>>> pathPreferences() {
        return Optional.ofNullable(this.pathPreferences);
    }

    /**
     * Property key is the Port Name (i.e. &#34;ge-0/0/0&#34;), the Ports Range (i.e. &#34;ge-0/0/0-10&#34;), the List of Ports (i.e.
     * &#34;ge-0/0/0,ge-1/0/0&#34;, only allowed for Aggregated or Redundant interfaces) or a Variable (i.e. &#34;{{myvar}}&#34;).
     * 
     */
    @Import(name="portConfig")
    private @Nullable Output<Map<String,GatewaytemplatePortConfigArgs>> portConfig;

    /**
     * @return Property key is the Port Name (i.e. &#34;ge-0/0/0&#34;), the Ports Range (i.e. &#34;ge-0/0/0-10&#34;), the List of Ports (i.e.
     * &#34;ge-0/0/0,ge-1/0/0&#34;, only allowed for Aggregated or Redundant interfaces) or a Variable (i.e. &#34;{{myvar}}&#34;).
     * 
     */
    public Optional<Output<Map<String,GatewaytemplatePortConfigArgs>>> portConfig() {
        return Optional.ofNullable(this.portConfig);
    }

    /**
     * Auto assigned if not set
     * 
     */
    @Import(name="routerId")
    private @Nullable Output<String> routerId;

    /**
     * @return Auto assigned if not set
     * 
     */
    public Optional<Output<String>> routerId() {
        return Optional.ofNullable(this.routerId);
    }

    /**
     * Property key is the routing policy name
     * 
     */
    @Import(name="routingPolicies")
    private @Nullable Output<Map<String,GatewaytemplateRoutingPoliciesArgs>> routingPolicies;

    /**
     * @return Property key is the routing policy name
     * 
     */
    public Optional<Output<Map<String,GatewaytemplateRoutingPoliciesArgs>>> routingPolicies() {
        return Optional.ofNullable(this.routingPolicies);
    }

    @Import(name="servicePolicies")
    private @Nullable Output<List<GatewaytemplateServicePolicyArgs>> servicePolicies;

    public Optional<Output<List<GatewaytemplateServicePolicyArgs>>> servicePolicies() {
        return Optional.ofNullable(this.servicePolicies);
    }

    /**
     * Property key is the tunnel name
     * 
     */
    @Import(name="tunnelConfigs")
    private @Nullable Output<Map<String,GatewaytemplateTunnelConfigsArgs>> tunnelConfigs;

    /**
     * @return Property key is the tunnel name
     * 
     */
    public Optional<Output<Map<String,GatewaytemplateTunnelConfigsArgs>>> tunnelConfigs() {
        return Optional.ofNullable(this.tunnelConfigs);
    }

    @Import(name="tunnelProviderOptions")
    private @Nullable Output<GatewaytemplateTunnelProviderOptionsArgs> tunnelProviderOptions;

    public Optional<Output<GatewaytemplateTunnelProviderOptionsArgs>> tunnelProviderOptions() {
        return Optional.ofNullable(this.tunnelProviderOptions);
    }

    /**
     * enum: `spoke`, `standalone`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return enum: `spoke`, `standalone`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="vrfConfig")
    private @Nullable Output<GatewaytemplateVrfConfigArgs> vrfConfig;

    public Optional<Output<GatewaytemplateVrfConfigArgs>> vrfConfig() {
        return Optional.ofNullable(this.vrfConfig);
    }

    /**
     * Property key is the network name
     * 
     */
    @Import(name="vrfInstances")
    private @Nullable Output<Map<String,GatewaytemplateVrfInstancesArgs>> vrfInstances;

    /**
     * @return Property key is the network name
     * 
     */
    public Optional<Output<Map<String,GatewaytemplateVrfInstancesArgs>>> vrfInstances() {
        return Optional.ofNullable(this.vrfInstances);
    }

    private GatewaytemplateArgs() {}

    private GatewaytemplateArgs(GatewaytemplateArgs $) {
        this.additionalConfigCmds = $.additionalConfigCmds;
        this.bgpConfig = $.bgpConfig;
        this.dhcpdConfig = $.dhcpdConfig;
        this.dnsOverride = $.dnsOverride;
        this.dnsServers = $.dnsServers;
        this.dnsSuffixes = $.dnsSuffixes;
        this.extraRoutes = $.extraRoutes;
        this.extraRoutes6 = $.extraRoutes6;
        this.idpProfiles = $.idpProfiles;
        this.ipConfigs = $.ipConfigs;
        this.name = $.name;
        this.networks = $.networks;
        this.ntpOverride = $.ntpOverride;
        this.ntpServers = $.ntpServers;
        this.oobIpConfig = $.oobIpConfig;
        this.orgId = $.orgId;
        this.pathPreferences = $.pathPreferences;
        this.portConfig = $.portConfig;
        this.routerId = $.routerId;
        this.routingPolicies = $.routingPolicies;
        this.servicePolicies = $.servicePolicies;
        this.tunnelConfigs = $.tunnelConfigs;
        this.tunnelProviderOptions = $.tunnelProviderOptions;
        this.type = $.type;
        this.vrfConfig = $.vrfConfig;
        this.vrfInstances = $.vrfInstances;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewaytemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewaytemplateArgs $;

        public Builder() {
            $ = new GatewaytemplateArgs();
        }

        public Builder(GatewaytemplateArgs defaults) {
            $ = new GatewaytemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalConfigCmds additional CLI commands to append to the generated Junos config. **Note**: no check is done
         * 
         * @return builder
         * 
         */
        public Builder additionalConfigCmds(@Nullable Output<List<String>> additionalConfigCmds) {
            $.additionalConfigCmds = additionalConfigCmds;
            return this;
        }

        /**
         * @param additionalConfigCmds additional CLI commands to append to the generated Junos config. **Note**: no check is done
         * 
         * @return builder
         * 
         */
        public Builder additionalConfigCmds(List<String> additionalConfigCmds) {
            return additionalConfigCmds(Output.of(additionalConfigCmds));
        }

        /**
         * @param additionalConfigCmds additional CLI commands to append to the generated Junos config. **Note**: no check is done
         * 
         * @return builder
         * 
         */
        public Builder additionalConfigCmds(String... additionalConfigCmds) {
            return additionalConfigCmds(List.of(additionalConfigCmds));
        }

        public Builder bgpConfig(@Nullable Output<Map<String,GatewaytemplateBgpConfigArgs>> bgpConfig) {
            $.bgpConfig = bgpConfig;
            return this;
        }

        public Builder bgpConfig(Map<String,GatewaytemplateBgpConfigArgs> bgpConfig) {
            return bgpConfig(Output.of(bgpConfig));
        }

        public Builder dhcpdConfig(@Nullable Output<GatewaytemplateDhcpdConfigArgs> dhcpdConfig) {
            $.dhcpdConfig = dhcpdConfig;
            return this;
        }

        public Builder dhcpdConfig(GatewaytemplateDhcpdConfigArgs dhcpdConfig) {
            return dhcpdConfig(Output.of(dhcpdConfig));
        }

        public Builder dnsOverride(@Nullable Output<Boolean> dnsOverride) {
            $.dnsOverride = dnsOverride;
            return this;
        }

        public Builder dnsOverride(Boolean dnsOverride) {
            return dnsOverride(Output.of(dnsOverride));
        }

        /**
         * @param dnsServers Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
         * 
         * @return builder
         * 
         */
        public Builder dnsServers(@Nullable Output<List<String>> dnsServers) {
            $.dnsServers = dnsServers;
            return this;
        }

        /**
         * @param dnsServers Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
         * 
         * @return builder
         * 
         */
        public Builder dnsServers(List<String> dnsServers) {
            return dnsServers(Output.of(dnsServers));
        }

        /**
         * @param dnsServers Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
         * 
         * @return builder
         * 
         */
        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }

        /**
         * @param dnsSuffixes Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
         * 
         * @return builder
         * 
         */
        public Builder dnsSuffixes(@Nullable Output<List<String>> dnsSuffixes) {
            $.dnsSuffixes = dnsSuffixes;
            return this;
        }

        /**
         * @param dnsSuffixes Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
         * 
         * @return builder
         * 
         */
        public Builder dnsSuffixes(List<String> dnsSuffixes) {
            return dnsSuffixes(Output.of(dnsSuffixes));
        }

        /**
         * @param dnsSuffixes Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
         * 
         * @return builder
         * 
         */
        public Builder dnsSuffixes(String... dnsSuffixes) {
            return dnsSuffixes(List.of(dnsSuffixes));
        }

        /**
         * @param extraRoutes Property key is the destination CIDR (e.g. &#34;10.0.0.0/8&#34;), the destination Network name or a variable (e.g. &#34;{{myvar}}&#34;)
         * 
         * @return builder
         * 
         */
        public Builder extraRoutes(@Nullable Output<Map<String,GatewaytemplateExtraRoutesArgs>> extraRoutes) {
            $.extraRoutes = extraRoutes;
            return this;
        }

        /**
         * @param extraRoutes Property key is the destination CIDR (e.g. &#34;10.0.0.0/8&#34;), the destination Network name or a variable (e.g. &#34;{{myvar}}&#34;)
         * 
         * @return builder
         * 
         */
        public Builder extraRoutes(Map<String,GatewaytemplateExtraRoutesArgs> extraRoutes) {
            return extraRoutes(Output.of(extraRoutes));
        }

        /**
         * @param extraRoutes6 Property key is the destination CIDR (e.g. &#34;2a02:1234:420a:10c9::/64&#34;), the destination Network name or a variable (e.g.
         * &#34;{{myvar}}&#34;)
         * 
         * @return builder
         * 
         */
        public Builder extraRoutes6(@Nullable Output<Map<String,GatewaytemplateExtraRoutes6Args>> extraRoutes6) {
            $.extraRoutes6 = extraRoutes6;
            return this;
        }

        /**
         * @param extraRoutes6 Property key is the destination CIDR (e.g. &#34;2a02:1234:420a:10c9::/64&#34;), the destination Network name or a variable (e.g.
         * &#34;{{myvar}}&#34;)
         * 
         * @return builder
         * 
         */
        public Builder extraRoutes6(Map<String,GatewaytemplateExtraRoutes6Args> extraRoutes6) {
            return extraRoutes6(Output.of(extraRoutes6));
        }

        /**
         * @param idpProfiles Property key is the profile name
         * 
         * @return builder
         * 
         */
        public Builder idpProfiles(@Nullable Output<Map<String,GatewaytemplateIdpProfilesArgs>> idpProfiles) {
            $.idpProfiles = idpProfiles;
            return this;
        }

        /**
         * @param idpProfiles Property key is the profile name
         * 
         * @return builder
         * 
         */
        public Builder idpProfiles(Map<String,GatewaytemplateIdpProfilesArgs> idpProfiles) {
            return idpProfiles(Output.of(idpProfiles));
        }

        /**
         * @param ipConfigs Property key is the network name
         * 
         * @return builder
         * 
         */
        public Builder ipConfigs(@Nullable Output<Map<String,GatewaytemplateIpConfigsArgs>> ipConfigs) {
            $.ipConfigs = ipConfigs;
            return this;
        }

        /**
         * @param ipConfigs Property key is the network name
         * 
         * @return builder
         * 
         */
        public Builder ipConfigs(Map<String,GatewaytemplateIpConfigsArgs> ipConfigs) {
            return ipConfigs(Output.of(ipConfigs));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder networks(@Nullable Output<List<GatewaytemplateNetworkArgs>> networks) {
            $.networks = networks;
            return this;
        }

        public Builder networks(List<GatewaytemplateNetworkArgs> networks) {
            return networks(Output.of(networks));
        }

        public Builder networks(GatewaytemplateNetworkArgs... networks) {
            return networks(List.of(networks));
        }

        public Builder ntpOverride(@Nullable Output<Boolean> ntpOverride) {
            $.ntpOverride = ntpOverride;
            return this;
        }

        public Builder ntpOverride(Boolean ntpOverride) {
            return ntpOverride(Output.of(ntpOverride));
        }

        /**
         * @param ntpServers List of NTP servers specific to this device. By default, those in Site Settings will be used
         * 
         * @return builder
         * 
         */
        public Builder ntpServers(@Nullable Output<List<String>> ntpServers) {
            $.ntpServers = ntpServers;
            return this;
        }

        /**
         * @param ntpServers List of NTP servers specific to this device. By default, those in Site Settings will be used
         * 
         * @return builder
         * 
         */
        public Builder ntpServers(List<String> ntpServers) {
            return ntpServers(Output.of(ntpServers));
        }

        /**
         * @param ntpServers List of NTP servers specific to this device. By default, those in Site Settings will be used
         * 
         * @return builder
         * 
         */
        public Builder ntpServers(String... ntpServers) {
            return ntpServers(List.of(ntpServers));
        }

        /**
         * @param oobIpConfig Out-of-band (vme/em0/fxp0) IP config
         * 
         * @return builder
         * 
         */
        public Builder oobIpConfig(@Nullable Output<GatewaytemplateOobIpConfigArgs> oobIpConfig) {
            $.oobIpConfig = oobIpConfig;
            return this;
        }

        /**
         * @param oobIpConfig Out-of-band (vme/em0/fxp0) IP config
         * 
         * @return builder
         * 
         */
        public Builder oobIpConfig(GatewaytemplateOobIpConfigArgs oobIpConfig) {
            return oobIpConfig(Output.of(oobIpConfig));
        }

        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param pathPreferences Property key is the path name
         * 
         * @return builder
         * 
         */
        public Builder pathPreferences(@Nullable Output<Map<String,GatewaytemplatePathPreferencesArgs>> pathPreferences) {
            $.pathPreferences = pathPreferences;
            return this;
        }

        /**
         * @param pathPreferences Property key is the path name
         * 
         * @return builder
         * 
         */
        public Builder pathPreferences(Map<String,GatewaytemplatePathPreferencesArgs> pathPreferences) {
            return pathPreferences(Output.of(pathPreferences));
        }

        /**
         * @param portConfig Property key is the Port Name (i.e. &#34;ge-0/0/0&#34;), the Ports Range (i.e. &#34;ge-0/0/0-10&#34;), the List of Ports (i.e.
         * &#34;ge-0/0/0,ge-1/0/0&#34;, only allowed for Aggregated or Redundant interfaces) or a Variable (i.e. &#34;{{myvar}}&#34;).
         * 
         * @return builder
         * 
         */
        public Builder portConfig(@Nullable Output<Map<String,GatewaytemplatePortConfigArgs>> portConfig) {
            $.portConfig = portConfig;
            return this;
        }

        /**
         * @param portConfig Property key is the Port Name (i.e. &#34;ge-0/0/0&#34;), the Ports Range (i.e. &#34;ge-0/0/0-10&#34;), the List of Ports (i.e.
         * &#34;ge-0/0/0,ge-1/0/0&#34;, only allowed for Aggregated or Redundant interfaces) or a Variable (i.e. &#34;{{myvar}}&#34;).
         * 
         * @return builder
         * 
         */
        public Builder portConfig(Map<String,GatewaytemplatePortConfigArgs> portConfig) {
            return portConfig(Output.of(portConfig));
        }

        /**
         * @param routerId Auto assigned if not set
         * 
         * @return builder
         * 
         */
        public Builder routerId(@Nullable Output<String> routerId) {
            $.routerId = routerId;
            return this;
        }

        /**
         * @param routerId Auto assigned if not set
         * 
         * @return builder
         * 
         */
        public Builder routerId(String routerId) {
            return routerId(Output.of(routerId));
        }

        /**
         * @param routingPolicies Property key is the routing policy name
         * 
         * @return builder
         * 
         */
        public Builder routingPolicies(@Nullable Output<Map<String,GatewaytemplateRoutingPoliciesArgs>> routingPolicies) {
            $.routingPolicies = routingPolicies;
            return this;
        }

        /**
         * @param routingPolicies Property key is the routing policy name
         * 
         * @return builder
         * 
         */
        public Builder routingPolicies(Map<String,GatewaytemplateRoutingPoliciesArgs> routingPolicies) {
            return routingPolicies(Output.of(routingPolicies));
        }

        public Builder servicePolicies(@Nullable Output<List<GatewaytemplateServicePolicyArgs>> servicePolicies) {
            $.servicePolicies = servicePolicies;
            return this;
        }

        public Builder servicePolicies(List<GatewaytemplateServicePolicyArgs> servicePolicies) {
            return servicePolicies(Output.of(servicePolicies));
        }

        public Builder servicePolicies(GatewaytemplateServicePolicyArgs... servicePolicies) {
            return servicePolicies(List.of(servicePolicies));
        }

        /**
         * @param tunnelConfigs Property key is the tunnel name
         * 
         * @return builder
         * 
         */
        public Builder tunnelConfigs(@Nullable Output<Map<String,GatewaytemplateTunnelConfigsArgs>> tunnelConfigs) {
            $.tunnelConfigs = tunnelConfigs;
            return this;
        }

        /**
         * @param tunnelConfigs Property key is the tunnel name
         * 
         * @return builder
         * 
         */
        public Builder tunnelConfigs(Map<String,GatewaytemplateTunnelConfigsArgs> tunnelConfigs) {
            return tunnelConfigs(Output.of(tunnelConfigs));
        }

        public Builder tunnelProviderOptions(@Nullable Output<GatewaytemplateTunnelProviderOptionsArgs> tunnelProviderOptions) {
            $.tunnelProviderOptions = tunnelProviderOptions;
            return this;
        }

        public Builder tunnelProviderOptions(GatewaytemplateTunnelProviderOptionsArgs tunnelProviderOptions) {
            return tunnelProviderOptions(Output.of(tunnelProviderOptions));
        }

        /**
         * @param type enum: `spoke`, `standalone`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type enum: `spoke`, `standalone`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder vrfConfig(@Nullable Output<GatewaytemplateVrfConfigArgs> vrfConfig) {
            $.vrfConfig = vrfConfig;
            return this;
        }

        public Builder vrfConfig(GatewaytemplateVrfConfigArgs vrfConfig) {
            return vrfConfig(Output.of(vrfConfig));
        }

        /**
         * @param vrfInstances Property key is the network name
         * 
         * @return builder
         * 
         */
        public Builder vrfInstances(@Nullable Output<Map<String,GatewaytemplateVrfInstancesArgs>> vrfInstances) {
            $.vrfInstances = vrfInstances;
            return this;
        }

        /**
         * @param vrfInstances Property key is the network name
         * 
         * @return builder
         * 
         */
        public Builder vrfInstances(Map<String,GatewaytemplateVrfInstancesArgs> vrfInstances) {
            return vrfInstances(Output.of(vrfInstances));
        }

        public GatewaytemplateArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GatewaytemplateArgs", "orgId");
            }
            return $;
        }
    }

}
