// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileGatewayBgpConfigNeighborsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileGatewayBgpConfigNeighborsArgs Empty = new DeviceprofileGatewayBgpConfigNeighborsArgs();

    /**
     * If true, the BGP session to this neighbor will be administratively disabled/shutdown
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return If true, the BGP session to this neighbor will be administratively disabled/shutdown
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    @Import(name="exportPolicy")
    private @Nullable Output<String> exportPolicy;

    public Optional<Output<String>> exportPolicy() {
        return Optional.ofNullable(this.exportPolicy);
    }

    @Import(name="holdTime")
    private @Nullable Output<Integer> holdTime;

    public Optional<Output<Integer>> holdTime() {
        return Optional.ofNullable(this.holdTime);
    }

    @Import(name="importPolicy")
    private @Nullable Output<String> importPolicy;

    public Optional<Output<String>> importPolicy() {
        return Optional.ofNullable(this.importPolicy);
    }

    /**
     * assuming BGP neighbor is directly connected
     * 
     */
    @Import(name="multihopTtl")
    private @Nullable Output<Integer> multihopTtl;

    /**
     * @return assuming BGP neighbor is directly connected
     * 
     */
    public Optional<Output<Integer>> multihopTtl() {
        return Optional.ofNullable(this.multihopTtl);
    }

    @Import(name="neighborAs")
    private @Nullable Output<Integer> neighborAs;

    public Optional<Output<Integer>> neighborAs() {
        return Optional.ofNullable(this.neighborAs);
    }

    private DeviceprofileGatewayBgpConfigNeighborsArgs() {}

    private DeviceprofileGatewayBgpConfigNeighborsArgs(DeviceprofileGatewayBgpConfigNeighborsArgs $) {
        this.disabled = $.disabled;
        this.exportPolicy = $.exportPolicy;
        this.holdTime = $.holdTime;
        this.importPolicy = $.importPolicy;
        this.multihopTtl = $.multihopTtl;
        this.neighborAs = $.neighborAs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileGatewayBgpConfigNeighborsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileGatewayBgpConfigNeighborsArgs $;

        public Builder() {
            $ = new DeviceprofileGatewayBgpConfigNeighborsArgs();
        }

        public Builder(DeviceprofileGatewayBgpConfigNeighborsArgs defaults) {
            $ = new DeviceprofileGatewayBgpConfigNeighborsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disabled If true, the BGP session to this neighbor will be administratively disabled/shutdown
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled If true, the BGP session to this neighbor will be administratively disabled/shutdown
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        public Builder exportPolicy(@Nullable Output<String> exportPolicy) {
            $.exportPolicy = exportPolicy;
            return this;
        }

        public Builder exportPolicy(String exportPolicy) {
            return exportPolicy(Output.of(exportPolicy));
        }

        public Builder holdTime(@Nullable Output<Integer> holdTime) {
            $.holdTime = holdTime;
            return this;
        }

        public Builder holdTime(Integer holdTime) {
            return holdTime(Output.of(holdTime));
        }

        public Builder importPolicy(@Nullable Output<String> importPolicy) {
            $.importPolicy = importPolicy;
            return this;
        }

        public Builder importPolicy(String importPolicy) {
            return importPolicy(Output.of(importPolicy));
        }

        /**
         * @param multihopTtl assuming BGP neighbor is directly connected
         * 
         * @return builder
         * 
         */
        public Builder multihopTtl(@Nullable Output<Integer> multihopTtl) {
            $.multihopTtl = multihopTtl;
            return this;
        }

        /**
         * @param multihopTtl assuming BGP neighbor is directly connected
         * 
         * @return builder
         * 
         */
        public Builder multihopTtl(Integer multihopTtl) {
            return multihopTtl(Output.of(multihopTtl));
        }

        public Builder neighborAs(@Nullable Output<Integer> neighborAs) {
            $.neighborAs = neighborAs;
            return this;
        }

        public Builder neighborAs(Integer neighborAs) {
            return neighborAs(Output.of(neighborAs));
        }

        public DeviceprofileGatewayBgpConfigNeighborsArgs build() {
            return $;
        }
    }

}