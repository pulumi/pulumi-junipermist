// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.device.inputs.GatewayIdpProfilesOverwriteMatchingArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayIdpProfilesOverwriteArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayIdpProfilesOverwriteArgs Empty = new GatewayIdpProfilesOverwriteArgs();

    /**
     * enum:
     *   * alert (default)
     *   * drop: silently dropping packets
     *   * close: notify client/server to close connection
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return enum:
     *   * alert (default)
     *   * drop: silently dropping packets
     *   * close: notify client/server to close connection
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    @Import(name="matching")
    private @Nullable Output<GatewayIdpProfilesOverwriteMatchingArgs> matching;

    public Optional<Output<GatewayIdpProfilesOverwriteMatchingArgs>> matching() {
        return Optional.ofNullable(this.matching);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GatewayIdpProfilesOverwriteArgs() {}

    private GatewayIdpProfilesOverwriteArgs(GatewayIdpProfilesOverwriteArgs $) {
        this.action = $.action;
        this.matching = $.matching;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayIdpProfilesOverwriteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayIdpProfilesOverwriteArgs $;

        public Builder() {
            $ = new GatewayIdpProfilesOverwriteArgs();
        }

        public Builder(GatewayIdpProfilesOverwriteArgs defaults) {
            $ = new GatewayIdpProfilesOverwriteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action enum:
         *   * alert (default)
         *   * drop: silently dropping packets
         *   * close: notify client/server to close connection
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action enum:
         *   * alert (default)
         *   * drop: silently dropping packets
         *   * close: notify client/server to close connection
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        public Builder matching(@Nullable Output<GatewayIdpProfilesOverwriteMatchingArgs> matching) {
            $.matching = matching;
            return this;
        }

        public Builder matching(GatewayIdpProfilesOverwriteMatchingArgs matching) {
            return matching(Output.of(matching));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GatewayIdpProfilesOverwriteArgs build() {
            return $;
        }
    }

}
