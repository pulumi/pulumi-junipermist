// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.site.inputs.SettingEngagementDwellTagNamesArgs;
import com.pulumi.junipermist.site.inputs.SettingEngagementDwellTagsArgs;
import com.pulumi.junipermist.site.inputs.SettingEngagementHoursArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingEngagementArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingEngagementArgs Empty = new SettingEngagementArgs();

    /**
     * name associated to each tag
     * 
     */
    @Import(name="dwellTagNames")
    private @Nullable Output<SettingEngagementDwellTagNamesArgs> dwellTagNames;

    /**
     * @return name associated to each tag
     * 
     */
    public Optional<Output<SettingEngagementDwellTagNamesArgs>> dwellTagNames() {
        return Optional.ofNullable(this.dwellTagNames);
    }

    /**
     * add tags to visits within the duration (in seconds)
     * 
     */
    @Import(name="dwellTags")
    private @Nullable Output<SettingEngagementDwellTagsArgs> dwellTags;

    /**
     * @return add tags to visits within the duration (in seconds)
     * 
     */
    public Optional<Output<SettingEngagementDwellTagsArgs>> dwellTags() {
        return Optional.ofNullable(this.dwellTags);
    }

    /**
     * Days/Hours of operation filter, the available days (mon, tue, wed, thu, fri, sat, sun)
     * 
     */
    @Import(name="hours")
    private @Nullable Output<SettingEngagementHoursArgs> hours;

    /**
     * @return Days/Hours of operation filter, the available days (mon, tue, wed, thu, fri, sat, sun)
     * 
     */
    public Optional<Output<SettingEngagementHoursArgs>> hours() {
        return Optional.ofNullable(this.hours);
    }

    /**
     * max time, default is 43200(12h), max is 68400 (18h)
     * 
     */
    @Import(name="maxDwell")
    private @Nullable Output<Integer> maxDwell;

    /**
     * @return max time, default is 43200(12h), max is 68400 (18h)
     * 
     */
    public Optional<Output<Integer>> maxDwell() {
        return Optional.ofNullable(this.maxDwell);
    }

    /**
     * min time
     * 
     */
    @Import(name="minDwell")
    private @Nullable Output<Integer> minDwell;

    /**
     * @return min time
     * 
     */
    public Optional<Output<Integer>> minDwell() {
        return Optional.ofNullable(this.minDwell);
    }

    private SettingEngagementArgs() {}

    private SettingEngagementArgs(SettingEngagementArgs $) {
        this.dwellTagNames = $.dwellTagNames;
        this.dwellTags = $.dwellTags;
        this.hours = $.hours;
        this.maxDwell = $.maxDwell;
        this.minDwell = $.minDwell;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingEngagementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingEngagementArgs $;

        public Builder() {
            $ = new SettingEngagementArgs();
        }

        public Builder(SettingEngagementArgs defaults) {
            $ = new SettingEngagementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dwellTagNames name associated to each tag
         * 
         * @return builder
         * 
         */
        public Builder dwellTagNames(@Nullable Output<SettingEngagementDwellTagNamesArgs> dwellTagNames) {
            $.dwellTagNames = dwellTagNames;
            return this;
        }

        /**
         * @param dwellTagNames name associated to each tag
         * 
         * @return builder
         * 
         */
        public Builder dwellTagNames(SettingEngagementDwellTagNamesArgs dwellTagNames) {
            return dwellTagNames(Output.of(dwellTagNames));
        }

        /**
         * @param dwellTags add tags to visits within the duration (in seconds)
         * 
         * @return builder
         * 
         */
        public Builder dwellTags(@Nullable Output<SettingEngagementDwellTagsArgs> dwellTags) {
            $.dwellTags = dwellTags;
            return this;
        }

        /**
         * @param dwellTags add tags to visits within the duration (in seconds)
         * 
         * @return builder
         * 
         */
        public Builder dwellTags(SettingEngagementDwellTagsArgs dwellTags) {
            return dwellTags(Output.of(dwellTags));
        }

        /**
         * @param hours Days/Hours of operation filter, the available days (mon, tue, wed, thu, fri, sat, sun)
         * 
         * @return builder
         * 
         */
        public Builder hours(@Nullable Output<SettingEngagementHoursArgs> hours) {
            $.hours = hours;
            return this;
        }

        /**
         * @param hours Days/Hours of operation filter, the available days (mon, tue, wed, thu, fri, sat, sun)
         * 
         * @return builder
         * 
         */
        public Builder hours(SettingEngagementHoursArgs hours) {
            return hours(Output.of(hours));
        }

        /**
         * @param maxDwell max time, default is 43200(12h), max is 68400 (18h)
         * 
         * @return builder
         * 
         */
        public Builder maxDwell(@Nullable Output<Integer> maxDwell) {
            $.maxDwell = maxDwell;
            return this;
        }

        /**
         * @param maxDwell max time, default is 43200(12h), max is 68400 (18h)
         * 
         * @return builder
         * 
         */
        public Builder maxDwell(Integer maxDwell) {
            return maxDwell(Output.of(maxDwell));
        }

        /**
         * @param minDwell min time
         * 
         * @return builder
         * 
         */
        public Builder minDwell(@Nullable Output<Integer> minDwell) {
            $.minDwell = minDwell;
            return this;
        }

        /**
         * @param minDwell min time
         * 
         * @return builder
         * 
         */
        public Builder minDwell(Integer minDwell) {
            return minDwell(Output.of(minDwell));
        }

        public SettingEngagementArgs build() {
            return $;
        }
    }

}
