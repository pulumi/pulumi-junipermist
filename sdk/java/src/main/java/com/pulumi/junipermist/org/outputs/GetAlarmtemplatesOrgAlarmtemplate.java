// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.outputs.GetAlarmtemplatesOrgAlarmtemplateDelivery;
import com.pulumi.junipermist.org.outputs.GetAlarmtemplatesOrgAlarmtemplateRules;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetAlarmtemplatesOrgAlarmtemplate {
    /**
     * @return when the object has been created, in epoch
     * 
     */
    private Double createdTime;
    /**
     * @return Delivery object to configure the alarm delivery
     * 
     */
    private GetAlarmtemplatesOrgAlarmtemplateDelivery delivery;
    /**
     * @return Unique ID of the object instance in the Mist Organnization
     * 
     */
    private String id;
    /**
     * @return when the object has been modified for the last time, in epoch
     * 
     */
    private Double modifiedTime;
    /**
     * @return Some string to name the alarm template
     * 
     */
    private String name;
    private String orgId;
    /**
     * @return Alarm Rules object to configure the individual alarm keys/types. Property key is the alarm name.
     * 
     */
    private Map<String,GetAlarmtemplatesOrgAlarmtemplateRules> rules;

    private GetAlarmtemplatesOrgAlarmtemplate() {}
    /**
     * @return when the object has been created, in epoch
     * 
     */
    public Double createdTime() {
        return this.createdTime;
    }
    /**
     * @return Delivery object to configure the alarm delivery
     * 
     */
    public GetAlarmtemplatesOrgAlarmtemplateDelivery delivery() {
        return this.delivery;
    }
    /**
     * @return Unique ID of the object instance in the Mist Organnization
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return when the object has been modified for the last time, in epoch
     * 
     */
    public Double modifiedTime() {
        return this.modifiedTime;
    }
    /**
     * @return Some string to name the alarm template
     * 
     */
    public String name() {
        return this.name;
    }
    public String orgId() {
        return this.orgId;
    }
    /**
     * @return Alarm Rules object to configure the individual alarm keys/types. Property key is the alarm name.
     * 
     */
    public Map<String,GetAlarmtemplatesOrgAlarmtemplateRules> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlarmtemplatesOrgAlarmtemplate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double createdTime;
        private GetAlarmtemplatesOrgAlarmtemplateDelivery delivery;
        private String id;
        private Double modifiedTime;
        private String name;
        private String orgId;
        private Map<String,GetAlarmtemplatesOrgAlarmtemplateRules> rules;
        public Builder() {}
        public Builder(GetAlarmtemplatesOrgAlarmtemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdTime = defaults.createdTime;
    	      this.delivery = defaults.delivery;
    	      this.id = defaults.id;
    	      this.modifiedTime = defaults.modifiedTime;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder createdTime(Double createdTime) {
            if (createdTime == null) {
              throw new MissingRequiredPropertyException("GetAlarmtemplatesOrgAlarmtemplate", "createdTime");
            }
            this.createdTime = createdTime;
            return this;
        }
        @CustomType.Setter
        public Builder delivery(GetAlarmtemplatesOrgAlarmtemplateDelivery delivery) {
            if (delivery == null) {
              throw new MissingRequiredPropertyException("GetAlarmtemplatesOrgAlarmtemplate", "delivery");
            }
            this.delivery = delivery;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAlarmtemplatesOrgAlarmtemplate", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedTime(Double modifiedTime) {
            if (modifiedTime == null) {
              throw new MissingRequiredPropertyException("GetAlarmtemplatesOrgAlarmtemplate", "modifiedTime");
            }
            this.modifiedTime = modifiedTime;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAlarmtemplatesOrgAlarmtemplate", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetAlarmtemplatesOrgAlarmtemplate", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder rules(Map<String,GetAlarmtemplatesOrgAlarmtemplateRules> rules) {
            if (rules == null) {
              throw new MissingRequiredPropertyException("GetAlarmtemplatesOrgAlarmtemplate", "rules");
            }
            this.rules = rules;
            return this;
        }
        public GetAlarmtemplatesOrgAlarmtemplate build() {
            final var _resultValue = new GetAlarmtemplatesOrgAlarmtemplate();
            _resultValue.createdTime = createdTime;
            _resultValue.delivery = delivery;
            _resultValue.id = id;
            _resultValue.modifiedTime = modifiedTime;
            _resultValue.name = name;
            _resultValue.orgId = orgId;
            _resultValue.rules = rules;
            return _resultValue;
        }
    }
}
