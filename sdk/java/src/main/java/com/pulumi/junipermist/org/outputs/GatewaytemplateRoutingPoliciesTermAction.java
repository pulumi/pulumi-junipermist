// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewaytemplateRoutingPoliciesTermAction {
    private @Nullable Boolean accept;
    private @Nullable List<String> addCommunities;
    /**
     * @return for SSR, hub decides how VRF routes are leaked on spoke
     * 
     */
    private @Nullable List<String> addTargetVrfs;
    /**
     * @return route aggregation
     * 
     */
    private @Nullable List<String> aggregates;
    /**
     * @return when used as export policy, optional
     * 
     */
    private @Nullable List<String> communities;
    /**
     * @return when used as export policy, optional. To exclude certain AS
     * 
     */
    private @Nullable List<String> excludeAsPaths;
    private @Nullable List<String> excludeCommunities;
    /**
     * @return when used as export policy, optional
     * 
     */
    private @Nullable List<String> exportCommunitites;
    /**
     * @return optional, for an import policy, local_preference can be changed
     * 
     */
    private @Nullable String localPreference;
    /**
     * @return when used as export policy, optional. By default, the local AS will be prepended, to change it
     * 
     */
    private @Nullable List<String> prependAsPaths;

    private GatewaytemplateRoutingPoliciesTermAction() {}
    public Optional<Boolean> accept() {
        return Optional.ofNullable(this.accept);
    }
    public List<String> addCommunities() {
        return this.addCommunities == null ? List.of() : this.addCommunities;
    }
    /**
     * @return for SSR, hub decides how VRF routes are leaked on spoke
     * 
     */
    public List<String> addTargetVrfs() {
        return this.addTargetVrfs == null ? List.of() : this.addTargetVrfs;
    }
    /**
     * @return route aggregation
     * 
     */
    public List<String> aggregates() {
        return this.aggregates == null ? List.of() : this.aggregates;
    }
    /**
     * @return when used as export policy, optional
     * 
     */
    public List<String> communities() {
        return this.communities == null ? List.of() : this.communities;
    }
    /**
     * @return when used as export policy, optional. To exclude certain AS
     * 
     */
    public List<String> excludeAsPaths() {
        return this.excludeAsPaths == null ? List.of() : this.excludeAsPaths;
    }
    public List<String> excludeCommunities() {
        return this.excludeCommunities == null ? List.of() : this.excludeCommunities;
    }
    /**
     * @return when used as export policy, optional
     * 
     */
    public List<String> exportCommunitites() {
        return this.exportCommunitites == null ? List.of() : this.exportCommunitites;
    }
    /**
     * @return optional, for an import policy, local_preference can be changed
     * 
     */
    public Optional<String> localPreference() {
        return Optional.ofNullable(this.localPreference);
    }
    /**
     * @return when used as export policy, optional. By default, the local AS will be prepended, to change it
     * 
     */
    public List<String> prependAsPaths() {
        return this.prependAsPaths == null ? List.of() : this.prependAsPaths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewaytemplateRoutingPoliciesTermAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean accept;
        private @Nullable List<String> addCommunities;
        private @Nullable List<String> addTargetVrfs;
        private @Nullable List<String> aggregates;
        private @Nullable List<String> communities;
        private @Nullable List<String> excludeAsPaths;
        private @Nullable List<String> excludeCommunities;
        private @Nullable List<String> exportCommunitites;
        private @Nullable String localPreference;
        private @Nullable List<String> prependAsPaths;
        public Builder() {}
        public Builder(GatewaytemplateRoutingPoliciesTermAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accept = defaults.accept;
    	      this.addCommunities = defaults.addCommunities;
    	      this.addTargetVrfs = defaults.addTargetVrfs;
    	      this.aggregates = defaults.aggregates;
    	      this.communities = defaults.communities;
    	      this.excludeAsPaths = defaults.excludeAsPaths;
    	      this.excludeCommunities = defaults.excludeCommunities;
    	      this.exportCommunitites = defaults.exportCommunitites;
    	      this.localPreference = defaults.localPreference;
    	      this.prependAsPaths = defaults.prependAsPaths;
        }

        @CustomType.Setter
        public Builder accept(@Nullable Boolean accept) {

            this.accept = accept;
            return this;
        }
        @CustomType.Setter
        public Builder addCommunities(@Nullable List<String> addCommunities) {

            this.addCommunities = addCommunities;
            return this;
        }
        public Builder addCommunities(String... addCommunities) {
            return addCommunities(List.of(addCommunities));
        }
        @CustomType.Setter
        public Builder addTargetVrfs(@Nullable List<String> addTargetVrfs) {

            this.addTargetVrfs = addTargetVrfs;
            return this;
        }
        public Builder addTargetVrfs(String... addTargetVrfs) {
            return addTargetVrfs(List.of(addTargetVrfs));
        }
        @CustomType.Setter
        public Builder aggregates(@Nullable List<String> aggregates) {

            this.aggregates = aggregates;
            return this;
        }
        public Builder aggregates(String... aggregates) {
            return aggregates(List.of(aggregates));
        }
        @CustomType.Setter
        public Builder communities(@Nullable List<String> communities) {

            this.communities = communities;
            return this;
        }
        public Builder communities(String... communities) {
            return communities(List.of(communities));
        }
        @CustomType.Setter
        public Builder excludeAsPaths(@Nullable List<String> excludeAsPaths) {

            this.excludeAsPaths = excludeAsPaths;
            return this;
        }
        public Builder excludeAsPaths(String... excludeAsPaths) {
            return excludeAsPaths(List.of(excludeAsPaths));
        }
        @CustomType.Setter
        public Builder excludeCommunities(@Nullable List<String> excludeCommunities) {

            this.excludeCommunities = excludeCommunities;
            return this;
        }
        public Builder excludeCommunities(String... excludeCommunities) {
            return excludeCommunities(List.of(excludeCommunities));
        }
        @CustomType.Setter
        public Builder exportCommunitites(@Nullable List<String> exportCommunitites) {

            this.exportCommunitites = exportCommunitites;
            return this;
        }
        public Builder exportCommunitites(String... exportCommunitites) {
            return exportCommunitites(List.of(exportCommunitites));
        }
        @CustomType.Setter
        public Builder localPreference(@Nullable String localPreference) {

            this.localPreference = localPreference;
            return this;
        }
        @CustomType.Setter
        public Builder prependAsPaths(@Nullable List<String> prependAsPaths) {

            this.prependAsPaths = prependAsPaths;
            return this;
        }
        public Builder prependAsPaths(String... prependAsPaths) {
            return prependAsPaths(List.of(prependAsPaths));
        }
        public GatewaytemplateRoutingPoliciesTermAction build() {
            final var _resultValue = new GatewaytemplateRoutingPoliciesTermAction();
            _resultValue.accept = accept;
            _resultValue.addCommunities = addCommunities;
            _resultValue.addTargetVrfs = addTargetVrfs;
            _resultValue.aggregates = aggregates;
            _resultValue.communities = communities;
            _resultValue.excludeAsPaths = excludeAsPaths;
            _resultValue.excludeCommunities = excludeCommunities;
            _resultValue.exportCommunitites = exportCommunitites;
            _resultValue.localPreference = localPreference;
            _resultValue.prependAsPaths = prependAsPaths;
            return _resultValue;
        }
    }
}
