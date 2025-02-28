// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayTunnelConfigsProbeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayTunnelConfigsProbeArgs Empty = new GatewayTunnelConfigsProbeArgs();

    /**
     * How often to trigger the probe
     * 
     */
    @Import(name="interval")
    private @Nullable Output<Integer> interval;

    /**
     * @return How often to trigger the probe
     * 
     */
    public Optional<Output<Integer>> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * Number of consecutive misses before declaring the tunnel down
     * 
     */
    @Import(name="threshold")
    private @Nullable Output<Integer> threshold;

    /**
     * @return Number of consecutive misses before declaring the tunnel down
     * 
     */
    public Optional<Output<Integer>> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    /**
     * Time within which to complete the connectivity check
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return Time within which to complete the connectivity check
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * enum: `http`, `icmp`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return enum: `http`, `icmp`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private GatewayTunnelConfigsProbeArgs() {}

    private GatewayTunnelConfigsProbeArgs(GatewayTunnelConfigsProbeArgs $) {
        this.interval = $.interval;
        this.threshold = $.threshold;
        this.timeout = $.timeout;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayTunnelConfigsProbeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayTunnelConfigsProbeArgs $;

        public Builder() {
            $ = new GatewayTunnelConfigsProbeArgs();
        }

        public Builder(GatewayTunnelConfigsProbeArgs defaults) {
            $ = new GatewayTunnelConfigsProbeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param interval How often to trigger the probe
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval How often to trigger the probe
         * 
         * @return builder
         * 
         */
        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param threshold Number of consecutive misses before declaring the tunnel down
         * 
         * @return builder
         * 
         */
        public Builder threshold(@Nullable Output<Integer> threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param threshold Number of consecutive misses before declaring the tunnel down
         * 
         * @return builder
         * 
         */
        public Builder threshold(Integer threshold) {
            return threshold(Output.of(threshold));
        }

        /**
         * @param timeout Time within which to complete the connectivity check
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Time within which to complete the connectivity check
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param type enum: `http`, `icmp`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type enum: `http`, `icmp`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GatewayTunnelConfigsProbeArgs build() {
            return $;
        }
    }

}
