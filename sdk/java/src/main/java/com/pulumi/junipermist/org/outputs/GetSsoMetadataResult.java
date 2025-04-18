// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSsoMetadataResult {
    /**
     * @return If `idp_type`==`saml`
     * 
     */
    private String acsUrl;
    /**
     * @return If `idp_type`==`saml`
     * 
     */
    private String entityId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return If `idp_type`==`saml`
     * 
     */
    private String logoutUrl;
    /**
     * @return If `idp_type`==`saml`
     * 
     */
    private String metadata;
    private String orgId;
    /**
     * @return If `idp_type`==`oauth` and `scim_enabled`==`true`
     * 
     */
    private String scimBaseUrl;
    private String ssoId;

    private GetSsoMetadataResult() {}
    /**
     * @return If `idp_type`==`saml`
     * 
     */
    public String acsUrl() {
        return this.acsUrl;
    }
    /**
     * @return If `idp_type`==`saml`
     * 
     */
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
    /**
     * @return If `idp_type`==`saml`
     * 
     */
    public String logoutUrl() {
        return this.logoutUrl;
    }
    /**
     * @return If `idp_type`==`saml`
     * 
     */
    public String metadata() {
        return this.metadata;
    }
    public String orgId() {
        return this.orgId;
    }
    /**
     * @return If `idp_type`==`oauth` and `scim_enabled`==`true`
     * 
     */
    public String scimBaseUrl() {
        return this.scimBaseUrl;
    }
    public String ssoId() {
        return this.ssoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSsoMetadataResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String acsUrl;
        private String entityId;
        private String id;
        private String logoutUrl;
        private String metadata;
        private String orgId;
        private String scimBaseUrl;
        private String ssoId;
        public Builder() {}
        public Builder(GetSsoMetadataResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acsUrl = defaults.acsUrl;
    	      this.entityId = defaults.entityId;
    	      this.id = defaults.id;
    	      this.logoutUrl = defaults.logoutUrl;
    	      this.metadata = defaults.metadata;
    	      this.orgId = defaults.orgId;
    	      this.scimBaseUrl = defaults.scimBaseUrl;
    	      this.ssoId = defaults.ssoId;
        }

        @CustomType.Setter
        public Builder acsUrl(String acsUrl) {
            if (acsUrl == null) {
              throw new MissingRequiredPropertyException("GetSsoMetadataResult", "acsUrl");
            }
            this.acsUrl = acsUrl;
            return this;
        }
        @CustomType.Setter
        public Builder entityId(String entityId) {
            if (entityId == null) {
              throw new MissingRequiredPropertyException("GetSsoMetadataResult", "entityId");
            }
            this.entityId = entityId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSsoMetadataResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder logoutUrl(String logoutUrl) {
            if (logoutUrl == null) {
              throw new MissingRequiredPropertyException("GetSsoMetadataResult", "logoutUrl");
            }
            this.logoutUrl = logoutUrl;
            return this;
        }
        @CustomType.Setter
        public Builder metadata(String metadata) {
            if (metadata == null) {
              throw new MissingRequiredPropertyException("GetSsoMetadataResult", "metadata");
            }
            this.metadata = metadata;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetSsoMetadataResult", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder scimBaseUrl(String scimBaseUrl) {
            if (scimBaseUrl == null) {
              throw new MissingRequiredPropertyException("GetSsoMetadataResult", "scimBaseUrl");
            }
            this.scimBaseUrl = scimBaseUrl;
            return this;
        }
        @CustomType.Setter
        public Builder ssoId(String ssoId) {
            if (ssoId == null) {
              throw new MissingRequiredPropertyException("GetSsoMetadataResult", "ssoId");
            }
            this.ssoId = ssoId;
            return this;
        }
        public GetSsoMetadataResult build() {
            final var _resultValue = new GetSsoMetadataResult();
            _resultValue.acsUrl = acsUrl;
            _resultValue.entityId = entityId;
            _resultValue.id = id;
            _resultValue.logoutUrl = logoutUrl;
            _resultValue.metadata = metadata;
            _resultValue.orgId = orgId;
            _resultValue.scimBaseUrl = scimBaseUrl;
            _resultValue.ssoId = ssoId;
            return _resultValue;
        }
    }
}
