// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchStpConfig {
    /**
     * @return Switch STP priority: from `0k` to `15k`
     * 
     */
    private @Nullable String bridgePriority;

    private SwitchStpConfig() {}
    /**
     * @return Switch STP priority: from `0k` to `15k`
     * 
     */
    public Optional<String> bridgePriority() {
        return Optional.ofNullable(this.bridgePriority);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchStpConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bridgePriority;
        public Builder() {}
        public Builder(SwitchStpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bridgePriority = defaults.bridgePriority;
        }

        @CustomType.Setter
        public Builder bridgePriority(@Nullable String bridgePriority) {

            this.bridgePriority = bridgePriority;
            return this;
        }
        public SwitchStpConfig build() {
            final var _resultValue = new SwitchStpConfig();
            _resultValue.bridgePriority = bridgePriority;
            return _resultValue;
        }
    }
}
