// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WlanRateset {
    /**
     * @return If `template`==`custom`. EHT MCS bitmasks for 4 streams (16-bit for each stream, MCS0 is least significant bit)
     * 
     */
    private @Nullable String eht;
    /**
     * @return If `template`==`custom`. HE MCS bitmasks for 4 streams (16-bit for each stream, MCS0 is least significant bit
     * 
     */
    private @Nullable String he;
    /**
     * @return If `template`==`custom`. MCS bitmasks for 4 streams (16-bit for each stream, MCS0 is least significant bit), e.g. 00ff 00f0 001f limits HT rates to MCS 0-7 for 1 stream, MCS 4-7 for 2 stream (i.e. MCS 12-15), MCS 1-5 for 3 stream (i.e. MCS 16-20)
     * 
     */
    private @Nullable String ht;
    /**
     * @return if `template`==`custom`. List of supported rates (IE=1) and extended supported rates (IE=50) for custom template, append ‘b’ at the end to indicate a rate being basic/mandatory. If `template`==`custom` is configured and legacy does not define at least one basic rate, it will use `no-legacy` default values. enum: `1`, `11`, `11b`, `12`, `12b`, `18`, `18b`, `1b`, `2`, `24`, `24b`, `2b`, `36`, `36b`, `48`, `48b`, `5.5`, `5.5b`, `54`, `54b`, `6`, `6b`, `9`, `9b`
     * 
     */
    private @Nullable List<String> legacies;
    /**
     * @return Minimum RSSI for client to connect, 0 means not enforcing
     * 
     */
    private @Nullable Integer minRssi;
    /**
     * @return Data Rates template to apply. enum:
     *   * `no-legacy`: no 11b
     *   * `compatible`: all, like before, default setting that Broadcom/Atheros used
     *   * `legacy-only`: disable 802.11n and 802.11ac
     *   * `high-density`: no 11b, no low rates
     *   * `custom`: user defined
     * 
     */
    private @Nullable String template;
    /**
     * @return If `template`==`custom`. MCS bitmasks for 4 streams (16-bit for each stream, MCS0 is least significant bit), e.g. 03ff 01ff 00ff limits VHT rates to MCS 0-9 for 1 stream, MCS 0-8 for 2 streams, and MCS 0-7 for 3 streams.
     * 
     */
    private @Nullable String vht;

    private WlanRateset() {}
    /**
     * @return If `template`==`custom`. EHT MCS bitmasks for 4 streams (16-bit for each stream, MCS0 is least significant bit)
     * 
     */
    public Optional<String> eht() {
        return Optional.ofNullable(this.eht);
    }
    /**
     * @return If `template`==`custom`. HE MCS bitmasks for 4 streams (16-bit for each stream, MCS0 is least significant bit
     * 
     */
    public Optional<String> he() {
        return Optional.ofNullable(this.he);
    }
    /**
     * @return If `template`==`custom`. MCS bitmasks for 4 streams (16-bit for each stream, MCS0 is least significant bit), e.g. 00ff 00f0 001f limits HT rates to MCS 0-7 for 1 stream, MCS 4-7 for 2 stream (i.e. MCS 12-15), MCS 1-5 for 3 stream (i.e. MCS 16-20)
     * 
     */
    public Optional<String> ht() {
        return Optional.ofNullable(this.ht);
    }
    /**
     * @return if `template`==`custom`. List of supported rates (IE=1) and extended supported rates (IE=50) for custom template, append ‘b’ at the end to indicate a rate being basic/mandatory. If `template`==`custom` is configured and legacy does not define at least one basic rate, it will use `no-legacy` default values. enum: `1`, `11`, `11b`, `12`, `12b`, `18`, `18b`, `1b`, `2`, `24`, `24b`, `2b`, `36`, `36b`, `48`, `48b`, `5.5`, `5.5b`, `54`, `54b`, `6`, `6b`, `9`, `9b`
     * 
     */
    public List<String> legacies() {
        return this.legacies == null ? List.of() : this.legacies;
    }
    /**
     * @return Minimum RSSI for client to connect, 0 means not enforcing
     * 
     */
    public Optional<Integer> minRssi() {
        return Optional.ofNullable(this.minRssi);
    }
    /**
     * @return Data Rates template to apply. enum:
     *   * `no-legacy`: no 11b
     *   * `compatible`: all, like before, default setting that Broadcom/Atheros used
     *   * `legacy-only`: disable 802.11n and 802.11ac
     *   * `high-density`: no 11b, no low rates
     *   * `custom`: user defined
     * 
     */
    public Optional<String> template() {
        return Optional.ofNullable(this.template);
    }
    /**
     * @return If `template`==`custom`. MCS bitmasks for 4 streams (16-bit for each stream, MCS0 is least significant bit), e.g. 03ff 01ff 00ff limits VHT rates to MCS 0-9 for 1 stream, MCS 0-8 for 2 streams, and MCS 0-7 for 3 streams.
     * 
     */
    public Optional<String> vht() {
        return Optional.ofNullable(this.vht);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WlanRateset defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String eht;
        private @Nullable String he;
        private @Nullable String ht;
        private @Nullable List<String> legacies;
        private @Nullable Integer minRssi;
        private @Nullable String template;
        private @Nullable String vht;
        public Builder() {}
        public Builder(WlanRateset defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eht = defaults.eht;
    	      this.he = defaults.he;
    	      this.ht = defaults.ht;
    	      this.legacies = defaults.legacies;
    	      this.minRssi = defaults.minRssi;
    	      this.template = defaults.template;
    	      this.vht = defaults.vht;
        }

        @CustomType.Setter
        public Builder eht(@Nullable String eht) {

            this.eht = eht;
            return this;
        }
        @CustomType.Setter
        public Builder he(@Nullable String he) {

            this.he = he;
            return this;
        }
        @CustomType.Setter
        public Builder ht(@Nullable String ht) {

            this.ht = ht;
            return this;
        }
        @CustomType.Setter
        public Builder legacies(@Nullable List<String> legacies) {

            this.legacies = legacies;
            return this;
        }
        public Builder legacies(String... legacies) {
            return legacies(List.of(legacies));
        }
        @CustomType.Setter
        public Builder minRssi(@Nullable Integer minRssi) {

            this.minRssi = minRssi;
            return this;
        }
        @CustomType.Setter
        public Builder template(@Nullable String template) {

            this.template = template;
            return this;
        }
        @CustomType.Setter
        public Builder vht(@Nullable String vht) {

            this.vht = vht;
            return this;
        }
        public WlanRateset build() {
            final var _resultValue = new WlanRateset();
            _resultValue.eht = eht;
            _resultValue.he = he;
            _resultValue.ht = ht;
            _resultValue.legacies = legacies;
            _resultValue.minRssi = minRssi;
            _resultValue.template = template;
            _resultValue.vht = vht;
            return _resultValue;
        }
    }
}
