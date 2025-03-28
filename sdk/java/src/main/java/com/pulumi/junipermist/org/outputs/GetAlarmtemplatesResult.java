// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.outputs.GetAlarmtemplatesOrgAlarmtemplate;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAlarmtemplatesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<GetAlarmtemplatesOrgAlarmtemplate> orgAlarmtemplates;
    private String orgId;

    private GetAlarmtemplatesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetAlarmtemplatesOrgAlarmtemplate> orgAlarmtemplates() {
        return this.orgAlarmtemplates;
    }
    public String orgId() {
        return this.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlarmtemplatesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetAlarmtemplatesOrgAlarmtemplate> orgAlarmtemplates;
        private String orgId;
        public Builder() {}
        public Builder(GetAlarmtemplatesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.orgAlarmtemplates = defaults.orgAlarmtemplates;
    	      this.orgId = defaults.orgId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAlarmtemplatesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder orgAlarmtemplates(List<GetAlarmtemplatesOrgAlarmtemplate> orgAlarmtemplates) {
            if (orgAlarmtemplates == null) {
              throw new MissingRequiredPropertyException("GetAlarmtemplatesResult", "orgAlarmtemplates");
            }
            this.orgAlarmtemplates = orgAlarmtemplates;
            return this;
        }
        public Builder orgAlarmtemplates(GetAlarmtemplatesOrgAlarmtemplate... orgAlarmtemplates) {
            return orgAlarmtemplates(List.of(orgAlarmtemplates));
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetAlarmtemplatesResult", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        public GetAlarmtemplatesResult build() {
            final var _resultValue = new GetAlarmtemplatesResult();
            _resultValue.id = id;
            _resultValue.orgAlarmtemplates = orgAlarmtemplates;
            _resultValue.orgId = orgId;
            return _resultValue;
        }
    }
}
