// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.device.outputs.GatewayPortConfigVpnPathsTrafficShaping;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayPortConfigVpnPaths {
    /**
     * @return Only if the VPN `type`==`hub_spoke`. enum: `broadband`, `lte`
     * 
     */
    private @Nullable String bfdProfile;
    /**
     * @return Only if the VPN `type`==`hub_spoke`. Whether to use tunnel mode. SSR only
     * 
     */
    private @Nullable Boolean bfdUseTunnelMode;
    /**
     * @return Only if the VPN `type`==`hub_spoke`. For a given VPN, when `path_selection.strategy`==`simple`, the preference for a path (lower is preferred)
     * 
     */
    private @Nullable Integer preference;
    /**
     * @return If the VPN `type`==`hub_spoke`, enum: `hub`, `spoke`. If the VPN `type`==`mesh`, enum: `mesh`
     * 
     */
    private @Nullable String role;
    private @Nullable GatewayPortConfigVpnPathsTrafficShaping trafficShaping;

    private GatewayPortConfigVpnPaths() {}
    /**
     * @return Only if the VPN `type`==`hub_spoke`. enum: `broadband`, `lte`
     * 
     */
    public Optional<String> bfdProfile() {
        return Optional.ofNullable(this.bfdProfile);
    }
    /**
     * @return Only if the VPN `type`==`hub_spoke`. Whether to use tunnel mode. SSR only
     * 
     */
    public Optional<Boolean> bfdUseTunnelMode() {
        return Optional.ofNullable(this.bfdUseTunnelMode);
    }
    /**
     * @return Only if the VPN `type`==`hub_spoke`. For a given VPN, when `path_selection.strategy`==`simple`, the preference for a path (lower is preferred)
     * 
     */
    public Optional<Integer> preference() {
        return Optional.ofNullable(this.preference);
    }
    /**
     * @return If the VPN `type`==`hub_spoke`, enum: `hub`, `spoke`. If the VPN `type`==`mesh`, enum: `mesh`
     * 
     */
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }
    public Optional<GatewayPortConfigVpnPathsTrafficShaping> trafficShaping() {
        return Optional.ofNullable(this.trafficShaping);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayPortConfigVpnPaths defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bfdProfile;
        private @Nullable Boolean bfdUseTunnelMode;
        private @Nullable Integer preference;
        private @Nullable String role;
        private @Nullable GatewayPortConfigVpnPathsTrafficShaping trafficShaping;
        public Builder() {}
        public Builder(GatewayPortConfigVpnPaths defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bfdProfile = defaults.bfdProfile;
    	      this.bfdUseTunnelMode = defaults.bfdUseTunnelMode;
    	      this.preference = defaults.preference;
    	      this.role = defaults.role;
    	      this.trafficShaping = defaults.trafficShaping;
        }

        @CustomType.Setter
        public Builder bfdProfile(@Nullable String bfdProfile) {

            this.bfdProfile = bfdProfile;
            return this;
        }
        @CustomType.Setter
        public Builder bfdUseTunnelMode(@Nullable Boolean bfdUseTunnelMode) {

            this.bfdUseTunnelMode = bfdUseTunnelMode;
            return this;
        }
        @CustomType.Setter
        public Builder preference(@Nullable Integer preference) {

            this.preference = preference;
            return this;
        }
        @CustomType.Setter
        public Builder role(@Nullable String role) {

            this.role = role;
            return this;
        }
        @CustomType.Setter
        public Builder trafficShaping(@Nullable GatewayPortConfigVpnPathsTrafficShaping trafficShaping) {

            this.trafficShaping = trafficShaping;
            return this;
        }
        public GatewayPortConfigVpnPaths build() {
            final var _resultValue = new GatewayPortConfigVpnPaths();
            _resultValue.bfdProfile = bfdProfile;
            _resultValue.bfdUseTunnelMode = bfdUseTunnelMode;
            _resultValue.preference = preference;
            _resultValue.role = role;
            _resultValue.trafficShaping = trafficShaping;
            return _resultValue;
        }
    }
}
