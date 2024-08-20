// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class BaseLatlng {
    private Double lat;
    private Double lng;

    private BaseLatlng() {}
    public Double lat() {
        return this.lat;
    }
    public Double lng() {
        return this.lng;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BaseLatlng defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double lat;
        private Double lng;
        public Builder() {}
        public Builder(BaseLatlng defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lat = defaults.lat;
    	      this.lng = defaults.lng;
        }

        @CustomType.Setter
        public Builder lat(Double lat) {
            if (lat == null) {
              throw new MissingRequiredPropertyException("BaseLatlng", "lat");
            }
            this.lat = lat;
            return this;
        }
        @CustomType.Setter
        public Builder lng(Double lng) {
            if (lng == null) {
              throw new MissingRequiredPropertyException("BaseLatlng", "lng");
            }
            this.lng = lng;
            return this;
        }
        public BaseLatlng build() {
            final var _resultValue = new BaseLatlng();
            _resultValue.lat = lat;
            _resultValue.lng = lng;
            return _resultValue;
        }
    }
}
