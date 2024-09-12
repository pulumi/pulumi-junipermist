// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworktemplateSwitchMatchingRuleIpConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplateSwitchMatchingRuleIpConfigArgs Empty = new NetworktemplateSwitchMatchingRuleIpConfigArgs();

    /**
     * VLAN Name for the management interface
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return VLAN Name for the management interface
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * enum: `dhcp`, `static`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return enum: `dhcp`, `static`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private NetworktemplateSwitchMatchingRuleIpConfigArgs() {}

    private NetworktemplateSwitchMatchingRuleIpConfigArgs(NetworktemplateSwitchMatchingRuleIpConfigArgs $) {
        this.network = $.network;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworktemplateSwitchMatchingRuleIpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplateSwitchMatchingRuleIpConfigArgs $;

        public Builder() {
            $ = new NetworktemplateSwitchMatchingRuleIpConfigArgs();
        }

        public Builder(NetworktemplateSwitchMatchingRuleIpConfigArgs defaults) {
            $ = new NetworktemplateSwitchMatchingRuleIpConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param network VLAN Name for the management interface
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network VLAN Name for the management interface
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param type enum: `dhcp`, `static`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type enum: `dhcp`, `static`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public NetworktemplateSwitchMatchingRuleIpConfigArgs build() {
            return $;
        }
    }

}
