// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.GatewaytemplateNetworkMulticastGroupsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewaytemplateNetworkMulticastArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewaytemplateNetworkMulticastArgs Empty = new GatewaytemplateNetworkMulticastArgs();

    /**
     * If the network will only be the soruce of the multicast traffic, IGMP can be disabled
     * 
     */
    @Import(name="disableIgmp")
    private @Nullable Output<Boolean> disableIgmp;

    /**
     * @return If the network will only be the soruce of the multicast traffic, IGMP can be disabled
     * 
     */
    public Optional<Output<Boolean>> disableIgmp() {
        return Optional.ofNullable(this.disableIgmp);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Group address to RP (rendezvous point) mapping. Property Key is the CIDR (example &#34;225.1.0.3/32&#34;)
     * 
     */
    @Import(name="groups")
    private @Nullable Output<Map<String,GatewaytemplateNetworkMulticastGroupsArgs>> groups;

    /**
     * @return Group address to RP (rendezvous point) mapping. Property Key is the CIDR (example &#34;225.1.0.3/32&#34;)
     * 
     */
    public Optional<Output<Map<String,GatewaytemplateNetworkMulticastGroupsArgs>>> groups() {
        return Optional.ofNullable(this.groups);
    }

    private GatewaytemplateNetworkMulticastArgs() {}

    private GatewaytemplateNetworkMulticastArgs(GatewaytemplateNetworkMulticastArgs $) {
        this.disableIgmp = $.disableIgmp;
        this.enabled = $.enabled;
        this.groups = $.groups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewaytemplateNetworkMulticastArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewaytemplateNetworkMulticastArgs $;

        public Builder() {
            $ = new GatewaytemplateNetworkMulticastArgs();
        }

        public Builder(GatewaytemplateNetworkMulticastArgs defaults) {
            $ = new GatewaytemplateNetworkMulticastArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disableIgmp If the network will only be the soruce of the multicast traffic, IGMP can be disabled
         * 
         * @return builder
         * 
         */
        public Builder disableIgmp(@Nullable Output<Boolean> disableIgmp) {
            $.disableIgmp = disableIgmp;
            return this;
        }

        /**
         * @param disableIgmp If the network will only be the soruce of the multicast traffic, IGMP can be disabled
         * 
         * @return builder
         * 
         */
        public Builder disableIgmp(Boolean disableIgmp) {
            return disableIgmp(Output.of(disableIgmp));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param groups Group address to RP (rendezvous point) mapping. Property Key is the CIDR (example &#34;225.1.0.3/32&#34;)
         * 
         * @return builder
         * 
         */
        public Builder groups(@Nullable Output<Map<String,GatewaytemplateNetworkMulticastGroupsArgs>> groups) {
            $.groups = groups;
            return this;
        }

        /**
         * @param groups Group address to RP (rendezvous point) mapping. Property Key is the CIDR (example &#34;225.1.0.3/32&#34;)
         * 
         * @return builder
         * 
         */
        public Builder groups(Map<String,GatewaytemplateNetworkMulticastGroupsArgs> groups) {
            return groups(Output.of(groups));
        }

        public GatewaytemplateNetworkMulticastArgs build() {
            return $;
        }
    }

}
