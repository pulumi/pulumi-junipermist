// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileGatewayNetworkInternalAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileGatewayNetworkInternalAccessArgs Empty = new DeviceprofileGatewayNetworkInternalAccessArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private DeviceprofileGatewayNetworkInternalAccessArgs() {}

    private DeviceprofileGatewayNetworkInternalAccessArgs(DeviceprofileGatewayNetworkInternalAccessArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileGatewayNetworkInternalAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileGatewayNetworkInternalAccessArgs $;

        public Builder() {
            $ = new DeviceprofileGatewayNetworkInternalAccessArgs();
        }

        public Builder(DeviceprofileGatewayNetworkInternalAccessArgs defaults) {
            $ = new DeviceprofileGatewayNetworkInternalAccessArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public DeviceprofileGatewayNetworkInternalAccessArgs build() {
            return $;
        }
    }

}
