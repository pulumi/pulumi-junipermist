// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.SettingSwitchAutoUpgradeArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingSwitchArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingSwitchArgs Empty = new SettingSwitchArgs();

    @Import(name="autoUpgrade")
    private @Nullable Output<SettingSwitchAutoUpgradeArgs> autoUpgrade;

    public Optional<Output<SettingSwitchAutoUpgradeArgs>> autoUpgrade() {
        return Optional.ofNullable(this.autoUpgrade);
    }

    private SettingSwitchArgs() {}

    private SettingSwitchArgs(SettingSwitchArgs $) {
        this.autoUpgrade = $.autoUpgrade;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingSwitchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingSwitchArgs $;

        public Builder() {
            $ = new SettingSwitchArgs();
        }

        public Builder(SettingSwitchArgs defaults) {
            $ = new SettingSwitchArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoUpgrade(@Nullable Output<SettingSwitchAutoUpgradeArgs> autoUpgrade) {
            $.autoUpgrade = autoUpgrade;
            return this;
        }

        public Builder autoUpgrade(SettingSwitchAutoUpgradeArgs autoUpgrade) {
            return autoUpgrade(Output.of(autoUpgrade));
        }

        public SettingSwitchArgs build() {
            return $;
        }
    }

}
