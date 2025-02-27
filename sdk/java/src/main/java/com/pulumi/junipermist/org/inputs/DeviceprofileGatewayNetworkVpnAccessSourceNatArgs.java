// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileGatewayNetworkVpnAccessSourceNatArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileGatewayNetworkVpnAccessSourceNatArgs Empty = new DeviceprofileGatewayNetworkVpnAccessSourceNatArgs();

    @Import(name="externalIp")
    private @Nullable Output<String> externalIp;

    public Optional<Output<String>> externalIp() {
        return Optional.ofNullable(this.externalIp);
    }

    private DeviceprofileGatewayNetworkVpnAccessSourceNatArgs() {}

    private DeviceprofileGatewayNetworkVpnAccessSourceNatArgs(DeviceprofileGatewayNetworkVpnAccessSourceNatArgs $) {
        this.externalIp = $.externalIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileGatewayNetworkVpnAccessSourceNatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileGatewayNetworkVpnAccessSourceNatArgs $;

        public Builder() {
            $ = new DeviceprofileGatewayNetworkVpnAccessSourceNatArgs();
        }

        public Builder(DeviceprofileGatewayNetworkVpnAccessSourceNatArgs defaults) {
            $ = new DeviceprofileGatewayNetworkVpnAccessSourceNatArgs(Objects.requireNonNull(defaults));
        }

        public Builder externalIp(@Nullable Output<String> externalIp) {
            $.externalIp = externalIp;
            return this;
        }

        public Builder externalIp(String externalIp) {
            return externalIp(Output.of(externalIp));
        }

        public DeviceprofileGatewayNetworkVpnAccessSourceNatArgs build() {
            return $;
        }
    }

}
