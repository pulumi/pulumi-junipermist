// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.site.outputs.GetWebhooksSiteWebhook;
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
    private String siteId;
    private List<GetWebhooksSiteWebhook> siteWebhooks;

    private GetWebhooksResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String siteId() {
        return this.siteId;
    }
    public List<GetWebhooksSiteWebhook> siteWebhooks() {
        return this.siteWebhooks;
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
        private String siteId;
        private List<GetWebhooksSiteWebhook> siteWebhooks;
        public Builder() {}
        public Builder(GetWebhooksResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.siteId = defaults.siteId;
    	      this.siteWebhooks = defaults.siteWebhooks;
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
        public Builder siteId(String siteId) {
            if (siteId == null) {
              throw new MissingRequiredPropertyException("GetWebhooksResult", "siteId");
            }
            this.siteId = siteId;
            return this;
        }
        @CustomType.Setter
        public Builder siteWebhooks(List<GetWebhooksSiteWebhook> siteWebhooks) {
            if (siteWebhooks == null) {
              throw new MissingRequiredPropertyException("GetWebhooksResult", "siteWebhooks");
            }
            this.siteWebhooks = siteWebhooks;
            return this;
        }
        public Builder siteWebhooks(GetWebhooksSiteWebhook... siteWebhooks) {
            return siteWebhooks(List.of(siteWebhooks));
        }
        public GetWebhooksResult build() {
            final var _resultValue = new GetWebhooksResult();
            _resultValue.id = id;
            _resultValue.siteId = siteId;
            _resultValue.siteWebhooks = siteWebhooks;
            return _resultValue;
        }
    }
}
