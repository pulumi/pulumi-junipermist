// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WlanDnsServerRewrite {
    private @Nullable Boolean enabled;
    /**
     * @return map between radius_group and the desired DNS server (IPv4 only). Property key is the RADIUS group, property value is the desired DNS Server
     * 
     */
    private @Nullable Map<String,String> radiusGroups;

    private WlanDnsServerRewrite() {}
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return map between radius_group and the desired DNS server (IPv4 only). Property key is the RADIUS group, property value is the desired DNS Server
     * 
     */
    public Map<String,String> radiusGroups() {
        return this.radiusGroups == null ? Map.of() : this.radiusGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WlanDnsServerRewrite defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Map<String,String> radiusGroups;
        public Builder() {}
        public Builder(WlanDnsServerRewrite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.radiusGroups = defaults.radiusGroups;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder radiusGroups(@Nullable Map<String,String> radiusGroups) {

            this.radiusGroups = radiusGroups;
            return this;
        }
        public WlanDnsServerRewrite build() {
            final var _resultValue = new WlanDnsServerRewrite();
            _resultValue.enabled = enabled;
            _resultValue.radiusGroups = radiusGroups;
            return _resultValue;
        }
    }
}
