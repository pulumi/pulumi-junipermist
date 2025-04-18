// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworktemplateSnmpConfigV2cConfig {
    private @Nullable String authorization;
    /**
     * @return Client_list_name here should refer to client_list above
     * 
     */
    private @Nullable String clientListName;
    private @Nullable String communityName;
    /**
     * @return View name here should be defined in views above
     * 
     */
    private @Nullable String view;

    private NetworktemplateSnmpConfigV2cConfig() {}
    public Optional<String> authorization() {
        return Optional.ofNullable(this.authorization);
    }
    /**
     * @return Client_list_name here should refer to client_list above
     * 
     */
    public Optional<String> clientListName() {
        return Optional.ofNullable(this.clientListName);
    }
    public Optional<String> communityName() {
        return Optional.ofNullable(this.communityName);
    }
    /**
     * @return View name here should be defined in views above
     * 
     */
    public Optional<String> view() {
        return Optional.ofNullable(this.view);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplateSnmpConfigV2cConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String authorization;
        private @Nullable String clientListName;
        private @Nullable String communityName;
        private @Nullable String view;
        public Builder() {}
        public Builder(NetworktemplateSnmpConfigV2cConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorization = defaults.authorization;
    	      this.clientListName = defaults.clientListName;
    	      this.communityName = defaults.communityName;
    	      this.view = defaults.view;
        }

        @CustomType.Setter
        public Builder authorization(@Nullable String authorization) {

            this.authorization = authorization;
            return this;
        }
        @CustomType.Setter
        public Builder clientListName(@Nullable String clientListName) {

            this.clientListName = clientListName;
            return this;
        }
        @CustomType.Setter
        public Builder communityName(@Nullable String communityName) {

            this.communityName = communityName;
            return this;
        }
        @CustomType.Setter
        public Builder view(@Nullable String view) {

            this.view = view;
            return this;
        }
        public NetworktemplateSnmpConfigV2cConfig build() {
            final var _resultValue = new NetworktemplateSnmpConfigV2cConfig();
            _resultValue.authorization = authorization;
            _resultValue.clientListName = clientListName;
            _resultValue.communityName = communityName;
            _resultValue.view = view;
            return _resultValue;
        }
    }
}
