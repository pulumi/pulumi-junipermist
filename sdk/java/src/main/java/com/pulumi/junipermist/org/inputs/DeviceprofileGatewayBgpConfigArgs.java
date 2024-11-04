// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.DeviceprofileGatewayBgpConfigNeighborsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileGatewayBgpConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileGatewayBgpConfigArgs Empty = new DeviceprofileGatewayBgpConfigArgs();

    @Import(name="authKey")
    private @Nullable Output<String> authKey;

    public Optional<Output<String>> authKey() {
        return Optional.ofNullable(this.authKey);
    }

    /**
     * when bfd_multiplier is configured alone. Default:
     *   * 1000 if `type`==`external`
     *   * 350 `type`==`internal`
     * 
     */
    @Import(name="bfdMinimumInterval")
    private @Nullable Output<Integer> bfdMinimumInterval;

    /**
     * @return when bfd_multiplier is configured alone. Default:
     *   * 1000 if `type`==`external`
     *   * 350 `type`==`internal`
     * 
     */
    public Optional<Output<Integer>> bfdMinimumInterval() {
        return Optional.ofNullable(this.bfdMinimumInterval);
    }

    /**
     * when bfd_minimum_interval_is_configured alone
     * 
     */
    @Import(name="bfdMultiplier")
    private @Nullable Output<Integer> bfdMultiplier;

    /**
     * @return when bfd_minimum_interval_is_configured alone
     * 
     */
    public Optional<Output<Integer>> bfdMultiplier() {
        return Optional.ofNullable(this.bfdMultiplier);
    }

    /**
     * BFD provides faster path failure detection and is enabled by default
     * 
     */
    @Import(name="disableBfd")
    private @Nullable Output<Boolean> disableBfd;

    /**
     * @return BFD provides faster path failure detection and is enabled by default
     * 
     */
    public Optional<Output<Boolean>> disableBfd() {
        return Optional.ofNullable(this.disableBfd);
    }

    @Import(name="export")
    private @Nullable Output<String> export;

    public Optional<Output<String>> export() {
        return Optional.ofNullable(this.export);
    }

    /**
     * default export policies if no per-neighbor policies defined
     * 
     */
    @Import(name="exportPolicy")
    private @Nullable Output<String> exportPolicy;

    /**
     * @return default export policies if no per-neighbor policies defined
     * 
     */
    public Optional<Output<String>> exportPolicy() {
        return Optional.ofNullable(this.exportPolicy);
    }

    /**
     * by default, either inet/net6 unicast depending on neighbor IP family (v4 or v6)
     * for v6 neighbors, to exchange v4 nexthop, which allows dual-stack support, enable this
     * 
     */
    @Import(name="extendedV4Nexthop")
    private @Nullable Output<Boolean> extendedV4Nexthop;

    /**
     * @return by default, either inet/net6 unicast depending on neighbor IP family (v4 or v6)
     * for v6 neighbors, to exchange v4 nexthop, which allows dual-stack support, enable this
     * 
     */
    public Optional<Output<Boolean>> extendedV4Nexthop() {
        return Optional.ofNullable(this.extendedV4Nexthop);
    }

    /**
     * `0` means disable
     * 
     */
    @Import(name="gracefulRestartTime")
    private @Nullable Output<Integer> gracefulRestartTime;

    /**
     * @return `0` means disable
     * 
     */
    public Optional<Output<Integer>> gracefulRestartTime() {
        return Optional.ofNullable(this.gracefulRestartTime);
    }

    @Import(name="holdTime")
    private @Nullable Output<Integer> holdTime;

    public Optional<Output<Integer>> holdTime() {
        return Optional.ofNullable(this.holdTime);
    }

    @Import(name="import")
    private @Nullable Output<String> import_;

    public Optional<Output<String>> import_() {
        return Optional.ofNullable(this.import_);
    }

    /**
     * default import policies if no per-neighbor policies defined
     * 
     */
    @Import(name="importPolicy")
    private @Nullable Output<String> importPolicy;

    /**
     * @return default import policies if no per-neighbor policies defined
     * 
     */
    public Optional<Output<String>> importPolicy() {
        return Optional.ofNullable(this.importPolicy);
    }

    @Import(name="localAs")
    private @Nullable Output<Integer> localAs;

    public Optional<Output<Integer>> localAs() {
        return Optional.ofNullable(this.localAs);
    }

    @Import(name="neighborAs")
    private @Nullable Output<Integer> neighborAs;

    public Optional<Output<Integer>> neighborAs() {
        return Optional.ofNullable(this.neighborAs);
    }

    /**
     * if per-neighbor as is desired. Property key is the neighbor address
     * 
     */
    @Import(name="neighbors")
    private @Nullable Output<Map<String,DeviceprofileGatewayBgpConfigNeighborsArgs>> neighbors;

    /**
     * @return if per-neighbor as is desired. Property key is the neighbor address
     * 
     */
    public Optional<Output<Map<String,DeviceprofileGatewayBgpConfigNeighborsArgs>>> neighbors() {
        return Optional.ofNullable(this.neighbors);
    }

    /**
     * if `type`!=`external`or `via`==`wan`networks where we expect BGP neighbor to connect to/from
     * 
     */
    @Import(name="networks")
    private @Nullable Output<List<String>> networks;

    /**
     * @return if `type`!=`external`or `via`==`wan`networks where we expect BGP neighbor to connect to/from
     * 
     */
    public Optional<Output<List<String>>> networks() {
        return Optional.ofNullable(this.networks);
    }

    /**
     * by default, we&#39;ll re-advertise all learned BGP routers toward overlay
     * 
     */
    @Import(name="noReadvertiseToOverlay")
    private @Nullable Output<Boolean> noReadvertiseToOverlay;

    /**
     * @return by default, we&#39;ll re-advertise all learned BGP routers toward overlay
     * 
     */
    public Optional<Output<Boolean>> noReadvertiseToOverlay() {
        return Optional.ofNullable(this.noReadvertiseToOverlay);
    }

    /**
     * if `type`==`tunnel`
     * 
     */
    @Import(name="tunnelName")
    private @Nullable Output<String> tunnelName;

    /**
     * @return if `type`==`tunnel`
     * 
     */
    public Optional<Output<String>> tunnelName() {
        return Optional.ofNullable(this.tunnelName);
    }

    /**
     * enum: `external`, `internal`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return enum: `external`, `internal`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * network name. enum: `lan`, `tunnel`, `vpn`, `wan`
     * 
     */
    @Import(name="via")
    private @Nullable Output<String> via;

    /**
     * @return network name. enum: `lan`, `tunnel`, `vpn`, `wan`
     * 
     */
    public Optional<Output<String>> via() {
        return Optional.ofNullable(this.via);
    }

    @Import(name="vpnName")
    private @Nullable Output<String> vpnName;

    public Optional<Output<String>> vpnName() {
        return Optional.ofNullable(this.vpnName);
    }

    /**
     * if `via`==`wan`
     * 
     */
    @Import(name="wanName")
    private @Nullable Output<String> wanName;

    /**
     * @return if `via`==`wan`
     * 
     */
    public Optional<Output<String>> wanName() {
        return Optional.ofNullable(this.wanName);
    }

    private DeviceprofileGatewayBgpConfigArgs() {}

    private DeviceprofileGatewayBgpConfigArgs(DeviceprofileGatewayBgpConfigArgs $) {
        this.authKey = $.authKey;
        this.bfdMinimumInterval = $.bfdMinimumInterval;
        this.bfdMultiplier = $.bfdMultiplier;
        this.disableBfd = $.disableBfd;
        this.export = $.export;
        this.exportPolicy = $.exportPolicy;
        this.extendedV4Nexthop = $.extendedV4Nexthop;
        this.gracefulRestartTime = $.gracefulRestartTime;
        this.holdTime = $.holdTime;
        this.import_ = $.import_;
        this.importPolicy = $.importPolicy;
        this.localAs = $.localAs;
        this.neighborAs = $.neighborAs;
        this.neighbors = $.neighbors;
        this.networks = $.networks;
        this.noReadvertiseToOverlay = $.noReadvertiseToOverlay;
        this.tunnelName = $.tunnelName;
        this.type = $.type;
        this.via = $.via;
        this.vpnName = $.vpnName;
        this.wanName = $.wanName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileGatewayBgpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileGatewayBgpConfigArgs $;

        public Builder() {
            $ = new DeviceprofileGatewayBgpConfigArgs();
        }

        public Builder(DeviceprofileGatewayBgpConfigArgs defaults) {
            $ = new DeviceprofileGatewayBgpConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder authKey(@Nullable Output<String> authKey) {
            $.authKey = authKey;
            return this;
        }

        public Builder authKey(String authKey) {
            return authKey(Output.of(authKey));
        }

        /**
         * @param bfdMinimumInterval when bfd_multiplier is configured alone. Default:
         *   * 1000 if `type`==`external`
         *   * 350 `type`==`internal`
         * 
         * @return builder
         * 
         */
        public Builder bfdMinimumInterval(@Nullable Output<Integer> bfdMinimumInterval) {
            $.bfdMinimumInterval = bfdMinimumInterval;
            return this;
        }

        /**
         * @param bfdMinimumInterval when bfd_multiplier is configured alone. Default:
         *   * 1000 if `type`==`external`
         *   * 350 `type`==`internal`
         * 
         * @return builder
         * 
         */
        public Builder bfdMinimumInterval(Integer bfdMinimumInterval) {
            return bfdMinimumInterval(Output.of(bfdMinimumInterval));
        }

        /**
         * @param bfdMultiplier when bfd_minimum_interval_is_configured alone
         * 
         * @return builder
         * 
         */
        public Builder bfdMultiplier(@Nullable Output<Integer> bfdMultiplier) {
            $.bfdMultiplier = bfdMultiplier;
            return this;
        }

        /**
         * @param bfdMultiplier when bfd_minimum_interval_is_configured alone
         * 
         * @return builder
         * 
         */
        public Builder bfdMultiplier(Integer bfdMultiplier) {
            return bfdMultiplier(Output.of(bfdMultiplier));
        }

        /**
         * @param disableBfd BFD provides faster path failure detection and is enabled by default
         * 
         * @return builder
         * 
         */
        public Builder disableBfd(@Nullable Output<Boolean> disableBfd) {
            $.disableBfd = disableBfd;
            return this;
        }

        /**
         * @param disableBfd BFD provides faster path failure detection and is enabled by default
         * 
         * @return builder
         * 
         */
        public Builder disableBfd(Boolean disableBfd) {
            return disableBfd(Output.of(disableBfd));
        }

        public Builder export(@Nullable Output<String> export) {
            $.export = export;
            return this;
        }

        public Builder export(String export) {
            return export(Output.of(export));
        }

        /**
         * @param exportPolicy default export policies if no per-neighbor policies defined
         * 
         * @return builder
         * 
         */
        public Builder exportPolicy(@Nullable Output<String> exportPolicy) {
            $.exportPolicy = exportPolicy;
            return this;
        }

        /**
         * @param exportPolicy default export policies if no per-neighbor policies defined
         * 
         * @return builder
         * 
         */
        public Builder exportPolicy(String exportPolicy) {
            return exportPolicy(Output.of(exportPolicy));
        }

        /**
         * @param extendedV4Nexthop by default, either inet/net6 unicast depending on neighbor IP family (v4 or v6)
         * for v6 neighbors, to exchange v4 nexthop, which allows dual-stack support, enable this
         * 
         * @return builder
         * 
         */
        public Builder extendedV4Nexthop(@Nullable Output<Boolean> extendedV4Nexthop) {
            $.extendedV4Nexthop = extendedV4Nexthop;
            return this;
        }

        /**
         * @param extendedV4Nexthop by default, either inet/net6 unicast depending on neighbor IP family (v4 or v6)
         * for v6 neighbors, to exchange v4 nexthop, which allows dual-stack support, enable this
         * 
         * @return builder
         * 
         */
        public Builder extendedV4Nexthop(Boolean extendedV4Nexthop) {
            return extendedV4Nexthop(Output.of(extendedV4Nexthop));
        }

        /**
         * @param gracefulRestartTime `0` means disable
         * 
         * @return builder
         * 
         */
        public Builder gracefulRestartTime(@Nullable Output<Integer> gracefulRestartTime) {
            $.gracefulRestartTime = gracefulRestartTime;
            return this;
        }

        /**
         * @param gracefulRestartTime `0` means disable
         * 
         * @return builder
         * 
         */
        public Builder gracefulRestartTime(Integer gracefulRestartTime) {
            return gracefulRestartTime(Output.of(gracefulRestartTime));
        }

        public Builder holdTime(@Nullable Output<Integer> holdTime) {
            $.holdTime = holdTime;
            return this;
        }

        public Builder holdTime(Integer holdTime) {
            return holdTime(Output.of(holdTime));
        }

        public Builder import_(@Nullable Output<String> import_) {
            $.import_ = import_;
            return this;
        }

        public Builder import_(String import_) {
            return import_(Output.of(import_));
        }

        /**
         * @param importPolicy default import policies if no per-neighbor policies defined
         * 
         * @return builder
         * 
         */
        public Builder importPolicy(@Nullable Output<String> importPolicy) {
            $.importPolicy = importPolicy;
            return this;
        }

        /**
         * @param importPolicy default import policies if no per-neighbor policies defined
         * 
         * @return builder
         * 
         */
        public Builder importPolicy(String importPolicy) {
            return importPolicy(Output.of(importPolicy));
        }

        public Builder localAs(@Nullable Output<Integer> localAs) {
            $.localAs = localAs;
            return this;
        }

        public Builder localAs(Integer localAs) {
            return localAs(Output.of(localAs));
        }

        public Builder neighborAs(@Nullable Output<Integer> neighborAs) {
            $.neighborAs = neighborAs;
            return this;
        }

        public Builder neighborAs(Integer neighborAs) {
            return neighborAs(Output.of(neighborAs));
        }

        /**
         * @param neighbors if per-neighbor as is desired. Property key is the neighbor address
         * 
         * @return builder
         * 
         */
        public Builder neighbors(@Nullable Output<Map<String,DeviceprofileGatewayBgpConfigNeighborsArgs>> neighbors) {
            $.neighbors = neighbors;
            return this;
        }

        /**
         * @param neighbors if per-neighbor as is desired. Property key is the neighbor address
         * 
         * @return builder
         * 
         */
        public Builder neighbors(Map<String,DeviceprofileGatewayBgpConfigNeighborsArgs> neighbors) {
            return neighbors(Output.of(neighbors));
        }

        /**
         * @param networks if `type`!=`external`or `via`==`wan`networks where we expect BGP neighbor to connect to/from
         * 
         * @return builder
         * 
         */
        public Builder networks(@Nullable Output<List<String>> networks) {
            $.networks = networks;
            return this;
        }

        /**
         * @param networks if `type`!=`external`or `via`==`wan`networks where we expect BGP neighbor to connect to/from
         * 
         * @return builder
         * 
         */
        public Builder networks(List<String> networks) {
            return networks(Output.of(networks));
        }

        /**
         * @param networks if `type`!=`external`or `via`==`wan`networks where we expect BGP neighbor to connect to/from
         * 
         * @return builder
         * 
         */
        public Builder networks(String... networks) {
            return networks(List.of(networks));
        }

        /**
         * @param noReadvertiseToOverlay by default, we&#39;ll re-advertise all learned BGP routers toward overlay
         * 
         * @return builder
         * 
         */
        public Builder noReadvertiseToOverlay(@Nullable Output<Boolean> noReadvertiseToOverlay) {
            $.noReadvertiseToOverlay = noReadvertiseToOverlay;
            return this;
        }

        /**
         * @param noReadvertiseToOverlay by default, we&#39;ll re-advertise all learned BGP routers toward overlay
         * 
         * @return builder
         * 
         */
        public Builder noReadvertiseToOverlay(Boolean noReadvertiseToOverlay) {
            return noReadvertiseToOverlay(Output.of(noReadvertiseToOverlay));
        }

        /**
         * @param tunnelName if `type`==`tunnel`
         * 
         * @return builder
         * 
         */
        public Builder tunnelName(@Nullable Output<String> tunnelName) {
            $.tunnelName = tunnelName;
            return this;
        }

        /**
         * @param tunnelName if `type`==`tunnel`
         * 
         * @return builder
         * 
         */
        public Builder tunnelName(String tunnelName) {
            return tunnelName(Output.of(tunnelName));
        }

        /**
         * @param type enum: `external`, `internal`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type enum: `external`, `internal`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param via network name. enum: `lan`, `tunnel`, `vpn`, `wan`
         * 
         * @return builder
         * 
         */
        public Builder via(@Nullable Output<String> via) {
            $.via = via;
            return this;
        }

        /**
         * @param via network name. enum: `lan`, `tunnel`, `vpn`, `wan`
         * 
         * @return builder
         * 
         */
        public Builder via(String via) {
            return via(Output.of(via));
        }

        public Builder vpnName(@Nullable Output<String> vpnName) {
            $.vpnName = vpnName;
            return this;
        }

        public Builder vpnName(String vpnName) {
            return vpnName(Output.of(vpnName));
        }

        /**
         * @param wanName if `via`==`wan`
         * 
         * @return builder
         * 
         */
        public Builder wanName(@Nullable Output<String> wanName) {
            $.wanName = wanName;
            return this;
        }

        /**
         * @param wanName if `via`==`wan`
         * 
         * @return builder
         * 
         */
        public Builder wanName(String wanName) {
            return wanName(Output.of(wanName));
        }

        public DeviceprofileGatewayBgpConfigArgs build() {
            return $;
        }
    }

}
