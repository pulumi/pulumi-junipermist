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


public final class WlanAppQosAppsArgs extends com.pulumi.resources.ResourceArgs {

    public static final WlanAppQosAppsArgs Empty = new WlanAppQosAppsArgs();

    @Import(name="dscp")
    private @Nullable Output<Integer> dscp;

    public Optional<Output<Integer>> dscp() {
        return Optional.ofNullable(this.dscp);
    }

    /**
     * Subnet filter is not required but helps AP to only inspect certain traffic (thus reducing AP load)
     * 
     */
    @Import(name="dstSubnet")
    private @Nullable Output<String> dstSubnet;

    /**
     * @return Subnet filter is not required but helps AP to only inspect certain traffic (thus reducing AP load)
     * 
     */
    public Optional<Output<String>> dstSubnet() {
        return Optional.ofNullable(this.dstSubnet);
    }

    /**
     * Subnet filter is not required but helps AP to only inspect certain traffic (thus reducing AP load)
     * 
     */
    @Import(name="srcSubnet")
    private @Nullable Output<String> srcSubnet;

    /**
     * @return Subnet filter is not required but helps AP to only inspect certain traffic (thus reducing AP load)
     * 
     */
    public Optional<Output<String>> srcSubnet() {
        return Optional.ofNullable(this.srcSubnet);
    }

    private WlanAppQosAppsArgs() {}

    private WlanAppQosAppsArgs(WlanAppQosAppsArgs $) {
        this.dscp = $.dscp;
        this.dstSubnet = $.dstSubnet;
        this.srcSubnet = $.srcSubnet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WlanAppQosAppsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WlanAppQosAppsArgs $;

        public Builder() {
            $ = new WlanAppQosAppsArgs();
        }

        public Builder(WlanAppQosAppsArgs defaults) {
            $ = new WlanAppQosAppsArgs(Objects.requireNonNull(defaults));
        }

        public Builder dscp(@Nullable Output<Integer> dscp) {
            $.dscp = dscp;
            return this;
        }

        public Builder dscp(Integer dscp) {
            return dscp(Output.of(dscp));
        }

        /**
         * @param dstSubnet Subnet filter is not required but helps AP to only inspect certain traffic (thus reducing AP load)
         * 
         * @return builder
         * 
         */
        public Builder dstSubnet(@Nullable Output<String> dstSubnet) {
            $.dstSubnet = dstSubnet;
            return this;
        }

        /**
         * @param dstSubnet Subnet filter is not required but helps AP to only inspect certain traffic (thus reducing AP load)
         * 
         * @return builder
         * 
         */
        public Builder dstSubnet(String dstSubnet) {
            return dstSubnet(Output.of(dstSubnet));
        }

        /**
         * @param srcSubnet Subnet filter is not required but helps AP to only inspect certain traffic (thus reducing AP load)
         * 
         * @return builder
         * 
         */
        public Builder srcSubnet(@Nullable Output<String> srcSubnet) {
            $.srcSubnet = srcSubnet;
            return this;
        }

        /**
         * @param srcSubnet Subnet filter is not required but helps AP to only inspect certain traffic (thus reducing AP load)
         * 
         * @return builder
         * 
         */
        public Builder srcSubnet(String srcSubnet) {
            return srcSubnet(Output.of(srcSubnet));
        }

        public WlanAppQosAppsArgs build() {
            return $;
        }
    }

}
