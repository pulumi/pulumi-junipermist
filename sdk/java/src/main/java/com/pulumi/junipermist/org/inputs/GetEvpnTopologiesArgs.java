// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetEvpnTopologiesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEvpnTopologiesArgs Empty = new GetEvpnTopologiesArgs();

    @Import(name="orgId", required=true)
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    private GetEvpnTopologiesArgs() {}

    private GetEvpnTopologiesArgs(GetEvpnTopologiesArgs $) {
        this.orgId = $.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEvpnTopologiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEvpnTopologiesArgs $;

        public Builder() {
            $ = new GetEvpnTopologiesArgs();
        }

        public Builder(GetEvpnTopologiesArgs defaults) {
            $ = new GetEvpnTopologiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public GetEvpnTopologiesArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetEvpnTopologiesArgs", "orgId");
            }
            return $;
        }
    }

}
