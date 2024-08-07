// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SettingSsr {
    private @Nullable List<String> conductorHosts;
    private @Nullable Boolean disableStats;

    private SettingSsr() {}
    public List<String> conductorHosts() {
        return this.conductorHosts == null ? List.of() : this.conductorHosts;
    }
    public Optional<Boolean> disableStats() {
        return Optional.ofNullable(this.disableStats);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingSsr defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> conductorHosts;
        private @Nullable Boolean disableStats;
        public Builder() {}
        public Builder(SettingSsr defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conductorHosts = defaults.conductorHosts;
    	      this.disableStats = defaults.disableStats;
        }

        @CustomType.Setter
        public Builder conductorHosts(@Nullable List<String> conductorHosts) {

            this.conductorHosts = conductorHosts;
            return this;
        }
        public Builder conductorHosts(String... conductorHosts) {
            return conductorHosts(List.of(conductorHosts));
        }
        @CustomType.Setter
        public Builder disableStats(@Nullable Boolean disableStats) {

            this.disableStats = disableStats;
            return this;
        }
        public SettingSsr build() {
            final var _resultValue = new SettingSsr();
            _resultValue.conductorHosts = conductorHosts;
            _resultValue.disableStats = disableStats;
            return _resultValue;
        }
    }
}
