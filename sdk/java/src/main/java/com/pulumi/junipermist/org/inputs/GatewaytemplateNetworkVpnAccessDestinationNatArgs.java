// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewaytemplateNetworkVpnAccessDestinationNatArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewaytemplateNetworkVpnAccessDestinationNatArgs Empty = new GatewaytemplateNetworkVpnAccessDestinationNatArgs();

    /**
     * The Destination NAT destination IP Address. Must be an IP (i.e. &#34;192.168.70.30&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    @Import(name="internalIp")
    private @Nullable Output<String> internalIp;

    /**
     * @return The Destination NAT destination IP Address. Must be an IP (i.e. &#34;192.168.70.30&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    public Optional<Output<String>> internalIp() {
        return Optional.ofNullable(this.internalIp);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="port")
    private @Nullable Output<String> port;

    public Optional<Output<String>> port() {
        return Optional.ofNullable(this.port);
    }

    private GatewaytemplateNetworkVpnAccessDestinationNatArgs() {}

    private GatewaytemplateNetworkVpnAccessDestinationNatArgs(GatewaytemplateNetworkVpnAccessDestinationNatArgs $) {
        this.internalIp = $.internalIp;
        this.name = $.name;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewaytemplateNetworkVpnAccessDestinationNatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewaytemplateNetworkVpnAccessDestinationNatArgs $;

        public Builder() {
            $ = new GatewaytemplateNetworkVpnAccessDestinationNatArgs();
        }

        public Builder(GatewaytemplateNetworkVpnAccessDestinationNatArgs defaults) {
            $ = new GatewaytemplateNetworkVpnAccessDestinationNatArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param internalIp The Destination NAT destination IP Address. Must be an IP (i.e. &#34;192.168.70.30&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
         * 
         * @return builder
         * 
         */
        public Builder internalIp(@Nullable Output<String> internalIp) {
            $.internalIp = internalIp;
            return this;
        }

        /**
         * @param internalIp The Destination NAT destination IP Address. Must be an IP (i.e. &#34;192.168.70.30&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
         * 
         * @return builder
         * 
         */
        public Builder internalIp(String internalIp) {
            return internalIp(Output.of(internalIp));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder port(@Nullable Output<String> port) {
            $.port = port;
            return this;
        }

        public Builder port(String port) {
            return port(Output.of(port));
        }

        public GatewaytemplateNetworkVpnAccessDestinationNatArgs build() {
            return $;
        }
    }

}
