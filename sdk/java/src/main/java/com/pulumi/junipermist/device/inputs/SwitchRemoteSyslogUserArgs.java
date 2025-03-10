// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.device.inputs.SwitchRemoteSyslogUserContentArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchRemoteSyslogUserArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchRemoteSyslogUserArgs Empty = new SwitchRemoteSyslogUserArgs();

    @Import(name="contents")
    private @Nullable Output<List<SwitchRemoteSyslogUserContentArgs>> contents;

    public Optional<Output<List<SwitchRemoteSyslogUserContentArgs>>> contents() {
        return Optional.ofNullable(this.contents);
    }

    @Import(name="match")
    private @Nullable Output<String> match;

    public Optional<Output<String>> match() {
        return Optional.ofNullable(this.match);
    }

    @Import(name="user")
    private @Nullable Output<String> user;

    public Optional<Output<String>> user() {
        return Optional.ofNullable(this.user);
    }

    private SwitchRemoteSyslogUserArgs() {}

    private SwitchRemoteSyslogUserArgs(SwitchRemoteSyslogUserArgs $) {
        this.contents = $.contents;
        this.match = $.match;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchRemoteSyslogUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchRemoteSyslogUserArgs $;

        public Builder() {
            $ = new SwitchRemoteSyslogUserArgs();
        }

        public Builder(SwitchRemoteSyslogUserArgs defaults) {
            $ = new SwitchRemoteSyslogUserArgs(Objects.requireNonNull(defaults));
        }

        public Builder contents(@Nullable Output<List<SwitchRemoteSyslogUserContentArgs>> contents) {
            $.contents = contents;
            return this;
        }

        public Builder contents(List<SwitchRemoteSyslogUserContentArgs> contents) {
            return contents(Output.of(contents));
        }

        public Builder contents(SwitchRemoteSyslogUserContentArgs... contents) {
            return contents(List.of(contents));
        }

        public Builder match(@Nullable Output<String> match) {
            $.match = match;
            return this;
        }

        public Builder match(String match) {
            return match(Output.of(match));
        }

        public Builder user(@Nullable Output<String> user) {
            $.user = user;
            return this;
        }

        public Builder user(String user) {
            return user(Output.of(user));
        }

        public SwitchRemoteSyslogUserArgs build() {
            return $;
        }
    }

}
