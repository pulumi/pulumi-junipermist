// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.device.outputs.GatewayIdpProfilesOverwrite;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayIdpProfiles {
    /**
     * @return enum: `critical`, `standard`, `strict`
     * 
     */
    private @Nullable String baseProfile;
    private @Nullable Double createdTime;
    private @Nullable String id;
    private @Nullable Double modifiedTime;
    private @Nullable String name;
    private @Nullable String orgId;
    private @Nullable List<GatewayIdpProfilesOverwrite> overwrites;

    private GatewayIdpProfiles() {}
    /**
     * @return enum: `critical`, `standard`, `strict`
     * 
     */
    public Optional<String> baseProfile() {
        return Optional.ofNullable(this.baseProfile);
    }
    public Optional<Double> createdTime() {
        return Optional.ofNullable(this.createdTime);
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<Double> modifiedTime() {
        return Optional.ofNullable(this.modifiedTime);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    public List<GatewayIdpProfilesOverwrite> overwrites() {
        return this.overwrites == null ? List.of() : this.overwrites;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayIdpProfiles defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String baseProfile;
        private @Nullable Double createdTime;
        private @Nullable String id;
        private @Nullable Double modifiedTime;
        private @Nullable String name;
        private @Nullable String orgId;
        private @Nullable List<GatewayIdpProfilesOverwrite> overwrites;
        public Builder() {}
        public Builder(GatewayIdpProfiles defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseProfile = defaults.baseProfile;
    	      this.createdTime = defaults.createdTime;
    	      this.id = defaults.id;
    	      this.modifiedTime = defaults.modifiedTime;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.overwrites = defaults.overwrites;
        }

        @CustomType.Setter
        public Builder baseProfile(@Nullable String baseProfile) {

            this.baseProfile = baseProfile;
            return this;
        }
        @CustomType.Setter
        public Builder createdTime(@Nullable Double createdTime) {

            this.createdTime = createdTime;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedTime(@Nullable Double modifiedTime) {

            this.modifiedTime = modifiedTime;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(@Nullable String orgId) {

            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder overwrites(@Nullable List<GatewayIdpProfilesOverwrite> overwrites) {

            this.overwrites = overwrites;
            return this;
        }
        public Builder overwrites(GatewayIdpProfilesOverwrite... overwrites) {
            return overwrites(List.of(overwrites));
        }
        public GatewayIdpProfiles build() {
            final var _resultValue = new GatewayIdpProfiles();
            _resultValue.baseProfile = baseProfile;
            _resultValue.createdTime = createdTime;
            _resultValue.id = id;
            _resultValue.modifiedTime = modifiedTime;
            _resultValue.name = name;
            _resultValue.orgId = orgId;
            _resultValue.overwrites = overwrites;
            return _resultValue;
        }
    }
}