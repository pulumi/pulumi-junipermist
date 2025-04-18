// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WxtagSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final WxtagSpecArgs Empty = new WxtagSpecArgs();

    /**
     * Matched destination port, &#34;0&#34; means any
     * 
     */
    @Import(name="portRange")
    private @Nullable Output<String> portRange;

    /**
     * @return Matched destination port, &#34;0&#34; means any
     * 
     */
    public Optional<Output<String>> portRange() {
        return Optional.ofNullable(this.portRange);
    }

    /**
     * tcp / udp / icmp / gre / any / &#34;:protocol_number&#34;, `protocol_number` is between 1-254
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return tcp / udp / icmp / gre / any / &#34;:protocol_number&#34;, `protocol_number` is between 1-254
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * Matched destination subnets and/or IP Addresses
     * 
     */
    @Import(name="subnets")
    private @Nullable Output<List<String>> subnets;

    /**
     * @return Matched destination subnets and/or IP Addresses
     * 
     */
    public Optional<Output<List<String>>> subnets() {
        return Optional.ofNullable(this.subnets);
    }

    private WxtagSpecArgs() {}

    private WxtagSpecArgs(WxtagSpecArgs $) {
        this.portRange = $.portRange;
        this.protocol = $.protocol;
        this.subnets = $.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WxtagSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WxtagSpecArgs $;

        public Builder() {
            $ = new WxtagSpecArgs();
        }

        public Builder(WxtagSpecArgs defaults) {
            $ = new WxtagSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param portRange Matched destination port, &#34;0&#34; means any
         * 
         * @return builder
         * 
         */
        public Builder portRange(@Nullable Output<String> portRange) {
            $.portRange = portRange;
            return this;
        }

        /**
         * @param portRange Matched destination port, &#34;0&#34; means any
         * 
         * @return builder
         * 
         */
        public Builder portRange(String portRange) {
            return portRange(Output.of(portRange));
        }

        /**
         * @param protocol tcp / udp / icmp / gre / any / &#34;:protocol_number&#34;, `protocol_number` is between 1-254
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol tcp / udp / icmp / gre / any / &#34;:protocol_number&#34;, `protocol_number` is between 1-254
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param subnets Matched destination subnets and/or IP Addresses
         * 
         * @return builder
         * 
         */
        public Builder subnets(@Nullable Output<List<String>> subnets) {
            $.subnets = subnets;
            return this;
        }

        /**
         * @param subnets Matched destination subnets and/or IP Addresses
         * 
         * @return builder
         * 
         */
        public Builder subnets(List<String> subnets) {
            return subnets(Output.of(subnets));
        }

        /**
         * @param subnets Matched destination subnets and/or IP Addresses
         * 
         * @return builder
         * 
         */
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }

        public WxtagSpecArgs build() {
            return $;
        }
    }

}
