// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileGatewayNetworkMulticastGroupsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileGatewayNetworkMulticastGroupsArgs Empty = new DeviceprofileGatewayNetworkMulticastGroupsArgs();

    /**
     * RP (rendezvous point) IP Address
     * 
     */
    @Import(name="rpIp")
    private @Nullable Output<String> rpIp;

    /**
     * @return RP (rendezvous point) IP Address
     * 
     */
    public Optional<Output<String>> rpIp() {
        return Optional.ofNullable(this.rpIp);
    }

    private DeviceprofileGatewayNetworkMulticastGroupsArgs() {}

    private DeviceprofileGatewayNetworkMulticastGroupsArgs(DeviceprofileGatewayNetworkMulticastGroupsArgs $) {
        this.rpIp = $.rpIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileGatewayNetworkMulticastGroupsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileGatewayNetworkMulticastGroupsArgs $;

        public Builder() {
            $ = new DeviceprofileGatewayNetworkMulticastGroupsArgs();
        }

        public Builder(DeviceprofileGatewayNetworkMulticastGroupsArgs defaults) {
            $ = new DeviceprofileGatewayNetworkMulticastGroupsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rpIp RP (rendezvous point) IP Address
         * 
         * @return builder
         * 
         */
        public Builder rpIp(@Nullable Output<String> rpIp) {
            $.rpIp = rpIp;
            return this;
        }

        /**
         * @param rpIp RP (rendezvous point) IP Address
         * 
         * @return builder
         * 
         */
        public Builder rpIp(String rpIp) {
            return rpIp(Output.of(rpIp));
        }

        public DeviceprofileGatewayNetworkMulticastGroupsArgs build() {
            return $;
        }
    }

}