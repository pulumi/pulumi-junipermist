// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.DeviceprofileGatewayPathPreferencesPathArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileGatewayPathPreferencesArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileGatewayPathPreferencesArgs Empty = new DeviceprofileGatewayPathPreferencesArgs();

    @Import(name="paths")
    private @Nullable Output<List<DeviceprofileGatewayPathPreferencesPathArgs>> paths;

    public Optional<Output<List<DeviceprofileGatewayPathPreferencesPathArgs>>> paths() {
        return Optional.ofNullable(this.paths);
    }

    /**
     * enum: `ecmp`, `ordered`, `weighted`
     * 
     */
    @Import(name="strategy")
    private @Nullable Output<String> strategy;

    /**
     * @return enum: `ecmp`, `ordered`, `weighted`
     * 
     */
    public Optional<Output<String>> strategy() {
        return Optional.ofNullable(this.strategy);
    }

    private DeviceprofileGatewayPathPreferencesArgs() {}

    private DeviceprofileGatewayPathPreferencesArgs(DeviceprofileGatewayPathPreferencesArgs $) {
        this.paths = $.paths;
        this.strategy = $.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileGatewayPathPreferencesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileGatewayPathPreferencesArgs $;

        public Builder() {
            $ = new DeviceprofileGatewayPathPreferencesArgs();
        }

        public Builder(DeviceprofileGatewayPathPreferencesArgs defaults) {
            $ = new DeviceprofileGatewayPathPreferencesArgs(Objects.requireNonNull(defaults));
        }

        public Builder paths(@Nullable Output<List<DeviceprofileGatewayPathPreferencesPathArgs>> paths) {
            $.paths = paths;
            return this;
        }

        public Builder paths(List<DeviceprofileGatewayPathPreferencesPathArgs> paths) {
            return paths(Output.of(paths));
        }

        public Builder paths(DeviceprofileGatewayPathPreferencesPathArgs... paths) {
            return paths(List.of(paths));
        }

        /**
         * @param strategy enum: `ecmp`, `ordered`, `weighted`
         * 
         * @return builder
         * 
         */
        public Builder strategy(@Nullable Output<String> strategy) {
            $.strategy = strategy;
            return this;
        }

        /**
         * @param strategy enum: `ecmp`, `ordered`, `weighted`
         * 
         * @return builder
         * 
         */
        public Builder strategy(String strategy) {
            return strategy(Output.of(strategy));
        }

        public DeviceprofileGatewayPathPreferencesArgs build() {
            return $;
        }
    }

}