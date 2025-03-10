// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GatewayExtraRoutes6 {
    private String via;

    private GatewayExtraRoutes6() {}
    public String via() {
        return this.via;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayExtraRoutes6 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String via;
        public Builder() {}
        public Builder(GatewayExtraRoutes6 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.via = defaults.via;
        }

        @CustomType.Setter
        public Builder via(String via) {
            if (via == null) {
              throw new MissingRequiredPropertyException("GatewayExtraRoutes6", "via");
            }
            this.via = via;
            return this;
        }
        public GatewayExtraRoutes6 build() {
            final var _resultValue = new GatewayExtraRoutes6();
            _resultValue.via = via;
            return _resultValue;
        }
    }
}
