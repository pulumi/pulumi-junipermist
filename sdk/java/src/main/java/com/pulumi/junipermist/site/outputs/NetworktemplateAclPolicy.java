// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.site.outputs.NetworktemplateAclPolicyAction;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworktemplateAclPolicy {
    /**
     * @return ACL Policy Actions:
     *   - for GBP-based policy, all src_tags and dst_tags have to be gbp-based
     *   - for ACL-based policy, `network` is required in either the source or destination so that we know where to attach the policy to
     * 
     */
    private @Nullable List<NetworktemplateAclPolicyAction> actions;
    private @Nullable String name;
    /**
     * @return ACL Policy Source Tags:
     *   - for GBP-based policy, all src_tags and dst_tags have to be gbp-based
     *   - for ACL-based policy, `network` is required in either the source or destination so that we know where to attach the policy to
     * 
     */
    private @Nullable List<String> srcTags;

    private NetworktemplateAclPolicy() {}
    /**
     * @return ACL Policy Actions:
     *   - for GBP-based policy, all src_tags and dst_tags have to be gbp-based
     *   - for ACL-based policy, `network` is required in either the source or destination so that we know where to attach the policy to
     * 
     */
    public List<NetworktemplateAclPolicyAction> actions() {
        return this.actions == null ? List.of() : this.actions;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return ACL Policy Source Tags:
     *   - for GBP-based policy, all src_tags and dst_tags have to be gbp-based
     *   - for ACL-based policy, `network` is required in either the source or destination so that we know where to attach the policy to
     * 
     */
    public List<String> srcTags() {
        return this.srcTags == null ? List.of() : this.srcTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplateAclPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<NetworktemplateAclPolicyAction> actions;
        private @Nullable String name;
        private @Nullable List<String> srcTags;
        public Builder() {}
        public Builder(NetworktemplateAclPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.name = defaults.name;
    	      this.srcTags = defaults.srcTags;
        }

        @CustomType.Setter
        public Builder actions(@Nullable List<NetworktemplateAclPolicyAction> actions) {

            this.actions = actions;
            return this;
        }
        public Builder actions(NetworktemplateAclPolicyAction... actions) {
            return actions(List.of(actions));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder srcTags(@Nullable List<String> srcTags) {

            this.srcTags = srcTags;
            return this;
        }
        public Builder srcTags(String... srcTags) {
            return srcTags(List.of(srcTags));
        }
        public NetworktemplateAclPolicy build() {
            final var _resultValue = new NetworktemplateAclPolicy();
            _resultValue.actions = actions;
            _resultValue.name = name;
            _resultValue.srcTags = srcTags;
            return _resultValue;
        }
    }
}
