// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayPortConfigWanSourceNatArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayPortConfigWanSourceNatArgs Empty = new GatewayPortConfigWanSourceNatArgs();

    /**
     * Or to disable the source-nat
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return Or to disable the source-nat
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * If alternative nat_pool is desired
     * 
     */
    @Import(name="natPool")
    private @Nullable Output<String> natPool;

    /**
     * @return If alternative nat_pool is desired
     * 
     */
    public Optional<Output<String>> natPool() {
        return Optional.ofNullable(this.natPool);
    }

    private GatewayPortConfigWanSourceNatArgs() {}

    private GatewayPortConfigWanSourceNatArgs(GatewayPortConfigWanSourceNatArgs $) {
        this.disabled = $.disabled;
        this.natPool = $.natPool;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayPortConfigWanSourceNatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayPortConfigWanSourceNatArgs $;

        public Builder() {
            $ = new GatewayPortConfigWanSourceNatArgs();
        }

        public Builder(GatewayPortConfigWanSourceNatArgs defaults) {
            $ = new GatewayPortConfigWanSourceNatArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disabled Or to disable the source-nat
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Or to disable the source-nat
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param natPool If alternative nat_pool is desired
         * 
         * @return builder
         * 
         */
        public Builder natPool(@Nullable Output<String> natPool) {
            $.natPool = natPool;
            return this;
        }

        /**
         * @param natPool If alternative nat_pool is desired
         * 
         * @return builder
         * 
         */
        public Builder natPool(String natPool) {
            return natPool(Output.of(natPool));
        }

        public GatewayPortConfigWanSourceNatArgs build() {
            return $;
        }
    }

}
