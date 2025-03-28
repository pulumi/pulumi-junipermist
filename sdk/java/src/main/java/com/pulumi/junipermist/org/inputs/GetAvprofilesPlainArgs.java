// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetAvprofilesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAvprofilesPlainArgs Empty = new GetAvprofilesPlainArgs();

    @Import(name="orgId", required=true)
    private String orgId;

    public String orgId() {
        return this.orgId;
    }

    private GetAvprofilesPlainArgs() {}

    private GetAvprofilesPlainArgs(GetAvprofilesPlainArgs $) {
        this.orgId = $.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAvprofilesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAvprofilesPlainArgs $;

        public Builder() {
            $ = new GetAvprofilesPlainArgs();
        }

        public Builder(GetAvprofilesPlainArgs defaults) {
            $ = new GetAvprofilesPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder orgId(String orgId) {
            $.orgId = orgId;
            return this;
        }

        public GetAvprofilesPlainArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetAvprofilesPlainArgs", "orgId");
            }
            return $;
        }
    }

}
