// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.org.outputs.DeviceprofileGatewayNetworkMulticastGroups;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceprofileGatewayNetworkMulticast {
    /**
     * @return If the network will only be the soruce of the multicast traffic, IGMP can be disabled
     * 
     */
    private @Nullable Boolean disableIgmp;
    private @Nullable Boolean enabled;
    /**
     * @return Group address to RP (rendezvous point) mapping. Property Key is the CIDR (example &#34;225.1.0.3/32&#34;)
     * 
     */
    private @Nullable Map<String,DeviceprofileGatewayNetworkMulticastGroups> groups;

    private DeviceprofileGatewayNetworkMulticast() {}
    /**
     * @return If the network will only be the soruce of the multicast traffic, IGMP can be disabled
     * 
     */
    public Optional<Boolean> disableIgmp() {
        return Optional.ofNullable(this.disableIgmp);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Group address to RP (rendezvous point) mapping. Property Key is the CIDR (example &#34;225.1.0.3/32&#34;)
     * 
     */
    public Map<String,DeviceprofileGatewayNetworkMulticastGroups> groups() {
        return this.groups == null ? Map.of() : this.groups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceprofileGatewayNetworkMulticast defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean disableIgmp;
        private @Nullable Boolean enabled;
        private @Nullable Map<String,DeviceprofileGatewayNetworkMulticastGroups> groups;
        public Builder() {}
        public Builder(DeviceprofileGatewayNetworkMulticast defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableIgmp = defaults.disableIgmp;
    	      this.enabled = defaults.enabled;
    	      this.groups = defaults.groups;
        }

        @CustomType.Setter
        public Builder disableIgmp(@Nullable Boolean disableIgmp) {

            this.disableIgmp = disableIgmp;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder groups(@Nullable Map<String,DeviceprofileGatewayNetworkMulticastGroups> groups) {

            this.groups = groups;
            return this;
        }
        public DeviceprofileGatewayNetworkMulticast build() {
            final var _resultValue = new DeviceprofileGatewayNetworkMulticast();
            _resultValue.disableIgmp = disableIgmp;
            _resultValue.enabled = enabled;
            _resultValue.groups = groups;
            return _resultValue;
        }
    }
}
