// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingOpticPortConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingOpticPortConfigArgs Empty = new SettingOpticPortConfigArgs();

    /**
     * enable channelization
     * 
     */
    @Import(name="channelized")
    private @Nullable Output<Boolean> channelized;

    /**
     * @return enable channelization
     * 
     */
    public Optional<Output<Boolean>> channelized() {
        return Optional.ofNullable(this.channelized);
    }

    /**
     * interface speed (e.g. `25g`, `50g`), use the chassis speed by default
     * 
     */
    @Import(name="speed")
    private @Nullable Output<String> speed;

    /**
     * @return interface speed (e.g. `25g`, `50g`), use the chassis speed by default
     * 
     */
    public Optional<Output<String>> speed() {
        return Optional.ofNullable(this.speed);
    }

    private SettingOpticPortConfigArgs() {}

    private SettingOpticPortConfigArgs(SettingOpticPortConfigArgs $) {
        this.channelized = $.channelized;
        this.speed = $.speed;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingOpticPortConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingOpticPortConfigArgs $;

        public Builder() {
            $ = new SettingOpticPortConfigArgs();
        }

        public Builder(SettingOpticPortConfigArgs defaults) {
            $ = new SettingOpticPortConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param channelized enable channelization
         * 
         * @return builder
         * 
         */
        public Builder channelized(@Nullable Output<Boolean> channelized) {
            $.channelized = channelized;
            return this;
        }

        /**
         * @param channelized enable channelization
         * 
         * @return builder
         * 
         */
        public Builder channelized(Boolean channelized) {
            return channelized(Output.of(channelized));
        }

        /**
         * @param speed interface speed (e.g. `25g`, `50g`), use the chassis speed by default
         * 
         * @return builder
         * 
         */
        public Builder speed(@Nullable Output<String> speed) {
            $.speed = speed;
            return this;
        }

        /**
         * @param speed interface speed (e.g. `25g`, `50g`), use the chassis speed by default
         * 
         * @return builder
         * 
         */
        public Builder speed(String speed) {
            return speed(Output.of(speed));
        }

        public SettingOpticPortConfigArgs build() {
            return $;
        }
    }

}