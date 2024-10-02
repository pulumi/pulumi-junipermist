// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchAclTagsSpec {
    /**
     * @return matched dst port, &#34;0&#34; means any
     * 
     */
    private @Nullable String portRange;
    /**
     * @return `tcp` / `udp` / `icmp` / `gre` / `any` / `:protocol_number`. `protocol_number` is between 1-254
     * 
     */
    private @Nullable String protocol;

    private SwitchAclTagsSpec() {}
    /**
     * @return matched dst port, &#34;0&#34; means any
     * 
     */
    public Optional<String> portRange() {
        return Optional.ofNullable(this.portRange);
    }
    /**
     * @return `tcp` / `udp` / `icmp` / `gre` / `any` / `:protocol_number`. `protocol_number` is between 1-254
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchAclTagsSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String portRange;
        private @Nullable String protocol;
        public Builder() {}
        public Builder(SwitchAclTagsSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.portRange = defaults.portRange;
    	      this.protocol = defaults.protocol;
        }

        @CustomType.Setter
        public Builder portRange(@Nullable String portRange) {

            this.portRange = portRange;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {

            this.protocol = protocol;
            return this;
        }
        public SwitchAclTagsSpec build() {
            final var _resultValue = new SwitchAclTagsSpec();
            _resultValue.portRange = portRange;
            _resultValue.protocol = protocol;
            return _resultValue;
        }
    }
}