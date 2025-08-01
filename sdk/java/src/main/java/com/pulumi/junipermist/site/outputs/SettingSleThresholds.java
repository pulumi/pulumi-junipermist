// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SettingSleThresholds {
    /**
     * @return Capacity, in %
     * 
     */
    private @Nullable Integer capacity;
    /**
     * @return Coverage, in dBm
     * 
     */
    private @Nullable Integer coverage;
    /**
     * @return Throughput, in Mbps
     * 
     */
    private @Nullable Integer throughput;
    /**
     * @return Time to connect, in seconds
     * 
     */
    private @Nullable Integer timetoconnect;

    private SettingSleThresholds() {}
    /**
     * @return Capacity, in %
     * 
     */
    public Optional<Integer> capacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * @return Coverage, in dBm
     * 
     */
    public Optional<Integer> coverage() {
        return Optional.ofNullable(this.coverage);
    }
    /**
     * @return Throughput, in Mbps
     * 
     */
    public Optional<Integer> throughput() {
        return Optional.ofNullable(this.throughput);
    }
    /**
     * @return Time to connect, in seconds
     * 
     */
    public Optional<Integer> timetoconnect() {
        return Optional.ofNullable(this.timetoconnect);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingSleThresholds defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer capacity;
        private @Nullable Integer coverage;
        private @Nullable Integer throughput;
        private @Nullable Integer timetoconnect;
        public Builder() {}
        public Builder(SettingSleThresholds defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.coverage = defaults.coverage;
    	      this.throughput = defaults.throughput;
    	      this.timetoconnect = defaults.timetoconnect;
        }

        @CustomType.Setter
        public Builder capacity(@Nullable Integer capacity) {

            this.capacity = capacity;
            return this;
        }
        @CustomType.Setter
        public Builder coverage(@Nullable Integer coverage) {

            this.coverage = coverage;
            return this;
        }
        @CustomType.Setter
        public Builder throughput(@Nullable Integer throughput) {

            this.throughput = throughput;
            return this;
        }
        @CustomType.Setter
        public Builder timetoconnect(@Nullable Integer timetoconnect) {

            this.timetoconnect = timetoconnect;
            return this;
        }
        public SettingSleThresholds build() {
            final var _resultValue = new SettingSleThresholds();
            _resultValue.capacity = capacity;
            _resultValue.coverage = coverage;
            _resultValue.throughput = throughput;
            _resultValue.timetoconnect = timetoconnect;
            return _resultValue;
        }
    }
}
