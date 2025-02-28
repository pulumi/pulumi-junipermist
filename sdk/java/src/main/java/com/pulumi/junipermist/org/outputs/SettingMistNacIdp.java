// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SettingMistNacIdp {
    /**
     * @return When the IDP of mxedge_proxy type, exclude the following realms from proxying in addition to other valid home realms in this org
     * 
     */
    private @Nullable List<String> excludeRealms;
    /**
     * @return ID of the `mist_nacidp`
     * 
     */
    private String id;
    /**
     * @return Which realm should trigger this IDP. User Realm is extracted from:
     *   * Username-AVP (`mist.com` from john{@literal @}mist.com)
     *   * Cert CN
     * 
     */
    private List<String> userRealms;

    private SettingMistNacIdp() {}
    /**
     * @return When the IDP of mxedge_proxy type, exclude the following realms from proxying in addition to other valid home realms in this org
     * 
     */
    public List<String> excludeRealms() {
        return this.excludeRealms == null ? List.of() : this.excludeRealms;
    }
    /**
     * @return ID of the `mist_nacidp`
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Which realm should trigger this IDP. User Realm is extracted from:
     *   * Username-AVP (`mist.com` from john{@literal @}mist.com)
     *   * Cert CN
     * 
     */
    public List<String> userRealms() {
        return this.userRealms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingMistNacIdp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> excludeRealms;
        private String id;
        private List<String> userRealms;
        public Builder() {}
        public Builder(SettingMistNacIdp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludeRealms = defaults.excludeRealms;
    	      this.id = defaults.id;
    	      this.userRealms = defaults.userRealms;
        }

        @CustomType.Setter
        public Builder excludeRealms(@Nullable List<String> excludeRealms) {

            this.excludeRealms = excludeRealms;
            return this;
        }
        public Builder excludeRealms(String... excludeRealms) {
            return excludeRealms(List.of(excludeRealms));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("SettingMistNacIdp", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder userRealms(List<String> userRealms) {
            if (userRealms == null) {
              throw new MissingRequiredPropertyException("SettingMistNacIdp", "userRealms");
            }
            this.userRealms = userRealms;
            return this;
        }
        public Builder userRealms(String... userRealms) {
            return userRealms(List.of(userRealms));
        }
        public SettingMistNacIdp build() {
            final var _resultValue = new SettingMistNacIdp();
            _resultValue.excludeRealms = excludeRealms;
            _resultValue.id = id;
            _resultValue.userRealms = userRealms;
            return _resultValue;
        }
    }
}
