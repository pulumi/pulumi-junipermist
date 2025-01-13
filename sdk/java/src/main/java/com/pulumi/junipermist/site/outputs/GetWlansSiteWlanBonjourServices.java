// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWlansSiteWlanBonjourServices {
    /**
     * @return whether to prevent wireless clients to discover bonjour devices on the same WLAN
     * 
     */
    private Boolean disableLocal;
    /**
     * @return optional, if the service is further restricted for certain RADIUS groups
     * 
     */
    private List<String> radiusGroups;
    /**
     * @return how bonjour services should be discovered for the same WLAN. enum: `same_ap`, `same_map`, `same_site`
     * 
     */
    private String scope;

    private GetWlansSiteWlanBonjourServices() {}
    /**
     * @return whether to prevent wireless clients to discover bonjour devices on the same WLAN
     * 
     */
    public Boolean disableLocal() {
        return this.disableLocal;
    }
    /**
     * @return optional, if the service is further restricted for certain RADIUS groups
     * 
     */
    public List<String> radiusGroups() {
        return this.radiusGroups;
    }
    /**
     * @return how bonjour services should be discovered for the same WLAN. enum: `same_ap`, `same_map`, `same_site`
     * 
     */
    public String scope() {
        return this.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWlansSiteWlanBonjourServices defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean disableLocal;
        private List<String> radiusGroups;
        private String scope;
        public Builder() {}
        public Builder(GetWlansSiteWlanBonjourServices defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableLocal = defaults.disableLocal;
    	      this.radiusGroups = defaults.radiusGroups;
    	      this.scope = defaults.scope;
        }

        @CustomType.Setter
        public Builder disableLocal(Boolean disableLocal) {
            if (disableLocal == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanBonjourServices", "disableLocal");
            }
            this.disableLocal = disableLocal;
            return this;
        }
        @CustomType.Setter
        public Builder radiusGroups(List<String> radiusGroups) {
            if (radiusGroups == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanBonjourServices", "radiusGroups");
            }
            this.radiusGroups = radiusGroups;
            return this;
        }
        public Builder radiusGroups(String... radiusGroups) {
            return radiusGroups(List.of(radiusGroups));
        }
        @CustomType.Setter
        public Builder scope(String scope) {
            if (scope == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanBonjourServices", "scope");
            }
            this.scope = scope;
            return this;
        }
        public GetWlansSiteWlanBonjourServices build() {
            final var _resultValue = new GetWlansSiteWlanBonjourServices();
            _resultValue.disableLocal = disableLocal;
            _resultValue.radiusGroups = radiusGroups;
            _resultValue.scope = scope;
            return _resultValue;
        }
    }
}
