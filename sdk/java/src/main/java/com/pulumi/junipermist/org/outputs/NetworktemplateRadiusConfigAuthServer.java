// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworktemplateRadiusConfigAuthServer {
    /**
     * @return IP/ hostname of RADIUS server
     * 
     */
    private String host;
    private @Nullable Boolean keywrapEnabled;
    /**
     * @return enum: `ascii`, `hex`
     * 
     */
    private @Nullable String keywrapFormat;
    private @Nullable String keywrapKek;
    private @Nullable String keywrapMack;
    /**
     * @return Auth port of RADIUS server
     * 
     */
    private @Nullable Integer port;
    /**
     * @return Whether to require Message-Authenticator in requests
     * 
     */
    private @Nullable Boolean requireMessageAuthenticator;
    /**
     * @return Secret of RADIUS server
     * 
     */
    private String secret;

    private NetworktemplateRadiusConfigAuthServer() {}
    /**
     * @return IP/ hostname of RADIUS server
     * 
     */
    public String host() {
        return this.host;
    }
    public Optional<Boolean> keywrapEnabled() {
        return Optional.ofNullable(this.keywrapEnabled);
    }
    /**
     * @return enum: `ascii`, `hex`
     * 
     */
    public Optional<String> keywrapFormat() {
        return Optional.ofNullable(this.keywrapFormat);
    }
    public Optional<String> keywrapKek() {
        return Optional.ofNullable(this.keywrapKek);
    }
    public Optional<String> keywrapMack() {
        return Optional.ofNullable(this.keywrapMack);
    }
    /**
     * @return Auth port of RADIUS server
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return Whether to require Message-Authenticator in requests
     * 
     */
    public Optional<Boolean> requireMessageAuthenticator() {
        return Optional.ofNullable(this.requireMessageAuthenticator);
    }
    /**
     * @return Secret of RADIUS server
     * 
     */
    public String secret() {
        return this.secret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplateRadiusConfigAuthServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String host;
        private @Nullable Boolean keywrapEnabled;
        private @Nullable String keywrapFormat;
        private @Nullable String keywrapKek;
        private @Nullable String keywrapMack;
        private @Nullable Integer port;
        private @Nullable Boolean requireMessageAuthenticator;
        private String secret;
        public Builder() {}
        public Builder(NetworktemplateRadiusConfigAuthServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.keywrapEnabled = defaults.keywrapEnabled;
    	      this.keywrapFormat = defaults.keywrapFormat;
    	      this.keywrapKek = defaults.keywrapKek;
    	      this.keywrapMack = defaults.keywrapMack;
    	      this.port = defaults.port;
    	      this.requireMessageAuthenticator = defaults.requireMessageAuthenticator;
    	      this.secret = defaults.secret;
        }

        @CustomType.Setter
        public Builder host(String host) {
            if (host == null) {
              throw new MissingRequiredPropertyException("NetworktemplateRadiusConfigAuthServer", "host");
            }
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder keywrapEnabled(@Nullable Boolean keywrapEnabled) {

            this.keywrapEnabled = keywrapEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder keywrapFormat(@Nullable String keywrapFormat) {

            this.keywrapFormat = keywrapFormat;
            return this;
        }
        @CustomType.Setter
        public Builder keywrapKek(@Nullable String keywrapKek) {

            this.keywrapKek = keywrapKek;
            return this;
        }
        @CustomType.Setter
        public Builder keywrapMack(@Nullable String keywrapMack) {

            this.keywrapMack = keywrapMack;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder requireMessageAuthenticator(@Nullable Boolean requireMessageAuthenticator) {

            this.requireMessageAuthenticator = requireMessageAuthenticator;
            return this;
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            if (secret == null) {
              throw new MissingRequiredPropertyException("NetworktemplateRadiusConfigAuthServer", "secret");
            }
            this.secret = secret;
            return this;
        }
        public NetworktemplateRadiusConfigAuthServer build() {
            final var _resultValue = new NetworktemplateRadiusConfigAuthServer();
            _resultValue.host = host;
            _resultValue.keywrapEnabled = keywrapEnabled;
            _resultValue.keywrapFormat = keywrapFormat;
            _resultValue.keywrapKek = keywrapKek;
            _resultValue.keywrapMack = keywrapMack;
            _resultValue.port = port;
            _resultValue.requireMessageAuthenticator = requireMessageAuthenticator;
            _resultValue.secret = secret;
            return _resultValue;
        }
    }
}
