// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.org.outputs.NetworktemplateSnmpConfigV3ConfigUsmUser;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworktemplateSnmpConfigV3ConfigUsm {
    /**
     * @return enum: `local_engine`, `remote_engine`
     * 
     */
    private @Nullable String engineType;
    /**
     * @return required only if `engine_type`==`remote_engine`
     * 
     */
    private @Nullable String engineid;
    private @Nullable List<NetworktemplateSnmpConfigV3ConfigUsmUser> users;

    private NetworktemplateSnmpConfigV3ConfigUsm() {}
    /**
     * @return enum: `local_engine`, `remote_engine`
     * 
     */
    public Optional<String> engineType() {
        return Optional.ofNullable(this.engineType);
    }
    /**
     * @return required only if `engine_type`==`remote_engine`
     * 
     */
    public Optional<String> engineid() {
        return Optional.ofNullable(this.engineid);
    }
    public List<NetworktemplateSnmpConfigV3ConfigUsmUser> users() {
        return this.users == null ? List.of() : this.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplateSnmpConfigV3ConfigUsm defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String engineType;
        private @Nullable String engineid;
        private @Nullable List<NetworktemplateSnmpConfigV3ConfigUsmUser> users;
        public Builder() {}
        public Builder(NetworktemplateSnmpConfigV3ConfigUsm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.engineType = defaults.engineType;
    	      this.engineid = defaults.engineid;
    	      this.users = defaults.users;
        }

        @CustomType.Setter
        public Builder engineType(@Nullable String engineType) {

            this.engineType = engineType;
            return this;
        }
        @CustomType.Setter
        public Builder engineid(@Nullable String engineid) {

            this.engineid = engineid;
            return this;
        }
        @CustomType.Setter
        public Builder users(@Nullable List<NetworktemplateSnmpConfigV3ConfigUsmUser> users) {

            this.users = users;
            return this;
        }
        public Builder users(NetworktemplateSnmpConfigV3ConfigUsmUser... users) {
            return users(List.of(users));
        }
        public NetworktemplateSnmpConfigV3ConfigUsm build() {
            final var _resultValue = new NetworktemplateSnmpConfigV3ConfigUsm();
            _resultValue.engineType = engineType;
            _resultValue.engineid = engineid;
            _resultValue.users = users;
            return _resultValue;
        }
    }
}