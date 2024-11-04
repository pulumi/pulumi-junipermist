// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.outputs.GetConstWebhooksConstWebhook;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetConstWebhooksResult {
    private List<GetConstWebhooksConstWebhook> constWebhooks;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;

    private GetConstWebhooksResult() {}
    public List<GetConstWebhooksConstWebhook> constWebhooks() {
        return this.constWebhooks;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConstWebhooksResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetConstWebhooksConstWebhook> constWebhooks;
        private String id;
        public Builder() {}
        public Builder(GetConstWebhooksResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constWebhooks = defaults.constWebhooks;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder constWebhooks(List<GetConstWebhooksConstWebhook> constWebhooks) {
            if (constWebhooks == null) {
              throw new MissingRequiredPropertyException("GetConstWebhooksResult", "constWebhooks");
            }
            this.constWebhooks = constWebhooks;
            return this;
        }
        public Builder constWebhooks(GetConstWebhooksConstWebhook... constWebhooks) {
            return constWebhooks(List.of(constWebhooks));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetConstWebhooksResult", "id");
            }
            this.id = id;
            return this;
        }
        public GetConstWebhooksResult build() {
            final var _resultValue = new GetConstWebhooksResult();
            _resultValue.constWebhooks = constWebhooks;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}