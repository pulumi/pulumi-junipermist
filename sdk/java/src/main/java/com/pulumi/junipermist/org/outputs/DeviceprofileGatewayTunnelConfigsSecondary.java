// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DeviceprofileGatewayTunnelConfigsSecondary {
    private List<String> hosts;
    /**
     * @return Only if `provider`==`zscaler-gre`, `provider`==`jse-ipsec`, `provider`==`custom-ipsec` or `provider`==`custom-gre`
     * 
     */
    private @Nullable List<String> internalIps;
    private @Nullable List<String> probeIps;
    /**
     * @return Only if  `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
     * 
     */
    private @Nullable List<String> remoteIds;
    private List<String> wanNames;

    private DeviceprofileGatewayTunnelConfigsSecondary() {}
    public List<String> hosts() {
        return this.hosts;
    }
    /**
     * @return Only if `provider`==`zscaler-gre`, `provider`==`jse-ipsec`, `provider`==`custom-ipsec` or `provider`==`custom-gre`
     * 
     */
    public List<String> internalIps() {
        return this.internalIps == null ? List.of() : this.internalIps;
    }
    public List<String> probeIps() {
        return this.probeIps == null ? List.of() : this.probeIps;
    }
    /**
     * @return Only if  `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
     * 
     */
    public List<String> remoteIds() {
        return this.remoteIds == null ? List.of() : this.remoteIds;
    }
    public List<String> wanNames() {
        return this.wanNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceprofileGatewayTunnelConfigsSecondary defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> hosts;
        private @Nullable List<String> internalIps;
        private @Nullable List<String> probeIps;
        private @Nullable List<String> remoteIds;
        private List<String> wanNames;
        public Builder() {}
        public Builder(DeviceprofileGatewayTunnelConfigsSecondary defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hosts = defaults.hosts;
    	      this.internalIps = defaults.internalIps;
    	      this.probeIps = defaults.probeIps;
    	      this.remoteIds = defaults.remoteIds;
    	      this.wanNames = defaults.wanNames;
        }

        @CustomType.Setter
        public Builder hosts(List<String> hosts) {
            if (hosts == null) {
              throw new MissingRequiredPropertyException("DeviceprofileGatewayTunnelConfigsSecondary", "hosts");
            }
            this.hosts = hosts;
            return this;
        }
        public Builder hosts(String... hosts) {
            return hosts(List.of(hosts));
        }
        @CustomType.Setter
        public Builder internalIps(@Nullable List<String> internalIps) {

            this.internalIps = internalIps;
            return this;
        }
        public Builder internalIps(String... internalIps) {
            return internalIps(List.of(internalIps));
        }
        @CustomType.Setter
        public Builder probeIps(@Nullable List<String> probeIps) {

            this.probeIps = probeIps;
            return this;
        }
        public Builder probeIps(String... probeIps) {
            return probeIps(List.of(probeIps));
        }
        @CustomType.Setter
        public Builder remoteIds(@Nullable List<String> remoteIds) {

            this.remoteIds = remoteIds;
            return this;
        }
        public Builder remoteIds(String... remoteIds) {
            return remoteIds(List.of(remoteIds));
        }
        @CustomType.Setter
        public Builder wanNames(List<String> wanNames) {
            if (wanNames == null) {
              throw new MissingRequiredPropertyException("DeviceprofileGatewayTunnelConfigsSecondary", "wanNames");
            }
            this.wanNames = wanNames;
            return this;
        }
        public Builder wanNames(String... wanNames) {
            return wanNames(List.of(wanNames));
        }
        public DeviceprofileGatewayTunnelConfigsSecondary build() {
            final var _resultValue = new DeviceprofileGatewayTunnelConfigsSecondary();
            _resultValue.hosts = hosts;
            _resultValue.internalIps = internalIps;
            _resultValue.probeIps = probeIps;
            _resultValue.remoteIds = remoteIds;
            _resultValue.wanNames = wanNames;
            return _resultValue;
        }
    }
}
