// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.device.inputs.GatewayTunnelProviderOptionsZscalerSubLocationArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayTunnelProviderOptionsZscalerArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayTunnelProviderOptionsZscalerArgs Empty = new GatewayTunnelProviderOptionsZscalerArgs();

    @Import(name="aupBlockInternetUntilAccepted")
    private @Nullable Output<Boolean> aupBlockInternetUntilAccepted;

    public Optional<Output<Boolean>> aupBlockInternetUntilAccepted() {
        return Optional.ofNullable(this.aupBlockInternetUntilAccepted);
    }

    /**
     * Can only be `true` when `auth_required`==`false`, display Acceptable Use Policy (AUP)
     * 
     */
    @Import(name="aupEnabled")
    private @Nullable Output<Boolean> aupEnabled;

    /**
     * @return Can only be `true` when `auth_required`==`false`, display Acceptable Use Policy (AUP)
     * 
     */
    public Optional<Output<Boolean>> aupEnabled() {
        return Optional.ofNullable(this.aupEnabled);
    }

    /**
     * Proxy HTTPs traffic, requiring Zscaler cert to be installed in browser
     * 
     */
    @Import(name="aupForceSslInspection")
    private @Nullable Output<Boolean> aupForceSslInspection;

    /**
     * @return Proxy HTTPs traffic, requiring Zscaler cert to be installed in browser
     * 
     */
    public Optional<Output<Boolean>> aupForceSslInspection() {
        return Optional.ofNullable(this.aupForceSslInspection);
    }

    /**
     * Required if `aup_enabled`==`true`. Days before AUP is requested again
     * 
     */
    @Import(name="aupTimeoutInDays")
    private @Nullable Output<Integer> aupTimeoutInDays;

    /**
     * @return Required if `aup_enabled`==`true`. Days before AUP is requested again
     * 
     */
    public Optional<Output<Integer>> aupTimeoutInDays() {
        return Optional.ofNullable(this.aupTimeoutInDays);
    }

    /**
     * Enable this option to enforce user authentication
     * 
     */
    @Import(name="authRequired")
    private @Nullable Output<Boolean> authRequired;

    /**
     * @return Enable this option to enforce user authentication
     * 
     */
    public Optional<Output<Boolean>> authRequired() {
        return Optional.ofNullable(this.authRequired);
    }

    /**
     * Can only be `true` when `auth_required`==`false`, display caution notification for non-authenticated users
     * 
     */
    @Import(name="cautionEnabled")
    private @Nullable Output<Boolean> cautionEnabled;

    /**
     * @return Can only be `true` when `auth_required`==`false`, display caution notification for non-authenticated users
     * 
     */
    public Optional<Output<Boolean>> cautionEnabled() {
        return Optional.ofNullable(this.cautionEnabled);
    }

    /**
     * Download bandwidth cap of the link, in Mbps. Disabled if not set
     * 
     */
    @Import(name="dnBandwidth")
    private @Nullable Output<Double> dnBandwidth;

    /**
     * @return Download bandwidth cap of the link, in Mbps. Disabled if not set
     * 
     */
    public Optional<Output<Double>> dnBandwidth() {
        return Optional.ofNullable(this.dnBandwidth);
    }

    /**
     * Required if `surrogate_IP`==`true`, idle Time to Disassociation
     * 
     */
    @Import(name="idleTimeInMinutes")
    private @Nullable Output<Integer> idleTimeInMinutes;

    /**
     * @return Required if `surrogate_IP`==`true`, idle Time to Disassociation
     * 
     */
    public Optional<Output<Integer>> idleTimeInMinutes() {
        return Optional.ofNullable(this.idleTimeInMinutes);
    }

    /**
     * If `true`, enable the firewall control option
     * 
     */
    @Import(name="ofwEnabled")
    private @Nullable Output<Boolean> ofwEnabled;

    /**
     * @return If `true`, enable the firewall control option
     * 
     */
    public Optional<Output<Boolean>> ofwEnabled() {
        return Optional.ofNullable(this.ofwEnabled);
    }

    /**
     * `sub-locations` can be used for specific uses cases to define different configuration based on the user network
     * 
     */
    @Import(name="subLocations")
    private @Nullable Output<List<GatewayTunnelProviderOptionsZscalerSubLocationArgs>> subLocations;

    /**
     * @return `sub-locations` can be used for specific uses cases to define different configuration based on the user network
     * 
     */
    public Optional<Output<List<GatewayTunnelProviderOptionsZscalerSubLocationArgs>>> subLocations() {
        return Optional.ofNullable(this.subLocations);
    }

    /**
     * Can only be `true` when `auth_required`==`true`. Map a user to a private IP address so it applies the user&#39;s policies, instead of the location&#39;s policies
     * 
     */
    @Import(name="surrogateIp")
    private @Nullable Output<Boolean> surrogateIp;

    /**
     * @return Can only be `true` when `auth_required`==`true`. Map a user to a private IP address so it applies the user&#39;s policies, instead of the location&#39;s policies
     * 
     */
    public Optional<Output<Boolean>> surrogateIp() {
        return Optional.ofNullable(this.surrogateIp);
    }

    /**
     * Can only be `true` when `surrogate_IP`==`true`, enforce surrogate IP for known browsers
     * 
     */
    @Import(name="surrogateIpEnforcedForKnownBrowsers")
    private @Nullable Output<Boolean> surrogateIpEnforcedForKnownBrowsers;

    /**
     * @return Can only be `true` when `surrogate_IP`==`true`, enforce surrogate IP for known browsers
     * 
     */
    public Optional<Output<Boolean>> surrogateIpEnforcedForKnownBrowsers() {
        return Optional.ofNullable(this.surrogateIpEnforcedForKnownBrowsers);
    }

    /**
     * Required if `surrogate_IP_enforced_for_known_browsers`==`true`, must be lower or equal than `idle_time_in_minutes`, refresh Time for re-validation of Surrogacy
     * 
     */
    @Import(name="surrogateRefreshTimeInMinutes")
    private @Nullable Output<Integer> surrogateRefreshTimeInMinutes;

    /**
     * @return Required if `surrogate_IP_enforced_for_known_browsers`==`true`, must be lower or equal than `idle_time_in_minutes`, refresh Time for re-validation of Surrogacy
     * 
     */
    public Optional<Output<Integer>> surrogateRefreshTimeInMinutes() {
        return Optional.ofNullable(this.surrogateRefreshTimeInMinutes);
    }

    /**
     * Download bandwidth cap of the link, in Mbps. Disabled if not set
     * 
     */
    @Import(name="upBandwidth")
    private @Nullable Output<Double> upBandwidth;

    /**
     * @return Download bandwidth cap of the link, in Mbps. Disabled if not set
     * 
     */
    public Optional<Output<Double>> upBandwidth() {
        return Optional.ofNullable(this.upBandwidth);
    }

    /**
     * Location uses proxy chaining to forward traffic
     * 
     */
    @Import(name="xffForwardEnabled")
    private @Nullable Output<Boolean> xffForwardEnabled;

    /**
     * @return Location uses proxy chaining to forward traffic
     * 
     */
    public Optional<Output<Boolean>> xffForwardEnabled() {
        return Optional.ofNullable(this.xffForwardEnabled);
    }

    private GatewayTunnelProviderOptionsZscalerArgs() {}

    private GatewayTunnelProviderOptionsZscalerArgs(GatewayTunnelProviderOptionsZscalerArgs $) {
        this.aupBlockInternetUntilAccepted = $.aupBlockInternetUntilAccepted;
        this.aupEnabled = $.aupEnabled;
        this.aupForceSslInspection = $.aupForceSslInspection;
        this.aupTimeoutInDays = $.aupTimeoutInDays;
        this.authRequired = $.authRequired;
        this.cautionEnabled = $.cautionEnabled;
        this.dnBandwidth = $.dnBandwidth;
        this.idleTimeInMinutes = $.idleTimeInMinutes;
        this.ofwEnabled = $.ofwEnabled;
        this.subLocations = $.subLocations;
        this.surrogateIp = $.surrogateIp;
        this.surrogateIpEnforcedForKnownBrowsers = $.surrogateIpEnforcedForKnownBrowsers;
        this.surrogateRefreshTimeInMinutes = $.surrogateRefreshTimeInMinutes;
        this.upBandwidth = $.upBandwidth;
        this.xffForwardEnabled = $.xffForwardEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayTunnelProviderOptionsZscalerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayTunnelProviderOptionsZscalerArgs $;

        public Builder() {
            $ = new GatewayTunnelProviderOptionsZscalerArgs();
        }

        public Builder(GatewayTunnelProviderOptionsZscalerArgs defaults) {
            $ = new GatewayTunnelProviderOptionsZscalerArgs(Objects.requireNonNull(defaults));
        }

        public Builder aupBlockInternetUntilAccepted(@Nullable Output<Boolean> aupBlockInternetUntilAccepted) {
            $.aupBlockInternetUntilAccepted = aupBlockInternetUntilAccepted;
            return this;
        }

        public Builder aupBlockInternetUntilAccepted(Boolean aupBlockInternetUntilAccepted) {
            return aupBlockInternetUntilAccepted(Output.of(aupBlockInternetUntilAccepted));
        }

        /**
         * @param aupEnabled Can only be `true` when `auth_required`==`false`, display Acceptable Use Policy (AUP)
         * 
         * @return builder
         * 
         */
        public Builder aupEnabled(@Nullable Output<Boolean> aupEnabled) {
            $.aupEnabled = aupEnabled;
            return this;
        }

        /**
         * @param aupEnabled Can only be `true` when `auth_required`==`false`, display Acceptable Use Policy (AUP)
         * 
         * @return builder
         * 
         */
        public Builder aupEnabled(Boolean aupEnabled) {
            return aupEnabled(Output.of(aupEnabled));
        }

        /**
         * @param aupForceSslInspection Proxy HTTPs traffic, requiring Zscaler cert to be installed in browser
         * 
         * @return builder
         * 
         */
        public Builder aupForceSslInspection(@Nullable Output<Boolean> aupForceSslInspection) {
            $.aupForceSslInspection = aupForceSslInspection;
            return this;
        }

        /**
         * @param aupForceSslInspection Proxy HTTPs traffic, requiring Zscaler cert to be installed in browser
         * 
         * @return builder
         * 
         */
        public Builder aupForceSslInspection(Boolean aupForceSslInspection) {
            return aupForceSslInspection(Output.of(aupForceSslInspection));
        }

        /**
         * @param aupTimeoutInDays Required if `aup_enabled`==`true`. Days before AUP is requested again
         * 
         * @return builder
         * 
         */
        public Builder aupTimeoutInDays(@Nullable Output<Integer> aupTimeoutInDays) {
            $.aupTimeoutInDays = aupTimeoutInDays;
            return this;
        }

        /**
         * @param aupTimeoutInDays Required if `aup_enabled`==`true`. Days before AUP is requested again
         * 
         * @return builder
         * 
         */
        public Builder aupTimeoutInDays(Integer aupTimeoutInDays) {
            return aupTimeoutInDays(Output.of(aupTimeoutInDays));
        }

        /**
         * @param authRequired Enable this option to enforce user authentication
         * 
         * @return builder
         * 
         */
        public Builder authRequired(@Nullable Output<Boolean> authRequired) {
            $.authRequired = authRequired;
            return this;
        }

        /**
         * @param authRequired Enable this option to enforce user authentication
         * 
         * @return builder
         * 
         */
        public Builder authRequired(Boolean authRequired) {
            return authRequired(Output.of(authRequired));
        }

        /**
         * @param cautionEnabled Can only be `true` when `auth_required`==`false`, display caution notification for non-authenticated users
         * 
         * @return builder
         * 
         */
        public Builder cautionEnabled(@Nullable Output<Boolean> cautionEnabled) {
            $.cautionEnabled = cautionEnabled;
            return this;
        }

        /**
         * @param cautionEnabled Can only be `true` when `auth_required`==`false`, display caution notification for non-authenticated users
         * 
         * @return builder
         * 
         */
        public Builder cautionEnabled(Boolean cautionEnabled) {
            return cautionEnabled(Output.of(cautionEnabled));
        }

        /**
         * @param dnBandwidth Download bandwidth cap of the link, in Mbps. Disabled if not set
         * 
         * @return builder
         * 
         */
        public Builder dnBandwidth(@Nullable Output<Double> dnBandwidth) {
            $.dnBandwidth = dnBandwidth;
            return this;
        }

        /**
         * @param dnBandwidth Download bandwidth cap of the link, in Mbps. Disabled if not set
         * 
         * @return builder
         * 
         */
        public Builder dnBandwidth(Double dnBandwidth) {
            return dnBandwidth(Output.of(dnBandwidth));
        }

        /**
         * @param idleTimeInMinutes Required if `surrogate_IP`==`true`, idle Time to Disassociation
         * 
         * @return builder
         * 
         */
        public Builder idleTimeInMinutes(@Nullable Output<Integer> idleTimeInMinutes) {
            $.idleTimeInMinutes = idleTimeInMinutes;
            return this;
        }

        /**
         * @param idleTimeInMinutes Required if `surrogate_IP`==`true`, idle Time to Disassociation
         * 
         * @return builder
         * 
         */
        public Builder idleTimeInMinutes(Integer idleTimeInMinutes) {
            return idleTimeInMinutes(Output.of(idleTimeInMinutes));
        }

        /**
         * @param ofwEnabled If `true`, enable the firewall control option
         * 
         * @return builder
         * 
         */
        public Builder ofwEnabled(@Nullable Output<Boolean> ofwEnabled) {
            $.ofwEnabled = ofwEnabled;
            return this;
        }

        /**
         * @param ofwEnabled If `true`, enable the firewall control option
         * 
         * @return builder
         * 
         */
        public Builder ofwEnabled(Boolean ofwEnabled) {
            return ofwEnabled(Output.of(ofwEnabled));
        }

        /**
         * @param subLocations `sub-locations` can be used for specific uses cases to define different configuration based on the user network
         * 
         * @return builder
         * 
         */
        public Builder subLocations(@Nullable Output<List<GatewayTunnelProviderOptionsZscalerSubLocationArgs>> subLocations) {
            $.subLocations = subLocations;
            return this;
        }

        /**
         * @param subLocations `sub-locations` can be used for specific uses cases to define different configuration based on the user network
         * 
         * @return builder
         * 
         */
        public Builder subLocations(List<GatewayTunnelProviderOptionsZscalerSubLocationArgs> subLocations) {
            return subLocations(Output.of(subLocations));
        }

        /**
         * @param subLocations `sub-locations` can be used for specific uses cases to define different configuration based on the user network
         * 
         * @return builder
         * 
         */
        public Builder subLocations(GatewayTunnelProviderOptionsZscalerSubLocationArgs... subLocations) {
            return subLocations(List.of(subLocations));
        }

        /**
         * @param surrogateIp Can only be `true` when `auth_required`==`true`. Map a user to a private IP address so it applies the user&#39;s policies, instead of the location&#39;s policies
         * 
         * @return builder
         * 
         */
        public Builder surrogateIp(@Nullable Output<Boolean> surrogateIp) {
            $.surrogateIp = surrogateIp;
            return this;
        }

        /**
         * @param surrogateIp Can only be `true` when `auth_required`==`true`. Map a user to a private IP address so it applies the user&#39;s policies, instead of the location&#39;s policies
         * 
         * @return builder
         * 
         */
        public Builder surrogateIp(Boolean surrogateIp) {
            return surrogateIp(Output.of(surrogateIp));
        }

        /**
         * @param surrogateIpEnforcedForKnownBrowsers Can only be `true` when `surrogate_IP`==`true`, enforce surrogate IP for known browsers
         * 
         * @return builder
         * 
         */
        public Builder surrogateIpEnforcedForKnownBrowsers(@Nullable Output<Boolean> surrogateIpEnforcedForKnownBrowsers) {
            $.surrogateIpEnforcedForKnownBrowsers = surrogateIpEnforcedForKnownBrowsers;
            return this;
        }

        /**
         * @param surrogateIpEnforcedForKnownBrowsers Can only be `true` when `surrogate_IP`==`true`, enforce surrogate IP for known browsers
         * 
         * @return builder
         * 
         */
        public Builder surrogateIpEnforcedForKnownBrowsers(Boolean surrogateIpEnforcedForKnownBrowsers) {
            return surrogateIpEnforcedForKnownBrowsers(Output.of(surrogateIpEnforcedForKnownBrowsers));
        }

        /**
         * @param surrogateRefreshTimeInMinutes Required if `surrogate_IP_enforced_for_known_browsers`==`true`, must be lower or equal than `idle_time_in_minutes`, refresh Time for re-validation of Surrogacy
         * 
         * @return builder
         * 
         */
        public Builder surrogateRefreshTimeInMinutes(@Nullable Output<Integer> surrogateRefreshTimeInMinutes) {
            $.surrogateRefreshTimeInMinutes = surrogateRefreshTimeInMinutes;
            return this;
        }

        /**
         * @param surrogateRefreshTimeInMinutes Required if `surrogate_IP_enforced_for_known_browsers`==`true`, must be lower or equal than `idle_time_in_minutes`, refresh Time for re-validation of Surrogacy
         * 
         * @return builder
         * 
         */
        public Builder surrogateRefreshTimeInMinutes(Integer surrogateRefreshTimeInMinutes) {
            return surrogateRefreshTimeInMinutes(Output.of(surrogateRefreshTimeInMinutes));
        }

        /**
         * @param upBandwidth Download bandwidth cap of the link, in Mbps. Disabled if not set
         * 
         * @return builder
         * 
         */
        public Builder upBandwidth(@Nullable Output<Double> upBandwidth) {
            $.upBandwidth = upBandwidth;
            return this;
        }

        /**
         * @param upBandwidth Download bandwidth cap of the link, in Mbps. Disabled if not set
         * 
         * @return builder
         * 
         */
        public Builder upBandwidth(Double upBandwidth) {
            return upBandwidth(Output.of(upBandwidth));
        }

        /**
         * @param xffForwardEnabled Location uses proxy chaining to forward traffic
         * 
         * @return builder
         * 
         */
        public Builder xffForwardEnabled(@Nullable Output<Boolean> xffForwardEnabled) {
            $.xffForwardEnabled = xffForwardEnabled;
            return this;
        }

        /**
         * @param xffForwardEnabled Location uses proxy chaining to forward traffic
         * 
         * @return builder
         * 
         */
        public Builder xffForwardEnabled(Boolean xffForwardEnabled) {
            return xffForwardEnabled(Output.of(xffForwardEnabled));
        }

        public GatewayTunnelProviderOptionsZscalerArgs build() {
            return $;
        }
    }

}
