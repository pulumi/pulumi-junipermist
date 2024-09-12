// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworktemplateAclPolicyActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplateAclPolicyActionArgs Empty = new NetworktemplateAclPolicyActionArgs();

    /**
     * enum: `allow`, `deny`
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return enum: `allow`, `deny`
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    @Import(name="dstTag", required=true)
    private Output<String> dstTag;

    public Output<String> dstTag() {
        return this.dstTag;
    }

    private NetworktemplateAclPolicyActionArgs() {}

    private NetworktemplateAclPolicyActionArgs(NetworktemplateAclPolicyActionArgs $) {
        this.action = $.action;
        this.dstTag = $.dstTag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworktemplateAclPolicyActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplateAclPolicyActionArgs $;

        public Builder() {
            $ = new NetworktemplateAclPolicyActionArgs();
        }

        public Builder(NetworktemplateAclPolicyActionArgs defaults) {
            $ = new NetworktemplateAclPolicyActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action enum: `allow`, `deny`
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action enum: `allow`, `deny`
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        public Builder dstTag(Output<String> dstTag) {
            $.dstTag = dstTag;
            return this;
        }

        public Builder dstTag(String dstTag) {
            return dstTag(Output.of(dstTag));
        }

        public NetworktemplateAclPolicyActionArgs build() {
            if ($.dstTag == null) {
                throw new MissingRequiredPropertyException("NetworktemplateAclPolicyActionArgs", "dstTag");
            }
            return $;
        }
    }

}
