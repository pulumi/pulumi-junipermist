// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSwitchStatsDeviceSwitchStatModuleStatPicPortGroup {
    private Integer count;
    private String type;

    private GetSwitchStatsDeviceSwitchStatModuleStatPicPortGroup() {}
    public Integer count() {
        return this.count;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchStatsDeviceSwitchStatModuleStatPicPortGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer count;
        private String type;
        public Builder() {}
        public Builder(GetSwitchStatsDeviceSwitchStatModuleStatPicPortGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder count(Integer count) {
            if (count == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsDeviceSwitchStatModuleStatPicPortGroup", "count");
            }
            this.count = count;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsDeviceSwitchStatModuleStatPicPortGroup", "type");
            }
            this.type = type;
            return this;
        }
        public GetSwitchStatsDeviceSwitchStatModuleStatPicPortGroup build() {
            final var _resultValue = new GetSwitchStatsDeviceSwitchStatModuleStatPicPortGroup();
            _resultValue.count = count;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
