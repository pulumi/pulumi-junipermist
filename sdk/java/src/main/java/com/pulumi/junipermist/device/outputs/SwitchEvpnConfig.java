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
public final class SwitchEvpnConfig {
    private @Nullable Boolean enabled;
    /**
     * @return enum: `access`, `collapsed-core`, `core`, `distribution`, `esilag-access`, `none`
     * 
     */
    private @Nullable String role;

    private SwitchEvpnConfig() {}
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return enum: `access`, `collapsed-core`, `core`, `distribution`, `esilag-access`, `none`
     * 
     */
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchEvpnConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String role;
        public Builder() {}
        public Builder(SwitchEvpnConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.role = defaults.role;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder role(@Nullable String role) {

            this.role = role;
            return this;
        }
        public SwitchEvpnConfig build() {
            final var _resultValue = new SwitchEvpnConfig();
            _resultValue.enabled = enabled;
            _resultValue.role = role;
            return _resultValue;
        }
    }
}
