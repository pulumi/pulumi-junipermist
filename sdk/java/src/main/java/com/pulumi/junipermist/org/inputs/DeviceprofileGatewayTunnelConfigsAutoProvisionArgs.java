// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.DeviceprofileGatewayTunnelConfigsAutoProvisionLatlngArgs;
import com.pulumi.junipermist.org.inputs.DeviceprofileGatewayTunnelConfigsAutoProvisionPrimaryArgs;
import com.pulumi.junipermist.org.inputs.DeviceprofileGatewayTunnelConfigsAutoProvisionSecondaryArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileGatewayTunnelConfigsAutoProvisionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileGatewayTunnelConfigsAutoProvisionArgs Empty = new DeviceprofileGatewayTunnelConfigsAutoProvisionArgs();

    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    @Import(name="latlng")
    private @Nullable Output<DeviceprofileGatewayTunnelConfigsAutoProvisionLatlngArgs> latlng;

    public Optional<Output<DeviceprofileGatewayTunnelConfigsAutoProvisionLatlngArgs>> latlng() {
        return Optional.ofNullable(this.latlng);
    }

    @Import(name="primary")
    private @Nullable Output<DeviceprofileGatewayTunnelConfigsAutoProvisionPrimaryArgs> primary;

    public Optional<Output<DeviceprofileGatewayTunnelConfigsAutoProvisionPrimaryArgs>> primary() {
        return Optional.ofNullable(this.primary);
    }

    @Import(name="secondary")
    private @Nullable Output<DeviceprofileGatewayTunnelConfigsAutoProvisionSecondaryArgs> secondary;

    public Optional<Output<DeviceprofileGatewayTunnelConfigsAutoProvisionSecondaryArgs>> secondary() {
        return Optional.ofNullable(this.secondary);
    }

    private DeviceprofileGatewayTunnelConfigsAutoProvisionArgs() {}

    private DeviceprofileGatewayTunnelConfigsAutoProvisionArgs(DeviceprofileGatewayTunnelConfigsAutoProvisionArgs $) {
        this.enable = $.enable;
        this.latlng = $.latlng;
        this.primary = $.primary;
        this.secondary = $.secondary;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileGatewayTunnelConfigsAutoProvisionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileGatewayTunnelConfigsAutoProvisionArgs $;

        public Builder() {
            $ = new DeviceprofileGatewayTunnelConfigsAutoProvisionArgs();
        }

        public Builder(DeviceprofileGatewayTunnelConfigsAutoProvisionArgs defaults) {
            $ = new DeviceprofileGatewayTunnelConfigsAutoProvisionArgs(Objects.requireNonNull(defaults));
        }

        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        public Builder latlng(@Nullable Output<DeviceprofileGatewayTunnelConfigsAutoProvisionLatlngArgs> latlng) {
            $.latlng = latlng;
            return this;
        }

        public Builder latlng(DeviceprofileGatewayTunnelConfigsAutoProvisionLatlngArgs latlng) {
            return latlng(Output.of(latlng));
        }

        public Builder primary(@Nullable Output<DeviceprofileGatewayTunnelConfigsAutoProvisionPrimaryArgs> primary) {
            $.primary = primary;
            return this;
        }

        public Builder primary(DeviceprofileGatewayTunnelConfigsAutoProvisionPrimaryArgs primary) {
            return primary(Output.of(primary));
        }

        public Builder secondary(@Nullable Output<DeviceprofileGatewayTunnelConfigsAutoProvisionSecondaryArgs> secondary) {
            $.secondary = secondary;
            return this;
        }

        public Builder secondary(DeviceprofileGatewayTunnelConfigsAutoProvisionSecondaryArgs secondary) {
            return secondary(Output.of(secondary));
        }

        public DeviceprofileGatewayTunnelConfigsAutoProvisionArgs build() {
            return $;
        }
    }

}
