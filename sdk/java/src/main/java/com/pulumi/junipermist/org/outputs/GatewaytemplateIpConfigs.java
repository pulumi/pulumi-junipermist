// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewaytemplateIpConfigs {
    private String ip;
    private String netmask;
    /**
     * @return Optional list of secondary IPs in CIDR format
     * 
     */
    private @Nullable List<String> secondaryIps;
    /**
     * @return enum: `dhcp`, `static`
     * 
     */
    private @Nullable String type;

    private GatewaytemplateIpConfigs() {}
    public String ip() {
        return this.ip;
    }
    public String netmask() {
        return this.netmask;
    }
    /**
     * @return Optional list of secondary IPs in CIDR format
     * 
     */
    public List<String> secondaryIps() {
        return this.secondaryIps == null ? List.of() : this.secondaryIps;
    }
    /**
     * @return enum: `dhcp`, `static`
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewaytemplateIpConfigs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ip;
        private String netmask;
        private @Nullable List<String> secondaryIps;
        private @Nullable String type;
        public Builder() {}
        public Builder(GatewaytemplateIpConfigs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
    	      this.netmask = defaults.netmask;
    	      this.secondaryIps = defaults.secondaryIps;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder ip(String ip) {
            if (ip == null) {
              throw new MissingRequiredPropertyException("GatewaytemplateIpConfigs", "ip");
            }
            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder netmask(String netmask) {
            if (netmask == null) {
              throw new MissingRequiredPropertyException("GatewaytemplateIpConfigs", "netmask");
            }
            this.netmask = netmask;
            return this;
        }
        @CustomType.Setter
        public Builder secondaryIps(@Nullable List<String> secondaryIps) {

            this.secondaryIps = secondaryIps;
            return this;
        }
        public Builder secondaryIps(String... secondaryIps) {
            return secondaryIps(List.of(secondaryIps));
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public GatewaytemplateIpConfigs build() {
            final var _resultValue = new GatewaytemplateIpConfigs();
            _resultValue.ip = ip;
            _resultValue.netmask = netmask;
            _resultValue.secondaryIps = secondaryIps;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
