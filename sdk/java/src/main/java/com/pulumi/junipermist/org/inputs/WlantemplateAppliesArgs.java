// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WlantemplateAppliesArgs extends com.pulumi.resources.ResourceArgs {

    public static final WlantemplateAppliesArgs Empty = new WlantemplateAppliesArgs();

    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * List of site ids
     * 
     */
    @Import(name="siteIds")
    private @Nullable Output<List<String>> siteIds;

    /**
     * @return List of site ids
     * 
     */
    public Optional<Output<List<String>>> siteIds() {
        return Optional.ofNullable(this.siteIds);
    }

    /**
     * List of sitegroup ids
     * 
     */
    @Import(name="sitegroupIds")
    private @Nullable Output<List<String>> sitegroupIds;

    /**
     * @return List of sitegroup ids
     * 
     */
    public Optional<Output<List<String>>> sitegroupIds() {
        return Optional.ofNullable(this.sitegroupIds);
    }

    private WlantemplateAppliesArgs() {}

    private WlantemplateAppliesArgs(WlantemplateAppliesArgs $) {
        this.orgId = $.orgId;
        this.siteIds = $.siteIds;
        this.sitegroupIds = $.sitegroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WlantemplateAppliesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WlantemplateAppliesArgs $;

        public Builder() {
            $ = new WlantemplateAppliesArgs();
        }

        public Builder(WlantemplateAppliesArgs defaults) {
            $ = new WlantemplateAppliesArgs(Objects.requireNonNull(defaults));
        }

        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param siteIds List of site ids
         * 
         * @return builder
         * 
         */
        public Builder siteIds(@Nullable Output<List<String>> siteIds) {
            $.siteIds = siteIds;
            return this;
        }

        /**
         * @param siteIds List of site ids
         * 
         * @return builder
         * 
         */
        public Builder siteIds(List<String> siteIds) {
            return siteIds(Output.of(siteIds));
        }

        /**
         * @param siteIds List of site ids
         * 
         * @return builder
         * 
         */
        public Builder siteIds(String... siteIds) {
            return siteIds(List.of(siteIds));
        }

        /**
         * @param sitegroupIds List of sitegroup ids
         * 
         * @return builder
         * 
         */
        public Builder sitegroupIds(@Nullable Output<List<String>> sitegroupIds) {
            $.sitegroupIds = sitegroupIds;
            return this;
        }

        /**
         * @param sitegroupIds List of sitegroup ids
         * 
         * @return builder
         * 
         */
        public Builder sitegroupIds(List<String> sitegroupIds) {
            return sitegroupIds(Output.of(sitegroupIds));
        }

        /**
         * @param sitegroupIds List of sitegroup ids
         * 
         * @return builder
         * 
         */
        public Builder sitegroupIds(String... sitegroupIds) {
            return sitegroupIds(List.of(sitegroupIds));
        }

        public WlantemplateAppliesArgs build() {
            return $;
        }
    }

}
