// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs Empty = new DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs();

    /**
     * The Destination NAT destination IP Address. Must be an IP (i.e. &#34;192.168.70.30&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    @Import(name="internalIp")
    private @Nullable Output<String> internalIp;

    /**
     * @return The Destination NAT destination IP Address. Must be an IP (i.e. &#34;192.168.70.30&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    public Optional<Output<String>> internalIp() {
        return Optional.ofNullable(this.internalIp);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Destination NAT destination IP Address. Must be a Port (i.e. &#34;443&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    @Import(name="port")
    private @Nullable Output<String> port;

    /**
     * @return The Destination NAT destination IP Address. Must be a Port (i.e. &#34;443&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    public Optional<Output<String>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * SRX Only. If not set, we configure the nat policies against all WAN ports for simplicity
     * 
     */
    @Import(name="wanName")
    private @Nullable Output<String> wanName;

    /**
     * @return SRX Only. If not set, we configure the nat policies against all WAN ports for simplicity
     * 
     */
    public Optional<Output<String>> wanName() {
        return Optional.ofNullable(this.wanName);
    }

    private DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs() {}

    private DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs(DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs $) {
        this.internalIp = $.internalIp;
        this.name = $.name;
        this.port = $.port;
        this.wanName = $.wanName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs $;

        public Builder() {
            $ = new DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs();
        }

        public Builder(DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs defaults) {
            $ = new DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param internalIp The Destination NAT destination IP Address. Must be an IP (i.e. &#34;192.168.70.30&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
         * 
         * @return builder
         * 
         */
        public Builder internalIp(@Nullable Output<String> internalIp) {
            $.internalIp = internalIp;
            return this;
        }

        /**
         * @param internalIp The Destination NAT destination IP Address. Must be an IP (i.e. &#34;192.168.70.30&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
         * 
         * @return builder
         * 
         */
        public Builder internalIp(String internalIp) {
            return internalIp(Output.of(internalIp));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param port The Destination NAT destination IP Address. Must be a Port (i.e. &#34;443&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<String> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The Destination NAT destination IP Address. Must be a Port (i.e. &#34;443&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
         * 
         * @return builder
         * 
         */
        public Builder port(String port) {
            return port(Output.of(port));
        }

        /**
         * @param wanName SRX Only. If not set, we configure the nat policies against all WAN ports for simplicity
         * 
         * @return builder
         * 
         */
        public Builder wanName(@Nullable Output<String> wanName) {
            $.wanName = wanName;
            return this;
        }

        /**
         * @param wanName SRX Only. If not set, we configure the nat policies against all WAN ports for simplicity
         * 
         * @return builder
         * 
         */
        public Builder wanName(String wanName) {
            return wanName(Output.of(wanName));
        }

        public DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs build() {
            return $;
        }
    }

}
