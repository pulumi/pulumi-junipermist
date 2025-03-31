// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServicepolicyAamw {
    /**
     * @return org-level Advanced Advance Anti Malware Profile (SkyAtp) Profile can be used, this takes precedence over &#39;profile&#39;
     * 
     */
    private @Nullable String aamwprofileId;
    private @Nullable Boolean enabled;
    /**
     * @return enum: `docsonly`, `executables`, `standard`
     * 
     */
    private @Nullable String profile;

    private ServicepolicyAamw() {}
    /**
     * @return org-level Advanced Advance Anti Malware Profile (SkyAtp) Profile can be used, this takes precedence over &#39;profile&#39;
     * 
     */
    public Optional<String> aamwprofileId() {
        return Optional.ofNullable(this.aamwprofileId);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return enum: `docsonly`, `executables`, `standard`
     * 
     */
    public Optional<String> profile() {
        return Optional.ofNullable(this.profile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicepolicyAamw defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String aamwprofileId;
        private @Nullable Boolean enabled;
        private @Nullable String profile;
        public Builder() {}
        public Builder(ServicepolicyAamw defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aamwprofileId = defaults.aamwprofileId;
    	      this.enabled = defaults.enabled;
    	      this.profile = defaults.profile;
        }

        @CustomType.Setter
        public Builder aamwprofileId(@Nullable String aamwprofileId) {

            this.aamwprofileId = aamwprofileId;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder profile(@Nullable String profile) {

            this.profile = profile;
            return this;
        }
        public ServicepolicyAamw build() {
            final var _resultValue = new ServicepolicyAamw();
            _resultValue.aamwprofileId = aamwprofileId;
            _resultValue.enabled = enabled;
            _resultValue.profile = profile;
            return _resultValue;
        }
    }
}
