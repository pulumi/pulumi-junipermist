// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.outputs.GetRftemplatesOrgRftemplate;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRftemplatesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String orgId;
    private List<GetRftemplatesOrgRftemplate> orgRftemplates;
    private @Nullable Integer page;

    private GetRftemplatesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String orgId() {
        return this.orgId;
    }
    public List<GetRftemplatesOrgRftemplate> orgRftemplates() {
        return this.orgRftemplates;
    }
    public Optional<Integer> page() {
        return Optional.ofNullable(this.page);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRftemplatesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String orgId;
        private List<GetRftemplatesOrgRftemplate> orgRftemplates;
        private @Nullable Integer page;
        public Builder() {}
        public Builder(GetRftemplatesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.orgId = defaults.orgId;
    	      this.orgRftemplates = defaults.orgRftemplates;
    	      this.page = defaults.page;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRftemplatesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetRftemplatesResult", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder orgRftemplates(List<GetRftemplatesOrgRftemplate> orgRftemplates) {
            if (orgRftemplates == null) {
              throw new MissingRequiredPropertyException("GetRftemplatesResult", "orgRftemplates");
            }
            this.orgRftemplates = orgRftemplates;
            return this;
        }
        public Builder orgRftemplates(GetRftemplatesOrgRftemplate... orgRftemplates) {
            return orgRftemplates(List.of(orgRftemplates));
        }
        @CustomType.Setter
        public Builder page(@Nullable Integer page) {

            this.page = page;
            return this;
        }
        public GetRftemplatesResult build() {
            final var _resultValue = new GetRftemplatesResult();
            _resultValue.id = id;
            _resultValue.orgId = orgId;
            _resultValue.orgRftemplates = orgRftemplates;
            _resultValue.page = page;
            return _resultValue;
        }
    }
}
