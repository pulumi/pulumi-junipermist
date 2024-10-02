// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSitesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSitesArgs Empty = new GetSitesArgs();

    @Import(name="orgId", required=true)
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    private GetSitesArgs() {}

    private GetSitesArgs(GetSitesArgs $) {
        this.orgId = $.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSitesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSitesArgs $;

        public Builder() {
            $ = new GetSitesArgs();
        }

        public Builder(GetSitesArgs defaults) {
            $ = new GetSitesArgs(Objects.requireNonNull(defaults));
        }

        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public GetSitesArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetSitesArgs", "orgId");
            }
            return $;
        }
    }

}