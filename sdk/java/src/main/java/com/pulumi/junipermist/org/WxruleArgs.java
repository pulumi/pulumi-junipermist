// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WxruleArgs extends com.pulumi.resources.ResourceArgs {

    public static final WxruleArgs Empty = new WxruleArgs();

    /**
     * type of action, allow / block. enum: `allow`, `block`
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return type of action, allow / block. enum: `allow`, `block`
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    @Import(name="applyTags")
    private @Nullable Output<List<String>> applyTags;

    public Optional<Output<List<String>>> applyTags() {
        return Optional.ofNullable(this.applyTags);
    }

    /**
     * Blocked apps (always blocking, ignoring action), the key of Get Application List
     * 
     */
    @Import(name="blockedApps")
    private @Nullable Output<List<String>> blockedApps;

    /**
     * @return Blocked apps (always blocking, ignoring action), the key of Get Application List
     * 
     */
    public Optional<Output<List<String>>> blockedApps() {
        return Optional.ofNullable(this.blockedApps);
    }

    /**
     * List of WxTag UUID to indicate these tags are allowed access
     * 
     */
    @Import(name="dstAllowWxtags")
    private @Nullable Output<List<String>> dstAllowWxtags;

    /**
     * @return List of WxTag UUID to indicate these tags are allowed access
     * 
     */
    public Optional<Output<List<String>>> dstAllowWxtags() {
        return Optional.ofNullable(this.dstAllowWxtags);
    }

    /**
     * List of WxTag UUID to indicate these tags are blocked access
     * 
     */
    @Import(name="dstDenyWxtags")
    private @Nullable Output<List<String>> dstDenyWxtags;

    /**
     * @return List of WxTag UUID to indicate these tags are blocked access
     * 
     */
    public Optional<Output<List<String>>> dstDenyWxtags() {
        return Optional.ofNullable(this.dstDenyWxtags);
    }

    /**
     * List of WxTag UUID
     * 
     */
    @Import(name="dstWxtags")
    private @Nullable Output<List<String>> dstWxtags;

    /**
     * @return List of WxTag UUID
     * 
     */
    public Optional<Output<List<String>>> dstWxtags() {
        return Optional.ofNullable(this.dstWxtags);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Order how rules would be looked up, &gt; 0 and bigger order got matched first, -1 means LAST, uniqueness not checked
     * 
     */
    @Import(name="order", required=true)
    private Output<Integer> order;

    /**
     * @return Order how rules would be looked up, &gt; 0 and bigger order got matched first, -1 means LAST, uniqueness not checked
     * 
     */
    public Output<Integer> order() {
        return this.order;
    }

    @Import(name="orgId", required=true)
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    /**
     * List of WxTag UUID to determine if this rule would match
     * 
     */
    @Import(name="srcWxtags")
    private @Nullable Output<List<String>> srcWxtags;

    /**
     * @return List of WxTag UUID to determine if this rule would match
     * 
     */
    public Optional<Output<List<String>>> srcWxtags() {
        return Optional.ofNullable(this.srcWxtags);
    }

    /**
     * Only for Org Level WxRule
     * 
     */
    @Import(name="templateId", required=true)
    private Output<String> templateId;

    /**
     * @return Only for Org Level WxRule
     * 
     */
    public Output<String> templateId() {
        return this.templateId;
    }

    private WxruleArgs() {}

    private WxruleArgs(WxruleArgs $) {
        this.action = $.action;
        this.applyTags = $.applyTags;
        this.blockedApps = $.blockedApps;
        this.dstAllowWxtags = $.dstAllowWxtags;
        this.dstDenyWxtags = $.dstDenyWxtags;
        this.dstWxtags = $.dstWxtags;
        this.enabled = $.enabled;
        this.order = $.order;
        this.orgId = $.orgId;
        this.srcWxtags = $.srcWxtags;
        this.templateId = $.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WxruleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WxruleArgs $;

        public Builder() {
            $ = new WxruleArgs();
        }

        public Builder(WxruleArgs defaults) {
            $ = new WxruleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action type of action, allow / block. enum: `allow`, `block`
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action type of action, allow / block. enum: `allow`, `block`
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        public Builder applyTags(@Nullable Output<List<String>> applyTags) {
            $.applyTags = applyTags;
            return this;
        }

        public Builder applyTags(List<String> applyTags) {
            return applyTags(Output.of(applyTags));
        }

        public Builder applyTags(String... applyTags) {
            return applyTags(List.of(applyTags));
        }

        /**
         * @param blockedApps Blocked apps (always blocking, ignoring action), the key of Get Application List
         * 
         * @return builder
         * 
         */
        public Builder blockedApps(@Nullable Output<List<String>> blockedApps) {
            $.blockedApps = blockedApps;
            return this;
        }

        /**
         * @param blockedApps Blocked apps (always blocking, ignoring action), the key of Get Application List
         * 
         * @return builder
         * 
         */
        public Builder blockedApps(List<String> blockedApps) {
            return blockedApps(Output.of(blockedApps));
        }

        /**
         * @param blockedApps Blocked apps (always blocking, ignoring action), the key of Get Application List
         * 
         * @return builder
         * 
         */
        public Builder blockedApps(String... blockedApps) {
            return blockedApps(List.of(blockedApps));
        }

        /**
         * @param dstAllowWxtags List of WxTag UUID to indicate these tags are allowed access
         * 
         * @return builder
         * 
         */
        public Builder dstAllowWxtags(@Nullable Output<List<String>> dstAllowWxtags) {
            $.dstAllowWxtags = dstAllowWxtags;
            return this;
        }

        /**
         * @param dstAllowWxtags List of WxTag UUID to indicate these tags are allowed access
         * 
         * @return builder
         * 
         */
        public Builder dstAllowWxtags(List<String> dstAllowWxtags) {
            return dstAllowWxtags(Output.of(dstAllowWxtags));
        }

        /**
         * @param dstAllowWxtags List of WxTag UUID to indicate these tags are allowed access
         * 
         * @return builder
         * 
         */
        public Builder dstAllowWxtags(String... dstAllowWxtags) {
            return dstAllowWxtags(List.of(dstAllowWxtags));
        }

        /**
         * @param dstDenyWxtags List of WxTag UUID to indicate these tags are blocked access
         * 
         * @return builder
         * 
         */
        public Builder dstDenyWxtags(@Nullable Output<List<String>> dstDenyWxtags) {
            $.dstDenyWxtags = dstDenyWxtags;
            return this;
        }

        /**
         * @param dstDenyWxtags List of WxTag UUID to indicate these tags are blocked access
         * 
         * @return builder
         * 
         */
        public Builder dstDenyWxtags(List<String> dstDenyWxtags) {
            return dstDenyWxtags(Output.of(dstDenyWxtags));
        }

        /**
         * @param dstDenyWxtags List of WxTag UUID to indicate these tags are blocked access
         * 
         * @return builder
         * 
         */
        public Builder dstDenyWxtags(String... dstDenyWxtags) {
            return dstDenyWxtags(List.of(dstDenyWxtags));
        }

        /**
         * @param dstWxtags List of WxTag UUID
         * 
         * @return builder
         * 
         */
        public Builder dstWxtags(@Nullable Output<List<String>> dstWxtags) {
            $.dstWxtags = dstWxtags;
            return this;
        }

        /**
         * @param dstWxtags List of WxTag UUID
         * 
         * @return builder
         * 
         */
        public Builder dstWxtags(List<String> dstWxtags) {
            return dstWxtags(Output.of(dstWxtags));
        }

        /**
         * @param dstWxtags List of WxTag UUID
         * 
         * @return builder
         * 
         */
        public Builder dstWxtags(String... dstWxtags) {
            return dstWxtags(List.of(dstWxtags));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param order Order how rules would be looked up, &gt; 0 and bigger order got matched first, -1 means LAST, uniqueness not checked
         * 
         * @return builder
         * 
         */
        public Builder order(Output<Integer> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order Order how rules would be looked up, &gt; 0 and bigger order got matched first, -1 means LAST, uniqueness not checked
         * 
         * @return builder
         * 
         */
        public Builder order(Integer order) {
            return order(Output.of(order));
        }

        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param srcWxtags List of WxTag UUID to determine if this rule would match
         * 
         * @return builder
         * 
         */
        public Builder srcWxtags(@Nullable Output<List<String>> srcWxtags) {
            $.srcWxtags = srcWxtags;
            return this;
        }

        /**
         * @param srcWxtags List of WxTag UUID to determine if this rule would match
         * 
         * @return builder
         * 
         */
        public Builder srcWxtags(List<String> srcWxtags) {
            return srcWxtags(Output.of(srcWxtags));
        }

        /**
         * @param srcWxtags List of WxTag UUID to determine if this rule would match
         * 
         * @return builder
         * 
         */
        public Builder srcWxtags(String... srcWxtags) {
            return srcWxtags(List.of(srcWxtags));
        }

        /**
         * @param templateId Only for Org Level WxRule
         * 
         * @return builder
         * 
         */
        public Builder templateId(Output<String> templateId) {
            $.templateId = templateId;
            return this;
        }

        /**
         * @param templateId Only for Org Level WxRule
         * 
         * @return builder
         * 
         */
        public Builder templateId(String templateId) {
            return templateId(Output.of(templateId));
        }

        public WxruleArgs build() {
            if ($.action == null) {
                throw new MissingRequiredPropertyException("WxruleArgs", "action");
            }
            if ($.order == null) {
                throw new MissingRequiredPropertyException("WxruleArgs", "order");
            }
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("WxruleArgs", "orgId");
            }
            if ($.templateId == null) {
                throw new MissingRequiredPropertyException("WxruleArgs", "templateId");
            }
            return $;
        }
    }

}
