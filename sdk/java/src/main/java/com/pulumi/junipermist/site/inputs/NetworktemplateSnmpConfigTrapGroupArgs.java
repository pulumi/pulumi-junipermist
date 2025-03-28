// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworktemplateSnmpConfigTrapGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplateSnmpConfigTrapGroupArgs Empty = new NetworktemplateSnmpConfigTrapGroupArgs();

    @Import(name="categories")
    private @Nullable Output<List<String>> categories;

    public Optional<Output<List<String>>> categories() {
        return Optional.ofNullable(this.categories);
    }

    /**
     * Categories list can refer to https://www.juniper.net/documentation/software/topics/task/configuration/snmp_trap-groups-configuring-junos-nm.html
     * 
     */
    @Import(name="groupName")
    private @Nullable Output<String> groupName;

    /**
     * @return Categories list can refer to https://www.juniper.net/documentation/software/topics/task/configuration/snmp_trap-groups-configuring-junos-nm.html
     * 
     */
    public Optional<Output<String>> groupName() {
        return Optional.ofNullable(this.groupName);
    }

    @Import(name="targets")
    private @Nullable Output<List<String>> targets;

    public Optional<Output<List<String>>> targets() {
        return Optional.ofNullable(this.targets);
    }

    /**
     * enum: `all`, `v1`, `v2`
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return enum: `all`, `v1`, `v2`
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private NetworktemplateSnmpConfigTrapGroupArgs() {}

    private NetworktemplateSnmpConfigTrapGroupArgs(NetworktemplateSnmpConfigTrapGroupArgs $) {
        this.categories = $.categories;
        this.groupName = $.groupName;
        this.targets = $.targets;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworktemplateSnmpConfigTrapGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplateSnmpConfigTrapGroupArgs $;

        public Builder() {
            $ = new NetworktemplateSnmpConfigTrapGroupArgs();
        }

        public Builder(NetworktemplateSnmpConfigTrapGroupArgs defaults) {
            $ = new NetworktemplateSnmpConfigTrapGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder categories(@Nullable Output<List<String>> categories) {
            $.categories = categories;
            return this;
        }

        public Builder categories(List<String> categories) {
            return categories(Output.of(categories));
        }

        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }

        /**
         * @param groupName Categories list can refer to https://www.juniper.net/documentation/software/topics/task/configuration/snmp_trap-groups-configuring-junos-nm.html
         * 
         * @return builder
         * 
         */
        public Builder groupName(@Nullable Output<String> groupName) {
            $.groupName = groupName;
            return this;
        }

        /**
         * @param groupName Categories list can refer to https://www.juniper.net/documentation/software/topics/task/configuration/snmp_trap-groups-configuring-junos-nm.html
         * 
         * @return builder
         * 
         */
        public Builder groupName(String groupName) {
            return groupName(Output.of(groupName));
        }

        public Builder targets(@Nullable Output<List<String>> targets) {
            $.targets = targets;
            return this;
        }

        public Builder targets(List<String> targets) {
            return targets(Output.of(targets));
        }

        public Builder targets(String... targets) {
            return targets(List.of(targets));
        }

        /**
         * @param version enum: `all`, `v1`, `v2`
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version enum: `all`, `v1`, `v2`
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public NetworktemplateSnmpConfigTrapGroupArgs build() {
            return $;
        }
    }

}
