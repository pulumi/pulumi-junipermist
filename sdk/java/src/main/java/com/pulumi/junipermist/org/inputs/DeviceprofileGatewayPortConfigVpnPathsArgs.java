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
     * Only if the VPN `type`==`hub_spoke`. enum: `broadband`, `lte`
     * 
     */
    @Import(name="bfdProfile")
    private @Nullable Output<String> bfdProfile;

    /**
     * @return Only if the VPN `type`==`hub_spoke`. enum: `broadband`, `lte`
     * 
     */
    public Optional<Output<String>> bfdProfile() {
        return Optional.ofNullable(this.bfdProfile);
    }

    /**
     * Only if the VPN `type`==`hub_spoke`. Whether to use tunnel mode. SSR only
     * 
     */
    @Import(name="bfdUseTunnelMode")
    private @Nullable Output<Boolean> bfdUseTunnelMode;

    /**
     * @return Only if the VPN `type`==`hub_spoke`. Whether to use tunnel mode. SSR only
     * 
     */
    public Optional<Output<Boolean>> bfdUseTunnelMode() {
        return Optional.ofNullable(this.bfdUseTunnelMode);
    }

    /**
     * Only if the VPN `type`==`mesh`
     * 
     */
    @Import(name="linkName")
    private @Nullable Output<String> linkName;

    /**
     * @return Only if the VPN `type`==`mesh`
     * 
     */
    public Optional<Output<String>> linkName() {
        return Optional.ofNullable(this.linkName);
    }

    /**
     * Only if the VPN `type`==`hub_spoke`. For a given VPN, when `path_selection.strategy`==`simple`, the preference for a path (lower is preferred)
     * 
     */
    @Import(name="preference")
    private @Nullable Output<Integer> preference;

    /**
     * @return Only if the VPN `type`==`hub_spoke`. For a given VPN, when `path_selection.strategy`==`simple`, the preference for a path (lower is preferred)
     * 
     */
    public Optional<Output<Integer>> preference() {
        return Optional.ofNullable(this.preference);
    }

    /**
     * Only if the VPN `type`==`hub_spoke`. enum: `hub`, `spoke`
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return Only if the VPN `type`==`hub_spoke`. enum: `hub`, `spoke`
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
        this.linkName = $.linkName;
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
         * @param bfdProfile Only if the VPN `type`==`hub_spoke`. enum: `broadband`, `lte`
         * 
         * @return builder
         * 
         */
        public Builder bfdProfile(@Nullable Output<String> bfdProfile) {
            $.bfdProfile = bfdProfile;
            return this;
        }

        /**
         * @param bfdProfile Only if the VPN `type`==`hub_spoke`. enum: `broadband`, `lte`
         * 
         * @return builder
         * 
         */
        public Builder bfdProfile(String bfdProfile) {
            return bfdProfile(Output.of(bfdProfile));
        }

        /**
         * @param bfdUseTunnelMode Only if the VPN `type`==`hub_spoke`. Whether to use tunnel mode. SSR only
         * 
         * @return builder
         * 
         */
        public Builder bfdUseTunnelMode(@Nullable Output<Boolean> bfdUseTunnelMode) {
            $.bfdUseTunnelMode = bfdUseTunnelMode;
            return this;
        }

        /**
         * @param bfdUseTunnelMode Only if the VPN `type`==`hub_spoke`. Whether to use tunnel mode. SSR only
         * 
         * @return builder
         * 
         */
        public Builder bfdUseTunnelMode(Boolean bfdUseTunnelMode) {
            return bfdUseTunnelMode(Output.of(bfdUseTunnelMode));
        }

        /**
         * @param linkName Only if the VPN `type`==`mesh`
         * 
         * @return builder
         * 
         */
        public Builder linkName(@Nullable Output<String> linkName) {
            $.linkName = linkName;
            return this;
        }

        /**
         * @param linkName Only if the VPN `type`==`mesh`
         * 
         * @return builder
         * 
         */
        public Builder linkName(String linkName) {
            return linkName(Output.of(linkName));
        }

        /**
         * @param preference Only if the VPN `type`==`hub_spoke`. For a given VPN, when `path_selection.strategy`==`simple`, the preference for a path (lower is preferred)
         * 
         * @return builder
         * 
         */
        public Builder preference(@Nullable Output<Integer> preference) {
            $.preference = preference;
            return this;
        }

        /**
         * @param preference Only if the VPN `type`==`hub_spoke`. For a given VPN, when `path_selection.strategy`==`simple`, the preference for a path (lower is preferred)
         * 
         * @return builder
         * 
         */
        public Builder preference(Integer preference) {
            return preference(Output.of(preference));
        }

        /**
         * @param role Only if the VPN `type`==`hub_spoke`. enum: `hub`, `spoke`
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role Only if the VPN `type`==`hub_spoke`. enum: `hub`, `spoke`
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
