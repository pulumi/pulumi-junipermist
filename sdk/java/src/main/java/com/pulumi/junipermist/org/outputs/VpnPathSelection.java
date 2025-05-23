// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VpnPathSelection {
    /**
     * @return enum: `disabled`, `simple`, `manual`
     * 
     */
    private @Nullable String strategy;

    private VpnPathSelection() {}
    /**
     * @return enum: `disabled`, `simple`, `manual`
     * 
     */
    public Optional<String> strategy() {
        return Optional.ofNullable(this.strategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnPathSelection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String strategy;
        public Builder() {}
        public Builder(VpnPathSelection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.strategy = defaults.strategy;
        }

        @CustomType.Setter
        public Builder strategy(@Nullable String strategy) {

            this.strategy = strategy;
            return this;
        }
        public VpnPathSelection build() {
            final var _resultValue = new VpnPathSelection();
            _resultValue.strategy = strategy;
            return _resultValue;
        }
    }
}
