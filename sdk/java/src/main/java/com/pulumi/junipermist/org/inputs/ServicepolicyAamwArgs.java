// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicepolicyAamwArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicepolicyAamwArgs Empty = new ServicepolicyAamwArgs();

    /**
     * org-level Advanced Advance Anti Malware Profile (SkyAtp) Profile can be used, this takes precedence over &#39;profile&#39;
     * 
     */
    @Import(name="aamwprofileId")
    private @Nullable Output<String> aamwprofileId;

    /**
     * @return org-level Advanced Advance Anti Malware Profile (SkyAtp) Profile can be used, this takes precedence over &#39;profile&#39;
     * 
     */
    public Optional<Output<String>> aamwprofileId() {
        return Optional.ofNullable(this.aamwprofileId);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * enum: `docsonly`, `executables`, `standard`
     * 
     */
    @Import(name="profile")
    private @Nullable Output<String> profile;

    /**
     * @return enum: `docsonly`, `executables`, `standard`
     * 
     */
    public Optional<Output<String>> profile() {
        return Optional.ofNullable(this.profile);
    }

    private ServicepolicyAamwArgs() {}

    private ServicepolicyAamwArgs(ServicepolicyAamwArgs $) {
        this.aamwprofileId = $.aamwprofileId;
        this.enabled = $.enabled;
        this.profile = $.profile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicepolicyAamwArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicepolicyAamwArgs $;

        public Builder() {
            $ = new ServicepolicyAamwArgs();
        }

        public Builder(ServicepolicyAamwArgs defaults) {
            $ = new ServicepolicyAamwArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aamwprofileId org-level Advanced Advance Anti Malware Profile (SkyAtp) Profile can be used, this takes precedence over &#39;profile&#39;
         * 
         * @return builder
         * 
         */
        public Builder aamwprofileId(@Nullable Output<String> aamwprofileId) {
            $.aamwprofileId = aamwprofileId;
            return this;
        }

        /**
         * @param aamwprofileId org-level Advanced Advance Anti Malware Profile (SkyAtp) Profile can be used, this takes precedence over &#39;profile&#39;
         * 
         * @return builder
         * 
         */
        public Builder aamwprofileId(String aamwprofileId) {
            return aamwprofileId(Output.of(aamwprofileId));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param profile enum: `docsonly`, `executables`, `standard`
         * 
         * @return builder
         * 
         */
        public Builder profile(@Nullable Output<String> profile) {
            $.profile = profile;
            return this;
        }

        /**
         * @param profile enum: `docsonly`, `executables`, `standard`
         * 
         * @return builder
         * 
         */
        public Builder profile(String profile) {
            return profile(Output.of(profile));
        }

        public ServicepolicyAamwArgs build() {
            return $;
        }
    }

}
