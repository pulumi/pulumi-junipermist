// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWlansOrgWlanAcctServer {
    /**
     * @return IP/ hostname of RADIUS server
     * 
     */
    private String host;
    private Boolean keywrapEnabled;
    /**
     * @return enum: `ascii`, `hex`
     * 
     */
    private String keywrapFormat;
    private String keywrapKek;
    private String keywrapMack;
    /**
     * @return Acct port of RADIUS server
     * 
     */
    private Integer port;
    /**
     * @return Secret of RADIUS server
     * 
     */
    private String secret;

    private GetWlansOrgWlanAcctServer() {}
    /**
     * @return IP/ hostname of RADIUS server
     * 
     */
    public String host() {
        return this.host;
    }
    public Boolean keywrapEnabled() {
        return this.keywrapEnabled;
    }
    /**
     * @return enum: `ascii`, `hex`
     * 
     */
    public String keywrapFormat() {
        return this.keywrapFormat;
    }
    public String keywrapKek() {
        return this.keywrapKek;
    }
    public String keywrapMack() {
        return this.keywrapMack;
    }
    /**
     * @return Acct port of RADIUS server
     * 
     */
    public Integer port() {
        return this.port;
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

    public static Builder builder(GetWlansOrgWlanAcctServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String host;
        private Boolean keywrapEnabled;
        private String keywrapFormat;
        private String keywrapKek;
        private String keywrapMack;
        private Integer port;
        private String secret;
        public Builder() {}
        public Builder(GetWlansOrgWlanAcctServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.keywrapEnabled = defaults.keywrapEnabled;
    	      this.keywrapFormat = defaults.keywrapFormat;
    	      this.keywrapKek = defaults.keywrapKek;
    	      this.keywrapMack = defaults.keywrapMack;
    	      this.port = defaults.port;
    	      this.secret = defaults.secret;
        }

        @CustomType.Setter
        public Builder host(String host) {
            if (host == null) {
              throw new MissingRequiredPropertyException("GetWlansOrgWlanAcctServer", "host");
            }
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder keywrapEnabled(Boolean keywrapEnabled) {
            if (keywrapEnabled == null) {
              throw new MissingRequiredPropertyException("GetWlansOrgWlanAcctServer", "keywrapEnabled");
            }
            this.keywrapEnabled = keywrapEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder keywrapFormat(String keywrapFormat) {
            if (keywrapFormat == null) {
              throw new MissingRequiredPropertyException("GetWlansOrgWlanAcctServer", "keywrapFormat");
            }
            this.keywrapFormat = keywrapFormat;
            return this;
        }
        @CustomType.Setter
        public Builder keywrapKek(String keywrapKek) {
            if (keywrapKek == null) {
              throw new MissingRequiredPropertyException("GetWlansOrgWlanAcctServer", "keywrapKek");
            }
            this.keywrapKek = keywrapKek;
            return this;
        }
        @CustomType.Setter
        public Builder keywrapMack(String keywrapMack) {
            if (keywrapMack == null) {
              throw new MissingRequiredPropertyException("GetWlansOrgWlanAcctServer", "keywrapMack");
            }
            this.keywrapMack = keywrapMack;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetWlansOrgWlanAcctServer", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            if (secret == null) {
              throw new MissingRequiredPropertyException("GetWlansOrgWlanAcctServer", "secret");
            }
            this.secret = secret;
            return this;
        }
        public GetWlansOrgWlanAcctServer build() {
            final var _resultValue = new GetWlansOrgWlanAcctServer();
            _resultValue.host = host;
            _resultValue.keywrapEnabled = keywrapEnabled;
            _resultValue.keywrapFormat = keywrapFormat;
            _resultValue.keywrapKek = keywrapKek;
            _resultValue.keywrapMack = keywrapMack;
            _resultValue.port = port;
            _resultValue.secret = secret;
            return _resultValue;
        }
    }
}
