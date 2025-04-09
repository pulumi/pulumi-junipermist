// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNacrulesOrgNacrule {
    /**
     * @return When the object has been created, in epoch
     * 
     */
    private Double createdTime;
    /**
     * @return Enabled or not
     * 
     */
    private Boolean enabled;
    /**
     * @return Unique ID of the object instance in the Mist Organization
     * 
     */
    private String id;
    /**
     * @return When the object has been modified for the last time, in epoch
     * 
     */
    private Double modifiedTime;
    private String name;
    /**
     * @return Order of the rule, lower value implies higher priority
     * 
     */
    private Integer order;
    private String orgId;

    private GetNacrulesOrgNacrule() {}
    /**
     * @return When the object has been created, in epoch
     * 
     */
    public Double createdTime() {
        return this.createdTime;
    }
    /**
     * @return Enabled or not
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Unique ID of the object instance in the Mist Organization
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return When the object has been modified for the last time, in epoch
     * 
     */
    public Double modifiedTime() {
        return this.modifiedTime;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Order of the rule, lower value implies higher priority
     * 
     */
    public Integer order() {
        return this.order;
    }
    public String orgId() {
        return this.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNacrulesOrgNacrule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double createdTime;
        private Boolean enabled;
        private String id;
        private Double modifiedTime;
        private String name;
        private Integer order;
        private String orgId;
        public Builder() {}
        public Builder(GetNacrulesOrgNacrule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdTime = defaults.createdTime;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.modifiedTime = defaults.modifiedTime;
    	      this.name = defaults.name;
    	      this.order = defaults.order;
    	      this.orgId = defaults.orgId;
        }

        @CustomType.Setter
        public Builder createdTime(Double createdTime) {
            if (createdTime == null) {
              throw new MissingRequiredPropertyException("GetNacrulesOrgNacrule", "createdTime");
            }
            this.createdTime = createdTime;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetNacrulesOrgNacrule", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNacrulesOrgNacrule", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedTime(Double modifiedTime) {
            if (modifiedTime == null) {
              throw new MissingRequiredPropertyException("GetNacrulesOrgNacrule", "modifiedTime");
            }
            this.modifiedTime = modifiedTime;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetNacrulesOrgNacrule", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder order(Integer order) {
            if (order == null) {
              throw new MissingRequiredPropertyException("GetNacrulesOrgNacrule", "order");
            }
            this.order = order;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetNacrulesOrgNacrule", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        public GetNacrulesOrgNacrule build() {
            final var _resultValue = new GetNacrulesOrgNacrule();
            _resultValue.createdTime = createdTime;
            _resultValue.enabled = enabled;
            _resultValue.id = id;
            _resultValue.modifiedTime = modifiedTime;
            _resultValue.name = name;
            _resultValue.order = order;
            _resultValue.orgId = orgId;
            return _resultValue;
        }
    }
}
