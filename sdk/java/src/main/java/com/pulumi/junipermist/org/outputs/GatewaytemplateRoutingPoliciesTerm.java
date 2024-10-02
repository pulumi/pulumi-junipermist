// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.org.outputs.GatewaytemplateRoutingPoliciesTermAction;
import com.pulumi.junipermist.org.outputs.GatewaytemplateRoutingPoliciesTermMatching;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewaytemplateRoutingPoliciesTerm {
    /**
     * @return when used as import policy
     * 
     */
    private @Nullable GatewaytemplateRoutingPoliciesTermAction action;
    /**
     * @return zero or more criteria/filter can be specified to match the term, all criteria have to be met
     * 
     */
    private @Nullable GatewaytemplateRoutingPoliciesTermMatching matching;

    private GatewaytemplateRoutingPoliciesTerm() {}
    /**
     * @return when used as import policy
     * 
     */
    public Optional<GatewaytemplateRoutingPoliciesTermAction> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return zero or more criteria/filter can be specified to match the term, all criteria have to be met
     * 
     */
    public Optional<GatewaytemplateRoutingPoliciesTermMatching> matching() {
        return Optional.ofNullable(this.matching);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewaytemplateRoutingPoliciesTerm defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GatewaytemplateRoutingPoliciesTermAction action;
        private @Nullable GatewaytemplateRoutingPoliciesTermMatching matching;
        public Builder() {}
        public Builder(GatewaytemplateRoutingPoliciesTerm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.matching = defaults.matching;
        }

        @CustomType.Setter
        public Builder action(@Nullable GatewaytemplateRoutingPoliciesTermAction action) {

            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder matching(@Nullable GatewaytemplateRoutingPoliciesTermMatching matching) {

            this.matching = matching;
            return this;
        }
        public GatewaytemplateRoutingPoliciesTerm build() {
            final var _resultValue = new GatewaytemplateRoutingPoliciesTerm();
            _resultValue.action = action;
            _resultValue.matching = matching;
            return _resultValue;
        }
    }
}