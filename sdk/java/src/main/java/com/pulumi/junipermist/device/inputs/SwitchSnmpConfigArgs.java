// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.device.inputs.SwitchSnmpConfigClientListArgs;
import com.pulumi.junipermist.device.inputs.SwitchSnmpConfigTrapGroupArgs;
import com.pulumi.junipermist.device.inputs.SwitchSnmpConfigV2cConfigArgs;
import com.pulumi.junipermist.device.inputs.SwitchSnmpConfigV3ConfigArgs;
import com.pulumi.junipermist.device.inputs.SwitchSnmpConfigViewArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchSnmpConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchSnmpConfigArgs Empty = new SwitchSnmpConfigArgs();

    @Import(name="clientLists")
    private @Nullable Output<List<SwitchSnmpConfigClientListArgs>> clientLists;

    public Optional<Output<List<SwitchSnmpConfigClientListArgs>>> clientLists() {
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

    /**
     * enum: `engine-id-suffix`, `local`, `use-default-ip-address`, `use_mac-address`
     * 
     */
    @Import(name="engineId")
    private @Nullable Output<String> engineId;

    /**
     * @return enum: `engine-id-suffix`, `local`, `use-default-ip-address`, `use_mac-address`
     * 
     */
    public Optional<Output<String>> engineId() {
        return Optional.ofNullable(this.engineId);
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
    private @Nullable Output<List<SwitchSnmpConfigTrapGroupArgs>> trapGroups;

    public Optional<Output<List<SwitchSnmpConfigTrapGroupArgs>>> trapGroups() {
        return Optional.ofNullable(this.trapGroups);
    }

    @Import(name="v2cConfigs")
    private @Nullable Output<List<SwitchSnmpConfigV2cConfigArgs>> v2cConfigs;

    public Optional<Output<List<SwitchSnmpConfigV2cConfigArgs>>> v2cConfigs() {
        return Optional.ofNullable(this.v2cConfigs);
    }

    @Import(name="v3Config")
    private @Nullable Output<SwitchSnmpConfigV3ConfigArgs> v3Config;

    public Optional<Output<SwitchSnmpConfigV3ConfigArgs>> v3Config() {
        return Optional.ofNullable(this.v3Config);
    }

    @Import(name="views")
    private @Nullable Output<List<SwitchSnmpConfigViewArgs>> views;

    public Optional<Output<List<SwitchSnmpConfigViewArgs>>> views() {
        return Optional.ofNullable(this.views);
    }

    private SwitchSnmpConfigArgs() {}

    private SwitchSnmpConfigArgs(SwitchSnmpConfigArgs $) {
        this.clientLists = $.clientLists;
        this.contact = $.contact;
        this.description = $.description;
        this.enabled = $.enabled;
        this.engineId = $.engineId;
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
    public static Builder builder(SwitchSnmpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchSnmpConfigArgs $;

        public Builder() {
            $ = new SwitchSnmpConfigArgs();
        }

        public Builder(SwitchSnmpConfigArgs defaults) {
            $ = new SwitchSnmpConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientLists(@Nullable Output<List<SwitchSnmpConfigClientListArgs>> clientLists) {
            $.clientLists = clientLists;
            return this;
        }

        public Builder clientLists(List<SwitchSnmpConfigClientListArgs> clientLists) {
            return clientLists(Output.of(clientLists));
        }

        public Builder clientLists(SwitchSnmpConfigClientListArgs... clientLists) {
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

        /**
         * @param engineId enum: `engine-id-suffix`, `local`, `use-default-ip-address`, `use_mac-address`
         * 
         * @return builder
         * 
         */
        public Builder engineId(@Nullable Output<String> engineId) {
            $.engineId = engineId;
            return this;
        }

        /**
         * @param engineId enum: `engine-id-suffix`, `local`, `use-default-ip-address`, `use_mac-address`
         * 
         * @return builder
         * 
         */
        public Builder engineId(String engineId) {
            return engineId(Output.of(engineId));
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

        public Builder trapGroups(@Nullable Output<List<SwitchSnmpConfigTrapGroupArgs>> trapGroups) {
            $.trapGroups = trapGroups;
            return this;
        }

        public Builder trapGroups(List<SwitchSnmpConfigTrapGroupArgs> trapGroups) {
            return trapGroups(Output.of(trapGroups));
        }

        public Builder trapGroups(SwitchSnmpConfigTrapGroupArgs... trapGroups) {
            return trapGroups(List.of(trapGroups));
        }

        public Builder v2cConfigs(@Nullable Output<List<SwitchSnmpConfigV2cConfigArgs>> v2cConfigs) {
            $.v2cConfigs = v2cConfigs;
            return this;
        }

        public Builder v2cConfigs(List<SwitchSnmpConfigV2cConfigArgs> v2cConfigs) {
            return v2cConfigs(Output.of(v2cConfigs));
        }

        public Builder v2cConfigs(SwitchSnmpConfigV2cConfigArgs... v2cConfigs) {
            return v2cConfigs(List.of(v2cConfigs));
        }

        public Builder v3Config(@Nullable Output<SwitchSnmpConfigV3ConfigArgs> v3Config) {
            $.v3Config = v3Config;
            return this;
        }

        public Builder v3Config(SwitchSnmpConfigV3ConfigArgs v3Config) {
            return v3Config(Output.of(v3Config));
        }

        public Builder views(@Nullable Output<List<SwitchSnmpConfigViewArgs>> views) {
            $.views = views;
            return this;
        }

        public Builder views(List<SwitchSnmpConfigViewArgs> views) {
            return views(Output.of(views));
        }

        public Builder views(SwitchSnmpConfigViewArgs... views) {
            return views(List.of(views));
        }

        public SwitchSnmpConfigArgs build() {
            return $;
        }
    }

}