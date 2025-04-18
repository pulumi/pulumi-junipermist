// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetEvpnTopologiesOrgEvpnTopologyEvpnOptionsVsInstances {
    private List<String> networks;

    private GetEvpnTopologiesOrgEvpnTopologyEvpnOptionsVsInstances() {}
    public List<String> networks() {
        return this.networks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEvpnTopologiesOrgEvpnTopologyEvpnOptionsVsInstances defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> networks;
        public Builder() {}
        public Builder(GetEvpnTopologiesOrgEvpnTopologyEvpnOptionsVsInstances defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networks = defaults.networks;
        }

        @CustomType.Setter
        public Builder networks(List<String> networks) {
            if (networks == null) {
              throw new MissingRequiredPropertyException("GetEvpnTopologiesOrgEvpnTopologyEvpnOptionsVsInstances", "networks");
            }
            this.networks = networks;
            return this;
        }
        public Builder networks(String... networks) {
            return networks(List.of(networks));
        }
        public GetEvpnTopologiesOrgEvpnTopologyEvpnOptionsVsInstances build() {
            final var _resultValue = new GetEvpnTopologiesOrgEvpnTopologyEvpnOptionsVsInstances();
            _resultValue.networks = networks;
            return _resultValue;
        }
    }
}
