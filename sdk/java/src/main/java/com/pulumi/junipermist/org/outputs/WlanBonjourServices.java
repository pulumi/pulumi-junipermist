// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WlanBonjourServices {
    /**
     * @return Whether to prevent wireless clients to discover bonjour devices on the same WLAN
     * 
     */
    private @Nullable Boolean disableLocal;
    /**
     * @return Optional, if the service is further restricted for certain RADIUS groups
     * 
     */
    private @Nullable List<String> radiusGroups;
    /**
     * @return how bonjour services should be discovered for the same WLAN. enum: `same_ap`, `same_map`, `same_site`
     * 
     */
    private @Nullable String scope;

    private WlanBonjourServices() {}
    /**
     * @return Whether to prevent wireless clients to discover bonjour devices on the same WLAN
     * 
     */
    public Optional<Boolean> disableLocal() {
        return Optional.ofNullable(this.disableLocal);
    }
    /**
     * @return Optional, if the service is further restricted for certain RADIUS groups
     * 
     */
    public List<String> radiusGroups() {
        return this.radiusGroups == null ? List.of() : this.radiusGroups;
    }
    /**
     * @return how bonjour services should be discovered for the same WLAN. enum: `same_ap`, `same_map`, `same_site`
     * 
     */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WlanBonjourServices defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean disableLocal;
        private @Nullable List<String> radiusGroups;
        private @Nullable String scope;
        public Builder() {}
        public Builder(WlanBonjourServices defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableLocal = defaults.disableLocal;
    	      this.radiusGroups = defaults.radiusGroups;
    	      this.scope = defaults.scope;
        }

        @CustomType.Setter
        public Builder disableLocal(@Nullable Boolean disableLocal) {

            this.disableLocal = disableLocal;
            return this;
        }
        @CustomType.Setter
        public Builder radiusGroups(@Nullable List<String> radiusGroups) {

            this.radiusGroups = radiusGroups;
            return this;
        }
        public Builder radiusGroups(String... radiusGroups) {
            return radiusGroups(List.of(radiusGroups));
        }
        @CustomType.Setter
        public Builder scope(@Nullable String scope) {

            this.scope = scope;
            return this;
        }
        public WlanBonjourServices build() {
            final var _resultValue = new WlanBonjourServices();
            _resultValue.disableLocal = disableLocal;
            _resultValue.radiusGroups = radiusGroups;
            _resultValue.scope = scope;
            return _resultValue;
        }
    }
}
