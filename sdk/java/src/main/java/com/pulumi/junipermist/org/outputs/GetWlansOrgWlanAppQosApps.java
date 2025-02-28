// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWlansOrgWlanAppQosApps {
    private Integer dscp;
    /**
     * @return Subnet filter is not required but helps AP to only inspect certain traffic (thus reducing AP load)
     * 
     */
    private String dstSubnet;
    /**
     * @return Subnet filter is not required but helps AP to only inspect certain traffic (thus reducing AP load)
     * 
     */
    private String srcSubnet;

    private GetWlansOrgWlanAppQosApps() {}
    public Integer dscp() {
        return this.dscp;
    }
    /**
     * @return Subnet filter is not required but helps AP to only inspect certain traffic (thus reducing AP load)
     * 
     */
    public String dstSubnet() {
        return this.dstSubnet;
    }
    /**
     * @return Subnet filter is not required but helps AP to only inspect certain traffic (thus reducing AP load)
     * 
     */
    public String srcSubnet() {
        return this.srcSubnet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWlansOrgWlanAppQosApps defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer dscp;
        private String dstSubnet;
        private String srcSubnet;
        public Builder() {}
        public Builder(GetWlansOrgWlanAppQosApps defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dscp = defaults.dscp;
    	      this.dstSubnet = defaults.dstSubnet;
    	      this.srcSubnet = defaults.srcSubnet;
        }

        @CustomType.Setter
        public Builder dscp(Integer dscp) {
            if (dscp == null) {
              throw new MissingRequiredPropertyException("GetWlansOrgWlanAppQosApps", "dscp");
            }
            this.dscp = dscp;
            return this;
        }
        @CustomType.Setter
        public Builder dstSubnet(String dstSubnet) {
            if (dstSubnet == null) {
              throw new MissingRequiredPropertyException("GetWlansOrgWlanAppQosApps", "dstSubnet");
            }
            this.dstSubnet = dstSubnet;
            return this;
        }
        @CustomType.Setter
        public Builder srcSubnet(String srcSubnet) {
            if (srcSubnet == null) {
              throw new MissingRequiredPropertyException("GetWlansOrgWlanAppQosApps", "srcSubnet");
            }
            this.srcSubnet = srcSubnet;
            return this;
        }
        public GetWlansOrgWlanAppQosApps build() {
            final var _resultValue = new GetWlansOrgWlanAppQosApps();
            _resultValue.dscp = dscp;
            _resultValue.dstSubnet = dstSubnet;
            _resultValue.srcSubnet = srcSubnet;
            return _resultValue;
        }
    }
}
