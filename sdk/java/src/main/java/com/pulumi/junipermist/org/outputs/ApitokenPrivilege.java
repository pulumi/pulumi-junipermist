// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApitokenPrivilege {
    /**
     * @return access permissions. enum: `admin`, `helpdesk`, `installer`, `read`, `write`
     * 
     */
    private String role;
    /**
     * @return enum: `org`, `site`, `sitegroup`
     * 
     */
    private String scope;
    /**
     * @return Required if `scope`==`site`
     * 
     */
    private @Nullable String siteId;
    /**
     * @return Required if `scope`==`sitegroup`
     * 
     */
    private @Nullable String sitegroupId;

    private ApitokenPrivilege() {}
    /**
     * @return access permissions. enum: `admin`, `helpdesk`, `installer`, `read`, `write`
     * 
     */
    public String role() {
        return this.role;
    }
    /**
     * @return enum: `org`, `site`, `sitegroup`
     * 
     */
    public String scope() {
        return this.scope;
    }
    /**
     * @return Required if `scope`==`site`
     * 
     */
    public Optional<String> siteId() {
        return Optional.ofNullable(this.siteId);
    }
    /**
     * @return Required if `scope`==`sitegroup`
     * 
     */
    public Optional<String> sitegroupId() {
        return Optional.ofNullable(this.sitegroupId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApitokenPrivilege defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String role;
        private String scope;
        private @Nullable String siteId;
        private @Nullable String sitegroupId;
        public Builder() {}
        public Builder(ApitokenPrivilege defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.role = defaults.role;
    	      this.scope = defaults.scope;
    	      this.siteId = defaults.siteId;
    	      this.sitegroupId = defaults.sitegroupId;
        }

        @CustomType.Setter
        public Builder role(String role) {
            if (role == null) {
              throw new MissingRequiredPropertyException("ApitokenPrivilege", "role");
            }
            this.role = role;
            return this;
        }
        @CustomType.Setter
        public Builder scope(String scope) {
            if (scope == null) {
              throw new MissingRequiredPropertyException("ApitokenPrivilege", "scope");
            }
            this.scope = scope;
            return this;
        }
        @CustomType.Setter
        public Builder siteId(@Nullable String siteId) {

            this.siteId = siteId;
            return this;
        }
        @CustomType.Setter
        public Builder sitegroupId(@Nullable String sitegroupId) {

            this.sitegroupId = sitegroupId;
            return this;
        }
        public ApitokenPrivilege build() {
            final var _resultValue = new ApitokenPrivilege();
            _resultValue.role = role;
            _resultValue.scope = scope;
            _resultValue.siteId = siteId;
            _resultValue.sitegroupId = sitegroupId;
            return _resultValue;
        }
    }
}
