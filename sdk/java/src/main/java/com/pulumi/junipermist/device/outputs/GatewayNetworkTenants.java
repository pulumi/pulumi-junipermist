// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GatewayNetworkTenants {
    private @Nullable List<String> addresses;

    private GatewayNetworkTenants() {}
    public List<String> addresses() {
        return this.addresses == null ? List.of() : this.addresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayNetworkTenants defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> addresses;
        public Builder() {}
        public Builder(GatewayNetworkTenants defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
        }

        @CustomType.Setter
        public Builder addresses(@Nullable List<String> addresses) {

            this.addresses = addresses;
            return this;
        }
        public Builder addresses(String... addresses) {
            return addresses(List.of(addresses));
        }
        public GatewayNetworkTenants build() {
            final var _resultValue = new GatewayNetworkTenants();
            _resultValue.addresses = addresses;
            return _resultValue;
        }
    }
}