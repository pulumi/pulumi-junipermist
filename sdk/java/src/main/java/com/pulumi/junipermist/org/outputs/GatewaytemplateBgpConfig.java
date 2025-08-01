// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.outputs.GatewaytemplateBgpConfigNeighbors;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewaytemplateBgpConfig {
    /**
     * @return Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`
     * 
     */
    private @Nullable String authKey;
    /**
     * @return Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`, when bfd_multiplier is configured alone. Default:
     *   * 1000 if `type`==`external`
     *   * 350 `type`==`internal`
     * 
     */
    private @Nullable Integer bfdMinimumInterval;
    /**
     * @return Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`, when bfd_minimum_interval_is_configured alone
     * 
     */
    private @Nullable Integer bfdMultiplier;
    /**
     * @return Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. BFD provides faster path failure detection and is enabled by default
     * 
     */
    private @Nullable Boolean disableBfd;
    private @Nullable String export;
    /**
     * @return Default export policies if no per-neighbor policies defined
     * 
     */
    private @Nullable String exportPolicy;
    /**
     * @return Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. By default, either inet/net6 unicast depending on neighbor IP family (v4 or v6). For v6 neighbors, to exchange v4 nexthop, which allows dual-stack support, enable this
     * 
     */
    private @Nullable Boolean extendedV4Nexthop;
    /**
     * @return Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. `0` means disable
     * 
     */
    private @Nullable Integer gracefulRestartTime;
    /**
     * @return Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. Default is 90.
     * 
     */
    private @Nullable Integer holdTime;
    private @Nullable String import_;
    /**
     * @return Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. Default import policies if no per-neighbor policies defined
     * 
     */
    private @Nullable String importPolicy;
    /**
     * @return Required if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. BGPLocal AS. Value must be in range 1-4294967295 or a variable (e.g. `{{as_variable}}`)
     * 
     */
    private @Nullable String localAs;
    /**
     * @return Neighbor AS. If `type`==`internal`, must be equal to `local_as`. Value must be in range 1-4294967295 or a variable (e.g. `{{as_variable}}`)
     * 
     */
    private @Nullable String neighborAs;
    /**
     * @return Required if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. If per-neighbor as is desired. Property key is the neighbor address
     * 
     */
    private @Nullable Map<String,GatewaytemplateBgpConfigNeighbors> neighbors;
    /**
     * @return Optional if `via`==`lan`. List of networks where we expect BGP neighbor to connect to/from
     * 
     */
    private @Nullable List<String> networks;
    /**
     * @return Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. If true, we will not advertise private ASNs (AS 64512-65534) to this neighbor
     * 
     */
    private @Nullable Boolean noPrivateAs;
    /**
     * @return Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. By default, we&#39;ll re-advertise all learned BGP routers toward overlay
     * 
     */
    private @Nullable Boolean noReadvertiseToOverlay;
    /**
     * @return Optional if `via`==`tunnel`
     * 
     */
    private @Nullable String tunnelName;
    /**
     * @return Required if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. enum: `external`, `internal`
     * 
     */
    private @Nullable String type;
    /**
     * @return enum: `lan`, `tunnel`, `vpn`, `wan`
     * 
     */
    private String via;
    /**
     * @return Optional if `via`==`vpn`
     * 
     */
    private @Nullable String vpnName;
    /**
     * @return Optional if `via`==`wan`
     * 
     */
    private @Nullable String wanName;

    private GatewaytemplateBgpConfig() {}
    /**
     * @return Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`
     * 
     */
    public Optional<String> authKey() {
        return Optional.ofNullable(this.authKey);
    }
    /**
     * @return Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`, when bfd_multiplier is configured alone. Default:
     *   * 1000 if `type`==`external`
     *   * 350 `type`==`internal`
     * 
     */
    public Optional<Integer> bfdMinimumInterval() {
        return Optional.ofNullable(this.bfdMinimumInterval);
    }
    /**
     * @return Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`, when bfd_minimum_interval_is_configured alone
     * 
     */
    public Optional<Integer> bfdMultiplier() {
        return Optional.ofNullable(this.bfdMultiplier);
    }
    /**
     * @return Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. BFD provides faster path failure detection and is enabled by default
     * 
     */
    public Optional<Boolean> disableBfd() {
        return Optional.ofNullable(this.disableBfd);
    }
    public Optional<String> export() {
        return Optional.ofNullable(this.export);
    }
    /**
     * @return Default export policies if no per-neighbor policies defined
     * 
     */
    public Optional<String> exportPolicy() {
        return Optional.ofNullable(this.exportPolicy);
    }
    /**
     * @return Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. By default, either inet/net6 unicast depending on neighbor IP family (v4 or v6). For v6 neighbors, to exchange v4 nexthop, which allows dual-stack support, enable this
     * 
     */
    public Optional<Boolean> extendedV4Nexthop() {
        return Optional.ofNullable(this.extendedV4Nexthop);
    }
    /**
     * @return Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. `0` means disable
     * 
     */
    public Optional<Integer> gracefulRestartTime() {
        return Optional.ofNullable(this.gracefulRestartTime);
    }
    /**
     * @return Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. Default is 90.
     * 
     */
    public Optional<Integer> holdTime() {
        return Optional.ofNullable(this.holdTime);
    }
    public Optional<String> import_() {
        return Optional.ofNullable(this.import_);
    }
    /**
     * @return Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. Default import policies if no per-neighbor policies defined
     * 
     */
    public Optional<String> importPolicy() {
        return Optional.ofNullable(this.importPolicy);
    }
    /**
     * @return Required if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. BGPLocal AS. Value must be in range 1-4294967295 or a variable (e.g. `{{as_variable}}`)
     * 
     */
    public Optional<String> localAs() {
        return Optional.ofNullable(this.localAs);
    }
    /**
     * @return Neighbor AS. If `type`==`internal`, must be equal to `local_as`. Value must be in range 1-4294967295 or a variable (e.g. `{{as_variable}}`)
     * 
     */
    public Optional<String> neighborAs() {
        return Optional.ofNullable(this.neighborAs);
    }
    /**
     * @return Required if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. If per-neighbor as is desired. Property key is the neighbor address
     * 
     */
    public Map<String,GatewaytemplateBgpConfigNeighbors> neighbors() {
        return this.neighbors == null ? Map.of() : this.neighbors;
    }
    /**
     * @return Optional if `via`==`lan`. List of networks where we expect BGP neighbor to connect to/from
     * 
     */
    public List<String> networks() {
        return this.networks == null ? List.of() : this.networks;
    }
    /**
     * @return Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. If true, we will not advertise private ASNs (AS 64512-65534) to this neighbor
     * 
     */
    public Optional<Boolean> noPrivateAs() {
        return Optional.ofNullable(this.noPrivateAs);
    }
    /**
     * @return Optional if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. By default, we&#39;ll re-advertise all learned BGP routers toward overlay
     * 
     */
    public Optional<Boolean> noReadvertiseToOverlay() {
        return Optional.ofNullable(this.noReadvertiseToOverlay);
    }
    /**
     * @return Optional if `via`==`tunnel`
     * 
     */
    public Optional<String> tunnelName() {
        return Optional.ofNullable(this.tunnelName);
    }
    /**
     * @return Required if `via`==`lan`, `via`==`tunnel` or `via`==`wan`. enum: `external`, `internal`
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return enum: `lan`, `tunnel`, `vpn`, `wan`
     * 
     */
    public String via() {
        return this.via;
    }
    /**
     * @return Optional if `via`==`vpn`
     * 
     */
    public Optional<String> vpnName() {
        return Optional.ofNullable(this.vpnName);
    }
    /**
     * @return Optional if `via`==`wan`
     * 
     */
    public Optional<String> wanName() {
        return Optional.ofNullable(this.wanName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewaytemplateBgpConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String authKey;
        private @Nullable Integer bfdMinimumInterval;
        private @Nullable Integer bfdMultiplier;
        private @Nullable Boolean disableBfd;
        private @Nullable String export;
        private @Nullable String exportPolicy;
        private @Nullable Boolean extendedV4Nexthop;
        private @Nullable Integer gracefulRestartTime;
        private @Nullable Integer holdTime;
        private @Nullable String import_;
        private @Nullable String importPolicy;
        private @Nullable String localAs;
        private @Nullable String neighborAs;
        private @Nullable Map<String,GatewaytemplateBgpConfigNeighbors> neighbors;
        private @Nullable List<String> networks;
        private @Nullable Boolean noPrivateAs;
        private @Nullable Boolean noReadvertiseToOverlay;
        private @Nullable String tunnelName;
        private @Nullable String type;
        private String via;
        private @Nullable String vpnName;
        private @Nullable String wanName;
        public Builder() {}
        public Builder(GatewaytemplateBgpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authKey = defaults.authKey;
    	      this.bfdMinimumInterval = defaults.bfdMinimumInterval;
    	      this.bfdMultiplier = defaults.bfdMultiplier;
    	      this.disableBfd = defaults.disableBfd;
    	      this.export = defaults.export;
    	      this.exportPolicy = defaults.exportPolicy;
    	      this.extendedV4Nexthop = defaults.extendedV4Nexthop;
    	      this.gracefulRestartTime = defaults.gracefulRestartTime;
    	      this.holdTime = defaults.holdTime;
    	      this.import_ = defaults.import_;
    	      this.importPolicy = defaults.importPolicy;
    	      this.localAs = defaults.localAs;
    	      this.neighborAs = defaults.neighborAs;
    	      this.neighbors = defaults.neighbors;
    	      this.networks = defaults.networks;
    	      this.noPrivateAs = defaults.noPrivateAs;
    	      this.noReadvertiseToOverlay = defaults.noReadvertiseToOverlay;
    	      this.tunnelName = defaults.tunnelName;
    	      this.type = defaults.type;
    	      this.via = defaults.via;
    	      this.vpnName = defaults.vpnName;
    	      this.wanName = defaults.wanName;
        }

        @CustomType.Setter
        public Builder authKey(@Nullable String authKey) {

            this.authKey = authKey;
            return this;
        }
        @CustomType.Setter
        public Builder bfdMinimumInterval(@Nullable Integer bfdMinimumInterval) {

            this.bfdMinimumInterval = bfdMinimumInterval;
            return this;
        }
        @CustomType.Setter
        public Builder bfdMultiplier(@Nullable Integer bfdMultiplier) {

            this.bfdMultiplier = bfdMultiplier;
            return this;
        }
        @CustomType.Setter
        public Builder disableBfd(@Nullable Boolean disableBfd) {

            this.disableBfd = disableBfd;
            return this;
        }
        @CustomType.Setter
        public Builder export(@Nullable String export) {

            this.export = export;
            return this;
        }
        @CustomType.Setter
        public Builder exportPolicy(@Nullable String exportPolicy) {

            this.exportPolicy = exportPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder extendedV4Nexthop(@Nullable Boolean extendedV4Nexthop) {

            this.extendedV4Nexthop = extendedV4Nexthop;
            return this;
        }
        @CustomType.Setter
        public Builder gracefulRestartTime(@Nullable Integer gracefulRestartTime) {

            this.gracefulRestartTime = gracefulRestartTime;
            return this;
        }
        @CustomType.Setter
        public Builder holdTime(@Nullable Integer holdTime) {

            this.holdTime = holdTime;
            return this;
        }
        @CustomType.Setter("import")
        public Builder import_(@Nullable String import_) {

            this.import_ = import_;
            return this;
        }
        @CustomType.Setter
        public Builder importPolicy(@Nullable String importPolicy) {

            this.importPolicy = importPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder localAs(@Nullable String localAs) {

            this.localAs = localAs;
            return this;
        }
        @CustomType.Setter
        public Builder neighborAs(@Nullable String neighborAs) {

            this.neighborAs = neighborAs;
            return this;
        }
        @CustomType.Setter
        public Builder neighbors(@Nullable Map<String,GatewaytemplateBgpConfigNeighbors> neighbors) {

            this.neighbors = neighbors;
            return this;
        }
        @CustomType.Setter
        public Builder networks(@Nullable List<String> networks) {

            this.networks = networks;
            return this;
        }
        public Builder networks(String... networks) {
            return networks(List.of(networks));
        }
        @CustomType.Setter
        public Builder noPrivateAs(@Nullable Boolean noPrivateAs) {

            this.noPrivateAs = noPrivateAs;
            return this;
        }
        @CustomType.Setter
        public Builder noReadvertiseToOverlay(@Nullable Boolean noReadvertiseToOverlay) {

            this.noReadvertiseToOverlay = noReadvertiseToOverlay;
            return this;
        }
        @CustomType.Setter
        public Builder tunnelName(@Nullable String tunnelName) {

            this.tunnelName = tunnelName;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder via(String via) {
            if (via == null) {
              throw new MissingRequiredPropertyException("GatewaytemplateBgpConfig", "via");
            }
            this.via = via;
            return this;
        }
        @CustomType.Setter
        public Builder vpnName(@Nullable String vpnName) {

            this.vpnName = vpnName;
            return this;
        }
        @CustomType.Setter
        public Builder wanName(@Nullable String wanName) {

            this.wanName = wanName;
            return this;
        }
        public GatewaytemplateBgpConfig build() {
            final var _resultValue = new GatewaytemplateBgpConfig();
            _resultValue.authKey = authKey;
            _resultValue.bfdMinimumInterval = bfdMinimumInterval;
            _resultValue.bfdMultiplier = bfdMultiplier;
            _resultValue.disableBfd = disableBfd;
            _resultValue.export = export;
            _resultValue.exportPolicy = exportPolicy;
            _resultValue.extendedV4Nexthop = extendedV4Nexthop;
            _resultValue.gracefulRestartTime = gracefulRestartTime;
            _resultValue.holdTime = holdTime;
            _resultValue.import_ = import_;
            _resultValue.importPolicy = importPolicy;
            _resultValue.localAs = localAs;
            _resultValue.neighborAs = neighborAs;
            _resultValue.neighbors = neighbors;
            _resultValue.networks = networks;
            _resultValue.noPrivateAs = noPrivateAs;
            _resultValue.noReadvertiseToOverlay = noReadvertiseToOverlay;
            _resultValue.tunnelName = tunnelName;
            _resultValue.type = type;
            _resultValue.via = via;
            _resultValue.vpnName = vpnName;
            _resultValue.wanName = wanName;
            return _resultValue;
        }
    }
}
