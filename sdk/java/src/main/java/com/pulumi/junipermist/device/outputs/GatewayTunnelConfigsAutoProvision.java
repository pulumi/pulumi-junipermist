// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.device.outputs.GatewayTunnelConfigsAutoProvisionLatlng;
import com.pulumi.junipermist.device.outputs.GatewayTunnelConfigsAutoProvisionPrimary;
import com.pulumi.junipermist.device.outputs.GatewayTunnelConfigsAutoProvisionSecondary;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayTunnelConfigsAutoProvision {
    private @Nullable Boolean enable;
    private @Nullable GatewayTunnelConfigsAutoProvisionLatlng latlng;
    private @Nullable GatewayTunnelConfigsAutoProvisionPrimary primary;
    private @Nullable GatewayTunnelConfigsAutoProvisionSecondary secondary;

    private GatewayTunnelConfigsAutoProvision() {}
    public Optional<Boolean> enable() {
        return Optional.ofNullable(this.enable);
    }
    public Optional<GatewayTunnelConfigsAutoProvisionLatlng> latlng() {
        return Optional.ofNullable(this.latlng);
    }
    public Optional<GatewayTunnelConfigsAutoProvisionPrimary> primary() {
        return Optional.ofNullable(this.primary);
    }
    public Optional<GatewayTunnelConfigsAutoProvisionSecondary> secondary() {
        return Optional.ofNullable(this.secondary);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayTunnelConfigsAutoProvision defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enable;
        private @Nullable GatewayTunnelConfigsAutoProvisionLatlng latlng;
        private @Nullable GatewayTunnelConfigsAutoProvisionPrimary primary;
        private @Nullable GatewayTunnelConfigsAutoProvisionSecondary secondary;
        public Builder() {}
        public Builder(GatewayTunnelConfigsAutoProvision defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.latlng = defaults.latlng;
    	      this.primary = defaults.primary;
    	      this.secondary = defaults.secondary;
        }

        @CustomType.Setter
        public Builder enable(@Nullable Boolean enable) {

            this.enable = enable;
            return this;
        }
        @CustomType.Setter
        public Builder latlng(@Nullable GatewayTunnelConfigsAutoProvisionLatlng latlng) {

            this.latlng = latlng;
            return this;
        }
        @CustomType.Setter
        public Builder primary(@Nullable GatewayTunnelConfigsAutoProvisionPrimary primary) {

            this.primary = primary;
            return this;
        }
        @CustomType.Setter
        public Builder secondary(@Nullable GatewayTunnelConfigsAutoProvisionSecondary secondary) {

            this.secondary = secondary;
            return this;
        }
        public GatewayTunnelConfigsAutoProvision build() {
            final var _resultValue = new GatewayTunnelConfigsAutoProvision();
            _resultValue.enable = enable;
            _resultValue.latlng = latlng;
            _resultValue.primary = primary;
            _resultValue.secondary = secondary;
            return _resultValue;
        }
    }
}