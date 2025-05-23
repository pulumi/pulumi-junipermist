// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.site.outputs.NetworktemplateOspfAreasNetworks;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworktemplateOspfAreas {
    private @Nullable Boolean includeLoopback;
    private Map<String,NetworktemplateOspfAreasNetworks> networks;
    /**
     * @return OSPF type. enum: `default`, `nssa`, `stub`
     * 
     */
    private @Nullable String type;

    private NetworktemplateOspfAreas() {}
    public Optional<Boolean> includeLoopback() {
        return Optional.ofNullable(this.includeLoopback);
    }
    public Map<String,NetworktemplateOspfAreasNetworks> networks() {
        return this.networks;
    }
    /**
     * @return OSPF type. enum: `default`, `nssa`, `stub`
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplateOspfAreas defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean includeLoopback;
        private Map<String,NetworktemplateOspfAreasNetworks> networks;
        private @Nullable String type;
        public Builder() {}
        public Builder(NetworktemplateOspfAreas defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeLoopback = defaults.includeLoopback;
    	      this.networks = defaults.networks;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder includeLoopback(@Nullable Boolean includeLoopback) {

            this.includeLoopback = includeLoopback;
            return this;
        }
        @CustomType.Setter
        public Builder networks(Map<String,NetworktemplateOspfAreasNetworks> networks) {
            if (networks == null) {
              throw new MissingRequiredPropertyException("NetworktemplateOspfAreas", "networks");
            }
            this.networks = networks;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public NetworktemplateOspfAreas build() {
            final var _resultValue = new NetworktemplateOspfAreas();
            _resultValue.includeLoopback = includeLoopback;
            _resultValue.networks = networks;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
