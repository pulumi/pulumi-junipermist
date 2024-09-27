// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingWirelessPmaArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingWirelessPmaArgs Empty = new SettingWirelessPmaArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private SettingWirelessPmaArgs() {}

    private SettingWirelessPmaArgs(SettingWirelessPmaArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingWirelessPmaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingWirelessPmaArgs $;

        public Builder() {
            $ = new SettingWirelessPmaArgs();
        }

        public Builder(SettingWirelessPmaArgs defaults) {
            $ = new SettingWirelessPmaArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public SettingWirelessPmaArgs build() {
            return $;
        }
    }

}