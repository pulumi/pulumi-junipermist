// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingGatewayMgmtProtectReCustomArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingGatewayMgmtProtectReCustomArgs Empty = new SettingGatewayMgmtProtectReCustomArgs();

    /**
     * matched dst port, &#34;0&#34; means any. Note: For `protocol`==`any` and  `port_range`==`any`, configure `trusted_hosts` instead
     * 
     */
    @Import(name="portRange")
    private @Nullable Output<String> portRange;

    /**
     * @return matched dst port, &#34;0&#34; means any. Note: For `protocol`==`any` and  `port_range`==`any`, configure `trusted_hosts` instead
     * 
     */
    public Optional<Output<String>> portRange() {
        return Optional.ofNullable(this.portRange);
    }

    /**
     * enum: `any`, `icmp`, `tcp`, `udp`. Note: For `protocol`==`any` and  `port_range`==`any`, configure `trusted_hosts` instead
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return enum: `any`, `icmp`, `tcp`, `udp`. Note: For `protocol`==`any` and  `port_range`==`any`, configure `trusted_hosts` instead
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    @Import(name="subnets", required=true)
    private Output<List<String>> subnets;

    public Output<List<String>> subnets() {
        return this.subnets;
    }

    private SettingGatewayMgmtProtectReCustomArgs() {}

    private SettingGatewayMgmtProtectReCustomArgs(SettingGatewayMgmtProtectReCustomArgs $) {
        this.portRange = $.portRange;
        this.protocol = $.protocol;
        this.subnets = $.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingGatewayMgmtProtectReCustomArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingGatewayMgmtProtectReCustomArgs $;

        public Builder() {
            $ = new SettingGatewayMgmtProtectReCustomArgs();
        }

        public Builder(SettingGatewayMgmtProtectReCustomArgs defaults) {
            $ = new SettingGatewayMgmtProtectReCustomArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param portRange matched dst port, &#34;0&#34; means any. Note: For `protocol`==`any` and  `port_range`==`any`, configure `trusted_hosts` instead
         * 
         * @return builder
         * 
         */
        public Builder portRange(@Nullable Output<String> portRange) {
            $.portRange = portRange;
            return this;
        }

        /**
         * @param portRange matched dst port, &#34;0&#34; means any. Note: For `protocol`==`any` and  `port_range`==`any`, configure `trusted_hosts` instead
         * 
         * @return builder
         * 
         */
        public Builder portRange(String portRange) {
            return portRange(Output.of(portRange));
        }

        /**
         * @param protocol enum: `any`, `icmp`, `tcp`, `udp`. Note: For `protocol`==`any` and  `port_range`==`any`, configure `trusted_hosts` instead
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol enum: `any`, `icmp`, `tcp`, `udp`. Note: For `protocol`==`any` and  `port_range`==`any`, configure `trusted_hosts` instead
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public Builder subnets(Output<List<String>> subnets) {
            $.subnets = subnets;
            return this;
        }

        public Builder subnets(List<String> subnets) {
            return subnets(Output.of(subnets));
        }

        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }

        public SettingGatewayMgmtProtectReCustomArgs build() {
            if ($.subnets == null) {
                throw new MissingRequiredPropertyException("SettingGatewayMgmtProtectReCustomArgs", "subnets");
            }
            return $;
        }
    }

}