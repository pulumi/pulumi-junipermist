// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetApStatsDeviceApStatLed {
    private Integer brightness;
    private Boolean enabled;

    private GetApStatsDeviceApStatLed() {}
    public Integer brightness() {
        return this.brightness;
    }
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApStatsDeviceApStatLed defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer brightness;
        private Boolean enabled;
        public Builder() {}
        public Builder(GetApStatsDeviceApStatLed defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brightness = defaults.brightness;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder brightness(Integer brightness) {
            if (brightness == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatLed", "brightness");
            }
            this.brightness = brightness;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatLed", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        public GetApStatsDeviceApStatLed build() {
            final var _resultValue = new GetApStatsDeviceApStatLed();
            _resultValue.brightness = brightness;
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
