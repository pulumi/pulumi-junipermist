// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.outputs.GetConstAppCategoriesConstAppCategoryFilters;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetConstAppCategoriesConstAppCategory {
    /**
     * @return Description of the app category
     * 
     */
    private String display;
    private GetConstAppCategoriesConstAppCategoryFilters filters;
    /**
     * @return List of other App Categories contained by this one
     * 
     */
    private List<String> includes;
    /**
     * @return Key name of the app category
     * 
     */
    private String key;

    private GetConstAppCategoriesConstAppCategory() {}
    /**
     * @return Description of the app category
     * 
     */
    public String display() {
        return this.display;
    }
    public GetConstAppCategoriesConstAppCategoryFilters filters() {
        return this.filters;
    }
    /**
     * @return List of other App Categories contained by this one
     * 
     */
    public List<String> includes() {
        return this.includes;
    }
    /**
     * @return Key name of the app category
     * 
     */
    public String key() {
        return this.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConstAppCategoriesConstAppCategory defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String display;
        private GetConstAppCategoriesConstAppCategoryFilters filters;
        private List<String> includes;
        private String key;
        public Builder() {}
        public Builder(GetConstAppCategoriesConstAppCategory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.display = defaults.display;
    	      this.filters = defaults.filters;
    	      this.includes = defaults.includes;
    	      this.key = defaults.key;
        }

        @CustomType.Setter
        public Builder display(String display) {
            if (display == null) {
              throw new MissingRequiredPropertyException("GetConstAppCategoriesConstAppCategory", "display");
            }
            this.display = display;
            return this;
        }
        @CustomType.Setter
        public Builder filters(GetConstAppCategoriesConstAppCategoryFilters filters) {
            if (filters == null) {
              throw new MissingRequiredPropertyException("GetConstAppCategoriesConstAppCategory", "filters");
            }
            this.filters = filters;
            return this;
        }
        @CustomType.Setter
        public Builder includes(List<String> includes) {
            if (includes == null) {
              throw new MissingRequiredPropertyException("GetConstAppCategoriesConstAppCategory", "includes");
            }
            this.includes = includes;
            return this;
        }
        public Builder includes(String... includes) {
            return includes(List.of(includes));
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("GetConstAppCategoriesConstAppCategory", "key");
            }
            this.key = key;
            return this;
        }
        public GetConstAppCategoriesConstAppCategory build() {
            final var _resultValue = new GetConstAppCategoriesConstAppCategory();
            _resultValue.display = display;
            _resultValue.filters = filters;
            _resultValue.includes = includes;
            _resultValue.key = key;
            return _resultValue;
        }
    }
}
