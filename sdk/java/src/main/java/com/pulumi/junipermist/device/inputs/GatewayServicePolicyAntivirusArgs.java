// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayServicePolicyAntivirusArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayServicePolicyAntivirusArgs Empty = new GatewayServicePolicyAntivirusArgs();

    /**
     * org-level AV Profile can be used, this takes precedence over &#39;profile&#39;
     * 
     */
    @Import(name="avprofileId")
    private @Nullable Output<String> avprofileId;

    /**
     * @return org-level AV Profile can be used, this takes precedence over &#39;profile&#39;
     * 
     */
    public Optional<Output<String>> avprofileId() {
        return Optional.ofNullable(this.avprofileId);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Default / noftp / httponly / or keys from av_profiles
     * 
     */
    @Import(name="profile")
    private @Nullable Output<String> profile;

    /**
     * @return Default / noftp / httponly / or keys from av_profiles
     * 
     */
    public Optional<Output<String>> profile() {
        return Optional.ofNullable(this.profile);
    }

    private GatewayServicePolicyAntivirusArgs() {}

    private GatewayServicePolicyAntivirusArgs(GatewayServicePolicyAntivirusArgs $) {
        this.avprofileId = $.avprofileId;
        this.enabled = $.enabled;
        this.profile = $.profile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayServicePolicyAntivirusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayServicePolicyAntivirusArgs $;

        public Builder() {
            $ = new GatewayServicePolicyAntivirusArgs();
        }

        public Builder(GatewayServicePolicyAntivirusArgs defaults) {
            $ = new GatewayServicePolicyAntivirusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param avprofileId org-level AV Profile can be used, this takes precedence over &#39;profile&#39;
         * 
         * @return builder
         * 
         */
        public Builder avprofileId(@Nullable Output<String> avprofileId) {
            $.avprofileId = avprofileId;
            return this;
        }

        /**
         * @param avprofileId org-level AV Profile can be used, this takes precedence over &#39;profile&#39;
         * 
         * @return builder
         * 
         */
        public Builder avprofileId(String avprofileId) {
            return avprofileId(Output.of(avprofileId));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param profile Default / noftp / httponly / or keys from av_profiles
         * 
         * @return builder
         * 
         */
        public Builder profile(@Nullable Output<String> profile) {
            $.profile = profile;
            return this;
        }

        /**
         * @param profile Default / noftp / httponly / or keys from av_profiles
         * 
         * @return builder
         * 
         */
        public Builder profile(String profile) {
            return profile(Output.of(profile));
        }

        public GatewayServicePolicyAntivirusArgs build() {
            return $;
        }
    }

}
