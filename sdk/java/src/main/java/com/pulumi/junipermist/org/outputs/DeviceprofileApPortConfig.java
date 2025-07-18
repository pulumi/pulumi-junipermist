// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.org.outputs.DeviceprofileApPortConfigDynamicVlan;
import com.pulumi.junipermist.org.outputs.DeviceprofileApPortConfigMistNac;
import com.pulumi.junipermist.org.outputs.DeviceprofileApPortConfigRadiusConfig;
import com.pulumi.junipermist.org.outputs.DeviceprofileApPortConfigRadsec;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceprofileApPortConfig {
    private @Nullable Boolean disabled;
    /**
     * @return Optional dynamic vlan
     * 
     */
    private @Nullable DeviceprofileApPortConfigDynamicVlan dynamicVlan;
    private @Nullable Boolean enableMacAuth;
    /**
     * @return enum:
     *   * `all`: local breakout, All VLANs
     *   * `limited`: local breakout, only the VLANs configured in `port_vlan_id` and `vlan_ids`
     *   * `mxtunnel`: central breakout to an Org Mist Edge (requires `mxtunnel_id`)
     *   * `site_mxedge`: central breakout to a Site Mist Edge (requires `mxtunnel_name`)
     *   * `wxtunnel`&#39;: central breakout to an Org WxTunnel (requires `wxtunnel_id`)
     * 
     */
    private @Nullable String forwarding;
    /**
     * @return When `true`, we&#39;ll do dot1x then mac_auth. enable this to prefer mac_auth
     * 
     */
    private @Nullable Boolean macAuthPreferred;
    /**
     * @return if `enable_mac_auth`==`true`, allows user to select an authentication protocol. enum: `eap-md5`, `eap-peap`, `pap`
     * 
     */
    private @Nullable String macAuthProtocol;
    private @Nullable DeviceprofileApPortConfigMistNac mistNac;
    /**
     * @return If `forwarding`==`mxtunnel`, vlan_ids comes from mxtunnel
     * 
     */
    private @Nullable String mxTunnelId;
    /**
     * @return If `forwarding`==`site_mxedge`, vlan_ids comes from site_mxedge (`mxtunnels` under site setting)
     * 
     */
    private @Nullable String mxtunnelName;
    /**
     * @return When doing port auth. enum: `dot1x`, `none`
     * 
     */
    private @Nullable String portAuth;
    /**
     * @return If `forwarding`==`limited`
     * 
     */
    private @Nullable Integer portVlanId;
    /**
     * @return Junos Radius config
     * 
     */
    private @Nullable DeviceprofileApPortConfigRadiusConfig radiusConfig;
    /**
     * @return RadSec settings
     * 
     */
    private @Nullable DeviceprofileApPortConfigRadsec radsec;
    /**
     * @return Optional to specify the vlan id for a tunnel if forwarding is for `wxtunnel`, `mxtunnel` or `site_mxedge`.
     *   * if vlan_id is not specified then it will use first one in vlan_ids[] of the mxtunnel.
     *   * if forwarding == site_mxedge, vlan_ids comes from site_mxedge (`mxtunnels` under site setting)
     * 
     */
    private @Nullable Integer vlanId;
    /**
     * @return If `forwarding`==`limited`
     * 
     */
    private @Nullable List<Integer> vlanIds;
    /**
     * @return If `forwarding`==`wxtunnel`, the port is bridged to the vlan of the session
     * 
     */
    private @Nullable String wxtunnelId;
    /**
     * @return If `forwarding`==`wxtunnel`, the port is bridged to the vlan of the session
     * 
     */
    private @Nullable String wxtunnelRemoteId;

    private DeviceprofileApPortConfig() {}
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * @return Optional dynamic vlan
     * 
     */
    public Optional<DeviceprofileApPortConfigDynamicVlan> dynamicVlan() {
        return Optional.ofNullable(this.dynamicVlan);
    }
    public Optional<Boolean> enableMacAuth() {
        return Optional.ofNullable(this.enableMacAuth);
    }
    /**
     * @return enum:
     *   * `all`: local breakout, All VLANs
     *   * `limited`: local breakout, only the VLANs configured in `port_vlan_id` and `vlan_ids`
     *   * `mxtunnel`: central breakout to an Org Mist Edge (requires `mxtunnel_id`)
     *   * `site_mxedge`: central breakout to a Site Mist Edge (requires `mxtunnel_name`)
     *   * `wxtunnel`&#39;: central breakout to an Org WxTunnel (requires `wxtunnel_id`)
     * 
     */
    public Optional<String> forwarding() {
        return Optional.ofNullable(this.forwarding);
    }
    /**
     * @return When `true`, we&#39;ll do dot1x then mac_auth. enable this to prefer mac_auth
     * 
     */
    public Optional<Boolean> macAuthPreferred() {
        return Optional.ofNullable(this.macAuthPreferred);
    }
    /**
     * @return if `enable_mac_auth`==`true`, allows user to select an authentication protocol. enum: `eap-md5`, `eap-peap`, `pap`
     * 
     */
    public Optional<String> macAuthProtocol() {
        return Optional.ofNullable(this.macAuthProtocol);
    }
    public Optional<DeviceprofileApPortConfigMistNac> mistNac() {
        return Optional.ofNullable(this.mistNac);
    }
    /**
     * @return If `forwarding`==`mxtunnel`, vlan_ids comes from mxtunnel
     * 
     */
    public Optional<String> mxTunnelId() {
        return Optional.ofNullable(this.mxTunnelId);
    }
    /**
     * @return If `forwarding`==`site_mxedge`, vlan_ids comes from site_mxedge (`mxtunnels` under site setting)
     * 
     */
    public Optional<String> mxtunnelName() {
        return Optional.ofNullable(this.mxtunnelName);
    }
    /**
     * @return When doing port auth. enum: `dot1x`, `none`
     * 
     */
    public Optional<String> portAuth() {
        return Optional.ofNullable(this.portAuth);
    }
    /**
     * @return If `forwarding`==`limited`
     * 
     */
    public Optional<Integer> portVlanId() {
        return Optional.ofNullable(this.portVlanId);
    }
    /**
     * @return Junos Radius config
     * 
     */
    public Optional<DeviceprofileApPortConfigRadiusConfig> radiusConfig() {
        return Optional.ofNullable(this.radiusConfig);
    }
    /**
     * @return RadSec settings
     * 
     */
    public Optional<DeviceprofileApPortConfigRadsec> radsec() {
        return Optional.ofNullable(this.radsec);
    }
    /**
     * @return Optional to specify the vlan id for a tunnel if forwarding is for `wxtunnel`, `mxtunnel` or `site_mxedge`.
     *   * if vlan_id is not specified then it will use first one in vlan_ids[] of the mxtunnel.
     *   * if forwarding == site_mxedge, vlan_ids comes from site_mxedge (`mxtunnels` under site setting)
     * 
     */
    public Optional<Integer> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }
    /**
     * @return If `forwarding`==`limited`
     * 
     */
    public List<Integer> vlanIds() {
        return this.vlanIds == null ? List.of() : this.vlanIds;
    }
    /**
     * @return If `forwarding`==`wxtunnel`, the port is bridged to the vlan of the session
     * 
     */
    public Optional<String> wxtunnelId() {
        return Optional.ofNullable(this.wxtunnelId);
    }
    /**
     * @return If `forwarding`==`wxtunnel`, the port is bridged to the vlan of the session
     * 
     */
    public Optional<String> wxtunnelRemoteId() {
        return Optional.ofNullable(this.wxtunnelRemoteId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceprofileApPortConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean disabled;
        private @Nullable DeviceprofileApPortConfigDynamicVlan dynamicVlan;
        private @Nullable Boolean enableMacAuth;
        private @Nullable String forwarding;
        private @Nullable Boolean macAuthPreferred;
        private @Nullable String macAuthProtocol;
        private @Nullable DeviceprofileApPortConfigMistNac mistNac;
        private @Nullable String mxTunnelId;
        private @Nullable String mxtunnelName;
        private @Nullable String portAuth;
        private @Nullable Integer portVlanId;
        private @Nullable DeviceprofileApPortConfigRadiusConfig radiusConfig;
        private @Nullable DeviceprofileApPortConfigRadsec radsec;
        private @Nullable Integer vlanId;
        private @Nullable List<Integer> vlanIds;
        private @Nullable String wxtunnelId;
        private @Nullable String wxtunnelRemoteId;
        public Builder() {}
        public Builder(DeviceprofileApPortConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.dynamicVlan = defaults.dynamicVlan;
    	      this.enableMacAuth = defaults.enableMacAuth;
    	      this.forwarding = defaults.forwarding;
    	      this.macAuthPreferred = defaults.macAuthPreferred;
    	      this.macAuthProtocol = defaults.macAuthProtocol;
    	      this.mistNac = defaults.mistNac;
    	      this.mxTunnelId = defaults.mxTunnelId;
    	      this.mxtunnelName = defaults.mxtunnelName;
    	      this.portAuth = defaults.portAuth;
    	      this.portVlanId = defaults.portVlanId;
    	      this.radiusConfig = defaults.radiusConfig;
    	      this.radsec = defaults.radsec;
    	      this.vlanId = defaults.vlanId;
    	      this.vlanIds = defaults.vlanIds;
    	      this.wxtunnelId = defaults.wxtunnelId;
    	      this.wxtunnelRemoteId = defaults.wxtunnelRemoteId;
        }

        @CustomType.Setter
        public Builder disabled(@Nullable Boolean disabled) {

            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder dynamicVlan(@Nullable DeviceprofileApPortConfigDynamicVlan dynamicVlan) {

            this.dynamicVlan = dynamicVlan;
            return this;
        }
        @CustomType.Setter
        public Builder enableMacAuth(@Nullable Boolean enableMacAuth) {

            this.enableMacAuth = enableMacAuth;
            return this;
        }
        @CustomType.Setter
        public Builder forwarding(@Nullable String forwarding) {

            this.forwarding = forwarding;
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
        public Builder mistNac(@Nullable DeviceprofileApPortConfigMistNac mistNac) {

            this.mistNac = mistNac;
            return this;
        }
        @CustomType.Setter
        public Builder mxTunnelId(@Nullable String mxTunnelId) {

            this.mxTunnelId = mxTunnelId;
            return this;
        }
        @CustomType.Setter
        public Builder mxtunnelName(@Nullable String mxtunnelName) {

            this.mxtunnelName = mxtunnelName;
            return this;
        }
        @CustomType.Setter
        public Builder portAuth(@Nullable String portAuth) {

            this.portAuth = portAuth;
            return this;
        }
        @CustomType.Setter
        public Builder portVlanId(@Nullable Integer portVlanId) {

            this.portVlanId = portVlanId;
            return this;
        }
        @CustomType.Setter
        public Builder radiusConfig(@Nullable DeviceprofileApPortConfigRadiusConfig radiusConfig) {

            this.radiusConfig = radiusConfig;
            return this;
        }
        @CustomType.Setter
        public Builder radsec(@Nullable DeviceprofileApPortConfigRadsec radsec) {

            this.radsec = radsec;
            return this;
        }
        @CustomType.Setter
        public Builder vlanId(@Nullable Integer vlanId) {

            this.vlanId = vlanId;
            return this;
        }
        @CustomType.Setter
        public Builder vlanIds(@Nullable List<Integer> vlanIds) {

            this.vlanIds = vlanIds;
            return this;
        }
        public Builder vlanIds(Integer... vlanIds) {
            return vlanIds(List.of(vlanIds));
        }
        @CustomType.Setter
        public Builder wxtunnelId(@Nullable String wxtunnelId) {

            this.wxtunnelId = wxtunnelId;
            return this;
        }
        @CustomType.Setter
        public Builder wxtunnelRemoteId(@Nullable String wxtunnelRemoteId) {

            this.wxtunnelRemoteId = wxtunnelRemoteId;
            return this;
        }
        public DeviceprofileApPortConfig build() {
            final var _resultValue = new DeviceprofileApPortConfig();
            _resultValue.disabled = disabled;
            _resultValue.dynamicVlan = dynamicVlan;
            _resultValue.enableMacAuth = enableMacAuth;
            _resultValue.forwarding = forwarding;
            _resultValue.macAuthPreferred = macAuthPreferred;
            _resultValue.macAuthProtocol = macAuthProtocol;
            _resultValue.mistNac = mistNac;
            _resultValue.mxTunnelId = mxTunnelId;
            _resultValue.mxtunnelName = mxtunnelName;
            _resultValue.portAuth = portAuth;
            _resultValue.portVlanId = portVlanId;
            _resultValue.radiusConfig = radiusConfig;
            _resultValue.radsec = radsec;
            _resultValue.vlanId = vlanId;
            _resultValue.vlanIds = vlanIds;
            _resultValue.wxtunnelId = wxtunnelId;
            _resultValue.wxtunnelRemoteId = wxtunnelRemoteId;
            return _resultValue;
        }
    }
}
