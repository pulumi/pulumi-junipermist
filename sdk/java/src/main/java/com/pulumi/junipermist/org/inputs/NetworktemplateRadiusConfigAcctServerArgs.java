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


public final class NetworktemplateRadiusConfigAcctServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplateRadiusConfigAcctServerArgs Empty = new NetworktemplateRadiusConfigAcctServerArgs();

    /**
     * IP/ hostname of RADIUS server
     * 
     */
    @Import(name="host", required=true)
    private Output<String> host;

    /**
     * @return IP/ hostname of RADIUS server
     * 
     */
    public Output<String> host() {
        return this.host;
    }

    @Import(name="keywrapEnabled")
    private @Nullable Output<Boolean> keywrapEnabled;

    public Optional<Output<Boolean>> keywrapEnabled() {
        return Optional.ofNullable(this.keywrapEnabled);
    }

    /**
     * enum: `ascii`, `hex`
     * 
     */
    @Import(name="keywrapFormat")
    private @Nullable Output<String> keywrapFormat;

    /**
     * @return enum: `ascii`, `hex`
     * 
     */
    public Optional<Output<String>> keywrapFormat() {
        return Optional.ofNullable(this.keywrapFormat);
    }

    @Import(name="keywrapKek")
    private @Nullable Output<String> keywrapKek;

    public Optional<Output<String>> keywrapKek() {
        return Optional.ofNullable(this.keywrapKek);
    }

    @Import(name="keywrapMack")
    private @Nullable Output<String> keywrapMack;

    public Optional<Output<String>> keywrapMack() {
        return Optional.ofNullable(this.keywrapMack);
    }

    @Import(name="port")
    private @Nullable Output<String> port;

    public Optional<Output<String>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Secret of RADIUS server
     * 
     */
    @Import(name="secret", required=true)
    private Output<String> secret;

    /**
     * @return Secret of RADIUS server
     * 
     */
    public Output<String> secret() {
        return this.secret;
    }

    private NetworktemplateRadiusConfigAcctServerArgs() {}

    private NetworktemplateRadiusConfigAcctServerArgs(NetworktemplateRadiusConfigAcctServerArgs $) {
        this.host = $.host;
        this.keywrapEnabled = $.keywrapEnabled;
        this.keywrapFormat = $.keywrapFormat;
        this.keywrapKek = $.keywrapKek;
        this.keywrapMack = $.keywrapMack;
        this.port = $.port;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworktemplateRadiusConfigAcctServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplateRadiusConfigAcctServerArgs $;

        public Builder() {
            $ = new NetworktemplateRadiusConfigAcctServerArgs();
        }

        public Builder(NetworktemplateRadiusConfigAcctServerArgs defaults) {
            $ = new NetworktemplateRadiusConfigAcctServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param host IP/ hostname of RADIUS server
         * 
         * @return builder
         * 
         */
        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host IP/ hostname of RADIUS server
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        public Builder keywrapEnabled(@Nullable Output<Boolean> keywrapEnabled) {
            $.keywrapEnabled = keywrapEnabled;
            return this;
        }

        public Builder keywrapEnabled(Boolean keywrapEnabled) {
            return keywrapEnabled(Output.of(keywrapEnabled));
        }

        /**
         * @param keywrapFormat enum: `ascii`, `hex`
         * 
         * @return builder
         * 
         */
        public Builder keywrapFormat(@Nullable Output<String> keywrapFormat) {
            $.keywrapFormat = keywrapFormat;
            return this;
        }

        /**
         * @param keywrapFormat enum: `ascii`, `hex`
         * 
         * @return builder
         * 
         */
        public Builder keywrapFormat(String keywrapFormat) {
            return keywrapFormat(Output.of(keywrapFormat));
        }

        public Builder keywrapKek(@Nullable Output<String> keywrapKek) {
            $.keywrapKek = keywrapKek;
            return this;
        }

        public Builder keywrapKek(String keywrapKek) {
            return keywrapKek(Output.of(keywrapKek));
        }

        public Builder keywrapMack(@Nullable Output<String> keywrapMack) {
            $.keywrapMack = keywrapMack;
            return this;
        }

        public Builder keywrapMack(String keywrapMack) {
            return keywrapMack(Output.of(keywrapMack));
        }

        public Builder port(@Nullable Output<String> port) {
            $.port = port;
            return this;
        }

        public Builder port(String port) {
            return port(Output.of(port));
        }

        /**
         * @param secret Secret of RADIUS server
         * 
         * @return builder
         * 
         */
        public Builder secret(Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret Secret of RADIUS server
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public NetworktemplateRadiusConfigAcctServerArgs build() {
            if ($.host == null) {
                throw new MissingRequiredPropertyException("NetworktemplateRadiusConfigAcctServerArgs", "host");
            }
            if ($.secret == null) {
                throw new MissingRequiredPropertyException("NetworktemplateRadiusConfigAcctServerArgs", "secret");
            }
            return $;
        }
    }

}
