// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApAeroscout {
    /**
     * @return Whether to enable aeroscout config
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Required if enabled, aeroscout server host
     * 
     */
    private @Nullable String host;
    /**
     * @return Whether to enable the feature to allow wireless clients data received and sent to AES server for location calculation
     * 
     */
    private @Nullable Boolean locateConnected;

    private ApAeroscout() {}
    /**
     * @return Whether to enable aeroscout config
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Required if enabled, aeroscout server host
     * 
     */
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }
    /**
     * @return Whether to enable the feature to allow wireless clients data received and sent to AES server for location calculation
     * 
     */
    public Optional<Boolean> locateConnected() {
        return Optional.ofNullable(this.locateConnected);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApAeroscout defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String host;
        private @Nullable Boolean locateConnected;
        public Builder() {}
        public Builder(ApAeroscout defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.host = defaults.host;
    	      this.locateConnected = defaults.locateConnected;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder host(@Nullable String host) {

            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder locateConnected(@Nullable Boolean locateConnected) {

            this.locateConnected = locateConnected;
            return this;
        }
        public ApAeroscout build() {
            final var _resultValue = new ApAeroscout();
            _resultValue.enabled = enabled;
            _resultValue.host = host;
            _resultValue.locateConnected = locateConnected;
            return _resultValue;
        }
    }
}
