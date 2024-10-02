// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.device.inputs.GatewayRoutingPoliciesTermActionArgs;
import com.pulumi.junipermist.device.inputs.GatewayRoutingPoliciesTermMatchingArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayRoutingPoliciesTermArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayRoutingPoliciesTermArgs Empty = new GatewayRoutingPoliciesTermArgs();

    /**
     * when used as import policy
     * 
     */
    @Import(name="action")
    private @Nullable Output<GatewayRoutingPoliciesTermActionArgs> action;

    /**
     * @return when used as import policy
     * 
     */
    public Optional<Output<GatewayRoutingPoliciesTermActionArgs>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * zero or more criteria/filter can be specified to match the term, all criteria have to be met
     * 
     */
    @Import(name="matching")
    private @Nullable Output<GatewayRoutingPoliciesTermMatchingArgs> matching;

    /**
     * @return zero or more criteria/filter can be specified to match the term, all criteria have to be met
     * 
     */
    public Optional<Output<GatewayRoutingPoliciesTermMatchingArgs>> matching() {
        return Optional.ofNullable(this.matching);
    }

    private GatewayRoutingPoliciesTermArgs() {}

    private GatewayRoutingPoliciesTermArgs(GatewayRoutingPoliciesTermArgs $) {
        this.action = $.action;
        this.matching = $.matching;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayRoutingPoliciesTermArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayRoutingPoliciesTermArgs $;

        public Builder() {
            $ = new GatewayRoutingPoliciesTermArgs();
        }

        public Builder(GatewayRoutingPoliciesTermArgs defaults) {
            $ = new GatewayRoutingPoliciesTermArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action when used as import policy
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<GatewayRoutingPoliciesTermActionArgs> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action when used as import policy
         * 
         * @return builder
         * 
         */
        public Builder action(GatewayRoutingPoliciesTermActionArgs action) {
            return action(Output.of(action));
        }

        /**
         * @param matching zero or more criteria/filter can be specified to match the term, all criteria have to be met
         * 
         * @return builder
         * 
         */
        public Builder matching(@Nullable Output<GatewayRoutingPoliciesTermMatchingArgs> matching) {
            $.matching = matching;
            return this;
        }

        /**
         * @param matching zero or more criteria/filter can be specified to match the term, all criteria have to be met
         * 
         * @return builder
         * 
         */
        public Builder matching(GatewayRoutingPoliciesTermMatchingArgs matching) {
            return matching(Output.of(matching));
        }

        public GatewayRoutingPoliciesTermArgs build() {
            return $;
        }
    }

}