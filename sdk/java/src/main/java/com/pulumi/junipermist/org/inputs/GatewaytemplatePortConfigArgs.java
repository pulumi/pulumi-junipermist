// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.inputs.GatewaytemplatePortConfigIpConfigArgs;
import com.pulumi.junipermist.org.inputs.GatewaytemplatePortConfigTrafficShapingArgs;
import com.pulumi.junipermist.org.inputs.GatewaytemplatePortConfigVpnPathsArgs;
import com.pulumi.junipermist.org.inputs.GatewaytemplatePortConfigWanSourceNatArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewaytemplatePortConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewaytemplatePortConfigArgs Empty = new GatewaytemplatePortConfigArgs();

    /**
     * if `aggregated`==`true`. To disable LCP support for the AE interface
     * 
     */
    @Import(name="aeDisableLacp")
    private @Nullable Output<Boolean> aeDisableLacp;

    /**
     * @return if `aggregated`==`true`. To disable LCP support for the AE interface
     * 
     */
    public Optional<Output<Boolean>> aeDisableLacp() {
        return Optional.ofNullable(this.aeDisableLacp);
    }

    /**
     * if `aggregated`==`true`. Users could force to use the designated AE name (must be an integer between 0 and 127)
     * 
     */
    @Import(name="aeIdx")
    private @Nullable Output<String> aeIdx;

    /**
     * @return if `aggregated`==`true`. Users could force to use the designated AE name (must be an integer between 0 and 127)
     * 
     */
    public Optional<Output<String>> aeIdx() {
        return Optional.ofNullable(this.aeIdx);
    }

    /**
     * For SRX Only, if `aggregated`==`true`.Sets the state of the interface as UP when the peer has limited LACP capability.\n
     * Use case: When a device connected to this AE port is ZTPing for the first time, it will not have LACP configured on the other end\n
     * Note: Turning this on will enable force-up on one of the interfaces in the bundle only
     * 
     */
    @Import(name="aeLacpForceUp")
    private @Nullable Output<Boolean> aeLacpForceUp;

    /**
     * @return For SRX Only, if `aggregated`==`true`.Sets the state of the interface as UP when the peer has limited LACP capability.\n
     * Use case: When a device connected to this AE port is ZTPing for the first time, it will not have LACP configured on the other end\n
     * Note: Turning this on will enable force-up on one of the interfaces in the bundle only
     * 
     */
    public Optional<Output<Boolean>> aeLacpForceUp() {
        return Optional.ofNullable(this.aeLacpForceUp);
    }

    @Import(name="aggregated")
    private @Nullable Output<Boolean> aggregated;

    public Optional<Output<Boolean>> aggregated() {
        return Optional.ofNullable(this.aggregated);
    }

    /**
     * if want to generate port up/down alarm, set it to true
     * 
     */
    @Import(name="critical")
    private @Nullable Output<Boolean> critical;

    /**
     * @return if want to generate port up/down alarm, set it to true
     * 
     */
    public Optional<Output<Boolean>> critical() {
        return Optional.ofNullable(this.critical);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="disableAutoneg")
    private @Nullable Output<Boolean> disableAutoneg;

    public Optional<Output<Boolean>> disableAutoneg() {
        return Optional.ofNullable(this.disableAutoneg);
    }

    /**
     * port admin up (true) / down (false)
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return port admin up (true) / down (false)
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * if `wan_type`==`dsl`. enum: `adsl`, `vdsl`
     * 
     */
    @Import(name="dslType")
    private @Nullable Output<String> dslType;

    /**
     * @return if `wan_type`==`dsl`. enum: `adsl`, `vdsl`
     * 
     */
    public Optional<Output<String>> dslType() {
        return Optional.ofNullable(this.dslType);
    }

    /**
     * if `wan_type`==`dsl`
     * 16 bit int
     * 
     */
    @Import(name="dslVci")
    private @Nullable Output<Integer> dslVci;

    /**
     * @return if `wan_type`==`dsl`
     * 16 bit int
     * 
     */
    public Optional<Output<Integer>> dslVci() {
        return Optional.ofNullable(this.dslVci);
    }

    /**
     * if `wan_type`==`dsl`
     * 8 bit int
     * 
     */
    @Import(name="dslVpi")
    private @Nullable Output<Integer> dslVpi;

    /**
     * @return if `wan_type`==`dsl`
     * 8 bit int
     * 
     */
    public Optional<Output<Integer>> dslVpi() {
        return Optional.ofNullable(this.dslVpi);
    }

    /**
     * enum: `auto`, `full`, `half`
     * 
     */
    @Import(name="duplex")
    private @Nullable Output<String> duplex;

    /**
     * @return enum: `auto`, `full`, `half`
     * 
     */
    public Optional<Output<String>> duplex() {
        return Optional.ofNullable(this.duplex);
    }

    /**
     * Junos IP Config
     * 
     */
    @Import(name="ipConfig")
    private @Nullable Output<GatewaytemplatePortConfigIpConfigArgs> ipConfig;

    /**
     * @return Junos IP Config
     * 
     */
    public Optional<Output<GatewaytemplatePortConfigIpConfigArgs>> ipConfig() {
        return Optional.ofNullable(this.ipConfig);
    }

    /**
     * if `wan_type`==`lte`
     * 
     */
    @Import(name="lteApn")
    private @Nullable Output<String> lteApn;

    /**
     * @return if `wan_type`==`lte`
     * 
     */
    public Optional<Output<String>> lteApn() {
        return Optional.ofNullable(this.lteApn);
    }

    /**
     * if `wan_type`==`lte`. enum: `chap`, `none`, `pap`
     * 
     */
    @Import(name="lteAuth")
    private @Nullable Output<String> lteAuth;

    /**
     * @return if `wan_type`==`lte`. enum: `chap`, `none`, `pap`
     * 
     */
    public Optional<Output<String>> lteAuth() {
        return Optional.ofNullable(this.lteAuth);
    }

    @Import(name="lteBackup")
    private @Nullable Output<Boolean> lteBackup;

    public Optional<Output<Boolean>> lteBackup() {
        return Optional.ofNullable(this.lteBackup);
    }

    /**
     * if `wan_type`==`lte`
     * 
     */
    @Import(name="ltePassword")
    private @Nullable Output<String> ltePassword;

    /**
     * @return if `wan_type`==`lte`
     * 
     */
    public Optional<Output<String>> ltePassword() {
        return Optional.ofNullable(this.ltePassword);
    }

    /**
     * if `wan_type`==`lte`
     * 
     */
    @Import(name="lteUsername")
    private @Nullable Output<String> lteUsername;

    /**
     * @return if `wan_type`==`lte`
     * 
     */
    public Optional<Output<String>> lteUsername() {
        return Optional.ofNullable(this.lteUsername);
    }

    @Import(name="mtu")
    private @Nullable Output<Integer> mtu;

    public Optional<Output<Integer>> mtu() {
        return Optional.ofNullable(this.mtu);
    }

    /**
     * name that we&#39;ll use to derive config
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return name that we&#39;ll use to derive config
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * if `usage`==`lan`
     * 
     */
    @Import(name="networks")
    private @Nullable Output<List<String>> networks;

    /**
     * @return if `usage`==`lan`
     * 
     */
    public Optional<Output<List<String>>> networks() {
        return Optional.ofNullable(this.networks);
    }

    /**
     * for Q-in-Q
     * 
     */
    @Import(name="outerVlanId")
    private @Nullable Output<Integer> outerVlanId;

    /**
     * @return for Q-in-Q
     * 
     */
    public Optional<Output<Integer>> outerVlanId() {
        return Optional.ofNullable(this.outerVlanId);
    }

    @Import(name="poeDisabled")
    private @Nullable Output<Boolean> poeDisabled;

    public Optional<Output<Boolean>> poeDisabled() {
        return Optional.ofNullable(this.poeDisabled);
    }

    /**
     * if `usage`==`lan`
     * 
     */
    @Import(name="portNetwork")
    private @Nullable Output<String> portNetwork;

    /**
     * @return if `usage`==`lan`
     * 
     */
    public Optional<Output<String>> portNetwork() {
        return Optional.ofNullable(this.portNetwork);
    }

    /**
     * whether to preserve dscp when sending traffic over VPN (SSR-only)
     * 
     */
    @Import(name="preserveDscp")
    private @Nullable Output<Boolean> preserveDscp;

    /**
     * @return whether to preserve dscp when sending traffic over VPN (SSR-only)
     * 
     */
    public Optional<Output<Boolean>> preserveDscp() {
        return Optional.ofNullable(this.preserveDscp);
    }

    /**
     * if HA mode
     * 
     */
    @Import(name="redundant")
    private @Nullable Output<Boolean> redundant;

    /**
     * @return if HA mode
     * 
     */
    public Optional<Output<Boolean>> redundant() {
        return Optional.ofNullable(this.redundant);
    }

    /**
     * if HA mode
     * 
     */
    @Import(name="rethIdx")
    private @Nullable Output<Integer> rethIdx;

    /**
     * @return if HA mode
     * 
     */
    public Optional<Output<Integer>> rethIdx() {
        return Optional.ofNullable(this.rethIdx);
    }

    /**
     * if HA mode
     * 
     */
    @Import(name="rethNode")
    private @Nullable Output<String> rethNode;

    /**
     * @return if HA mode
     * 
     */
    public Optional<Output<String>> rethNode() {
        return Optional.ofNullable(this.rethNode);
    }

    /**
     * SSR only - supporting vlan-based redundancy (matching the size of `networks`)
     * 
     */
    @Import(name="rethNodes")
    private @Nullable Output<List<String>> rethNodes;

    /**
     * @return SSR only - supporting vlan-based redundancy (matching the size of `networks`)
     * 
     */
    public Optional<Output<List<String>>> rethNodes() {
        return Optional.ofNullable(this.rethNodes);
    }

    @Import(name="speed")
    private @Nullable Output<String> speed;

    public Optional<Output<String>> speed() {
        return Optional.ofNullable(this.speed);
    }

    /**
     * when SSR is running as VM, this is required on certain hosting platforms
     * 
     */
    @Import(name="ssrNoVirtualMac")
    private @Nullable Output<Boolean> ssrNoVirtualMac;

    /**
     * @return when SSR is running as VM, this is required on certain hosting platforms
     * 
     */
    public Optional<Output<Boolean>> ssrNoVirtualMac() {
        return Optional.ofNullable(this.ssrNoVirtualMac);
    }

    /**
     * for SSR only
     * 
     */
    @Import(name="svrPortRange")
    private @Nullable Output<String> svrPortRange;

    /**
     * @return for SSR only
     * 
     */
    public Optional<Output<String>> svrPortRange() {
        return Optional.ofNullable(this.svrPortRange);
    }

    @Import(name="trafficShaping")
    private @Nullable Output<GatewaytemplatePortConfigTrafficShapingArgs> trafficShaping;

    public Optional<Output<GatewaytemplatePortConfigTrafficShapingArgs>> trafficShaping() {
        return Optional.ofNullable(this.trafficShaping);
    }

    /**
     * port usage name. enum: `ha_control`, `ha_data`, `lan`, `wan`
     * 
     */
    @Import(name="usage", required=true)
    private Output<String> usage;

    /**
     * @return port usage name. enum: `ha_control`, `ha_data`, `lan`, `wan`
     * 
     */
    public Output<String> usage() {
        return this.usage;
    }

    /**
     * if WAN interface is on a VLAN
     * 
     */
    @Import(name="vlanId")
    private @Nullable Output<Integer> vlanId;

    /**
     * @return if WAN interface is on a VLAN
     * 
     */
    public Optional<Output<Integer>> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    @Import(name="vpnPaths")
    private @Nullable Output<Map<String,GatewaytemplatePortConfigVpnPathsArgs>> vpnPaths;

    public Optional<Output<Map<String,GatewaytemplatePortConfigVpnPathsArgs>>> vpnPaths() {
        return Optional.ofNullable(this.vpnPaths);
    }

    /**
     * when `wan_type`==`broadband`. enum: `default`, `max`, `recommended`
     * 
     */
    @Import(name="wanArpPolicer")
    private @Nullable Output<String> wanArpPolicer;

    /**
     * @return when `wan_type`==`broadband`. enum: `default`, `max`, `recommended`
     * 
     */
    public Optional<Output<String>> wanArpPolicer() {
        return Optional.ofNullable(this.wanArpPolicer);
    }

    /**
     * optional, if spoke should reach this port by a different IP
     * 
     */
    @Import(name="wanExtIp")
    private @Nullable Output<String> wanExtIp;

    /**
     * @return optional, if spoke should reach this port by a different IP
     * 
     */
    public Optional<Output<String>> wanExtIp() {
        return Optional.ofNullable(this.wanExtIp);
    }

    /**
     * optional, by default, source-NAT is performed on all WAN Ports using the interface-ip
     * 
     */
    @Import(name="wanSourceNat")
    private @Nullable Output<GatewaytemplatePortConfigWanSourceNatArgs> wanSourceNat;

    /**
     * @return optional, by default, source-NAT is performed on all WAN Ports using the interface-ip
     * 
     */
    public Optional<Output<GatewaytemplatePortConfigWanSourceNatArgs>> wanSourceNat() {
        return Optional.ofNullable(this.wanSourceNat);
    }

    /**
     * if `usage`==`wan`. enum: `broadband`, `dsl`, `lte`
     * 
     */
    @Import(name="wanType")
    private @Nullable Output<String> wanType;

    /**
     * @return if `usage`==`wan`. enum: `broadband`, `dsl`, `lte`
     * 
     */
    public Optional<Output<String>> wanType() {
        return Optional.ofNullable(this.wanType);
    }

    private GatewaytemplatePortConfigArgs() {}

    private GatewaytemplatePortConfigArgs(GatewaytemplatePortConfigArgs $) {
        this.aeDisableLacp = $.aeDisableLacp;
        this.aeIdx = $.aeIdx;
        this.aeLacpForceUp = $.aeLacpForceUp;
        this.aggregated = $.aggregated;
        this.critical = $.critical;
        this.description = $.description;
        this.disableAutoneg = $.disableAutoneg;
        this.disabled = $.disabled;
        this.dslType = $.dslType;
        this.dslVci = $.dslVci;
        this.dslVpi = $.dslVpi;
        this.duplex = $.duplex;
        this.ipConfig = $.ipConfig;
        this.lteApn = $.lteApn;
        this.lteAuth = $.lteAuth;
        this.lteBackup = $.lteBackup;
        this.ltePassword = $.ltePassword;
        this.lteUsername = $.lteUsername;
        this.mtu = $.mtu;
        this.name = $.name;
        this.networks = $.networks;
        this.outerVlanId = $.outerVlanId;
        this.poeDisabled = $.poeDisabled;
        this.portNetwork = $.portNetwork;
        this.preserveDscp = $.preserveDscp;
        this.redundant = $.redundant;
        this.rethIdx = $.rethIdx;
        this.rethNode = $.rethNode;
        this.rethNodes = $.rethNodes;
        this.speed = $.speed;
        this.ssrNoVirtualMac = $.ssrNoVirtualMac;
        this.svrPortRange = $.svrPortRange;
        this.trafficShaping = $.trafficShaping;
        this.usage = $.usage;
        this.vlanId = $.vlanId;
        this.vpnPaths = $.vpnPaths;
        this.wanArpPolicer = $.wanArpPolicer;
        this.wanExtIp = $.wanExtIp;
        this.wanSourceNat = $.wanSourceNat;
        this.wanType = $.wanType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewaytemplatePortConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewaytemplatePortConfigArgs $;

        public Builder() {
            $ = new GatewaytemplatePortConfigArgs();
        }

        public Builder(GatewaytemplatePortConfigArgs defaults) {
            $ = new GatewaytemplatePortConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aeDisableLacp if `aggregated`==`true`. To disable LCP support for the AE interface
         * 
         * @return builder
         * 
         */
        public Builder aeDisableLacp(@Nullable Output<Boolean> aeDisableLacp) {
            $.aeDisableLacp = aeDisableLacp;
            return this;
        }

        /**
         * @param aeDisableLacp if `aggregated`==`true`. To disable LCP support for the AE interface
         * 
         * @return builder
         * 
         */
        public Builder aeDisableLacp(Boolean aeDisableLacp) {
            return aeDisableLacp(Output.of(aeDisableLacp));
        }

        /**
         * @param aeIdx if `aggregated`==`true`. Users could force to use the designated AE name (must be an integer between 0 and 127)
         * 
         * @return builder
         * 
         */
        public Builder aeIdx(@Nullable Output<String> aeIdx) {
            $.aeIdx = aeIdx;
            return this;
        }

        /**
         * @param aeIdx if `aggregated`==`true`. Users could force to use the designated AE name (must be an integer between 0 and 127)
         * 
         * @return builder
         * 
         */
        public Builder aeIdx(String aeIdx) {
            return aeIdx(Output.of(aeIdx));
        }

        /**
         * @param aeLacpForceUp For SRX Only, if `aggregated`==`true`.Sets the state of the interface as UP when the peer has limited LACP capability.\n
         * Use case: When a device connected to this AE port is ZTPing for the first time, it will not have LACP configured on the other end\n
         * Note: Turning this on will enable force-up on one of the interfaces in the bundle only
         * 
         * @return builder
         * 
         */
        public Builder aeLacpForceUp(@Nullable Output<Boolean> aeLacpForceUp) {
            $.aeLacpForceUp = aeLacpForceUp;
            return this;
        }

        /**
         * @param aeLacpForceUp For SRX Only, if `aggregated`==`true`.Sets the state of the interface as UP when the peer has limited LACP capability.\n
         * Use case: When a device connected to this AE port is ZTPing for the first time, it will not have LACP configured on the other end\n
         * Note: Turning this on will enable force-up on one of the interfaces in the bundle only
         * 
         * @return builder
         * 
         */
        public Builder aeLacpForceUp(Boolean aeLacpForceUp) {
            return aeLacpForceUp(Output.of(aeLacpForceUp));
        }

        public Builder aggregated(@Nullable Output<Boolean> aggregated) {
            $.aggregated = aggregated;
            return this;
        }

        public Builder aggregated(Boolean aggregated) {
            return aggregated(Output.of(aggregated));
        }

        /**
         * @param critical if want to generate port up/down alarm, set it to true
         * 
         * @return builder
         * 
         */
        public Builder critical(@Nullable Output<Boolean> critical) {
            $.critical = critical;
            return this;
        }

        /**
         * @param critical if want to generate port up/down alarm, set it to true
         * 
         * @return builder
         * 
         */
        public Builder critical(Boolean critical) {
            return critical(Output.of(critical));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder disableAutoneg(@Nullable Output<Boolean> disableAutoneg) {
            $.disableAutoneg = disableAutoneg;
            return this;
        }

        public Builder disableAutoneg(Boolean disableAutoneg) {
            return disableAutoneg(Output.of(disableAutoneg));
        }

        /**
         * @param disabled port admin up (true) / down (false)
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled port admin up (true) / down (false)
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param dslType if `wan_type`==`dsl`. enum: `adsl`, `vdsl`
         * 
         * @return builder
         * 
         */
        public Builder dslType(@Nullable Output<String> dslType) {
            $.dslType = dslType;
            return this;
        }

        /**
         * @param dslType if `wan_type`==`dsl`. enum: `adsl`, `vdsl`
         * 
         * @return builder
         * 
         */
        public Builder dslType(String dslType) {
            return dslType(Output.of(dslType));
        }

        /**
         * @param dslVci if `wan_type`==`dsl`
         * 16 bit int
         * 
         * @return builder
         * 
         */
        public Builder dslVci(@Nullable Output<Integer> dslVci) {
            $.dslVci = dslVci;
            return this;
        }

        /**
         * @param dslVci if `wan_type`==`dsl`
         * 16 bit int
         * 
         * @return builder
         * 
         */
        public Builder dslVci(Integer dslVci) {
            return dslVci(Output.of(dslVci));
        }

        /**
         * @param dslVpi if `wan_type`==`dsl`
         * 8 bit int
         * 
         * @return builder
         * 
         */
        public Builder dslVpi(@Nullable Output<Integer> dslVpi) {
            $.dslVpi = dslVpi;
            return this;
        }

        /**
         * @param dslVpi if `wan_type`==`dsl`
         * 8 bit int
         * 
         * @return builder
         * 
         */
        public Builder dslVpi(Integer dslVpi) {
            return dslVpi(Output.of(dslVpi));
        }

        /**
         * @param duplex enum: `auto`, `full`, `half`
         * 
         * @return builder
         * 
         */
        public Builder duplex(@Nullable Output<String> duplex) {
            $.duplex = duplex;
            return this;
        }

        /**
         * @param duplex enum: `auto`, `full`, `half`
         * 
         * @return builder
         * 
         */
        public Builder duplex(String duplex) {
            return duplex(Output.of(duplex));
        }

        /**
         * @param ipConfig Junos IP Config
         * 
         * @return builder
         * 
         */
        public Builder ipConfig(@Nullable Output<GatewaytemplatePortConfigIpConfigArgs> ipConfig) {
            $.ipConfig = ipConfig;
            return this;
        }

        /**
         * @param ipConfig Junos IP Config
         * 
         * @return builder
         * 
         */
        public Builder ipConfig(GatewaytemplatePortConfigIpConfigArgs ipConfig) {
            return ipConfig(Output.of(ipConfig));
        }

        /**
         * @param lteApn if `wan_type`==`lte`
         * 
         * @return builder
         * 
         */
        public Builder lteApn(@Nullable Output<String> lteApn) {
            $.lteApn = lteApn;
            return this;
        }

        /**
         * @param lteApn if `wan_type`==`lte`
         * 
         * @return builder
         * 
         */
        public Builder lteApn(String lteApn) {
            return lteApn(Output.of(lteApn));
        }

        /**
         * @param lteAuth if `wan_type`==`lte`. enum: `chap`, `none`, `pap`
         * 
         * @return builder
         * 
         */
        public Builder lteAuth(@Nullable Output<String> lteAuth) {
            $.lteAuth = lteAuth;
            return this;
        }

        /**
         * @param lteAuth if `wan_type`==`lte`. enum: `chap`, `none`, `pap`
         * 
         * @return builder
         * 
         */
        public Builder lteAuth(String lteAuth) {
            return lteAuth(Output.of(lteAuth));
        }

        public Builder lteBackup(@Nullable Output<Boolean> lteBackup) {
            $.lteBackup = lteBackup;
            return this;
        }

        public Builder lteBackup(Boolean lteBackup) {
            return lteBackup(Output.of(lteBackup));
        }

        /**
         * @param ltePassword if `wan_type`==`lte`
         * 
         * @return builder
         * 
         */
        public Builder ltePassword(@Nullable Output<String> ltePassword) {
            $.ltePassword = ltePassword;
            return this;
        }

        /**
         * @param ltePassword if `wan_type`==`lte`
         * 
         * @return builder
         * 
         */
        public Builder ltePassword(String ltePassword) {
            return ltePassword(Output.of(ltePassword));
        }

        /**
         * @param lteUsername if `wan_type`==`lte`
         * 
         * @return builder
         * 
         */
        public Builder lteUsername(@Nullable Output<String> lteUsername) {
            $.lteUsername = lteUsername;
            return this;
        }

        /**
         * @param lteUsername if `wan_type`==`lte`
         * 
         * @return builder
         * 
         */
        public Builder lteUsername(String lteUsername) {
            return lteUsername(Output.of(lteUsername));
        }

        public Builder mtu(@Nullable Output<Integer> mtu) {
            $.mtu = mtu;
            return this;
        }

        public Builder mtu(Integer mtu) {
            return mtu(Output.of(mtu));
        }

        /**
         * @param name name that we&#39;ll use to derive config
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name name that we&#39;ll use to derive config
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networks if `usage`==`lan`
         * 
         * @return builder
         * 
         */
        public Builder networks(@Nullable Output<List<String>> networks) {
            $.networks = networks;
            return this;
        }

        /**
         * @param networks if `usage`==`lan`
         * 
         * @return builder
         * 
         */
        public Builder networks(List<String> networks) {
            return networks(Output.of(networks));
        }

        /**
         * @param networks if `usage`==`lan`
         * 
         * @return builder
         * 
         */
        public Builder networks(String... networks) {
            return networks(List.of(networks));
        }

        /**
         * @param outerVlanId for Q-in-Q
         * 
         * @return builder
         * 
         */
        public Builder outerVlanId(@Nullable Output<Integer> outerVlanId) {
            $.outerVlanId = outerVlanId;
            return this;
        }

        /**
         * @param outerVlanId for Q-in-Q
         * 
         * @return builder
         * 
         */
        public Builder outerVlanId(Integer outerVlanId) {
            return outerVlanId(Output.of(outerVlanId));
        }

        public Builder poeDisabled(@Nullable Output<Boolean> poeDisabled) {
            $.poeDisabled = poeDisabled;
            return this;
        }

        public Builder poeDisabled(Boolean poeDisabled) {
            return poeDisabled(Output.of(poeDisabled));
        }

        /**
         * @param portNetwork if `usage`==`lan`
         * 
         * @return builder
         * 
         */
        public Builder portNetwork(@Nullable Output<String> portNetwork) {
            $.portNetwork = portNetwork;
            return this;
        }

        /**
         * @param portNetwork if `usage`==`lan`
         * 
         * @return builder
         * 
         */
        public Builder portNetwork(String portNetwork) {
            return portNetwork(Output.of(portNetwork));
        }

        /**
         * @param preserveDscp whether to preserve dscp when sending traffic over VPN (SSR-only)
         * 
         * @return builder
         * 
         */
        public Builder preserveDscp(@Nullable Output<Boolean> preserveDscp) {
            $.preserveDscp = preserveDscp;
            return this;
        }

        /**
         * @param preserveDscp whether to preserve dscp when sending traffic over VPN (SSR-only)
         * 
         * @return builder
         * 
         */
        public Builder preserveDscp(Boolean preserveDscp) {
            return preserveDscp(Output.of(preserveDscp));
        }

        /**
         * @param redundant if HA mode
         * 
         * @return builder
         * 
         */
        public Builder redundant(@Nullable Output<Boolean> redundant) {
            $.redundant = redundant;
            return this;
        }

        /**
         * @param redundant if HA mode
         * 
         * @return builder
         * 
         */
        public Builder redundant(Boolean redundant) {
            return redundant(Output.of(redundant));
        }

        /**
         * @param rethIdx if HA mode
         * 
         * @return builder
         * 
         */
        public Builder rethIdx(@Nullable Output<Integer> rethIdx) {
            $.rethIdx = rethIdx;
            return this;
        }

        /**
         * @param rethIdx if HA mode
         * 
         * @return builder
         * 
         */
        public Builder rethIdx(Integer rethIdx) {
            return rethIdx(Output.of(rethIdx));
        }

        /**
         * @param rethNode if HA mode
         * 
         * @return builder
         * 
         */
        public Builder rethNode(@Nullable Output<String> rethNode) {
            $.rethNode = rethNode;
            return this;
        }

        /**
         * @param rethNode if HA mode
         * 
         * @return builder
         * 
         */
        public Builder rethNode(String rethNode) {
            return rethNode(Output.of(rethNode));
        }

        /**
         * @param rethNodes SSR only - supporting vlan-based redundancy (matching the size of `networks`)
         * 
         * @return builder
         * 
         */
        public Builder rethNodes(@Nullable Output<List<String>> rethNodes) {
            $.rethNodes = rethNodes;
            return this;
        }

        /**
         * @param rethNodes SSR only - supporting vlan-based redundancy (matching the size of `networks`)
         * 
         * @return builder
         * 
         */
        public Builder rethNodes(List<String> rethNodes) {
            return rethNodes(Output.of(rethNodes));
        }

        /**
         * @param rethNodes SSR only - supporting vlan-based redundancy (matching the size of `networks`)
         * 
         * @return builder
         * 
         */
        public Builder rethNodes(String... rethNodes) {
            return rethNodes(List.of(rethNodes));
        }

        public Builder speed(@Nullable Output<String> speed) {
            $.speed = speed;
            return this;
        }

        public Builder speed(String speed) {
            return speed(Output.of(speed));
        }

        /**
         * @param ssrNoVirtualMac when SSR is running as VM, this is required on certain hosting platforms
         * 
         * @return builder
         * 
         */
        public Builder ssrNoVirtualMac(@Nullable Output<Boolean> ssrNoVirtualMac) {
            $.ssrNoVirtualMac = ssrNoVirtualMac;
            return this;
        }

        /**
         * @param ssrNoVirtualMac when SSR is running as VM, this is required on certain hosting platforms
         * 
         * @return builder
         * 
         */
        public Builder ssrNoVirtualMac(Boolean ssrNoVirtualMac) {
            return ssrNoVirtualMac(Output.of(ssrNoVirtualMac));
        }

        /**
         * @param svrPortRange for SSR only
         * 
         * @return builder
         * 
         */
        public Builder svrPortRange(@Nullable Output<String> svrPortRange) {
            $.svrPortRange = svrPortRange;
            return this;
        }

        /**
         * @param svrPortRange for SSR only
         * 
         * @return builder
         * 
         */
        public Builder svrPortRange(String svrPortRange) {
            return svrPortRange(Output.of(svrPortRange));
        }

        public Builder trafficShaping(@Nullable Output<GatewaytemplatePortConfigTrafficShapingArgs> trafficShaping) {
            $.trafficShaping = trafficShaping;
            return this;
        }

        public Builder trafficShaping(GatewaytemplatePortConfigTrafficShapingArgs trafficShaping) {
            return trafficShaping(Output.of(trafficShaping));
        }

        /**
         * @param usage port usage name. enum: `ha_control`, `ha_data`, `lan`, `wan`
         * 
         * @return builder
         * 
         */
        public Builder usage(Output<String> usage) {
            $.usage = usage;
            return this;
        }

        /**
         * @param usage port usage name. enum: `ha_control`, `ha_data`, `lan`, `wan`
         * 
         * @return builder
         * 
         */
        public Builder usage(String usage) {
            return usage(Output.of(usage));
        }

        /**
         * @param vlanId if WAN interface is on a VLAN
         * 
         * @return builder
         * 
         */
        public Builder vlanId(@Nullable Output<Integer> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        /**
         * @param vlanId if WAN interface is on a VLAN
         * 
         * @return builder
         * 
         */
        public Builder vlanId(Integer vlanId) {
            return vlanId(Output.of(vlanId));
        }

        public Builder vpnPaths(@Nullable Output<Map<String,GatewaytemplatePortConfigVpnPathsArgs>> vpnPaths) {
            $.vpnPaths = vpnPaths;
            return this;
        }

        public Builder vpnPaths(Map<String,GatewaytemplatePortConfigVpnPathsArgs> vpnPaths) {
            return vpnPaths(Output.of(vpnPaths));
        }

        /**
         * @param wanArpPolicer when `wan_type`==`broadband`. enum: `default`, `max`, `recommended`
         * 
         * @return builder
         * 
         */
        public Builder wanArpPolicer(@Nullable Output<String> wanArpPolicer) {
            $.wanArpPolicer = wanArpPolicer;
            return this;
        }

        /**
         * @param wanArpPolicer when `wan_type`==`broadband`. enum: `default`, `max`, `recommended`
         * 
         * @return builder
         * 
         */
        public Builder wanArpPolicer(String wanArpPolicer) {
            return wanArpPolicer(Output.of(wanArpPolicer));
        }

        /**
         * @param wanExtIp optional, if spoke should reach this port by a different IP
         * 
         * @return builder
         * 
         */
        public Builder wanExtIp(@Nullable Output<String> wanExtIp) {
            $.wanExtIp = wanExtIp;
            return this;
        }

        /**
         * @param wanExtIp optional, if spoke should reach this port by a different IP
         * 
         * @return builder
         * 
         */
        public Builder wanExtIp(String wanExtIp) {
            return wanExtIp(Output.of(wanExtIp));
        }

        /**
         * @param wanSourceNat optional, by default, source-NAT is performed on all WAN Ports using the interface-ip
         * 
         * @return builder
         * 
         */
        public Builder wanSourceNat(@Nullable Output<GatewaytemplatePortConfigWanSourceNatArgs> wanSourceNat) {
            $.wanSourceNat = wanSourceNat;
            return this;
        }

        /**
         * @param wanSourceNat optional, by default, source-NAT is performed on all WAN Ports using the interface-ip
         * 
         * @return builder
         * 
         */
        public Builder wanSourceNat(GatewaytemplatePortConfigWanSourceNatArgs wanSourceNat) {
            return wanSourceNat(Output.of(wanSourceNat));
        }

        /**
         * @param wanType if `usage`==`wan`. enum: `broadband`, `dsl`, `lte`
         * 
         * @return builder
         * 
         */
        public Builder wanType(@Nullable Output<String> wanType) {
            $.wanType = wanType;
            return this;
        }

        /**
         * @param wanType if `usage`==`wan`. enum: `broadband`, `dsl`, `lte`
         * 
         * @return builder
         * 
         */
        public Builder wanType(String wanType) {
            return wanType(Output.of(wanType));
        }

        public GatewaytemplatePortConfigArgs build() {
            if ($.usage == null) {
                throw new MissingRequiredPropertyException("GatewaytemplatePortConfigArgs", "usage");
            }
            return $;
        }
    }

}
