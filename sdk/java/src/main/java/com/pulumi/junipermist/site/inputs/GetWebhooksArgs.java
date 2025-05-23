// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetWebhooksArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebhooksArgs Empty = new GetWebhooksArgs();

    @Import(name="siteId", required=true)
    private Output<String> siteId;

    public Output<String> siteId() {
        return this.siteId;
    }

    private GetWebhooksArgs() {}

    private GetWebhooksArgs(GetWebhooksArgs $) {
        this.siteId = $.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebhooksArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebhooksArgs $;

        public Builder() {
            $ = new GetWebhooksArgs();
        }

        public Builder(GetWebhooksArgs defaults) {
            $ = new GetWebhooksArgs(Objects.requireNonNull(defaults));
        }

        public Builder siteId(Output<String> siteId) {
            $.siteId = siteId;
            return this;
        }

        public Builder siteId(String siteId) {
            return siteId(Output.of(siteId));
        }

        public GetWebhooksArgs build() {
            if ($.siteId == null) {
                throw new MissingRequiredPropertyException("GetWebhooksArgs", "siteId");
            }
            return $;
        }
    }

}
