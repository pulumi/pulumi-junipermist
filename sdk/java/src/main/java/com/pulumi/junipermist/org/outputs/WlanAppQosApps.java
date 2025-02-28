// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WlanAppQosApps {
    private @Nullable Integer dscp;
    /**
     * @return Subnet filter is not required but helps AP to only inspect certain traffic (thus reducing AP load)
     * 
     */
    private @Nullable String dstSubnet;
    /**
     * @return Subnet filter is not required but helps AP to only inspect certain traffic (thus reducing AP load)
     * 
     */
    private @Nullable String srcSubnet;

    private WlanAppQosApps() {}
    public Optional<Integer> dscp() {
        return Optional.ofNullable(this.dscp);
    }
    /**
     * @return Subnet filter is not required but helps AP to only inspect certain traffic (thus reducing AP load)
     * 
     */
    public Optional<String> dstSubnet() {
        return Optional.ofNullable(this.dstSubnet);
    }
    /**
     * @return Subnet filter is not required but helps AP to only inspect certain traffic (thus reducing AP load)
     * 
     */
    public Optional<String> srcSubnet() {
        return Optional.ofNullable(this.srcSubnet);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WlanAppQosApps defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer dscp;
        private @Nullable String dstSubnet;
        private @Nullable String srcSubnet;
        public Builder() {}
        public Builder(WlanAppQosApps defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dscp = defaults.dscp;
    	      this.dstSubnet = defaults.dstSubnet;
    	      this.srcSubnet = defaults.srcSubnet;
        }

        @CustomType.Setter
        public Builder dscp(@Nullable Integer dscp) {

            this.dscp = dscp;
            return this;
        }
        @CustomType.Setter
        public Builder dstSubnet(@Nullable String dstSubnet) {

            this.dstSubnet = dstSubnet;
            return this;
        }
        @CustomType.Setter
        public Builder srcSubnet(@Nullable String srcSubnet) {

            this.srcSubnet = srcSubnet;
            return this;
        }
        public WlanAppQosApps build() {
            final var _resultValue = new WlanAppQosApps();
            _resultValue.dscp = dscp;
            _resultValue.dstSubnet = dstSubnet;
            _resultValue.srcSubnet = srcSubnet;
            return _resultValue;
        }
    }
}
