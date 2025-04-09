// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayBgpConfigNeighbors {
    /**
     * @return If true, the BGP session to this neighbor will be administratively disabled/shutdown
     * 
     */
    private @Nullable Boolean disabled;
    private @Nullable String exportPolicy;
    private @Nullable Integer holdTime;
    private @Nullable String importPolicy;
    /**
     * @return Assuming BGP neighbor is directly connected
     * 
     */
    private @Nullable Integer multihopTtl;
    /**
     * @return Neighbor AS. Value must be in range 1-4294967295 or a variable (e.g. `{{as_variable}}`)
     * 
     */
    private @Nullable String neighborAs;

    private GatewayBgpConfigNeighbors() {}
    /**
     * @return If true, the BGP session to this neighbor will be administratively disabled/shutdown
     * 
     */
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    public Optional<String> exportPolicy() {
        return Optional.ofNullable(this.exportPolicy);
    }
    public Optional<Integer> holdTime() {
        return Optional.ofNullable(this.holdTime);
    }
    public Optional<String> importPolicy() {
        return Optional.ofNullable(this.importPolicy);
    }
    /**
     * @return Assuming BGP neighbor is directly connected
     * 
     */
    public Optional<Integer> multihopTtl() {
        return Optional.ofNullable(this.multihopTtl);
    }
    /**
     * @return Neighbor AS. Value must be in range 1-4294967295 or a variable (e.g. `{{as_variable}}`)
     * 
     */
    public Optional<String> neighborAs() {
        return Optional.ofNullable(this.neighborAs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayBgpConfigNeighbors defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean disabled;
        private @Nullable String exportPolicy;
        private @Nullable Integer holdTime;
        private @Nullable String importPolicy;
        private @Nullable Integer multihopTtl;
        private @Nullable String neighborAs;
        public Builder() {}
        public Builder(GatewayBgpConfigNeighbors defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.exportPolicy = defaults.exportPolicy;
    	      this.holdTime = defaults.holdTime;
    	      this.importPolicy = defaults.importPolicy;
    	      this.multihopTtl = defaults.multihopTtl;
    	      this.neighborAs = defaults.neighborAs;
        }

        @CustomType.Setter
        public Builder disabled(@Nullable Boolean disabled) {

            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder exportPolicy(@Nullable String exportPolicy) {

            this.exportPolicy = exportPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder holdTime(@Nullable Integer holdTime) {

            this.holdTime = holdTime;
            return this;
        }
        @CustomType.Setter
        public Builder importPolicy(@Nullable String importPolicy) {

            this.importPolicy = importPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder multihopTtl(@Nullable Integer multihopTtl) {

            this.multihopTtl = multihopTtl;
            return this;
        }
        @CustomType.Setter
        public Builder neighborAs(@Nullable String neighborAs) {

            this.neighborAs = neighborAs;
            return this;
        }
        public GatewayBgpConfigNeighbors build() {
            final var _resultValue = new GatewayBgpConfigNeighbors();
            _resultValue.disabled = disabled;
            _resultValue.exportPolicy = exportPolicy;
            _resultValue.holdTime = holdTime;
            _resultValue.importPolicy = importPolicy;
            _resultValue.multihopTtl = multihopTtl;
            _resultValue.neighborAs = neighborAs;
            return _resultValue;
        }
    }
}
