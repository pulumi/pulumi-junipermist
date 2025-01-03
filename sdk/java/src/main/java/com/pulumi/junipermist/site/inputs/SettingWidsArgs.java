// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.site.inputs.SettingWidsRepeatedAuthFailuresArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingWidsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingWidsArgs Empty = new SettingWidsArgs();

    @Import(name="repeatedAuthFailures")
    private @Nullable Output<SettingWidsRepeatedAuthFailuresArgs> repeatedAuthFailures;

    public Optional<Output<SettingWidsRepeatedAuthFailuresArgs>> repeatedAuthFailures() {
        return Optional.ofNullable(this.repeatedAuthFailures);
    }

    private SettingWidsArgs() {}

    private SettingWidsArgs(SettingWidsArgs $) {
        this.repeatedAuthFailures = $.repeatedAuthFailures;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingWidsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingWidsArgs $;

        public Builder() {
            $ = new SettingWidsArgs();
        }

        public Builder(SettingWidsArgs defaults) {
            $ = new SettingWidsArgs(Objects.requireNonNull(defaults));
        }

        public Builder repeatedAuthFailures(@Nullable Output<SettingWidsRepeatedAuthFailuresArgs> repeatedAuthFailures) {
            $.repeatedAuthFailures = repeatedAuthFailures;
            return this;
        }

        public Builder repeatedAuthFailures(SettingWidsRepeatedAuthFailuresArgs repeatedAuthFailures) {
            return repeatedAuthFailures(Output.of(repeatedAuthFailures));
        }

        public SettingWidsArgs build() {
            return $;
        }
    }

}
