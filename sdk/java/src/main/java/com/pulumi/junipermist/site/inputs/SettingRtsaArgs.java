// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingRtsaArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingRtsaArgs Empty = new SettingRtsaArgs();

    @Import(name="appWaking")
    private @Nullable Output<Boolean> appWaking;

    public Optional<Output<Boolean>> appWaking() {
        return Optional.ofNullable(this.appWaking);
    }

    @Import(name="disableDeadReckoning")
    private @Nullable Output<Boolean> disableDeadReckoning;

    public Optional<Output<Boolean>> disableDeadReckoning() {
        return Optional.ofNullable(this.disableDeadReckoning);
    }

    @Import(name="disablePressureSensor")
    private @Nullable Output<Boolean> disablePressureSensor;

    public Optional<Output<Boolean>> disablePressureSensor() {
        return Optional.ofNullable(this.disablePressureSensor);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Asset tracking related
     * 
     */
    @Import(name="trackAsset")
    private @Nullable Output<Boolean> trackAsset;

    /**
     * @return Asset tracking related
     * 
     */
    public Optional<Output<Boolean>> trackAsset() {
        return Optional.ofNullable(this.trackAsset);
    }

    private SettingRtsaArgs() {}

    private SettingRtsaArgs(SettingRtsaArgs $) {
        this.appWaking = $.appWaking;
        this.disableDeadReckoning = $.disableDeadReckoning;
        this.disablePressureSensor = $.disablePressureSensor;
        this.enabled = $.enabled;
        this.trackAsset = $.trackAsset;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingRtsaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingRtsaArgs $;

        public Builder() {
            $ = new SettingRtsaArgs();
        }

        public Builder(SettingRtsaArgs defaults) {
            $ = new SettingRtsaArgs(Objects.requireNonNull(defaults));
        }

        public Builder appWaking(@Nullable Output<Boolean> appWaking) {
            $.appWaking = appWaking;
            return this;
        }

        public Builder appWaking(Boolean appWaking) {
            return appWaking(Output.of(appWaking));
        }

        public Builder disableDeadReckoning(@Nullable Output<Boolean> disableDeadReckoning) {
            $.disableDeadReckoning = disableDeadReckoning;
            return this;
        }

        public Builder disableDeadReckoning(Boolean disableDeadReckoning) {
            return disableDeadReckoning(Output.of(disableDeadReckoning));
        }

        public Builder disablePressureSensor(@Nullable Output<Boolean> disablePressureSensor) {
            $.disablePressureSensor = disablePressureSensor;
            return this;
        }

        public Builder disablePressureSensor(Boolean disablePressureSensor) {
            return disablePressureSensor(Output.of(disablePressureSensor));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param trackAsset Asset tracking related
         * 
         * @return builder
         * 
         */
        public Builder trackAsset(@Nullable Output<Boolean> trackAsset) {
            $.trackAsset = trackAsset;
            return this;
        }

        /**
         * @param trackAsset Asset tracking related
         * 
         * @return builder
         * 
         */
        public Builder trackAsset(Boolean trackAsset) {
            return trackAsset(Output.of(trackAsset));
        }

        public SettingRtsaArgs build() {
            return $;
        }
    }

}
