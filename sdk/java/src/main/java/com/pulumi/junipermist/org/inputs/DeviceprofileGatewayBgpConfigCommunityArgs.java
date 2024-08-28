// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileGatewayBgpConfigCommunityArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileGatewayBgpConfigCommunityArgs Empty = new DeviceprofileGatewayBgpConfigCommunityArgs();

    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="localPreference")
    private @Nullable Output<Integer> localPreference;

    public Optional<Output<Integer>> localPreference() {
        return Optional.ofNullable(this.localPreference);
    }

    @Import(name="vpnName")
    private @Nullable Output<String> vpnName;

    public Optional<Output<String>> vpnName() {
        return Optional.ofNullable(this.vpnName);
    }

    private DeviceprofileGatewayBgpConfigCommunityArgs() {}

    private DeviceprofileGatewayBgpConfigCommunityArgs(DeviceprofileGatewayBgpConfigCommunityArgs $) {
        this.id = $.id;
        this.localPreference = $.localPreference;
        this.vpnName = $.vpnName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileGatewayBgpConfigCommunityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileGatewayBgpConfigCommunityArgs $;

        public Builder() {
            $ = new DeviceprofileGatewayBgpConfigCommunityArgs();
        }

        public Builder(DeviceprofileGatewayBgpConfigCommunityArgs defaults) {
            $ = new DeviceprofileGatewayBgpConfigCommunityArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder localPreference(@Nullable Output<Integer> localPreference) {
            $.localPreference = localPreference;
            return this;
        }

        public Builder localPreference(Integer localPreference) {
            return localPreference(Output.of(localPreference));
        }

        public Builder vpnName(@Nullable Output<String> vpnName) {
            $.vpnName = vpnName;
            return this;
        }

        public Builder vpnName(String vpnName) {
            return vpnName(Output.of(vpnName));
        }

        public DeviceprofileGatewayBgpConfigCommunityArgs build() {
            return $;
        }
    }

}