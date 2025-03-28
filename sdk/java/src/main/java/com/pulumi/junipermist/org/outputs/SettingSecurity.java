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
public final class SettingSecurity {
    /**
     * @return Whether to disable local SSH (by default, local SSH is enabled with allow_mist in Org is enabled
     * 
     */
    private @Nullable Boolean disableLocalSsh;
    /**
     * @return password required to zeroize devices (FIPS) on site level
     * 
     */
    private @Nullable String fipsZeroizePassword;
    /**
     * @return Whether to allow certain SSH keys to SSH into the AP (see Site:Setting)
     * 
     */
    private @Nullable Boolean limitSshAccess;

    private SettingSecurity() {}
    /**
     * @return Whether to disable local SSH (by default, local SSH is enabled with allow_mist in Org is enabled
     * 
     */
    public Optional<Boolean> disableLocalSsh() {
        return Optional.ofNullable(this.disableLocalSsh);
    }
    /**
     * @return password required to zeroize devices (FIPS) on site level
     * 
     */
    public Optional<String> fipsZeroizePassword() {
        return Optional.ofNullable(this.fipsZeroizePassword);
    }
    /**
     * @return Whether to allow certain SSH keys to SSH into the AP (see Site:Setting)
     * 
     */
    public Optional<Boolean> limitSshAccess() {
        return Optional.ofNullable(this.limitSshAccess);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingSecurity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean disableLocalSsh;
        private @Nullable String fipsZeroizePassword;
        private @Nullable Boolean limitSshAccess;
        public Builder() {}
        public Builder(SettingSecurity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableLocalSsh = defaults.disableLocalSsh;
    	      this.fipsZeroizePassword = defaults.fipsZeroizePassword;
    	      this.limitSshAccess = defaults.limitSshAccess;
        }

        @CustomType.Setter
        public Builder disableLocalSsh(@Nullable Boolean disableLocalSsh) {

            this.disableLocalSsh = disableLocalSsh;
            return this;
        }
        @CustomType.Setter
        public Builder fipsZeroizePassword(@Nullable String fipsZeroizePassword) {

            this.fipsZeroizePassword = fipsZeroizePassword;
            return this;
        }
        @CustomType.Setter
        public Builder limitSshAccess(@Nullable Boolean limitSshAccess) {

            this.limitSshAccess = limitSshAccess;
            return this;
        }
        public SettingSecurity build() {
            final var _resultValue = new SettingSecurity();
            _resultValue.disableLocalSsh = disableLocalSsh;
            _resultValue.fipsZeroizePassword = fipsZeroizePassword;
            _resultValue.limitSshAccess = limitSshAccess;
            return _resultValue;
        }
    }
}
