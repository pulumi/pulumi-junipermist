// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.org.outputs.DeviceprofileGatewayTunnelProviderOptionsZscalerSubLocation;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceprofileGatewayTunnelProviderOptionsZscaler {
    private @Nullable Boolean aupBlockInternetUntilAccepted;
    /**
     * @return Can only be `true` when `auth_required`==`false`, display Acceptable Use Policy (AUP)
     * 
     */
    private @Nullable Boolean aupEnabled;
    /**
     * @return Proxy HTTPs traffic, requiring Zscaler cert to be installed in browser
     * 
     */
    private @Nullable Boolean aupForceSslInspection;
    /**
     * @return Required if `aup_enabled`==`true`. Days before AUP is requested again
     * 
     */
    private @Nullable Integer aupTimeoutInDays;
    /**
     * @return Enable this option to enforce user authentication
     * 
     */
    private @Nullable Boolean authRequired;
    /**
     * @return Can only be `true` when `auth_required`==`false`, display caution notification for non-authenticated users
     * 
     */
    private @Nullable Boolean cautionEnabled;
    /**
     * @return Download bandwidth cap of the link, in Mbps. Disabled if not set
     * 
     */
    private @Nullable Double dnBandwidth;
    /**
     * @return Required if `surrogate_IP`==`true`, idle Time to Disassociation
     * 
     */
    private @Nullable Integer idleTimeInMinutes;
    /**
     * @return If `true`, enable the firewall control option
     * 
     */
    private @Nullable Boolean ofwEnabled;
    /**
     * @return `sub-locations` can be used for specific uses cases to define different configuration based on the user network
     * 
     */
    private @Nullable List<DeviceprofileGatewayTunnelProviderOptionsZscalerSubLocation> subLocations;
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
     * @return Download bandwidth cap of the link, in Mbps. Disabled if not set
     * 
     */
    private @Nullable Double upBandwidth;
    /**
     * @return Location uses proxy chaining to forward traffic
     * 
     */
    private @Nullable Boolean xffForwardEnabled;

    private DeviceprofileGatewayTunnelProviderOptionsZscaler() {}
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
     * @return Proxy HTTPs traffic, requiring Zscaler cert to be installed in browser
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
     * @return Enable this option to enforce user authentication
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
     * @return Download bandwidth cap of the link, in Mbps. Disabled if not set
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
     * @return If `true`, enable the firewall control option
     * 
     */
    public Optional<Boolean> ofwEnabled() {
        return Optional.ofNullable(this.ofwEnabled);
    }
    /**
     * @return `sub-locations` can be used for specific uses cases to define different configuration based on the user network
     * 
     */
    public List<DeviceprofileGatewayTunnelProviderOptionsZscalerSubLocation> subLocations() {
        return this.subLocations == null ? List.of() : this.subLocations;
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
     * @return Download bandwidth cap of the link, in Mbps. Disabled if not set
     * 
     */
    public Optional<Double> upBandwidth() {
        return Optional.ofNullable(this.upBandwidth);
    }
    /**
     * @return Location uses proxy chaining to forward traffic
     * 
     */
    public Optional<Boolean> xffForwardEnabled() {
        return Optional.ofNullable(this.xffForwardEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceprofileGatewayTunnelProviderOptionsZscaler defaults) {
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
        private @Nullable Boolean ofwEnabled;
        private @Nullable List<DeviceprofileGatewayTunnelProviderOptionsZscalerSubLocation> subLocations;
        private @Nullable Boolean surrogateIp;
        private @Nullable Boolean surrogateIpEnforcedForKnownBrowsers;
        private @Nullable Integer surrogateRefreshTimeInMinutes;
        private @Nullable Double upBandwidth;
        private @Nullable Boolean xffForwardEnabled;
        public Builder() {}
        public Builder(DeviceprofileGatewayTunnelProviderOptionsZscaler defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aupBlockInternetUntilAccepted = defaults.aupBlockInternetUntilAccepted;
    	      this.aupEnabled = defaults.aupEnabled;
    	      this.aupForceSslInspection = defaults.aupForceSslInspection;
    	      this.aupTimeoutInDays = defaults.aupTimeoutInDays;
    	      this.authRequired = defaults.authRequired;
    	      this.cautionEnabled = defaults.cautionEnabled;
    	      this.dnBandwidth = defaults.dnBandwidth;
    	      this.idleTimeInMinutes = defaults.idleTimeInMinutes;
    	      this.ofwEnabled = defaults.ofwEnabled;
    	      this.subLocations = defaults.subLocations;
    	      this.surrogateIp = defaults.surrogateIp;
    	      this.surrogateIpEnforcedForKnownBrowsers = defaults.surrogateIpEnforcedForKnownBrowsers;
    	      this.surrogateRefreshTimeInMinutes = defaults.surrogateRefreshTimeInMinutes;
    	      this.upBandwidth = defaults.upBandwidth;
    	      this.xffForwardEnabled = defaults.xffForwardEnabled;
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
        public Builder ofwEnabled(@Nullable Boolean ofwEnabled) {

            this.ofwEnabled = ofwEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder subLocations(@Nullable List<DeviceprofileGatewayTunnelProviderOptionsZscalerSubLocation> subLocations) {

            this.subLocations = subLocations;
            return this;
        }
        public Builder subLocations(DeviceprofileGatewayTunnelProviderOptionsZscalerSubLocation... subLocations) {
            return subLocations(List.of(subLocations));
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
        @CustomType.Setter
        public Builder xffForwardEnabled(@Nullable Boolean xffForwardEnabled) {

            this.xffForwardEnabled = xffForwardEnabled;
            return this;
        }
        public DeviceprofileGatewayTunnelProviderOptionsZscaler build() {
            final var _resultValue = new DeviceprofileGatewayTunnelProviderOptionsZscaler();
            _resultValue.aupBlockInternetUntilAccepted = aupBlockInternetUntilAccepted;
            _resultValue.aupEnabled = aupEnabled;
            _resultValue.aupForceSslInspection = aupForceSslInspection;
            _resultValue.aupTimeoutInDays = aupTimeoutInDays;
            _resultValue.authRequired = authRequired;
            _resultValue.cautionEnabled = cautionEnabled;
            _resultValue.dnBandwidth = dnBandwidth;
            _resultValue.idleTimeInMinutes = idleTimeInMinutes;
            _resultValue.ofwEnabled = ofwEnabled;
            _resultValue.subLocations = subLocations;
            _resultValue.surrogateIp = surrogateIp;
            _resultValue.surrogateIpEnforcedForKnownBrowsers = surrogateIpEnforcedForKnownBrowsers;
            _resultValue.surrogateRefreshTimeInMinutes = surrogateRefreshTimeInMinutes;
            _resultValue.upBandwidth = upBandwidth;
            _resultValue.xffForwardEnabled = xffForwardEnabled;
            return _resultValue;
        }
    }
}
