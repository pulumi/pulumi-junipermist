// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.site.inputs.NetworktemplateSnmpConfigClientListArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateSnmpConfigTrapGroupArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateSnmpConfigV2cConfigArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateSnmpConfigV3ConfigArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateSnmpConfigViewArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworktemplateSnmpConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplateSnmpConfigArgs Empty = new NetworktemplateSnmpConfigArgs();

    @Import(name="clientLists")
    private @Nullable Output<List<NetworktemplateSnmpConfigClientListArgs>> clientLists;

    public Optional<Output<List<NetworktemplateSnmpConfigClientListArgs>>> clientLists() {
        return Optional.ofNullable(this.clientLists);
    }

    @Import(name="contact")
    private @Nullable Output<String> contact;

    public Optional<Output<String>> contact() {
        return Optional.ofNullable(this.contact);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="engineId")
    private @Nullable Output<String> engineId;

    public Optional<Output<String>> engineId() {
        return Optional.ofNullable(this.engineId);
    }

    /**
     * enum: `local`, `use_mac_address`
     * 
     */
    @Import(name="engineIdType")
    private @Nullable Output<String> engineIdType;

    /**
     * @return enum: `local`, `use_mac_address`
     * 
     */
    public Optional<Output<String>> engineIdType() {
        return Optional.ofNullable(this.engineIdType);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="network")
    private @Nullable Output<String> network;

    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    @Import(name="trapGroups")
    private @Nullable Output<List<NetworktemplateSnmpConfigTrapGroupArgs>> trapGroups;

    public Optional<Output<List<NetworktemplateSnmpConfigTrapGroupArgs>>> trapGroups() {
        return Optional.ofNullable(this.trapGroups);
    }

    @Import(name="v2cConfigs")
    private @Nullable Output<List<NetworktemplateSnmpConfigV2cConfigArgs>> v2cConfigs;

    public Optional<Output<List<NetworktemplateSnmpConfigV2cConfigArgs>>> v2cConfigs() {
        return Optional.ofNullable(this.v2cConfigs);
    }

    @Import(name="v3Config")
    private @Nullable Output<NetworktemplateSnmpConfigV3ConfigArgs> v3Config;

    public Optional<Output<NetworktemplateSnmpConfigV3ConfigArgs>> v3Config() {
        return Optional.ofNullable(this.v3Config);
    }

    @Import(name="views")
    private @Nullable Output<List<NetworktemplateSnmpConfigViewArgs>> views;

    public Optional<Output<List<NetworktemplateSnmpConfigViewArgs>>> views() {
        return Optional.ofNullable(this.views);
    }

    private NetworktemplateSnmpConfigArgs() {}

    private NetworktemplateSnmpConfigArgs(NetworktemplateSnmpConfigArgs $) {
        this.clientLists = $.clientLists;
        this.contact = $.contact;
        this.description = $.description;
        this.enabled = $.enabled;
        this.engineId = $.engineId;
        this.engineIdType = $.engineIdType;
        this.location = $.location;
        this.name = $.name;
        this.network = $.network;
        this.trapGroups = $.trapGroups;
        this.v2cConfigs = $.v2cConfigs;
        this.v3Config = $.v3Config;
        this.views = $.views;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworktemplateSnmpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplateSnmpConfigArgs $;

        public Builder() {
            $ = new NetworktemplateSnmpConfigArgs();
        }

        public Builder(NetworktemplateSnmpConfigArgs defaults) {
            $ = new NetworktemplateSnmpConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientLists(@Nullable Output<List<NetworktemplateSnmpConfigClientListArgs>> clientLists) {
            $.clientLists = clientLists;
            return this;
        }

        public Builder clientLists(List<NetworktemplateSnmpConfigClientListArgs> clientLists) {
            return clientLists(Output.of(clientLists));
        }

        public Builder clientLists(NetworktemplateSnmpConfigClientListArgs... clientLists) {
            return clientLists(List.of(clientLists));
        }

        public Builder contact(@Nullable Output<String> contact) {
            $.contact = contact;
            return this;
        }

        public Builder contact(String contact) {
            return contact(Output.of(contact));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder engineId(@Nullable Output<String> engineId) {
            $.engineId = engineId;
            return this;
        }

        public Builder engineId(String engineId) {
            return engineId(Output.of(engineId));
        }

        /**
         * @param engineIdType enum: `local`, `use_mac_address`
         * 
         * @return builder
         * 
         */
        public Builder engineIdType(@Nullable Output<String> engineIdType) {
            $.engineIdType = engineIdType;
            return this;
        }

        /**
         * @param engineIdType enum: `local`, `use_mac_address`
         * 
         * @return builder
         * 
         */
        public Builder engineIdType(String engineIdType) {
            return engineIdType(Output.of(engineIdType));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        public Builder network(String network) {
            return network(Output.of(network));
        }

        public Builder trapGroups(@Nullable Output<List<NetworktemplateSnmpConfigTrapGroupArgs>> trapGroups) {
            $.trapGroups = trapGroups;
            return this;
        }

        public Builder trapGroups(List<NetworktemplateSnmpConfigTrapGroupArgs> trapGroups) {
            return trapGroups(Output.of(trapGroups));
        }

        public Builder trapGroups(NetworktemplateSnmpConfigTrapGroupArgs... trapGroups) {
            return trapGroups(List.of(trapGroups));
        }

        public Builder v2cConfigs(@Nullable Output<List<NetworktemplateSnmpConfigV2cConfigArgs>> v2cConfigs) {
            $.v2cConfigs = v2cConfigs;
            return this;
        }

        public Builder v2cConfigs(List<NetworktemplateSnmpConfigV2cConfigArgs> v2cConfigs) {
            return v2cConfigs(Output.of(v2cConfigs));
        }

        public Builder v2cConfigs(NetworktemplateSnmpConfigV2cConfigArgs... v2cConfigs) {
            return v2cConfigs(List.of(v2cConfigs));
        }

        public Builder v3Config(@Nullable Output<NetworktemplateSnmpConfigV3ConfigArgs> v3Config) {
            $.v3Config = v3Config;
            return this;
        }

        public Builder v3Config(NetworktemplateSnmpConfigV3ConfigArgs v3Config) {
            return v3Config(Output.of(v3Config));
        }

        public Builder views(@Nullable Output<List<NetworktemplateSnmpConfigViewArgs>> views) {
            $.views = views;
            return this;
        }

        public Builder views(List<NetworktemplateSnmpConfigViewArgs> views) {
            return views(Output.of(views));
        }

        public Builder views(NetworktemplateSnmpConfigViewArgs... views) {
            return views(List.of(views));
        }

        public NetworktemplateSnmpConfigArgs build() {
            return $;
        }
    }

}
