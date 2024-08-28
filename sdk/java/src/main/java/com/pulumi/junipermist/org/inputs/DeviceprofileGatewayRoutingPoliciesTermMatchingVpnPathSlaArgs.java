// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileGatewayRoutingPoliciesTermMatchingVpnPathSlaArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileGatewayRoutingPoliciesTermMatchingVpnPathSlaArgs Empty = new DeviceprofileGatewayRoutingPoliciesTermMatchingVpnPathSlaArgs();

    @Import(name="maxJitter")
    private @Nullable Output<Integer> maxJitter;

    public Optional<Output<Integer>> maxJitter() {
        return Optional.ofNullable(this.maxJitter);
    }

    @Import(name="maxLatency")
    private @Nullable Output<Integer> maxLatency;

    public Optional<Output<Integer>> maxLatency() {
        return Optional.ofNullable(this.maxLatency);
    }

    @Import(name="maxLoss")
    private @Nullable Output<Integer> maxLoss;

    public Optional<Output<Integer>> maxLoss() {
        return Optional.ofNullable(this.maxLoss);
    }

    private DeviceprofileGatewayRoutingPoliciesTermMatchingVpnPathSlaArgs() {}

    private DeviceprofileGatewayRoutingPoliciesTermMatchingVpnPathSlaArgs(DeviceprofileGatewayRoutingPoliciesTermMatchingVpnPathSlaArgs $) {
        this.maxJitter = $.maxJitter;
        this.maxLatency = $.maxLatency;
        this.maxLoss = $.maxLoss;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileGatewayRoutingPoliciesTermMatchingVpnPathSlaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileGatewayRoutingPoliciesTermMatchingVpnPathSlaArgs $;

        public Builder() {
            $ = new DeviceprofileGatewayRoutingPoliciesTermMatchingVpnPathSlaArgs();
        }

        public Builder(DeviceprofileGatewayRoutingPoliciesTermMatchingVpnPathSlaArgs defaults) {
            $ = new DeviceprofileGatewayRoutingPoliciesTermMatchingVpnPathSlaArgs(Objects.requireNonNull(defaults));
        }

        public Builder maxJitter(@Nullable Output<Integer> maxJitter) {
            $.maxJitter = maxJitter;
            return this;
        }

        public Builder maxJitter(Integer maxJitter) {
            return maxJitter(Output.of(maxJitter));
        }

        public Builder maxLatency(@Nullable Output<Integer> maxLatency) {
            $.maxLatency = maxLatency;
            return this;
        }

        public Builder maxLatency(Integer maxLatency) {
            return maxLatency(Output.of(maxLatency));
        }

        public Builder maxLoss(@Nullable Output<Integer> maxLoss) {
            $.maxLoss = maxLoss;
            return this;
        }

        public Builder maxLoss(Integer maxLoss) {
            return maxLoss(Output.of(maxLoss));
        }

        public DeviceprofileGatewayRoutingPoliciesTermMatchingVpnPathSlaArgs build() {
            return $;
        }
    }

}