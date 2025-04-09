// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AvprofileArgs extends com.pulumi.resources.ResourceArgs {

    public static final AvprofileArgs Empty = new AvprofileArgs();

    /**
     * enum: `block`, `log-and-permit`, `permit`
     * 
     */
    @Import(name="fallbackAction")
    private @Nullable Output<String> fallbackAction;

    /**
     * @return enum: `block`, `log-and-permit`, `permit`
     * 
     */
    public Optional<Output<String>> fallbackAction() {
        return Optional.ofNullable(this.fallbackAction);
    }

    /**
     * In KB
     * 
     */
    @Import(name="maxFilesize")
    private @Nullable Output<Integer> maxFilesize;

    /**
     * @return In KB
     * 
     */
    public Optional<Output<Integer>> maxFilesize() {
        return Optional.ofNullable(this.maxFilesize);
    }

    @Import(name="mimeWhitelists")
    private @Nullable Output<List<String>> mimeWhitelists;

    public Optional<Output<List<String>>> mimeWhitelists() {
        return Optional.ofNullable(this.mimeWhitelists);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="orgId", required=true)
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    /**
     * List of protocols to monitor. enum: `ftp`, `http`, `imap`, `pop3`, `smtp`
     * 
     */
    @Import(name="protocols", required=true)
    private Output<List<String>> protocols;

    /**
     * @return List of protocols to monitor. enum: `ftp`, `http`, `imap`, `pop3`, `smtp`
     * 
     */
    public Output<List<String>> protocols() {
        return this.protocols;
    }

    @Import(name="urlWhitelists")
    private @Nullable Output<List<String>> urlWhitelists;

    public Optional<Output<List<String>>> urlWhitelists() {
        return Optional.ofNullable(this.urlWhitelists);
    }

    private AvprofileArgs() {}

    private AvprofileArgs(AvprofileArgs $) {
        this.fallbackAction = $.fallbackAction;
        this.maxFilesize = $.maxFilesize;
        this.mimeWhitelists = $.mimeWhitelists;
        this.name = $.name;
        this.orgId = $.orgId;
        this.protocols = $.protocols;
        this.urlWhitelists = $.urlWhitelists;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AvprofileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AvprofileArgs $;

        public Builder() {
            $ = new AvprofileArgs();
        }

        public Builder(AvprofileArgs defaults) {
            $ = new AvprofileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fallbackAction enum: `block`, `log-and-permit`, `permit`
         * 
         * @return builder
         * 
         */
        public Builder fallbackAction(@Nullable Output<String> fallbackAction) {
            $.fallbackAction = fallbackAction;
            return this;
        }

        /**
         * @param fallbackAction enum: `block`, `log-and-permit`, `permit`
         * 
         * @return builder
         * 
         */
        public Builder fallbackAction(String fallbackAction) {
            return fallbackAction(Output.of(fallbackAction));
        }

        /**
         * @param maxFilesize In KB
         * 
         * @return builder
         * 
         */
        public Builder maxFilesize(@Nullable Output<Integer> maxFilesize) {
            $.maxFilesize = maxFilesize;
            return this;
        }

        /**
         * @param maxFilesize In KB
         * 
         * @return builder
         * 
         */
        public Builder maxFilesize(Integer maxFilesize) {
            return maxFilesize(Output.of(maxFilesize));
        }

        public Builder mimeWhitelists(@Nullable Output<List<String>> mimeWhitelists) {
            $.mimeWhitelists = mimeWhitelists;
            return this;
        }

        public Builder mimeWhitelists(List<String> mimeWhitelists) {
            return mimeWhitelists(Output.of(mimeWhitelists));
        }

        public Builder mimeWhitelists(String... mimeWhitelists) {
            return mimeWhitelists(List.of(mimeWhitelists));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param protocols List of protocols to monitor. enum: `ftp`, `http`, `imap`, `pop3`, `smtp`
         * 
         * @return builder
         * 
         */
        public Builder protocols(Output<List<String>> protocols) {
            $.protocols = protocols;
            return this;
        }

        /**
         * @param protocols List of protocols to monitor. enum: `ftp`, `http`, `imap`, `pop3`, `smtp`
         * 
         * @return builder
         * 
         */
        public Builder protocols(List<String> protocols) {
            return protocols(Output.of(protocols));
        }

        /**
         * @param protocols List of protocols to monitor. enum: `ftp`, `http`, `imap`, `pop3`, `smtp`
         * 
         * @return builder
         * 
         */
        public Builder protocols(String... protocols) {
            return protocols(List.of(protocols));
        }

        public Builder urlWhitelists(@Nullable Output<List<String>> urlWhitelists) {
            $.urlWhitelists = urlWhitelists;
            return this;
        }

        public Builder urlWhitelists(List<String> urlWhitelists) {
            return urlWhitelists(Output.of(urlWhitelists));
        }

        public Builder urlWhitelists(String... urlWhitelists) {
            return urlWhitelists(List.of(urlWhitelists));
        }

        public AvprofileArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("AvprofileArgs", "orgId");
            }
            if ($.protocols == null) {
                throw new MissingRequiredPropertyException("AvprofileArgs", "protocols");
            }
            return $;
        }
    }

}
