// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileGatewayDhcpdConfigConfigFixedBindingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileGatewayDhcpdConfigConfigFixedBindingsArgs Empty = new DeviceprofileGatewayDhcpdConfigConfigFixedBindingsArgs();

    @Import(name="ip", required=true)
    private Output<String> ip;

    public Output<String> ip() {
        return this.ip;
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private DeviceprofileGatewayDhcpdConfigConfigFixedBindingsArgs() {}

    private DeviceprofileGatewayDhcpdConfigConfigFixedBindingsArgs(DeviceprofileGatewayDhcpdConfigConfigFixedBindingsArgs $) {
        this.ip = $.ip;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileGatewayDhcpdConfigConfigFixedBindingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileGatewayDhcpdConfigConfigFixedBindingsArgs $;

        public Builder() {
            $ = new DeviceprofileGatewayDhcpdConfigConfigFixedBindingsArgs();
        }

        public Builder(DeviceprofileGatewayDhcpdConfigConfigFixedBindingsArgs defaults) {
            $ = new DeviceprofileGatewayDhcpdConfigConfigFixedBindingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder ip(Output<String> ip) {
            $.ip = ip;
            return this;
        }

        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public DeviceprofileGatewayDhcpdConfigConfigFixedBindingsArgs build() {
            if ($.ip == null) {
                throw new MissingRequiredPropertyException("DeviceprofileGatewayDhcpdConfigConfigFixedBindingsArgs", "ip");
            }
            return $;
        }
    }

}