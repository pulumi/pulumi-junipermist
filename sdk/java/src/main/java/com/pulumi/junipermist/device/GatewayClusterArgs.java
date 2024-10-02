// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.device.inputs.GatewayClusterNodeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GatewayClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayClusterArgs Empty = new GatewayClusterArgs();

    /**
     * when replacing a node, either mac has to remain the same as existing cluster
     * 
     */
    @Import(name="nodes", required=true)
    private Output<List<GatewayClusterNodeArgs>> nodes;

    /**
     * @return when replacing a node, either mac has to remain the same as existing cluster
     * 
     */
    public Output<List<GatewayClusterNodeArgs>> nodes() {
        return this.nodes;
    }

    @Import(name="siteId", required=true)
    private Output<String> siteId;

    public Output<String> siteId() {
        return this.siteId;
    }

    private GatewayClusterArgs() {}

    private GatewayClusterArgs(GatewayClusterArgs $) {
        this.nodes = $.nodes;
        this.siteId = $.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayClusterArgs $;

        public Builder() {
            $ = new GatewayClusterArgs();
        }

        public Builder(GatewayClusterArgs defaults) {
            $ = new GatewayClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nodes when replacing a node, either mac has to remain the same as existing cluster
         * 
         * @return builder
         * 
         */
        public Builder nodes(Output<List<GatewayClusterNodeArgs>> nodes) {
            $.nodes = nodes;
            return this;
        }

        /**
         * @param nodes when replacing a node, either mac has to remain the same as existing cluster
         * 
         * @return builder
         * 
         */
        public Builder nodes(List<GatewayClusterNodeArgs> nodes) {
            return nodes(Output.of(nodes));
        }

        /**
         * @param nodes when replacing a node, either mac has to remain the same as existing cluster
         * 
         * @return builder
         * 
         */
        public Builder nodes(GatewayClusterNodeArgs... nodes) {
            return nodes(List.of(nodes));
        }

        public Builder siteId(Output<String> siteId) {
            $.siteId = siteId;
            return this;
        }

        public Builder siteId(String siteId) {
            return siteId(Output.of(siteId));
        }

        public GatewayClusterArgs build() {
            if ($.nodes == null) {
                throw new MissingRequiredPropertyException("GatewayClusterArgs", "nodes");
            }
            if ($.siteId == null) {
                throw new MissingRequiredPropertyException("GatewayClusterArgs", "siteId");
            }
            return $;
        }
    }

}