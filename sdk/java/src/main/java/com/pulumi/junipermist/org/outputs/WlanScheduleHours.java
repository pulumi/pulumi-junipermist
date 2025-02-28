// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WlanScheduleHours {
    /**
     * @return Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it&#39;s treated as 00:00-23:59.
     * 
     */
    private @Nullable String fri;
    /**
     * @return Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it&#39;s treated as 00:00-23:59.
     * 
     */
    private @Nullable String mon;
    /**
     * @return Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it&#39;s treated as 00:00-23:59.
     * 
     */
    private @Nullable String sat;
    /**
     * @return Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it&#39;s treated as 00:00-23:59.
     * 
     */
    private @Nullable String sun;
    /**
     * @return Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it&#39;s treated as 00:00-23:59.
     * 
     */
    private @Nullable String thu;
    /**
     * @return Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it&#39;s treated as 00:00-23:59.
     * 
     */
    private @Nullable String tue;
    /**
     * @return Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it&#39;s treated as 00:00-23:59.
     * 
     */
    private @Nullable String wed;

    private WlanScheduleHours() {}
    /**
     * @return Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it&#39;s treated as 00:00-23:59.
     * 
     */
    public Optional<String> fri() {
        return Optional.ofNullable(this.fri);
    }
    /**
     * @return Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it&#39;s treated as 00:00-23:59.
     * 
     */
    public Optional<String> mon() {
        return Optional.ofNullable(this.mon);
    }
    /**
     * @return Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it&#39;s treated as 00:00-23:59.
     * 
     */
    public Optional<String> sat() {
        return Optional.ofNullable(this.sat);
    }
    /**
     * @return Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it&#39;s treated as 00:00-23:59.
     * 
     */
    public Optional<String> sun() {
        return Optional.ofNullable(this.sun);
    }
    /**
     * @return Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it&#39;s treated as 00:00-23:59.
     * 
     */
    public Optional<String> thu() {
        return Optional.ofNullable(this.thu);
    }
    /**
     * @return Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it&#39;s treated as 00:00-23:59.
     * 
     */
    public Optional<String> tue() {
        return Optional.ofNullable(this.tue);
    }
    /**
     * @return Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it&#39;s treated as 00:00-23:59.
     * 
     */
    public Optional<String> wed() {
        return Optional.ofNullable(this.wed);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WlanScheduleHours defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String fri;
        private @Nullable String mon;
        private @Nullable String sat;
        private @Nullable String sun;
        private @Nullable String thu;
        private @Nullable String tue;
        private @Nullable String wed;
        public Builder() {}
        public Builder(WlanScheduleHours defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fri = defaults.fri;
    	      this.mon = defaults.mon;
    	      this.sat = defaults.sat;
    	      this.sun = defaults.sun;
    	      this.thu = defaults.thu;
    	      this.tue = defaults.tue;
    	      this.wed = defaults.wed;
        }

        @CustomType.Setter
        public Builder fri(@Nullable String fri) {

            this.fri = fri;
            return this;
        }
        @CustomType.Setter
        public Builder mon(@Nullable String mon) {

            this.mon = mon;
            return this;
        }
        @CustomType.Setter
        public Builder sat(@Nullable String sat) {

            this.sat = sat;
            return this;
        }
        @CustomType.Setter
        public Builder sun(@Nullable String sun) {

            this.sun = sun;
            return this;
        }
        @CustomType.Setter
        public Builder thu(@Nullable String thu) {

            this.thu = thu;
            return this;
        }
        @CustomType.Setter
        public Builder tue(@Nullable String tue) {

            this.tue = tue;
            return this;
        }
        @CustomType.Setter
        public Builder wed(@Nullable String wed) {

            this.wed = wed;
            return this;
        }
        public WlanScheduleHours build() {
            final var _resultValue = new WlanScheduleHours();
            _resultValue.fri = fri;
            _resultValue.mon = mon;
            _resultValue.sat = sat;
            _resultValue.sun = sun;
            _resultValue.thu = thu;
            _resultValue.tue = tue;
            _resultValue.wed = wed;
            return _resultValue;
        }
    }
}
