// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.outputs.GetDeviceprofilesGatewayDeviceprofile;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeviceprofilesGatewayResult {
    private List<GetDeviceprofilesGatewayDeviceprofile> deviceprofiles;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String orgId;

    private GetDeviceprofilesGatewayResult() {}
    public List<GetDeviceprofilesGatewayDeviceprofile> deviceprofiles() {
        return this.deviceprofiles;
    }
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeviceprofilesGatewayResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetDeviceprofilesGatewayDeviceprofile> deviceprofiles;
        private String id;
        private String orgId;
        public Builder() {}
        public Builder(GetDeviceprofilesGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceprofiles = defaults.deviceprofiles;
    	      this.id = defaults.id;
    	      this.orgId = defaults.orgId;
        }

        @CustomType.Setter
        public Builder deviceprofiles(List<GetDeviceprofilesGatewayDeviceprofile> deviceprofiles) {
            if (deviceprofiles == null) {
              throw new MissingRequiredPropertyException("GetDeviceprofilesGatewayResult", "deviceprofiles");
            }
            this.deviceprofiles = deviceprofiles;
            return this;
        }
        public Builder deviceprofiles(GetDeviceprofilesGatewayDeviceprofile... deviceprofiles) {
            return deviceprofiles(List.of(deviceprofiles));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDeviceprofilesGatewayResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetDeviceprofilesGatewayResult", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        public GetDeviceprofilesGatewayResult build() {
            final var _resultValue = new GetDeviceprofilesGatewayResult();
            _resultValue.deviceprofiles = deviceprofiles;
            _resultValue.id = id;
            _resultValue.orgId = orgId;
            return _resultValue;
        }
    }
}
