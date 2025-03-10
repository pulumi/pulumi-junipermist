// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWlansSiteWlanRadsecServer {
    private String host;
    private Integer port;

    private GetWlansSiteWlanRadsecServer() {}
    public String host() {
        return this.host;
    }
    public Integer port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWlansSiteWlanRadsecServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String host;
        private Integer port;
        public Builder() {}
        public Builder(GetWlansSiteWlanRadsecServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        @CustomType.Setter
        public Builder host(String host) {
            if (host == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanRadsecServer", "host");
            }
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanRadsecServer", "port");
            }
            this.port = port;
            return this;
        }
        public GetWlansSiteWlanRadsecServer build() {
            final var _resultValue = new GetWlansSiteWlanRadsecServer();
            _resultValue.host = host;
            _resultValue.port = port;
            return _resultValue;
        }
    }
}
