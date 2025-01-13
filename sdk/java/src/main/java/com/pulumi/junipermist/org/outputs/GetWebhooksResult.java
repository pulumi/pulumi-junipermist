// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.outputs.GetWebhooksOrgWebhook;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWebhooksResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String orgId;
    private List<GetWebhooksOrgWebhook> orgWebhooks;

    private GetWebhooksResult() {}
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
    public List<GetWebhooksOrgWebhook> orgWebhooks() {
        return this.orgWebhooks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebhooksResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String orgId;
        private List<GetWebhooksOrgWebhook> orgWebhooks;
        public Builder() {}
        public Builder(GetWebhooksResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.orgId = defaults.orgId;
    	      this.orgWebhooks = defaults.orgWebhooks;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetWebhooksResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetWebhooksResult", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder orgWebhooks(List<GetWebhooksOrgWebhook> orgWebhooks) {
            if (orgWebhooks == null) {
              throw new MissingRequiredPropertyException("GetWebhooksResult", "orgWebhooks");
            }
            this.orgWebhooks = orgWebhooks;
            return this;
        }
        public Builder orgWebhooks(GetWebhooksOrgWebhook... orgWebhooks) {
            return orgWebhooks(List.of(orgWebhooks));
        }
        public GetWebhooksResult build() {
            final var _resultValue = new GetWebhooksResult();
            _resultValue.id = id;
            _resultValue.orgId = orgId;
            _resultValue.orgWebhooks = orgWebhooks;
            return _resultValue;
        }
    }
}
