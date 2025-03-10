// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SwitchSnmpConfigV3ConfigNotify {
    private String name;
    private String tag;
    /**
     * @return enum: `inform`, `trap`
     * 
     */
    private String type;

    private SwitchSnmpConfigV3ConfigNotify() {}
    public String name() {
        return this.name;
    }
    public String tag() {
        return this.tag;
    }
    /**
     * @return enum: `inform`, `trap`
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchSnmpConfigV3ConfigNotify defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String tag;
        private String type;
        public Builder() {}
        public Builder(SwitchSnmpConfigV3ConfigNotify defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tag = defaults.tag;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("SwitchSnmpConfigV3ConfigNotify", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder tag(String tag) {
            if (tag == null) {
              throw new MissingRequiredPropertyException("SwitchSnmpConfigV3ConfigNotify", "tag");
            }
            this.tag = tag;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("SwitchSnmpConfigV3ConfigNotify", "type");
            }
            this.type = type;
            return this;
        }
        public SwitchSnmpConfigV3ConfigNotify build() {
            final var _resultValue = new SwitchSnmpConfigV3ConfigNotify();
            _resultValue.name = name;
            _resultValue.tag = tag;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
