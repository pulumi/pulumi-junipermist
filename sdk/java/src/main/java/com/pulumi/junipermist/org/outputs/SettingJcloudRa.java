// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SettingJcloudRa {
    /**
     * @return JCloud Routing Assurance Org Token
     * 
     */
    private @Nullable String orgApitoken;
    /**
     * @return JCloud Routing Assurance Org Token Name
     * 
     */
    private @Nullable String orgApitokenName;
    /**
     * @return JCloud Routing Assurance Org ID
     * 
     */
    private @Nullable String orgId;

    private SettingJcloudRa() {}
    /**
     * @return JCloud Routing Assurance Org Token
     * 
     */
    public Optional<String> orgApitoken() {
        return Optional.ofNullable(this.orgApitoken);
    }
    /**
     * @return JCloud Routing Assurance Org Token Name
     * 
     */
    public Optional<String> orgApitokenName() {
        return Optional.ofNullable(this.orgApitokenName);
    }
    /**
     * @return JCloud Routing Assurance Org ID
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingJcloudRa defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String orgApitoken;
        private @Nullable String orgApitokenName;
        private @Nullable String orgId;
        public Builder() {}
        public Builder(SettingJcloudRa defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.orgApitoken = defaults.orgApitoken;
    	      this.orgApitokenName = defaults.orgApitokenName;
    	      this.orgId = defaults.orgId;
        }

        @CustomType.Setter
        public Builder orgApitoken(@Nullable String orgApitoken) {

            this.orgApitoken = orgApitoken;
            return this;
        }
        @CustomType.Setter
        public Builder orgApitokenName(@Nullable String orgApitokenName) {

            this.orgApitokenName = orgApitokenName;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(@Nullable String orgId) {

            this.orgId = orgId;
            return this;
        }
        public SettingJcloudRa build() {
            final var _resultValue = new SettingJcloudRa();
            _resultValue.orgApitoken = orgApitoken;
            _resultValue.orgApitokenName = orgApitokenName;
            _resultValue.orgId = orgId;
            return _resultValue;
        }
    }
}
