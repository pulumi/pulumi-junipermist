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


public final class ServicepolicySslProxyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicepolicySslProxyArgs Empty = new ServicepolicySslProxyArgs();

    /**
     * enum: `medium`, `strong`, `weak`
     * 
     */
    @Import(name="ciphersCategory")
    private @Nullable Output<String> ciphersCategory;

    /**
     * @return enum: `medium`, `strong`, `weak`
     * 
     */
    public Optional<Output<String>> ciphersCategory() {
        return Optional.ofNullable(this.ciphersCategory);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ServicepolicySslProxyArgs() {}

    private ServicepolicySslProxyArgs(ServicepolicySslProxyArgs $) {
        this.ciphersCategory = $.ciphersCategory;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicepolicySslProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicepolicySslProxyArgs $;

        public Builder() {
            $ = new ServicepolicySslProxyArgs();
        }

        public Builder(ServicepolicySslProxyArgs defaults) {
            $ = new ServicepolicySslProxyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ciphersCategory enum: `medium`, `strong`, `weak`
         * 
         * @return builder
         * 
         */
        public Builder ciphersCategory(@Nullable Output<String> ciphersCategory) {
            $.ciphersCategory = ciphersCategory;
            return this;
        }

        /**
         * @param ciphersCategory enum: `medium`, `strong`, `weak`
         * 
         * @return builder
         * 
         */
        public Builder ciphersCategory(String ciphersCategory) {
            return ciphersCategory(Output.of(ciphersCategory));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ServicepolicySslProxyArgs build() {
            return $;
        }
    }

}
