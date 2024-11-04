// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayNetworkMulticastGroupsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayNetworkMulticastGroupsArgs Empty = new GatewayNetworkMulticastGroupsArgs();

    /**
     * RP (rendezvous point) IP Address
     * 
     */
    @Import(name="rpIp")
    private @Nullable Output<String> rpIp;

    /**
     * @return RP (rendezvous point) IP Address
     * 
     */
    public Optional<Output<String>> rpIp() {
        return Optional.ofNullable(this.rpIp);
    }

    private GatewayNetworkMulticastGroupsArgs() {}

    private GatewayNetworkMulticastGroupsArgs(GatewayNetworkMulticastGroupsArgs $) {
        this.rpIp = $.rpIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayNetworkMulticastGroupsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayNetworkMulticastGroupsArgs $;

        public Builder() {
            $ = new GatewayNetworkMulticastGroupsArgs();
        }

        public Builder(GatewayNetworkMulticastGroupsArgs defaults) {
            $ = new GatewayNetworkMulticastGroupsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rpIp RP (rendezvous point) IP Address
         * 
         * @return builder
         * 
         */
        public Builder rpIp(@Nullable Output<String> rpIp) {
            $.rpIp = rpIp;
            return this;
        }

        /**
         * @param rpIp RP (rendezvous point) IP Address
         * 
         * @return builder
         * 
         */
        public Builder rpIp(String rpIp) {
            return rpIp(Output.of(rpIp));
        }

        public GatewayNetworkMulticastGroupsArgs build() {
            return $;
        }
    }

}