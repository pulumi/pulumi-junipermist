// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayTunnelProviderOptionsZscalerSubLocation {
    private @Nullable Boolean aupBlockInternetUntilAccepted;
    /**
     * @return Can only be `true` when `auth_required`==`false`, display Acceptable Use Policy (AUP)
     * 
     */
    private @Nullable Boolean aupEnabled;
    /**
     * @return proxy HTTPs traffic, requiring Zscaler cert to be installed in browser
     * 
     */
    private @Nullable Boolean aupForceSslInspection;
    /**
     * @return Required if `aup_enabled`==`true`. Days before AUP is requested again
     * 
     */
    private @Nullable Integer aupTimeoutInDays;
    /**
     * @return Enable this option to authenticate users
     * 
     */
    private @Nullable Boolean authRequired;
    /**
     * @return Can only be `true` when `auth_required`==`false`, display caution notification for non-authenticated users
     * 
     */
    private @Nullable Boolean cautionEnabled;
    /**
     * @return the download bandwidth cap of the link, in Mbps. Disabled if not set
     * 
     */
    private @Nullable Double dnBandwidth;
    /**
     * @return Required if `surrogate_IP`==`true`, idle Time to Disassociation
     * 
     */
    private @Nullable Integer idleTimeInMinutes;
    /**
     * @return Network name
     * 
     */
    private @Nullable String name;
    /**
     * @return if `true`, enable the firewall control option
     * 
     */
    private @Nullable Boolean ofwEnabled;
    /**
     * @return Can only be `true` when `auth_required`==`true`. Map a user to a private IP address so it applies the user&#39;s policies, instead of the location&#39;s policies
     * 
     */
    private @Nullable Boolean surrogateIp;
    /**
     * @return Can only be `true` when `surrogate_IP`==`true`, enforce surrogate IP for known browsers
     * 
     */
    private @Nullable Boolean surrogateIpEnforcedForKnownBrowsers;
    /**
     * @return Required if `surrogate_IP_enforced_for_known_browsers`==`true`, must be lower or equal than `idle_time_in_minutes`, refresh Time for re-validation of Surrogacy
     * 
     */
    private @Nullable Integer surrogateRefreshTimeInMinutes;
    /**
     * @return the download bandwidth cap of the link, in Mbps. Disabled if not set
     * 
     */
    private @Nullable Double upBandwidth;

    private GatewayTunnelProviderOptionsZscalerSubLocation() {}
    public Optional<Boolean> aupBlockInternetUntilAccepted() {
        return Optional.ofNullable(this.aupBlockInternetUntilAccepted);
    }
    /**
     * @return Can only be `true` when `auth_required`==`false`, display Acceptable Use Policy (AUP)
     * 
     */
    public Optional<Boolean> aupEnabled() {
        return Optional.ofNullable(this.aupEnabled);
    }
    /**
     * @return proxy HTTPs traffic, requiring Zscaler cert to be installed in browser
     * 
     */
    public Optional<Boolean> aupForceSslInspection() {
        return Optional.ofNullable(this.aupForceSslInspection);
    }
    /**
     * @return Required if `aup_enabled`==`true`. Days before AUP is requested again
     * 
     */
    public Optional<Integer> aupTimeoutInDays() {
        return Optional.ofNullable(this.aupTimeoutInDays);
    }
    /**
     * @return Enable this option to authenticate users
     * 
     */
    public Optional<Boolean> authRequired() {
        return Optional.ofNullable(this.authRequired);
    }
    /**
     * @return Can only be `true` when `auth_required`==`false`, display caution notification for non-authenticated users
     * 
     */
    public Optional<Boolean> cautionEnabled() {
        return Optional.ofNullable(this.cautionEnabled);
    }
    /**
     * @return the download bandwidth cap of the link, in Mbps. Disabled if not set
     * 
     */
    public Optional<Double> dnBandwidth() {
        return Optional.ofNullable(this.dnBandwidth);
    }
    /**
     * @return Required if `surrogate_IP`==`true`, idle Time to Disassociation
     * 
     */
    public Optional<Integer> idleTimeInMinutes() {
        return Optional.ofNullable(this.idleTimeInMinutes);
    }
    /**
     * @return Network name
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return if `true`, enable the firewall control option
     * 
     */
    public Optional<Boolean> ofwEnabled() {
        return Optional.ofNullable(this.ofwEnabled);
    }
    /**
     * @return Can only be `true` when `auth_required`==`true`. Map a user to a private IP address so it applies the user&#39;s policies, instead of the location&#39;s policies
     * 
     */
    public Optional<Boolean> surrogateIp() {
        return Optional.ofNullable(this.surrogateIp);
    }
    /**
     * @return Can only be `true` when `surrogate_IP`==`true`, enforce surrogate IP for known browsers
     * 
     */
    public Optional<Boolean> surrogateIpEnforcedForKnownBrowsers() {
        return Optional.ofNullable(this.surrogateIpEnforcedForKnownBrowsers);
    }
    /**
     * @return Required if `surrogate_IP_enforced_for_known_browsers`==`true`, must be lower or equal than `idle_time_in_minutes`, refresh Time for re-validation of Surrogacy
     * 
     */
    public Optional<Integer> surrogateRefreshTimeInMinutes() {
        return Optional.ofNullable(this.surrogateRefreshTimeInMinutes);
    }
    /**
     * @return the download bandwidth cap of the link, in Mbps. Disabled if not set
     * 
     */
    public Optional<Double> upBandwidth() {
        return Optional.ofNullable(this.upBandwidth);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayTunnelProviderOptionsZscalerSubLocation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean aupBlockInternetUntilAccepted;
        private @Nullable Boolean aupEnabled;
        private @Nullable Boolean aupForceSslInspection;
        private @Nullable Integer aupTimeoutInDays;
        private @Nullable Boolean authRequired;
        private @Nullable Boolean cautionEnabled;
        private @Nullable Double dnBandwidth;
        private @Nullable Integer idleTimeInMinutes;
        private @Nullable String name;
        private @Nullable Boolean ofwEnabled;
        private @Nullable Boolean surrogateIp;
        private @Nullable Boolean surrogateIpEnforcedForKnownBrowsers;
        private @Nullable Integer surrogateRefreshTimeInMinutes;
        private @Nullable Double upBandwidth;
        public Builder() {}
        public Builder(GatewayTunnelProviderOptionsZscalerSubLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aupBlockInternetUntilAccepted = defaults.aupBlockInternetUntilAccepted;
    	      this.aupEnabled = defaults.aupEnabled;
    	      this.aupForceSslInspection = defaults.aupForceSslInspection;
    	      this.aupTimeoutInDays = defaults.aupTimeoutInDays;
    	      this.authRequired = defaults.authRequired;
    	      this.cautionEnabled = defaults.cautionEnabled;
    	      this.dnBandwidth = defaults.dnBandwidth;
    	      this.idleTimeInMinutes = defaults.idleTimeInMinutes;
    	      this.name = defaults.name;
    	      this.ofwEnabled = defaults.ofwEnabled;
    	      this.surrogateIp = defaults.surrogateIp;
    	      this.surrogateIpEnforcedForKnownBrowsers = defaults.surrogateIpEnforcedForKnownBrowsers;
    	      this.surrogateRefreshTimeInMinutes = defaults.surrogateRefreshTimeInMinutes;
    	      this.upBandwidth = defaults.upBandwidth;
        }

        @CustomType.Setter
        public Builder aupBlockInternetUntilAccepted(@Nullable Boolean aupBlockInternetUntilAccepted) {

            this.aupBlockInternetUntilAccepted = aupBlockInternetUntilAccepted;
            return this;
        }
        @CustomType.Setter
        public Builder aupEnabled(@Nullable Boolean aupEnabled) {

            this.aupEnabled = aupEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder aupForceSslInspection(@Nullable Boolean aupForceSslInspection) {

            this.aupForceSslInspection = aupForceSslInspection;
            return this;
        }
        @CustomType.Setter
        public Builder aupTimeoutInDays(@Nullable Integer aupTimeoutInDays) {

            this.aupTimeoutInDays = aupTimeoutInDays;
            return this;
        }
        @CustomType.Setter
        public Builder authRequired(@Nullable Boolean authRequired) {

            this.authRequired = authRequired;
            return this;
        }
        @CustomType.Setter
        public Builder cautionEnabled(@Nullable Boolean cautionEnabled) {

            this.cautionEnabled = cautionEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder dnBandwidth(@Nullable Double dnBandwidth) {

            this.dnBandwidth = dnBandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder idleTimeInMinutes(@Nullable Integer idleTimeInMinutes) {

            this.idleTimeInMinutes = idleTimeInMinutes;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder ofwEnabled(@Nullable Boolean ofwEnabled) {

            this.ofwEnabled = ofwEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder surrogateIp(@Nullable Boolean surrogateIp) {

            this.surrogateIp = surrogateIp;
            return this;
        }
        @CustomType.Setter
        public Builder surrogateIpEnforcedForKnownBrowsers(@Nullable Boolean surrogateIpEnforcedForKnownBrowsers) {

            this.surrogateIpEnforcedForKnownBrowsers = surrogateIpEnforcedForKnownBrowsers;
            return this;
        }
        @CustomType.Setter
        public Builder surrogateRefreshTimeInMinutes(@Nullable Integer surrogateRefreshTimeInMinutes) {

            this.surrogateRefreshTimeInMinutes = surrogateRefreshTimeInMinutes;
            return this;
        }
        @CustomType.Setter
        public Builder upBandwidth(@Nullable Double upBandwidth) {

            this.upBandwidth = upBandwidth;
            return this;
        }
        public GatewayTunnelProviderOptionsZscalerSubLocation build() {
            final var _resultValue = new GatewayTunnelProviderOptionsZscalerSubLocation();
            _resultValue.aupBlockInternetUntilAccepted = aupBlockInternetUntilAccepted;
            _resultValue.aupEnabled = aupEnabled;
            _resultValue.aupForceSslInspection = aupForceSslInspection;
            _resultValue.aupTimeoutInDays = aupTimeoutInDays;
            _resultValue.authRequired = authRequired;
            _resultValue.cautionEnabled = cautionEnabled;
            _resultValue.dnBandwidth = dnBandwidth;
            _resultValue.idleTimeInMinutes = idleTimeInMinutes;
            _resultValue.name = name;
            _resultValue.ofwEnabled = ofwEnabled;
            _resultValue.surrogateIp = surrogateIp;
            _resultValue.surrogateIpEnforcedForKnownBrowsers = surrogateIpEnforcedForKnownBrowsers;
            _resultValue.surrogateRefreshTimeInMinutes = surrogateRefreshTimeInMinutes;
            _resultValue.upBandwidth = upBandwidth;
            return _resultValue;
        }
    }
}
