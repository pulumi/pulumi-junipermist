// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WlanDnsServerRewriteArgs extends com.pulumi.resources.ResourceArgs {

    public static final WlanDnsServerRewriteArgs Empty = new WlanDnsServerRewriteArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Map between radius_group and the desired DNS server (IPv4 only). Property key is the RADIUS group, property value is the desired DNS Server
     * 
     */
    @Import(name="radiusGroups")
    private @Nullable Output<Map<String,String>> radiusGroups;

    /**
     * @return Map between radius_group and the desired DNS server (IPv4 only). Property key is the RADIUS group, property value is the desired DNS Server
     * 
     */
    public Optional<Output<Map<String,String>>> radiusGroups() {
        return Optional.ofNullable(this.radiusGroups);
    }

    private WlanDnsServerRewriteArgs() {}

    private WlanDnsServerRewriteArgs(WlanDnsServerRewriteArgs $) {
        this.enabled = $.enabled;
        this.radiusGroups = $.radiusGroups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WlanDnsServerRewriteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WlanDnsServerRewriteArgs $;

        public Builder() {
            $ = new WlanDnsServerRewriteArgs();
        }

        public Builder(WlanDnsServerRewriteArgs defaults) {
            $ = new WlanDnsServerRewriteArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param radiusGroups Map between radius_group and the desired DNS server (IPv4 only). Property key is the RADIUS group, property value is the desired DNS Server
         * 
         * @return builder
         * 
         */
        public Builder radiusGroups(@Nullable Output<Map<String,String>> radiusGroups) {
            $.radiusGroups = radiusGroups;
            return this;
        }

        /**
         * @param radiusGroups Map between radius_group and the desired DNS server (IPv4 only). Property key is the RADIUS group, property value is the desired DNS Server
         * 
         * @return builder
         * 
         */
        public Builder radiusGroups(Map<String,String> radiusGroups) {
            return radiusGroups(Output.of(radiusGroups));
        }

        public WlanDnsServerRewriteArgs build() {
            return $;
        }
    }

}
