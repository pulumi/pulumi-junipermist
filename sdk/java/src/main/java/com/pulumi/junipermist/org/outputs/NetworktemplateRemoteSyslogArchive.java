// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworktemplateRemoteSyslogArchive {
    private @Nullable String files;
    private @Nullable String size;

    private NetworktemplateRemoteSyslogArchive() {}
    public Optional<String> files() {
        return Optional.ofNullable(this.files);
    }
    public Optional<String> size() {
        return Optional.ofNullable(this.size);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplateRemoteSyslogArchive defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String files;
        private @Nullable String size;
        public Builder() {}
        public Builder(NetworktemplateRemoteSyslogArchive defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.files = defaults.files;
    	      this.size = defaults.size;
        }

        @CustomType.Setter
        public Builder files(@Nullable String files) {

            this.files = files;
            return this;
        }
        @CustomType.Setter
        public Builder size(@Nullable String size) {

            this.size = size;
            return this;
        }
        public NetworktemplateRemoteSyslogArchive build() {
            final var _resultValue = new NetworktemplateRemoteSyslogArchive();
            _resultValue.files = files;
            _resultValue.size = size;
            return _resultValue;
        }
    }
}
