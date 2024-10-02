// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApCentrakArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApCentrakArgs Empty = new ApCentrakArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ApCentrakArgs() {}

    private ApCentrakArgs(ApCentrakArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApCentrakArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApCentrakArgs $;

        public Builder() {
            $ = new ApCentrakArgs();
        }

        public Builder(ApCentrakArgs defaults) {
            $ = new ApCentrakArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ApCentrakArgs build() {
            return $;
        }
    }

}