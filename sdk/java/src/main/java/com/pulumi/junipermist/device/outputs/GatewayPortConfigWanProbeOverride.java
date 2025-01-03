// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayPortConfigWanProbeOverride {
    private @Nullable List<String> ips;
    /**
     * @return enum: `broadband`, `lte`
     * 
     */
    private @Nullable String probeProfile;

    private GatewayPortConfigWanProbeOverride() {}
    public List<String> ips() {
        return this.ips == null ? List.of() : this.ips;
    }
    /**
     * @return enum: `broadband`, `lte`
     * 
     */
    public Optional<String> probeProfile() {
        return Optional.ofNullable(this.probeProfile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayPortConfigWanProbeOverride defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> ips;
        private @Nullable String probeProfile;
        public Builder() {}
        public Builder(GatewayPortConfigWanProbeOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ips = defaults.ips;
    	      this.probeProfile = defaults.probeProfile;
        }

        @CustomType.Setter
        public Builder ips(@Nullable List<String> ips) {

            this.ips = ips;
            return this;
        }
        public Builder ips(String... ips) {
            return ips(List.of(ips));
        }
        @CustomType.Setter
        public Builder probeProfile(@Nullable String probeProfile) {

            this.probeProfile = probeProfile;
            return this;
        }
        public GatewayPortConfigWanProbeOverride build() {
            final var _resultValue = new GatewayPortConfigWanProbeOverride();
            _resultValue.ips = ips;
            _resultValue.probeProfile = probeProfile;
            return _resultValue;
        }
    }
}
