// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchSnmpConfigV3ConfigVacmSecurityToGroupContentArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchSnmpConfigV3ConfigVacmSecurityToGroupContentArgs Empty = new SwitchSnmpConfigV3ConfigVacmSecurityToGroupContentArgs();

    /**
     * Refer to group_name under access
     * 
     */
    @Import(name="group")
    private @Nullable Output<String> group;

    /**
     * @return Refer to group_name under access
     * 
     */
    public Optional<Output<String>> group() {
        return Optional.ofNullable(this.group);
    }

    @Import(name="securityName")
    private @Nullable Output<String> securityName;

    public Optional<Output<String>> securityName() {
        return Optional.ofNullable(this.securityName);
    }

    private SwitchSnmpConfigV3ConfigVacmSecurityToGroupContentArgs() {}

    private SwitchSnmpConfigV3ConfigVacmSecurityToGroupContentArgs(SwitchSnmpConfigV3ConfigVacmSecurityToGroupContentArgs $) {
        this.group = $.group;
        this.securityName = $.securityName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchSnmpConfigV3ConfigVacmSecurityToGroupContentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchSnmpConfigV3ConfigVacmSecurityToGroupContentArgs $;

        public Builder() {
            $ = new SwitchSnmpConfigV3ConfigVacmSecurityToGroupContentArgs();
        }

        public Builder(SwitchSnmpConfigV3ConfigVacmSecurityToGroupContentArgs defaults) {
            $ = new SwitchSnmpConfigV3ConfigVacmSecurityToGroupContentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param group Refer to group_name under access
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable Output<String> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group Refer to group_name under access
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            return group(Output.of(group));
        }

        public Builder securityName(@Nullable Output<String> securityName) {
            $.securityName = securityName;
            return this;
        }

        public Builder securityName(String securityName) {
            return securityName(Output.of(securityName));
        }

        public SwitchSnmpConfigV3ConfigVacmSecurityToGroupContentArgs build() {
            return $;
        }
    }

}
