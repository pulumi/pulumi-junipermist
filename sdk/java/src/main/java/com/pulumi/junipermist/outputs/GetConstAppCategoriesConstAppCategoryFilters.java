// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetConstAppCategoriesConstAppCategoryFilters {
    private List<String> srxes;
    private List<String> ssrs;

    private GetConstAppCategoriesConstAppCategoryFilters() {}
    public List<String> srxes() {
        return this.srxes;
    }
    public List<String> ssrs() {
        return this.ssrs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConstAppCategoriesConstAppCategoryFilters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> srxes;
        private List<String> ssrs;
        public Builder() {}
        public Builder(GetConstAppCategoriesConstAppCategoryFilters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.srxes = defaults.srxes;
    	      this.ssrs = defaults.ssrs;
        }

        @CustomType.Setter
        public Builder srxes(List<String> srxes) {
            if (srxes == null) {
              throw new MissingRequiredPropertyException("GetConstAppCategoriesConstAppCategoryFilters", "srxes");
            }
            this.srxes = srxes;
            return this;
        }
        public Builder srxes(String... srxes) {
            return srxes(List.of(srxes));
        }
        @CustomType.Setter
        public Builder ssrs(List<String> ssrs) {
            if (ssrs == null) {
              throw new MissingRequiredPropertyException("GetConstAppCategoriesConstAppCategoryFilters", "ssrs");
            }
            this.ssrs = ssrs;
            return this;
        }
        public Builder ssrs(String... ssrs) {
            return ssrs(List.of(ssrs));
        }
        public GetConstAppCategoriesConstAppCategoryFilters build() {
            final var _resultValue = new GetConstAppCategoriesConstAppCategoryFilters();
            _resultValue.srxes = srxes;
            _resultValue.ssrs = ssrs;
            return _resultValue;
        }
    }
}
