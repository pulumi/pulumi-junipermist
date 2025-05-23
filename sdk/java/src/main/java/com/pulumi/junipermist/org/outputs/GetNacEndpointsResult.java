// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.outputs.GetNacEndpointsOrgUsermac;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNacEndpointsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Optional, array of strings of labels
     * 
     */
    private @Nullable List<String> labels;
    /**
     * @return Partial/full MAC address
     * 
     */
    private @Nullable String mac;
    private String orgId;
    private List<GetNacEndpointsOrgUsermac> orgUsermacs;

    private GetNacEndpointsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Optional, array of strings of labels
     * 
     */
    public List<String> labels() {
        return this.labels == null ? List.of() : this.labels;
    }
    /**
     * @return Partial/full MAC address
     * 
     */
    public Optional<String> mac() {
        return Optional.ofNullable(this.mac);
    }
    public String orgId() {
        return this.orgId;
    }
    public List<GetNacEndpointsOrgUsermac> orgUsermacs() {
        return this.orgUsermacs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNacEndpointsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable List<String> labels;
        private @Nullable String mac;
        private String orgId;
        private List<GetNacEndpointsOrgUsermac> orgUsermacs;
        public Builder() {}
        public Builder(GetNacEndpointsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.mac = defaults.mac;
    	      this.orgId = defaults.orgId;
    	      this.orgUsermacs = defaults.orgUsermacs;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNacEndpointsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder labels(@Nullable List<String> labels) {

            this.labels = labels;
            return this;
        }
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }
        @CustomType.Setter
        public Builder mac(@Nullable String mac) {

            this.mac = mac;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetNacEndpointsResult", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder orgUsermacs(List<GetNacEndpointsOrgUsermac> orgUsermacs) {
            if (orgUsermacs == null) {
              throw new MissingRequiredPropertyException("GetNacEndpointsResult", "orgUsermacs");
            }
            this.orgUsermacs = orgUsermacs;
            return this;
        }
        public Builder orgUsermacs(GetNacEndpointsOrgUsermac... orgUsermacs) {
            return orgUsermacs(List.of(orgUsermacs));
        }
        public GetNacEndpointsResult build() {
            final var _resultValue = new GetNacEndpointsResult();
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.mac = mac;
            _resultValue.orgId = orgId;
            _resultValue.orgUsermacs = orgUsermacs;
            return _resultValue;
        }
    }
}
