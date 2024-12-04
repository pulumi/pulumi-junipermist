// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WlanRatesetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WlanRatesetArgs Empty = new WlanRatesetArgs();

    /**
     * if `template`==`custom`. MCS bitmasks for 4 streams (16-bit for each stream, MCS0 is least significant bit), e.g. 00ff 00f0 001f limits HT rates to MCS 0-7 for 1 stream, MCS 4-7 for 2 stream (i.e. MCS 12-15), MCS 1-5 for 3 stream (i.e. MCS 16-20)
     * 
     */
    @Import(name="ht")
    private @Nullable Output<String> ht;

    /**
     * @return if `template`==`custom`. MCS bitmasks for 4 streams (16-bit for each stream, MCS0 is least significant bit), e.g. 00ff 00f0 001f limits HT rates to MCS 0-7 for 1 stream, MCS 4-7 for 2 stream (i.e. MCS 12-15), MCS 1-5 for 3 stream (i.e. MCS 16-20)
     * 
     */
    public Optional<Output<String>> ht() {
        return Optional.ofNullable(this.ht);
    }

    /**
     * if `template`==`custom`. List of supported rates (IE=1) and extended supported rates (IE=50) for custom template, append ‘b’ at the end to indicate a rate being basic/mandatory. If `template`==`custom` is configured and legacy does not define at least one basic rate, it will use `no-legacy` default values. enum: `1`, `11`, `11b`, `12`, `12b`, `18`, `18b`, `1b`, `2`, `24`, `24b`, `2b`, `36`, `36b`, `48`, `48b`, `5.5`, `5.5b`, `54`, `54b`, `6`, `6b`, `9`, `9b`
     * 
     */
    @Import(name="legacies")
    private @Nullable Output<List<String>> legacies;

    /**
     * @return if `template`==`custom`. List of supported rates (IE=1) and extended supported rates (IE=50) for custom template, append ‘b’ at the end to indicate a rate being basic/mandatory. If `template`==`custom` is configured and legacy does not define at least one basic rate, it will use `no-legacy` default values. enum: `1`, `11`, `11b`, `12`, `12b`, `18`, `18b`, `1b`, `2`, `24`, `24b`, `2b`, `36`, `36b`, `48`, `48b`, `5.5`, `5.5b`, `54`, `54b`, `6`, `6b`, `9`, `9b`
     * 
     */
    public Optional<Output<List<String>>> legacies() {
        return Optional.ofNullable(this.legacies);
    }

    /**
     * Minimum RSSI for client to connect, 0 means not enforcing
     * 
     */
    @Import(name="minRssi")
    private @Nullable Output<Integer> minRssi;

    /**
     * @return Minimum RSSI for client to connect, 0 means not enforcing
     * 
     */
    public Optional<Output<Integer>> minRssi() {
        return Optional.ofNullable(this.minRssi);
    }

    /**
     * Data Rates template to apply. enum:
     *   * `no-legacy`: no 11b
     *   * `compatible`: all, like before, default setting that Broadcom/Atheros used
     *   * `legacy-only`: disable 802.11n and 802.11ac
     *   * `high-density`: no 11b, no low rates
     *   * `custom`: user defined
     * 
     */
    @Import(name="template")
    private @Nullable Output<String> template;

    /**
     * @return Data Rates template to apply. enum:
     *   * `no-legacy`: no 11b
     *   * `compatible`: all, like before, default setting that Broadcom/Atheros used
     *   * `legacy-only`: disable 802.11n and 802.11ac
     *   * `high-density`: no 11b, no low rates
     *   * `custom`: user defined
     * 
     */
    public Optional<Output<String>> template() {
        return Optional.ofNullable(this.template);
    }

    /**
     * if `template`==`custom`. MCS bitmasks for 4 streams (16-bit for each stream, MCS0 is least significant bit), e.g. 03ff 01ff 00ff limits VHT rates to MCS 0-9 for 1 stream, MCS 0-8 for 2 streams, and MCS 0-7 for 3 streams.
     * 
     */
    @Import(name="vht")
    private @Nullable Output<String> vht;

    /**
     * @return if `template`==`custom`. MCS bitmasks for 4 streams (16-bit for each stream, MCS0 is least significant bit), e.g. 03ff 01ff 00ff limits VHT rates to MCS 0-9 for 1 stream, MCS 0-8 for 2 streams, and MCS 0-7 for 3 streams.
     * 
     */
    public Optional<Output<String>> vht() {
        return Optional.ofNullable(this.vht);
    }

    private WlanRatesetArgs() {}

    private WlanRatesetArgs(WlanRatesetArgs $) {
        this.ht = $.ht;
        this.legacies = $.legacies;
        this.minRssi = $.minRssi;
        this.template = $.template;
        this.vht = $.vht;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WlanRatesetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WlanRatesetArgs $;

        public Builder() {
            $ = new WlanRatesetArgs();
        }

        public Builder(WlanRatesetArgs defaults) {
            $ = new WlanRatesetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ht if `template`==`custom`. MCS bitmasks for 4 streams (16-bit for each stream, MCS0 is least significant bit), e.g. 00ff 00f0 001f limits HT rates to MCS 0-7 for 1 stream, MCS 4-7 for 2 stream (i.e. MCS 12-15), MCS 1-5 for 3 stream (i.e. MCS 16-20)
         * 
         * @return builder
         * 
         */
        public Builder ht(@Nullable Output<String> ht) {
            $.ht = ht;
            return this;
        }

        /**
         * @param ht if `template`==`custom`. MCS bitmasks for 4 streams (16-bit for each stream, MCS0 is least significant bit), e.g. 00ff 00f0 001f limits HT rates to MCS 0-7 for 1 stream, MCS 4-7 for 2 stream (i.e. MCS 12-15), MCS 1-5 for 3 stream (i.e. MCS 16-20)
         * 
         * @return builder
         * 
         */
        public Builder ht(String ht) {
            return ht(Output.of(ht));
        }

        /**
         * @param legacies if `template`==`custom`. List of supported rates (IE=1) and extended supported rates (IE=50) for custom template, append ‘b’ at the end to indicate a rate being basic/mandatory. If `template`==`custom` is configured and legacy does not define at least one basic rate, it will use `no-legacy` default values. enum: `1`, `11`, `11b`, `12`, `12b`, `18`, `18b`, `1b`, `2`, `24`, `24b`, `2b`, `36`, `36b`, `48`, `48b`, `5.5`, `5.5b`, `54`, `54b`, `6`, `6b`, `9`, `9b`
         * 
         * @return builder
         * 
         */
        public Builder legacies(@Nullable Output<List<String>> legacies) {
            $.legacies = legacies;
            return this;
        }

        /**
         * @param legacies if `template`==`custom`. List of supported rates (IE=1) and extended supported rates (IE=50) for custom template, append ‘b’ at the end to indicate a rate being basic/mandatory. If `template`==`custom` is configured and legacy does not define at least one basic rate, it will use `no-legacy` default values. enum: `1`, `11`, `11b`, `12`, `12b`, `18`, `18b`, `1b`, `2`, `24`, `24b`, `2b`, `36`, `36b`, `48`, `48b`, `5.5`, `5.5b`, `54`, `54b`, `6`, `6b`, `9`, `9b`
         * 
         * @return builder
         * 
         */
        public Builder legacies(List<String> legacies) {
            return legacies(Output.of(legacies));
        }

        /**
         * @param legacies if `template`==`custom`. List of supported rates (IE=1) and extended supported rates (IE=50) for custom template, append ‘b’ at the end to indicate a rate being basic/mandatory. If `template`==`custom` is configured and legacy does not define at least one basic rate, it will use `no-legacy` default values. enum: `1`, `11`, `11b`, `12`, `12b`, `18`, `18b`, `1b`, `2`, `24`, `24b`, `2b`, `36`, `36b`, `48`, `48b`, `5.5`, `5.5b`, `54`, `54b`, `6`, `6b`, `9`, `9b`
         * 
         * @return builder
         * 
         */
        public Builder legacies(String... legacies) {
            return legacies(List.of(legacies));
        }

        /**
         * @param minRssi Minimum RSSI for client to connect, 0 means not enforcing
         * 
         * @return builder
         * 
         */
        public Builder minRssi(@Nullable Output<Integer> minRssi) {
            $.minRssi = minRssi;
            return this;
        }

        /**
         * @param minRssi Minimum RSSI for client to connect, 0 means not enforcing
         * 
         * @return builder
         * 
         */
        public Builder minRssi(Integer minRssi) {
            return minRssi(Output.of(minRssi));
        }

        /**
         * @param template Data Rates template to apply. enum:
         *   * `no-legacy`: no 11b
         *   * `compatible`: all, like before, default setting that Broadcom/Atheros used
         *   * `legacy-only`: disable 802.11n and 802.11ac
         *   * `high-density`: no 11b, no low rates
         *   * `custom`: user defined
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Output<String> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template Data Rates template to apply. enum:
         *   * `no-legacy`: no 11b
         *   * `compatible`: all, like before, default setting that Broadcom/Atheros used
         *   * `legacy-only`: disable 802.11n and 802.11ac
         *   * `high-density`: no 11b, no low rates
         *   * `custom`: user defined
         * 
         * @return builder
         * 
         */
        public Builder template(String template) {
            return template(Output.of(template));
        }

        /**
         * @param vht if `template`==`custom`. MCS bitmasks for 4 streams (16-bit for each stream, MCS0 is least significant bit), e.g. 03ff 01ff 00ff limits VHT rates to MCS 0-9 for 1 stream, MCS 0-8 for 2 streams, and MCS 0-7 for 3 streams.
         * 
         * @return builder
         * 
         */
        public Builder vht(@Nullable Output<String> vht) {
            $.vht = vht;
            return this;
        }

        /**
         * @param vht if `template`==`custom`. MCS bitmasks for 4 streams (16-bit for each stream, MCS0 is least significant bit), e.g. 03ff 01ff 00ff limits VHT rates to MCS 0-9 for 1 stream, MCS 0-8 for 2 streams, and MCS 0-7 for 3 streams.
         * 
         * @return builder
         * 
         */
        public Builder vht(String vht) {
            return vht(Output.of(vht));
        }

        public WlanRatesetArgs build() {
            return $;
        }
    }

}
