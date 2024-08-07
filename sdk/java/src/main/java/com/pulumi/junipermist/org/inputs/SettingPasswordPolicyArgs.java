// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingPasswordPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingPasswordPolicyArgs Empty = new SettingPasswordPolicyArgs();

    /**
     * whether the policy is enabled
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return whether the policy is enabled
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * days, required if password policy is enabled
     * 
     */
    @Import(name="freshness")
    private @Nullable Output<Integer> freshness;

    /**
     * @return days, required if password policy is enabled
     * 
     */
    public Optional<Output<Integer>> freshness() {
        return Optional.ofNullable(this.freshness);
    }

    /**
     * required password length
     * 
     */
    @Import(name="minLength")
    private @Nullable Output<Integer> minLength;

    /**
     * @return required password length
     * 
     */
    public Optional<Output<Integer>> minLength() {
        return Optional.ofNullable(this.minLength);
    }

    /**
     * whether to require special character
     * 
     */
    @Import(name="requiresSpecialChar")
    private @Nullable Output<Boolean> requiresSpecialChar;

    /**
     * @return whether to require special character
     * 
     */
    public Optional<Output<Boolean>> requiresSpecialChar() {
        return Optional.ofNullable(this.requiresSpecialChar);
    }

    /**
     * whether to require two-factor auth
     * 
     */
    @Import(name="requiresTwoFactorAuth")
    private @Nullable Output<Boolean> requiresTwoFactorAuth;

    /**
     * @return whether to require two-factor auth
     * 
     */
    public Optional<Output<Boolean>> requiresTwoFactorAuth() {
        return Optional.ofNullable(this.requiresTwoFactorAuth);
    }

    private SettingPasswordPolicyArgs() {}

    private SettingPasswordPolicyArgs(SettingPasswordPolicyArgs $) {
        this.enabled = $.enabled;
        this.freshness = $.freshness;
        this.minLength = $.minLength;
        this.requiresSpecialChar = $.requiresSpecialChar;
        this.requiresTwoFactorAuth = $.requiresTwoFactorAuth;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingPasswordPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingPasswordPolicyArgs $;

        public Builder() {
            $ = new SettingPasswordPolicyArgs();
        }

        public Builder(SettingPasswordPolicyArgs defaults) {
            $ = new SettingPasswordPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled whether the policy is enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled whether the policy is enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param freshness days, required if password policy is enabled
         * 
         * @return builder
         * 
         */
        public Builder freshness(@Nullable Output<Integer> freshness) {
            $.freshness = freshness;
            return this;
        }

        /**
         * @param freshness days, required if password policy is enabled
         * 
         * @return builder
         * 
         */
        public Builder freshness(Integer freshness) {
            return freshness(Output.of(freshness));
        }

        /**
         * @param minLength required password length
         * 
         * @return builder
         * 
         */
        public Builder minLength(@Nullable Output<Integer> minLength) {
            $.minLength = minLength;
            return this;
        }

        /**
         * @param minLength required password length
         * 
         * @return builder
         * 
         */
        public Builder minLength(Integer minLength) {
            return minLength(Output.of(minLength));
        }

        /**
         * @param requiresSpecialChar whether to require special character
         * 
         * @return builder
         * 
         */
        public Builder requiresSpecialChar(@Nullable Output<Boolean> requiresSpecialChar) {
            $.requiresSpecialChar = requiresSpecialChar;
            return this;
        }

        /**
         * @param requiresSpecialChar whether to require special character
         * 
         * @return builder
         * 
         */
        public Builder requiresSpecialChar(Boolean requiresSpecialChar) {
            return requiresSpecialChar(Output.of(requiresSpecialChar));
        }

        /**
         * @param requiresTwoFactorAuth whether to require two-factor auth
         * 
         * @return builder
         * 
         */
        public Builder requiresTwoFactorAuth(@Nullable Output<Boolean> requiresTwoFactorAuth) {
            $.requiresTwoFactorAuth = requiresTwoFactorAuth;
            return this;
        }

        /**
         * @param requiresTwoFactorAuth whether to require two-factor auth
         * 
         * @return builder
         * 
         */
        public Builder requiresTwoFactorAuth(Boolean requiresTwoFactorAuth) {
            return requiresTwoFactorAuth(Output.of(requiresTwoFactorAuth));
        }

        public SettingPasswordPolicyArgs build() {
            return $;
        }
    }

}
