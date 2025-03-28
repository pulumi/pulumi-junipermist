// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WlanAirwatch {
    /**
     * @return API Key
     * 
     */
    private @Nullable String apiKey;
    /**
     * @return Console URL
     * 
     */
    private @Nullable String consoleUrl;
    private @Nullable Boolean enabled;
    /**
     * @return Password
     * 
     */
    private @Nullable String password;
    /**
     * @return Username
     * 
     */
    private @Nullable String username;

    private WlanAirwatch() {}
    /**
     * @return API Key
     * 
     */
    public Optional<String> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }
    /**
     * @return Console URL
     * 
     */
    public Optional<String> consoleUrl() {
        return Optional.ofNullable(this.consoleUrl);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Password
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return Username
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WlanAirwatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiKey;
        private @Nullable String consoleUrl;
        private @Nullable Boolean enabled;
        private @Nullable String password;
        private @Nullable String username;
        public Builder() {}
        public Builder(WlanAirwatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.consoleUrl = defaults.consoleUrl;
    	      this.enabled = defaults.enabled;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder apiKey(@Nullable String apiKey) {

            this.apiKey = apiKey;
            return this;
        }
        @CustomType.Setter
        public Builder consoleUrl(@Nullable String consoleUrl) {

            this.consoleUrl = consoleUrl;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {

            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {

            this.username = username;
            return this;
        }
        public WlanAirwatch build() {
            final var _resultValue = new WlanAirwatch();
            _resultValue.apiKey = apiKey;
            _resultValue.consoleUrl = consoleUrl;
            _resultValue.enabled = enabled;
            _resultValue.password = password;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
