// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SettingRogue {
    /**
     * @return whether or not rogue detection is enabled
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return whether or not honeypot detection is enabled
     * 
     */
    private @Nullable Boolean honeypotEnabled;
    /**
     * @return minimum duration for a bssid to be considered rogue
     * 
     */
    private @Nullable Integer minDuration;
    /**
     * @return minimum RSSI for an AP to be considered rogue (ignoring APs that’s far away)
     * 
     */
    private @Nullable Integer minRssi;
    /**
     * @return list of BSSIDs to whitelist. Ex: &#34;cc-:8e-:6f-:d4-:bf-:16&#34;, &#34;cc-8e-6f-d4-bf-16&#34;, &#34;cc-73-*&#34;, &#34;cc:82:*&#34;
     * 
     */
    private @Nullable List<String> whitelistedBssids;
    /**
     * @return list of SSIDs to whitelist
     * 
     */
    private @Nullable List<String> whitelistedSsids;

    private SettingRogue() {}
    /**
     * @return whether or not rogue detection is enabled
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return whether or not honeypot detection is enabled
     * 
     */
    public Optional<Boolean> honeypotEnabled() {
        return Optional.ofNullable(this.honeypotEnabled);
    }
    /**
     * @return minimum duration for a bssid to be considered rogue
     * 
     */
    public Optional<Integer> minDuration() {
        return Optional.ofNullable(this.minDuration);
    }
    /**
     * @return minimum RSSI for an AP to be considered rogue (ignoring APs that’s far away)
     * 
     */
    public Optional<Integer> minRssi() {
        return Optional.ofNullable(this.minRssi);
    }
    /**
     * @return list of BSSIDs to whitelist. Ex: &#34;cc-:8e-:6f-:d4-:bf-:16&#34;, &#34;cc-8e-6f-d4-bf-16&#34;, &#34;cc-73-*&#34;, &#34;cc:82:*&#34;
     * 
     */
    public List<String> whitelistedBssids() {
        return this.whitelistedBssids == null ? List.of() : this.whitelistedBssids;
    }
    /**
     * @return list of SSIDs to whitelist
     * 
     */
    public List<String> whitelistedSsids() {
        return this.whitelistedSsids == null ? List.of() : this.whitelistedSsids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingRogue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Boolean honeypotEnabled;
        private @Nullable Integer minDuration;
        private @Nullable Integer minRssi;
        private @Nullable List<String> whitelistedBssids;
        private @Nullable List<String> whitelistedSsids;
        public Builder() {}
        public Builder(SettingRogue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.honeypotEnabled = defaults.honeypotEnabled;
    	      this.minDuration = defaults.minDuration;
    	      this.minRssi = defaults.minRssi;
    	      this.whitelistedBssids = defaults.whitelistedBssids;
    	      this.whitelistedSsids = defaults.whitelistedSsids;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder honeypotEnabled(@Nullable Boolean honeypotEnabled) {

            this.honeypotEnabled = honeypotEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder minDuration(@Nullable Integer minDuration) {

            this.minDuration = minDuration;
            return this;
        }
        @CustomType.Setter
        public Builder minRssi(@Nullable Integer minRssi) {

            this.minRssi = minRssi;
            return this;
        }
        @CustomType.Setter
        public Builder whitelistedBssids(@Nullable List<String> whitelistedBssids) {

            this.whitelistedBssids = whitelistedBssids;
            return this;
        }
        public Builder whitelistedBssids(String... whitelistedBssids) {
            return whitelistedBssids(List.of(whitelistedBssids));
        }
        @CustomType.Setter
        public Builder whitelistedSsids(@Nullable List<String> whitelistedSsids) {

            this.whitelistedSsids = whitelistedSsids;
            return this;
        }
        public Builder whitelistedSsids(String... whitelistedSsids) {
            return whitelistedSsids(List.of(whitelistedSsids));
        }
        public SettingRogue build() {
            final var _resultValue = new SettingRogue();
            _resultValue.enabled = enabled;
            _resultValue.honeypotEnabled = honeypotEnabled;
            _resultValue.minDuration = minDuration;
            _resultValue.minRssi = minRssi;
            _resultValue.whitelistedBssids = whitelistedBssids;
            _resultValue.whitelistedSsids = whitelistedSsids;
            return _resultValue;
        }
    }
}