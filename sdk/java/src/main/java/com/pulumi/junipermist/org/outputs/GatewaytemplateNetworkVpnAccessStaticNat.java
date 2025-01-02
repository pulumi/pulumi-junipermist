// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GatewaytemplateNetworkVpnAccessStaticNat {
    /**
     * @return The Static NAT destination IP Address. Must be an IP Address (i.e. &#34;192.168.70.3&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    private String internalIp;
    private String name;

    private GatewaytemplateNetworkVpnAccessStaticNat() {}
    /**
     * @return The Static NAT destination IP Address. Must be an IP Address (i.e. &#34;192.168.70.3&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    public String internalIp() {
        return this.internalIp;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewaytemplateNetworkVpnAccessStaticNat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String internalIp;
        private String name;
        public Builder() {}
        public Builder(GatewaytemplateNetworkVpnAccessStaticNat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.internalIp = defaults.internalIp;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder internalIp(String internalIp) {
            if (internalIp == null) {
              throw new MissingRequiredPropertyException("GatewaytemplateNetworkVpnAccessStaticNat", "internalIp");
            }
            this.internalIp = internalIp;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GatewaytemplateNetworkVpnAccessStaticNat", "name");
            }
            this.name = name;
            return this;
        }
        public GatewaytemplateNetworkVpnAccessStaticNat build() {
            final var _resultValue = new GatewaytemplateNetworkVpnAccessStaticNat();
            _resultValue.internalIp = internalIp;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
