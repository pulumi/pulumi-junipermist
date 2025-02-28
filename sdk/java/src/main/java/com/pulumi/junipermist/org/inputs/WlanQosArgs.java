// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WlanQosArgs extends com.pulumi.resources.ResourceArgs {

    public static final WlanQosArgs Empty = new WlanQosArgs();

    /**
     * enum: `background`, `best_effort`, `video`, `voice`
     * 
     */
    @Import(name="class")
    private @Nullable Output<String> class_;

    /**
     * @return enum: `background`, `best_effort`, `video`, `voice`
     * 
     */
    public Optional<Output<String>> class_() {
        return Optional.ofNullable(this.class_);
    }

    /**
     * Whether to overwrite QoS
     * 
     */
    @Import(name="overwrite")
    private @Nullable Output<Boolean> overwrite;

    /**
     * @return Whether to overwrite QoS
     * 
     */
    public Optional<Output<Boolean>> overwrite() {
        return Optional.ofNullable(this.overwrite);
    }

    private WlanQosArgs() {}

    private WlanQosArgs(WlanQosArgs $) {
        this.class_ = $.class_;
        this.overwrite = $.overwrite;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WlanQosArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WlanQosArgs $;

        public Builder() {
            $ = new WlanQosArgs();
        }

        public Builder(WlanQosArgs defaults) {
            $ = new WlanQosArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param class_ enum: `background`, `best_effort`, `video`, `voice`
         * 
         * @return builder
         * 
         */
        public Builder class_(@Nullable Output<String> class_) {
            $.class_ = class_;
            return this;
        }

        /**
         * @param class_ enum: `background`, `best_effort`, `video`, `voice`
         * 
         * @return builder
         * 
         */
        public Builder class_(String class_) {
            return class_(Output.of(class_));
        }

        /**
         * @param overwrite Whether to overwrite QoS
         * 
         * @return builder
         * 
         */
        public Builder overwrite(@Nullable Output<Boolean> overwrite) {
            $.overwrite = overwrite;
            return this;
        }

        /**
         * @param overwrite Whether to overwrite QoS
         * 
         * @return builder
         * 
         */
        public Builder overwrite(Boolean overwrite) {
            return overwrite(Output.of(overwrite));
        }

        public WlanQosArgs build() {
            return $;
        }
    }

}
