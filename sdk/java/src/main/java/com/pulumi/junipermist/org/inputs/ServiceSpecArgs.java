// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceSpecArgs Empty = new ServiceSpecArgs();

    /**
     * port number, port range, or variable
     * 
     */
    @Import(name="portRange")
    private @Nullable Output<String> portRange;

    /**
     * @return port number, port range, or variable
     * 
     */
    public Optional<Output<String>> portRange() {
        return Optional.ofNullable(this.portRange);
    }

    /**
     * `https`/ `tcp` / `udp` / `icmp` / `gre` / `any` / `:protocol_number`.
     * `protocol_number` is between 1-254
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return `https`/ `tcp` / `udp` / `icmp` / `gre` / `any` / `:protocol_number`.
     * `protocol_number` is between 1-254
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    private ServiceSpecArgs() {}

    private ServiceSpecArgs(ServiceSpecArgs $) {
        this.portRange = $.portRange;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceSpecArgs $;

        public Builder() {
            $ = new ServiceSpecArgs();
        }

        public Builder(ServiceSpecArgs defaults) {
            $ = new ServiceSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param portRange port number, port range, or variable
         * 
         * @return builder
         * 
         */
        public Builder portRange(@Nullable Output<String> portRange) {
            $.portRange = portRange;
            return this;
        }

        /**
         * @param portRange port number, port range, or variable
         * 
         * @return builder
         * 
         */
        public Builder portRange(String portRange) {
            return portRange(Output.of(portRange));
        }

        /**
         * @param protocol `https`/ `tcp` / `udp` / `icmp` / `gre` / `any` / `:protocol_number`.
         * `protocol_number` is between 1-254
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol `https`/ `tcp` / `udp` / `icmp` / `gre` / `any` / `:protocol_number`.
         * `protocol_number` is between 1-254
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public ServiceSpecArgs build() {
            return $;
        }
    }

}