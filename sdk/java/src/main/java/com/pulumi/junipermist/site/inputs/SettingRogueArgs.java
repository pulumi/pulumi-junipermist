// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingRogueArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingRogueArgs Empty = new SettingRogueArgs();

    /**
     * Whether rogue detection is enabled
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether rogue detection is enabled
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Whether honeypot detection is enabled
     * 
     */
    @Import(name="honeypotEnabled")
    private @Nullable Output<Boolean> honeypotEnabled;

    /**
     * @return Whether honeypot detection is enabled
     * 
     */
    public Optional<Output<Boolean>> honeypotEnabled() {
        return Optional.ofNullable(this.honeypotEnabled);
    }

    /**
     * Minimum duration for a bssid to be considered rogue
     * 
     */
    @Import(name="minDuration")
    private @Nullable Output<Integer> minDuration;

    /**
     * @return Minimum duration for a bssid to be considered rogue
     * 
     */
    public Optional<Output<Integer>> minDuration() {
        return Optional.ofNullable(this.minDuration);
    }

    /**
     * Minimum RSSI for an AP to be considered rogue (ignoring APs that’s far away)
     * 
     */
    @Import(name="minRssi")
    private @Nullable Output<Integer> minRssi;

    /**
     * @return Minimum RSSI for an AP to be considered rogue (ignoring APs that’s far away)
     * 
     */
    public Optional<Output<Integer>> minRssi() {
        return Optional.ofNullable(this.minRssi);
    }

    /**
     * list of BSSIDs to whitelist. Ex: &#34;cc-:8e-:6f-:d4-:bf-:16&#34;, &#34;cc-8e-6f-d4-bf-16&#34;, &#34;cc-73-*&#34;, &#34;cc:82:*&#34;
     * 
     */
    @Import(name="whitelistedBssids")
    private @Nullable Output<List<String>> whitelistedBssids;

    /**
     * @return list of BSSIDs to whitelist. Ex: &#34;cc-:8e-:6f-:d4-:bf-:16&#34;, &#34;cc-8e-6f-d4-bf-16&#34;, &#34;cc-73-*&#34;, &#34;cc:82:*&#34;
     * 
     */
    public Optional<Output<List<String>>> whitelistedBssids() {
        return Optional.ofNullable(this.whitelistedBssids);
    }

    /**
     * List of SSIDs to whitelist
     * 
     */
    @Import(name="whitelistedSsids")
    private @Nullable Output<List<String>> whitelistedSsids;

    /**
     * @return List of SSIDs to whitelist
     * 
     */
    public Optional<Output<List<String>>> whitelistedSsids() {
        return Optional.ofNullable(this.whitelistedSsids);
    }

    private SettingRogueArgs() {}

    private SettingRogueArgs(SettingRogueArgs $) {
        this.enabled = $.enabled;
        this.honeypotEnabled = $.honeypotEnabled;
        this.minDuration = $.minDuration;
        this.minRssi = $.minRssi;
        this.whitelistedBssids = $.whitelistedBssids;
        this.whitelistedSsids = $.whitelistedSsids;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingRogueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingRogueArgs $;

        public Builder() {
            $ = new SettingRogueArgs();
        }

        public Builder(SettingRogueArgs defaults) {
            $ = new SettingRogueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether rogue detection is enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether rogue detection is enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param honeypotEnabled Whether honeypot detection is enabled
         * 
         * @return builder
         * 
         */
        public Builder honeypotEnabled(@Nullable Output<Boolean> honeypotEnabled) {
            $.honeypotEnabled = honeypotEnabled;
            return this;
        }

        /**
         * @param honeypotEnabled Whether honeypot detection is enabled
         * 
         * @return builder
         * 
         */
        public Builder honeypotEnabled(Boolean honeypotEnabled) {
            return honeypotEnabled(Output.of(honeypotEnabled));
        }

        /**
         * @param minDuration Minimum duration for a bssid to be considered rogue
         * 
         * @return builder
         * 
         */
        public Builder minDuration(@Nullable Output<Integer> minDuration) {
            $.minDuration = minDuration;
            return this;
        }

        /**
         * @param minDuration Minimum duration for a bssid to be considered rogue
         * 
         * @return builder
         * 
         */
        public Builder minDuration(Integer minDuration) {
            return minDuration(Output.of(minDuration));
        }

        /**
         * @param minRssi Minimum RSSI for an AP to be considered rogue (ignoring APs that’s far away)
         * 
         * @return builder
         * 
         */
        public Builder minRssi(@Nullable Output<Integer> minRssi) {
            $.minRssi = minRssi;
            return this;
        }

        /**
         * @param minRssi Minimum RSSI for an AP to be considered rogue (ignoring APs that’s far away)
         * 
         * @return builder
         * 
         */
        public Builder minRssi(Integer minRssi) {
            return minRssi(Output.of(minRssi));
        }

        /**
         * @param whitelistedBssids list of BSSIDs to whitelist. Ex: &#34;cc-:8e-:6f-:d4-:bf-:16&#34;, &#34;cc-8e-6f-d4-bf-16&#34;, &#34;cc-73-*&#34;, &#34;cc:82:*&#34;
         * 
         * @return builder
         * 
         */
        public Builder whitelistedBssids(@Nullable Output<List<String>> whitelistedBssids) {
            $.whitelistedBssids = whitelistedBssids;
            return this;
        }

        /**
         * @param whitelistedBssids list of BSSIDs to whitelist. Ex: &#34;cc-:8e-:6f-:d4-:bf-:16&#34;, &#34;cc-8e-6f-d4-bf-16&#34;, &#34;cc-73-*&#34;, &#34;cc:82:*&#34;
         * 
         * @return builder
         * 
         */
        public Builder whitelistedBssids(List<String> whitelistedBssids) {
            return whitelistedBssids(Output.of(whitelistedBssids));
        }

        /**
         * @param whitelistedBssids list of BSSIDs to whitelist. Ex: &#34;cc-:8e-:6f-:d4-:bf-:16&#34;, &#34;cc-8e-6f-d4-bf-16&#34;, &#34;cc-73-*&#34;, &#34;cc:82:*&#34;
         * 
         * @return builder
         * 
         */
        public Builder whitelistedBssids(String... whitelistedBssids) {
            return whitelistedBssids(List.of(whitelistedBssids));
        }

        /**
         * @param whitelistedSsids List of SSIDs to whitelist
         * 
         * @return builder
         * 
         */
        public Builder whitelistedSsids(@Nullable Output<List<String>> whitelistedSsids) {
            $.whitelistedSsids = whitelistedSsids;
            return this;
        }

        /**
         * @param whitelistedSsids List of SSIDs to whitelist
         * 
         * @return builder
         * 
         */
        public Builder whitelistedSsids(List<String> whitelistedSsids) {
            return whitelistedSsids(Output.of(whitelistedSsids));
        }

        /**
         * @param whitelistedSsids List of SSIDs to whitelist
         * 
         * @return builder
         * 
         */
        public Builder whitelistedSsids(String... whitelistedSsids) {
            return whitelistedSsids(List.of(whitelistedSsids));
        }

        public SettingRogueArgs build() {
            return $;
        }
    }

}
