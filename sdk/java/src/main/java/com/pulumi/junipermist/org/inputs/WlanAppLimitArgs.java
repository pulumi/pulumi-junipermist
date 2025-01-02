// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WlanAppLimitArgs extends com.pulumi.resources.ResourceArgs {

    public static final WlanAppLimitArgs Empty = new WlanAppLimitArgs();

    /**
     * Map from app key to bandwidth in kbps.
     * Property key is the app key, defined in Get Application List
     * 
     */
    @Import(name="apps")
    private @Nullable Output<Map<String,Integer>> apps;

    /**
     * @return Map from app key to bandwidth in kbps.
     * Property key is the app key, defined in Get Application List
     * 
     */
    public Optional<Output<Map<String,Integer>>> apps() {
        return Optional.ofNullable(this.apps);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Map from wxtag_id of Hostname Wxlan Tags to bandwidth in kbps. Property key is the `wxtag_id`
     * 
     */
    @Import(name="wxtagIds")
    private @Nullable Output<Map<String,Integer>> wxtagIds;

    /**
     * @return Map from wxtag_id of Hostname Wxlan Tags to bandwidth in kbps. Property key is the `wxtag_id`
     * 
     */
    public Optional<Output<Map<String,Integer>>> wxtagIds() {
        return Optional.ofNullable(this.wxtagIds);
    }

    private WlanAppLimitArgs() {}

    private WlanAppLimitArgs(WlanAppLimitArgs $) {
        this.apps = $.apps;
        this.enabled = $.enabled;
        this.wxtagIds = $.wxtagIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WlanAppLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WlanAppLimitArgs $;

        public Builder() {
            $ = new WlanAppLimitArgs();
        }

        public Builder(WlanAppLimitArgs defaults) {
            $ = new WlanAppLimitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apps Map from app key to bandwidth in kbps.
         * Property key is the app key, defined in Get Application List
         * 
         * @return builder
         * 
         */
        public Builder apps(@Nullable Output<Map<String,Integer>> apps) {
            $.apps = apps;
            return this;
        }

        /**
         * @param apps Map from app key to bandwidth in kbps.
         * Property key is the app key, defined in Get Application List
         * 
         * @return builder
         * 
         */
        public Builder apps(Map<String,Integer> apps) {
            return apps(Output.of(apps));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param wxtagIds Map from wxtag_id of Hostname Wxlan Tags to bandwidth in kbps. Property key is the `wxtag_id`
         * 
         * @return builder
         * 
         */
        public Builder wxtagIds(@Nullable Output<Map<String,Integer>> wxtagIds) {
            $.wxtagIds = wxtagIds;
            return this;
        }

        /**
         * @param wxtagIds Map from wxtag_id of Hostname Wxlan Tags to bandwidth in kbps. Property key is the `wxtag_id`
         * 
         * @return builder
         * 
         */
        public Builder wxtagIds(Map<String,Integer> wxtagIds) {
            return wxtagIds(Output.of(wxtagIds));
        }

        public WlanAppLimitArgs build() {
            return $;
        }
    }

}
