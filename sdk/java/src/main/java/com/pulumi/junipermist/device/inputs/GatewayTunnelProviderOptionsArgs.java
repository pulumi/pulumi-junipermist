// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.device.inputs.GatewayTunnelProviderOptionsJseArgs;
import com.pulumi.junipermist.device.inputs.GatewayTunnelProviderOptionsPrismaArgs;
import com.pulumi.junipermist.device.inputs.GatewayTunnelProviderOptionsZscalerArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayTunnelProviderOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayTunnelProviderOptionsArgs Empty = new GatewayTunnelProviderOptionsArgs();

    /**
     * For jse-ipsec, this allows provisioning of adequate resource on JSE. Make sure adequate licenses are added
     * 
     */
    @Import(name="jse")
    private @Nullable Output<GatewayTunnelProviderOptionsJseArgs> jse;

    /**
     * @return For jse-ipsec, this allows provisioning of adequate resource on JSE. Make sure adequate licenses are added
     * 
     */
    public Optional<Output<GatewayTunnelProviderOptionsJseArgs>> jse() {
        return Optional.ofNullable(this.jse);
    }

    @Import(name="prisma")
    private @Nullable Output<GatewayTunnelProviderOptionsPrismaArgs> prisma;

    public Optional<Output<GatewayTunnelProviderOptionsPrismaArgs>> prisma() {
        return Optional.ofNullable(this.prisma);
    }

    /**
     * For zscaler-ipsec and zscaler-gre
     * 
     */
    @Import(name="zscaler")
    private @Nullable Output<GatewayTunnelProviderOptionsZscalerArgs> zscaler;

    /**
     * @return For zscaler-ipsec and zscaler-gre
     * 
     */
    public Optional<Output<GatewayTunnelProviderOptionsZscalerArgs>> zscaler() {
        return Optional.ofNullable(this.zscaler);
    }

    private GatewayTunnelProviderOptionsArgs() {}

    private GatewayTunnelProviderOptionsArgs(GatewayTunnelProviderOptionsArgs $) {
        this.jse = $.jse;
        this.prisma = $.prisma;
        this.zscaler = $.zscaler;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayTunnelProviderOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayTunnelProviderOptionsArgs $;

        public Builder() {
            $ = new GatewayTunnelProviderOptionsArgs();
        }

        public Builder(GatewayTunnelProviderOptionsArgs defaults) {
            $ = new GatewayTunnelProviderOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jse For jse-ipsec, this allows provisioning of adequate resource on JSE. Make sure adequate licenses are added
         * 
         * @return builder
         * 
         */
        public Builder jse(@Nullable Output<GatewayTunnelProviderOptionsJseArgs> jse) {
            $.jse = jse;
            return this;
        }

        /**
         * @param jse For jse-ipsec, this allows provisioning of adequate resource on JSE. Make sure adequate licenses are added
         * 
         * @return builder
         * 
         */
        public Builder jse(GatewayTunnelProviderOptionsJseArgs jse) {
            return jse(Output.of(jse));
        }

        public Builder prisma(@Nullable Output<GatewayTunnelProviderOptionsPrismaArgs> prisma) {
            $.prisma = prisma;
            return this;
        }

        public Builder prisma(GatewayTunnelProviderOptionsPrismaArgs prisma) {
            return prisma(Output.of(prisma));
        }

        /**
         * @param zscaler For zscaler-ipsec and zscaler-gre
         * 
         * @return builder
         * 
         */
        public Builder zscaler(@Nullable Output<GatewayTunnelProviderOptionsZscalerArgs> zscaler) {
            $.zscaler = zscaler;
            return this;
        }

        /**
         * @param zscaler For zscaler-ipsec and zscaler-gre
         * 
         * @return builder
         * 
         */
        public Builder zscaler(GatewayTunnelProviderOptionsZscalerArgs zscaler) {
            return zscaler(Output.of(zscaler));
        }

        public GatewayTunnelProviderOptionsArgs build() {
            return $;
        }
    }

}
