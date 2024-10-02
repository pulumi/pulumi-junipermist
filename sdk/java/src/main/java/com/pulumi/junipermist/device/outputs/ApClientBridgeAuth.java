// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApClientBridgeAuth {
    private @Nullable String psk;
    /**
     * @return wpa2-AES/CCMPp is assumed when `type`==`psk`. enum: `open`, `psk`
     * 
     */
    private @Nullable String type;

    private ApClientBridgeAuth() {}
    public Optional<String> psk() {
        return Optional.ofNullable(this.psk);
    }
    /**
     * @return wpa2-AES/CCMPp is assumed when `type`==`psk`. enum: `open`, `psk`
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApClientBridgeAuth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String psk;
        private @Nullable String type;
        public Builder() {}
        public Builder(ApClientBridgeAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.psk = defaults.psk;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder psk(@Nullable String psk) {

            this.psk = psk;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public ApClientBridgeAuth build() {
            final var _resultValue = new ApClientBridgeAuth();
            _resultValue.psk = psk;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}