// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EvpnTopologyEvpnOptionsUnderlayArgs extends com.pulumi.resources.ResourceArgs {

    public static final EvpnTopologyEvpnOptionsUnderlayArgs Empty = new EvpnTopologyEvpnOptionsUnderlayArgs();

    /**
     * Underlay BGP Base AS Number
     * 
     */
    @Import(name="asBase")
    private @Nullable Output<Integer> asBase;

    /**
     * @return Underlay BGP Base AS Number
     * 
     */
    public Optional<Output<Integer>> asBase() {
        return Optional.ofNullable(this.asBase);
    }

    @Import(name="routedIdPrefix")
    private @Nullable Output<String> routedIdPrefix;

    public Optional<Output<String>> routedIdPrefix() {
        return Optional.ofNullable(this.routedIdPrefix);
    }

    /**
     * underlay subnet, by default, `10.255.240.0/20`, or `fd31:5700::/64` for ipv6
     * 
     */
    @Import(name="subnet")
    private @Nullable Output<String> subnet;

    /**
     * @return underlay subnet, by default, `10.255.240.0/20`, or `fd31:5700::/64` for ipv6
     * 
     */
    public Optional<Output<String>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    /**
     * if v6 is desired for underlay
     * 
     */
    @Import(name="useIpv6")
    private @Nullable Output<Boolean> useIpv6;

    /**
     * @return if v6 is desired for underlay
     * 
     */
    public Optional<Output<Boolean>> useIpv6() {
        return Optional.ofNullable(this.useIpv6);
    }

    private EvpnTopologyEvpnOptionsUnderlayArgs() {}

    private EvpnTopologyEvpnOptionsUnderlayArgs(EvpnTopologyEvpnOptionsUnderlayArgs $) {
        this.asBase = $.asBase;
        this.routedIdPrefix = $.routedIdPrefix;
        this.subnet = $.subnet;
        this.useIpv6 = $.useIpv6;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EvpnTopologyEvpnOptionsUnderlayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EvpnTopologyEvpnOptionsUnderlayArgs $;

        public Builder() {
            $ = new EvpnTopologyEvpnOptionsUnderlayArgs();
        }

        public Builder(EvpnTopologyEvpnOptionsUnderlayArgs defaults) {
            $ = new EvpnTopologyEvpnOptionsUnderlayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param asBase Underlay BGP Base AS Number
         * 
         * @return builder
         * 
         */
        public Builder asBase(@Nullable Output<Integer> asBase) {
            $.asBase = asBase;
            return this;
        }

        /**
         * @param asBase Underlay BGP Base AS Number
         * 
         * @return builder
         * 
         */
        public Builder asBase(Integer asBase) {
            return asBase(Output.of(asBase));
        }

        public Builder routedIdPrefix(@Nullable Output<String> routedIdPrefix) {
            $.routedIdPrefix = routedIdPrefix;
            return this;
        }

        public Builder routedIdPrefix(String routedIdPrefix) {
            return routedIdPrefix(Output.of(routedIdPrefix));
        }

        /**
         * @param subnet underlay subnet, by default, `10.255.240.0/20`, or `fd31:5700::/64` for ipv6
         * 
         * @return builder
         * 
         */
        public Builder subnet(@Nullable Output<String> subnet) {
            $.subnet = subnet;
            return this;
        }

        /**
         * @param subnet underlay subnet, by default, `10.255.240.0/20`, or `fd31:5700::/64` for ipv6
         * 
         * @return builder
         * 
         */
        public Builder subnet(String subnet) {
            return subnet(Output.of(subnet));
        }

        /**
         * @param useIpv6 if v6 is desired for underlay
         * 
         * @return builder
         * 
         */
        public Builder useIpv6(@Nullable Output<Boolean> useIpv6) {
            $.useIpv6 = useIpv6;
            return this;
        }

        /**
         * @param useIpv6 if v6 is desired for underlay
         * 
         * @return builder
         * 
         */
        public Builder useIpv6(Boolean useIpv6) {
            return useIpv6(Output.of(useIpv6));
        }

        public EvpnTopologyEvpnOptionsUnderlayArgs build() {
            return $;
        }
    }

}