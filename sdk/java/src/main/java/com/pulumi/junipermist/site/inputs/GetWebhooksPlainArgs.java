// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWebhooksPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebhooksPlainArgs Empty = new GetWebhooksPlainArgs();

    @Import(name="limit")
    private @Nullable Integer limit;

    public Optional<Integer> limit() {
        return Optional.ofNullable(this.limit);
    }

    @Import(name="page")
    private @Nullable Integer page;

    public Optional<Integer> page() {
        return Optional.ofNullable(this.page);
    }

    @Import(name="siteId", required=true)
    private String siteId;

    public String siteId() {
        return this.siteId;
    }

    private GetWebhooksPlainArgs() {}

    private GetWebhooksPlainArgs(GetWebhooksPlainArgs $) {
        this.limit = $.limit;
        this.page = $.page;
        this.siteId = $.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebhooksPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebhooksPlainArgs $;

        public Builder() {
            $ = new GetWebhooksPlainArgs();
        }

        public Builder(GetWebhooksPlainArgs defaults) {
            $ = new GetWebhooksPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder limit(@Nullable Integer limit) {
            $.limit = limit;
            return this;
        }

        public Builder page(@Nullable Integer page) {
            $.page = page;
            return this;
        }

        public Builder siteId(String siteId) {
            $.siteId = siteId;
            return this;
        }

        public GetWebhooksPlainArgs build() {
            if ($.siteId == null) {
                throw new MissingRequiredPropertyException("GetWebhooksPlainArgs", "siteId");
            }
            return $;
        }
    }

}
