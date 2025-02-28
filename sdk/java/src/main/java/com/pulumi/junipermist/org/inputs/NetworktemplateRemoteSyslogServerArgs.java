// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.NetworktemplateRemoteSyslogServerContentArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworktemplateRemoteSyslogServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplateRemoteSyslogServerArgs Empty = new NetworktemplateRemoteSyslogServerArgs();

    @Import(name="contents")
    private @Nullable Output<List<NetworktemplateRemoteSyslogServerContentArgs>> contents;

    public Optional<Output<List<NetworktemplateRemoteSyslogServerContentArgs>>> contents() {
        return Optional.ofNullable(this.contents);
    }

    @Import(name="explicitPriority")
    private @Nullable Output<Boolean> explicitPriority;

    public Optional<Output<Boolean>> explicitPriority() {
        return Optional.ofNullable(this.explicitPriority);
    }

    /**
     * enum: `any`, `authorization`, `change-log`, `config`, `conflict-log`, `daemon`, `dfc`, `external`, `firewall`, `ftp`, `interactive-commands`, `kernel`, `ntp`, `pfe`, `security`, `user`
     * 
     */
    @Import(name="facility")
    private @Nullable Output<String> facility;

    /**
     * @return enum: `any`, `authorization`, `change-log`, `config`, `conflict-log`, `daemon`, `dfc`, `external`, `firewall`, `ftp`, `interactive-commands`, `kernel`, `ntp`, `pfe`, `security`, `user`
     * 
     */
    public Optional<Output<String>> facility() {
        return Optional.ofNullable(this.facility);
    }

    @Import(name="host")
    private @Nullable Output<String> host;

    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    @Import(name="match")
    private @Nullable Output<String> match;

    public Optional<Output<String>> match() {
        return Optional.ofNullable(this.match);
    }

    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * enum: `tcp`, `udp`
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return enum: `tcp`, `udp`
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    @Import(name="routingInstance")
    private @Nullable Output<String> routingInstance;

    public Optional<Output<String>> routingInstance() {
        return Optional.ofNullable(this.routingInstance);
    }

    /**
     * enum: `alert`, `any`, `critical`, `emergency`, `error`, `info`, `notice`, `warning`
     * 
     */
    @Import(name="severity")
    private @Nullable Output<String> severity;

    /**
     * @return enum: `alert`, `any`, `critical`, `emergency`, `error`, `info`, `notice`, `warning`
     * 
     */
    public Optional<Output<String>> severity() {
        return Optional.ofNullable(this.severity);
    }

    /**
     * If source_address is configured, will use the vlan firstly otherwise use source_ip
     * 
     */
    @Import(name="sourceAddress")
    private @Nullable Output<String> sourceAddress;

    /**
     * @return If source_address is configured, will use the vlan firstly otherwise use source_ip
     * 
     */
    public Optional<Output<String>> sourceAddress() {
        return Optional.ofNullable(this.sourceAddress);
    }

    @Import(name="structuredData")
    private @Nullable Output<Boolean> structuredData;

    public Optional<Output<Boolean>> structuredData() {
        return Optional.ofNullable(this.structuredData);
    }

    @Import(name="tag")
    private @Nullable Output<String> tag;

    public Optional<Output<String>> tag() {
        return Optional.ofNullable(this.tag);
    }

    private NetworktemplateRemoteSyslogServerArgs() {}

    private NetworktemplateRemoteSyslogServerArgs(NetworktemplateRemoteSyslogServerArgs $) {
        this.contents = $.contents;
        this.explicitPriority = $.explicitPriority;
        this.facility = $.facility;
        this.host = $.host;
        this.match = $.match;
        this.port = $.port;
        this.protocol = $.protocol;
        this.routingInstance = $.routingInstance;
        this.severity = $.severity;
        this.sourceAddress = $.sourceAddress;
        this.structuredData = $.structuredData;
        this.tag = $.tag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworktemplateRemoteSyslogServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplateRemoteSyslogServerArgs $;

        public Builder() {
            $ = new NetworktemplateRemoteSyslogServerArgs();
        }

        public Builder(NetworktemplateRemoteSyslogServerArgs defaults) {
            $ = new NetworktemplateRemoteSyslogServerArgs(Objects.requireNonNull(defaults));
        }

        public Builder contents(@Nullable Output<List<NetworktemplateRemoteSyslogServerContentArgs>> contents) {
            $.contents = contents;
            return this;
        }

        public Builder contents(List<NetworktemplateRemoteSyslogServerContentArgs> contents) {
            return contents(Output.of(contents));
        }

        public Builder contents(NetworktemplateRemoteSyslogServerContentArgs... contents) {
            return contents(List.of(contents));
        }

        public Builder explicitPriority(@Nullable Output<Boolean> explicitPriority) {
            $.explicitPriority = explicitPriority;
            return this;
        }

        public Builder explicitPriority(Boolean explicitPriority) {
            return explicitPriority(Output.of(explicitPriority));
        }

        /**
         * @param facility enum: `any`, `authorization`, `change-log`, `config`, `conflict-log`, `daemon`, `dfc`, `external`, `firewall`, `ftp`, `interactive-commands`, `kernel`, `ntp`, `pfe`, `security`, `user`
         * 
         * @return builder
         * 
         */
        public Builder facility(@Nullable Output<String> facility) {
            $.facility = facility;
            return this;
        }

        /**
         * @param facility enum: `any`, `authorization`, `change-log`, `config`, `conflict-log`, `daemon`, `dfc`, `external`, `firewall`, `ftp`, `interactive-commands`, `kernel`, `ntp`, `pfe`, `security`, `user`
         * 
         * @return builder
         * 
         */
        public Builder facility(String facility) {
            return facility(Output.of(facility));
        }

        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        public Builder host(String host) {
            return host(Output.of(host));
        }

        public Builder match(@Nullable Output<String> match) {
            $.match = match;
            return this;
        }

        public Builder match(String match) {
            return match(Output.of(match));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param protocol enum: `tcp`, `udp`
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol enum: `tcp`, `udp`
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public Builder routingInstance(@Nullable Output<String> routingInstance) {
            $.routingInstance = routingInstance;
            return this;
        }

        public Builder routingInstance(String routingInstance) {
            return routingInstance(Output.of(routingInstance));
        }

        /**
         * @param severity enum: `alert`, `any`, `critical`, `emergency`, `error`, `info`, `notice`, `warning`
         * 
         * @return builder
         * 
         */
        public Builder severity(@Nullable Output<String> severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param severity enum: `alert`, `any`, `critical`, `emergency`, `error`, `info`, `notice`, `warning`
         * 
         * @return builder
         * 
         */
        public Builder severity(String severity) {
            return severity(Output.of(severity));
        }

        /**
         * @param sourceAddress If source_address is configured, will use the vlan firstly otherwise use source_ip
         * 
         * @return builder
         * 
         */
        public Builder sourceAddress(@Nullable Output<String> sourceAddress) {
            $.sourceAddress = sourceAddress;
            return this;
        }

        /**
         * @param sourceAddress If source_address is configured, will use the vlan firstly otherwise use source_ip
         * 
         * @return builder
         * 
         */
        public Builder sourceAddress(String sourceAddress) {
            return sourceAddress(Output.of(sourceAddress));
        }

        public Builder structuredData(@Nullable Output<Boolean> structuredData) {
            $.structuredData = structuredData;
            return this;
        }

        public Builder structuredData(Boolean structuredData) {
            return structuredData(Output.of(structuredData));
        }

        public Builder tag(@Nullable Output<String> tag) {
            $.tag = tag;
            return this;
        }

        public Builder tag(String tag) {
            return tag(Output.of(tag));
        }

        public NetworktemplateRemoteSyslogServerArgs build() {
            return $;
        }
    }

}
