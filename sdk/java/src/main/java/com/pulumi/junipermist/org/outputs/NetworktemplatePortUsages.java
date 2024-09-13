// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.org.outputs.NetworktemplatePortUsagesRule;
import com.pulumi.junipermist.org.outputs.NetworktemplatePortUsagesStormControl;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworktemplatePortUsages {
    /**
     * @return Only if `mode`==`trunk` whether to trunk all network/vlans
     * 
     */
    private @Nullable Boolean allNetworks;
    /**
     * @return Only if `mode`!=`dynamic` if DHCP snooping is enabled, whether DHCP server is allowed on the interfaces with. All the interfaces from port configs using this port usage are effected. Please notice that allow_dhcpd is a tri_state.
     * 
     * When it is not defined, it means using the system’s default setting which depends on whether the port is a access or trunk port.
     * 
     */
    private @Nullable Boolean allowDhcpd;
    /**
     * @return Only if `mode`!=`dynamic`
     * 
     */
    private @Nullable Boolean allowMultipleSupplicants;
    /**
     * @return Only if `mode`!=`dynamic` and `port_auth`==`dot1x` bypass auth for known clients if set to true when RADIUS server is down
     * 
     */
    private @Nullable Boolean bypassAuthWhenServerDown;
    /**
     * @return Only if `mode`!=`dynamic` and `port_auth`=`dot1x` bypass auth for all (including unknown clients) if set to true when RADIUS server is down
     * 
     */
    private @Nullable Boolean bypassAuthWhenServerDownForUnkonwnClient;
    /**
     * @return Only if `mode`!=`dynamic`
     * 
     */
    private @Nullable String description;
    /**
     * @return Only if `mode`!=`dynamic` if speed and duplex are specified, whether to disable autonegotiation
     * 
     */
    private @Nullable Boolean disableAutoneg;
    /**
     * @return Only if `mode`!=`dynamic` whether the port is disabled
     * 
     */
    private @Nullable Boolean disabled;
    /**
     * @return Only if `mode`!=`dynamic` link connection mode. enum: `auto`, `full`, `half`
     * 
     */
    private @Nullable String duplex;
    /**
     * @return Only if `mode`!=`dynamic` and `port_auth`==`dot1x`, if dynamic vlan is used, specify the possible networks/vlans RADIUS can return
     * 
     */
    private @Nullable List<String> dynamicVlanNetworks;
    /**
     * @return Only if `mode`!=`dynamic` and `port_auth`==`dot1x` whether to enable MAC Auth
     * 
     */
    private @Nullable Boolean enableMacAuth;
    /**
     * @return Only if `mode`!=`dynamic`
     * 
     */
    private @Nullable Boolean enableQos;
    /**
     * @return Only if `mode`!=`dynamic` and `port_auth`==`dot1x` which network to put the device into if the device cannot do dot1x. default is null (i.e. not allowed)
     * 
     */
    private @Nullable String guestNetwork;
    /**
     * @return Only if `mode`!=`dynamic` inter_switch_link is used together with &#34;isolation&#34; under networks
     * NOTE: inter_switch_link works only between Juniper device. This has to be applied to both ports connected together
     * 
     */
    private @Nullable Boolean interSwitchLink;
    /**
     * @return Only if `mode`!=`dynamic` and `enable_mac_auth`==`true`
     * 
     */
    private @Nullable Boolean macAuthOnly;
    /**
     * @return Only if `mode`!=`dynamic` + `enable_mac_auth`==`true` + `mac_auth_only`==`false`, dot1x will be given priority then mac_auth. Enable this to prefer mac_auth over dot1x.
     * 
     */
    private @Nullable Boolean macAuthPreferred;
    /**
     * @return Only if `mode`!=`dynamic` and `enable_mac_auth` ==`true`. This type is ignored if mist_nac is enabled. enum: `eap-md5`, `eap-peap`, `pap`
     * 
     */
    private @Nullable String macAuthProtocol;
    /**
     * @return Only if `mode`!=`dynamic` max number of mac addresses, default is 0 for unlimited, otherwise range is 1 or higher, with upper bound constrained by platform
     * 
     */
    private @Nullable Integer macLimit;
    /**
     * @return `mode`==`dynamic` must only be used with the port usage with the name `dynamic`. enum: `access`, `dynamic`, `inet`, `trunk`
     * 
     */
    private @Nullable String mode;
    /**
     * @return Only if `mode`!=`dynamic` media maximum transmission unit (MTU) is the largest data unit that can be forwarded without fragmentation. The default value is 1514.
     * 
     */
    private @Nullable Integer mtu;
    /**
     * @return Only if `mode`==`trunk`, the list of network/vlans
     * 
     */
    private @Nullable List<String> networks;
    /**
     * @return Only if `mode`==`access` and `port_auth`!=`dot1x` whether the port should retain dynamically learned MAC addresses
     * 
     */
    private @Nullable Boolean persistMac;
    /**
     * @return Only if `mode`!=`dynamic` whether PoE capabilities are disabled for a port
     * 
     */
    private @Nullable Boolean poeDisabled;
    /**
     * @return Only if `mode`!=`dynamic` if dot1x is desired, set to dot1x. enum: `dot1x`
     * 
     */
    private @Nullable String portAuth;
    /**
     * @return Only if `mode`!=`dynamic` native network/vlan for untagged traffic
     * 
     */
    private @Nullable String portNetwork;
    /**
     * @return Only if `mode`!=`dynamic` and `port_auth`=`dot1x` reauthentication interval range
     * 
     */
    private @Nullable Integer reauthInterval;
    /**
     * @return Only if `mode`==`dynamic` Control when the DPC port should be changed to the default port usage. enum: `link_down`, `none` (let the DPC port keep at the current port usage)
     * 
     */
    private @Nullable String resetDefaultWhen;
    /**
     * @return Only if `mode`==`dynamic`
     * 
     */
    private @Nullable List<NetworktemplatePortUsagesRule> rules;
    /**
     * @return Only if `mode`!=`dynamic` and `port_auth`==`dot1x` sets server fail fallback vlan
     * 
     */
    private @Nullable String serverFailNetwork;
    /**
     * @return Only if `mode`!=`dynamic` and `port_auth`==`dot1x` when radius server reject / fails
     * 
     */
    private @Nullable String serverRejectNetwork;
    /**
     * @return Only if `mode`!=`dynamic` speed, default is auto to automatically negotiate speed
     * 
     */
    private @Nullable String speed;
    /**
     * @return Switch storm control
     * Only if `mode`!=`dynamic`
     * 
     */
    private @Nullable NetworktemplatePortUsagesStormControl stormControl;
    /**
     * @return Only if `mode`!=`dynamic` when enabled, the port is not expected to receive BPDU frames
     * 
     */
    private @Nullable Boolean stpEdge;
    private @Nullable Boolean stpNoRootPort;
    private @Nullable Boolean stpP2p;
    /**
     * @return Only if `mode`!=`dynamic` network/vlan for voip traffic, must also set port_network. to authenticate device, set port_auth
     * 
     */
    private @Nullable String voipNetwork;

    private NetworktemplatePortUsages() {}
    /**
     * @return Only if `mode`==`trunk` whether to trunk all network/vlans
     * 
     */
    public Optional<Boolean> allNetworks() {
        return Optional.ofNullable(this.allNetworks);
    }
    /**
     * @return Only if `mode`!=`dynamic` if DHCP snooping is enabled, whether DHCP server is allowed on the interfaces with. All the interfaces from port configs using this port usage are effected. Please notice that allow_dhcpd is a tri_state.
     * 
     * When it is not defined, it means using the system’s default setting which depends on whether the port is a access or trunk port.
     * 
     */
    public Optional<Boolean> allowDhcpd() {
        return Optional.ofNullable(this.allowDhcpd);
    }
    /**
     * @return Only if `mode`!=`dynamic`
     * 
     */
    public Optional<Boolean> allowMultipleSupplicants() {
        return Optional.ofNullable(this.allowMultipleSupplicants);
    }
    /**
     * @return Only if `mode`!=`dynamic` and `port_auth`==`dot1x` bypass auth for known clients if set to true when RADIUS server is down
     * 
     */
    public Optional<Boolean> bypassAuthWhenServerDown() {
        return Optional.ofNullable(this.bypassAuthWhenServerDown);
    }
    /**
     * @return Only if `mode`!=`dynamic` and `port_auth`=`dot1x` bypass auth for all (including unknown clients) if set to true when RADIUS server is down
     * 
     */
    public Optional<Boolean> bypassAuthWhenServerDownForUnkonwnClient() {
        return Optional.ofNullable(this.bypassAuthWhenServerDownForUnkonwnClient);
    }
    /**
     * @return Only if `mode`!=`dynamic`
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Only if `mode`!=`dynamic` if speed and duplex are specified, whether to disable autonegotiation
     * 
     */
    public Optional<Boolean> disableAutoneg() {
        return Optional.ofNullable(this.disableAutoneg);
    }
    /**
     * @return Only if `mode`!=`dynamic` whether the port is disabled
     * 
     */
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * @return Only if `mode`!=`dynamic` link connection mode. enum: `auto`, `full`, `half`
     * 
     */
    public Optional<String> duplex() {
        return Optional.ofNullable(this.duplex);
    }
    /**
     * @return Only if `mode`!=`dynamic` and `port_auth`==`dot1x`, if dynamic vlan is used, specify the possible networks/vlans RADIUS can return
     * 
     */
    public List<String> dynamicVlanNetworks() {
        return this.dynamicVlanNetworks == null ? List.of() : this.dynamicVlanNetworks;
    }
    /**
     * @return Only if `mode`!=`dynamic` and `port_auth`==`dot1x` whether to enable MAC Auth
     * 
     */
    public Optional<Boolean> enableMacAuth() {
        return Optional.ofNullable(this.enableMacAuth);
    }
    /**
     * @return Only if `mode`!=`dynamic`
     * 
     */
    public Optional<Boolean> enableQos() {
        return Optional.ofNullable(this.enableQos);
    }
    /**
     * @return Only if `mode`!=`dynamic` and `port_auth`==`dot1x` which network to put the device into if the device cannot do dot1x. default is null (i.e. not allowed)
     * 
     */
    public Optional<String> guestNetwork() {
        return Optional.ofNullable(this.guestNetwork);
    }
    /**
     * @return Only if `mode`!=`dynamic` inter_switch_link is used together with &#34;isolation&#34; under networks
     * NOTE: inter_switch_link works only between Juniper device. This has to be applied to both ports connected together
     * 
     */
    public Optional<Boolean> interSwitchLink() {
        return Optional.ofNullable(this.interSwitchLink);
    }
    /**
     * @return Only if `mode`!=`dynamic` and `enable_mac_auth`==`true`
     * 
     */
    public Optional<Boolean> macAuthOnly() {
        return Optional.ofNullable(this.macAuthOnly);
    }
    /**
     * @return Only if `mode`!=`dynamic` + `enable_mac_auth`==`true` + `mac_auth_only`==`false`, dot1x will be given priority then mac_auth. Enable this to prefer mac_auth over dot1x.
     * 
     */
    public Optional<Boolean> macAuthPreferred() {
        return Optional.ofNullable(this.macAuthPreferred);
    }
    /**
     * @return Only if `mode`!=`dynamic` and `enable_mac_auth` ==`true`. This type is ignored if mist_nac is enabled. enum: `eap-md5`, `eap-peap`, `pap`
     * 
     */
    public Optional<String> macAuthProtocol() {
        return Optional.ofNullable(this.macAuthProtocol);
    }
    /**
     * @return Only if `mode`!=`dynamic` max number of mac addresses, default is 0 for unlimited, otherwise range is 1 or higher, with upper bound constrained by platform
     * 
     */
    public Optional<Integer> macLimit() {
        return Optional.ofNullable(this.macLimit);
    }
    /**
     * @return `mode`==`dynamic` must only be used with the port usage with the name `dynamic`. enum: `access`, `dynamic`, `inet`, `trunk`
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return Only if `mode`!=`dynamic` media maximum transmission unit (MTU) is the largest data unit that can be forwarded without fragmentation. The default value is 1514.
     * 
     */
    public Optional<Integer> mtu() {
        return Optional.ofNullable(this.mtu);
    }
    /**
     * @return Only if `mode`==`trunk`, the list of network/vlans
     * 
     */
    public List<String> networks() {
        return this.networks == null ? List.of() : this.networks;
    }
    /**
     * @return Only if `mode`==`access` and `port_auth`!=`dot1x` whether the port should retain dynamically learned MAC addresses
     * 
     */
    public Optional<Boolean> persistMac() {
        return Optional.ofNullable(this.persistMac);
    }
    /**
     * @return Only if `mode`!=`dynamic` whether PoE capabilities are disabled for a port
     * 
     */
    public Optional<Boolean> poeDisabled() {
        return Optional.ofNullable(this.poeDisabled);
    }
    /**
     * @return Only if `mode`!=`dynamic` if dot1x is desired, set to dot1x. enum: `dot1x`
     * 
     */
    public Optional<String> portAuth() {
        return Optional.ofNullable(this.portAuth);
    }
    /**
     * @return Only if `mode`!=`dynamic` native network/vlan for untagged traffic
     * 
     */
    public Optional<String> portNetwork() {
        return Optional.ofNullable(this.portNetwork);
    }
    /**
     * @return Only if `mode`!=`dynamic` and `port_auth`=`dot1x` reauthentication interval range
     * 
     */
    public Optional<Integer> reauthInterval() {
        return Optional.ofNullable(this.reauthInterval);
    }
    /**
     * @return Only if `mode`==`dynamic` Control when the DPC port should be changed to the default port usage. enum: `link_down`, `none` (let the DPC port keep at the current port usage)
     * 
     */
    public Optional<String> resetDefaultWhen() {
        return Optional.ofNullable(this.resetDefaultWhen);
    }
    /**
     * @return Only if `mode`==`dynamic`
     * 
     */
    public List<NetworktemplatePortUsagesRule> rules() {
        return this.rules == null ? List.of() : this.rules;
    }
    /**
     * @return Only if `mode`!=`dynamic` and `port_auth`==`dot1x` sets server fail fallback vlan
     * 
     */
    public Optional<String> serverFailNetwork() {
        return Optional.ofNullable(this.serverFailNetwork);
    }
    /**
     * @return Only if `mode`!=`dynamic` and `port_auth`==`dot1x` when radius server reject / fails
     * 
     */
    public Optional<String> serverRejectNetwork() {
        return Optional.ofNullable(this.serverRejectNetwork);
    }
    /**
     * @return Only if `mode`!=`dynamic` speed, default is auto to automatically negotiate speed
     * 
     */
    public Optional<String> speed() {
        return Optional.ofNullable(this.speed);
    }
    /**
     * @return Switch storm control
     * Only if `mode`!=`dynamic`
     * 
     */
    public Optional<NetworktemplatePortUsagesStormControl> stormControl() {
        return Optional.ofNullable(this.stormControl);
    }
    /**
     * @return Only if `mode`!=`dynamic` when enabled, the port is not expected to receive BPDU frames
     * 
     */
    public Optional<Boolean> stpEdge() {
        return Optional.ofNullable(this.stpEdge);
    }
    public Optional<Boolean> stpNoRootPort() {
        return Optional.ofNullable(this.stpNoRootPort);
    }
    public Optional<Boolean> stpP2p() {
        return Optional.ofNullable(this.stpP2p);
    }
    /**
     * @return Only if `mode`!=`dynamic` network/vlan for voip traffic, must also set port_network. to authenticate device, set port_auth
     * 
     */
    public Optional<String> voipNetwork() {
        return Optional.ofNullable(this.voipNetwork);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplatePortUsages defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allNetworks;
        private @Nullable Boolean allowDhcpd;
        private @Nullable Boolean allowMultipleSupplicants;
        private @Nullable Boolean bypassAuthWhenServerDown;
        private @Nullable Boolean bypassAuthWhenServerDownForUnkonwnClient;
        private @Nullable String description;
        private @Nullable Boolean disableAutoneg;
        private @Nullable Boolean disabled;
        private @Nullable String duplex;
        private @Nullable List<String> dynamicVlanNetworks;
        private @Nullable Boolean enableMacAuth;
        private @Nullable Boolean enableQos;
        private @Nullable String guestNetwork;
        private @Nullable Boolean interSwitchLink;
        private @Nullable Boolean macAuthOnly;
        private @Nullable Boolean macAuthPreferred;
        private @Nullable String macAuthProtocol;
        private @Nullable Integer macLimit;
        private @Nullable String mode;
        private @Nullable Integer mtu;
        private @Nullable List<String> networks;
        private @Nullable Boolean persistMac;
        private @Nullable Boolean poeDisabled;
        private @Nullable String portAuth;
        private @Nullable String portNetwork;
        private @Nullable Integer reauthInterval;
        private @Nullable String resetDefaultWhen;
        private @Nullable List<NetworktemplatePortUsagesRule> rules;
        private @Nullable String serverFailNetwork;
        private @Nullable String serverRejectNetwork;
        private @Nullable String speed;
        private @Nullable NetworktemplatePortUsagesStormControl stormControl;
        private @Nullable Boolean stpEdge;
        private @Nullable Boolean stpNoRootPort;
        private @Nullable Boolean stpP2p;
        private @Nullable String voipNetwork;
        public Builder() {}
        public Builder(NetworktemplatePortUsages defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allNetworks = defaults.allNetworks;
    	      this.allowDhcpd = defaults.allowDhcpd;
    	      this.allowMultipleSupplicants = defaults.allowMultipleSupplicants;
    	      this.bypassAuthWhenServerDown = defaults.bypassAuthWhenServerDown;
    	      this.bypassAuthWhenServerDownForUnkonwnClient = defaults.bypassAuthWhenServerDownForUnkonwnClient;
    	      this.description = defaults.description;
    	      this.disableAutoneg = defaults.disableAutoneg;
    	      this.disabled = defaults.disabled;
    	      this.duplex = defaults.duplex;
    	      this.dynamicVlanNetworks = defaults.dynamicVlanNetworks;
    	      this.enableMacAuth = defaults.enableMacAuth;
    	      this.enableQos = defaults.enableQos;
    	      this.guestNetwork = defaults.guestNetwork;
    	      this.interSwitchLink = defaults.interSwitchLink;
    	      this.macAuthOnly = defaults.macAuthOnly;
    	      this.macAuthPreferred = defaults.macAuthPreferred;
    	      this.macAuthProtocol = defaults.macAuthProtocol;
    	      this.macLimit = defaults.macLimit;
    	      this.mode = defaults.mode;
    	      this.mtu = defaults.mtu;
    	      this.networks = defaults.networks;
    	      this.persistMac = defaults.persistMac;
    	      this.poeDisabled = defaults.poeDisabled;
    	      this.portAuth = defaults.portAuth;
    	      this.portNetwork = defaults.portNetwork;
    	      this.reauthInterval = defaults.reauthInterval;
    	      this.resetDefaultWhen = defaults.resetDefaultWhen;
    	      this.rules = defaults.rules;
    	      this.serverFailNetwork = defaults.serverFailNetwork;
    	      this.serverRejectNetwork = defaults.serverRejectNetwork;
    	      this.speed = defaults.speed;
    	      this.stormControl = defaults.stormControl;
    	      this.stpEdge = defaults.stpEdge;
    	      this.stpNoRootPort = defaults.stpNoRootPort;
    	      this.stpP2p = defaults.stpP2p;
    	      this.voipNetwork = defaults.voipNetwork;
        }

        @CustomType.Setter
        public Builder allNetworks(@Nullable Boolean allNetworks) {

            this.allNetworks = allNetworks;
            return this;
        }
        @CustomType.Setter
        public Builder allowDhcpd(@Nullable Boolean allowDhcpd) {

            this.allowDhcpd = allowDhcpd;
            return this;
        }
        @CustomType.Setter
        public Builder allowMultipleSupplicants(@Nullable Boolean allowMultipleSupplicants) {

            this.allowMultipleSupplicants = allowMultipleSupplicants;
            return this;
        }
        @CustomType.Setter
        public Builder bypassAuthWhenServerDown(@Nullable Boolean bypassAuthWhenServerDown) {

            this.bypassAuthWhenServerDown = bypassAuthWhenServerDown;
            return this;
        }
        @CustomType.Setter
        public Builder bypassAuthWhenServerDownForUnkonwnClient(@Nullable Boolean bypassAuthWhenServerDownForUnkonwnClient) {

            this.bypassAuthWhenServerDownForUnkonwnClient = bypassAuthWhenServerDownForUnkonwnClient;
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
        public Builder duplex(@Nullable String duplex) {

            this.duplex = duplex;
            return this;
        }
        @CustomType.Setter
        public Builder dynamicVlanNetworks(@Nullable List<String> dynamicVlanNetworks) {

            this.dynamicVlanNetworks = dynamicVlanNetworks;
            return this;
        }
        public Builder dynamicVlanNetworks(String... dynamicVlanNetworks) {
            return dynamicVlanNetworks(List.of(dynamicVlanNetworks));
        }
        @CustomType.Setter
        public Builder enableMacAuth(@Nullable Boolean enableMacAuth) {

            this.enableMacAuth = enableMacAuth;
            return this;
        }
        @CustomType.Setter
        public Builder enableQos(@Nullable Boolean enableQos) {

            this.enableQos = enableQos;
            return this;
        }
        @CustomType.Setter
        public Builder guestNetwork(@Nullable String guestNetwork) {

            this.guestNetwork = guestNetwork;
            return this;
        }
        @CustomType.Setter
        public Builder interSwitchLink(@Nullable Boolean interSwitchLink) {

            this.interSwitchLink = interSwitchLink;
            return this;
        }
        @CustomType.Setter
        public Builder macAuthOnly(@Nullable Boolean macAuthOnly) {

            this.macAuthOnly = macAuthOnly;
            return this;
        }
        @CustomType.Setter
        public Builder macAuthPreferred(@Nullable Boolean macAuthPreferred) {

            this.macAuthPreferred = macAuthPreferred;
            return this;
        }
        @CustomType.Setter
        public Builder macAuthProtocol(@Nullable String macAuthProtocol) {

            this.macAuthProtocol = macAuthProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder macLimit(@Nullable Integer macLimit) {

            this.macLimit = macLimit;
            return this;
        }
        @CustomType.Setter
        public Builder mode(@Nullable String mode) {

            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder mtu(@Nullable Integer mtu) {

            this.mtu = mtu;
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
        public Builder persistMac(@Nullable Boolean persistMac) {

            this.persistMac = persistMac;
            return this;
        }
        @CustomType.Setter
        public Builder poeDisabled(@Nullable Boolean poeDisabled) {

            this.poeDisabled = poeDisabled;
            return this;
        }
        @CustomType.Setter
        public Builder portAuth(@Nullable String portAuth) {

            this.portAuth = portAuth;
            return this;
        }
        @CustomType.Setter
        public Builder portNetwork(@Nullable String portNetwork) {

            this.portNetwork = portNetwork;
            return this;
        }
        @CustomType.Setter
        public Builder reauthInterval(@Nullable Integer reauthInterval) {

            this.reauthInterval = reauthInterval;
            return this;
        }
        @CustomType.Setter
        public Builder resetDefaultWhen(@Nullable String resetDefaultWhen) {

            this.resetDefaultWhen = resetDefaultWhen;
            return this;
        }
        @CustomType.Setter
        public Builder rules(@Nullable List<NetworktemplatePortUsagesRule> rules) {

            this.rules = rules;
            return this;
        }
        public Builder rules(NetworktemplatePortUsagesRule... rules) {
            return rules(List.of(rules));
        }
        @CustomType.Setter
        public Builder serverFailNetwork(@Nullable String serverFailNetwork) {

            this.serverFailNetwork = serverFailNetwork;
            return this;
        }
        @CustomType.Setter
        public Builder serverRejectNetwork(@Nullable String serverRejectNetwork) {

            this.serverRejectNetwork = serverRejectNetwork;
            return this;
        }
        @CustomType.Setter
        public Builder speed(@Nullable String speed) {

            this.speed = speed;
            return this;
        }
        @CustomType.Setter
        public Builder stormControl(@Nullable NetworktemplatePortUsagesStormControl stormControl) {

            this.stormControl = stormControl;
            return this;
        }
        @CustomType.Setter
        public Builder stpEdge(@Nullable Boolean stpEdge) {

            this.stpEdge = stpEdge;
            return this;
        }
        @CustomType.Setter
        public Builder stpNoRootPort(@Nullable Boolean stpNoRootPort) {

            this.stpNoRootPort = stpNoRootPort;
            return this;
        }
        @CustomType.Setter
        public Builder stpP2p(@Nullable Boolean stpP2p) {

            this.stpP2p = stpP2p;
            return this;
        }
        @CustomType.Setter
        public Builder voipNetwork(@Nullable String voipNetwork) {

            this.voipNetwork = voipNetwork;
            return this;
        }
        public NetworktemplatePortUsages build() {
            final var _resultValue = new NetworktemplatePortUsages();
            _resultValue.allNetworks = allNetworks;
            _resultValue.allowDhcpd = allowDhcpd;
            _resultValue.allowMultipleSupplicants = allowMultipleSupplicants;
            _resultValue.bypassAuthWhenServerDown = bypassAuthWhenServerDown;
            _resultValue.bypassAuthWhenServerDownForUnkonwnClient = bypassAuthWhenServerDownForUnkonwnClient;
            _resultValue.description = description;
            _resultValue.disableAutoneg = disableAutoneg;
            _resultValue.disabled = disabled;
            _resultValue.duplex = duplex;
            _resultValue.dynamicVlanNetworks = dynamicVlanNetworks;
            _resultValue.enableMacAuth = enableMacAuth;
            _resultValue.enableQos = enableQos;
            _resultValue.guestNetwork = guestNetwork;
            _resultValue.interSwitchLink = interSwitchLink;
            _resultValue.macAuthOnly = macAuthOnly;
            _resultValue.macAuthPreferred = macAuthPreferred;
            _resultValue.macAuthProtocol = macAuthProtocol;
            _resultValue.macLimit = macLimit;
            _resultValue.mode = mode;
            _resultValue.mtu = mtu;
            _resultValue.networks = networks;
            _resultValue.persistMac = persistMac;
            _resultValue.poeDisabled = poeDisabled;
            _resultValue.portAuth = portAuth;
            _resultValue.portNetwork = portNetwork;
            _resultValue.reauthInterval = reauthInterval;
            _resultValue.resetDefaultWhen = resetDefaultWhen;
            _resultValue.rules = rules;
            _resultValue.serverFailNetwork = serverFailNetwork;
            _resultValue.serverRejectNetwork = serverRejectNetwork;
            _resultValue.speed = speed;
            _resultValue.stormControl = stormControl;
            _resultValue.stpEdge = stpEdge;
            _resultValue.stpNoRootPort = stpNoRootPort;
            _resultValue.stpP2p = stpP2p;
            _resultValue.voipNetwork = voipNetwork;
            return _resultValue;
        }
    }
}
