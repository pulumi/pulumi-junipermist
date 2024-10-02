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
public final class WlanAppQosOther {
    private @Nullable Integer dscp;
    private @Nullable String dstSubnet;
    private @Nullable String portRanges;
    private @Nullable String protocol;
    private @Nullable String srcSubnet;

    private WlanAppQosOther() {}
    public Optional<Integer> dscp() {
        return Optional.ofNullable(this.dscp);
    }
    public Optional<String> dstSubnet() {
        return Optional.ofNullable(this.dstSubnet);
    }
    public Optional<String> portRanges() {
        return Optional.ofNullable(this.portRanges);
    }
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    public Optional<String> srcSubnet() {
        return Optional.ofNullable(this.srcSubnet);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WlanAppQosOther defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer dscp;
        private @Nullable String dstSubnet;
        private @Nullable String portRanges;
        private @Nullable String protocol;
        private @Nullable String srcSubnet;
        public Builder() {}
        public Builder(WlanAppQosOther defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dscp = defaults.dscp;
    	      this.dstSubnet = defaults.dstSubnet;
    	      this.portRanges = defaults.portRanges;
    	      this.protocol = defaults.protocol;
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
        public Builder portRanges(@Nullable String portRanges) {

            this.portRanges = portRanges;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {

            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder srcSubnet(@Nullable String srcSubnet) {

            this.srcSubnet = srcSubnet;
            return this;
        }
        public WlanAppQosOther build() {
            final var _resultValue = new WlanAppQosOther();
            _resultValue.dscp = dscp;
            _resultValue.dstSubnet = dstSubnet;
            _resultValue.portRanges = portRanges;
            _resultValue.protocol = protocol;
            _resultValue.srcSubnet = srcSubnet;
            return _resultValue;
        }
    }
}