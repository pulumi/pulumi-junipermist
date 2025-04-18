// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchRemoteSyslogFileArchiveArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchRemoteSyslogFileArchiveArgs Empty = new SwitchRemoteSyslogFileArchiveArgs();

    @Import(name="files")
    private @Nullable Output<String> files;

    public Optional<Output<String>> files() {
        return Optional.ofNullable(this.files);
    }

    @Import(name="size")
    private @Nullable Output<String> size;

    public Optional<Output<String>> size() {
        return Optional.ofNullable(this.size);
    }

    private SwitchRemoteSyslogFileArchiveArgs() {}

    private SwitchRemoteSyslogFileArchiveArgs(SwitchRemoteSyslogFileArchiveArgs $) {
        this.files = $.files;
        this.size = $.size;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchRemoteSyslogFileArchiveArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchRemoteSyslogFileArchiveArgs $;

        public Builder() {
            $ = new SwitchRemoteSyslogFileArchiveArgs();
        }

        public Builder(SwitchRemoteSyslogFileArchiveArgs defaults) {
            $ = new SwitchRemoteSyslogFileArchiveArgs(Objects.requireNonNull(defaults));
        }

        public Builder files(@Nullable Output<String> files) {
            $.files = files;
            return this;
        }

        public Builder files(String files) {
            return files(Output.of(files));
        }

        public Builder size(@Nullable Output<String> size) {
            $.size = size;
            return this;
        }

        public Builder size(String size) {
            return size(Output.of(size));
        }

        public SwitchRemoteSyslogFileArchiveArgs build() {
            return $;
        }
    }

}
