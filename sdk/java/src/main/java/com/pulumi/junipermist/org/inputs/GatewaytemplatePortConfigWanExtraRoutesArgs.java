// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewaytemplatePortConfigWanExtraRoutesArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewaytemplatePortConfigWanExtraRoutesArgs Empty = new GatewaytemplatePortConfigWanExtraRoutesArgs();

    @Import(name="via")
    private @Nullable Output<String> via;

    public Optional<Output<String>> via() {
        return Optional.ofNullable(this.via);
    }

    private GatewaytemplatePortConfigWanExtraRoutesArgs() {}

    private GatewaytemplatePortConfigWanExtraRoutesArgs(GatewaytemplatePortConfigWanExtraRoutesArgs $) {
        this.via = $.via;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewaytemplatePortConfigWanExtraRoutesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewaytemplatePortConfigWanExtraRoutesArgs $;

        public Builder() {
            $ = new GatewaytemplatePortConfigWanExtraRoutesArgs();
        }

        public Builder(GatewaytemplatePortConfigWanExtraRoutesArgs defaults) {
            $ = new GatewaytemplatePortConfigWanExtraRoutesArgs(Objects.requireNonNull(defaults));
        }

        public Builder via(@Nullable Output<String> via) {
            $.via = via;
            return this;
        }

        public Builder via(String via) {
            return via(Output.of(via));
        }

        public GatewaytemplatePortConfigWanExtraRoutesArgs build() {
            return $;
        }
    }

}
