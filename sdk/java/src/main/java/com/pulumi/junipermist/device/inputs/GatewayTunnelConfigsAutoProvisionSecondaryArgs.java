// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayTunnelConfigsAutoProvisionSecondaryArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayTunnelConfigsAutoProvisionSecondaryArgs Empty = new GatewayTunnelConfigsAutoProvisionSecondaryArgs();

    @Import(name="probeIps")
    private @Nullable Output<List<String>> probeIps;

    public Optional<Output<List<String>>> probeIps() {
        return Optional.ofNullable(this.probeIps);
    }

    /**
     * optional, only needed if `vars_only`==`false`
     * 
     */
    @Import(name="wanNames")
    private @Nullable Output<List<String>> wanNames;

    /**
     * @return optional, only needed if `vars_only`==`false`
     * 
     */
    public Optional<Output<List<String>>> wanNames() {
        return Optional.ofNullable(this.wanNames);
    }

    private GatewayTunnelConfigsAutoProvisionSecondaryArgs() {}

    private GatewayTunnelConfigsAutoProvisionSecondaryArgs(GatewayTunnelConfigsAutoProvisionSecondaryArgs $) {
        this.probeIps = $.probeIps;
        this.wanNames = $.wanNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayTunnelConfigsAutoProvisionSecondaryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayTunnelConfigsAutoProvisionSecondaryArgs $;

        public Builder() {
            $ = new GatewayTunnelConfigsAutoProvisionSecondaryArgs();
        }

        public Builder(GatewayTunnelConfigsAutoProvisionSecondaryArgs defaults) {
            $ = new GatewayTunnelConfigsAutoProvisionSecondaryArgs(Objects.requireNonNull(defaults));
        }

        public Builder probeIps(@Nullable Output<List<String>> probeIps) {
            $.probeIps = probeIps;
            return this;
        }

        public Builder probeIps(List<String> probeIps) {
            return probeIps(Output.of(probeIps));
        }

        public Builder probeIps(String... probeIps) {
            return probeIps(List.of(probeIps));
        }

        /**
         * @param wanNames optional, only needed if `vars_only`==`false`
         * 
         * @return builder
         * 
         */
        public Builder wanNames(@Nullable Output<List<String>> wanNames) {
            $.wanNames = wanNames;
            return this;
        }

        /**
         * @param wanNames optional, only needed if `vars_only`==`false`
         * 
         * @return builder
         * 
         */
        public Builder wanNames(List<String> wanNames) {
            return wanNames(Output.of(wanNames));
        }

        /**
         * @param wanNames optional, only needed if `vars_only`==`false`
         * 
         * @return builder
         * 
         */
        public Builder wanNames(String... wanNames) {
            return wanNames(List.of(wanNames));
        }

        public GatewayTunnelConfigsAutoProvisionSecondaryArgs build() {
            return $;
        }
    }

}
