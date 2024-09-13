// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchStpConfig {
    /**
     * @return ignored for switches participating in EVPN
     * 
     */
    private @Nullable Boolean vstpEnabled;

    private SwitchStpConfig() {}
    /**
     * @return ignored for switches participating in EVPN
     * 
     */
    public Optional<Boolean> vstpEnabled() {
        return Optional.ofNullable(this.vstpEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchStpConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean vstpEnabled;
        public Builder() {}
        public Builder(SwitchStpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vstpEnabled = defaults.vstpEnabled;
        }

        @CustomType.Setter
        public Builder vstpEnabled(@Nullable Boolean vstpEnabled) {

            this.vstpEnabled = vstpEnabled;
            return this;
        }
        public SwitchStpConfig build() {
            final var _resultValue = new SwitchStpConfig();
            _resultValue.vstpEnabled = vstpEnabled;
            return _resultValue;
        }
    }
}
