// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.device.inputs.GatewayRoutingPoliciesTermMatchingRouteExistsArgs;
import com.pulumi.junipermist.device.inputs.GatewayRoutingPoliciesTermMatchingVpnPathSlaArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayRoutingPoliciesTermMatchingArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayRoutingPoliciesTermMatchingArgs Empty = new GatewayRoutingPoliciesTermMatchingArgs();

    /**
     * takes regular expression
     * 
     */
    @Import(name="asPaths")
    private @Nullable Output<List<String>> asPaths;

    /**
     * @return takes regular expression
     * 
     */
    public Optional<Output<List<String>>> asPaths() {
        return Optional.ofNullable(this.asPaths);
    }

    @Import(name="communities")
    private @Nullable Output<List<String>> communities;

    public Optional<Output<List<String>>> communities() {
        return Optional.ofNullable(this.communities);
    }

    @Import(name="networks")
    private @Nullable Output<List<String>> networks;

    public Optional<Output<List<String>>> networks() {
        return Optional.ofNullable(this.networks);
    }

    /**
     * zero or more criteria/filter can be specified to match the term, all criteria have to be met
     * 
     */
    @Import(name="prefixes")
    private @Nullable Output<List<String>> prefixes;

    /**
     * @return zero or more criteria/filter can be specified to match the term, all criteria have to be met
     * 
     */
    public Optional<Output<List<String>>> prefixes() {
        return Optional.ofNullable(this.prefixes);
    }

    /**
     * `direct`, `bgp`, `osp`, ...
     * 
     */
    @Import(name="protocols")
    private @Nullable Output<List<String>> protocols;

    /**
     * @return `direct`, `bgp`, `osp`, ...
     * 
     */
    public Optional<Output<List<String>>> protocols() {
        return Optional.ofNullable(this.protocols);
    }

    @Import(name="routeExists")
    private @Nullable Output<GatewayRoutingPoliciesTermMatchingRouteExistsArgs> routeExists;

    public Optional<Output<GatewayRoutingPoliciesTermMatchingRouteExistsArgs>> routeExists() {
        return Optional.ofNullable(this.routeExists);
    }

    /**
     * overlay-facing criteria (used for bgp_config where via=vpn)
     * 
     */
    @Import(name="vpnNeighborMacs")
    private @Nullable Output<List<String>> vpnNeighborMacs;

    /**
     * @return overlay-facing criteria (used for bgp_config where via=vpn)
     * 
     */
    public Optional<Output<List<String>>> vpnNeighborMacs() {
        return Optional.ofNullable(this.vpnNeighborMacs);
    }

    @Import(name="vpnPathSla")
    private @Nullable Output<GatewayRoutingPoliciesTermMatchingVpnPathSlaArgs> vpnPathSla;

    public Optional<Output<GatewayRoutingPoliciesTermMatchingVpnPathSlaArgs>> vpnPathSla() {
        return Optional.ofNullable(this.vpnPathSla);
    }

    /**
     * overlay-facing criteria (used for bgp_config where via=vpn). ordered-
     * 
     */
    @Import(name="vpnPaths")
    private @Nullable Output<List<String>> vpnPaths;

    /**
     * @return overlay-facing criteria (used for bgp_config where via=vpn). ordered-
     * 
     */
    public Optional<Output<List<String>>> vpnPaths() {
        return Optional.ofNullable(this.vpnPaths);
    }

    private GatewayRoutingPoliciesTermMatchingArgs() {}

    private GatewayRoutingPoliciesTermMatchingArgs(GatewayRoutingPoliciesTermMatchingArgs $) {
        this.asPaths = $.asPaths;
        this.communities = $.communities;
        this.networks = $.networks;
        this.prefixes = $.prefixes;
        this.protocols = $.protocols;
        this.routeExists = $.routeExists;
        this.vpnNeighborMacs = $.vpnNeighborMacs;
        this.vpnPathSla = $.vpnPathSla;
        this.vpnPaths = $.vpnPaths;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayRoutingPoliciesTermMatchingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayRoutingPoliciesTermMatchingArgs $;

        public Builder() {
            $ = new GatewayRoutingPoliciesTermMatchingArgs();
        }

        public Builder(GatewayRoutingPoliciesTermMatchingArgs defaults) {
            $ = new GatewayRoutingPoliciesTermMatchingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param asPaths takes regular expression
         * 
         * @return builder
         * 
         */
        public Builder asPaths(@Nullable Output<List<String>> asPaths) {
            $.asPaths = asPaths;
            return this;
        }

        /**
         * @param asPaths takes regular expression
         * 
         * @return builder
         * 
         */
        public Builder asPaths(List<String> asPaths) {
            return asPaths(Output.of(asPaths));
        }

        /**
         * @param asPaths takes regular expression
         * 
         * @return builder
         * 
         */
        public Builder asPaths(String... asPaths) {
            return asPaths(List.of(asPaths));
        }

        public Builder communities(@Nullable Output<List<String>> communities) {
            $.communities = communities;
            return this;
        }

        public Builder communities(List<String> communities) {
            return communities(Output.of(communities));
        }

        public Builder communities(String... communities) {
            return communities(List.of(communities));
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

        /**
         * @param prefixes zero or more criteria/filter can be specified to match the term, all criteria have to be met
         * 
         * @return builder
         * 
         */
        public Builder prefixes(@Nullable Output<List<String>> prefixes) {
            $.prefixes = prefixes;
            return this;
        }

        /**
         * @param prefixes zero or more criteria/filter can be specified to match the term, all criteria have to be met
         * 
         * @return builder
         * 
         */
        public Builder prefixes(List<String> prefixes) {
            return prefixes(Output.of(prefixes));
        }

        /**
         * @param prefixes zero or more criteria/filter can be specified to match the term, all criteria have to be met
         * 
         * @return builder
         * 
         */
        public Builder prefixes(String... prefixes) {
            return prefixes(List.of(prefixes));
        }

        /**
         * @param protocols `direct`, `bgp`, `osp`, ...
         * 
         * @return builder
         * 
         */
        public Builder protocols(@Nullable Output<List<String>> protocols) {
            $.protocols = protocols;
            return this;
        }

        /**
         * @param protocols `direct`, `bgp`, `osp`, ...
         * 
         * @return builder
         * 
         */
        public Builder protocols(List<String> protocols) {
            return protocols(Output.of(protocols));
        }

        /**
         * @param protocols `direct`, `bgp`, `osp`, ...
         * 
         * @return builder
         * 
         */
        public Builder protocols(String... protocols) {
            return protocols(List.of(protocols));
        }

        public Builder routeExists(@Nullable Output<GatewayRoutingPoliciesTermMatchingRouteExistsArgs> routeExists) {
            $.routeExists = routeExists;
            return this;
        }

        public Builder routeExists(GatewayRoutingPoliciesTermMatchingRouteExistsArgs routeExists) {
            return routeExists(Output.of(routeExists));
        }

        /**
         * @param vpnNeighborMacs overlay-facing criteria (used for bgp_config where via=vpn)
         * 
         * @return builder
         * 
         */
        public Builder vpnNeighborMacs(@Nullable Output<List<String>> vpnNeighborMacs) {
            $.vpnNeighborMacs = vpnNeighborMacs;
            return this;
        }

        /**
         * @param vpnNeighborMacs overlay-facing criteria (used for bgp_config where via=vpn)
         * 
         * @return builder
         * 
         */
        public Builder vpnNeighborMacs(List<String> vpnNeighborMacs) {
            return vpnNeighborMacs(Output.of(vpnNeighborMacs));
        }

        /**
         * @param vpnNeighborMacs overlay-facing criteria (used for bgp_config where via=vpn)
         * 
         * @return builder
         * 
         */
        public Builder vpnNeighborMacs(String... vpnNeighborMacs) {
            return vpnNeighborMacs(List.of(vpnNeighborMacs));
        }

        public Builder vpnPathSla(@Nullable Output<GatewayRoutingPoliciesTermMatchingVpnPathSlaArgs> vpnPathSla) {
            $.vpnPathSla = vpnPathSla;
            return this;
        }

        public Builder vpnPathSla(GatewayRoutingPoliciesTermMatchingVpnPathSlaArgs vpnPathSla) {
            return vpnPathSla(Output.of(vpnPathSla));
        }

        /**
         * @param vpnPaths overlay-facing criteria (used for bgp_config where via=vpn). ordered-
         * 
         * @return builder
         * 
         */
        public Builder vpnPaths(@Nullable Output<List<String>> vpnPaths) {
            $.vpnPaths = vpnPaths;
            return this;
        }

        /**
         * @param vpnPaths overlay-facing criteria (used for bgp_config where via=vpn). ordered-
         * 
         * @return builder
         * 
         */
        public Builder vpnPaths(List<String> vpnPaths) {
            return vpnPaths(Output.of(vpnPaths));
        }

        /**
         * @param vpnPaths overlay-facing criteria (used for bgp_config where via=vpn). ordered-
         * 
         * @return builder
         * 
         */
        public Builder vpnPaths(String... vpnPaths) {
            return vpnPaths(List.of(vpnPaths));
        }

        public GatewayRoutingPoliciesTermMatchingArgs build() {
            return $;
        }
    }

}
