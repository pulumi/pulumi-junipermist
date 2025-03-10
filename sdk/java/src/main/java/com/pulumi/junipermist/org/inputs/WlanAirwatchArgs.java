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


public final class WlanAirwatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final WlanAirwatchArgs Empty = new WlanAirwatchArgs();

    /**
     * API Key
     * 
     */
    @Import(name="apiKey")
    private @Nullable Output<String> apiKey;

    /**
     * @return API Key
     * 
     */
    public Optional<Output<String>> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }

    /**
     * Console URL
     * 
     */
    @Import(name="consoleUrl")
    private @Nullable Output<String> consoleUrl;

    /**
     * @return Console URL
     * 
     */
    public Optional<Output<String>> consoleUrl() {
        return Optional.ofNullable(this.consoleUrl);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Password
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Password
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Username
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Username
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private WlanAirwatchArgs() {}

    private WlanAirwatchArgs(WlanAirwatchArgs $) {
        this.apiKey = $.apiKey;
        this.consoleUrl = $.consoleUrl;
        this.enabled = $.enabled;
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WlanAirwatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WlanAirwatchArgs $;

        public Builder() {
            $ = new WlanAirwatchArgs();
        }

        public Builder(WlanAirwatchArgs defaults) {
            $ = new WlanAirwatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiKey API Key
         * 
         * @return builder
         * 
         */
        public Builder apiKey(@Nullable Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        /**
         * @param apiKey API Key
         * 
         * @return builder
         * 
         */
        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        /**
         * @param consoleUrl Console URL
         * 
         * @return builder
         * 
         */
        public Builder consoleUrl(@Nullable Output<String> consoleUrl) {
            $.consoleUrl = consoleUrl;
            return this;
        }

        /**
         * @param consoleUrl Console URL
         * 
         * @return builder
         * 
         */
        public Builder consoleUrl(String consoleUrl) {
            return consoleUrl(Output.of(consoleUrl));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param password Password
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username Username
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public WlanAirwatchArgs build() {
            return $;
        }
    }

}
