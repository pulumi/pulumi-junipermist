// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SettingSyntheticTestWanSpeedtest {
    private @Nullable Boolean enabled;
    /**
     * @return `any` / HH:MM (24-hour format)
     * 
     */
    private @Nullable String timeOfDay;

    private SettingSyntheticTestWanSpeedtest() {}
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return `any` / HH:MM (24-hour format)
     * 
     */
    public Optional<String> timeOfDay() {
        return Optional.ofNullable(this.timeOfDay);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingSyntheticTestWanSpeedtest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String timeOfDay;
        public Builder() {}
        public Builder(SettingSyntheticTestWanSpeedtest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.timeOfDay = defaults.timeOfDay;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder timeOfDay(@Nullable String timeOfDay) {

            this.timeOfDay = timeOfDay;
            return this;
        }
        public SettingSyntheticTestWanSpeedtest build() {
            final var _resultValue = new SettingSyntheticTestWanSpeedtest();
            _resultValue.enabled = enabled;
            _resultValue.timeOfDay = timeOfDay;
            return _resultValue;
        }
    }
}
