// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetNetworksPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworksPlainArgs Empty = new GetNetworksPlainArgs();

    @Import(name="orgId", required=true)
    private String orgId;

    public String orgId() {
        return this.orgId;
    }

    private GetNetworksPlainArgs() {}

    private GetNetworksPlainArgs(GetNetworksPlainArgs $) {
        this.orgId = $.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworksPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworksPlainArgs $;

        public Builder() {
            $ = new GetNetworksPlainArgs();
        }

        public Builder(GetNetworksPlainArgs defaults) {
            $ = new GetNetworksPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder orgId(String orgId) {
            $.orgId = orgId;
            return this;
        }

        public GetNetworksPlainArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetNetworksPlainArgs", "orgId");
            }
            return $;
        }
    }

}