// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GatewaytemplateExtraRoutes6Args extends com.pulumi.resources.ResourceArgs {

    public static final GatewaytemplateExtraRoutes6Args Empty = new GatewaytemplateExtraRoutes6Args();

    @Import(name="via", required=true)
    private Output<String> via;

    public Output<String> via() {
        return this.via;
    }

    private GatewaytemplateExtraRoutes6Args() {}

    private GatewaytemplateExtraRoutes6Args(GatewaytemplateExtraRoutes6Args $) {
        this.via = $.via;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewaytemplateExtraRoutes6Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewaytemplateExtraRoutes6Args $;

        public Builder() {
            $ = new GatewaytemplateExtraRoutes6Args();
        }

        public Builder(GatewaytemplateExtraRoutes6Args defaults) {
            $ = new GatewaytemplateExtraRoutes6Args(Objects.requireNonNull(defaults));
        }

        public Builder via(Output<String> via) {
            $.via = via;
            return this;
        }

        public Builder via(String via) {
            return via(Output.of(via));
        }

        public GatewaytemplateExtraRoutes6Args build() {
            if ($.via == null) {
                throw new MissingRequiredPropertyException("GatewaytemplateExtraRoutes6Args", "via");
            }
            return $;
        }
    }

}
