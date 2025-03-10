// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.device.outputs.ApClientBridgeAuth;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApClientBridge {
    private @Nullable ApClientBridgeAuth auth;
    /**
     * @return When acted as client bridge:
     *   * only 5G radio can be used
     *   * will not serve as AP on any radios
     * 
     */
    private @Nullable Boolean enabled;
    private @Nullable String ssid;

    private ApClientBridge() {}
    public Optional<ApClientBridgeAuth> auth() {
        return Optional.ofNullable(this.auth);
    }
    /**
     * @return When acted as client bridge:
     *   * only 5G radio can be used
     *   * will not serve as AP on any radios
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> ssid() {
        return Optional.ofNullable(this.ssid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApClientBridge defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ApClientBridgeAuth auth;
        private @Nullable Boolean enabled;
        private @Nullable String ssid;
        public Builder() {}
        public Builder(ApClientBridge defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.enabled = defaults.enabled;
    	      this.ssid = defaults.ssid;
        }

        @CustomType.Setter
        public Builder auth(@Nullable ApClientBridgeAuth auth) {

            this.auth = auth;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder ssid(@Nullable String ssid) {

            this.ssid = ssid;
            return this;
        }
        public ApClientBridge build() {
            final var _resultValue = new ApClientBridge();
            _resultValue.auth = auth;
            _resultValue.enabled = enabled;
            _resultValue.ssid = ssid;
            return _resultValue;
        }
    }
}
