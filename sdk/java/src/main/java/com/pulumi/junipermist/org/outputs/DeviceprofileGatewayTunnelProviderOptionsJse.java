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
public final class DeviceprofileGatewayTunnelProviderOptionsJse {
    private @Nullable Integer numUsers;
    /**
     * @return JSE Organization name
     * 
     */
    private @Nullable String orgName;

    private DeviceprofileGatewayTunnelProviderOptionsJse() {}
    public Optional<Integer> numUsers() {
        return Optional.ofNullable(this.numUsers);
    }
    /**
     * @return JSE Organization name
     * 
     */
    public Optional<String> orgName() {
        return Optional.ofNullable(this.orgName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceprofileGatewayTunnelProviderOptionsJse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer numUsers;
        private @Nullable String orgName;
        public Builder() {}
        public Builder(DeviceprofileGatewayTunnelProviderOptionsJse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numUsers = defaults.numUsers;
    	      this.orgName = defaults.orgName;
        }

        @CustomType.Setter
        public Builder numUsers(@Nullable Integer numUsers) {

            this.numUsers = numUsers;
            return this;
        }
        @CustomType.Setter
        public Builder orgName(@Nullable String orgName) {

            this.orgName = orgName;
            return this;
        }
        public DeviceprofileGatewayTunnelProviderOptionsJse build() {
            final var _resultValue = new DeviceprofileGatewayTunnelProviderOptionsJse();
            _resultValue.numUsers = numUsers;
            _resultValue.orgName = orgName;
            return _resultValue;
        }
    }
}
