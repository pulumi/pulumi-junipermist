// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetEvpnTopologiesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEvpnTopologiesPlainArgs Empty = new GetEvpnTopologiesPlainArgs();

    @Import(name="orgId", required=true)
    private String orgId;

    public String orgId() {
        return this.orgId;
    }

    private GetEvpnTopologiesPlainArgs() {}

    private GetEvpnTopologiesPlainArgs(GetEvpnTopologiesPlainArgs $) {
        this.orgId = $.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEvpnTopologiesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEvpnTopologiesPlainArgs $;

        public Builder() {
            $ = new GetEvpnTopologiesPlainArgs();
        }

        public Builder(GetEvpnTopologiesPlainArgs defaults) {
            $ = new GetEvpnTopologiesPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder orgId(String orgId) {
            $.orgId = orgId;
            return this;
        }

        public GetEvpnTopologiesPlainArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetEvpnTopologiesPlainArgs", "orgId");
            }
            return $;
        }
    }

}
