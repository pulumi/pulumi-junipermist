// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SettingJuniperSrxGateway {
    private @Nullable String apiKey;
    private @Nullable String apiPassword;
    private @Nullable String apiUrl;

    private SettingJuniperSrxGateway() {}
    public Optional<String> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }
    public Optional<String> apiPassword() {
        return Optional.ofNullable(this.apiPassword);
    }
    public Optional<String> apiUrl() {
        return Optional.ofNullable(this.apiUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingJuniperSrxGateway defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiKey;
        private @Nullable String apiPassword;
        private @Nullable String apiUrl;
        public Builder() {}
        public Builder(SettingJuniperSrxGateway defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.apiPassword = defaults.apiPassword;
    	      this.apiUrl = defaults.apiUrl;
        }

        @CustomType.Setter
        public Builder apiKey(@Nullable String apiKey) {

            this.apiKey = apiKey;
            return this;
        }
        @CustomType.Setter
        public Builder apiPassword(@Nullable String apiPassword) {

            this.apiPassword = apiPassword;
            return this;
        }
        @CustomType.Setter
        public Builder apiUrl(@Nullable String apiUrl) {

            this.apiUrl = apiUrl;
            return this;
        }
        public SettingJuniperSrxGateway build() {
            final var _resultValue = new SettingJuniperSrxGateway();
            _resultValue.apiKey = apiKey;
            _resultValue.apiPassword = apiPassword;
            _resultValue.apiUrl = apiUrl;
            return _resultValue;
        }
    }
}
