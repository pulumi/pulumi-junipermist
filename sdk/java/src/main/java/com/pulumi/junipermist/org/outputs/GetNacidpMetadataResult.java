// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNacidpMetadataResult {
    private String acsUrl;
    private String entityId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String logoutUrl;
    private String metadata;
    private String nacidpId;
    private String orgId;

    private GetNacidpMetadataResult() {}
    public String acsUrl() {
        return this.acsUrl;
    }
    public String entityId() {
        return this.entityId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String logoutUrl() {
        return this.logoutUrl;
    }
    public String metadata() {
        return this.metadata;
    }
    public String nacidpId() {
        return this.nacidpId;
    }
    public String orgId() {
        return this.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNacidpMetadataResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String acsUrl;
        private String entityId;
        private String id;
        private String logoutUrl;
        private String metadata;
        private String nacidpId;
        private String orgId;
        public Builder() {}
        public Builder(GetNacidpMetadataResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acsUrl = defaults.acsUrl;
    	      this.entityId = defaults.entityId;
    	      this.id = defaults.id;
    	      this.logoutUrl = defaults.logoutUrl;
    	      this.metadata = defaults.metadata;
    	      this.nacidpId = defaults.nacidpId;
    	      this.orgId = defaults.orgId;
        }

        @CustomType.Setter
        public Builder acsUrl(String acsUrl) {
            if (acsUrl == null) {
              throw new MissingRequiredPropertyException("GetNacidpMetadataResult", "acsUrl");
            }
            this.acsUrl = acsUrl;
            return this;
        }
        @CustomType.Setter
        public Builder entityId(String entityId) {
            if (entityId == null) {
              throw new MissingRequiredPropertyException("GetNacidpMetadataResult", "entityId");
            }
            this.entityId = entityId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNacidpMetadataResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder logoutUrl(String logoutUrl) {
            if (logoutUrl == null) {
              throw new MissingRequiredPropertyException("GetNacidpMetadataResult", "logoutUrl");
            }
            this.logoutUrl = logoutUrl;
            return this;
        }
        @CustomType.Setter
        public Builder metadata(String metadata) {
            if (metadata == null) {
              throw new MissingRequiredPropertyException("GetNacidpMetadataResult", "metadata");
            }
            this.metadata = metadata;
            return this;
        }
        @CustomType.Setter
        public Builder nacidpId(String nacidpId) {
            if (nacidpId == null) {
              throw new MissingRequiredPropertyException("GetNacidpMetadataResult", "nacidpId");
            }
            this.nacidpId = nacidpId;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetNacidpMetadataResult", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        public GetNacidpMetadataResult build() {
            final var _resultValue = new GetNacidpMetadataResult();
            _resultValue.acsUrl = acsUrl;
            _resultValue.entityId = entityId;
            _resultValue.id = id;
            _resultValue.logoutUrl = logoutUrl;
            _resultValue.metadata = metadata;
            _resultValue.nacidpId = nacidpId;
            _resultValue.orgId = orgId;
            return _resultValue;
        }
    }
}