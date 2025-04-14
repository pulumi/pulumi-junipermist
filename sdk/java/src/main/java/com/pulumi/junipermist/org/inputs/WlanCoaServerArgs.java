// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WlanCoaServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final WlanCoaServerArgs Empty = new WlanCoaServerArgs();

    /**
     * Whether to disable Event-Timestamp Check
     * 
     */
    @Import(name="disableEventTimestampCheck")
    private @Nullable Output<Boolean> disableEventTimestampCheck;

    /**
     * @return Whether to disable Event-Timestamp Check
     * 
     */
    public Optional<Output<Boolean>> disableEventTimestampCheck() {
        return Optional.ofNullable(this.disableEventTimestampCheck);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="ip", required=true)
    private Output<String> ip;

    public Output<String> ip() {
        return this.ip;
    }

    @Import(name="port")
    private @Nullable Output<String> port;

    public Optional<Output<String>> port() {
        return Optional.ofNullable(this.port);
    }

    @Import(name="secret", required=true)
    private Output<String> secret;

    public Output<String> secret() {
        return this.secret;
    }

    private WlanCoaServerArgs() {}

    private WlanCoaServerArgs(WlanCoaServerArgs $) {
        this.disableEventTimestampCheck = $.disableEventTimestampCheck;
        this.enabled = $.enabled;
        this.ip = $.ip;
        this.port = $.port;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WlanCoaServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WlanCoaServerArgs $;

        public Builder() {
            $ = new WlanCoaServerArgs();
        }

        public Builder(WlanCoaServerArgs defaults) {
            $ = new WlanCoaServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disableEventTimestampCheck Whether to disable Event-Timestamp Check
         * 
         * @return builder
         * 
         */
        public Builder disableEventTimestampCheck(@Nullable Output<Boolean> disableEventTimestampCheck) {
            $.disableEventTimestampCheck = disableEventTimestampCheck;
            return this;
        }

        /**
         * @param disableEventTimestampCheck Whether to disable Event-Timestamp Check
         * 
         * @return builder
         * 
         */
        public Builder disableEventTimestampCheck(Boolean disableEventTimestampCheck) {
            return disableEventTimestampCheck(Output.of(disableEventTimestampCheck));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder ip(Output<String> ip) {
            $.ip = ip;
            return this;
        }

        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        public Builder port(@Nullable Output<String> port) {
            $.port = port;
            return this;
        }

        public Builder port(String port) {
            return port(Output.of(port));
        }

        public Builder secret(Output<String> secret) {
            $.secret = secret;
            return this;
        }

        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public WlanCoaServerArgs build() {
            if ($.ip == null) {
                throw new MissingRequiredPropertyException("WlanCoaServerArgs", "ip");
            }
            if ($.secret == null) {
                throw new MissingRequiredPropertyException("WlanCoaServerArgs", "secret");
            }
            return $;
        }
    }

}
