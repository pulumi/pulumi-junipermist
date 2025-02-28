// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.device.inputs.SwitchRemoteSyslogArchiveArgs;
import com.pulumi.junipermist.device.inputs.SwitchRemoteSyslogConsoleArgs;
import com.pulumi.junipermist.device.inputs.SwitchRemoteSyslogFileArgs;
import com.pulumi.junipermist.device.inputs.SwitchRemoteSyslogServerArgs;
import com.pulumi.junipermist.device.inputs.SwitchRemoteSyslogUserArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchRemoteSyslogArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchRemoteSyslogArgs Empty = new SwitchRemoteSyslogArgs();

    @Import(name="archive")
    private @Nullable Output<SwitchRemoteSyslogArchiveArgs> archive;

    public Optional<Output<SwitchRemoteSyslogArchiveArgs>> archive() {
        return Optional.ofNullable(this.archive);
    }

    @Import(name="console")
    private @Nullable Output<SwitchRemoteSyslogConsoleArgs> console;

    public Optional<Output<SwitchRemoteSyslogConsoleArgs>> console() {
        return Optional.ofNullable(this.console);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="files")
    private @Nullable Output<List<SwitchRemoteSyslogFileArgs>> files;

    public Optional<Output<List<SwitchRemoteSyslogFileArgs>>> files() {
        return Optional.ofNullable(this.files);
    }

    /**
     * If source_address is configured, will use the vlan firstly otherwise use source_ip
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return If source_address is configured, will use the vlan firstly otherwise use source_ip
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    @Import(name="sendToAllServers")
    private @Nullable Output<Boolean> sendToAllServers;

    public Optional<Output<Boolean>> sendToAllServers() {
        return Optional.ofNullable(this.sendToAllServers);
    }

    @Import(name="servers")
    private @Nullable Output<List<SwitchRemoteSyslogServerArgs>> servers;

    public Optional<Output<List<SwitchRemoteSyslogServerArgs>>> servers() {
        return Optional.ofNullable(this.servers);
    }

    /**
     * enum: `millisecond`, `year`, `year millisecond`
     * 
     */
    @Import(name="timeFormat")
    private @Nullable Output<String> timeFormat;

    /**
     * @return enum: `millisecond`, `year`, `year millisecond`
     * 
     */
    public Optional<Output<String>> timeFormat() {
        return Optional.ofNullable(this.timeFormat);
    }

    @Import(name="users")
    private @Nullable Output<List<SwitchRemoteSyslogUserArgs>> users;

    public Optional<Output<List<SwitchRemoteSyslogUserArgs>>> users() {
        return Optional.ofNullable(this.users);
    }

    private SwitchRemoteSyslogArgs() {}

    private SwitchRemoteSyslogArgs(SwitchRemoteSyslogArgs $) {
        this.archive = $.archive;
        this.console = $.console;
        this.enabled = $.enabled;
        this.files = $.files;
        this.network = $.network;
        this.sendToAllServers = $.sendToAllServers;
        this.servers = $.servers;
        this.timeFormat = $.timeFormat;
        this.users = $.users;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchRemoteSyslogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchRemoteSyslogArgs $;

        public Builder() {
            $ = new SwitchRemoteSyslogArgs();
        }

        public Builder(SwitchRemoteSyslogArgs defaults) {
            $ = new SwitchRemoteSyslogArgs(Objects.requireNonNull(defaults));
        }

        public Builder archive(@Nullable Output<SwitchRemoteSyslogArchiveArgs> archive) {
            $.archive = archive;
            return this;
        }

        public Builder archive(SwitchRemoteSyslogArchiveArgs archive) {
            return archive(Output.of(archive));
        }

        public Builder console(@Nullable Output<SwitchRemoteSyslogConsoleArgs> console) {
            $.console = console;
            return this;
        }

        public Builder console(SwitchRemoteSyslogConsoleArgs console) {
            return console(Output.of(console));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder files(@Nullable Output<List<SwitchRemoteSyslogFileArgs>> files) {
            $.files = files;
            return this;
        }

        public Builder files(List<SwitchRemoteSyslogFileArgs> files) {
            return files(Output.of(files));
        }

        public Builder files(SwitchRemoteSyslogFileArgs... files) {
            return files(List.of(files));
        }

        /**
         * @param network If source_address is configured, will use the vlan firstly otherwise use source_ip
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network If source_address is configured, will use the vlan firstly otherwise use source_ip
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        public Builder sendToAllServers(@Nullable Output<Boolean> sendToAllServers) {
            $.sendToAllServers = sendToAllServers;
            return this;
        }

        public Builder sendToAllServers(Boolean sendToAllServers) {
            return sendToAllServers(Output.of(sendToAllServers));
        }

        public Builder servers(@Nullable Output<List<SwitchRemoteSyslogServerArgs>> servers) {
            $.servers = servers;
            return this;
        }

        public Builder servers(List<SwitchRemoteSyslogServerArgs> servers) {
            return servers(Output.of(servers));
        }

        public Builder servers(SwitchRemoteSyslogServerArgs... servers) {
            return servers(List.of(servers));
        }

        /**
         * @param timeFormat enum: `millisecond`, `year`, `year millisecond`
         * 
         * @return builder
         * 
         */
        public Builder timeFormat(@Nullable Output<String> timeFormat) {
            $.timeFormat = timeFormat;
            return this;
        }

        /**
         * @param timeFormat enum: `millisecond`, `year`, `year millisecond`
         * 
         * @return builder
         * 
         */
        public Builder timeFormat(String timeFormat) {
            return timeFormat(Output.of(timeFormat));
        }

        public Builder users(@Nullable Output<List<SwitchRemoteSyslogUserArgs>> users) {
            $.users = users;
            return this;
        }

        public Builder users(List<SwitchRemoteSyslogUserArgs> users) {
            return users(Output.of(users));
        }

        public Builder users(SwitchRemoteSyslogUserArgs... users) {
            return users(List.of(users));
        }

        public SwitchRemoteSyslogArgs build() {
            return $;
        }
    }

}
