// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVersionsDeviceVersion {
    /**
     * @return Device model (as seen in the device stats)
     * 
     */
    private String model;
    /**
     * @return Annotation, stable / beta / alpha. Or it can be empty or nothing which is likely a dev build
     * 
     */
    private String tag;
    /**
     * @return Firmware version
     * 
     */
    private String version;

    private GetVersionsDeviceVersion() {}
    /**
     * @return Device model (as seen in the device stats)
     * 
     */
    public String model() {
        return this.model;
    }
    /**
     * @return Annotation, stable / beta / alpha. Or it can be empty or nothing which is likely a dev build
     * 
     */
    public String tag() {
        return this.tag;
    }
    /**
     * @return Firmware version
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVersionsDeviceVersion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String model;
        private String tag;
        private String version;
        public Builder() {}
        public Builder(GetVersionsDeviceVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.model = defaults.model;
    	      this.tag = defaults.tag;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder model(String model) {
            if (model == null) {
              throw new MissingRequiredPropertyException("GetVersionsDeviceVersion", "model");
            }
            this.model = model;
            return this;
        }
        @CustomType.Setter
        public Builder tag(String tag) {
            if (tag == null) {
              throw new MissingRequiredPropertyException("GetVersionsDeviceVersion", "tag");
            }
            this.tag = tag;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetVersionsDeviceVersion", "version");
            }
            this.version = version;
            return this;
        }
        public GetVersionsDeviceVersion build() {
            final var _resultValue = new GetVersionsDeviceVersion();
            _resultValue.model = model;
            _resultValue.tag = tag;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
