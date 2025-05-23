// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EvpnTopologyEvpnOptionsUnderlay {
    /**
     * @return Underlay BGP Base AS Number
     * 
     */
    private @Nullable Integer asBase;
    private @Nullable String routedIdPrefix;
    /**
     * @return Underlay subnet, by default, `10.255.240.0/20`, or `fd31:5700::/64` for ipv6
     * 
     */
    private @Nullable String subnet;
    /**
     * @return If v6 is desired for underlay
     * 
     */
    private @Nullable Boolean useIpv6;

    private EvpnTopologyEvpnOptionsUnderlay() {}
    /**
     * @return Underlay BGP Base AS Number
     * 
     */
    public Optional<Integer> asBase() {
        return Optional.ofNullable(this.asBase);
    }
    public Optional<String> routedIdPrefix() {
        return Optional.ofNullable(this.routedIdPrefix);
    }
    /**
     * @return Underlay subnet, by default, `10.255.240.0/20`, or `fd31:5700::/64` for ipv6
     * 
     */
    public Optional<String> subnet() {
        return Optional.ofNullable(this.subnet);
    }
    /**
     * @return If v6 is desired for underlay
     * 
     */
    public Optional<Boolean> useIpv6() {
        return Optional.ofNullable(this.useIpv6);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EvpnTopologyEvpnOptionsUnderlay defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer asBase;
        private @Nullable String routedIdPrefix;
        private @Nullable String subnet;
        private @Nullable Boolean useIpv6;
        public Builder() {}
        public Builder(EvpnTopologyEvpnOptionsUnderlay defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asBase = defaults.asBase;
    	      this.routedIdPrefix = defaults.routedIdPrefix;
    	      this.subnet = defaults.subnet;
    	      this.useIpv6 = defaults.useIpv6;
        }

        @CustomType.Setter
        public Builder asBase(@Nullable Integer asBase) {

            this.asBase = asBase;
            return this;
        }
        @CustomType.Setter
        public Builder routedIdPrefix(@Nullable String routedIdPrefix) {

            this.routedIdPrefix = routedIdPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder subnet(@Nullable String subnet) {

            this.subnet = subnet;
            return this;
        }
        @CustomType.Setter
        public Builder useIpv6(@Nullable Boolean useIpv6) {

            this.useIpv6 = useIpv6;
            return this;
        }
        public EvpnTopologyEvpnOptionsUnderlay build() {
            final var _resultValue = new EvpnTopologyEvpnOptionsUnderlay();
            _resultValue.asBase = asBase;
            _resultValue.routedIdPrefix = routedIdPrefix;
            _resultValue.subnet = subnet;
            _resultValue.useIpv6 = useIpv6;
            return _resultValue;
        }
    }
}
