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


public final class SettingMxedgeMgmtArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingMxedgeMgmtArgs Empty = new SettingMxedgeMgmtArgs();

    @Import(name="configAutoRevert")
    private @Nullable Output<Boolean> configAutoRevert;

    public Optional<Output<Boolean>> configAutoRevert() {
        return Optional.ofNullable(this.configAutoRevert);
    }

    @Import(name="fipsEnabled")
    private @Nullable Output<Boolean> fipsEnabled;

    public Optional<Output<Boolean>> fipsEnabled() {
        return Optional.ofNullable(this.fipsEnabled);
    }

    @Import(name="mistPassword")
    private @Nullable Output<String> mistPassword;

    public Optional<Output<String>> mistPassword() {
        return Optional.ofNullable(this.mistPassword);
    }

    /**
     * enum: `dhcp`, `disabled`, `static`
     * 
     */
    @Import(name="oobIpType")
    private @Nullable Output<String> oobIpType;

    /**
     * @return enum: `dhcp`, `disabled`, `static`
     * 
     */
    public Optional<Output<String>> oobIpType() {
        return Optional.ofNullable(this.oobIpType);
    }

    /**
     * enum: `autoconf`, `dhcp`, `disabled`, `static`
     * 
     */
    @Import(name="oobIpType6")
    private @Nullable Output<String> oobIpType6;

    /**
     * @return enum: `autoconf`, `dhcp`, `disabled`, `static`
     * 
     */
    public Optional<Output<String>> oobIpType6() {
        return Optional.ofNullable(this.oobIpType6);
    }

    @Import(name="rootPassword")
    private @Nullable Output<String> rootPassword;

    public Optional<Output<String>> rootPassword() {
        return Optional.ofNullable(this.rootPassword);
    }

    private SettingMxedgeMgmtArgs() {}

    private SettingMxedgeMgmtArgs(SettingMxedgeMgmtArgs $) {
        this.configAutoRevert = $.configAutoRevert;
        this.fipsEnabled = $.fipsEnabled;
        this.mistPassword = $.mistPassword;
        this.oobIpType = $.oobIpType;
        this.oobIpType6 = $.oobIpType6;
        this.rootPassword = $.rootPassword;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingMxedgeMgmtArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingMxedgeMgmtArgs $;

        public Builder() {
            $ = new SettingMxedgeMgmtArgs();
        }

        public Builder(SettingMxedgeMgmtArgs defaults) {
            $ = new SettingMxedgeMgmtArgs(Objects.requireNonNull(defaults));
        }

        public Builder configAutoRevert(@Nullable Output<Boolean> configAutoRevert) {
            $.configAutoRevert = configAutoRevert;
            return this;
        }

        public Builder configAutoRevert(Boolean configAutoRevert) {
            return configAutoRevert(Output.of(configAutoRevert));
        }

        public Builder fipsEnabled(@Nullable Output<Boolean> fipsEnabled) {
            $.fipsEnabled = fipsEnabled;
            return this;
        }

        public Builder fipsEnabled(Boolean fipsEnabled) {
            return fipsEnabled(Output.of(fipsEnabled));
        }

        public Builder mistPassword(@Nullable Output<String> mistPassword) {
            $.mistPassword = mistPassword;
            return this;
        }

        public Builder mistPassword(String mistPassword) {
            return mistPassword(Output.of(mistPassword));
        }

        /**
         * @param oobIpType enum: `dhcp`, `disabled`, `static`
         * 
         * @return builder
         * 
         */
        public Builder oobIpType(@Nullable Output<String> oobIpType) {
            $.oobIpType = oobIpType;
            return this;
        }

        /**
         * @param oobIpType enum: `dhcp`, `disabled`, `static`
         * 
         * @return builder
         * 
         */
        public Builder oobIpType(String oobIpType) {
            return oobIpType(Output.of(oobIpType));
        }

        /**
         * @param oobIpType6 enum: `autoconf`, `dhcp`, `disabled`, `static`
         * 
         * @return builder
         * 
         */
        public Builder oobIpType6(@Nullable Output<String> oobIpType6) {
            $.oobIpType6 = oobIpType6;
            return this;
        }

        /**
         * @param oobIpType6 enum: `autoconf`, `dhcp`, `disabled`, `static`
         * 
         * @return builder
         * 
         */
        public Builder oobIpType6(String oobIpType6) {
            return oobIpType6(Output.of(oobIpType6));
        }

        public Builder rootPassword(@Nullable Output<String> rootPassword) {
            $.rootPassword = rootPassword;
            return this;
        }

        public Builder rootPassword(String rootPassword) {
            return rootPassword(Output.of(rootPassword));
        }

        public SettingMxedgeMgmtArgs build() {
            return $;
        }
    }

}
