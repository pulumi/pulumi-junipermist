// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.device.inputs.GatewayTunnelConfigsAutoProvisionLatlngArgs;
import com.pulumi.junipermist.device.inputs.GatewayTunnelConfigsAutoProvisionPrimaryArgs;
import com.pulumi.junipermist.device.inputs.GatewayTunnelConfigsAutoProvisionSecondaryArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayTunnelConfigsAutoProvisionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayTunnelConfigsAutoProvisionArgs Empty = new GatewayTunnelConfigsAutoProvisionArgs();

    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    @Import(name="latlng")
    private @Nullable Output<GatewayTunnelConfigsAutoProvisionLatlngArgs> latlng;

    public Optional<Output<GatewayTunnelConfigsAutoProvisionLatlngArgs>> latlng() {
        return Optional.ofNullable(this.latlng);
    }

    @Import(name="primary")
    private @Nullable Output<GatewayTunnelConfigsAutoProvisionPrimaryArgs> primary;

    public Optional<Output<GatewayTunnelConfigsAutoProvisionPrimaryArgs>> primary() {
        return Optional.ofNullable(this.primary);
    }

    @Import(name="secondary")
    private @Nullable Output<GatewayTunnelConfigsAutoProvisionSecondaryArgs> secondary;

    public Optional<Output<GatewayTunnelConfigsAutoProvisionSecondaryArgs>> secondary() {
        return Optional.ofNullable(this.secondary);
    }

    private GatewayTunnelConfigsAutoProvisionArgs() {}

    private GatewayTunnelConfigsAutoProvisionArgs(GatewayTunnelConfigsAutoProvisionArgs $) {
        this.enable = $.enable;
        this.latlng = $.latlng;
        this.primary = $.primary;
        this.secondary = $.secondary;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayTunnelConfigsAutoProvisionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayTunnelConfigsAutoProvisionArgs $;

        public Builder() {
            $ = new GatewayTunnelConfigsAutoProvisionArgs();
        }

        public Builder(GatewayTunnelConfigsAutoProvisionArgs defaults) {
            $ = new GatewayTunnelConfigsAutoProvisionArgs(Objects.requireNonNull(defaults));
        }

        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        public Builder latlng(@Nullable Output<GatewayTunnelConfigsAutoProvisionLatlngArgs> latlng) {
            $.latlng = latlng;
            return this;
        }

        public Builder latlng(GatewayTunnelConfigsAutoProvisionLatlngArgs latlng) {
            return latlng(Output.of(latlng));
        }

        public Builder primary(@Nullable Output<GatewayTunnelConfigsAutoProvisionPrimaryArgs> primary) {
            $.primary = primary;
            return this;
        }

        public Builder primary(GatewayTunnelConfigsAutoProvisionPrimaryArgs primary) {
            return primary(Output.of(primary));
        }

        public Builder secondary(@Nullable Output<GatewayTunnelConfigsAutoProvisionSecondaryArgs> secondary) {
            $.secondary = secondary;
            return this;
        }

        public Builder secondary(GatewayTunnelConfigsAutoProvisionSecondaryArgs secondary) {
            return secondary(Output.of(secondary));
        }

        public GatewayTunnelConfigsAutoProvisionArgs build() {
            return $;
        }
    }

}