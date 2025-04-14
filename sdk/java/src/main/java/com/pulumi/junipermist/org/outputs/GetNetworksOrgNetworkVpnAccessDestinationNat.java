// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNetworksOrgNetworkVpnAccessDestinationNat {
    /**
     * @return The Destination NAT destination IP Address. Must be an IP (i.e. &#34;192.168.70.30&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    private String internalIp;
    private String name;
    private String port;

    private GetNetworksOrgNetworkVpnAccessDestinationNat() {}
    /**
     * @return The Destination NAT destination IP Address. Must be an IP (i.e. &#34;192.168.70.30&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    public String internalIp() {
        return this.internalIp;
    }
    public String name() {
        return this.name;
    }
    public String port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworksOrgNetworkVpnAccessDestinationNat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String internalIp;
        private String name;
        private String port;
        public Builder() {}
        public Builder(GetNetworksOrgNetworkVpnAccessDestinationNat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.internalIp = defaults.internalIp;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
        }

        @CustomType.Setter
        public Builder internalIp(String internalIp) {
            if (internalIp == null) {
              throw new MissingRequiredPropertyException("GetNetworksOrgNetworkVpnAccessDestinationNat", "internalIp");
            }
            this.internalIp = internalIp;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetNetworksOrgNetworkVpnAccessDestinationNat", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder port(String port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetNetworksOrgNetworkVpnAccessDestinationNat", "port");
            }
            this.port = port;
            return this;
        }
        public GetNetworksOrgNetworkVpnAccessDestinationNat build() {
            final var _resultValue = new GetNetworksOrgNetworkVpnAccessDestinationNat();
            _resultValue.internalIp = internalIp;
            _resultValue.name = name;
            _resultValue.port = port;
            return _resultValue;
        }
    }
}
