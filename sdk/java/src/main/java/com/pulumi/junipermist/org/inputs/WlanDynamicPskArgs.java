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


public final class WlanDynamicPskArgs extends com.pulumi.resources.ResourceArgs {

    public static final WlanDynamicPskArgs Empty = new WlanDynamicPskArgs();

    /**
     * Default PSK to use if cloud WLC is not available, 8-63 characters
     * 
     */
    @Import(name="defaultPsk")
    private @Nullable Output<String> defaultPsk;

    /**
     * @return Default PSK to use if cloud WLC is not available, 8-63 characters
     * 
     */
    public Optional<Output<String>> defaultPsk() {
        return Optional.ofNullable(this.defaultPsk);
    }

    @Import(name="defaultVlanId")
    private @Nullable Output<String> defaultVlanId;

    public Optional<Output<String>> defaultVlanId() {
        return Optional.ofNullable(this.defaultVlanId);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * When 11r is enabled, we&#39;ll try to use the cached PMK, this can be disabled. `false` means auto
     * 
     */
    @Import(name="forceLookup")
    private @Nullable Output<Boolean> forceLookup;

    /**
     * @return When 11r is enabled, we&#39;ll try to use the cached PMK, this can be disabled. `false` means auto
     * 
     */
    public Optional<Output<Boolean>> forceLookup() {
        return Optional.ofNullable(this.forceLookup);
    }

    /**
     * enum: `cloud_psks`, `radius`
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return enum: `cloud_psks`, `radius`
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    private WlanDynamicPskArgs() {}

    private WlanDynamicPskArgs(WlanDynamicPskArgs $) {
        this.defaultPsk = $.defaultPsk;
        this.defaultVlanId = $.defaultVlanId;
        this.enabled = $.enabled;
        this.forceLookup = $.forceLookup;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WlanDynamicPskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WlanDynamicPskArgs $;

        public Builder() {
            $ = new WlanDynamicPskArgs();
        }

        public Builder(WlanDynamicPskArgs defaults) {
            $ = new WlanDynamicPskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultPsk Default PSK to use if cloud WLC is not available, 8-63 characters
         * 
         * @return builder
         * 
         */
        public Builder defaultPsk(@Nullable Output<String> defaultPsk) {
            $.defaultPsk = defaultPsk;
            return this;
        }

        /**
         * @param defaultPsk Default PSK to use if cloud WLC is not available, 8-63 characters
         * 
         * @return builder
         * 
         */
        public Builder defaultPsk(String defaultPsk) {
            return defaultPsk(Output.of(defaultPsk));
        }

        public Builder defaultVlanId(@Nullable Output<String> defaultVlanId) {
            $.defaultVlanId = defaultVlanId;
            return this;
        }

        public Builder defaultVlanId(String defaultVlanId) {
            return defaultVlanId(Output.of(defaultVlanId));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param forceLookup When 11r is enabled, we&#39;ll try to use the cached PMK, this can be disabled. `false` means auto
         * 
         * @return builder
         * 
         */
        public Builder forceLookup(@Nullable Output<Boolean> forceLookup) {
            $.forceLookup = forceLookup;
            return this;
        }

        /**
         * @param forceLookup When 11r is enabled, we&#39;ll try to use the cached PMK, this can be disabled. `false` means auto
         * 
         * @return builder
         * 
         */
        public Builder forceLookup(Boolean forceLookup) {
            return forceLookup(Output.of(forceLookup));
        }

        /**
         * @param source enum: `cloud_psks`, `radius`
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source enum: `cloud_psks`, `radius`
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        public WlanDynamicPskArgs build() {
            return $;
        }
    }

}
