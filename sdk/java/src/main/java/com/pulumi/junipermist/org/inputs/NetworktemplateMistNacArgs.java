// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworktemplateMistNacArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplateMistNacArgs Empty = new NetworktemplateMistNacArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="network")
    private @Nullable Output<String> network;

    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    private NetworktemplateMistNacArgs() {}

    private NetworktemplateMistNacArgs(NetworktemplateMistNacArgs $) {
        this.enabled = $.enabled;
        this.network = $.network;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworktemplateMistNacArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplateMistNacArgs $;

        public Builder() {
            $ = new NetworktemplateMistNacArgs();
        }

        public Builder(NetworktemplateMistNacArgs defaults) {
            $ = new NetworktemplateMistNacArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        public Builder network(String network) {
            return network(Output.of(network));
        }

        public NetworktemplateMistNacArgs build() {
            return $;
        }
    }

}
