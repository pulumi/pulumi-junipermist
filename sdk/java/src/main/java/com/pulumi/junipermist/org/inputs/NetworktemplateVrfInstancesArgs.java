// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.NetworktemplateVrfInstancesExtraRoutes6Args;
import com.pulumi.junipermist.org.inputs.NetworktemplateVrfInstancesExtraRoutesArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworktemplateVrfInstancesArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplateVrfInstancesArgs Empty = new NetworktemplateVrfInstancesArgs();

    @Import(name="evpnAutoLoopbackSubnet")
    private @Nullable Output<String> evpnAutoLoopbackSubnet;

    public Optional<Output<String>> evpnAutoLoopbackSubnet() {
        return Optional.ofNullable(this.evpnAutoLoopbackSubnet);
    }

    @Import(name="evpnAutoLoopbackSubnet6")
    private @Nullable Output<String> evpnAutoLoopbackSubnet6;

    public Optional<Output<String>> evpnAutoLoopbackSubnet6() {
        return Optional.ofNullable(this.evpnAutoLoopbackSubnet6);
    }

    /**
     * Property key is the destination CIDR (e.g. &#34;10.0.0.0/8&#34;)
     * 
     */
    @Import(name="extraRoutes")
    private @Nullable Output<Map<String,NetworktemplateVrfInstancesExtraRoutesArgs>> extraRoutes;

    /**
     * @return Property key is the destination CIDR (e.g. &#34;10.0.0.0/8&#34;)
     * 
     */
    public Optional<Output<Map<String,NetworktemplateVrfInstancesExtraRoutesArgs>>> extraRoutes() {
        return Optional.ofNullable(this.extraRoutes);
    }

    /**
     * Property key is the destination CIDR (e.g. &#34;2a02:1234:420a:10c9::/64&#34;)
     * 
     */
    @Import(name="extraRoutes6")
    private @Nullable Output<Map<String,NetworktemplateVrfInstancesExtraRoutes6Args>> extraRoutes6;

    /**
     * @return Property key is the destination CIDR (e.g. &#34;2a02:1234:420a:10c9::/64&#34;)
     * 
     */
    public Optional<Output<Map<String,NetworktemplateVrfInstancesExtraRoutes6Args>>> extraRoutes6() {
        return Optional.ofNullable(this.extraRoutes6);
    }

    @Import(name="networks")
    private @Nullable Output<List<String>> networks;

    public Optional<Output<List<String>>> networks() {
        return Optional.ofNullable(this.networks);
    }

    private NetworktemplateVrfInstancesArgs() {}

    private NetworktemplateVrfInstancesArgs(NetworktemplateVrfInstancesArgs $) {
        this.evpnAutoLoopbackSubnet = $.evpnAutoLoopbackSubnet;
        this.evpnAutoLoopbackSubnet6 = $.evpnAutoLoopbackSubnet6;
        this.extraRoutes = $.extraRoutes;
        this.extraRoutes6 = $.extraRoutes6;
        this.networks = $.networks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworktemplateVrfInstancesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplateVrfInstancesArgs $;

        public Builder() {
            $ = new NetworktemplateVrfInstancesArgs();
        }

        public Builder(NetworktemplateVrfInstancesArgs defaults) {
            $ = new NetworktemplateVrfInstancesArgs(Objects.requireNonNull(defaults));
        }

        public Builder evpnAutoLoopbackSubnet(@Nullable Output<String> evpnAutoLoopbackSubnet) {
            $.evpnAutoLoopbackSubnet = evpnAutoLoopbackSubnet;
            return this;
        }

        public Builder evpnAutoLoopbackSubnet(String evpnAutoLoopbackSubnet) {
            return evpnAutoLoopbackSubnet(Output.of(evpnAutoLoopbackSubnet));
        }

        public Builder evpnAutoLoopbackSubnet6(@Nullable Output<String> evpnAutoLoopbackSubnet6) {
            $.evpnAutoLoopbackSubnet6 = evpnAutoLoopbackSubnet6;
            return this;
        }

        public Builder evpnAutoLoopbackSubnet6(String evpnAutoLoopbackSubnet6) {
            return evpnAutoLoopbackSubnet6(Output.of(evpnAutoLoopbackSubnet6));
        }

        /**
         * @param extraRoutes Property key is the destination CIDR (e.g. &#34;10.0.0.0/8&#34;)
         * 
         * @return builder
         * 
         */
        public Builder extraRoutes(@Nullable Output<Map<String,NetworktemplateVrfInstancesExtraRoutesArgs>> extraRoutes) {
            $.extraRoutes = extraRoutes;
            return this;
        }

        /**
         * @param extraRoutes Property key is the destination CIDR (e.g. &#34;10.0.0.0/8&#34;)
         * 
         * @return builder
         * 
         */
        public Builder extraRoutes(Map<String,NetworktemplateVrfInstancesExtraRoutesArgs> extraRoutes) {
            return extraRoutes(Output.of(extraRoutes));
        }

        /**
         * @param extraRoutes6 Property key is the destination CIDR (e.g. &#34;2a02:1234:420a:10c9::/64&#34;)
         * 
         * @return builder
         * 
         */
        public Builder extraRoutes6(@Nullable Output<Map<String,NetworktemplateVrfInstancesExtraRoutes6Args>> extraRoutes6) {
            $.extraRoutes6 = extraRoutes6;
            return this;
        }

        /**
         * @param extraRoutes6 Property key is the destination CIDR (e.g. &#34;2a02:1234:420a:10c9::/64&#34;)
         * 
         * @return builder
         * 
         */
        public Builder extraRoutes6(Map<String,NetworktemplateVrfInstancesExtraRoutes6Args> extraRoutes6) {
            return extraRoutes6(Output.of(extraRoutes6));
        }

        public Builder networks(@Nullable Output<List<String>> networks) {
            $.networks = networks;
            return this;
        }

        public Builder networks(List<String> networks) {
            return networks(Output.of(networks));
        }

        public Builder networks(String... networks) {
            return networks(List.of(networks));
        }

        public NetworktemplateVrfInstancesArgs build() {
            return $;
        }
    }

}
