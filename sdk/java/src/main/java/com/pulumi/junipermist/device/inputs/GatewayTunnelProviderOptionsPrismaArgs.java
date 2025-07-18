// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayTunnelProviderOptionsPrismaArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayTunnelProviderOptionsPrismaArgs Empty = new GatewayTunnelProviderOptionsPrismaArgs();

    /**
     * For prisma-ipsec, service account name to used for tunnel auto provisioning
     * 
     */
    @Import(name="serviceAccountName")
    private @Nullable Output<String> serviceAccountName;

    /**
     * @return For prisma-ipsec, service account name to used for tunnel auto provisioning
     * 
     */
    public Optional<Output<String>> serviceAccountName() {
        return Optional.ofNullable(this.serviceAccountName);
    }

    private GatewayTunnelProviderOptionsPrismaArgs() {}

    private GatewayTunnelProviderOptionsPrismaArgs(GatewayTunnelProviderOptionsPrismaArgs $) {
        this.serviceAccountName = $.serviceAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayTunnelProviderOptionsPrismaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayTunnelProviderOptionsPrismaArgs $;

        public Builder() {
            $ = new GatewayTunnelProviderOptionsPrismaArgs();
        }

        public Builder(GatewayTunnelProviderOptionsPrismaArgs defaults) {
            $ = new GatewayTunnelProviderOptionsPrismaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serviceAccountName For prisma-ipsec, service account name to used for tunnel auto provisioning
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountName(@Nullable Output<String> serviceAccountName) {
            $.serviceAccountName = serviceAccountName;
            return this;
        }

        /**
         * @param serviceAccountName For prisma-ipsec, service account name to used for tunnel auto provisioning
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountName(String serviceAccountName) {
            return serviceAccountName(Output.of(serviceAccountName));
        }

        public GatewayTunnelProviderOptionsPrismaArgs build() {
            return $;
        }
    }

}
