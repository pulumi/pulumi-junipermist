// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWlansSiteWlanCoaServer {
    /**
     * @return Whether to disable Event-Timestamp Check
     * 
     */
    private Boolean disableEventTimestampCheck;
    private Boolean enabled;
    private String ip;
    private Integer port;
    private String secret;

    private GetWlansSiteWlanCoaServer() {}
    /**
     * @return Whether to disable Event-Timestamp Check
     * 
     */
    public Boolean disableEventTimestampCheck() {
        return this.disableEventTimestampCheck;
    }
    public Boolean enabled() {
        return this.enabled;
    }
    public String ip() {
        return this.ip;
    }
    public Integer port() {
        return this.port;
    }
    public String secret() {
        return this.secret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWlansSiteWlanCoaServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean disableEventTimestampCheck;
        private Boolean enabled;
        private String ip;
        private Integer port;
        private String secret;
        public Builder() {}
        public Builder(GetWlansSiteWlanCoaServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableEventTimestampCheck = defaults.disableEventTimestampCheck;
    	      this.enabled = defaults.enabled;
    	      this.ip = defaults.ip;
    	      this.port = defaults.port;
    	      this.secret = defaults.secret;
        }

        @CustomType.Setter
        public Builder disableEventTimestampCheck(Boolean disableEventTimestampCheck) {
            if (disableEventTimestampCheck == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanCoaServer", "disableEventTimestampCheck");
            }
            this.disableEventTimestampCheck = disableEventTimestampCheck;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanCoaServer", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder ip(String ip) {
            if (ip == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanCoaServer", "ip");
            }
            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanCoaServer", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            if (secret == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanCoaServer", "secret");
            }
            this.secret = secret;
            return this;
        }
        public GetWlansSiteWlanCoaServer build() {
            final var _resultValue = new GetWlansSiteWlanCoaServer();
            _resultValue.disableEventTimestampCheck = disableEventTimestampCheck;
            _resultValue.enabled = enabled;
            _resultValue.ip = ip;
            _resultValue.port = port;
            _resultValue.secret = secret;
            return _resultValue;
        }
    }
}
