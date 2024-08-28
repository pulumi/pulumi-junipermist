// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.DeviceprofileGatewayPortConfigVpnPathsTrafficShapingArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileGatewayPortConfigVpnPathsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileGatewayPortConfigVpnPathsArgs Empty = new DeviceprofileGatewayPortConfigVpnPathsArgs();

    /**
     * enum: `broadband`, `lte`
     * 
     */
    @Import(name="bfdProfile")
    private @Nullable Output<String> bfdProfile;

    /**
     * @return enum: `broadband`, `lte`
     * 
     */
    public Optional<Output<String>> bfdProfile() {
        return Optional.ofNullable(this.bfdProfile);
    }

    /**
     * whether to use tunnel mode. SSR only
     * 
     */
    @Import(name="bfdUseTunnelMode")
    private @Nullable Output<Boolean> bfdUseTunnelMode;

    /**
     * @return whether to use tunnel mode. SSR only
     * 
     */
    public Optional<Output<Boolean>> bfdUseTunnelMode() {
        return Optional.ofNullable(this.bfdUseTunnelMode);
    }

    /**
     * for a given VPN, when `path_selection.strategy`==`simple`, the preference for a path (lower is preferred)
     * 
     */
    @Import(name="preference")
    private @Nullable Output<Integer> preference;

    /**
     * @return for a given VPN, when `path_selection.strategy`==`simple`, the preference for a path (lower is preferred)
     * 
     */
    public Optional<Output<Integer>> preference() {
        return Optional.ofNullable(this.preference);
    }

    /**
     * enum: `hub`, `spoke`
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return enum: `hub`, `spoke`
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    @Import(name="trafficShaping")
    private @Nullable Output<DeviceprofileGatewayPortConfigVpnPathsTrafficShapingArgs> trafficShaping;

    public Optional<Output<DeviceprofileGatewayPortConfigVpnPathsTrafficShapingArgs>> trafficShaping() {
        return Optional.ofNullable(this.trafficShaping);
    }

    private DeviceprofileGatewayPortConfigVpnPathsArgs() {}

    private DeviceprofileGatewayPortConfigVpnPathsArgs(DeviceprofileGatewayPortConfigVpnPathsArgs $) {
        this.bfdProfile = $.bfdProfile;
        this.bfdUseTunnelMode = $.bfdUseTunnelMode;
        this.preference = $.preference;
        this.role = $.role;
        this.trafficShaping = $.trafficShaping;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileGatewayPortConfigVpnPathsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileGatewayPortConfigVpnPathsArgs $;

        public Builder() {
            $ = new DeviceprofileGatewayPortConfigVpnPathsArgs();
        }

        public Builder(DeviceprofileGatewayPortConfigVpnPathsArgs defaults) {
            $ = new DeviceprofileGatewayPortConfigVpnPathsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bfdProfile enum: `broadband`, `lte`
         * 
         * @return builder
         * 
         */
        public Builder bfdProfile(@Nullable Output<String> bfdProfile) {
            $.bfdProfile = bfdProfile;
            return this;
        }

        /**
         * @param bfdProfile enum: `broadband`, `lte`
         * 
         * @return builder
         * 
         */
        public Builder bfdProfile(String bfdProfile) {
            return bfdProfile(Output.of(bfdProfile));
        }

        /**
         * @param bfdUseTunnelMode whether to use tunnel mode. SSR only
         * 
         * @return builder
         * 
         */
        public Builder bfdUseTunnelMode(@Nullable Output<Boolean> bfdUseTunnelMode) {
            $.bfdUseTunnelMode = bfdUseTunnelMode;
            return this;
        }

        /**
         * @param bfdUseTunnelMode whether to use tunnel mode. SSR only
         * 
         * @return builder
         * 
         */
        public Builder bfdUseTunnelMode(Boolean bfdUseTunnelMode) {
            return bfdUseTunnelMode(Output.of(bfdUseTunnelMode));
        }

        /**
         * @param preference for a given VPN, when `path_selection.strategy`==`simple`, the preference for a path (lower is preferred)
         * 
         * @return builder
         * 
         */
        public Builder preference(@Nullable Output<Integer> preference) {
            $.preference = preference;
            return this;
        }

        /**
         * @param preference for a given VPN, when `path_selection.strategy`==`simple`, the preference for a path (lower is preferred)
         * 
         * @return builder
         * 
         */
        public Builder preference(Integer preference) {
            return preference(Output.of(preference));
        }

        /**
         * @param role enum: `hub`, `spoke`
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role enum: `hub`, `spoke`
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public Builder trafficShaping(@Nullable Output<DeviceprofileGatewayPortConfigVpnPathsTrafficShapingArgs> trafficShaping) {
            $.trafficShaping = trafficShaping;
            return this;
        }

        public Builder trafficShaping(DeviceprofileGatewayPortConfigVpnPathsTrafficShapingArgs trafficShaping) {
            return trafficShaping(Output.of(trafficShaping));
        }

        public DeviceprofileGatewayPortConfigVpnPathsArgs build() {
            return $;
        }
    }

}