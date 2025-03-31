// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.outputs.GatewaytemplatePortConfigIpConfig;
import com.pulumi.junipermist.org.outputs.GatewaytemplatePortConfigTrafficShaping;
import com.pulumi.junipermist.org.outputs.GatewaytemplatePortConfigVpnPaths;
import com.pulumi.junipermist.org.outputs.GatewaytemplatePortConfigWanExtraRoutes;
import com.pulumi.junipermist.org.outputs.GatewaytemplatePortConfigWanProbeOverride;
import com.pulumi.junipermist.org.outputs.GatewaytemplatePortConfigWanSourceNat;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewaytemplatePortConfig {
    /**
     * @return If `aggregated`==`true`. To disable LCP support for the AE interface
     * 
     */
    private @Nullable Boolean aeDisableLacp;
    /**
     * @return If `aggregated`==`true`. Users could force to use the designated AE name (must be an integer between 0 and 127)
     * 
     */
    private @Nullable String aeIdx;
    /**
     * @return For SRX Only, if `aggregated`==`true`.Sets the state of the interface as UP when the peer has limited LACP capability. Use case: When a device connected to this AE port is ZTPing for the first time, it will not have LACP configured on the other end. **Note:** Turning this on will enable force-up on one of the interfaces in the bundle only
     * 
     */
    private @Nullable Boolean aeLacpForceUp;
    private @Nullable Boolean aggregated;
    /**
     * @return To generate port up/down alarm, set it to true
     * 
     */
    private @Nullable Boolean critical;
    /**
     * @return Interface Description. Can be a variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    private @Nullable String description;
    private @Nullable Boolean disableAutoneg;
    /**
     * @return Port admin up (true) / down (false)
     * 
     */
    private @Nullable Boolean disabled;
    /**
     * @return if `wan_type`==`dsl`. enum: `adsl`, `vdsl`
     * 
     */
    private @Nullable String dslType;
    /**
     * @return If `wan_type`==`dsl`, 16 bit int
     * 
     */
    private @Nullable Integer dslVci;
    /**
     * @return If `wan_type`==`dsl`, 8 bit int
     * 
     */
    private @Nullable Integer dslVpi;
    /**
     * @return enum: `auto`, `full`, `half`
     * 
     */
    private @Nullable String duplex;
    /**
     * @return Junos IP Config
     * 
     */
    private @Nullable GatewaytemplatePortConfigIpConfig ipConfig;
    /**
     * @return If `wan_type`==`lte`
     * 
     */
    private @Nullable String lteApn;
    /**
     * @return if `wan_type`==`lte`. enum: `chap`, `none`, `pap`
     * 
     */
    private @Nullable String lteAuth;
    private @Nullable Boolean lteBackup;
    /**
     * @return If `wan_type`==`lte`
     * 
     */
    private @Nullable String ltePassword;
    /**
     * @return If `wan_type`==`lte`
     * 
     */
    private @Nullable String lteUsername;
    private @Nullable Integer mtu;
    /**
     * @return Name that we&#39;ll use to derive config
     * 
     */
    private @Nullable String name;
    /**
     * @return if `usage`==`lan`, name of the `junipermist.org.Network` resource
     * 
     */
    private @Nullable List<String> networks;
    /**
     * @return For Q-in-Q
     * 
     */
    private @Nullable Integer outerVlanId;
    private @Nullable Boolean poeDisabled;
    /**
     * @return Only for SRX and if `usage`==`lan`, the name of the Network to be used as the Untagged VLAN
     * 
     */
    private @Nullable String portNetwork;
    /**
     * @return Whether to preserve dscp when sending traffic over VPN (SSR-only)
     * 
     */
    private @Nullable Boolean preserveDscp;
    /**
     * @return If HA mode
     * 
     */
    private @Nullable Boolean redundant;
    /**
     * @return If HA mode, SRX Only - support redundancy-group. 1-128 for physical SRX, 1-64 for virtual SRX
     * 
     */
    private @Nullable Integer redundantGroup;
    /**
     * @return If HA mode
     * 
     */
    private @Nullable Integer rethIdx;
    /**
     * @return If HA mode
     * 
     */
    private @Nullable String rethNode;
    /**
     * @return SSR only - supporting vlan-based redundancy (matching the size of `networks`)
     * 
     */
    private @Nullable List<String> rethNodes;
    private @Nullable String speed;
    /**
     * @return When SSR is running as VM, this is required on certain hosting platforms
     * 
     */
    private @Nullable Boolean ssrNoVirtualMac;
    /**
     * @return For SSR only
     * 
     */
    private @Nullable String svrPortRange;
    private @Nullable GatewaytemplatePortConfigTrafficShaping trafficShaping;
    /**
     * @return port usage name. enum: `ha_control`, `ha_data`, `lan`, `wan`
     * 
     */
    private String usage;
    private @Nullable String vlanId;
    /**
     * @return Property key is the VPN name
     * 
     */
    private @Nullable Map<String,GatewaytemplatePortConfigVpnPaths> vpnPaths;
    /**
     * @return Only when `wan_type`==`broadband`. enum: `default`, `max`, `recommended`
     * 
     */
    private @Nullable String wanArpPolicer;
    /**
     * @return Only if `usage`==`wan`, optional. If spoke should reach this port by a different IP
     * 
     */
    private @Nullable String wanExtIp;
    /**
     * @return Only if `usage`==`wan`. Property Key is the destination CIDR (e.g. &#34;100.100.100.0/24&#34;)
     * 
     */
    private @Nullable Map<String,GatewaytemplatePortConfigWanExtraRoutes> wanExtraRoutes;
    /**
     * @return Only if `usage`==`wan`. If some networks are connected to this WAN port, it can be added here so policies can be defined
     * 
     */
    private @Nullable List<String> wanNetworks;
    /**
     * @return Only if `usage`==`wan`
     * 
     */
    private @Nullable GatewaytemplatePortConfigWanProbeOverride wanProbeOverride;
    /**
     * @return Only if `usage`==`wan`, optional. By default, source-NAT is performed on all WAN Ports using the interface-ip
     * 
     */
    private @Nullable GatewaytemplatePortConfigWanSourceNat wanSourceNat;
    /**
     * @return Only if `usage`==`wan`. enum: `broadband`, `dsl`, `lte`
     * 
     */
    private @Nullable String wanType;

    private GatewaytemplatePortConfig() {}
    /**
     * @return If `aggregated`==`true`. To disable LCP support for the AE interface
     * 
     */
    public Optional<Boolean> aeDisableLacp() {
        return Optional.ofNullable(this.aeDisableLacp);
    }
    /**
     * @return If `aggregated`==`true`. Users could force to use the designated AE name (must be an integer between 0 and 127)
     * 
     */
    public Optional<String> aeIdx() {
        return Optional.ofNullable(this.aeIdx);
    }
    /**
     * @return For SRX Only, if `aggregated`==`true`.Sets the state of the interface as UP when the peer has limited LACP capability. Use case: When a device connected to this AE port is ZTPing for the first time, it will not have LACP configured on the other end. **Note:** Turning this on will enable force-up on one of the interfaces in the bundle only
     * 
     */
    public Optional<Boolean> aeLacpForceUp() {
        return Optional.ofNullable(this.aeLacpForceUp);
    }
    public Optional<Boolean> aggregated() {
        return Optional.ofNullable(this.aggregated);
    }
    /**
     * @return To generate port up/down alarm, set it to true
     * 
     */
    public Optional<Boolean> critical() {
        return Optional.ofNullable(this.critical);
    }
    /**
     * @return Interface Description. Can be a variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<Boolean> disableAutoneg() {
        return Optional.ofNullable(this.disableAutoneg);
    }
    /**
     * @return Port admin up (true) / down (false)
     * 
     */
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * @return if `wan_type`==`dsl`. enum: `adsl`, `vdsl`
     * 
     */
    public Optional<String> dslType() {
        return Optional.ofNullable(this.dslType);
    }
    /**
     * @return If `wan_type`==`dsl`, 16 bit int
     * 
     */
    public Optional<Integer> dslVci() {
        return Optional.ofNullable(this.dslVci);
    }
    /**
     * @return If `wan_type`==`dsl`, 8 bit int
     * 
     */
    public Optional<Integer> dslVpi() {
        return Optional.ofNullable(this.dslVpi);
    }
    /**
     * @return enum: `auto`, `full`, `half`
     * 
     */
    public Optional<String> duplex() {
        return Optional.ofNullable(this.duplex);
    }
    /**
     * @return Junos IP Config
     * 
     */
    public Optional<GatewaytemplatePortConfigIpConfig> ipConfig() {
        return Optional.ofNullable(this.ipConfig);
    }
    /**
     * @return If `wan_type`==`lte`
     * 
     */
    public Optional<String> lteApn() {
        return Optional.ofNullable(this.lteApn);
    }
    /**
     * @return if `wan_type`==`lte`. enum: `chap`, `none`, `pap`
     * 
     */
    public Optional<String> lteAuth() {
        return Optional.ofNullable(this.lteAuth);
    }
    public Optional<Boolean> lteBackup() {
        return Optional.ofNullable(this.lteBackup);
    }
    /**
     * @return If `wan_type`==`lte`
     * 
     */
    public Optional<String> ltePassword() {
        return Optional.ofNullable(this.ltePassword);
    }
    /**
     * @return If `wan_type`==`lte`
     * 
     */
    public Optional<String> lteUsername() {
        return Optional.ofNullable(this.lteUsername);
    }
    public Optional<Integer> mtu() {
        return Optional.ofNullable(this.mtu);
    }
    /**
     * @return Name that we&#39;ll use to derive config
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return if `usage`==`lan`, name of the `junipermist.org.Network` resource
     * 
     */
    public List<String> networks() {
        return this.networks == null ? List.of() : this.networks;
    }
    /**
     * @return For Q-in-Q
     * 
     */
    public Optional<Integer> outerVlanId() {
        return Optional.ofNullable(this.outerVlanId);
    }
    public Optional<Boolean> poeDisabled() {
        return Optional.ofNullable(this.poeDisabled);
    }
    /**
     * @return Only for SRX and if `usage`==`lan`, the name of the Network to be used as the Untagged VLAN
     * 
     */
    public Optional<String> portNetwork() {
        return Optional.ofNullable(this.portNetwork);
    }
    /**
     * @return Whether to preserve dscp when sending traffic over VPN (SSR-only)
     * 
     */
    public Optional<Boolean> preserveDscp() {
        return Optional.ofNullable(this.preserveDscp);
    }
    /**
     * @return If HA mode
     * 
     */
    public Optional<Boolean> redundant() {
        return Optional.ofNullable(this.redundant);
    }
    /**
     * @return If HA mode, SRX Only - support redundancy-group. 1-128 for physical SRX, 1-64 for virtual SRX
     * 
     */
    public Optional<Integer> redundantGroup() {
        return Optional.ofNullable(this.redundantGroup);
    }
    /**
     * @return If HA mode
     * 
     */
    public Optional<Integer> rethIdx() {
        return Optional.ofNullable(this.rethIdx);
    }
    /**
     * @return If HA mode
     * 
     */
    public Optional<String> rethNode() {
        return Optional.ofNullable(this.rethNode);
    }
    /**
     * @return SSR only - supporting vlan-based redundancy (matching the size of `networks`)
     * 
     */
    public List<String> rethNodes() {
        return this.rethNodes == null ? List.of() : this.rethNodes;
    }
    public Optional<String> speed() {
        return Optional.ofNullable(this.speed);
    }
    /**
     * @return When SSR is running as VM, this is required on certain hosting platforms
     * 
     */
    public Optional<Boolean> ssrNoVirtualMac() {
        return Optional.ofNullable(this.ssrNoVirtualMac);
    }
    /**
     * @return For SSR only
     * 
     */
    public Optional<String> svrPortRange() {
        return Optional.ofNullable(this.svrPortRange);
    }
    public Optional<GatewaytemplatePortConfigTrafficShaping> trafficShaping() {
        return Optional.ofNullable(this.trafficShaping);
    }
    /**
     * @return port usage name. enum: `ha_control`, `ha_data`, `lan`, `wan`
     * 
     */
    public String usage() {
        return this.usage;
    }
    public Optional<String> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }
    /**
     * @return Property key is the VPN name
     * 
     */
    public Map<String,GatewaytemplatePortConfigVpnPaths> vpnPaths() {
        return this.vpnPaths == null ? Map.of() : this.vpnPaths;
    }
    /**
     * @return Only when `wan_type`==`broadband`. enum: `default`, `max`, `recommended`
     * 
     */
    public Optional<String> wanArpPolicer() {
        return Optional.ofNullable(this.wanArpPolicer);
    }
    /**
     * @return Only if `usage`==`wan`, optional. If spoke should reach this port by a different IP
     * 
     */
    public Optional<String> wanExtIp() {
        return Optional.ofNullable(this.wanExtIp);
    }
    /**
     * @return Only if `usage`==`wan`. Property Key is the destination CIDR (e.g. &#34;100.100.100.0/24&#34;)
     * 
     */
    public Map<String,GatewaytemplatePortConfigWanExtraRoutes> wanExtraRoutes() {
        return this.wanExtraRoutes == null ? Map.of() : this.wanExtraRoutes;
    }
    /**
     * @return Only if `usage`==`wan`. If some networks are connected to this WAN port, it can be added here so policies can be defined
     * 
     */
    public List<String> wanNetworks() {
        return this.wanNetworks == null ? List.of() : this.wanNetworks;
    }
    /**
     * @return Only if `usage`==`wan`
     * 
     */
    public Optional<GatewaytemplatePortConfigWanProbeOverride> wanProbeOverride() {
        return Optional.ofNullable(this.wanProbeOverride);
    }
    /**
     * @return Only if `usage`==`wan`, optional. By default, source-NAT is performed on all WAN Ports using the interface-ip
     * 
     */
    public Optional<GatewaytemplatePortConfigWanSourceNat> wanSourceNat() {
        return Optional.ofNullable(this.wanSourceNat);
    }
    /**
     * @return Only if `usage`==`wan`. enum: `broadband`, `dsl`, `lte`
     * 
     */
    public Optional<String> wanType() {
        return Optional.ofNullable(this.wanType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewaytemplatePortConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean aeDisableLacp;
        private @Nullable String aeIdx;
        private @Nullable Boolean aeLacpForceUp;
        private @Nullable Boolean aggregated;
        private @Nullable Boolean critical;
        private @Nullable String description;
        private @Nullable Boolean disableAutoneg;
        private @Nullable Boolean disabled;
        private @Nullable String dslType;
        private @Nullable Integer dslVci;
        private @Nullable Integer dslVpi;
        private @Nullable String duplex;
        private @Nullable GatewaytemplatePortConfigIpConfig ipConfig;
        private @Nullable String lteApn;
        private @Nullable String lteAuth;
        private @Nullable Boolean lteBackup;
        private @Nullable String ltePassword;
        private @Nullable String lteUsername;
        private @Nullable Integer mtu;
        private @Nullable String name;
        private @Nullable List<String> networks;
        private @Nullable Integer outerVlanId;
        private @Nullable Boolean poeDisabled;
        private @Nullable String portNetwork;
        private @Nullable Boolean preserveDscp;
        private @Nullable Boolean redundant;
        private @Nullable Integer redundantGroup;
        private @Nullable Integer rethIdx;
        private @Nullable String rethNode;
        private @Nullable List<String> rethNodes;
        private @Nullable String speed;
        private @Nullable Boolean ssrNoVirtualMac;
        private @Nullable String svrPortRange;
        private @Nullable GatewaytemplatePortConfigTrafficShaping trafficShaping;
        private String usage;
        private @Nullable String vlanId;
        private @Nullable Map<String,GatewaytemplatePortConfigVpnPaths> vpnPaths;
        private @Nullable String wanArpPolicer;
        private @Nullable String wanExtIp;
        private @Nullable Map<String,GatewaytemplatePortConfigWanExtraRoutes> wanExtraRoutes;
        private @Nullable List<String> wanNetworks;
        private @Nullable GatewaytemplatePortConfigWanProbeOverride wanProbeOverride;
        private @Nullable GatewaytemplatePortConfigWanSourceNat wanSourceNat;
        private @Nullable String wanType;
        public Builder() {}
        public Builder(GatewaytemplatePortConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aeDisableLacp = defaults.aeDisableLacp;
    	      this.aeIdx = defaults.aeIdx;
    	      this.aeLacpForceUp = defaults.aeLacpForceUp;
    	      this.aggregated = defaults.aggregated;
    	      this.critical = defaults.critical;
    	      this.description = defaults.description;
    	      this.disableAutoneg = defaults.disableAutoneg;
    	      this.disabled = defaults.disabled;
    	      this.dslType = defaults.dslType;
    	      this.dslVci = defaults.dslVci;
    	      this.dslVpi = defaults.dslVpi;
    	      this.duplex = defaults.duplex;
    	      this.ipConfig = defaults.ipConfig;
    	      this.lteApn = defaults.lteApn;
    	      this.lteAuth = defaults.lteAuth;
    	      this.lteBackup = defaults.lteBackup;
    	      this.ltePassword = defaults.ltePassword;
    	      this.lteUsername = defaults.lteUsername;
    	      this.mtu = defaults.mtu;
    	      this.name = defaults.name;
    	      this.networks = defaults.networks;
    	      this.outerVlanId = defaults.outerVlanId;
    	      this.poeDisabled = defaults.poeDisabled;
    	      this.portNetwork = defaults.portNetwork;
    	      this.preserveDscp = defaults.preserveDscp;
    	      this.redundant = defaults.redundant;
    	      this.redundantGroup = defaults.redundantGroup;
    	      this.rethIdx = defaults.rethIdx;
    	      this.rethNode = defaults.rethNode;
    	      this.rethNodes = defaults.rethNodes;
    	      this.speed = defaults.speed;
    	      this.ssrNoVirtualMac = defaults.ssrNoVirtualMac;
    	      this.svrPortRange = defaults.svrPortRange;
    	      this.trafficShaping = defaults.trafficShaping;
    	      this.usage = defaults.usage;
    	      this.vlanId = defaults.vlanId;
    	      this.vpnPaths = defaults.vpnPaths;
    	      this.wanArpPolicer = defaults.wanArpPolicer;
    	      this.wanExtIp = defaults.wanExtIp;
    	      this.wanExtraRoutes = defaults.wanExtraRoutes;
    	      this.wanNetworks = defaults.wanNetworks;
    	      this.wanProbeOverride = defaults.wanProbeOverride;
    	      this.wanSourceNat = defaults.wanSourceNat;
    	      this.wanType = defaults.wanType;
        }

        @CustomType.Setter
        public Builder aeDisableLacp(@Nullable Boolean aeDisableLacp) {

            this.aeDisableLacp = aeDisableLacp;
            return this;
        }
        @CustomType.Setter
        public Builder aeIdx(@Nullable String aeIdx) {

            this.aeIdx = aeIdx;
            return this;
        }
        @CustomType.Setter
        public Builder aeLacpForceUp(@Nullable Boolean aeLacpForceUp) {

            this.aeLacpForceUp = aeLacpForceUp;
            return this;
        }
        @CustomType.Setter
        public Builder aggregated(@Nullable Boolean aggregated) {

            this.aggregated = aggregated;
            return this;
        }
        @CustomType.Setter
        public Builder critical(@Nullable Boolean critical) {

            this.critical = critical;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder disableAutoneg(@Nullable Boolean disableAutoneg) {

            this.disableAutoneg = disableAutoneg;
            return this;
        }
        @CustomType.Setter
        public Builder disabled(@Nullable Boolean disabled) {

            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder dslType(@Nullable String dslType) {

            this.dslType = dslType;
            return this;
        }
        @CustomType.Setter
        public Builder dslVci(@Nullable Integer dslVci) {

            this.dslVci = dslVci;
            return this;
        }
        @CustomType.Setter
        public Builder dslVpi(@Nullable Integer dslVpi) {

            this.dslVpi = dslVpi;
            return this;
        }
        @CustomType.Setter
        public Builder duplex(@Nullable String duplex) {

            this.duplex = duplex;
            return this;
        }
        @CustomType.Setter
        public Builder ipConfig(@Nullable GatewaytemplatePortConfigIpConfig ipConfig) {

            this.ipConfig = ipConfig;
            return this;
        }
        @CustomType.Setter
        public Builder lteApn(@Nullable String lteApn) {

            this.lteApn = lteApn;
            return this;
        }
        @CustomType.Setter
        public Builder lteAuth(@Nullable String lteAuth) {

            this.lteAuth = lteAuth;
            return this;
        }
        @CustomType.Setter
        public Builder lteBackup(@Nullable Boolean lteBackup) {

            this.lteBackup = lteBackup;
            return this;
        }
        @CustomType.Setter
        public Builder ltePassword(@Nullable String ltePassword) {

            this.ltePassword = ltePassword;
            return this;
        }
        @CustomType.Setter
        public Builder lteUsername(@Nullable String lteUsername) {

            this.lteUsername = lteUsername;
            return this;
        }
        @CustomType.Setter
        public Builder mtu(@Nullable Integer mtu) {

            this.mtu = mtu;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder networks(@Nullable List<String> networks) {

            this.networks = networks;
            return this;
        }
        public Builder networks(String... networks) {
            return networks(List.of(networks));
        }
        @CustomType.Setter
        public Builder outerVlanId(@Nullable Integer outerVlanId) {

            this.outerVlanId = outerVlanId;
            return this;
        }
        @CustomType.Setter
        public Builder poeDisabled(@Nullable Boolean poeDisabled) {

            this.poeDisabled = poeDisabled;
            return this;
        }
        @CustomType.Setter
        public Builder portNetwork(@Nullable String portNetwork) {

            this.portNetwork = portNetwork;
            return this;
        }
        @CustomType.Setter
        public Builder preserveDscp(@Nullable Boolean preserveDscp) {

            this.preserveDscp = preserveDscp;
            return this;
        }
        @CustomType.Setter
        public Builder redundant(@Nullable Boolean redundant) {

            this.redundant = redundant;
            return this;
        }
        @CustomType.Setter
        public Builder redundantGroup(@Nullable Integer redundantGroup) {

            this.redundantGroup = redundantGroup;
            return this;
        }
        @CustomType.Setter
        public Builder rethIdx(@Nullable Integer rethIdx) {

            this.rethIdx = rethIdx;
            return this;
        }
        @CustomType.Setter
        public Builder rethNode(@Nullable String rethNode) {

            this.rethNode = rethNode;
            return this;
        }
        @CustomType.Setter
        public Builder rethNodes(@Nullable List<String> rethNodes) {

            this.rethNodes = rethNodes;
            return this;
        }
        public Builder rethNodes(String... rethNodes) {
            return rethNodes(List.of(rethNodes));
        }
        @CustomType.Setter
        public Builder speed(@Nullable String speed) {

            this.speed = speed;
            return this;
        }
        @CustomType.Setter
        public Builder ssrNoVirtualMac(@Nullable Boolean ssrNoVirtualMac) {

            this.ssrNoVirtualMac = ssrNoVirtualMac;
            return this;
        }
        @CustomType.Setter
        public Builder svrPortRange(@Nullable String svrPortRange) {

            this.svrPortRange = svrPortRange;
            return this;
        }
        @CustomType.Setter
        public Builder trafficShaping(@Nullable GatewaytemplatePortConfigTrafficShaping trafficShaping) {

            this.trafficShaping = trafficShaping;
            return this;
        }
        @CustomType.Setter
        public Builder usage(String usage) {
            if (usage == null) {
              throw new MissingRequiredPropertyException("GatewaytemplatePortConfig", "usage");
            }
            this.usage = usage;
            return this;
        }
        @CustomType.Setter
        public Builder vlanId(@Nullable String vlanId) {

            this.vlanId = vlanId;
            return this;
        }
        @CustomType.Setter
        public Builder vpnPaths(@Nullable Map<String,GatewaytemplatePortConfigVpnPaths> vpnPaths) {

            this.vpnPaths = vpnPaths;
            return this;
        }
        @CustomType.Setter
        public Builder wanArpPolicer(@Nullable String wanArpPolicer) {

            this.wanArpPolicer = wanArpPolicer;
            return this;
        }
        @CustomType.Setter
        public Builder wanExtIp(@Nullable String wanExtIp) {

            this.wanExtIp = wanExtIp;
            return this;
        }
        @CustomType.Setter
        public Builder wanExtraRoutes(@Nullable Map<String,GatewaytemplatePortConfigWanExtraRoutes> wanExtraRoutes) {

            this.wanExtraRoutes = wanExtraRoutes;
            return this;
        }
        @CustomType.Setter
        public Builder wanNetworks(@Nullable List<String> wanNetworks) {

            this.wanNetworks = wanNetworks;
            return this;
        }
        public Builder wanNetworks(String... wanNetworks) {
            return wanNetworks(List.of(wanNetworks));
        }
        @CustomType.Setter
        public Builder wanProbeOverride(@Nullable GatewaytemplatePortConfigWanProbeOverride wanProbeOverride) {

            this.wanProbeOverride = wanProbeOverride;
            return this;
        }
        @CustomType.Setter
        public Builder wanSourceNat(@Nullable GatewaytemplatePortConfigWanSourceNat wanSourceNat) {

            this.wanSourceNat = wanSourceNat;
            return this;
        }
        @CustomType.Setter
        public Builder wanType(@Nullable String wanType) {

            this.wanType = wanType;
            return this;
        }
        public GatewaytemplatePortConfig build() {
            final var _resultValue = new GatewaytemplatePortConfig();
            _resultValue.aeDisableLacp = aeDisableLacp;
            _resultValue.aeIdx = aeIdx;
            _resultValue.aeLacpForceUp = aeLacpForceUp;
            _resultValue.aggregated = aggregated;
            _resultValue.critical = critical;
            _resultValue.description = description;
            _resultValue.disableAutoneg = disableAutoneg;
            _resultValue.disabled = disabled;
            _resultValue.dslType = dslType;
            _resultValue.dslVci = dslVci;
            _resultValue.dslVpi = dslVpi;
            _resultValue.duplex = duplex;
            _resultValue.ipConfig = ipConfig;
            _resultValue.lteApn = lteApn;
            _resultValue.lteAuth = lteAuth;
            _resultValue.lteBackup = lteBackup;
            _resultValue.ltePassword = ltePassword;
            _resultValue.lteUsername = lteUsername;
            _resultValue.mtu = mtu;
            _resultValue.name = name;
            _resultValue.networks = networks;
            _resultValue.outerVlanId = outerVlanId;
            _resultValue.poeDisabled = poeDisabled;
            _resultValue.portNetwork = portNetwork;
            _resultValue.preserveDscp = preserveDscp;
            _resultValue.redundant = redundant;
            _resultValue.redundantGroup = redundantGroup;
            _resultValue.rethIdx = rethIdx;
            _resultValue.rethNode = rethNode;
            _resultValue.rethNodes = rethNodes;
            _resultValue.speed = speed;
            _resultValue.ssrNoVirtualMac = ssrNoVirtualMac;
            _resultValue.svrPortRange = svrPortRange;
            _resultValue.trafficShaping = trafficShaping;
            _resultValue.usage = usage;
            _resultValue.vlanId = vlanId;
            _resultValue.vpnPaths = vpnPaths;
            _resultValue.wanArpPolicer = wanArpPolicer;
            _resultValue.wanExtIp = wanExtIp;
            _resultValue.wanExtraRoutes = wanExtraRoutes;
            _resultValue.wanNetworks = wanNetworks;
            _resultValue.wanProbeOverride = wanProbeOverride;
            _resultValue.wanSourceNat = wanSourceNat;
            _resultValue.wanType = wanType;
            return _resultValue;
        }
    }
}
