// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.device.inputs.GatewayClusterNodeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayClusterState extends com.pulumi.resources.ResourceArgs {

    public static final GatewayClusterState Empty = new GatewayClusterState();

    /**
     * When replacing a node, either mac has to remain the same as existing cluster
     * 
     */
    @Import(name="nodes")
    private @Nullable Output<List<GatewayClusterNodeArgs>> nodes;

    /**
     * @return When replacing a node, either mac has to remain the same as existing cluster
     * 
     */
    public Optional<Output<List<GatewayClusterNodeArgs>>> nodes() {
        return Optional.ofNullable(this.nodes);
    }

    @Import(name="siteId")
    private @Nullable Output<String> siteId;

    public Optional<Output<String>> siteId() {
        return Optional.ofNullable(this.siteId);
    }

    private GatewayClusterState() {}

    private GatewayClusterState(GatewayClusterState $) {
        this.nodes = $.nodes;
        this.siteId = $.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayClusterState $;

        public Builder() {
            $ = new GatewayClusterState();
        }

        public Builder(GatewayClusterState defaults) {
            $ = new GatewayClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param nodes When replacing a node, either mac has to remain the same as existing cluster
         * 
         * @return builder
         * 
         */
        public Builder nodes(@Nullable Output<List<GatewayClusterNodeArgs>> nodes) {
            $.nodes = nodes;
            return this;
        }

        /**
         * @param nodes When replacing a node, either mac has to remain the same as existing cluster
         * 
         * @return builder
         * 
         */
        public Builder nodes(List<GatewayClusterNodeArgs> nodes) {
            return nodes(Output.of(nodes));
        }

        /**
         * @param nodes When replacing a node, either mac has to remain the same as existing cluster
         * 
         * @return builder
         * 
         */
        public Builder nodes(GatewayClusterNodeArgs... nodes) {
            return nodes(List.of(nodes));
        }

        public Builder siteId(@Nullable Output<String> siteId) {
            $.siteId = siteId;
            return this;
        }

        public Builder siteId(String siteId) {
            return siteId(Output.of(siteId));
        }

        public GatewayClusterState build() {
            return $;
        }
    }

}
