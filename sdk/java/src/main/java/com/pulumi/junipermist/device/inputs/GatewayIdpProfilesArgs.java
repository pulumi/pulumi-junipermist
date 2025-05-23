// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.device.inputs.GatewayIdpProfilesOverwriteArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayIdpProfilesArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayIdpProfilesArgs Empty = new GatewayIdpProfilesArgs();

    /**
     * enum: `critical`, `standard`, `strict`
     * 
     */
    @Import(name="baseProfile")
    private @Nullable Output<String> baseProfile;

    /**
     * @return enum: `critical`, `standard`, `strict`
     * 
     */
    public Optional<Output<String>> baseProfile() {
        return Optional.ofNullable(this.baseProfile);
    }

    /**
     * Unique ID of the object instance in the Mist Organization
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Unique ID of the object instance in the Mist Organization
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    @Import(name="overwrites")
    private @Nullable Output<List<GatewayIdpProfilesOverwriteArgs>> overwrites;

    public Optional<Output<List<GatewayIdpProfilesOverwriteArgs>>> overwrites() {
        return Optional.ofNullable(this.overwrites);
    }

    private GatewayIdpProfilesArgs() {}

    private GatewayIdpProfilesArgs(GatewayIdpProfilesArgs $) {
        this.baseProfile = $.baseProfile;
        this.id = $.id;
        this.name = $.name;
        this.orgId = $.orgId;
        this.overwrites = $.overwrites;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayIdpProfilesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayIdpProfilesArgs $;

        public Builder() {
            $ = new GatewayIdpProfilesArgs();
        }

        public Builder(GatewayIdpProfilesArgs defaults) {
            $ = new GatewayIdpProfilesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseProfile enum: `critical`, `standard`, `strict`
         * 
         * @return builder
         * 
         */
        public Builder baseProfile(@Nullable Output<String> baseProfile) {
            $.baseProfile = baseProfile;
            return this;
        }

        /**
         * @param baseProfile enum: `critical`, `standard`, `strict`
         * 
         * @return builder
         * 
         */
        public Builder baseProfile(String baseProfile) {
            return baseProfile(Output.of(baseProfile));
        }

        /**
         * @param id Unique ID of the object instance in the Mist Organization
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Unique ID of the object instance in the Mist Organization
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public Builder overwrites(@Nullable Output<List<GatewayIdpProfilesOverwriteArgs>> overwrites) {
            $.overwrites = overwrites;
            return this;
        }

        public Builder overwrites(List<GatewayIdpProfilesOverwriteArgs> overwrites) {
            return overwrites(Output.of(overwrites));
        }

        public Builder overwrites(GatewayIdpProfilesOverwriteArgs... overwrites) {
            return overwrites(List.of(overwrites));
        }

        public GatewayIdpProfilesArgs build() {
            return $;
        }
    }

}
