// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNetworksOrgNetworkInternetAccessDestinationNat {
    /**
     * @return The Destination NAT destination IP Address. Must be an IP (i.e. &#34;192.168.70.30&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    private String internalIp;
    private String name;
    /**
     * @return The Destination NAT destination IP Address. Must be a Port (i.e. &#34;443&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    private String port;
    /**
     * @return SRX Only. If not set, we configure the nat policies against all WAN ports for simplicity
     * 
     */
    private String wanName;

    private GetNetworksOrgNetworkInternetAccessDestinationNat() {}
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
    /**
     * @return The Destination NAT destination IP Address. Must be a Port (i.e. &#34;443&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    public String port() {
        return this.port;
    }
    /**
     * @return SRX Only. If not set, we configure the nat policies against all WAN ports for simplicity
     * 
     */
    public String wanName() {
        return this.wanName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworksOrgNetworkInternetAccessDestinationNat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String internalIp;
        private String name;
        private String port;
        private String wanName;
        public Builder() {}
        public Builder(GetNetworksOrgNetworkInternetAccessDestinationNat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.internalIp = defaults.internalIp;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.wanName = defaults.wanName;
        }

        @CustomType.Setter
        public Builder internalIp(String internalIp) {
            if (internalIp == null) {
              throw new MissingRequiredPropertyException("GetNetworksOrgNetworkInternetAccessDestinationNat", "internalIp");
            }
            this.internalIp = internalIp;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetNetworksOrgNetworkInternetAccessDestinationNat", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder port(String port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetNetworksOrgNetworkInternetAccessDestinationNat", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder wanName(String wanName) {
            if (wanName == null) {
              throw new MissingRequiredPropertyException("GetNetworksOrgNetworkInternetAccessDestinationNat", "wanName");
            }
            this.wanName = wanName;
            return this;
        }
        public GetNetworksOrgNetworkInternetAccessDestinationNat build() {
            final var _resultValue = new GetNetworksOrgNetworkInternetAccessDestinationNat();
            _resultValue.internalIp = internalIp;
            _resultValue.name = name;
            _resultValue.port = port;
            _resultValue.wanName = wanName;
            return _resultValue;
        }
    }
}
