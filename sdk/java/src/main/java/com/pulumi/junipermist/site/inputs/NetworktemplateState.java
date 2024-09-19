// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.site.inputs.NetworktemplateAclPolicyArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateAclTagsArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateDhcpSnoopingArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateExtraRoutes6Args;
import com.pulumi.junipermist.site.inputs.NetworktemplateExtraRoutesArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateMistNacArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateNetworksArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateOspfAreasArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplatePortMirroringArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplatePortUsagesArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateRadiusConfigArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateRemoteSyslogArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateSnmpConfigArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateSwitchMatchingArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateSwitchMgmtArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateUplinkPortConfigArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateVrfConfigArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateVrfInstancesArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworktemplateState extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplateState Empty = new NetworktemplateState();

    @Import(name="aclPolicies")
    private @Nullable Output<List<NetworktemplateAclPolicyArgs>> aclPolicies;

    public Optional<Output<List<NetworktemplateAclPolicyArgs>>> aclPolicies() {
        return Optional.ofNullable(this.aclPolicies);
    }

    /**
     * ACL Tags to identify traffic source or destination. Key name is the tag name
     * 
     */
    @Import(name="aclTags")
    private @Nullable Output<Map<String,NetworktemplateAclTagsArgs>> aclTags;

    /**
     * @return ACL Tags to identify traffic source or destination. Key name is the tag name
     * 
     */
    public Optional<Output<Map<String,NetworktemplateAclTagsArgs>>> aclTags() {
        return Optional.ofNullable(this.aclTags);
    }

    /**
     * additional CLI commands to append to the generated Junos config **Note**: no check is done
     * 
     */
    @Import(name="additionalConfigCmds")
    private @Nullable Output<List<String>> additionalConfigCmds;

    /**
     * @return additional CLI commands to append to the generated Junos config **Note**: no check is done
     * 
     */
    public Optional<Output<List<String>>> additionalConfigCmds() {
        return Optional.ofNullable(this.additionalConfigCmds);
    }

    @Import(name="dhcpSnooping")
    private @Nullable Output<NetworktemplateDhcpSnoopingArgs> dhcpSnooping;

    public Optional<Output<NetworktemplateDhcpSnoopingArgs>> dhcpSnooping() {
        return Optional.ofNullable(this.dhcpSnooping);
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

    @Import(name="extraRoutes")
    private @Nullable Output<Map<String,NetworktemplateExtraRoutesArgs>> extraRoutes;

    public Optional<Output<Map<String,NetworktemplateExtraRoutesArgs>>> extraRoutes() {
        return Optional.ofNullable(this.extraRoutes);
    }

    /**
     * Property key is the destination CIDR (e.g. &#34;2a02:1234:420a:10c9::/64&#34;)
     * 
     */
    @Import(name="extraRoutes6")
    private @Nullable Output<Map<String,NetworktemplateExtraRoutes6Args>> extraRoutes6;

    /**
     * @return Property key is the destination CIDR (e.g. &#34;2a02:1234:420a:10c9::/64&#34;)
     * 
     */
    public Optional<Output<Map<String,NetworktemplateExtraRoutes6Args>>> extraRoutes6() {
        return Optional.ofNullable(this.extraRoutes6);
    }

    /**
     * enable mist_nac to use radsec
     * 
     */
    @Import(name="mistNac")
    private @Nullable Output<NetworktemplateMistNacArgs> mistNac;

    /**
     * @return enable mist_nac to use radsec
     * 
     */
    public Optional<Output<NetworktemplateMistNacArgs>> mistNac() {
        return Optional.ofNullable(this.mistNac);
    }

    /**
     * Property key is network name
     * 
     */
    @Import(name="networks")
    private @Nullable Output<Map<String,NetworktemplateNetworksArgs>> networks;

    /**
     * @return Property key is network name
     * 
     */
    public Optional<Output<Map<String,NetworktemplateNetworksArgs>>> networks() {
        return Optional.ofNullable(this.networks);
    }

    /**
     * list of NTP servers
     * 
     */
    @Import(name="ntpServers")
    private @Nullable Output<List<String>> ntpServers;

    /**
     * @return list of NTP servers
     * 
     */
    public Optional<Output<List<String>>> ntpServers() {
        return Optional.ofNullable(this.ntpServers);
    }

    /**
     * Junos OSPF areas
     * 
     */
    @Import(name="ospfAreas")
    private @Nullable Output<Map<String,NetworktemplateOspfAreasArgs>> ospfAreas;

    /**
     * @return Junos OSPF areas
     * 
     */
    public Optional<Output<Map<String,NetworktemplateOspfAreasArgs>>> ospfAreas() {
        return Optional.ofNullable(this.ospfAreas);
    }

    /**
     * Property key is the port mirroring instance name (Maximum: 4) port_mirroring can be added under device/site settings. It
     * takes interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
     * 
     */
    @Import(name="portMirroring")
    private @Nullable Output<Map<String,NetworktemplatePortMirroringArgs>> portMirroring;

    /**
     * @return Property key is the port mirroring instance name (Maximum: 4) port_mirroring can be added under device/site settings. It
     * takes interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
     * 
     */
    public Optional<Output<Map<String,NetworktemplatePortMirroringArgs>>> portMirroring() {
        return Optional.ofNullable(this.portMirroring);
    }

    @Import(name="portUsages")
    private @Nullable Output<Map<String,NetworktemplatePortUsagesArgs>> portUsages;

    public Optional<Output<Map<String,NetworktemplatePortUsagesArgs>>> portUsages() {
        return Optional.ofNullable(this.portUsages);
    }

    /**
     * Junos Radius config
     * 
     */
    @Import(name="radiusConfig")
    private @Nullable Output<NetworktemplateRadiusConfigArgs> radiusConfig;

    /**
     * @return Junos Radius config
     * 
     */
    public Optional<Output<NetworktemplateRadiusConfigArgs>> radiusConfig() {
        return Optional.ofNullable(this.radiusConfig);
    }

    @Import(name="remoteSyslog")
    private @Nullable Output<NetworktemplateRemoteSyslogArgs> remoteSyslog;

    public Optional<Output<NetworktemplateRemoteSyslogArgs>> remoteSyslog() {
        return Optional.ofNullable(this.remoteSyslog);
    }

    /**
     * by default, when we configure a device, we only clean up config we generates. Remove existing configs if enabled
     * 
     */
    @Import(name="removeExistingConfigs")
    private @Nullable Output<Boolean> removeExistingConfigs;

    /**
     * @return by default, when we configure a device, we only clean up config we generates. Remove existing configs if enabled
     * 
     */
    public Optional<Output<Boolean>> removeExistingConfigs() {
        return Optional.ofNullable(this.removeExistingConfigs);
    }

    @Import(name="siteId")
    private @Nullable Output<String> siteId;

    public Optional<Output<String>> siteId() {
        return Optional.ofNullable(this.siteId);
    }

    @Import(name="snmpConfig")
    private @Nullable Output<NetworktemplateSnmpConfigArgs> snmpConfig;

    public Optional<Output<NetworktemplateSnmpConfigArgs>> snmpConfig() {
        return Optional.ofNullable(this.snmpConfig);
    }

    /**
     * Switch template
     * 
     */
    @Import(name="switchMatching")
    private @Nullable Output<NetworktemplateSwitchMatchingArgs> switchMatching;

    /**
     * @return Switch template
     * 
     */
    public Optional<Output<NetworktemplateSwitchMatchingArgs>> switchMatching() {
        return Optional.ofNullable(this.switchMatching);
    }

    /**
     * Switch settings
     * 
     */
    @Import(name="switchMgmt")
    private @Nullable Output<NetworktemplateSwitchMgmtArgs> switchMgmt;

    /**
     * @return Switch settings
     * 
     */
    public Optional<Output<NetworktemplateSwitchMgmtArgs>> switchMgmt() {
        return Optional.ofNullable(this.switchMgmt);
    }

    @Import(name="uplinkPortConfig")
    private @Nullable Output<NetworktemplateUplinkPortConfigArgs> uplinkPortConfig;

    public Optional<Output<NetworktemplateUplinkPortConfigArgs>> uplinkPortConfig() {
        return Optional.ofNullable(this.uplinkPortConfig);
    }

    @Import(name="vrfConfig")
    private @Nullable Output<NetworktemplateVrfConfigArgs> vrfConfig;

    public Optional<Output<NetworktemplateVrfConfigArgs>> vrfConfig() {
        return Optional.ofNullable(this.vrfConfig);
    }

    /**
     * Property key is the network name
     * 
     */
    @Import(name="vrfInstances")
    private @Nullable Output<Map<String,NetworktemplateVrfInstancesArgs>> vrfInstances;

    /**
     * @return Property key is the network name
     * 
     */
    public Optional<Output<Map<String,NetworktemplateVrfInstancesArgs>>> vrfInstances() {
        return Optional.ofNullable(this.vrfInstances);
    }

    private NetworktemplateState() {}

    private NetworktemplateState(NetworktemplateState $) {
        this.aclPolicies = $.aclPolicies;
        this.aclTags = $.aclTags;
        this.additionalConfigCmds = $.additionalConfigCmds;
        this.dhcpSnooping = $.dhcpSnooping;
        this.dnsServers = $.dnsServers;
        this.dnsSuffixes = $.dnsSuffixes;
        this.extraRoutes = $.extraRoutes;
        this.extraRoutes6 = $.extraRoutes6;
        this.mistNac = $.mistNac;
        this.networks = $.networks;
        this.ntpServers = $.ntpServers;
        this.ospfAreas = $.ospfAreas;
        this.portMirroring = $.portMirroring;
        this.portUsages = $.portUsages;
        this.radiusConfig = $.radiusConfig;
        this.remoteSyslog = $.remoteSyslog;
        this.removeExistingConfigs = $.removeExistingConfigs;
        this.siteId = $.siteId;
        this.snmpConfig = $.snmpConfig;
        this.switchMatching = $.switchMatching;
        this.switchMgmt = $.switchMgmt;
        this.uplinkPortConfig = $.uplinkPortConfig;
        this.vrfConfig = $.vrfConfig;
        this.vrfInstances = $.vrfInstances;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworktemplateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplateState $;

        public Builder() {
            $ = new NetworktemplateState();
        }

        public Builder(NetworktemplateState defaults) {
            $ = new NetworktemplateState(Objects.requireNonNull(defaults));
        }

        public Builder aclPolicies(@Nullable Output<List<NetworktemplateAclPolicyArgs>> aclPolicies) {
            $.aclPolicies = aclPolicies;
            return this;
        }

        public Builder aclPolicies(List<NetworktemplateAclPolicyArgs> aclPolicies) {
            return aclPolicies(Output.of(aclPolicies));
        }

        public Builder aclPolicies(NetworktemplateAclPolicyArgs... aclPolicies) {
            return aclPolicies(List.of(aclPolicies));
        }

        /**
         * @param aclTags ACL Tags to identify traffic source or destination. Key name is the tag name
         * 
         * @return builder
         * 
         */
        public Builder aclTags(@Nullable Output<Map<String,NetworktemplateAclTagsArgs>> aclTags) {
            $.aclTags = aclTags;
            return this;
        }

        /**
         * @param aclTags ACL Tags to identify traffic source or destination. Key name is the tag name
         * 
         * @return builder
         * 
         */
        public Builder aclTags(Map<String,NetworktemplateAclTagsArgs> aclTags) {
            return aclTags(Output.of(aclTags));
        }

        /**
         * @param additionalConfigCmds additional CLI commands to append to the generated Junos config **Note**: no check is done
         * 
         * @return builder
         * 
         */
        public Builder additionalConfigCmds(@Nullable Output<List<String>> additionalConfigCmds) {
            $.additionalConfigCmds = additionalConfigCmds;
            return this;
        }

        /**
         * @param additionalConfigCmds additional CLI commands to append to the generated Junos config **Note**: no check is done
         * 
         * @return builder
         * 
         */
        public Builder additionalConfigCmds(List<String> additionalConfigCmds) {
            return additionalConfigCmds(Output.of(additionalConfigCmds));
        }

        /**
         * @param additionalConfigCmds additional CLI commands to append to the generated Junos config **Note**: no check is done
         * 
         * @return builder
         * 
         */
        public Builder additionalConfigCmds(String... additionalConfigCmds) {
            return additionalConfigCmds(List.of(additionalConfigCmds));
        }

        public Builder dhcpSnooping(@Nullable Output<NetworktemplateDhcpSnoopingArgs> dhcpSnooping) {
            $.dhcpSnooping = dhcpSnooping;
            return this;
        }

        public Builder dhcpSnooping(NetworktemplateDhcpSnoopingArgs dhcpSnooping) {
            return dhcpSnooping(Output.of(dhcpSnooping));
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

        public Builder extraRoutes(@Nullable Output<Map<String,NetworktemplateExtraRoutesArgs>> extraRoutes) {
            $.extraRoutes = extraRoutes;
            return this;
        }

        public Builder extraRoutes(Map<String,NetworktemplateExtraRoutesArgs> extraRoutes) {
            return extraRoutes(Output.of(extraRoutes));
        }

        /**
         * @param extraRoutes6 Property key is the destination CIDR (e.g. &#34;2a02:1234:420a:10c9::/64&#34;)
         * 
         * @return builder
         * 
         */
        public Builder extraRoutes6(@Nullable Output<Map<String,NetworktemplateExtraRoutes6Args>> extraRoutes6) {
            $.extraRoutes6 = extraRoutes6;
            return this;
        }

        /**
         * @param extraRoutes6 Property key is the destination CIDR (e.g. &#34;2a02:1234:420a:10c9::/64&#34;)
         * 
         * @return builder
         * 
         */
        public Builder extraRoutes6(Map<String,NetworktemplateExtraRoutes6Args> extraRoutes6) {
            return extraRoutes6(Output.of(extraRoutes6));
        }

        /**
         * @param mistNac enable mist_nac to use radsec
         * 
         * @return builder
         * 
         */
        public Builder mistNac(@Nullable Output<NetworktemplateMistNacArgs> mistNac) {
            $.mistNac = mistNac;
            return this;
        }

        /**
         * @param mistNac enable mist_nac to use radsec
         * 
         * @return builder
         * 
         */
        public Builder mistNac(NetworktemplateMistNacArgs mistNac) {
            return mistNac(Output.of(mistNac));
        }

        /**
         * @param networks Property key is network name
         * 
         * @return builder
         * 
         */
        public Builder networks(@Nullable Output<Map<String,NetworktemplateNetworksArgs>> networks) {
            $.networks = networks;
            return this;
        }

        /**
         * @param networks Property key is network name
         * 
         * @return builder
         * 
         */
        public Builder networks(Map<String,NetworktemplateNetworksArgs> networks) {
            return networks(Output.of(networks));
        }

        /**
         * @param ntpServers list of NTP servers
         * 
         * @return builder
         * 
         */
        public Builder ntpServers(@Nullable Output<List<String>> ntpServers) {
            $.ntpServers = ntpServers;
            return this;
        }

        /**
         * @param ntpServers list of NTP servers
         * 
         * @return builder
         * 
         */
        public Builder ntpServers(List<String> ntpServers) {
            return ntpServers(Output.of(ntpServers));
        }

        /**
         * @param ntpServers list of NTP servers
         * 
         * @return builder
         * 
         */
        public Builder ntpServers(String... ntpServers) {
            return ntpServers(List.of(ntpServers));
        }

        /**
         * @param ospfAreas Junos OSPF areas
         * 
         * @return builder
         * 
         */
        public Builder ospfAreas(@Nullable Output<Map<String,NetworktemplateOspfAreasArgs>> ospfAreas) {
            $.ospfAreas = ospfAreas;
            return this;
        }

        /**
         * @param ospfAreas Junos OSPF areas
         * 
         * @return builder
         * 
         */
        public Builder ospfAreas(Map<String,NetworktemplateOspfAreasArgs> ospfAreas) {
            return ospfAreas(Output.of(ospfAreas));
        }

        /**
         * @param portMirroring Property key is the port mirroring instance name (Maximum: 4) port_mirroring can be added under device/site settings. It
         * takes interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
         * 
         * @return builder
         * 
         */
        public Builder portMirroring(@Nullable Output<Map<String,NetworktemplatePortMirroringArgs>> portMirroring) {
            $.portMirroring = portMirroring;
            return this;
        }

        /**
         * @param portMirroring Property key is the port mirroring instance name (Maximum: 4) port_mirroring can be added under device/site settings. It
         * takes interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
         * 
         * @return builder
         * 
         */
        public Builder portMirroring(Map<String,NetworktemplatePortMirroringArgs> portMirroring) {
            return portMirroring(Output.of(portMirroring));
        }

        public Builder portUsages(@Nullable Output<Map<String,NetworktemplatePortUsagesArgs>> portUsages) {
            $.portUsages = portUsages;
            return this;
        }

        public Builder portUsages(Map<String,NetworktemplatePortUsagesArgs> portUsages) {
            return portUsages(Output.of(portUsages));
        }

        /**
         * @param radiusConfig Junos Radius config
         * 
         * @return builder
         * 
         */
        public Builder radiusConfig(@Nullable Output<NetworktemplateRadiusConfigArgs> radiusConfig) {
            $.radiusConfig = radiusConfig;
            return this;
        }

        /**
         * @param radiusConfig Junos Radius config
         * 
         * @return builder
         * 
         */
        public Builder radiusConfig(NetworktemplateRadiusConfigArgs radiusConfig) {
            return radiusConfig(Output.of(radiusConfig));
        }

        public Builder remoteSyslog(@Nullable Output<NetworktemplateRemoteSyslogArgs> remoteSyslog) {
            $.remoteSyslog = remoteSyslog;
            return this;
        }

        public Builder remoteSyslog(NetworktemplateRemoteSyslogArgs remoteSyslog) {
            return remoteSyslog(Output.of(remoteSyslog));
        }

        /**
         * @param removeExistingConfigs by default, when we configure a device, we only clean up config we generates. Remove existing configs if enabled
         * 
         * @return builder
         * 
         */
        public Builder removeExistingConfigs(@Nullable Output<Boolean> removeExistingConfigs) {
            $.removeExistingConfigs = removeExistingConfigs;
            return this;
        }

        /**
         * @param removeExistingConfigs by default, when we configure a device, we only clean up config we generates. Remove existing configs if enabled
         * 
         * @return builder
         * 
         */
        public Builder removeExistingConfigs(Boolean removeExistingConfigs) {
            return removeExistingConfigs(Output.of(removeExistingConfigs));
        }

        public Builder siteId(@Nullable Output<String> siteId) {
            $.siteId = siteId;
            return this;
        }

        public Builder siteId(String siteId) {
            return siteId(Output.of(siteId));
        }

        public Builder snmpConfig(@Nullable Output<NetworktemplateSnmpConfigArgs> snmpConfig) {
            $.snmpConfig = snmpConfig;
            return this;
        }

        public Builder snmpConfig(NetworktemplateSnmpConfigArgs snmpConfig) {
            return snmpConfig(Output.of(snmpConfig));
        }

        /**
         * @param switchMatching Switch template
         * 
         * @return builder
         * 
         */
        public Builder switchMatching(@Nullable Output<NetworktemplateSwitchMatchingArgs> switchMatching) {
            $.switchMatching = switchMatching;
            return this;
        }

        /**
         * @param switchMatching Switch template
         * 
         * @return builder
         * 
         */
        public Builder switchMatching(NetworktemplateSwitchMatchingArgs switchMatching) {
            return switchMatching(Output.of(switchMatching));
        }

        /**
         * @param switchMgmt Switch settings
         * 
         * @return builder
         * 
         */
        public Builder switchMgmt(@Nullable Output<NetworktemplateSwitchMgmtArgs> switchMgmt) {
            $.switchMgmt = switchMgmt;
            return this;
        }

        /**
         * @param switchMgmt Switch settings
         * 
         * @return builder
         * 
         */
        public Builder switchMgmt(NetworktemplateSwitchMgmtArgs switchMgmt) {
            return switchMgmt(Output.of(switchMgmt));
        }

        public Builder uplinkPortConfig(@Nullable Output<NetworktemplateUplinkPortConfigArgs> uplinkPortConfig) {
            $.uplinkPortConfig = uplinkPortConfig;
            return this;
        }

        public Builder uplinkPortConfig(NetworktemplateUplinkPortConfigArgs uplinkPortConfig) {
            return uplinkPortConfig(Output.of(uplinkPortConfig));
        }

        public Builder vrfConfig(@Nullable Output<NetworktemplateVrfConfigArgs> vrfConfig) {
            $.vrfConfig = vrfConfig;
            return this;
        }

        public Builder vrfConfig(NetworktemplateVrfConfigArgs vrfConfig) {
            return vrfConfig(Output.of(vrfConfig));
        }

        /**
         * @param vrfInstances Property key is the network name
         * 
         * @return builder
         * 
         */
        public Builder vrfInstances(@Nullable Output<Map<String,NetworktemplateVrfInstancesArgs>> vrfInstances) {
            $.vrfInstances = vrfInstances;
            return this;
        }

        /**
         * @param vrfInstances Property key is the network name
         * 
         * @return builder
         * 
         */
        public Builder vrfInstances(Map<String,NetworktemplateVrfInstancesArgs> vrfInstances) {
            return vrfInstances(Output.of(vrfInstances));
        }

        public NetworktemplateState build() {
            return $;
        }
    }

}
