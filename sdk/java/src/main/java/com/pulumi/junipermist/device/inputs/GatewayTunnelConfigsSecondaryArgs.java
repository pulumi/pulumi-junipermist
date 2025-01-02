// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayTunnelConfigsSecondaryArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayTunnelConfigsSecondaryArgs Empty = new GatewayTunnelConfigsSecondaryArgs();

    @Import(name="hosts", required=true)
    private Output<List<String>> hosts;

    public Output<List<String>> hosts() {
        return this.hosts;
    }

    /**
     * Only if `provider`==`zscaler-gre`, `provider`==`jse-ipsec`, `provider`==`custom-ipsec` or `provider`==`custom-gre`
     * 
     */
    @Import(name="internalIps")
    private @Nullable Output<List<String>> internalIps;

    /**
     * @return Only if `provider`==`zscaler-gre`, `provider`==`jse-ipsec`, `provider`==`custom-ipsec` or `provider`==`custom-gre`
     * 
     */
    public Optional<Output<List<String>>> internalIps() {
        return Optional.ofNullable(this.internalIps);
    }

    @Import(name="probeIps")
    private @Nullable Output<List<String>> probeIps;

    public Optional<Output<List<String>>> probeIps() {
        return Optional.ofNullable(this.probeIps);
    }

    /**
     * Only if  `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
     * 
     */
    @Import(name="remoteIds")
    private @Nullable Output<List<String>> remoteIds;

    /**
     * @return Only if  `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
     * 
     */
    public Optional<Output<List<String>>> remoteIds() {
        return Optional.ofNullable(this.remoteIds);
    }

    @Import(name="wanNames", required=true)
    private Output<List<String>> wanNames;

    public Output<List<String>> wanNames() {
        return this.wanNames;
    }

    private GatewayTunnelConfigsSecondaryArgs() {}

    private GatewayTunnelConfigsSecondaryArgs(GatewayTunnelConfigsSecondaryArgs $) {
        this.hosts = $.hosts;
        this.internalIps = $.internalIps;
        this.probeIps = $.probeIps;
        this.remoteIds = $.remoteIds;
        this.wanNames = $.wanNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayTunnelConfigsSecondaryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayTunnelConfigsSecondaryArgs $;

        public Builder() {
            $ = new GatewayTunnelConfigsSecondaryArgs();
        }

        public Builder(GatewayTunnelConfigsSecondaryArgs defaults) {
            $ = new GatewayTunnelConfigsSecondaryArgs(Objects.requireNonNull(defaults));
        }

        public Builder hosts(Output<List<String>> hosts) {
            $.hosts = hosts;
            return this;
        }

        public Builder hosts(List<String> hosts) {
            return hosts(Output.of(hosts));
        }

        public Builder hosts(String... hosts) {
            return hosts(List.of(hosts));
        }

        /**
         * @param internalIps Only if `provider`==`zscaler-gre`, `provider`==`jse-ipsec`, `provider`==`custom-ipsec` or `provider`==`custom-gre`
         * 
         * @return builder
         * 
         */
        public Builder internalIps(@Nullable Output<List<String>> internalIps) {
            $.internalIps = internalIps;
            return this;
        }

        /**
         * @param internalIps Only if `provider`==`zscaler-gre`, `provider`==`jse-ipsec`, `provider`==`custom-ipsec` or `provider`==`custom-gre`
         * 
         * @return builder
         * 
         */
        public Builder internalIps(List<String> internalIps) {
            return internalIps(Output.of(internalIps));
        }

        /**
         * @param internalIps Only if `provider`==`zscaler-gre`, `provider`==`jse-ipsec`, `provider`==`custom-ipsec` or `provider`==`custom-gre`
         * 
         * @return builder
         * 
         */
        public Builder internalIps(String... internalIps) {
            return internalIps(List.of(internalIps));
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
         * @param remoteIds Only if  `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder remoteIds(@Nullable Output<List<String>> remoteIds) {
            $.remoteIds = remoteIds;
            return this;
        }

        /**
         * @param remoteIds Only if  `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder remoteIds(List<String> remoteIds) {
            return remoteIds(Output.of(remoteIds));
        }

        /**
         * @param remoteIds Only if  `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder remoteIds(String... remoteIds) {
            return remoteIds(List.of(remoteIds));
        }

        public Builder wanNames(Output<List<String>> wanNames) {
            $.wanNames = wanNames;
            return this;
        }

        public Builder wanNames(List<String> wanNames) {
            return wanNames(Output.of(wanNames));
        }

        public Builder wanNames(String... wanNames) {
            return wanNames(List.of(wanNames));
        }

        public GatewayTunnelConfigsSecondaryArgs build() {
            if ($.hosts == null) {
                throw new MissingRequiredPropertyException("GatewayTunnelConfigsSecondaryArgs", "hosts");
            }
            if ($.wanNames == null) {
                throw new MissingRequiredPropertyException("GatewayTunnelConfigsSecondaryArgs", "wanNames");
            }
            return $;
        }
    }

}
