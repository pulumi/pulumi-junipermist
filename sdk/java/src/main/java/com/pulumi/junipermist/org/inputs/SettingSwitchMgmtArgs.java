// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingSwitchMgmtArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingSwitchMgmtArgs Empty = new SettingSwitchMgmtArgs();

    /**
     * If the field is set in both site/setting and org/setting, the value from site/setting will be used.
     * 
     */
    @Import(name="apAffinityThreshold")
    private @Nullable Output<Integer> apAffinityThreshold;

    /**
     * @return If the field is set in both site/setting and org/setting, the value from site/setting will be used.
     * 
     */
    public Optional<Output<Integer>> apAffinityThreshold() {
        return Optional.ofNullable(this.apAffinityThreshold);
    }

    /**
     * If `false`, only the configuration generated by Mist is cleaned up during the configuration process. If `true`, all the existing configuration will be removed.
     * 
     */
    @Import(name="removeExistingConfigs")
    private @Nullable Output<Boolean> removeExistingConfigs;

    /**
     * @return If `false`, only the configuration generated by Mist is cleaned up during the configuration process. If `true`, all the existing configuration will be removed.
     * 
     */
    public Optional<Output<Boolean>> removeExistingConfigs() {
        return Optional.ofNullable(this.removeExistingConfigs);
    }

    private SettingSwitchMgmtArgs() {}

    private SettingSwitchMgmtArgs(SettingSwitchMgmtArgs $) {
        this.apAffinityThreshold = $.apAffinityThreshold;
        this.removeExistingConfigs = $.removeExistingConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingSwitchMgmtArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingSwitchMgmtArgs $;

        public Builder() {
            $ = new SettingSwitchMgmtArgs();
        }

        public Builder(SettingSwitchMgmtArgs defaults) {
            $ = new SettingSwitchMgmtArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apAffinityThreshold If the field is set in both site/setting and org/setting, the value from site/setting will be used.
         * 
         * @return builder
         * 
         */
        public Builder apAffinityThreshold(@Nullable Output<Integer> apAffinityThreshold) {
            $.apAffinityThreshold = apAffinityThreshold;
            return this;
        }

        /**
         * @param apAffinityThreshold If the field is set in both site/setting and org/setting, the value from site/setting will be used.
         * 
         * @return builder
         * 
         */
        public Builder apAffinityThreshold(Integer apAffinityThreshold) {
            return apAffinityThreshold(Output.of(apAffinityThreshold));
        }

        /**
         * @param removeExistingConfigs If `false`, only the configuration generated by Mist is cleaned up during the configuration process. If `true`, all the existing configuration will be removed.
         * 
         * @return builder
         * 
         */
        public Builder removeExistingConfigs(@Nullable Output<Boolean> removeExistingConfigs) {
            $.removeExistingConfigs = removeExistingConfigs;
            return this;
        }

        /**
         * @param removeExistingConfigs If `false`, only the configuration generated by Mist is cleaned up during the configuration process. If `true`, all the existing configuration will be removed.
         * 
         * @return builder
         * 
         */
        public Builder removeExistingConfigs(Boolean removeExistingConfigs) {
            return removeExistingConfigs(Output.of(removeExistingConfigs));
        }

        public SettingSwitchMgmtArgs build() {
            return $;
        }
    }

}
