// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.outputs.GetWlantemplatesOrgWlantemplate;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWlantemplatesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String orgId;
    private List<GetWlantemplatesOrgWlantemplate> orgWlantemplates;

    private GetWlantemplatesResult() {}
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
    public List<GetWlantemplatesOrgWlantemplate> orgWlantemplates() {
        return this.orgWlantemplates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWlantemplatesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String orgId;
        private List<GetWlantemplatesOrgWlantemplate> orgWlantemplates;
        public Builder() {}
        public Builder(GetWlantemplatesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.orgId = defaults.orgId;
    	      this.orgWlantemplates = defaults.orgWlantemplates;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetWlantemplatesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetWlantemplatesResult", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder orgWlantemplates(List<GetWlantemplatesOrgWlantemplate> orgWlantemplates) {
            if (orgWlantemplates == null) {
              throw new MissingRequiredPropertyException("GetWlantemplatesResult", "orgWlantemplates");
            }
            this.orgWlantemplates = orgWlantemplates;
            return this;
        }
        public Builder orgWlantemplates(GetWlantemplatesOrgWlantemplate... orgWlantemplates) {
            return orgWlantemplates(List.of(orgWlantemplates));
        }
        public GetWlantemplatesResult build() {
            final var _resultValue = new GetWlantemplatesResult();
            _resultValue.id = id;
            _resultValue.orgId = orgId;
            _resultValue.orgWlantemplates = orgWlantemplates;
            return _resultValue;
        }
    }
}
